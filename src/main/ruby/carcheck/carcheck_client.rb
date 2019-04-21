this_dir = __dir__
lib_dir = File.join(File.dirname(this_dir), 'lib')
$LOAD_PATH.unshift(lib_dir) unless $LOAD_PATH.include?(lib_dir)

require 'grpc'
require 'car_services_pb'

include Car

def run_get_carStatus(stub)
  p 'check the car services'

  resp = stub.car_check(Google::Protobuf::Empty.new)
  l1 = resp.checks[0]
  l2 = resp.checks[1]
  l3 = resp.checks[2]
  puts "the petrol level: #{l1.level} %"
  puts "the oil level: #{l2.level} %"
  puts "the water level: #{l3.level} %"
end

def main
  stub = Carchecker::Stub.new('localhost:50051', :this_channel_is_insecure)
  run_get_carStatus(stub)
end

main
