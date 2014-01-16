// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc3824.PromoChassis2014;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainFrontRight;
    public static SpeedController drivetrainFrontLeft;
    public static SpeedController drivetrainRearRight;
    public static SpeedController drivetrainRearLeft;
    public static RobotDrive drivetrainHolonomicDrive;
    public static Gyro drivetrainGyro;
    public static Solenoid shooterShootSolenoid1;
    public static Solenoid shooterShootSolenoid2;
    public static Solenoid shooterShootSolenoid3;
    public static Solenoid shooterShootSolenoid4;
    public static Compressor pumpCompressor1;
    public static Compressor pumpCompressor2;
    public static SpeedController shooterAngleAdjustAngleMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainFrontRight = new Talon(1, 1);
	LiveWindow.addActuator("Drivetrain", "Front Right", (Talon) drivetrainFrontRight);
        
        drivetrainFrontLeft = new Talon(1, 2);
	LiveWindow.addActuator("Drivetrain", "Front Left", (Talon) drivetrainFrontLeft);
        
        drivetrainRearRight = new Talon(1, 3);
	LiveWindow.addActuator("Drivetrain", "Rear Right", (Talon) drivetrainRearRight);
        
        drivetrainRearLeft = new Victor(1, 4);
	LiveWindow.addActuator("Drivetrain", "Rear Left", (Victor) drivetrainRearLeft);
        
        drivetrainHolonomicDrive = new RobotDrive(drivetrainFrontLeft, drivetrainRearLeft,
              drivetrainFrontRight, drivetrainRearRight);
	
        drivetrainHolonomicDrive.setSafetyEnabled(true);
        drivetrainHolonomicDrive.setExpiration(0.1);
        drivetrainHolonomicDrive.setSensitivity(0.5);
        drivetrainHolonomicDrive.setMaxOutput(1.0);
        drivetrainHolonomicDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainHolonomicDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        drivetrainGyro = new Gyro(1, 1);
	LiveWindow.addSensor("Drivetrain", "Gyro", drivetrainGyro);
        drivetrainGyro.setSensitivity(0.0070);
        shooterShootSolenoid1 = new Solenoid(1, 1);
	LiveWindow.addActuator("Shooter", "Shoot Solenoid 1", shooterShootSolenoid1);
        
        shooterShootSolenoid2 = new Solenoid(1, 2);
	LiveWindow.addActuator("Shooter", "Shoot Solenoid 2", shooterShootSolenoid2);
        
        shooterShootSolenoid3 = new Solenoid(1, 3);
	LiveWindow.addActuator("Shooter", "Shoot Solenoid 3", shooterShootSolenoid3);
        
        shooterShootSolenoid4 = new Solenoid(1, 4);
	LiveWindow.addActuator("Shooter", "Shoot Solenoid 4", shooterShootSolenoid4);
        
        pumpCompressor1 = new Compressor(1, 1, 1, 1);
	
        
        pumpCompressor2 = new Compressor(1, 2, 1, 2);
	
        
        shooterAngleAdjustAngleMotor = new Victor(1, 5);
	LiveWindow.addActuator("Shooter Angle Adjust", "Angle Motor", (Victor) shooterAngleAdjustAngleMotor);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
