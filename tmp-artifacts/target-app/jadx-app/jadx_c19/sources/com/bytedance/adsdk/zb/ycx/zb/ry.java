package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.Path;
import com.bytedance.adsdk.zb.ycx.ycx.uh;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ry extends ycx<com.bytedance.adsdk.zb.sya.zb.xkz, Path> {
    private final com.bytedance.adsdk.zb.sya.zb.xkz dj;
    private List<uh> lt;
    private final Path lud;

    public ry(List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.xkz>> list) {
        super(list);
        this.dj = new com.bytedance.adsdk.zb.sya.zb.xkz();
        this.lud = new Path();
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public Path ycx(com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.xkz> ycxVar, float f) {
        this.dj.ycx(ycxVar.ycx, ycxVar.zb, f);
        com.bytedance.adsdk.zb.sya.zb.xkz xkzVarYcx = this.dj;
        List<uh> list = this.lt;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                xkzVarYcx = this.lt.get(size).ycx(xkzVarYcx);
            }
        }
        com.bytedance.adsdk.zb.lt.lud.ycx(xkzVarYcx, this.lud);
        return this.lud;
    }

    public void ycx(List<uh> list) {
        this.lt = list;
    }
}
