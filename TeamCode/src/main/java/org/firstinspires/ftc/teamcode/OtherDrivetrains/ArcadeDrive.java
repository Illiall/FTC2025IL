package org.firstinspires.ftc.teamcode.OtherDrivetrains;/*package org.firstinspires.ftc.teamcode.OtherDrivetrains;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class ArcadeDrive extends LinearOpMode {

    @Override
    public void runOpMode(){
        DcMotor left_motor = hardwareMap.get(DcMotor.class,"lm");
        DcMotor right_motor = hardwareMap.get(DcMotor.class,"rm");

        right_motor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while(opModeIsActive()){
            double rx = gamepad1.right_stick_x;
            double ly = gamepad1.left_stick_y;

            right_motor.setPower(ly-rx);
            left_motor.setPower(ly+rx);
        }
    }
}*/
