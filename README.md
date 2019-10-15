Google Cloud Java Client for IoT Core
======================================

Java idiomatic client for [IoT Core][cloud-iot].

[![Kokoro CI](http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/master.svg)](http://storage.googleapis.com/cloud-devrel-public/java/badges/google-cloud-java/master.html)
[![Maven](https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-iot.svg)](https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-iot.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/grade/9da006ad7c3a4fe1abd142e77c003917)](https://www.codacy.com/app/mziccard/google-cloud-java)

- [Product Documentation][iot-product-docs]
- [Client Library Documentation][iot-client-lib-docs]

> Note: This client is a work-in-progress, and may occasionally
> make backwards-incompatible changes.

Quickstart
----------

[//]: # ({x-version-update-start:google-cloud-iot:released})
If you are using Maven, add this to your pom.xml file
```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-iot</artifactId>
  <version>0.115.0-beta</version>
</dependency>
```
If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.cloud:google-cloud-iot:0.115.0-beta'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-iot" % "0.115.0-beta"
```
[//]: # ({x-version-update-end})

Authentication
--------------

See the [Authentication](https://github.com/googleapis/google-cloud-java#authentication) section in the base directory's README.

About Google Cloud IoT Core
----------------------------

Google Cloud [IoT Core][cloud-iot]  is a fully managed service that allows you to easily and securely connect, manage, and ingest data from millions of globally dispersed devices.

See the [IoT Core client library docs][iot-client-lib-docs] to learn how to use this IoT Core Client Library.

Getting Started
---------------
#### Prerequisites
You will need a [Google Developers Console](https://console.developers.google.com/) project with the IoT Core API enabled. [Follow these instructions](https://cloud.google.com/resource-manager/docs/creating-managing-projects) to get your project set up. You will also need to set up the local development environment by [installing the Google Cloud SDK](https://cloud.google.com/sdk/) and running the following commands in command line: `gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

#### Installation and setup
You'll need to obtain the `google-cloud-iot` library.  See the [Quickstart](#quickstart) section to add `google-cloud-iot` as a dependency in your code.

Troubleshooting
---------------

To get help, follow the instructions in the [shared Troubleshooting document](https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting).

Transport
---------
IoT Core uses gRPC for the transport layer.

Java Versions
-------------

Java 7 or above is required for using this client.

Versioning
----------

This library follows [Semantic Versioning](http://semver.org/).

It is currently in major version zero (``0.y.z``), which means that anything may change at any time and the public API should not be considered stable.

Contributing
------------

Contributions to this library are always welcome and highly encouraged.

See `google-cloud`'s [CONTRIBUTING] documentation and the [shared documentation](https://github.com/googleapis/google-cloud-common/blob/master/contributing/readme.md#how-to-contribute-to-gcloud) for more information on how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more information.

License
-------

Apache 2.0 - See [LICENSE] for more information.


[CONTRIBUTING]:https://github.com/googleapis/google-cloud-java/blob/master/CONTRIBUTING.md
[code-of-conduct]:https://github.com/googleapis/google-cloud-java/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[LICENSE]: https://github.com/googleapis/google-cloud-java/blob/master/LICENSE
[cloud-platform]: https://cloud.google.com/
[cloud-iot]: https://cloud.google.com/iot-core
[iot-product-docs]: https://cloud.google.com/iot-core/docs
[iot-client-lib-docs]: https://googleapis.dev/java/google-cloud-clients/latest/index.html?com/google/cloud/iot/v1/package-summary.html
