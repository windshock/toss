package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.credit.commons.ButtonViewHolder$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_IrIp extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMP_Issue_IrIp(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new ButtonViewHolder$.ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(UST_CMP_Issue_IrIp uST_CMP_Issue_IrIp, View view) {
        uST_CMP_Issue_IrIp.onExtraCallbackWithResult();
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        TdsButtonV1View tdsButtonV1View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsButtonV1View, "");
        TdsButtonV1View tdsButtonV1View2 = tdsButtonV1View;
        UST_CMP_Issue_IrIpWithVIDR uST_CMP_Issue_IrIpWithVIDR = (UST_CMP_Issue_IrIpWithVIDR) uST_CMS_EncryptedData;
        uST_CMP_Issue_IrIpWithVIDR.onExtraCallbackWithResult().invoke(tdsButtonV1View2);
        ViewGroup.LayoutParams layoutParams = tdsButtonV1View2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float fOnWarmupCompleted = uST_CMP_Issue_IrIpWithVIDR.onWarmupCompleted();
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnWarmupCompleted), displayMetrics);
            float fOnWarmupCompleted2 = uST_CMP_Issue_IrIpWithVIDR.onWarmupCompleted();
            DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            marginLayoutParams.rightMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnWarmupCompleted2), displayMetrics2);
            tdsButtonV1View2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
