public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("Высота препятствия  " + height +" м");
        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Перепрыгнул");
            return true;
        } else {
            System.out.println("Не перепрыгнул, упал");
            return false;
        }
    }
}
