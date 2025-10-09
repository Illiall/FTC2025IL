package org.firstinspires.ftc.teamcode.OtherDrivetrains;/*package org.firstinspires.ftc.teamcode.OtherDrivetrains;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class TankDrive extends LinearOpMode{

    @Override
    public void runOpMode(){
        DcMotor left_motor = hardwareMap.get(DcMotor.class,"lm");
        DcMotor right_motor = hardwareMap.get(DcMotor.class, "rm");

        left_motor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while(opModeIsActive()){

            double left = gamepad1.left_stick_y;
            double right = gamepad1.right_stick_y;

            left_motor.setPower(left);
            right_motor.setPower(right);
        }
    }
}*/
