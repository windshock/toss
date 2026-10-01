package com.bytedance.adsdk.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum uh {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.zb.uh$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[uh.values().length];
            ycx = iArr;
            try {
                iArr[uh.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[uh.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[uh.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean ycx(int i2, boolean z, int i3) {
        int i4 = AnonymousClass1.ycx[ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return (z && i2 < 28) || i3 > 4 || i2 <= 25;
        }
        return true;
    }
}
