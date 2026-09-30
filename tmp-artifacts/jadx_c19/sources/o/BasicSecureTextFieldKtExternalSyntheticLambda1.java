package o;

import kotlin.jvm.internal.Intrinsics;
import o.RulerAlignmentKtExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicSecureTextFieldKtExternalSyntheticLambda1 implements RulerAlignmentKtExternalSyntheticLambda5.onNavigationEvent {
    private final BasicSecureTextFieldKtExternalSyntheticLambda5 onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicSecureTextFieldKtExternalSyntheticLambda1) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((BasicSecureTextFieldKtExternalSyntheticLambda1) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "SemanticsModifier(configuration=" + this.onExtraCallbackWithResult + ')';
    }

    public BasicSecureTextFieldKtExternalSyntheticLambda1(@NotNull BasicSecureTextFieldKtExternalSyntheticLambda5 basicSecureTextFieldKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = basicSecureTextFieldKtExternalSyntheticLambda5;
    }

    public final BasicSecureTextFieldKtExternalSyntheticLambda5 IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }
}
