package org.firstinspires.ftc.teamcode.main;

import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.RoadRunner.MecanumDrive;
import org.firstinspires.ftc.teamcode.SubSystems.Intake;

@TeleOp(name = "Vanguards2027_TeleOp")
public class Vanguards2027_TeleOp extends OpMode {
       /*
+    names
+        Motor ports:
+        0 -
+        1 -
+        2 -
+        3 -
+
+        Servo ports:
+        0 -
+        1 -
+        2 -
+        3 -
+        4 -
+        5 -
+
+        DO NOT USE 12c - 0 thats for the IMU
+
+    */

    MecanumDrive drive;
    Intake intake;
    Pose2d beginPos = new Pose2d(60,12,Math.toRadians(180)); //for roadrunner

    public void init() { //initialization
        drive = new MecanumDrive(hardwareMap, beginPos);
        drive.lazyImu.get().resetYaw();
        //intake = new Intake(hardwareMap);
    }

    public void loop() { //when u press play TWICE
        double forward = -gamepad1.left_stick_y; //forward
        double strafe = gamepad1.left_stick_x; // side to side
        double rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward, strafe, rotate); //field oriented

        // ---------------------------------
        // CONTROLS
        // ---------------------------------

        /*
        if(gamepad1.a) {
            intake.intakeIn();
        } else if(gamepad1.a) {
            intake.intakeOut();
        }*/

    }
}
