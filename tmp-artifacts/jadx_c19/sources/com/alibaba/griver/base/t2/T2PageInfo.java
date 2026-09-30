package com.alibaba.griver.base.t2;

import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class T2PageInfo {
    public boolean a;
    public boolean b;
    public AtomicBoolean mIsRunning = new AtomicBoolean();
    public Map<String, SendToRenderCallback> c = new HashMap();
    public List<String> d = new ArrayList();
    public List<String> e = new ArrayList();
    public boolean f = false;

    public T2PageInfo(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public void clearCallbacks() {
        this.c.clear();
    }

    public List<String> getInjectUrls() {
        return this.e;
    }

    public List<String> getPreInjectUrls() {
        return this.d;
    }

    public boolean hasInjectPreload() {
        return this.f;
    }

    public boolean isPageT2Switch() {
        return this.a;
    }

    public boolean isWaiting() {
        return this.b;
    }

    public void putRenderCallback(String str, SendToRenderCallback sendToRenderCallback) {
        if (this.c.size() > 10) {
            this.c.clear();
        }
        this.c.put(str, sendToRenderCallback);
    }

    public void setHasInjectPreload(boolean z) {
        this.f = z;
    }

    public void setPageT2Switch(boolean z) {
        this.a = z;
    }

    public void setWaiting(boolean z) {
        this.b = z;
    }

    public SendToRenderCallback takeRenderCallback(String str) {
        return this.c.remove(str);
    }

    public String toString() {
        return "T2PageInfo{mPageT2Switch=" + this.a + ", mWaiting=" + this.b + ", mCallbacks=" + this.c + ", preInjectUrlsSize=" + this.d.size() + ", injectUrlsSize" + this.e.size() + ", hasInjectPreload=" + this.f + '}';
    }
}
