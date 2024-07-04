package org.example.behavioral.strategy;

import org.example.behavioral.strategy.context.Robot;
import org.example.behavioral.strategy.concretestrategy.Screwdriver;
import org.example.behavioral.strategy.concretestrategy.Wrench;

public class Main {

    public static void main(String[] args) {

        // Create robot
        Robot robot = new Robot();

        // Setup robot to use a tool and do some work with robot
        robot.setTool(new Screwdriver());
        robot.work();

        robot.setTool(new Wrench());
        robot.work();
    }

}
