package o;

import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_SignedAndEnvelopedData implements UST_CMS_EncryptedData {
    private final Function1<TdsListRowV1View, Unit> IAuthTabCallback;
    private final long onExtraCallback;
    private final boolean onWarmupCompleted;

    public final boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final Function1<TdsListRowV1View, Unit> onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onTransact();
    }
}
