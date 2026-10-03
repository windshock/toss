package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.TdsResultV0View;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CMS_DecEncryptedData;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_DecEncryptedData extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_DecEncryptedData(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_DecSignedAndEnvelopedData uST_CMS_DecSignedAndEnvelopedData = uST_CMS_EncryptedData instanceof UST_CMS_DecSignedAndEnvelopedData ? (UST_CMS_DecSignedAndEnvelopedData) uST_CMS_EncryptedData : null;
        if (uST_CMS_DecSignedAndEnvelopedData != null) {
            View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            TdsResultV0View tdsResultV0View = view instanceof TdsResultV0View ? (TdsResultV0View) view : null;
            if (tdsResultV0View == null) {
                return;
            }
            uST_CMS_DecSignedAndEnvelopedData.onWarmupCompleted().invoke(tdsResultV0View);
            tdsResultV0View.asInterface().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.ListEmptyViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UST_CMS_DecEncryptedData.onNavigationEvent(this.f$0, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(UST_CMS_DecEncryptedData uST_CMS_DecEncryptedData, View view) {
        uST_CMS_DecEncryptedData.onExtraCallbackWithResult();
    }
}
