public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }



    @Override
    public void run() {
        System.out.println(name + " ����� ��������� " + this.getRunDistance()+" ��");
    }

    @Override
    public void jump() {
        System.out.println(name + " ����� ��������  " + this.getJumpHeight()+" � � ������");

    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

}