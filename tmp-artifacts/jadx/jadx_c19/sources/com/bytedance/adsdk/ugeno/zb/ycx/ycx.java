package com.bytedance.adsdk.ugeno.zb.ycx;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.bytedance.adsdk.ugeno.fby.ycx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private int dj;
    private int fby;
    private zb jw;
    private float lt;
    private ycx.C0005ycx lud;
    private int sya;
    private float ul;
    private ycx.C0005ycx ycx;
    private ycx.C0005ycx zb;

    public void ycx(String str) {
        if (com.bytedance.adsdk.ugeno.fby.ycx.sya(str)) {
            this.ycx = com.bytedance.adsdk.ugeno.fby.ycx.zb(str);
        }
    }

    public void zb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gradient", null);
            if (strOptString == null || !com.bytedance.adsdk.ugeno.fby.ycx.sya(strOptString)) {
                return;
            }
            this.zb = com.bytedance.adsdk.ugeno.fby.ycx.zb(strOptString);
            this.sya = jSONObject.optInt("duration", 2200);
            this.dj = jSONObject.optInt("playCount", -1);
        } catch (JSONException unused) {
        }
    }

    public void ycx(String str, Context context) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gradient", null);
            if (strOptString == null || !com.bytedance.adsdk.ugeno.fby.ycx.sya(strOptString)) {
                return;
            }
            this.lud = com.bytedance.adsdk.ugeno.fby.ycx.zb(strOptString);
            this.lt = fby.ycx(context, (float) jSONObject.optDouble("width", 76.0d));
            this.ul = (float) jSONObject.optDouble("opacity", 0.9d);
            this.fby = jSONObject.optInt("steps", 24);
        } catch (JSONException unused) {
        }
    }

    public boolean ycx() {
        return (this.ycx == null && this.zb == null) ? false : true;
    }

    public boolean zb() {
        return (this.ycx == null && this.zb == null && this.lud == null) ? false : true;
    }

    public void ycx(View view, Drawable drawable, float f, float[] fArr) {
        int[] iArr;
        float[] fArr2;
        float[] fArr3;
        boolean z = ycx() && f > 0.0f;
        ycx.C0005ycx c0005ycx = this.lud;
        boolean z2 = c0005ycx != null;
        if (!z && !z2) {
            this.jw = null;
            view.setBackground(drawable);
            return;
        }
        if (z) {
            ycx.C0005ycx c0005ycx2 = this.zb;
            if (c0005ycx2 != null) {
                iArr = c0005ycx2.zb;
                fArr3 = c0005ycx2.sya;
            } else {
                ycx.C0005ycx c0005ycx3 = this.ycx;
                iArr = c0005ycx3.zb;
                fArr3 = c0005ycx3.sya;
            }
            fArr2 = fArr3;
        } else {
            iArr = null;
            fArr2 = null;
        }
        zb zbVar = new zb(drawable, iArr, fArr2, f, fArr, this.zb != null, this.sya, this.dj, z2, this.lt, this.ul, this.fby, z2 ? c0005ycx.zb : null, z2 ? c0005ycx.sya : null);
        this.jw = zbVar;
        view.setBackground(zbVar);
    }

    public void sya() {
        zb zbVar = this.jw;
        if (zbVar == null || !zbVar.sya()) {
            return;
        }
        this.jw.ycx();
    }

    public void dj() {
        zb zbVar = this.jw;
        if (zbVar != null) {
            zbVar.zb();
        }
    }
}
