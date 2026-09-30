package o;

import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class supports implements getProgressColor {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallback;

    @Inject
    public supports(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onExtraCallback = constraintsSizeResolverExternalSyntheticLambda0;
    }

    @Override // o.getProgressColor
    public String onExtraCallbackWithResult(@NotNull String str) {
        String strIAuthTabCallback;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = setup.IAuthTabCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, this.onExtraCallback.IAuthTabCallbackDefault(), (IvParameterSpec) null, 2, (Object) null), str, 0, 2, null);
        }
        return strIAuthTabCallback;
    }

    @Override // o.getProgressColor
    public String onWarmupCompleted(@NotNull String str) {
        String strOnNavigationEvent;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnNavigationEvent = setup.onNavigationEvent(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, this.onExtraCallback.IAuthTabCallbackDefault(), null, 2, null), str, 0, 2, null);
        }
        return strOnNavigationEvent;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return "newKeyCipher";
    }
}
