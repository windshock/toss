package o;

import kotlin.jvm.internal.Intrinsics;
import o.certGetOCSPAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicRenewCertGenmGenp<E extends certGetOCSPAddress> {
    private final Object onExtraCallback;
    private final E onExtraCallbackWithResult;
    private final logicIssueClose onNavigationEvent;
    private final logicIssueCertSendConf<E> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ logicRenewCertGenmGenp onExtraCallback(logicRenewCertGenmGenp logicrenewcertgenmgenp, logicIssueCertSendConf logicissuecertsendconf, logicIssueClose logicissueclose, certGetOCSPAddress certgetocspaddress, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            logicissuecertsendconf = logicrenewcertgenmgenp.onWarmupCompleted;
        }
        if ((i & 2) != 0) {
            logicissueclose = logicrenewcertgenmgenp.onNavigationEvent;
        }
        if ((i & 4) != 0) {
            certgetocspaddress = logicrenewcertgenmgenp.onExtraCallbackWithResult;
        }
        if ((i & 8) != 0) {
            obj = logicrenewcertgenmgenp.onExtraCallback;
        }
        return logicrenewcertgenmgenp.onExtraCallback(logicissuecertsendconf, logicissueclose, certgetocspaddress, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logicRenewCertGenmGenp)) {
            return false;
        }
        logicRenewCertGenmGenp logicrenewcertgenmgenp = (logicRenewCertGenmGenp) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, logicrenewcertgenmgenp.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, logicrenewcertgenmgenp.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, logicrenewcertgenmgenp.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, logicrenewcertgenmgenp.onExtraCallback);
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
        Object obj = this.onExtraCallback;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final logicRenewCertGenmGenp<E> onExtraCallback(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf, @NotNull logicIssueClose logicissueclose, @NotNull E e, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        Intrinsics.checkNotNullParameter(logicissueclose, "");
        Intrinsics.checkNotNullParameter(e, "");
        return new logicRenewCertGenmGenp<>(logicissuecertsendconf, logicissueclose, e, obj);
    }

    public String toString() {
        return "TransitionParams(transition=" + this.onWarmupCompleted + ", direction=" + this.onNavigationEvent + ", event=" + this.onExtraCallbackWithResult + ", argument=" + this.onExtraCallback + ")";
    }

    public logicRenewCertGenmGenp(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf, @NotNull logicIssueClose logicissueclose, @NotNull E e, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        Intrinsics.checkNotNullParameter(logicissueclose, "");
        Intrinsics.checkNotNullParameter(e, "");
        this.onWarmupCompleted = logicissuecertsendconf;
        this.onNavigationEvent = logicissueclose;
        this.onExtraCallbackWithResult = e;
        this.onExtraCallback = obj;
    }

    public final logicIssueCertSendConf<E> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final logicIssueClose onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final E onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }
}
