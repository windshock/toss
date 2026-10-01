package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ok;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.bytedance.adsdk.ugeno.zb.sya;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends com.bytedance.adsdk.ugeno.zb.ycx<com.bytedance.adsdk.ugeno.ul.zb> {
    private String ci;
    private sya ff;
    private float kh;
    private int liq;
    private float mue;
    private boolean nc;
    private float pg;
    private String qt;
    private boolean sp;
    private boolean te;
    private int tpg;
    private float vbt;
    private float vy;
    private JSONArray yw;
    private float yyc;

    public void ycx(JSONObject jSONObject) {
    }

    public dj(Context context) {
        super(context);
        this.te = true;
        this.nc = true;
        this.vbt = 0.0f;
        this.pg = 2000.0f;
        this.ci = "normal";
        this.sp = true;
        this.tpg = Color.parseColor("#666666");
        this.liq = Color.parseColor("#ffffff");
    }

    public View ycx() {
        com.bytedance.adsdk.ugeno.ul.zb zbVar = new com.bytedance.adsdk.ugeno.ul.zb(((sya) this).zb);
        ((sya) this).lud = zbVar;
        zbVar.ycx((lud) this);
        return ((sya) this).lud;
    }

    public void ycx(com.bytedance.adsdk.ugeno.ul.sya syaVar) {
        View view = ((sya) this).lud;
        if (view != null) {
            ((com.bytedance.adsdk.ugeno.ul.zb) view).setOnPageChangeListener(syaVar);
        }
    }

    public void ycx(int i2) throws Resources.NotFoundException {
        View view = ((sya) this).lud;
        if (view != null) {
            ((com.bytedance.adsdk.ugeno.ul.zb) view).xkz(i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zb.ycx
    public void zb() throws JSONException, Resources.NotFoundException {
        super.zb();
        JSONArray jSONArray = this.yw;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ul.zb) ((sya) this).lud).fby((int) this.yyc).jw((int) this.mue).jc((int) this.kh).sya(this.sp).lt(this.liq).ul(this.tpg).sya(this.ci).dj(this.te).lud(this.vy).ycx(this.nc).dj((int) this.pg).sya(this.sp);
        for (int i2 = 0; i2 < this.yw.length(); i2++) {
            ok okVar = new ok(((sya) this).zb);
            okVar.ycx(((sya) this).py);
            sya<View> syaVarZb = okVar.zb(this.ff.rmf(), (sya<View>) null);
            okVar.zb(this.yw.optJSONObject(i2));
            ((com.bytedance.adsdk.ugeno.ul.zb) ((sya) this).lud).ycx((com.bytedance.adsdk.ugeno.ul.zb) syaVarZb);
        }
        if (this.nc) {
            ((com.bytedance.adsdk.ugeno.ul.zb) ((sya) this).lud).sya();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zb.ycx
    public void ycx(sya syaVar) {
        this.ff = syaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(String str, String str2) {
        super.ycx(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        switch (str) {
            case "delayStart":
                this.vbt = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 0.0f);
                break;
            case "indicatorColor":
                this.tpg = com.bytedance.adsdk.ugeno.fby.ycx.ycx(str2);
                break;
            case "nextMargin":
                this.kh = fby.ycx(((sya) this).zb, com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 0.0f));
                break;
            case "effect":
                this.ci = str2;
                break;
            case "direction":
                this.qt = str2;
                break;
            case "indicator":
                this.sp = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, true);
                break;
            case "previousMargin":
                this.mue = fby.ycx(((sya) this).zb, com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 0.0f));
                break;
            case "loop":
                this.te = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, true);
                break;
            case "speed":
                this.pg = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 500.0f);
                break;
            case "pageCount":
                this.vy = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 1.0f);
                break;
            case "pageMargin":
                this.yyc = fby.ycx(((sya) this).zb, com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.liq = com.bytedance.adsdk.ugeno.fby.ycx.ycx(str2);
                break;
            case "autoplay":
                this.nc = com.bytedance.adsdk.ugeno.fby.sya.ycx(str2, true);
                break;
            case "dataList":
                this.yw = com.bytedance.adsdk.ugeno.fby.zb.ycx(((sya) this).dj, str2, null);
                break;
        }
    }
}
