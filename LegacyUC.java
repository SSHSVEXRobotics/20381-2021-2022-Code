package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Newest Usercontrol")

public class UserControl extends LinearOpMode{
    
    //defining motors

private DcMotor rightMotor;
private DcMotor leftMotor;
private DcMotor Spinner;
private DcMotor Lift;
private Servo Claw;

@Override
public void runOpMode()
{
    //hardware map 
    
    rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
    leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");
    Lift = hardwareMap.get(DcMotor.class, "Lift");
    Claw = hardwareMap.get(Servo.class, "Claw");
    
    waitForStart();
    
    
    while(opModeIsActive())
    {
        //drivetrain
        rightMotor.setPower(gamepad1.right_stick_y);
        leftMotor.setPower(-gamepad1.left_stick_y);
        
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
}
