public class Squirrel extends Animal {
    public Squirrel(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run() {
        System.out.println("belka prigaet");

    }
}
