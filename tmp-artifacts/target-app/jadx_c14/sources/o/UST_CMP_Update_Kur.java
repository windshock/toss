package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_Kur implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final float onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_Update_Kur)) {
            return false;
        }
        UST_CMP_Update_Kur uST_CMP_Update_Kur = (UST_CMP_Update_Kur) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CMP_Update_Kur.onNavigationEvent) && this.onWarmupCompleted == uST_CMP_Update_Kur.onWarmupCompleted && Float.compare(this.onExtraCallbackWithResult, uST_CMP_Update_Kur.onExtraCallbackWithResult) == 0;
    }

    public int hashCode() {
        return (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "ImageItem(url=" + this.onNavigationEvent + ", resId=" + this.onWarmupCompleted + ", horizontalPaddingAsDp=" + this.onExtraCallbackWithResult + ")";
    }

    public final float onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
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
        return UST_CMP_Revoke_Rr.Companion.asBinder();
    }
}
