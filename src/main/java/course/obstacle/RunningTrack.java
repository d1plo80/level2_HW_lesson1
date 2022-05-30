package course.obstacle;

import course.AbstractCourse;
import team.Team;
import team.participant.Participant;

public class RunningTrack extends AbstractCourse {
    private int distance = 100;

    @Override
    protected void doIt(Participant participant) {
        Participant.setPassed(participant.getMaxRunDistance() >= distance);
    }
}
