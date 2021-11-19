public class Robot implements Moving, Competitors{
    private int lenght1;
    private int height1;

    public Robot(int lenght, int height){
        this.lenght1 = lenght;
        this.height1 = height;
    }

    public void run(){
        System.out.println("Робот умеет бегать.");
    }

    public void jump(){
        System.out.println("Робот умеет прыгать.");
    }

    @Override
    public Moving runs(Treadmill treadmill) {
        if( lenght1 > 1000) {
            System.out.println("Робот не может столько пробежать.");
        } else System.out.println("Робот успешно пробежал.");
        return null;
    }

    @Override
    public Moving jumps(Wall wall) {
        if( height1 > 10) {
            System.out.println("Робот не может так высоко прыгнуть.");
        } else System.out.println("Робот успешно прыгнул.");
        return null;
    }
}
