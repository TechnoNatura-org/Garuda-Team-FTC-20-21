package org.firstinspires.ftc.teamcode;import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;import com.qualcomm.robotcore.hardware.Servo;import java.util.Locale;import com.qualcomm.robotcore.eventloop.opmode.Autonomous;import com.qualcomm.robotcore.eventloop.opmode.TeleOp;import com.qualcomm.robotcore.util.ElapsedTime;import com.qualcomm.robotcore.hardware.DcMotor;@Autonomous(name="Coba_awal", group="Autonomous")public class Coba_awal extends LinearOpMode {    // Declare OpMode members.    private ElapsedTime runtime = new ElapsedTime();    private DcMotor M1;     private DcMotor M2;     private Servo servoTest;        @Override    public void runOpMode() {                M1 = hardwareMap.get(DcMotor.class,"leftDrive");        M2 = hardwareMap.get(DcMotor.class,"rightDrive");       telemetry.addData("Status", "Initialized");        telemetry.update();     // Wait for the game to start (driver presses PLAY)        waitForStart();               //Maju 1 detik        M1.setPower(-0.5);        M2.setPower(0.5);        sleep(1000);                // Berhenti 1 detik        M1.setPower(0);        M2.setPower(0);        sleep(1000);                //Berputar 1 detik        M1.setPower(-0.5);        M2.setPower(-0.5);        sleep(1000);                // Berhenti         M1.setPower(0);        M2.setPower(0);        sleep(1000);                //Berputar 1 detik        M1.setPower(0.5);        M2.setPower(0.5);        sleep(1000);                // Berhenti        M1.setPower(0);        M2.setPower(0);        sleep(1000);        //Mundur 1 detik        M1.setPower(0.5);        M2.setPower(-0.5);        sleep(1000);                // Berhenti        M1.setPower(0);        M2.setPower(0);        sleep(1000);        //Belok 1 detik        M1.setPower(0.5);        M2.setPower(0);        sleep(1000);        // Berhenti        M1.setPower(0);        M2.setPower(0);        sleep(1000);        //Belok 1 detik        M1.setPower(0);        M2.setPower(-0.5);        sleep(1000);            // Berhenti        M1.setPower(0);        M2.setPower(0);        sleep(1000);// run until the end of the match (driver presses STOP)        while (opModeIsActive()) {                 }}}