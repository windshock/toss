package o;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenSignatureValueWithDigest extends UST_CRYPT_VerifyHASH {
    private final View ICustomTabsCallback;
    private final TextView extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_GenSignatureValueWithDigest(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsCallback = view.findViewById(R.id.rootView);
        this.extraCallback = (TextView) view.findViewById(R.id.text);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_Encrypt uST_CRYPT_Encrypt = (UST_CRYPT_Encrypt) uST_CMS_EncryptedData;
        this.extraCallback.setGravity(uST_CRYPT_Encrypt.onWarmupCompleted());
        TextView textView = this.extraCallback;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        UST_CMP_Revoke_Rp.onExtraCallbackWithResult(textView, uST_CRYPT_Encrypt.onNavigationEvent(), uST_CRYPT_Encrypt.IAuthTabCallbackDefault());
        Integer numOnExtraCallbackWithResult = uST_CRYPT_Encrypt.onExtraCallbackWithResult();
        if (numOnExtraCallbackWithResult != null) {
            this.ICustomTabsCallback.setBackgroundColor(numOnExtraCallbackWithResult.intValue());
        }
    }
}
