# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: car.proto

require 'google/protobuf'

require 'google/protobuf/empty_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("car.proto", :syntax => :proto3) do
    add_message "car.CarStatus" do
      repeated :checks, :message, 1, "car.Check"
    end
    add_message "car.Check" do
      optional :level, :int32, 1
    end
  end
end

module Car
  CarStatus = Google::Protobuf::DescriptorPool.generated_pool.lookup("car.CarStatus").msgclass
  Check = Google::Protobuf::DescriptorPool.generated_pool.lookup("car.Check").msgclass
end