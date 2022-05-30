package team.participant;

import team.participant.Participant;

public class Cat implements Participant {
    static boolean isPassed;
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
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

    public boolean isPassed() {
        return isPassed;
    }

    public static void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public void run() {
        System.out.println(name + " running...");
    }

    @Override
    public void jump() {
        System.out.println(name + " jumping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
