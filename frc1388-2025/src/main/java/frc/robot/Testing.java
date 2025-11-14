package frc.robot;

import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;

public class Testing {

    private RobotContainer m_robotContainer = new RobotContainer();

    Command myDopeAuto = m_robotContainer.getDopeAuto();

    public void main(String[] args) {

        System.out.println(myDopeAuto);
        
    }
}
