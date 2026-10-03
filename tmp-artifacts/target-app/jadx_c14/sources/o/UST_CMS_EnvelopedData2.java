package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_EnvelopedData2 implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_EnvelopedData2)) {
            return false;
        }
        UST_CMS_EnvelopedData2 uST_CMS_EnvelopedData2 = (UST_CMS_EnvelopedData2) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CMS_EnvelopedData2.onNavigationEvent) && this.onExtraCallbackWithResult == uST_CMS_EnvelopedData2.onExtraCallbackWithResult && this.onWarmupCompleted == uST_CMS_EnvelopedData2.onWarmupCompleted;
    }

    public int hashCode() {
        return (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "ParagraphSmallItem(title=" + this.onNavigationEvent + ", backgroundColorInt=" + this.onExtraCallbackWithResult + ", textColorInt=" + this.onWarmupCompleted + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final int onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.access000();
    }
}
