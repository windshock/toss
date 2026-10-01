package com.alibaba.ariver.engine.api.bridge.model;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LoadParams {
    public boolean forceLoad;
    public boolean isFirstLoad;
    public boolean isReload;
    public String url;

    public LoadParams() {
    }

    public LoadParams(LoadParams loadParams) {
        this.url = loadParams.url;
        this.isFirstLoad = loadParams.isFirstLoad;
        this.isReload = loadParams.isReload;
        this.forceLoad = loadParams.forceLoad;
    }

    public String toString() {
        return "LoadParams{url=" + this.url + '}';
    }
}
