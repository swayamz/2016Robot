package org.usfirst.frc.team295.robot.commands;

import org.usfirst.frc.team295.robot.RobotMap;
import org.usfirst.frc.team295.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveTank extends Command {
	
	private Drivetrain drivetrain;
	private Joystick driverJoystick;
	
	public DriveTank() {
		drivetrain = RobotMap.drivetrain;
		driverJoystick = RobotMap.oi.getDriverJoystick();
		requires(drivetrain);
	}
	
	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		drivetrain.tankDrive(driverJoystick.getRawAxis(1), driverJoystick.getRawAxis(5));
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		drivetrain.setSpeed(0, 0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
