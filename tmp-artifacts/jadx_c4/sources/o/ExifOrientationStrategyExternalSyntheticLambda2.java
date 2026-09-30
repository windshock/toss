package o;

import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExifOrientationStrategyExternalSyntheticLambda2 implements getProgressColor {
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onExtraCallbackWithResult;

    public ExifOrientationStrategyExternalSyntheticLambda2(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        this.onExtraCallbackWithResult = constraintsSizeResolverExternalSyntheticLambda0;
    }

    @Override // o.getProgressColor
    public String onExtraCallbackWithResult(@NotNull String str) {
        String strIAuthTabCallback;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = setup.IAuthTabCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), (IvParameterSpec) null, 2, (Object) null), str, 0, 2, null);
        }
        return strIAuthTabCallback;
    }

    @Override // o.getProgressColor
    public String onWarmupCompleted(@NotNull String str) {
        String strOnNavigationEvent;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            strOnNavigationEvent = setup.onNavigationEvent(setProgressColor.onNavigationEvent.onWarmupCompleted(setProgressColor.Companion, this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), null, 2, null), str, 0, 2, null);
        }
        return strOnNavigationEvent;
    }
}
