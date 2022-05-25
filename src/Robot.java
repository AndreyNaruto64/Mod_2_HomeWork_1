public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public void run() {
        System.out.println(name + " может пробежать  " + this.getRunDistance()+" км");
    }

    @Override
    public void jump() {
        System.out.println(name + " может прыгнуть " + this.getJumpHeight()+" м в высоту");

    }
    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }


}
