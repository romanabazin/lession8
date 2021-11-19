public class Human implements Moving, Competitors {
    private int lenght1;
    private int height1;

    public Human(int lenght, int height){
        this.lenght1 = lenght;
        this.height1 = height;
    }

    public void run(){
        System.out.println("Человек умеет бегать.");
    }

    public void jump(){
        System.out.println("Человек умеет прыгать.");
    }

    @Override
    public Moving runs(Treadmill treadmill) {
        if( lenght1 > 1000) {
            System.out.println("Человек не может столько пробежать.");
        } else System.out.println("Человек успешно пробежал.");
        return null;
    }

    @Override
    public Moving jumps(Wall wall) {
        if( lenght1 > 3) {
            System.out.println("Человек не может так высоко прыгнуть.");
        } else System.out.println("Человек успешно прыгнул.");
        return null;
    }
}
