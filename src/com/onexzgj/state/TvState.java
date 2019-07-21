package com.onexzgj.state;

/**
 * 电视机的状态
 */
public interface TvState {
    /**
     * 调换下个节目
     */
    void nextChannel();

    /**
     * 调换上个节目
     */
    void preChannel();

    /**
     * 音量调大
     */
    void turnUp();

    /**
     * 音量调小
     */
    void turnDown();
}
