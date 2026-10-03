package o;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_VerifySignedDataWithContent extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_VerifySignedDataWithContent(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_VerifySignedData uST_CMS_VerifySignedData = (UST_CMS_VerifySignedData) uST_CMS_EncryptedData;
        View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(view, "");
        UST_CMP_Revoke_Rp.onExtraCallbackWithResult((TextView) view, uST_CMS_VerifySignedData.onExtraCallbackWithResult(), uST_CMS_VerifySignedData.onWarmupCompleted());
        ((RecyclerView.ViewHolder) this).onNavigationEvent.setBackgroundColor(uST_CMS_VerifySignedData.onNavigationEvent());
    }
}
