package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Autonomous_Straight (Blocks to Java)")
public class Autonomous_Straight extends LinearOpMode {

  private DcMotor rightMotor;
  private DcMotor leftMotor;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
    leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        for (int count = 0; count < 15; count++) {
          rightMotor.setPower(1);
          leftMotor.setPower(1);
        }
        // Put loop blocks here.
        telemetry.update();
      }
    }
  }
}
