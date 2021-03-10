# Github Actions Android Playground
[![CI Status](https://github.com/hadjirulricky/github-actions-android-playground/workflows/CI/badge.svg)](https://github.com/hadjirulricky/github-actions-android-playground)

This repository shows an example on how you can integrate [GitHub Actions](https://github.com/features/actions) in your Android Project. 

Failing job sample https://github.com/hadjirulricky/github-actions-android-playground/tree/failing-job-sample

## Workflows
This project contains one workflow which is [ci.yml](https://github.com/hadjirulricky/github-actions-android-playground/blob/master/.github/workflows/ci.yml). 

**Jobs:**
It contains 4 jobs that will run everytime you push in the repository.

* `ktlint` - will run the ktlint library to check the checkstyle of kotlin codes inside the project. See https://github.com/pinterest/ktlint to integrate it in your project.

* `lint` - will run the built-in lint tool for android. See https://developer.android.com/studio/write/lint to integrate it in your project.

* `unit-test` - will run unit test files in the app.

* `android-test` - will run the instrumented test files in the app.

**Actions:**
These are the actions used in jobs.

* `checkout` - checkouts the specific branch. https://github.com/actions/checkout

* `setup-java` - used to setup jdk. https://github.com/actions/setup-java

* `Android Emulator Runner` - used to setup android emulator. https://github.com/ReactiveCircus/android-emulator-runner

## References
* https://docs.github.com/en/actions/learn-github-actions/introduction-to-github-actions
* https://wkrzywiec.medium.com/github-actions-for-android-first-approach-f616c24aa0f9
* https://andresand.medium.com/adding-github-action-workflow-status-badge-to-your-repository-22ccea025af6
