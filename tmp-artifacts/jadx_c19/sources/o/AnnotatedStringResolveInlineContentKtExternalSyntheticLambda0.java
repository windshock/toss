package o;

import o.BasicTextKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AnnotatedStringResolveInlineContentKtExternalSyntheticLambda0 {
    public static final RulerAlignmentKtExternalSyntheticLambda5 onWarmupCompleted(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AndroidCursorHandle_androidKtExternalSyntheticLambda6(new BasicTextKtExternalSyntheticLambda17.IAuthTabCallback(f, null)));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onExtraCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AndroidCursorHandle_androidKtExternalSyntheticLambda6(BasicTextKtExternalSyntheticLambda17.onExtraCallbackWithResult.onWarmupCompleted));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AndroidCursorHandle_androidKtExternalSyntheticLambda3(new BasicTextKtExternalSyntheticLambda17.IAuthTabCallback(f, null)));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AndroidCursorHandle_androidKtExternalSyntheticLambda3(BasicTextKtExternalSyntheticLambda17.onExtraCallback.IAuthTabCallback));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        return rulerAlignmentKtExternalSyntheticLambda5.onExtraCallback(new AndroidCursorHandle_androidKtExternalSyntheticLambda3(BasicTextKtExternalSyntheticLambda17.onExtraCallbackWithResult.onWarmupCompleted));
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f) {
        return IAuthTabCallback(onWarmupCompleted(rulerAlignmentKtExternalSyntheticLambda5, f), f);
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onNavigationEvent(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5, float f, float f2) {
        return IAuthTabCallback(onWarmupCompleted(rulerAlignmentKtExternalSyntheticLambda5, f), f2);
    }

    public static final RulerAlignmentKtExternalSyntheticLambda5 onNavigationEvent(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        return onExtraCallbackWithResult(onExtraCallback(rulerAlignmentKtExternalSyntheticLambda5));
    }
}
