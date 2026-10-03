package o;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_Decrypt extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_Decrypt(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_AsymmDecryptWithCert uST_CRYPT_AsymmDecryptWithCert = (UST_CRYPT_AsymmDecryptWithCert) uST_CMS_EncryptedData;
        View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(view, "");
        TextView textView = (TextView) view;
        UST_CMP_Revoke_Rp.onExtraCallbackWithResult(textView, uST_CRYPT_AsymmDecryptWithCert.onWarmupCompleted(), uST_CRYPT_AsymmDecryptWithCert.onExtraCallbackWithResult());
        Function1<TextView, Unit> function1OnNavigationEvent = uST_CRYPT_AsymmDecryptWithCert.onNavigationEvent();
        if (function1OnNavigationEvent != null) {
            function1OnNavigationEvent.invoke(textView);
        }
    }
}
