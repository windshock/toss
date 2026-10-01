package com.alibaba.ariver.resource.api.models;

import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class T2PageInfo {
    private boolean hasInjectPreload;
    private List<String> injectUrls;
    private Map<String, SendToRenderCallback> mCallbacks;
    private boolean mPageT2Switch;
    private boolean mWaiting;
    private List<String> preInjectUrls;

    public T2PageInfo() {
        this.mCallbacks = new HashMap();
        this.preInjectUrls = new ArrayList();
        this.injectUrls = new ArrayList();
        this.hasInjectPreload = false;
        this.mPageT2Switch = false;
        this.mWaiting = false;
    }

    public T2PageInfo(boolean z, boolean z2) {
        this.mCallbacks = new HashMap();
        this.preInjectUrls = new ArrayList();
        this.injectUrls = new ArrayList();
        this.hasInjectPreload = false;
        this.mPageT2Switch = z;
        this.mWaiting = z2;
    }

    public boolean isPageT2Switch() {
        return this.mPageT2Switch;
    }

    public void setPageT2Switch(boolean z) {
        this.mPageT2Switch = z;
    }

    public boolean isWaiting() {
        return this.mWaiting;
    }

    public void setWaiting(boolean z) {
        this.mWaiting = z;
    }

    public void putRenderCallback(String str, SendToRenderCallback sendToRenderCallback) {
        if (this.mCallbacks.size() > 10) {
            this.mCallbacks.clear();
        }
        this.mCallbacks.put(str, sendToRenderCallback);
    }

    public SendToRenderCallback takeRenderCallback(String str) {
        return this.mCallbacks.remove(str);
    }

    public List<String> getInjectUrls() {
        return this.injectUrls;
    }

    public List<String> getPreInjectUrls() {
        return this.preInjectUrls;
    }

    public void clearCallbacks() {
        this.mCallbacks.clear();
    }

    public void setHasInjectPreload(boolean z) {
        this.hasInjectPreload = z;
    }

    public boolean hasInjectPreload() {
        return this.hasInjectPreload;
    }

    public String toString() {
        return "T2PageInfo{mPageT2Switch=" + this.mPageT2Switch + ", mWaiting=" + this.mWaiting + ", mCallbacks=" + this.mCallbacks + ", preInjectUrlsSize=" + this.preInjectUrls.size() + ", injectUrlsSize" + this.injectUrls.size() + ", hasInjectPreload=" + this.hasInjectPreload + '}';
    }
}
