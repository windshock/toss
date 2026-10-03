package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMS_GetPubEncryptKeyWithEnvelopedData extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CMS_GetPubEncryptKeyWithEnvelopedData(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        UST_CMS_GetCertWithSignedData uST_CMS_GetCertWithSignedData = (UST_CMS_GetCertWithSignedData) uST_CMS_EncryptedData;
        ((RecyclerView.ViewHolder) this).onNavigationEvent.setBackgroundColor(uST_CMS_GetCertWithSignedData.onWarmupCompleted());
        View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        float fOnNavigationEvent = uST_CMS_GetCertWithSignedData.onNavigationEvent();
        DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, varyMatches.onNavigationEvent(Float.valueOf(fOnNavigationEvent), displayMetrics)));
        Function1<View, Unit> function1OnExtraCallbackWithResult = uST_CMS_GetCertWithSignedData.onExtraCallbackWithResult();
        if (function1OnExtraCallbackWithResult != null) {
            View view2 = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            function1OnExtraCallbackWithResult.invoke(view2);
        }
    }
}
