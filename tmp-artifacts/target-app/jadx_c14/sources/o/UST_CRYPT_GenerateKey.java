package o;

import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenerateKey implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final Function1<BaseTextView, Unit> onExtraCallback;
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_GenerateKey)) {
            return false;
        }
        UST_CRYPT_GenerateKey uST_CRYPT_GenerateKey = (UST_CRYPT_GenerateKey) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, uST_CRYPT_GenerateKey.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, uST_CRYPT_GenerateKey.onExtraCallback);
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "Typo05Item(title=" + this.onExtraCallbackWithResult + ", textViewSetter=" + this.onExtraCallback + ")";
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final Function1<BaseTextView, Unit> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onMinimized();
    }
}
