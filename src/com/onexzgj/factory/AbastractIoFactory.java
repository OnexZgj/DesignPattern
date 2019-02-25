package com.onexzgj.factory;

public abstract class AbastractIoFactory {

    public abstract  <T extends IoHandler> T getIoHandler(Class<T> clazz);
}
