package o;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.UST_CRYPT_ECDHKeyAgreement;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_ECDHKeyAgreement extends UST_CRYPT_VerifyHASH {
    private final View ICustomTabsCallback;
    private final TextView extraCallback;
    private final TextView onPostMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_ECDHKeyAgreement(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = (TextView) view.findViewById(R.id.tv_title);
        this.onPostMessage = (TextView) view.findViewById(R.id.tv_button);
        this.ICustomTabsCallback = view.findViewById(R.id.iv_top_arrow);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CRYPT_DestroyKey uST_CRYPT_DestroyKey = uST_CMS_EncryptedData instanceof UST_CRYPT_DestroyKey ? (UST_CRYPT_DestroyKey) uST_CMS_EncryptedData : null;
        if (uST_CRYPT_DestroyKey == null) {
            return;
        }
        if (uST_CRYPT_DestroyKey.onWarmupCompleted()) {
            this.onPostMessage.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.TopButtonViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UST_CRYPT_ECDHKeyAgreement.onExtraCallback(this.f$0, view);
                }
            });
            this.ICustomTabsCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.TopButtonViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UST_CRYPT_ECDHKeyAgreement.onExtraCallbackWithResult(this.f$0, view);
                }
            });
        }
        this.extraCallback.setText(uST_CRYPT_DestroyKey.onNavigationEvent());
        this.extraCallback.setTextSize(2, 22.0f);
        if (!StringsKt.isBlank(uST_CRYPT_DestroyKey.onExtraCallbackWithResult())) {
            this.onPostMessage.setText(uST_CRYPT_DestroyKey.onExtraCallbackWithResult());
            TextView textView = this.onPostMessage;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            View view = this.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            return;
        }
        TextView textView2 = this.onPostMessage;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        View view2 = this.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(UST_CRYPT_ECDHKeyAgreement uST_CRYPT_ECDHKeyAgreement, View view) {
        uST_CRYPT_ECDHKeyAgreement.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(UST_CRYPT_ECDHKeyAgreement uST_CRYPT_ECDHKeyAgreement, View view) {
        uST_CRYPT_ECDHKeyAgreement.onExtraCallbackWithResult();
    }
}
