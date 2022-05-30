import team.Team;
import team.participant.Cat;
import team.participant.Participant;
import team.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(new Cat("Барсик", 100, 200), new Robot("Neo", 200, 200));
        System.out.println(team);
        Participant participant1 = new Cat("Барсик", 100, 200);
        participant1.run();
    }
}
