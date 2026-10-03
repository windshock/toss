package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_Result implements UST_CMS_EncryptedData {
    private final int IAuthTabCallback;
    private final long onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMP_Update_Result)) {
            return false;
        }
        UST_CMP_Update_Result uST_CMP_Update_Result = (UST_CMP_Update_Result) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, uST_CMP_Update_Result.onWarmupCompleted) && this.IAuthTabCallback == uST_CMP_Update_Result.IAuthTabCallback;
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "Heading4Item(title=" + this.onWarmupCompleted + ", colorInt=" + this.IAuthTabCallback + ")";
    }

    public final String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.ICustomTabsCallbackDefault();
    }
}
