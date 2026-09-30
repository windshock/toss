package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class OtherSigningCertificate {
    public static final getAlgorithmHash onExtraCallback(boolean z, boolean z2, @Nullable getAdvertisingIdInfoDirectly getadvertisingidinfodirectly) {
        if (!z) {
            return getAlgorithmHash.RETRY;
        }
        if (z2 && onExtraCallback(getadvertisingidinfodirectly)) {
            return getAlgorithmHash.MOVE_TO_FAILURE_SCREEN_WITH_IMAGE;
        }
        return getAlgorithmHash.MOVE_TO_FAILURE_SCREEN;
    }

    public static final boolean onExtraCallback(@Nullable getAdvertisingIdInfoDirectly getadvertisingidinfodirectly) {
        return getadvertisingidinfodirectly != null && getadvertisingidinfodirectly.onExtraCallback() && getadvertisingidinfodirectly.onNavigationEvent();
    }

    public static final boolean IAuthTabCallback(int i, @Nullable Integer num) {
        return num != null && i >= num.intValue();
    }
}
