package o;

import kotlin.jvm.internal.Intrinsics;
import o.certGetOCSPAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicIssueCertMakePOPOSigningInputMsg<E extends certGetOCSPAddress> {
    private final Object IAuthTabCallback;
    private final E onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logicIssueCertMakePOPOSigningInputMsg)) {
            return false;
        }
        logicIssueCertMakePOPOSigningInputMsg logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) obj;
        return Intrinsics.areEqual(this.onExtraCallback, logicissuecertmakepoposigninginputmsg.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, logicissuecertmakepoposigninginputmsg.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallback.hashCode();
        Object obj = this.IAuthTabCallback;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final Object onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final E onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "EventAndArgument(event=" + this.onExtraCallback + ", argument=" + this.IAuthTabCallback + ")";
    }

    public logicIssueCertMakePOPOSigningInputMsg(@NotNull E e, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(e, "");
        this.onExtraCallback = e;
        this.IAuthTabCallback = obj;
    }

    public final Object onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final E onWarmupCompleted() {
        return this.onExtraCallback;
    }
}
