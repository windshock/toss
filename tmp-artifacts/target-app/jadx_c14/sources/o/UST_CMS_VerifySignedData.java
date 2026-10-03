package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_VerifySignedData implements UST_CMS_EncryptedData {
    private final String IAuthTabCallback;
    private final long onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_VerifySignedData)) {
            return false;
        }
        UST_CMS_VerifySignedData uST_CMS_VerifySignedData = (UST_CMS_VerifySignedData) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, uST_CMS_VerifySignedData.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CMS_VerifySignedData.onExtraCallbackWithResult) && this.onNavigationEvent == uST_CMS_VerifySignedData.onNavigationEvent;
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        Integer num = this.onExtraCallbackWithResult;
        return (((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "TdsTopV1T04ViewItem(title=" + this.IAuthTabCallback + ", textColor=" + this.onExtraCallbackWithResult + ", bgColor=" + this.onNavigationEvent + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final Integer onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.writeTypedObject();
    }
}
