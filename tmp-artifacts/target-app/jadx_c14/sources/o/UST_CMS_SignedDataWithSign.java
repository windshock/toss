package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_SignedDataWithSign implements UST_CMS_EncryptedData {
    private final String IAuthTabCallback;
    private final Integer onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_SignedDataWithSign)) {
            return false;
        }
        UST_CMS_SignedDataWithSign uST_CMS_SignedDataWithSign = (UST_CMS_SignedDataWithSign) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, uST_CMS_SignedDataWithSign.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CMS_SignedDataWithSign.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        Integer num = this.onExtraCallbackWithResult;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "TdsTopV1T03ViewItem(title=" + this.IAuthTabCallback + ", textColor=" + this.onExtraCallbackWithResult + ")";
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final Integer onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.ICustomTabsCallback();
    }
}
