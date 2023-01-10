public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.changeStatus();
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }
}