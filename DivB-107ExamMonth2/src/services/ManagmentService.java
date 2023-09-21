package services;

import utils.InputUtil;
import utils.MenuUtil;

public class ManagmentService {

    private GameService gameService;

    public ManagmentService() {
        gameService = new GameService();
    }

    public void manage() {


        while (true) {
            int options = MenuUtil.showMenu();
            switch (options) {

                case 1:
                    gameService.start();
                    break;
                case 2:
                    gameService.addWord();
                    break;
                case 3:
                    gameService.seeHistory();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
