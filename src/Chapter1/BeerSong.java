package Chapter1;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "beer";
        while (beerNum>0){
            if (beerNum ==1){
                word = "b";
            }
            System.out.println(beerNum+" " + word + " beer in table");
            System.out.println(beerNum+" " + word + " beer ");
            System.out.println(beerNum+" " + word + " one");
            System.out.println(beerNum+" " + word + " go");
            beerNum --;
            if (beerNum >0){
                System.out.println(beerNum+" " + word + " beer in table");
            }else {
                System.out.println(" no beer in table");
            }
        }
    }
}
