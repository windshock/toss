package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAd extends AppLovinSdkInitializationConfigurationBuilder {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean onWarmupCompleted;

    public MaxNativeAd(@Nullable Float f, @Nullable Float f2, boolean z) {
        super(f, f2);
        this.onWarmupCompleted = z;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i3 + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
