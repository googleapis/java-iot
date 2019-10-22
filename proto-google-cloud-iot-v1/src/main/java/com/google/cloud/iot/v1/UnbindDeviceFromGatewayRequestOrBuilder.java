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

public interface UnbindDeviceFromGatewayRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.UnbindDeviceFromGatewayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the registry. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the registry. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The value of `gateway_id` can be either the device numeric ID or the
   * user-defined device identifier.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getGatewayId();
  /**
   *
   *
   * <pre>
   * Required. The value of `gateway_id` can be either the device numeric ID or the
   * user-defined device identifier.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getGatewayIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The device to disassociate from the specified gateway. The value of
   * `device_id` can be either the device numeric ID or the user-defined device
   * identifier.
   * </pre>
   *
   * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getDeviceId();
  /**
   *
   *
   * <pre>
   * Required. The device to disassociate from the specified gateway. The value of
   * `device_id` can be either the device numeric ID or the user-defined device
   * identifier.
   * </pre>
   *
   * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getDeviceIdBytes();
}
