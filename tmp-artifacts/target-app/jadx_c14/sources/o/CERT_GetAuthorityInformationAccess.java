package o;

import kotlin.jvm.internal.Intrinsics;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetAuthorityInformationAccess extends toRealPath {
    private final onNavigationEvent IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public interface onNavigationEvent {
        void onExtraCallback(@NotNull String str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CERT_GetAuthorityInformationAccess)) {
            return false;
        }
        CERT_GetAuthorityInformationAccess cERT_GetAuthorityInformationAccess = (CERT_GetAuthorityInformationAccess) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, cERT_GetAuthorityInformationAccess.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, cERT_GetAuthorityInformationAccess.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, cERT_GetAuthorityInformationAccess.onExtraCallback);
    }

    public int hashCode() {
        return (((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "TossMoneyNoticeBannerViewModel(navigator=" + this.IAuthTabCallback + ", title=" + this.onExtraCallbackWithResult + ", scheme=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CERT_GetAuthorityInformationAccess(@NotNull onNavigationEvent onnavigationevent, @NotNull String str, @NotNull String str2) {
        super(toRealPath.onNavigationEvent.TOSS_MONEY_NOTICE_BANNER);
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = onnavigationevent;
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
    }

    public long onWarmupCompleted() {
        onNavigationEvent onnavigationevent = this.IAuthTabCallback;
        return ("toss-money-notice-banner-" + onnavigationevent).hashCode();
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final void onExtraCallback() {
        this.IAuthTabCallback.onExtraCallback(this.onExtraCallback);
    }
}
