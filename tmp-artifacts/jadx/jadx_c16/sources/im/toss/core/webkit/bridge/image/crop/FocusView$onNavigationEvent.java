package im.toss.core.webkit.bridge.image.crop;

import o.extractFile;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FocusView$onNavigationEvent {
    private static int IAuthTabCallback = 0;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[extractFile.values().length];
        try {
            iArr[extractFile.RECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[extractFile.PAPER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[extractFile.CIRCLE.ordinal()] = 3;
            int i = IAuthTabCallback + 15;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallback = iArr;
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
