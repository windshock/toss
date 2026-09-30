package im.toss.features.home.feature.home_asset.edit;

import o.Interruptable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2ViewModel$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[Interruptable.onNavigationEvent.values().length];
        try {
            iArr[Interruptable.onNavigationEvent.AUTOMATIC.ordinal()] = 1;
            int i = IAuthTabCallback + 105;
            onExtraCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Interruptable.onNavigationEvent.MANUAL.ordinal()] = 2;
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onWarmupCompleted = iArr;
    }
}
