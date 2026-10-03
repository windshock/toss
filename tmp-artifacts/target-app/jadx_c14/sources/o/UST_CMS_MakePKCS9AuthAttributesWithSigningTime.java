package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.internal.Intrinsics;
import o.UST_CMS_MakePKCS9AuthAttributesWithSigningTime;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_MakePKCS9AuthAttributesWithSigningTime extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_MakePKCS9AuthAttributesWithSigningTime(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_SignedAndEnvelopedData uST_CMS_SignedAndEnvelopedData = uST_CMS_EncryptedData instanceof UST_CMS_SignedAndEnvelopedData ? (UST_CMS_SignedAndEnvelopedData) uST_CMS_EncryptedData : null;
        if (uST_CMS_SignedAndEnvelopedData != null) {
            View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            TdsListRowV1View tdsListRowV1View = view instanceof TdsListRowV1View ? (TdsListRowV1View) view : null;
            if (tdsListRowV1View != null) {
                if (uST_CMS_SignedAndEnvelopedData.onExtraCallbackWithResult()) {
                    ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.TdsListRowV1ViewViewHolder$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            UST_CMS_MakePKCS9AuthAttributesWithSigningTime.onExtraCallbackWithResult(this.f$0, view2);
                        }
                    });
                }
                uST_CMS_SignedAndEnvelopedData.onWarmupCompleted().invoke(tdsListRowV1View);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(UST_CMS_MakePKCS9AuthAttributesWithSigningTime uST_CMS_MakePKCS9AuthAttributesWithSigningTime, View view) {
        uST_CMS_MakePKCS9AuthAttributesWithSigningTime.onExtraCallbackWithResult();
    }
}
