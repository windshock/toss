package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CMS_GetPubEncryptKeyWithEnvelopedData2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_GetPubEncryptKeyWithEnvelopedData2 extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_GetPubEncryptKeyWithEnvelopedData2(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_SignedData2 uST_CMS_SignedData2 = uST_CMS_EncryptedData instanceof UST_CMS_SignedData2 ? (UST_CMS_SignedData2) uST_CMS_EncryptedData : null;
        if (uST_CMS_SignedData2 != null) {
            if (uST_CMS_SignedData2.onNavigationEvent()) {
                ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.TdsTopV1T01ViewViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UST_CMS_GetPubEncryptKeyWithEnvelopedData2.onExtraCallbackWithResult(this.f$0, view);
                    }
                });
            }
            BaseTextView baseTextView = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            BaseTextView baseTextView2 = baseTextView instanceof BaseTextView ? baseTextView : null;
            if (baseTextView2 == null) {
                return;
            }
            baseTextView2.setText(uST_CMS_SignedData2.onWarmupCompleted());
            uST_CMS_SignedData2.onExtraCallbackWithResult().invoke(baseTextView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(UST_CMS_GetPubEncryptKeyWithEnvelopedData2 uST_CMS_GetPubEncryptKeyWithEnvelopedData2, View view) {
        uST_CMS_GetPubEncryptKeyWithEnvelopedData2.onExtraCallbackWithResult();
    }
}
