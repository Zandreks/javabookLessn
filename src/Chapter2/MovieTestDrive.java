package Chapter2;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.title = "t";
        movieOne.genre = "c";
        movieOne.rating = -3;

        Movie movieTwo = new Movie();
        movieTwo.title = "You name";
        movieTwo.genre = "Rom";
        movieTwo.rating = 10;
        movieTwo.playIt();

        Movie movieThree = new Movie();
        movieThree.title = "t";
        movieThree.genre = "c";
        movieThree.rating = -3;
    }
}
