package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.MaxHeightRecyclerView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_VerifySign implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    private final LinearLayout onExtraCallback;
    public final MaxHeightRecyclerView onNavigationEvent;

    private CRYPT_VerifySign(@NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull MaxHeightRecyclerView maxHeightRecyclerView) {
        this.onExtraCallback = linearLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = maxHeightRecyclerView;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallback;
    }

    public static CRYPT_VerifySign onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CRYPT_VerifySign onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_transfer_dutch_payments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CRYPT_VerifySign onNavigationEvent(@NonNull View view) {
        MaxHeightRecyclerView maxHeightRecyclerViewOnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (maxHeightRecyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recycler_view))) != null) {
            return new CRYPT_VerifySign((LinearLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, maxHeightRecyclerViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
