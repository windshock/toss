package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import com.bytedance.adsdk.ugeno.lud.ycx.ycx;
import com.bytedance.adsdk.ugeno.lud.ycx.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends sya implements com.bytedance.adsdk.ugeno.lud.ycx.dj {
    private com.bytedance.adsdk.ugeno.lud.ycx.sya ea;

    public dj(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    public boolean ycx(Object... objArr) {
        ycx ycxVarNji = this.zb.nji();
        if (ycxVarNji == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.lud.ycx.sya syaVarYcx = ycxVarNji.ycx(this.lt);
        this.ea = syaVarYcx;
        if (syaVarYcx != null) {
            syaVarYcx.ycx(this);
            return false;
        }
        ycxVarNji.ycx(this.lt, new zb());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.lud.ycx.dj
    public void ycx(String str) {
        this.ycx.ycx(this.zb, this.lt, this.sya.zb(), this.sya);
    }
}
