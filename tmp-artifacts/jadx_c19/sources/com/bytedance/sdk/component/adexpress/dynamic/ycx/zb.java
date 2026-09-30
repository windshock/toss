package com.bytedance.sdk.component.adexpress.dynamic.ycx;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dj;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aeu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.av;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bhi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dy;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ea;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.htf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ok;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oty;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pmi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sya;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.syc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.thx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tru;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wie;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wwx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xkz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xz;
import com.bytedance.sdk.component.adexpress.zb.ry;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public static lud ycx(Context context, DynamicRootView dynamicRootView, fby fbyVar) {
        ry renderRequest;
        if (context == null || dynamicRootView == null || fbyVar == null || fbyVar.jc() == null) {
            return null;
        }
        switch (fbyVar.jc().ycx()) {
            case -1:
                return new rmf(context, dynamicRootView, fbyVar);
            case 0:
                return new oty(context, dynamicRootView, fbyVar);
            case 1:
                return new ea(context, dynamicRootView, fbyVar);
            case 2:
                return new ul(context, dynamicRootView, fbyVar);
            case 3:
                return new jw(context, dynamicRootView, fbyVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ry(context, dynamicRootView, fbyVar);
            case 5:
                return new xkz(context, dynamicRootView, fbyVar);
            case 6:
            case 9:
            case 17:
                return new lt(context, dynamicRootView, fbyVar);
            case 7:
                return new xz(context, dynamicRootView, fbyVar);
            case 8:
                return new pmi(context, dynamicRootView, fbyVar);
            case 10:
                return new dy(context, dynamicRootView, fbyVar);
            case 11:
                return new dv(context, dynamicRootView, fbyVar);
            case 12:
                return new jc(context, dynamicRootView, fbyVar);
            case 13:
                return new hf(context, dynamicRootView, fbyVar);
            case 14:
                return new tru(context, dynamicRootView, fbyVar);
            case 15:
                if (dj.zb()) {
                    return new bhi(context, dynamicRootView, fbyVar);
                }
                return new av(context, dynamicRootView, fbyVar);
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return new ea(context, dynamicRootView, fbyVar);
            case 18:
                return new tn(context, dynamicRootView, fbyVar);
            case 19:
                return new wwx(context, dynamicRootView, fbyVar);
            case 20:
                return new htf(context, dynamicRootView, fbyVar);
            case 21:
                return new thx(context, dynamicRootView, fbyVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fby(context, dynamicRootView, fbyVar);
            case 23:
                return new wie(context, dynamicRootView, fbyVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj(context, dynamicRootView, fbyVar);
            case 25:
                return new ok(context, dynamicRootView, fbyVar);
            case 26:
                if ("vertical".equals(fbyVar.jc().lud().zk())) {
                    return new aeu(context, dynamicRootView, fbyVar);
                }
                return new sya(context, dynamicRootView, fbyVar);
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                return new av(context, dynamicRootView, fbyVar);
            case 28:
                if (!dj.zb() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new syc(context, dynamicRootView, fbyVar, renderRequest.dv());
            default:
                return null;
        }
    }
}
