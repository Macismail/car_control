// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package org.mycompany.example.car;

public final class CarProto {
  private CarProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_car_CarStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_car_CarStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcar.proto\022\003car\032\033google/protobuf/empty." +
      "proto\",\n\tCarStatus\022\022\n\npercentage\030\001 \001(\005\022\013" +
      "\n\003loc\030\002 \001(\t2\250\001\n\003Car\0223\n\005Close\022\026.google.pr" +
      "otobuf.Empty\032\016.car.CarStatus\"\0000\001\0225\n\tgetS" +
      "tatus\022\026.google.protobuf.Empty\032\016.car.CarS" +
      "tatus\"\000\0225\n\tLockDoors\022\026.google.protobuf.E" +
      "mpty\032\016.car.CarStatus\"\000B\'\n\031org.mycompany." +
      "example.carB\010CarProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_car_CarStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_car_CarStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_car_CarStatus_descriptor,
        new java.lang.String[] { "Percentage", "Loc", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
