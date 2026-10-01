package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 {
    private final boolean IAuthTabCallback;
    private final String onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final List<ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0)) {
            return false;
        }
        ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0 = (ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0) obj;
        return Intrinsics.areEqual(this.onExtraCallback, reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onExtraCallback) && this.IAuthTabCallback == reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.IAuthTabCallback && Intrinsics.areEqual(this.onNavigationEvent, reactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0.onNavigationEvent);
    }

    public int hashCode() {
        return (((this.onExtraCallback.hashCode() * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "GuardianAgreementGroup(title=" + this.onExtraCallback + ", optional=" + this.IAuthTabCallback + ", terms=" + this.onNavigationEvent + ")";
    }

    public ReactNativeFeatureFlagsLocalAccessorExternalSyntheticLambda0(@NotNull String str, boolean z, @NotNull List<ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onExtraCallback = str;
        this.IAuthTabCallback = z;
        this.onNavigationEvent = list;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final List<ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android> onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final void onExtraCallback(boolean z) {
        this.onExtraCallbackWithResult = z;
    }
}
