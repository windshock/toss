package com.bytedance.adsdk.ugeno.ycx;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private com.bytedance.adsdk.ugeno.zb.sya dj;
    private Context sya;
    private List<sya> ycx;
    private List<ycx> zb;

    public lt(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, List<sya> list) {
        this.dj = syaVar;
        this.sya = context;
        this.ycx = list;
        dj();
    }

    private void dj() {
        this.zb = new ArrayList();
        List<sya> list = this.ycx;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.ycx.size(); i2++) {
            sya syaVar = this.ycx.get(i2);
            if (syaVar != null) {
                this.zb.add(new ycx(this.sya, this.dj, syaVar));
            }
        }
    }

    public void ycx() throws Throwable {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.dj();
            }
        }
    }

    public void zb() {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.ycx();
            }
        }
    }

    public void sya() {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.sya();
            }
        }
    }

    public void ycx(Canvas canvas) {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.ycx(canvas);
            }
        }
    }

    public void zb(Canvas canvas) {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.zb(canvas);
            }
        }
    }

    public void ycx(int i2, int i3) {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null) {
                ycxVar.ycx(i2, i3);
            }
        }
    }

    public ycx ycx(String str) {
        List<ycx> list = this.zb;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ycx ycxVar : this.zb) {
            if (ycxVar != null && TextUtils.equals(ycxVar.lud(), str)) {
                return ycxVar;
            }
        }
        return null;
    }
}
