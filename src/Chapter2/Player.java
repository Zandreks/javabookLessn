package Chapter2;

public class Player {
    public int number;

    public void guess(){
        this.number = (int) (Math.random() *10);
        System.out.println("Я думаю что это число "+ this.number);
    }
}
