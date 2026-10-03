package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_AdditionalInfo extends UST_CRYPT_VerifyHASH {
    private final TdsBadgeV1View extraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMP_Issue_AdditionalInfo(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = view.findViewById(R.id.badge);
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMP_IssueCertificate_NoConf uST_CMP_IssueCertificate_NoConf = uST_CMS_EncryptedData instanceof UST_CMP_IssueCertificate_NoConf ? (UST_CMP_IssueCertificate_NoConf) uST_CMS_EncryptedData : null;
        if (uST_CMP_IssueCertificate_NoConf == null) {
            return;
        }
        TdsBadgeV1View tdsBadgeV1View = this.extraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
        ViewGroup.LayoutParams layoutParams = tdsBadgeV1View.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = uST_CMP_IssueCertificate_NoConf.onWarmupCompleted();
            }
            tdsBadgeV1View.setLayoutParams(layoutParams);
            Function1<TdsBadgeV1View, Unit> function1OnNavigationEvent = uST_CMP_IssueCertificate_NoConf.onNavigationEvent();
            TdsBadgeV1View tdsBadgeV1View2 = this.extraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View2, "");
            function1OnNavigationEvent.invoke(tdsBadgeV1View2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
