package com.onexzgj.memo;

/**
 * 负责Memoto类的存储
 */
public class Caretaker {
    private Memoto mMemoto;

    /**
     * 存档
     * @param memoto 备忘录对象
     */
    public void saveMemoto(Memoto memoto){
        this.mMemoto=memoto;
    }


    public Memoto getMemoto(){
        return mMemoto;
    }



}
