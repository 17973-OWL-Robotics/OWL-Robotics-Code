package org.firstinspires.ftc.teamcode.Other;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Motor_Test extends LinearOpMode {

    DcMotor motor;

    public void runOpMode() {

        motor = hardwareMap.get(DcMotor.class, "motor");

        PID_Controller controller = new PID_Controller(motor);

        waitForStart();
        if (opModeIsActive()) {

            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

            controller.rotateTo(1);
        }

    }
}
