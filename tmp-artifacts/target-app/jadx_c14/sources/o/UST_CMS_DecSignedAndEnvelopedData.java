package o;

import im.toss.uikit.widget.TdsResultV0View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DecSignedAndEnvelopedData implements UST_CMS_EncryptedData {
    private final long onExtraCallback;
    private final Function1<TdsResultV0View, Unit> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UST_CMS_DecSignedAndEnvelopedData) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((UST_CMS_DecSignedAndEnvelopedData) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "ListEmptyItem(emptyViewSetUp=" + this.onExtraCallbackWithResult + ")";
    }

    public final Function1<TdsResultV0View, Unit> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.ICustomTabsCallbackStub();
    }
}
