package org.firstinspires.ftc.teamcode.main;

import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.RoadRunner.MecanumDrive;
import org.firstinspires.ftc.teamcode.SubSystems.Intake;

@TeleOp(name = "Vanguards2027_TeleOp")
public class Vanguards2027_TeleOp extends OpMode {
        /* Declare OpMode members. */
        public DcMotor  left_drive;
        public DcMotor  right_drive;

      /* names
+        Motor ports:
+        0 - "left_drive"
+        1 - "right_drive"
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

        DO NOT USE 12c - 0 thats for the IMU

    */


    
    public void init() { //initialization
        left_drive  = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");

        // reverse direction motor
        right_drive.setDirection(DcMotor.Direction.REVERSE);

    }

    public void loop() { //when u press play TWICE
        
        // ---------------------------------
        // DRIVE
        // ---------------------------------
        double forward; // left stick foward
        double rotate;  // right stick rotate

        // Run wheels in tank mode (note: The joystick goes negative when pushed forward, so negate it)
        forward = -gamepad1.left_stick_y;
        rotate = gamepad1.right_stick_x;
        
        if (forward > 0 || forward < 0)
        {

            left_drive.setPower(forward);
            right_drive.setPower(forward);
            // forward/backwards
        }
        else if (rotate > 0 || rotate < 0)
        {   
            // rotation
            left_drive.setPower(rotate);
            right_drive.setPower(rotate);
            
        }
        else 
        {  
            
            left_drive.setPower(0);
            right_drive.setPower(0);

        }


        // ---------------------------------
        // CONTROLS
        // ---------------------------------
        /*
        if(gamepad1.a) {
            
        } else if(gamepad1.a) {
            
        }*/

    }
}
