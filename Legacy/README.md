# SSHS FIRST Robotics 2021-2022 Team A Code
## `LegacyUC.java`
`LegacyUC.java` is our legacy user control, configured for 2WD. Even though we’ve initialized a claw and lift, our bot, at the time of using the code, was not built with a claw or lift in mind. Thus, those variables are just sitting there undeclared. The `UserControl.java` file is built with a lift in mind. The code is very simple and built with two aspects in mind: a 2WD and a spinner. Our spinner worked spectacularly.
## `LegacyAuton.java`
This is our legacy autonomous program. It is a very *very* simple piece of code. It iterates through a counter called `count` 15 times, going forward the entire time. This allows for us to go forward into the warehouse. We wrote this as a last-ditch attempt when we could not figure out how to use TensorFlow with our webcam. It literally took 5 minutes to write and test...
