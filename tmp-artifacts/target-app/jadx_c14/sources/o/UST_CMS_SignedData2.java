package o;

import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_SignedData2 implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final String onExtraCallback;
    private final boolean onNavigationEvent;
    private final Function1<BaseTextView, Unit> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_SignedData2)) {
            return false;
        }
        UST_CMS_SignedData2 uST_CMS_SignedData2 = (UST_CMS_SignedData2) obj;
        return Intrinsics.areEqual(this.onExtraCallback, uST_CMS_SignedData2.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, uST_CMS_SignedData2.onWarmupCompleted) && this.onNavigationEvent == uST_CMS_SignedData2.onNavigationEvent;
    }

    public int hashCode() {
        return (((this.onExtraCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "TdsTopV1T01ViewItem(title=" + this.onExtraCallback + ", textViewSetter=" + this.onWarmupCompleted + ", clickable=" + this.onNavigationEvent + ")";
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final Function1<BaseTextView, Unit> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.IAuthTabCallbackStubProxy();
    }
}
