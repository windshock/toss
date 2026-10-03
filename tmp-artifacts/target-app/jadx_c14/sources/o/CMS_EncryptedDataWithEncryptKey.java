package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_EncryptedDataWithEncryptKey implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    public final LinearLayout asBinder;
    public final Toolbar asInterface;
    public final TdsScrollView onExtraCallback;
    public final TdsTopV1View onExtraCallbackWithResult;
    public final KeyboardBottomCta onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final AppBarLayout onWarmupCompleted;

    private CMS_EncryptedDataWithEncryptKey(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TdsTopV1View tdsTopV1View, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsScrollView tdsScrollView, @NonNull Toolbar toolbar, @NonNull LinearLayout linearLayout) {
        this.onTransact = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onNavigationEvent = keyboardBottomCta;
        this.onExtraCallbackWithResult = tdsTopV1View;
        this.IAuthTabCallback = tdsListRowV1View;
        this.onExtraCallback = tdsScrollView;
        this.asInterface = toolbar;
        this.asBinder = linearLayout;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static CMS_EncryptedDataWithEncryptKey onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMS_EncryptedDataWithEncryptKey onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_dutch_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMS_EncryptedDataWithEncryptKey onExtraCallbackWithResult(@NonNull View view) {
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        TdsScrollView tdsScrollViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appbar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_cta))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.payments_row))) != null && (tdsScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scroll_view))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            i = R.id.user_container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                return new CMS_EncryptedDataWithEncryptKey((ConstraintLayout) view, appBarLayoutOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, tdsScrollViewOnNavigationEvent, toolbarOnNavigationEvent, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
