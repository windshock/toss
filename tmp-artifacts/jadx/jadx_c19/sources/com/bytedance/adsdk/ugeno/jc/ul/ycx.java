package com.bytedance.adsdk.ugeno.jc.ul;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx extends com.bytedance.adsdk.ugeno.zb.ycx<com.bytedance.adsdk.ugeno.jc.zb.ycx> {
    public ycx(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.zb.ycx
    public void zb() {
        super.zb();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(String str, String str2) {
        char c;
        super.ycx(str, str2);
        switch (str.hashCode()) {
            case -411339735:
                if (!str.equals("onVideoProgress")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 1139576207:
                if (str.equals("onVideoFinish")) {
                    c = 1;
                    break;
                }
                break;
            case 1302043440:
                if (str.equals("onVideoPlay")) {
                    c = 2;
                    break;
                }
                break;
            case 1479592233:
                if (str.equals("onVideoResume")) {
                    c = 3;
                    break;
                }
                break;
            case 1708332410:
                if (str.equals("onVideoPause")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) {
            zb(str, str2);
        }
    }
}
