package o;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenerateHASHFile implements UST_CMS_EncryptedData {
    private final Integer IAuthTabCallback;
    private final long onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Integer onWarmupCompleted;

    public final String onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final Integer asInterface() {
        return this.IAuthTabCallback;
    }

    public final Integer onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final int onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onRelationshipValidationResult();
    }
}
