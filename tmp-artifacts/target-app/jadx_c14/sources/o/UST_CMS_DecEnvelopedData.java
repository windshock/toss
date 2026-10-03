package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DecEnvelopedData extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_DecEnvelopedData(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_DecEnvelopedDataWithEncryptKey uST_CMS_DecEnvelopedDataWithEncryptKey = uST_CMS_EncryptedData instanceof UST_CMS_DecEnvelopedDataWithEncryptKey ? (UST_CMS_DecEnvelopedDataWithEncryptKey) uST_CMS_EncryptedData : null;
        if (uST_CMS_DecEnvelopedDataWithEncryptKey != null) {
            View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            TdsListHeaderV2View tdsListHeaderV2View = view instanceof TdsListHeaderV2View ? (TdsListHeaderV2View) view : null;
            if (tdsListHeaderV2View == null) {
                return;
            }
            uST_CMS_DecEnvelopedDataWithEncryptKey.onWarmupCompleted().invoke(tdsListHeaderV2View);
        }
    }
}
