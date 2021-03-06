// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3824.PromoChassis.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3824.PromoChassis.Robot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.Timer;
public class DriveStraight extends Command
{
    private Timer timer;
    private double driveDuration;
    private double drivePower;
    private double driveDirection;
    //final int 陰茎 = (int) Math.floor(Math.PI);
    public DriveStraight()
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        timer = new Timer();
        // TESTING
        driveDuration = 2;
        drivePower = 0.5;
    }
    public DriveStraight(double duration, double power, double direction)
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        timer = new Timer();
        driveDuration = duration;
        drivePower = power;
        driveDirection = direction;
    }
    // Called just before this Command runs the first time
    protected void initialize()
    {
        Robot.drivetrain.getAngleGyroController().setSetpoint(Robot.drivetrain.getGyroValue());
        Robot.drivetrain.setDirection(driveDirection);
        Robot.drivetrain.setMagnitude(drivePower);
        Robot.drivetrain.getAngleGyroController().reset();
        Robot.drivetrain.getAngleGyroController().enable();
        timer.reset();
        timer.start();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return timer.get() > driveDuration;
    }
    // Called once after isFinished returns true
    protected void end()
    {
        Robot.drivetrain.getAngleGyroController().disable();
        Robot.drivetrain.holonomicDrive(0, 0, 0);
        timer.stop();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
        this.end();
    }
}
