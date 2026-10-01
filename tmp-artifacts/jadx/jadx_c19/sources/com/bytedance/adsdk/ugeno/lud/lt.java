package com.bytedance.adsdk.ugeno.lud;

import com.bytedance.adsdk.ugeno.fby.sya;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private ycx ycx;
    private List<ycx> zb;
    private boolean sya = false;
    private int dj = 0;

    public ycx ycx() {
        return this.ycx;
    }

    public List<ycx> zb() {
        return this.zb;
    }

    public boolean sya() {
        return this.sya;
    }

    public int dj() {
        return this.dj;
    }

    public static class ycx {
        private String dj;
        private Map<String, Object> lt;
        private Map<String, Object> lud;
        private String sya = "global";
        private String ycx;
        private String zb;

        public String ycx() {
            return this.sya;
        }

        public void ycx(String str) {
            this.sya = str;
        }

        public String zb() {
            return this.dj;
        }

        public void zb(String str) {
            this.dj = str;
        }

        public Map<String, Object> sya() {
            return this.lud;
        }

        public void ycx(Map<String, Object> map) {
            this.lud = map;
        }

        public void sya(String str) {
            this.ycx = str;
        }

        public String dj() {
            return this.ycx;
        }

        public void dj(String str) {
            this.zb = str;
        }

        public String lud() {
            return this.zb;
        }

        public void zb(Map<String, Object> map) {
            this.lt = map;
        }

        public String toString() {
            return "Action{scheme='" + this.sya + "', name='" + this.dj + "', params=" + this.lud + ", host='" + this.zb + "', origin='" + this.ycx + "', extra=" + this.lt + '}';
        }
    }

    public static lt ycx(JSONObject jSONObject, JSONObject jSONObject2) {
        ycx ycxVarYcx;
        ycx ycxVarYcx2;
        if (jSONObject == null) {
            return null;
        }
        lt ltVar = new lt();
        Object objOpt = jSONObject.opt("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        if (objOpt instanceof String) {
            ycxVarYcx = ok.ycx((String) objOpt, jSONObject2);
        } else {
            ycxVarYcx = objOpt instanceof JSONObject ? ok.ycx((JSONObject) objOpt, jSONObject2) : null;
        }
        if (ycxVarYcx != null) {
            ltVar.ycx = ycxVarYcx;
        }
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            Object objOpt2 = jSONArrayOptJSONArray.opt(i2);
            if (objOpt2 instanceof String) {
                ycx ycxVarYcx3 = ok.ycx((String) objOpt2, jSONObject2);
                if (ycxVarYcx3 != null) {
                    arrayList.add(ycxVarYcx3);
                }
            } else if ((objOpt2 instanceof JSONObject) && (ycxVarYcx2 = ok.ycx((JSONObject) objOpt2, jSONObject2)) != null) {
                arrayList.add(ycxVarYcx2);
            }
        }
        ltVar.zb = arrayList;
        if (jSONObject.has("delay")) {
            ltVar.dj = sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("delay"), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            ltVar.sya = sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("disable"), jSONObject2), false);
        }
        return ltVar;
    }
}
