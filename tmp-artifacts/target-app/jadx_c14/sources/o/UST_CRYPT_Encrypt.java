package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_Encrypt implements UST_CMS_EncryptedData {
    private final String IAuthTabCallback;
    private final Integer onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_Encrypt)) {
            return false;
        }
        UST_CRYPT_Encrypt uST_CRYPT_Encrypt = (UST_CRYPT_Encrypt) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, uST_CRYPT_Encrypt.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, uST_CRYPT_Encrypt.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CRYPT_Encrypt.onExtraCallbackWithResult) && this.onNavigationEvent == uST_CRYPT_Encrypt.onNavigationEvent;
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        Integer num = this.onExtraCallback;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.onExtraCallbackWithResult;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "Typo03Item(text=" + this.IAuthTabCallback + ", textColor=" + this.onExtraCallback + ", bgColor=" + this.onExtraCallbackWithResult + ", gravity=" + this.onNavigationEvent + ")";
    }

    public final String onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final Integer IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public final Integer onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final int onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onMessageChannelReady();
    }
}
