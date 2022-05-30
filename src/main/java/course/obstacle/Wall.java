package course.obstacle;

import course.AbstractCourse;
import team.participant.Participant;

public class Wall extends AbstractCourse {
    private int height = 100;

    @Override
    protected void doIt(Participant participant) {
        Participant.setPassed(participant.getMaxJumpHeight() >= height);

    }
}
