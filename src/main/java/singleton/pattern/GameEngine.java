package singleton.pattern;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {
    }

    public void run() {
        while (true) {
            // czekamy na input gracza
            // zmieniamy stan gry
            // renderujemy grafikę
        }
    }

    public static  GameEngine getInstance() {
        if (instance == null) {
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }
}
