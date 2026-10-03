package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.credit.commons.TextButtonViewHolder$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GenSignatureValue extends UST_CRYPT_VerifyHASH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST_CRYPT_GenSignatureValue(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new TextButtonViewHolder$.ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(UST_CRYPT_GenSignatureValue uST_CRYPT_GenSignatureValue, View view) {
        uST_CRYPT_GenSignatureValue.onExtraCallbackWithResult();
    }

    @Override // o.UST_CRYPT_VerifyHASH, o.UST_CRYPT_VerifyMAC
    /* renamed from: onWarmupCompleted */
    public void IAuthTabCallback(@NotNull UST_CMS_EncryptedData uST_CMS_EncryptedData) {
        Intrinsics.checkNotNullParameter(uST_CMS_EncryptedData, "");
        super.IAuthTabCallback(uST_CMS_EncryptedData);
        TdsTextButtonV0View tdsTextButtonV0View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsTextButtonV0View, "");
        TdsTextButtonV0View tdsTextButtonV0View2 = tdsTextButtonV0View;
        UST_CRYPT_AsymmDecrypt uST_CRYPT_AsymmDecrypt = (UST_CRYPT_AsymmDecrypt) uST_CMS_EncryptedData;
        uST_CRYPT_AsymmDecrypt.onExtraCallbackWithResult().invoke(tdsTextButtonV0View2);
        ViewGroup.LayoutParams layoutParams = tdsTextButtonV0View2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float fOnNavigationEvent = uST_CRYPT_AsymmDecrypt.onNavigationEvent();
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnNavigationEvent), displayMetrics);
            float fOnNavigationEvent2 = uST_CRYPT_AsymmDecrypt.onNavigationEvent();
            DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) this).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            marginLayoutParams.rightMargin = varyMatches.onNavigationEvent(Float.valueOf(fOnNavigationEvent2), displayMetrics2);
            tdsTextButtonV0View2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
