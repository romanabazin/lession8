public interface Moving {

    void run();
    void jump();

    Moving runs(Treadmill treadmill);
    Moving jumps(Wall wall);
}
