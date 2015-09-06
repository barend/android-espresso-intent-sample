# Espresso rules / intents sample

This project demonstrates how to use the new(ish) `com.android.support.test:rules` runner to write
clean, JUnit4-style tests with the Espresso framework. At the time of writing, the code samples and
documentation do not explain how to start your activity-under-test with Intent extras.

There are three test classes in this module:

* `MainActivityTest`: demonstrates the basic case of running with a default intent.
* `MainActivityLaunchIntentTest`: demonstrates how to use a single, custom intent for all tests
  defined in the source file.
* `MainActivityMultipleLaunchIntentTest`: demonstrates how to use different intent extras for each
   of the tests defined in the source file.

# License

     Copyright 2015 Barend Garvelink
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
