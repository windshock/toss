package o;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_AsymmDecryptWithCert implements UST_CMS_EncryptedData {
    private final Integer IAuthTabCallback;
    private final Function1<TextView, Unit> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_AsymmDecryptWithCert)) {
            return false;
        }
        UST_CRYPT_AsymmDecryptWithCert uST_CRYPT_AsymmDecryptWithCert = (UST_CRYPT_AsymmDecryptWithCert) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CRYPT_AsymmDecryptWithCert.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, uST_CRYPT_AsymmDecryptWithCert.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CRYPT_AsymmDecryptWithCert.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.onNavigationEvent.hashCode();
        Integer num = this.IAuthTabCallback;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Function1<TextView, Unit> function1 = this.onExtraCallbackWithResult;
        return (((iHashCode * 31) + iHashCode2) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    public String toString() {
        return "TdsTopV1T06ViewItem(title=" + this.onNavigationEvent + ", textColor=" + this.IAuthTabCallback + ", setView=" + this.onExtraCallbackWithResult + ")";
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final Integer onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final Function1<TextView, Unit> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.extraCallbackWithResult();
    }
}
