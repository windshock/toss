package com.bytedance.adsdk.ugeno.ycx;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private String dj;
    private String fby;
    private JSONObject jc;
    private int jw = 1;
    private ycx lt;
    private long lud;
    private int sya;
    private String ul;
    private Map<String, TreeMap<Float, String>> ycx;
    private long zb;

    public static class ycx {
        public String ycx;
        public String zb;
    }

    public JSONObject ycx() {
        return this.jc;
    }

    public void ycx(JSONObject jSONObject) {
        this.jc = jSONObject;
    }

    public Map<String, TreeMap<Float, String>> zb() {
        return this.ycx;
    }

    public void ycx(Map<String, TreeMap<Float, String>> map) {
        this.ycx = map;
    }

    public long sya() {
        return this.zb;
    }

    public void ycx(long j) {
        this.zb = j;
    }

    public int dj() {
        return this.sya;
    }

    public void ycx(int i2) {
        this.sya = i2;
    }

    public String lud() {
        return this.dj;
    }

    public void ycx(String str) {
        this.dj = str;
    }

    public long lt() {
        return this.lud;
    }

    public void zb(long j) {
        this.lud = j;
    }

    public ycx ul() {
        return this.lt;
    }

    public void ycx(ycx ycxVar) {
        this.lt = ycxVar;
    }

    public String fby() {
        return this.ul;
    }

    public void zb(String str) {
        this.ul = str;
    }

    public String jw() {
        return this.fby;
    }

    public void sya(String str) {
        this.fby = str;
    }

    public int jc() {
        return this.jw;
    }

    public void zb(int i2) {
        this.jw = i2;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.ycx + ", mDuration=" + this.zb + ", mPlayCount=" + this.sya + ", mPlayDirection=" + this.dj + ", mDelay=" + this.lud + ", mName=" + this.fby + ", mPlayState=" + this.jw + ", mTransformOrigin='" + this.lt + "', mTimingFunction='" + this.ul + "'}";
    }
}
