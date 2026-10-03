package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_DestroyKey implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_DestroyKey)) {
            return false;
        }
        UST_CRYPT_DestroyKey uST_CRYPT_DestroyKey = (UST_CRYPT_DestroyKey) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CRYPT_DestroyKey.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, uST_CRYPT_DestroyKey.onNavigationEvent) && this.onExtraCallback == uST_CRYPT_DestroyKey.onExtraCallback;
    }

    public int hashCode() {
        return (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        return "TopButtonItem(title=" + this.onExtraCallbackWithResult + ", subtitle=" + this.onNavigationEvent + ", clickable=" + this.onExtraCallback + ")";
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
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
        return UST_CMP_Revoke_Rr.Companion.onActivityResized();
    }
}
