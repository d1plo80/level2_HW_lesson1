import course.Course;
import course.obstacle.RunningTrack;
import course.obstacle.Wall;
import team.Team;
import team.participant.Cat;
import team.participant.Human;
import team.participant.Participant;
import team.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Course[] courses = {new RunningTrack(), new Wall()};
        Team team = new Team(new Cat("Барсик", 100, 200), new Robot("Neo", 200, 200), new Human("Gleb", 100, 100));

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i].getClass().getName());
            courses[i].doIt(team);
            team.showAllInfo();
            team.showPassedInfo();
        }
    }
}
