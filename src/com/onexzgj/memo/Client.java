package com.onexzgj.memo;

/**
 * 玩家玩游戏
 */
public class Client {
    public static void main(String[] args) {
        LolGame player = new LolGame();
        player.setUserId("onex");
        player.play();

        Caretaker caretaker =new Caretaker();
        caretaker.saveMemoto(player.createMemoto());

        player.quit();

        player = new LolGame();

        player.restoreMemoto(caretaker.getMemoto());
        player.play();

    }
}
