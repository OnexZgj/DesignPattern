package com.onexzgj.android.httpdl;

public class HttpProxy implements Ihttp {


    private void HttpProxy() {}

    public static HttpProxy mInstance;

    public static HttpProxy getInstance() {
        if (mInstance == null) {
            synchronized (HttpProxy.class) {
                if (mInstance == null)
                    mInstance = new HttpProxy();
            }
        }
        return mInstance;

    }


    private Ihttp mModle;

    public void setHttpModle(Ihttp modle) {
        this.mModle = modle;
    }


    @Override
    public void get(String url) {
        mModle.get(url);
    }

    @Override
    public void post(String url, String params) {
        mModle.post(url, params);
    }
}
