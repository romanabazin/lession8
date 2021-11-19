import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        Human human1 = new Human(2000, 4);
        Cat cat1 = new Cat(2000, 5);
        Robot robot1 = new Robot(5000,1000);
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        human1.run();
        human1.jump();
        cat1.run();
        cat1.jump();
        robot1.run();
        robot1.jump();

        Moving [][] start = {
                {human1.runs(treadmill),human1.jumps(wall)},
                {cat1.runs(treadmill),cat1.jumps(wall)},
                {robot1.runs(treadmill),robot1.jumps(wall)},
        };

        Competitors [] competitors = {
                new Human(10,10),
                new Cat(10,10),
                new Robot(10,10),
        };
        Let [] let = {
                new Treadmill(),
                new Wall(),
        };
        for (int i = 0;  i < competitors.length; i++) {
            human1.runs(treadmill);
        }
    }
}
