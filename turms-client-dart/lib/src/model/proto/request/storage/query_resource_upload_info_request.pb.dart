///
//  Generated code. Do not modify.
//  source: request/storage/query_resource_upload_info_request.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,unnecessary_const,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type,unnecessary_this,prefer_final_fields

import 'dart:core' as $core;

import 'package:fixnum/fixnum.dart' as $fixnum;
import 'package:protobuf/protobuf.dart' as $pb;

import '../../constant/storage_resource_type.pbenum.dart' as $0;

class QueryResourceUploadInfoRequest extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(
      const $core.bool.fromEnvironment('protobuf.omit_message_names')
          ? ''
          : 'QueryResourceUploadInfoRequest',
      package: const $pb.PackageName(
          const $core.bool.fromEnvironment('protobuf.omit_message_names')
              ? ''
              : 'im.turms.proto'),
      createEmptyInstance: create)
    ..e<$0.StorageResourceType>(
        1,
        const $core.bool.fromEnvironment('protobuf.omit_field_names')
            ? ''
            : 'type',
        $pb.PbFieldType.OE,
        defaultOrMaker: $0.StorageResourceType.USER_PROFILE_PICTURE,
        valueOf: $0.StorageResourceType.valueOf,
        enumValues: $0.StorageResourceType.values)
    ..aOS(
        2,
        const $core.bool.fromEnvironment('protobuf.omit_field_names')
            ? ''
            : 'keyStr')
    ..aInt64(
        3,
        const $core.bool.fromEnvironment('protobuf.omit_field_names')
            ? ''
            : 'keyNum')
    ..hasRequiredFields = false;

  QueryResourceUploadInfoRequest._() : super();
  factory QueryResourceUploadInfoRequest({
    $0.StorageResourceType? type,
    $core.String? keyStr,
    $fixnum.Int64? keyNum,
  }) {
    final _result = create();
    if (type != null) {
      _result.type = type;
    }
    if (keyStr != null) {
      _result.keyStr = keyStr;
    }
    if (keyNum != null) {
      _result.keyNum = keyNum;
    }
    return _result;
  }
  factory QueryResourceUploadInfoRequest.fromBuffer($core.List<$core.int> i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromBuffer(i, r);
  factory QueryResourceUploadInfoRequest.fromJson($core.String i,
          [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) =>
      create()..mergeFromJson(i, r);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
      'Will be removed in next major version')
  QueryResourceUploadInfoRequest clone() =>
      QueryResourceUploadInfoRequest()..mergeFromMessage(this);
  @$core.Deprecated('Using this can add significant overhead to your binary. '
      'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
      'Will be removed in next major version')
  QueryResourceUploadInfoRequest copyWith(
          void Function(QueryResourceUploadInfoRequest) updates) =>
      super.copyWith(
              (message) => updates(message as QueryResourceUploadInfoRequest))
          as QueryResourceUploadInfoRequest; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static QueryResourceUploadInfoRequest create() =>
      QueryResourceUploadInfoRequest._();
  QueryResourceUploadInfoRequest createEmptyInstance() => create();
  static $pb.PbList<QueryResourceUploadInfoRequest> createRepeated() =>
      $pb.PbList<QueryResourceUploadInfoRequest>();
  @$core.pragma('dart2js:noInline')
  static QueryResourceUploadInfoRequest getDefault() => _defaultInstance ??=
      $pb.GeneratedMessage.$_defaultFor<QueryResourceUploadInfoRequest>(create);
  static QueryResourceUploadInfoRequest? _defaultInstance;

  @$pb.TagNumber(1)
  $0.StorageResourceType get type => $_getN(0);
  @$pb.TagNumber(1)
  set type($0.StorageResourceType v) {
    setField(1, v);
  }

  @$pb.TagNumber(1)
  $core.bool hasType() => $_has(0);
  @$pb.TagNumber(1)
  void clearType() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get keyStr => $_getSZ(1);
  @$pb.TagNumber(2)
  set keyStr($core.String v) {
    $_setString(1, v);
  }

  @$pb.TagNumber(2)
  $core.bool hasKeyStr() => $_has(1);
  @$pb.TagNumber(2)
  void clearKeyStr() => clearField(2);

  @$pb.TagNumber(3)
  $fixnum.Int64 get keyNum => $_getI64(2);
  @$pb.TagNumber(3)
  set keyNum($fixnum.Int64 v) {
    $_setInt64(2, v);
  }

  @$pb.TagNumber(3)
  $core.bool hasKeyNum() => $_has(2);
  @$pb.TagNumber(3)
  void clearKeyNum() => clearField(3);
}