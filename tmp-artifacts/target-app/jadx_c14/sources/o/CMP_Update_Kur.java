package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Update_Kur implements SearchBarKtExternalSyntheticLambda5 {
    public final BankListView IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    public final NestedScrollView onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CMP_Update_Kur(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull BankListView bankListView, @NonNull NestedScrollView nestedScrollView, @NonNull Toolbar toolbar) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = bankListView;
        this.onExtraCallbackWithResult = nestedScrollView;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CMP_Update_Kur IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CMP_Update_Kur onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_select_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMP_Update_Kur onExtraCallbackWithResult(@NonNull View view) {
        BankListView bankListViewOnNavigationEvent;
        NestedScrollView nestedScrollViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (bankListViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankList))) != null && (nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scrollView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CMP_Update_Kur((ConstraintLayout) view, appBarLayoutOnNavigationEvent, bankListViewOnNavigationEvent, nestedScrollViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
