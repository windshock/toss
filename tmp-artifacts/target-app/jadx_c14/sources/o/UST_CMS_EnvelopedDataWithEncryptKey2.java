package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.post.ParagraphSmall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_EnvelopedDataWithEncryptKey2 extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_EnvelopedDataWithEncryptKey2(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_EnvelopedData2 uST_CMS_EnvelopedData2 = uST_CMS_EncryptedData instanceof UST_CMS_EnvelopedData2 ? (UST_CMS_EnvelopedData2) uST_CMS_EncryptedData : null;
        if (uST_CMS_EnvelopedData2 != null) {
            ParagraphSmall paragraphSmall = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            ParagraphSmall paragraphSmall2 = paragraphSmall instanceof ParagraphSmall ? paragraphSmall : null;
            if (paragraphSmall2 != null) {
                paragraphSmall2.setBackgroundColor(uST_CMS_EnvelopedData2.onWarmupCompleted());
                paragraphSmall2.setTextColor(uST_CMS_EnvelopedData2.onNavigationEvent());
                paragraphSmall2.setText(uST_CMS_EnvelopedData2.onExtraCallbackWithResult());
            }
        }
    }
}
