package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autononmous(name = "Auton_Right")
public class Auton_Right_Manual extends Autononmous {

  private DcMotor rightMotor;
  private DcMotor leftMotor;
  private DcMotor Spinner;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
    leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        for(int count = 0; count < 5; count++) {
          leftMotor.setPower(1);
        }
        for(int count = 0; count < 10; count++) {
          rightMotor.setPower(1);
          leftMotor.setPower(1);
        }
        for(int count = 0; count < 4; count++){
            Spinner.setPower(1);
          }
        for(int count = 0; count < 15; count++) {
          rightMotor.setPower(-1);
          leftMotor.setPower(-1);
        // Put loop blocks here.
        telemetry.update();
      }
    }
  }
}
