package im.toss.features.home.core.ui.extensions;

import o.ImmutableMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RollingNumberViewsKt$WhenMappings {
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[ImmutableMap.values().length];
        try {
            iArr[ImmutableMap.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImmutableMap.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImmutableMap.RIGHT.ordinal()] = 3;
            int i = onExtraCallback + 125;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        onNavigationEvent = iArr;
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
