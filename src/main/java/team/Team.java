package team;

import team.participant.Participant;

public class Team {
    private Participant[] participants;

    public Team(Participant... participants) {
        this.participants = participants;
    }

    public Participant[] getParticipant() {
        return participants;
    }
}
