package o;

import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenerateHASH implements UST_CMS_EncryptedData {
    private final Function1<BaseTextView, Unit> IAuthTabCallback;
    private final long onExtraCallback;
    private final Integer onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_GenerateHASH)) {
            return false;
        }
        UST_CRYPT_GenerateHASH uST_CRYPT_GenerateHASH = (UST_CRYPT_GenerateHASH) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, uST_CRYPT_GenerateHASH.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, uST_CRYPT_GenerateHASH.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        Integer num = this.onNavigationEvent;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Typo04Item(setText=" + this.IAuthTabCallback + ", bgColor=" + this.onNavigationEvent + ")";
    }

    public final Function1<BaseTextView, Unit> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final Integer onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onPostMessage();
    }
}
