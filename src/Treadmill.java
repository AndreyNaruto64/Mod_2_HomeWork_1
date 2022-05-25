public class Treadmill extends Obstacle {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("Дистанция " + length+ " км");
        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал");
            return true;
        } else {
            System.out.println("Не добежал, упал");
            return false;
        }

    }

}
