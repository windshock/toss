package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.lud.lt;
import com.bytedance.adsdk.ugeno.lud.ul;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class sya {
    protected lt.ycx dj;
    protected String fby;
    protected Context jc;
    protected String jw;
    public String lt;
    public Map<String, Object> lud;
    public lt sya;
    protected String ul;
    public com.bytedance.adsdk.ugeno.lud.ea ycx;
    public com.bytedance.adsdk.ugeno.zb.sya zb;

    public abstract boolean ycx(Object... objArr);

    public sya(Context context) {
        this.jc = context;
    }

    public void sya() {
        this.dj = this.sya.ycx();
        lt ltVar = this.sya;
        if (ltVar != null) {
            lt.ycx ycxVarYcx = ltVar.ycx();
            this.dj = ycxVarYcx;
            if (ycxVarYcx == null) {
                return;
            }
            this.lud = ycxVarYcx.sya();
            this.lt = this.dj.zb();
            this.ul = this.dj.ycx();
            this.fby = this.dj.dj();
            this.jw = this.dj.lud();
        }
    }

    public String dj() {
        return this.lt;
    }

    public String lud() {
        return this.fby;
    }

    public String lt() {
        return this.jw;
    }

    public void ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar) {
        this.zb = syaVar;
    }

    public void ycx(lt ltVar) {
        this.sya = ltVar;
    }

    public lt ul() {
        return this.sya;
    }

    public void ycx(com.bytedance.adsdk.ugeno.lud.ea eaVar) {
        this.ycx = eaVar;
    }

    public static class ycx {
        public static sya ycx(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject, JSONObject jSONObject2) {
            lt ltVarYcx;
            lt.ycx ycxVarYcx;
            ul ulVarYcx;
            if (syaVar == null || jSONObject == null || (ltVarYcx = lt.ycx(jSONObject, jSONObject2)) == null || (ycxVarYcx = ltVarYcx.ycx()) == null) {
                return null;
            }
            String strYcx = ycxVarYcx.ycx();
            if (TextUtils.equals(strYcx, "custom")) {
                dj djVar = new dj(context);
                djVar.ycx(syaVar);
                djVar.ycx(ltVarYcx);
                djVar.sya();
                return djVar;
            }
            if (TextUtils.isEmpty(strYcx) || TextUtils.equals(strYcx, "global")) {
                ulVarYcx = com.bytedance.adsdk.ugeno.lud.jc.ycx(ycxVarYcx.zb());
            } else {
                ulVarYcx = com.bytedance.adsdk.ugeno.lud.jc.ycx(ycxVarYcx.lud());
            }
            if (ulVarYcx == null) {
                return null;
            }
            sya syaVarYcx = ulVarYcx.ycx(context);
            syaVarYcx.ycx(syaVar);
            syaVarYcx.ycx(ltVarYcx);
            syaVarYcx.sya();
            return syaVarYcx;
        }
    }
}
