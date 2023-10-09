public class FootballPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new FootballPlayer();
    }
}
