package team.participant;

import team.participant.Participant;

public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public void run() {
        System.out.println(name + " running...");

    }

    @Override
    public void jump() {
        System.out.println(name + " jumping");
    }

}
