// PEMROGRAMAN AUTONOMOUS DRIVEBASE FUNCTION CALLpackage org.firstinspires.ftc.teamcode;import java.util.Locale;import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;import com.qualcomm.robotcore.eventloop.opmode.Autonomous;import com.qualcomm.robotcore.eventloop.opmode.TeleOp;import com.qualcomm.robotcore.util.ElapsedTime;import com.qualcomm.robotcore.hardware.DcMotor;import com.qualcomm.robotcore.hardware.Servo;import com.qualcomm.robotcore.hardware.DigitalChannel;import com.qualcomm.robotcore.hardware.ColorSensor;import com.qualcomm.robotcore.hardware.DistanceSensor;@Autonomous(name=" DriveBaseFunction ", group="Autonomous")public class DriveBaseFunction extends LinearOpMode {    // Declare OpMode members.    private ElapsedTime runtime = new ElapsedTime();    private DcMotor motorKanan;    private DcMotor motorKiri;    private DcMotor rightMotor;    private DcMotor leftMotor;    private DcMotor motorLengan;    private Servo servoJari;    private DigitalChannel sensorSentuh;    //private ColorSensor sensorWarna;    private DistanceSensor sensorJarak;                //@Override            public void move(double lpower, double rpower, int msec) throws InterruptedException {         if (opModeIsActive()) {             leftMotor.setPower(lpower);             rightMotor.setPower(rpower);             sleep(msec);             leftMotor.setPower(0);             rightMotor.setPower(0);        }     }        public void runOpMode() throws InterruptedException {                leftMotor = hardwareMap.dcMotor.get("motorKiri");         rightMotor = hardwareMap.dcMotor.get("motorKanan");         rightMotor.setDirection(DcMotor.Direction.REVERSE);                motorKanan = hardwareMap.get(DcMotor.class,"motorKanan");        motorKiri = hardwareMap.get(DcMotor.class,"motorKiri");        motorLengan = hardwareMap.get(DcMotor.class,"motorLengan");        servoJari = hardwareMap.get(Servo.class, "servoJari");        sensorSentuh = hardwareMap.get(DigitalChannel.class, "sensorSentuh");        sensorJarak = hardwareMap.get(DistanceSensor.class, "sensorJarak");        // set digital channel to input mode.         sensorSentuh.setMode(DigitalChannel.Mode.INPUT);        telemetry.addData("Status", "Initialized");        telemetry.update();        // Wait for the game to start (driver presses PLAY)        waitForStart();                move(0.5, 0.5, 1000); // move forward for two seconds         move(-0.5, -0.5, 1000); // move backwards for one second         move(0.5, -0.5, 1000); // turn to right for 1.5 seconds                /*        // Drive base        // Maju        motorKanan.setPower(-0.5);        motorKiri.setPower (0.5);        sleep(1000);        motorKanan.setPower(0);        motorKiri.setPower (0);        sleep(500);                // Berputar        motorKanan.setPower(0.5);        motorKiri.setPower (0.5);        sleep(3000);        motorKanan.setPower(0);        motorKiri.setPower (0);        sleep(500);                // /*        // Mundur        motorKanan.setPower(0.5);        motorKiri.setPower (-0.5);        sleep(1000);        motorKanan.setPower(0);        motorKiri.setPower (0);        sleep(500);                 */                // Menggerakan Lengan dan Jari         motorLengan.setPower(-0.2);        sleep(500);        motorLengan.setPower(0);        sleep(200);        motorLengan.setPower(0.2);        sleep(200);        motorLengan.setPower(0);        sleep(200);                // Menggerakan Jari        servoJari.setPosition(0);        sleep(1500);        servoJari.setPosition(1);        sleep(1500);                        // run until the end of the match (driver presses STOP)        while (opModeIsActive()) {        if (sensorSentuh.getState() == false) {        // button is pressed.        telemetry.addData("Button", "PRESSED");        servoJari.setPosition(0);        }                if (sensorSentuh.getState() == true) {        // button is not pressed.        telemetry.addData("Button", "NOT PRESSED");        servoJari.setPosition(1);        }                        // Data sensor jarak        telemetry.addData("Distance (cm)", sensorJarak.getDistance(DistanceUnit.CM));                           telemetry.addData("Status", "Running");         telemetry.update();                }            }}          