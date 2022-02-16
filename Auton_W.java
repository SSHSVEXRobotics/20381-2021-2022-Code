package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autononmous(name = "Auton - Warehouse")
public class Auton_W extends Autononmous {

private DcMotor DRVFR;
private DcMotor DRVFL;
private DcMotor DRVRR;
private DcMotor DRVRL;
private DcMotor Spinner;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    DRVFR = hardwareMap.get(DcMotor.class, "DRVFR");
    DRVFL = hardwareMap.get(DcMotor.class, "DRVFL");
    DRVRR = hardwareMap.get(DcMotor.class, "DRVRR");
    DRVRL = hardwareMap.get(DcMotor.class, "DRVRL");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        for(int count = 0; count < 10; count++) {
          DRVFL.setPower(1);
          DRVRL.setPower(1);
          DRVFR.setPower(1);
          DRVRR.setPower(1);
        // Put loop blocks here.
        telemetry.update();
      }
    }
  }
}
