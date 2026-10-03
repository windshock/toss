package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_AsymmEncryptWithCert extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_AsymmEncryptWithCert(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_AsymmEncrypt uST_CRYPT_AsymmEncrypt = (UST_CRYPT_AsymmEncrypt) uST_CMS_EncryptedData;
        TdsTopV1T05View tdsTopV1T05View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsTopV1T05View, "");
        TdsTopV1T05View tdsTopV1T05View2 = tdsTopV1T05View;
        UST_CMP_Revoke_Rp.onExtraCallbackWithResult(tdsTopV1T05View2, uST_CRYPT_AsymmEncrypt.onWarmupCompleted(), uST_CRYPT_AsymmEncrypt.onNavigationEvent());
        tdsTopV1T05View2.setPadding(varyMatches.IAuthTabCallback(tdsTopV1T05View2, 24), varyMatches.IAuthTabCallback(tdsTopV1T05View2, Float.valueOf(uST_CRYPT_AsymmEncrypt.onExtraCallbackWithResult())), varyMatches.IAuthTabCallback(tdsTopV1T05View2, 24), 0);
    }
}
