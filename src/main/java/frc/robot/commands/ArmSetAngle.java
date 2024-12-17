// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class ArmSetAngle extends Command {

  private Arm arm;
  double desiredAngle;
  /** Creates a new ArmSetAngle. */
  public ArmSetAngle(double desiredAngle) {
    
    arm = Arm.getInstance();
    this.desiredAngle = desiredAngle;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(arm);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    arm.moveArm(desiredAngle);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
