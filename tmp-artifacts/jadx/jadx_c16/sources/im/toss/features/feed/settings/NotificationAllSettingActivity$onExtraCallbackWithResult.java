package im.toss.features.feed.settings;

import o.u5b;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$onExtraCallbackWithResult {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[u5b.values().length];
        try {
            iArr[u5b.Hidden.ordinal()] = 1;
            int i = onNavigationEvent + 87;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        onWarmupCompleted = iArr;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
