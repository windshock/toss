package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_MakeTbsKurProtection extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMP_Update_MakeTbsKurProtection(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        TdsImageView tdsImageView = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsImageView, "");
        TdsImageView tdsImageView2 = tdsImageView;
        UST_CMP_Update_Kur uST_CMP_Update_Kur = (UST_CMP_Update_Kur) uST_CMS_EncryptedData;
        ViewGroup.LayoutParams layoutParams = tdsImageView2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float fOnExtraCallbackWithResult = uST_CMP_Update_Kur.onExtraCallbackWithResult();
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnExtraCallbackWithResult), displayMetrics);
            float fOnExtraCallbackWithResult2 = uST_CMP_Update_Kur.onExtraCallbackWithResult();
            DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            marginLayoutParams.rightMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnExtraCallbackWithResult2), displayMetrics2);
            tdsImageView2.setLayoutParams(marginLayoutParams);
            tdsImageView2.setAdjustViewBounds(true);
            if (uST_CMP_Update_Kur.onNavigationEvent().length() > 0) {
                TdsImageView.setImage$default(tdsImageView2, uST_CMP_Update_Kur.onNavigationEvent(), (Function1) null, (Function1) null, 6, (Object) null);
                return;
            } else {
                tdsImageView2.setImageResource(uST_CMP_Update_Kur.onWarmupCompleted());
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
