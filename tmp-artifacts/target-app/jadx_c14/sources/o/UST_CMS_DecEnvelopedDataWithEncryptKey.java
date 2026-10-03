package o;

import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DecEnvelopedDataWithEncryptKey implements UST_CMS_EncryptedData {
    private final long IAuthTabCallback;
    private final Function1<TdsListHeaderV2View, Unit> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UST_CMS_DecEnvelopedDataWithEncryptKey) && Intrinsics.areEqual(this.onWarmupCompleted, ((UST_CMS_DecEnvelopedDataWithEncryptKey) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "ListHeaderItem(listHeaderSetUp=" + this.onWarmupCompleted + ")";
    }

    public final Function1<TdsListHeaderV2View, Unit> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.IAuthTabCallbackStub();
    }
}
