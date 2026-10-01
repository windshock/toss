package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.sya;
import com.bytedance.adsdk.ugeno.lud.fby;
import com.bytedance.adsdk.ugeno.lud.jc;
import com.bytedance.adsdk.ugeno.lud.lud;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private static volatile lt ycx;
    private zb dj;
    private com.bytedance.adsdk.ugeno.core.ycx.ycx fby;
    private com.bytedance.adsdk.ugeno.dj.ycx lt;
    private ycx lud;
    private sya sya;
    private com.bytedance.adsdk.ugeno.core.zb.dj ul;
    private List<com.bytedance.adsdk.ugeno.core.zb> zb;

    public static lt ycx() {
        if (ycx == null) {
            synchronized (lt.class) {
                if (ycx == null) {
                    ycx = new lt();
                }
            }
        }
        return ycx;
    }

    private lt() {
    }

    public void ycx(Context context, sya syaVar, zb zbVar) {
        this.sya = syaVar;
        this.dj = zbVar;
        ul();
    }

    public zb zb() {
        return this.dj;
    }

    private void ul() {
        ArrayList arrayList = new ArrayList();
        this.zb = arrayList;
        sya syaVar = this.sya;
        if (syaVar != null) {
            arrayList.addAll(syaVar.ycx());
        }
        com.bytedance.adsdk.ugeno.core.dj.ycx(this.zb);
    }

    public void ycx(com.bytedance.adsdk.ugeno.dj.ycx ycxVar) {
        this.lt = ycxVar;
    }

    public com.bytedance.adsdk.ugeno.dj.ycx sya() {
        return this.lt;
    }

    public void ycx(fby fbyVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.lud.ycx().ycx());
        if (fbyVar != null) {
            arrayList.addAll(fbyVar.ycx());
        }
        jc.ycx(arrayList);
    }

    public void ycx(com.bytedance.adsdk.ugeno.lud.sya syaVar) {
        ArrayList arrayList = new ArrayList(new lud().ycx());
        if (syaVar != null) {
            arrayList.addAll(syaVar.ycx());
        }
        com.bytedance.adsdk.ugeno.lud.dj.ycx(arrayList);
    }

    public void ycx(ycx ycxVar) {
        this.lud = ycxVar;
    }

    public ycx dj() {
        return this.lud;
    }

    public com.bytedance.adsdk.ugeno.core.zb.dj lud() {
        return this.ul;
    }

    public com.bytedance.adsdk.ugeno.core.ycx.ycx lt() {
        return this.fby;
    }
}
