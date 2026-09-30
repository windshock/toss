package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android {
    private final long onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android)) {
            return false;
        }
        ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android = (ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android) obj;
        return this.onExtraCallback == reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android.onExtraCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, reactNativeFeatureFlagsOverrides_RNOSS_Canary_Android.onNavigationEvent);
    }

    public int hashCode() {
        return (((Long.hashCode(this.onExtraCallback) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "GuardianAgreementTerm(termsId=" + this.onExtraCallback + ", title=" + this.onExtraCallbackWithResult + ", contentsUrl=" + this.onNavigationEvent + ")";
    }

    public ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
