package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_GenmGenp implements UST_CMS_EncryptedData {
    private final Integer IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_Update_GenmGenp)) {
            return false;
        }
        UST_CMP_Update_GenmGenp uST_CMP_Update_GenmGenp = (UST_CMP_Update_GenmGenp) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CMP_Update_GenmGenp.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, uST_CMP_Update_GenmGenp.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        Integer num = this.IAuthTabCallback;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Heading04Item(title=" + this.onExtraCallbackWithResult + ", textColor=" + this.IAuthTabCallback + ")";
    }

    public final Integer onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.IAuthTabCallbackDefault();
    }
}
