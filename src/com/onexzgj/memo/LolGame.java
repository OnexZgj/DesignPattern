package com.onexzgj.memo;

/**
 * 需要备忘的角色
 */
public class LolGame {

    private String userId;
    private int progress = 0;
    private String monemy;
    private Memoto mMemoto;

    public void play() {

        userId = getUserId();
        ++progress;
        System.out.println("开始玩游戏了...");
        System.out.println("--- userId: " + userId + " --- progress: " +progress+ " ---");

    }

    /**
     * 退出游戏
     */
    public void quit(){
        System.out.println("退出游戏了...");
    }


    /**
     * 创建备忘录对象
     *
     * @return
     */
    public Memoto createMemoto() {
        mMemoto = new Memoto();
        mMemoto.userId = userId;
        mMemoto.progress = progress;
        return mMemoto;
    }

    /**
     * 恢复备忘录
     */
    public void restoreMemoto(Memoto memoto) {
        this.userId = memoto.userId;
        this.progress = memoto.progress;
        System.out.println("----恢复备忘录----");
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

}
