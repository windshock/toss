package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private final List<thx> ycx = new ArrayList();

    void ycx(thx thxVar) {
        this.ycx.add(thxVar);
    }

    public void ycx(Path path) {
        for (int size = this.ycx.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.zb.lt.lt.ycx(path, this.ycx.get(size));
        }
    }
}
