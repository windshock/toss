package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_MakePKCS9AuthAttributes implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final Integer onExtraCallback;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_MakePKCS9AuthAttributes)) {
            return false;
        }
        UST_CMS_MakePKCS9AuthAttributes uST_CMS_MakePKCS9AuthAttributes = (UST_CMS_MakePKCS9AuthAttributes) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CMS_MakePKCS9AuthAttributes.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, uST_CMS_MakePKCS9AuthAttributes.onExtraCallback) && this.onWarmupCompleted == uST_CMS_MakePKCS9AuthAttributes.onWarmupCompleted;
    }

    public int hashCode() {
        int iHashCode = this.onNavigationEvent.hashCode();
        Integer num = this.onExtraCallback;
        return (((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "TdsTopV1T02ViewItem(title=" + this.onNavigationEvent + ", textColor=" + this.onExtraCallback + ", bgColor=" + this.onWarmupCompleted + ")";
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final Integer onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final int onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.readTypedObject();
    }
}
