/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.iot.v1.samples;

// [START iot_v1_generated_devicemanagerclient_modifycloudtodeviceconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.iot.v1.DeviceConfig;
import com.google.cloud.iot.v1.DeviceManagerClient;
import com.google.cloud.iot.v1.DeviceName;
import com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest;
import com.google.protobuf.ByteString;

public class AsyncModifyCloudToDeviceConfig {

  public static void main(String[] args) throws Exception {
    asyncModifyCloudToDeviceConfig();
  }

  public static void asyncModifyCloudToDeviceConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
      ModifyCloudToDeviceConfigRequest request =
          ModifyCloudToDeviceConfigRequest.newBuilder()
              .setName(
                  DeviceName.of("[PROJECT]", "[LOCATION]", "[REGISTRY]", "[DEVICE]").toString())
              .setVersionToUpdate(462348390)
              .setBinaryData(ByteString.EMPTY)
              .build();
      ApiFuture<DeviceConfig> future =
          deviceManagerClient.modifyCloudToDeviceConfigCallable().futureCall(request);
      // Do something.
      DeviceConfig response = future.get();
    }
  }
}
// [END iot_v1_generated_devicemanagerclient_modifycloudtodeviceconfig_async]
