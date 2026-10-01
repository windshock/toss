package o;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q5ExternalSyntheticLambda0 {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final Set<String> onExtraCallback;
    private final Set<String> onExtraCallbackWithResult;
    private final Set<String> onNavigationEvent;
    private final Set<String> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 73;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof q5ExternalSyntheticLambda0)) {
            return false;
        }
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0 = (q5ExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, q5externalsyntheticlambda0.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, q5externalsyntheticlambda0.onWarmupCompleted) || !Intrinsics.areEqual(this.onNavigationEvent, q5externalsyntheticlambda0.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, q5externalsyntheticlambda0.onExtraCallback)) {
            int i4 = IAuthTabCallbackStub + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, q5externalsyntheticlambda0.onExtraCallbackWithResult)) {
            return true;
        }
        int i6 = IAuthTabCallbackStub + 51;
        int i7 = i6 % 128;
        asInterface = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 79;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringMetricSpec(name=" + this.IAuthTabCallback + ", requiredDimensionKeys=" + this.onWarmupCompleted + ", allowedSteps=" + this.onNavigationEvent + ", allowedSignalTypes=" + this.onExtraCallback + ", allowedAlertPolicies=" + this.onExtraCallbackWithResult + ")";
        int i2 = asInterface + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return str;
    }

    public q5ExternalSyntheticLambda0(@NotNull String str, @NotNull Set<String> set, @NotNull Set<String> set2, @NotNull Set<String> set3, @NotNull Set<String> set4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        Intrinsics.checkNotNullParameter(set3, "");
        Intrinsics.checkNotNullParameter(set4, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = set;
        this.onNavigationEvent = set2;
        this.onExtraCallback = set3;
        this.onExtraCallbackWithResult = set4;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final Set<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = this.onWarmupCompleted;
        int i5 = i2 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Set<String> set = this.onNavigationEvent;
        int i4 = i2 + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return set;
    }

    public final Set<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Set<String> set = this.onExtraCallback;
        int i5 = i3 + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return set;
    }

    public final Set<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Set<String> set = this.onExtraCallbackWithResult;
        int i5 = i3 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }
}
