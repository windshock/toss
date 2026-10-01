package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RowCoinVerificationAccountListHeaderBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1T03View onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsTopV1T05View onWarmupCompleted;

    private RowCoinVerificationAccountListHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TdsTopV1T05View tdsTopV1T05View, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onWarmupCompleted = tdsTopV1T05View;
        this.onExtraCallback = tdsTopV1T03View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static RowCoinVerificationAccountListHeaderBinding IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_coin_verification_account_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static RowCoinVerificationAccountListHeaderBinding IAuthTabCallback(@NonNull View view) {
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.descriptionView;
        TdsTopV1T05View tdsTopV1T05ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsTopV1T05ViewOnNavigationEvent != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleView))) != null) {
            return new RowCoinVerificationAccountListHeaderBinding((ConstraintLayout) view, tdsTopV1T05ViewOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
