// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public final class TransferProto {
  private TransferProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/datatransfer/v1/" +
      "transfer.proto\022%google.cloud.bigquery.da" +
      "tatransfer.v1\032\034google/api/annotations.pr" +
      "oto\032\034google/protobuf/struct.proto\032\037googl" +
      "e/protobuf/timestamp.proto\032\027google/rpc/s" +
      "tatus.proto\"\255\003\n\016TransferConfig\022\014\n\004name\030\001" +
      " \001(\t\022\036\n\026destination_dataset_id\030\002 \001(\t\022\024\n\014" +
      "display_name\030\003 \001(\t\022\026\n\016data_source_id\030\005 \001" +
      "(\t\022\'\n\006params\030\t \001(\0132\027.google.protobuf.Str" +
      "uct\022\020\n\010schedule\030\007 \001(\t\022 \n\030data_refresh_wi" +
      "ndow_days\030\014 \001(\005\022\020\n\010disabled\030\r \001(\010\022/\n\013upd" +
      "ate_time\030\004 \001(\0132\032.google.protobuf.Timesta" +
      "mp\0221\n\rnext_run_time\030\010 \001(\0132\032.google.proto" +
      "buf.Timestamp\022C\n\005state\030\n \001(\01624.google.cl" +
      "oud.bigquery.datatransfer.v1.TransferSta" +
      "te\022\017\n\007user_id\030\013 \001(\003\022\026\n\016dataset_region\030\016 " +
      "\001(\t\"\376\003\n\013TransferRun\022\014\n\004name\030\001 \001(\t\0221\n\rsch" +
      "edule_time\030\003 \001(\0132\032.google.protobuf.Times" +
      "tamp\022,\n\010run_time\030\n \001(\0132\032.google.protobuf" +
      ".Timestamp\022(\n\014error_status\030\025 \001(\0132\022.googl" +
      "e.rpc.Status\022.\n\nstart_time\030\004 \001(\0132\032.googl" +
      "e.protobuf.Timestamp\022,\n\010end_time\030\005 \001(\0132\032" +
      ".google.protobuf.Timestamp\022/\n\013update_tim" +
      "e\030\006 \001(\0132\032.google.protobuf.Timestamp\022\'\n\006p" +
      "arams\030\t \001(\0132\027.google.protobuf.Struct\022\036\n\026" +
      "destination_dataset_id\030\002 \001(\t\022\026\n\016data_sou" +
      "rce_id\030\007 \001(\t\022C\n\005state\030\010 \001(\01624.google.clo" +
      "ud.bigquery.datatransfer.v1.TransferStat" +
      "e\022\017\n\007user_id\030\013 \001(\003\022\020\n\010schedule\030\014 \001(\t\"\212\002\n" +
      "\017TransferMessage\0220\n\014message_time\030\001 \001(\0132\032" +
      ".google.protobuf.Timestamp\022X\n\010severity\030\002" +
      " \001(\0162F.google.cloud.bigquery.datatransfe" +
      "r.v1.TransferMessage.MessageSeverity\022\024\n\014" +
      "message_text\030\003 \001(\t\"U\n\017MessageSeverity\022 \n" +
      "\034MESSAGE_SEVERITY_UNSPECIFIED\020\000\022\010\n\004INFO\020" +
      "\001\022\013\n\007WARNING\020\002\022\t\n\005ERROR\020\003*G\n\014TransferTyp" +
      "e\022\035\n\031TRANSFER_TYPE_UNSPECIFIED\020\000\022\t\n\005BATC" +
      "H\020\001\022\r\n\tSTREAMING\020\002*s\n\rTransferState\022\036\n\032T" +
      "RANSFER_STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\002" +
      "\022\013\n\007RUNNING\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005" +
      "\022\r\n\tCANCELLED\020\006B\347\001\n)com.google.cloud.big" +
      "query.datatransfer.v1B\rTransferProtoP\001ZQ" +
      "google.golang.org/genproto/googleapis/cl" +
      "oud/bigquery/datatransfer/v1;datatransfe" +
      "r\242\002\005GCBDT\252\002%Google.Cloud.BigQuery.DataTr" +
      "ansfer.V1\312\002%Google\\Cloud\\BigQuery\\DataTr" +
      "ansfer\\V1b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor,
        new java.lang.String[] { "Name", "DestinationDatasetId", "DisplayName", "DataSourceId", "Params", "Schedule", "DataRefreshWindowDays", "Disabled", "UpdateTime", "NextRunTime", "State", "UserId", "DatasetRegion", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor,
        new java.lang.String[] { "Name", "ScheduleTime", "RunTime", "ErrorStatus", "StartTime", "EndTime", "UpdateTime", "Params", "DestinationDatasetId", "DataSourceId", "State", "UserId", "Schedule", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor,
        new java.lang.String[] { "MessageTime", "Severity", "MessageText", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
