package o;

import im.toss.features.benefit.dto.Cards;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class getNameByOperatorName$onWarmupCompleted {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[Cards.onNavigationEvent.values().length];
        try {
            iArr[Cards.onNavigationEvent.COMPLETE.ordinal()] = 1;
            int i = onNavigationEvent + 103;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        onWarmupCompleted = iArr;
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
