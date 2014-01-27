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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3824.PromoChassis.Robot;

/**
 *
 */
public class UpdatePID extends Command
{

    public UpdatePID()
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        SmartDashboard.putNumber("P", Robot.drivetrain.getAngleGyroController().getP());
        SmartDashboard.putNumber("I", Robot.drivetrain.getAngleGyroController().getI());
        SmartDashboard.putNumber("D", Robot.drivetrain.getAngleGyroController().getD());

    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        double P;
        double I;
        double D;

        P = SmartDashboard.getNumber("P");
        I = SmartDashboard.getNumber("I");
        D = SmartDashboard.getNumber("D");
        Robot.drivetrain.getAngleGyroController().setPID(P, I, D);
        System.out.println("P: " + P + " ,I: " + I + ", D: " + D);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return true;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}