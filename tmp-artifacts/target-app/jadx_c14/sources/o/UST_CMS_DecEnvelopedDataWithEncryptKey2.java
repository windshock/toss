package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DecEnvelopedDataWithEncryptKey2 implements UST_CMS_EncryptedData {
    private final int IAuthTabCallback;
    private final String asBinder;
    private final boolean onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UST_CMS_DecEnvelopedDataWithEncryptKey2)) {
            return false;
        }
        UST_CMS_DecEnvelopedDataWithEncryptKey2 uST_CMS_DecEnvelopedDataWithEncryptKey2 = (UST_CMS_DecEnvelopedDataWithEncryptKey2) obj;
        return Intrinsics.areEqual(this.asBinder, uST_CMS_DecEnvelopedDataWithEncryptKey2.asBinder) && Intrinsics.areEqual(this.onNavigationEvent, uST_CMS_DecEnvelopedDataWithEncryptKey2.onNavigationEvent) && this.onExtraCallback == uST_CMS_DecEnvelopedDataWithEncryptKey2.onExtraCallback && this.onWarmupCompleted == uST_CMS_DecEnvelopedDataWithEncryptKey2.onWarmupCompleted && this.IAuthTabCallback == uST_CMS_DecEnvelopedDataWithEncryptKey2.IAuthTabCallback;
    }

    public int hashCode() {
        return (((((((this.asBinder.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "ListTitleItem(titleText=" + this.asBinder + ", descText=" + this.onNavigationEvent + ", showBorder=" + this.onExtraCallback + ", titleColor=" + this.onWarmupCompleted + ", descColor=" + this.IAuthTabCallback + ")";
    }

    public final String asBinder() {
        return this.asBinder;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final int IAuthTabCallbackStub() {
        return this.onWarmupCompleted;
    }

    public final int onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.asInterface();
    }
}
