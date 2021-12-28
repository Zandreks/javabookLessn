package Chapter2;

public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(){
        this.p1 = new Player();
        this.p2 = new Player();
        this.p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        System.out.println("Я загадываю число от 0 дл 9,,,");
        while (true){
            int targetNumber = (int) (Math.random() *10);
            System.out.println("Число которое нужно угадать - " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый думает что это число -" + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй думает что это число -" + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий думает что это число -" + guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true ;
            }
            if (guessp2 == targetNumber){
                p2isRight = true ;
            }
            if (guessp3 == targetNumber){
                p3isRight = true ;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("Есть победители");
                System.out.println("Первый "+p1isRight);
                System.out.println("Второй "+p2isRight);
                System.out.println("Третий "+p3isRight);
                break;
            }else {
                System.out.println("Еще раз");
            }
        }
    }
}
