package team;

import team.participant.Participant;

import java.util.Arrays;

public class Team {
    private Participant[] participants;

    public Team(Participant... participants) {
        this.participants = participants;
    }

    public Participant[] getParticipant() {
        return participants;
    }

    public void showAllInfo() {
        System.out.println("Overall info");
        System.out.println(Arrays.toString(participants));
    }

    public void showPassedInfo() {
        System.out.println("Passed only info");
        for (int i = 0; i < participants.length; i++) {
            if (participants[i].isPassed()) {
                System.out.println(participants[i]);
            }
        }
    }
}
