package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_EncryptedDataWithEncryptKey implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_EncryptedDataWithEncryptKey)) {
            return false;
        }
        UST_CMS_EncryptedDataWithEncryptKey uST_CMS_EncryptedDataWithEncryptKey = (UST_CMS_EncryptedDataWithEncryptKey) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CMS_EncryptedDataWithEncryptKey.onNavigationEvent) && this.onWarmupCompleted == uST_CMS_EncryptedDataWithEncryptKey.onWarmupCompleted && this.onExtraCallback == uST_CMS_EncryptedDataWithEncryptKey.onExtraCallback;
    }

    public int hashCode() {
        return (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "LottieItem(url=" + this.onNavigationEvent + ", bgColor=" + this.onWarmupCompleted + ", loop=" + this.onExtraCallback + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.access100();
    }
}
