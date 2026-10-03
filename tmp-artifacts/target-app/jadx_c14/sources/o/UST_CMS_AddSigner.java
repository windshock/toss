package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.post.Heading4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_AddSigner extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_AddSigner(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMP_Update_Result uST_CMP_Update_Result = uST_CMS_EncryptedData instanceof UST_CMP_Update_Result ? (UST_CMP_Update_Result) uST_CMS_EncryptedData : null;
        if (uST_CMP_Update_Result != null) {
            Heading4 heading4 = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            Heading4 heading42 = heading4 instanceof Heading4 ? heading4 : null;
            if (heading42 != null) {
                heading42.setBackgroundColor(uST_CMP_Update_Result.onWarmupCompleted());
                heading42.setText(uST_CMP_Update_Result.onNavigationEvent());
            }
        }
    }
}
