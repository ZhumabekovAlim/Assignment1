import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please choose a type of player: \n 1 - Football Player \n 2 - Basketball Player");
        int type = Integer.parseInt(scan.next());

        PlayerFactory playerFactory = whichType(type);
        Player player = playerFactory.createPlayer();
        player.ball();

    }

    static PlayerFactory whichType(int type){
        if(type == 1){
            return new FootballPlayerFactory();
        }else if(type == 2){
            return new BasketballPlayerFactory();
        }else{
            throw new RuntimeException("Choose correct type of players");
        }
    }

}