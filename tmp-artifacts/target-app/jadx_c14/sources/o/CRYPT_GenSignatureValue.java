package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_GenSignatureValue implements SearchBarKtExternalSyntheticLambda5 {
    public final BottomSheetHeader IAuthTabCallback;
    public final Typography5 onExtraCallback;
    private final ConstraintLayout onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CRYPT_GenSignatureValue(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull Typography5 typography5) {
        this.onNavigationEvent = constraintLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = bottomSheetHeader;
        this.onExtraCallback = typography5;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CRYPT_GenSignatureValue IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CRYPT_GenSignatureValue onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_account_transaction_exclude, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CRYPT_GenSignatureValue onNavigationEvent(@NonNull View view) {
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.message))) != null) {
            return new CRYPT_GenSignatureValue((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, bottomSheetHeaderOnNavigationEvent, typography5OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
