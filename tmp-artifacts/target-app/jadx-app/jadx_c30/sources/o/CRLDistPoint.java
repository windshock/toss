package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.eventbus.Reason;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CRLDistPoint {
    private final String IAuthTabCallback;
    private final Reason onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CRLDistPoint)) {
            return false;
        }
        CRLDistPoint cRLDistPoint = (CRLDistPoint) obj;
        return this.onExtraCallbackWithResult == cRLDistPoint.onExtraCallbackWithResult && Intrinsics.areEqual(this.IAuthTabCallback, cRLDistPoint.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, cRLDistPoint.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        String str = this.IAuthTabCallback;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.onNavigationEvent;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeleteExtra(reason=" + this.onExtraCallbackWithResult + ", errorMessage=" + this.IAuthTabCallback + ", executionId=" + this.onNavigationEvent + ")";
    }

    public CRLDistPoint(@NotNull Reason reason, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(reason, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = reason;
        this.IAuthTabCallback = str;
        this.onNavigationEvent = str2;
    }

    public /* synthetic */ CRLDistPoint(Reason reason, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final Reason onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }
}
