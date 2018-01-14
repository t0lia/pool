package com.t0lia.design_pattern.III_behavioral.command;

import com.t0lia.design_pattern.III_behavioral.command.data.Car;

import java.util.HashMap;
import java.util.LinkedList;

import static java.util.Arrays.stream;

public class SelfDriver {

    private static final Runnable DO_NOTHING = () -> {
    };

    public static final String UP_GEAR = "levelUp";
    public static final String LW_GEAR = "levelDown";
    public static final String ACCELERATE = "accelerate";
    public static final String BRACKETS = "brackets";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String INC_SPEED = "increaseSpeed";
    public static final String DEC_SPEED = "decreaseSpeed";
    public static final String START = "start";
    public static final String STOP = "stop";
    public static final String START_ENGINE = "startEngine";
    public static final String STOP_ENGINE = "stopEngine";
    public static final String START_MOVING = "startMoving";
    public static final String STOP_MOVING = "stopMoving";
    public static final String START_MOVING_BACK = "startMovingBack";
    public static final String STOP_MOVING_BACK = "stopMovingBack";
    public static final String TURN_BACK = "turnBack";
    public static final String PARALLEL_PARKING = "parallelParking";
    public static final String BOX_PARKING = "boxParking";
    public static final String FROM_PARALLEL_PARKING = "fromParallelParking";
    public static final String SNAKE = "snake";

    private HashMap<String, Runnable> commands;
    private LinkedList<Runnable> history;

    private Runnable macro(String... strings) {
        return () -> stream(strings).map(commands::get).forEach(Runnable::run);
    }

    public SelfDriver(Car car) {
        commands = new HashMap<>();
        history = new LinkedList<>();

        // register primitive commands
        commands.put(UP_GEAR, hst(car::upperGear));
        commands.put(LW_GEAR, hst(car::lowerGear));
        commands.put(ACCELERATE, hst(car::pressAccelerate));
        commands.put(BRACKETS, hst(car::pressBrackets));
        commands.put(LEFT, hst(car::rotateWheelLeft));
        commands.put(RIGHT, hst(car::rotateWheelRight));
        commands.put(START_ENGINE, hst(car::startEngine));
        commands.put(STOP_ENGINE, hst(car::stopEngine));
        commands.put(START, hst(car::start));
        commands.put(STOP, hst(car::stop));

        // register macro commands
        commands.put(INC_SPEED, macro(UP_GEAR, ACCELERATE));
        commands.put(DEC_SPEED, macro(BRACKETS, LW_GEAR));
        commands.put(START_MOVING, macro(START, INC_SPEED));
        commands.put(STOP_MOVING, macro(DEC_SPEED, STOP));
        commands.put(START_MOVING_BACK, macro(START, LW_GEAR, ACCELERATE));
        commands.put(STOP_MOVING_BACK, macro(BRACKETS, UP_GEAR, STOP));

        // register bottom layer commands
        commands.put(TURN_BACK, macro(START_MOVING, LEFT, LEFT, STOP_MOVING));
        commands.put(PARALLEL_PARKING, macro(START_MOVING_BACK, RIGHT, LEFT, STOP_MOVING_BACK));
        commands.put(BOX_PARKING, macro(START_MOVING, LEFT, STOP_MOVING, RIGHT, START_MOVING_BACK, LEFT, STOP_MOVING_BACK));
        commands.put(FROM_PARALLEL_PARKING, macro(START_MOVING, LEFT, RIGHT, STOP_MOVING));
        commands.put(SNAKE, macro(START_MOVING, LEFT, RIGHT, RIGHT, LEFT, LEFT, RIGHT, RIGHT, LEFT, STOP_MOVING));
    }

    private Runnable hst(Runnable command) { return () -> { history.add(command); command.run(); }; }

    public void exec(String command) {
        commands.getOrDefault(command, DO_NOTHING).run();
    }

    public void repeatLast() {
        history.getLast().run();
    }

    public void repeatAll() {
        history.forEach(Runnable::run);
    }
}
