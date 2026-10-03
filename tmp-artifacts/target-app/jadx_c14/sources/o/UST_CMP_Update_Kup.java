package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_Kup extends UST_CRYPT_VerifyHASH {
    private final View ICustomTabsCallback;
    private final View extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMP_Update_Kup(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.ICustomTabsCallback = view.findViewById(R.id.fullSizeDivider);
        this.extraCallback = view.findViewById(R.id.leftMarginDivider);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMP_Update_GenmGenpNPOPOSigningKeyInput uST_CMP_Update_GenmGenpNPOPOSigningKeyInput = uST_CMS_EncryptedData instanceof UST_CMP_Update_GenmGenpNPOPOSigningKeyInput ? (UST_CMP_Update_GenmGenpNPOPOSigningKeyInput) uST_CMS_EncryptedData : null;
        if (uST_CMP_Update_GenmGenpNPOPOSigningKeyInput == null) {
            return;
        }
        if (uST_CMP_Update_GenmGenpNPOPOSigningKeyInput.onNavigationEvent()) {
            View view = this.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            View view2 = this.extraCallback;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            return;
        }
        View view3 = this.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        view3.setVisibility(8);
        View view4 = this.extraCallback;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        view4.setVisibility(0);
    }
}
