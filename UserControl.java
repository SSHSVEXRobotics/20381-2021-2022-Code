package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Usercontrol")

public class UserControl extends LinearOpMode{
    
    //defining motors

private DcMotor DRVFR;
private DcMotor DRVFL;
private DcMotor DRVRR;
private DcMotor DRVRL;
private DcMotor Spinner;
private DcMotor Lift;
//private Servo Claw;

@Override
public void runOpMode()
{
    //hardware map 
    
    DRVFR = hardwareMap.get(DcMotor.class, "DRVFR");
    DRVFL = hardwareMap.get(DcMotor.class, "DRVFL");
    DRVRR = hardwareMap.get(DcMotor.class, "DRVRR");
    DRVRL = hardwareMap.get(DcMotor.class, "DRVRL");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");
    Lift = hardwareMap.get(DcMotor.class, "Lift");
    //Claw = hardwareMap.get(Servo.class, "Claw");
    
    waitForStart();
    
    
    while(opModeIsActive())
    {
        //drivetrain
        DRVFR.setPower(gamepad1.right_stick_y);
        DRVFL.setPower(-gamepad1.left_stick_y);
        DRVRR.setPower(gamepad1.right_stick_y);
        DRVRL.setPower(-gamepad1.left_stick_y);
        
        if(gamepad1.right_bumper)
        {
            Spinner.setPower(1);
        }
        else if(gamepad1.left_bumper)
        {
            Spinner.setPower(-1);
        }
        else
        {
            Spinner.setPower(0);
        }

        if(gamepad1.dpad_up){
            Lift.setPower(1);
        }
        else if (gamepad1.dpad_down){
            Lift.setPower(-1);
            
        }
        else{
            Lift.setPower = 0;
        }



    }
}
}
/*        
        //Spinner
        if(gamepad1.right_bumper)
        {
            Spinner.setPower(1);
        }
        else if(gamepad1.left_bumper)
        {
            Spinner.setPower(-1);
        }
        else
        {
            Spinner.setPower(0);
        }
    
        
    }
}

}*/
