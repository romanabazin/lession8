public class Cat implements Moving, Competitors{
    private int lenght1;
    private int height1;

    public Cat(int lenght, int height){
        this.lenght1 = lenght;
        this.height1 = height;
    }

    public void run(){
        System.out.println("Кот умеет бегать.");
    }

    public void jump(){
        System.out.println("Кот умеет прыгать.");
    }

    @Override
    public Moving runs(Treadmill treadmill) {
        if( lenght1 > 100) {
            System.out.println("Кот не может столько пробежать.");
        } else System.out.println("Кот успешно пробежал.");
        return null;
    }

    @Override
    public Moving jumps(Wall wall) {
        if( lenght1 > 1) {
            System.out.println("Кот не может так высоко прыгнуть.");
        } else System.out.println("Кот успешно прыгнул.");
        return null;
    }
}
