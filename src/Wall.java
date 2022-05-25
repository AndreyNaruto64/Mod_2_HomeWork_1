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
        System.out.println("������ �����������  " + height +" �");
        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("�����������");
            return true;
        } else {
            System.out.println("�� �����������, ����");
            return false;
        }
    }
}
