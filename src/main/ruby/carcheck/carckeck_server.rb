this_dir = File.expand_path(File.dirname(__FILE__))
lib_dir = File.join(File.dirname(this_dir), 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'multi_json'
require 'car_services_pb'

include Car

# ServerImpl provides an implementation of the RouteGuide service.
class ServerImpl < Carchecker::Service

  def initialize()
    @checks = []
    @checks << Check.new(level: 30)
    @checks << Check.new(level: 65)
    @checks << Check.new(level: 83)
  end

  def car_check(empty, _unused_call)
    Car::CarStatus.new(checks: @checks)
  end

end


def main
  port = '0.0.0.0:50051'
  s = GRPC::RpcServer.new
  s.add_http2_port(port, :this_port_is_insecure)
  GRPC.logger.info("... running insecurely on #{port}")
  s.handle(ServerImpl.new())
  # Runs the server with SIGHUP, SIGINT and SIGQUIT signal handlers to 
  # gracefully shutdown.
  # User could also choose to run server via call to run_till_terminated
  s.run_till_terminated_or_interrupted([1, 'int', 'SIGQUIT'])
end

main

