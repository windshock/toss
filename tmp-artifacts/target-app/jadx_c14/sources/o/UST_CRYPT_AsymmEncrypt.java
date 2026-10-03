package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_AsymmEncrypt implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final Integer onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_AsymmEncrypt)) {
            return false;
        }
        UST_CRYPT_AsymmEncrypt uST_CRYPT_AsymmEncrypt = (UST_CRYPT_AsymmEncrypt) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CRYPT_AsymmEncrypt.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, uST_CRYPT_AsymmEncrypt.onExtraCallback) && Float.compare(this.onNavigationEvent, uST_CRYPT_AsymmEncrypt.onNavigationEvent) == 0;
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        Integer num = this.onExtraCallback;
        return (((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "TdsTopV1T05ViewItem(title=" + this.onExtraCallbackWithResult + ", textColor=" + this.onExtraCallback + ", topPadding=" + this.onNavigationEvent + ")";
    }

    public final float onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final Integer onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.extraCallback();
    }
}
