/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface GatewayListOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.GatewayListOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
   * is specified, only non-gateway devices are returned. If
   * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   */
  int getGatewayTypeValue();
  /**
   *
   *
   * <pre>
   * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
   * is specified, only non-gateway devices are returned. If
   * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   */
  com.google.cloud.iot.v1.GatewayType getGatewayType();

  /**
   *
   *
   * <pre>
   * If set, only devices associated with the specified gateway are returned.
   * The gateway ID can be numeric (`num_id`) or the user-defined string
   * (`id`). For example, if `123` is specified, only devices bound to the
   * gateway with `num_id` 123 are returned.
   * </pre>
   *
   * <code>string associations_gateway_id = 2;</code>
   */
  java.lang.String getAssociationsGatewayId();
  /**
   *
   *
   * <pre>
   * If set, only devices associated with the specified gateway are returned.
   * The gateway ID can be numeric (`num_id`) or the user-defined string
   * (`id`). For example, if `123` is specified, only devices bound to the
   * gateway with `num_id` 123 are returned.
   * </pre>
   *
   * <code>string associations_gateway_id = 2;</code>
   */
  com.google.protobuf.ByteString getAssociationsGatewayIdBytes();

  /**
   *
   *
   * <pre>
   * If set, returns only the gateways with which the specified device is
   * associated. The device ID can be numeric (`num_id`) or the user-defined
   * string (`id`). For example, if `456` is specified, returns only the
   * gateways to which the device with `num_id` 456 is bound.
   * </pre>
   *
   * <code>string associations_device_id = 3;</code>
   */
  java.lang.String getAssociationsDeviceId();
  /**
   *
   *
   * <pre>
   * If set, returns only the gateways with which the specified device is
   * associated. The device ID can be numeric (`num_id`) or the user-defined
   * string (`id`). For example, if `456` is specified, returns only the
   * gateways to which the device with `num_id` 456 is bound.
   * </pre>
   *
   * <code>string associations_device_id = 3;</code>
   */
  com.google.protobuf.ByteString getAssociationsDeviceIdBytes();

  public com.google.cloud.iot.v1.GatewayListOptions.FilterCase getFilterCase();
}
