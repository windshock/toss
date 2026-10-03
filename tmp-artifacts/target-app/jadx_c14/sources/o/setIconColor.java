package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setIconColor {
    public static final setIconColor onWarmupCompleted = new setIconColor();

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[setIconSizeDp.values().length];
            try {
                iArr[setIconSizeDp.Dismissed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setIconSizeDp.Half.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setIconSizeDp.Compact.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setIconSizeDp.Fullscreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    private setIconColor() {
    }

    public final float onExtraCallbackWithResult(@NotNull AdSDKNotificationManager adSDKNotificationManager, float f) {
        Intrinsics.checkNotNullParameter(adSDKNotificationManager, "");
        return adSDKNotificationManager.onExtraCallbackWithResult() + (f * 16.0f);
    }

    public final float onWarmupCompleted(@NotNull AdSDKNotificationManager adSDKNotificationManager) {
        Intrinsics.checkNotNullParameter(adSDKNotificationManager, "");
        return adSDKNotificationManager.onExtraCallback();
    }

    public final float onExtraCallback(@NotNull AdSDKNotificationManager adSDKNotificationManager, float f, float f2) {
        Intrinsics.checkNotNullParameter(adSDKNotificationManager, "");
        float fOnExtraCallbackWithResult = adSDKNotificationManager.onExtraCallbackWithResult();
        float fOnWarmupCompleted = adSDKNotificationManager.onWarmupCompleted();
        return Math.max(fOnExtraCallbackWithResult - ((fOnWarmupCompleted * f) + adSDKNotificationManager.onNavigationEvent()), adSDKNotificationManager.IAuthTabCallback() + (f2 * 22.0f));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float onExtraCallbackWithResult(@NotNull setIconSizeDp seticonsizedp, @NotNull AdSDKNotificationManager adSDKNotificationManager, @NotNull AdListener adListener, float f) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(seticonsizedp, "");
        Intrinsics.checkNotNullParameter(adSDKNotificationManager, "");
        Intrinsics.checkNotNullParameter(adListener, "");
        int i = onExtraCallback.onExtraCallbackWithResult[seticonsizedp.ordinal()];
        if (i == 1) {
            return onExtraCallbackWithResult(adSDKNotificationManager, f);
        }
        if (i == 2) {
            return onExtraCallback(adSDKNotificationManager, adListener.onExtraCallbackWithResult(), f);
        }
        if (i == 3) {
            return onExtraCallback(adSDKNotificationManager, adListener.onWarmupCompleted(), f);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return onWarmupCompleted(adSDKNotificationManager);
    }

    public final float onNavigationEvent(float f, float f2, @NotNull AdListener adListener, float f3) {
        Intrinsics.checkNotNullParameter(adListener, "");
        float fIAuthTabCallbackStub = adListener.IAuthTabCallbackStub() * f3;
        return fIAuthTabCallbackStub + ((f2 - fIAuthTabCallbackStub) * RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final float onExtraCallback(float f, float f2, float f3, float f4) {
        return Math.max(0.0f, (f2 + (f3 * f4)) - f);
    }
}
