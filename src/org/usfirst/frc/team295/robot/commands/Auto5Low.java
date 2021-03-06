package org.usfirst.frc.team295.robot.commands;

import org.usfirst.frc.team295.robot.RobotMap;
import org.usfirst.frc.team295.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Auto5Low extends CommandGroup{
	double dZeroAngle;
	Shooter shooter;
	public Auto5Low(){
		
	shooter = RobotMap.shooter;
	RobotMap.ahrs.reset();
	dZeroAngle = RobotMap.ahrs.getAngle();
//	addSequential(new SetShooterAngleAbsolute(145350.0/1.4));
//	addSequential(new WaitCommand(2));
//	
	//addSequential(new SpinUpShooter(1));
	
	//DAVID, this stuff here.
	addSequential(new AutoDrive(3.5, .8, 1));
	addSequential(new WaitCommand(1));
	addSequential(new AutoDriveToWall(450, 0.3, 1)); //Drives until it detects wall in front
	addSequential(new AutoTurn(45, 1)); //Turn does not work, the rest of it does
	addSequential(new SetShooterAngleAbsolute(145350.0/1.4));
	addSequential(new SpinUpShooter(1));
	addSequential(new SetWedge(-1));
	addSequential(new SpinUpShooter(0));
	
	//addSequential(new WaitCommand(2));
//	shooter.setSpeed(0,0);
	//addSequential(new SetWedge(-1));
	
//	addSequential(new AutoDrive(4.5, .7, 1));
//	addSequential(new AutoDrive(.5, .5, -1));
//	addSequential(new PIDTurnRight(45));
//	addSequential(new SetShoo);
	}
}
