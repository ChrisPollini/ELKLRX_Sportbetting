package sportbetting;

import database.Database;
import exception.TerminateAppExcpetion;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.SportBettingSerivce;
import view.View;

public class Main {

    public static void main(String[] args) {
        App app = new App(new SportBettingSerivce(new Database()), new View());
        app.play();
    }
}
