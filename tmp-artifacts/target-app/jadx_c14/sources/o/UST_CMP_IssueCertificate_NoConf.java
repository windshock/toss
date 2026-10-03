package o;

import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_IssueCertificate_NoConf implements UST_CMS_EncryptedData {
    private final int IAuthTabCallback;
    private final Function1<TdsBadgeV1View, Unit> onExtraCallback;
    private final int onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_IssueCertificate_NoConf)) {
            return false;
        }
        UST_CMP_IssueCertificate_NoConf uST_CMP_IssueCertificate_NoConf = (UST_CMP_IssueCertificate_NoConf) obj;
        return this.onNavigationEvent == uST_CMP_IssueCertificate_NoConf.onNavigationEvent && Intrinsics.areEqual(this.onExtraCallback, uST_CMP_IssueCertificate_NoConf.onExtraCallback) && this.IAuthTabCallback == uST_CMP_IssueCertificate_NoConf.IAuthTabCallback;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.onNavigationEvent) * 31) + this.onExtraCallback.hashCode()) * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "BadgeItem(gravity=" + this.onNavigationEvent + ", badgeSetter=" + this.onExtraCallback + ", clickIdentifier=" + this.IAuthTabCallback + ")";
    }

    public final int onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final Function1<TdsBadgeV1View, Unit> onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onExtraCallback();
    }
}
