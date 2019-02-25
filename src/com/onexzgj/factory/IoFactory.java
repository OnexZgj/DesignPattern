package com.onexzgj.factory;

public class IoFactory extends AbastractIoFactory {

    @Override
    public  <T extends IoHandler> T getIoHandler(Class<T> clazz) {
        IoHandler handler = null;

        try {
            handler = (IoHandler) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) handler;

    }
}
