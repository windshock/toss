package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_GetCertCountWithSignedData implements UST_CMS_EncryptedData {
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_GetCertCountWithSignedData)) {
            return false;
        }
        UST_CMS_GetCertCountWithSignedData uST_CMS_GetCertCountWithSignedData = (UST_CMS_GetCertCountWithSignedData) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, uST_CMS_GetCertCountWithSignedData.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, uST_CMS_GetCertCountWithSignedData.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CMS_GetCertCountWithSignedData.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        int iHashCode2 = this.onExtraCallback.hashCode();
        Function0<Unit> function0 = this.onExtraCallbackWithResult;
        return (((iHashCode * 31) + iHashCode2) * 31) + (function0 == null ? 0 : function0.hashCode());
    }

    public String toString() {
        return "TableRowItem(label=" + this.IAuthTabCallback + ", content=" + this.onExtraCallback + ", onClick=" + this.onExtraCallbackWithResult + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final Function0<Unit> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.getInterfaceDescriptor();
    }
}
