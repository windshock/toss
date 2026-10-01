package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class logicDeleteCert {
    private final logicIssueCertMakePOPOSigningInputMsg<?> IAuthTabCallback;
    private final logicChangeCertPW onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logicDeleteCert)) {
            return false;
        }
        logicDeleteCert logicdeletecert = (logicDeleteCert) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, logicdeletecert.IAuthTabCallback) && this.onExtraCallback == logicdeletecert.onExtraCallback;
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "Step1Result(wrappedEventAndArgument=" + this.IAuthTabCallback + ", processingResult=" + this.onExtraCallback + ")";
    }

    public logicDeleteCert(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull logicChangeCertPW logicchangecertpw) {
        Intrinsics.checkNotNullParameter(logicissuecertmakepoposigninginputmsg, "");
        Intrinsics.checkNotNullParameter(logicchangecertpw, "");
        this.IAuthTabCallback = logicissuecertmakepoposigninginputmsg;
        this.onExtraCallback = logicchangecertpw;
    }

    public final logicIssueCertMakePOPOSigningInputMsg<?> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final logicChangeCertPW onNavigationEvent() {
        return this.onExtraCallback;
    }
}
