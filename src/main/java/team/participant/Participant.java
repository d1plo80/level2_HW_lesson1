package team.participant;

import static team.participant.Cat.isPassed;

public interface Participant {
    void run();

    void jump();

    default int getMaxRunDistance(){
        return getMaxRunDistance();
    }

    default int getMaxJumpHeight(){
        return getMaxJumpHeight();
    }

    default boolean isPassed() {
        return isPassed;
    }

    static void setPassed(boolean passed) {
        isPassed = passed;
    }

}
