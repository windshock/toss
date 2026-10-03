package o;

import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_AsymmDecrypt implements UST_CMS_EncryptedData {
    private final long onExtraCallback;
    private final Function1<TdsTextButtonV0View, Unit> onNavigationEvent;
    private final float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CRYPT_AsymmDecrypt)) {
            return false;
        }
        UST_CRYPT_AsymmDecrypt uST_CRYPT_AsymmDecrypt = (UST_CRYPT_AsymmDecrypt) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, uST_CRYPT_AsymmDecrypt.onNavigationEvent) && Float.compare(this.onWarmupCompleted, uST_CRYPT_AsymmDecrypt.onWarmupCompleted) == 0;
    }

    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + Float.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "TextButtonItem(buttonSetter=" + this.onNavigationEvent + ", horizontalPaddingAsDp=" + this.onWarmupCompleted + ")";
    }

    public final Function1<TdsTextButtonV0View, Unit> onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final float onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.ICustomTabsCallbackStubProxy();
    }
}
