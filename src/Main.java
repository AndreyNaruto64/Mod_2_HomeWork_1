import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random= new Random();

        Actions[] actions = new Actions[3];

        int distance = random.nextInt(20);
        int height = random.nextInt(2);
        actions[0]= new Human("Петя",distance,height);

        distance = random.nextInt(50);
        height = random.nextInt(20);
        actions[1]=new Cat("Мурзик",distance,height);

        distance = random.nextInt(100);
        height = random.nextInt(100);
        actions[2] =  new Robot("Альтрон",distance,height);

        Obstacle[] obstacles = new Obstacle[4];

        boolean isTreadmill;
        for (int i = 0; i < obstacles.length; i++) {
            distance = random.nextInt(20);
            isTreadmill = random.nextBoolean();
            if (isTreadmill){
                obstacles[i]=new Treadmill(distance);
            }else{
                obstacles[i]=new Wall(distance);
            }
        }
        for (int i = 0; i < actions.length; i++) {
            boolean resultat = true;
            for (int j = 0; j < obstacles.length; j++) {
                resultat = obstacles[j].moving(actions[i]);
                if(!resultat){
                    break;
                }

            }
            if (resultat){
                System.out.println("Ура !)");
            }else{
                System.out.println("Печалька :(");
            }

        }
    }
}
