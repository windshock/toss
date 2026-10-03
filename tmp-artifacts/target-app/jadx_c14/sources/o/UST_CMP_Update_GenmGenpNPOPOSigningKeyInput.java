package o;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_GenmGenpNPOPOSigningKeyInput implements UST_CMS_EncryptedData {
    private final long onExtraCallback;
    private final boolean onNavigationEvent;

    public final boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onNavigationEvent();
    }
}
