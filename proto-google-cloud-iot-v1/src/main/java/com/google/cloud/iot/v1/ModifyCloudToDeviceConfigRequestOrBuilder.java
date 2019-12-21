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

public interface ModifyCloudToDeviceConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The version number to update. If this value is zero, it will not check the
   * version number of the server and will always update the current version;
   * otherwise, this update will fail if the version number found on the server
   * does not match this version number. This is used to support multiple
   * simultaneous updates without losing data.
   * </pre>
   *
   * <code>int64 version_to_update = 2;</code>
   *
   * @return The versionToUpdate.
   */
  long getVersionToUpdate();

  /**
   *
   *
   * <pre>
   * Required. The configuration data for the device.
   * </pre>
   *
   * <code>bytes binary_data = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The binaryData.
   */
  com.google.protobuf.ByteString getBinaryData();
}
