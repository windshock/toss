package o;

import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_SetAsymmetricKey implements UST_CMS_EncryptedData {
    private final Function1<BaseTextView, Unit> IAuthTabCallback;
    private final long onExtraCallback;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_SetAsymmetricKey)) {
            return false;
        }
        UST_CRYPT_SetAsymmetricKey uST_CRYPT_SetAsymmetricKey = (UST_CRYPT_SetAsymmetricKey) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, uST_CRYPT_SetAsymmetricKey.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, uST_CRYPT_SetAsymmetricKey.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        Function1<BaseTextView, Unit> function1 = this.IAuthTabCallback;
        return (iHashCode * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    public String toString() {
        return "Typo12Item(text=" + this.onWarmupCompleted + ", textViewSetter=" + this.IAuthTabCallback + ")";
    }

    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final Function1<BaseTextView, Unit> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onActivityLayout();
    }
}
