package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TermsAndPrivacyPolicyFlowSettingsImpl {
    private static int onExtraCallback = 0;
    public static final int onExtraCallbackWithResult = 8;
    private static int onWarmupCompleted = 1;
    private volatile getDebugUserGeography IAuthTabCallback;

    @Inject
    public TermsAndPrivacyPolicyFlowSettingsImpl() {
    }

    public final getDebugUserGeography onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDebugUserGeography getdebugusergeography = this.IAuthTabCallback;
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getdebugusergeography;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull getDebugUserGeography getdebugusergeography) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getdebugusergeography, "");
            this.IAuthTabCallback = getdebugusergeography;
        } else {
            Intrinsics.checkNotNullParameter(getdebugusergeography, "");
            this.IAuthTabCallback = getdebugusergeography;
            int i3 = 78 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull getDebugUserGeography getdebugusergeography) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getdebugusergeography, "");
        if (this.IAuthTabCallback == getdebugusergeography) {
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = null;
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
