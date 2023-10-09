public class BasketballPlayerFactory implements PlayerFactory{
    @Override
    public Player createPlayer() {
        return new BasketballPlayer();
    }
}
