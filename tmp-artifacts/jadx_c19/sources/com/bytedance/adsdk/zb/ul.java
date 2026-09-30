package com.bytedance.adsdk.zb;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul {
    private Map<String, jc> dj;
    private sya dy;
    private float ea;
    private LongSparseArray<com.bytedance.adsdk.zb.sya.sya.lud> fby;
    private Rect jc;
    private List<com.bytedance.adsdk.zb.sya.sya.lud> jw;
    private List<com.bytedance.adsdk.zb.sya.lt> lt;
    private Map<String, com.bytedance.adsdk.zb.sya.sya> lud;
    private float ok;
    private ycx pmi;
    private float ry;
    private Map<String, List<com.bytedance.adsdk.zb.sya.sya.lud>> sya;
    private zb uh;
    private SparseArray<com.bytedance.adsdk.zb.sya.dj> ul;
    private boolean xkz;
    private final pmi ycx = new pmi();
    private final HashSet<String> zb = new HashSet<>();
    private int syc = 0;
    private String wie = "";

    public static class sya {
        public String dj;
        public String lt;
        public int[] lud;
        public String sya;
        public JSONArray ul;
        public int ycx;
        public String zb;
    }

    public static class ycx {
        public int dj;
        public String lt;
        public int lud;
        public Map<String, Object> sya;
        public JSONArray ul;
        public int ycx;
        public Map<String, Object> zb;
    }

    public static class zb {
        public JSONArray sya;
        public String ycx;
        public int[][] zb;
    }

    public void ycx(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.zb.sya.sya.lud> list, LongSparseArray<com.bytedance.adsdk.zb.sya.sya.lud> longSparseArray, Map<String, List<com.bytedance.adsdk.zb.sya.sya.lud>> map, Map<String, jc> map2, SparseArray<com.bytedance.adsdk.zb.sya.dj> sparseArray, Map<String, com.bytedance.adsdk.zb.sya.sya> map3, List<com.bytedance.adsdk.zb.sya.lt> list2, sya syaVar, String str, ycx ycxVar, zb zbVar) {
        this.jc = rect;
        this.ea = f;
        this.ok = f2;
        this.ry = f3;
        this.jw = list;
        this.fby = longSparseArray;
        this.sya = map;
        this.dj = map2;
        this.ul = sparseArray;
        this.lud = map3;
        this.lt = list2;
        this.dy = syaVar;
        this.wie = str;
        this.pmi = ycxVar;
        this.uh = zbVar;
    }

    public void ycx(String str) {
        this.zb.add(str);
    }

    public void ycx(boolean z) {
        this.xkz = z;
    }

    public void ycx(int i2) {
        this.syc += i2;
    }

    public boolean ycx() {
        return this.xkz;
    }

    public int zb() {
        return this.syc;
    }

    public void zb(boolean z) {
        this.ycx.ycx(z);
    }

    public pmi sya() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.sya.lud ycx(long j) {
        return this.fby.get(j);
    }

    public Rect dj() {
        return this.jc;
    }

    public float lud() {
        return (long) ((wie() / this.ry) * 1000.0f);
    }

    public float lt() {
        return this.ea;
    }

    public float ul() {
        return this.ok;
    }

    public float ycx(float f) {
        return com.bytedance.adsdk.zb.lt.lud.ycx(this.ea, this.ok, f);
    }

    public sya fby() {
        return this.dy;
    }

    public String jw() {
        return this.wie;
    }

    public zb jc() {
        return this.uh;
    }

    public ycx ea() {
        return this.pmi;
    }

    public float ok() {
        return this.ry;
    }

    public List<com.bytedance.adsdk.zb.sya.sya.lud> ry() {
        return this.jw;
    }

    public List<com.bytedance.adsdk.zb.sya.sya.lud> zb(String str) {
        return this.sya.get(str);
    }

    public SparseArray<com.bytedance.adsdk.zb.sya.dj> xkz() {
        return this.ul;
    }

    public Map<String, com.bytedance.adsdk.zb.sya.sya> syc() {
        return this.lud;
    }

    public com.bytedance.adsdk.zb.sya.lt sya(String str) {
        int size = this.lt.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.bytedance.adsdk.zb.sya.lt ltVar = this.lt.get(i2);
            if (ltVar.ycx(str)) {
                return ltVar;
            }
        }
        return null;
    }

    public Map<String, jc> dy() {
        return this.dj;
    }

    public float wie() {
        return this.ok - this.ea;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.zb.sya.sya.lud> it = this.jw.iterator();
        while (it.hasNext()) {
            sb.append(it.next().ycx("\t"));
        }
        return sb.toString();
    }
}
