package com.bytedance.adsdk.ugeno.jc.zb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.zb.sya;
import com.bytedance.adsdk.ugeno.zb.ycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends com.bytedance.adsdk.ugeno.zb.ycx<com.bytedance.adsdk.ugeno.jc.zb.ycx> {
    private com.bytedance.adsdk.ugeno.jc.zb.ycx qt;

    public zb(Context context) {
        super(context);
    }

    /* renamed from: sya, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.jc.zb.ycx ycx() {
        com.bytedance.adsdk.ugeno.jc.zb.ycx ycxVar = new com.bytedance.adsdk.ugeno.jc.zb.ycx(((sya) this).zb);
        this.qt = ycxVar;
        ycxVar.ycx(this);
        return this.qt;
    }

    @Override // com.bytedance.adsdk.ugeno.zb.ycx
    public void zb() {
        this.qt.setEventMap(((sya) this).kt);
        super.zb();
    }

    @Override // com.bytedance.adsdk.ugeno.zb.ycx
    public ycx.C0010ycx jc() {
        return new ycx(this);
    }

    public static class ycx extends ycx.C0010ycx {
        protected int hf;

        public ycx(com.bytedance.adsdk.ugeno.zb.ycx ycxVar) {
            super(ycxVar);
            this.hf = -1;
        }

        @Override // com.bytedance.adsdk.ugeno.zb.ycx.C0010ycx
        public void ycx(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ycx(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.hf = ycx(str2);
            }
        }

        private int ycx(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iZb = 0;
            for (String str2 : strArrSplit) {
                iZb |= zb(str2);
            }
            return iZb;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int zb(String str) {
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.zb.ycx.C0010ycx
        /* renamed from: zb, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams ycx() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ycx, (int) this.zb);
            layoutParams.leftMargin = (int) this.lt;
            layoutParams.rightMargin = (int) this.ul;
            layoutParams.topMargin = (int) this.fby;
            layoutParams.bottomMargin = (int) this.jw;
            layoutParams.gravity = this.hf;
            return layoutParams;
        }
    }
}
