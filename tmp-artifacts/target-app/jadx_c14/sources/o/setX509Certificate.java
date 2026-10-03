package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setX509Certificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final Typography5 onExtraCallback;
    public final TdsImageView onNavigationEvent;
    private final LinearLayout onWarmupCompleted;

    private setX509Certificate(@NonNull LinearLayout linearLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull Typography5 typography5) {
        this.onWarmupCompleted = linearLayout;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = tdsImageView2;
        this.onExtraCallback = typography5;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static setX509Certificate onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.home_year_month_select_legacy_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static setX509Certificate onWarmupCompleted(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        int i = R.id.ivYearMonthNext;
        TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.ivYearMonthPrevious))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.typoYearMonth))) != null) {
            return new setX509Certificate((LinearLayout) view, tdsImageViewOnNavigationEvent2, tdsImageViewOnNavigationEvent, typography5OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
