package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Update_MakeTbsKurProtection implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final Toolbar IAuthTabCallbackDefault;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final SubTypography3 asInterface;
    public final ConstraintLayout onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final Typography5 onTransact;
    public final ConstraintLayout onWarmupCompleted;

    private CMP_Update_MakeTbsKurProtection(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout3, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull Typography5 typography5, @NonNull SubTypography3 subTypography3, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onExtraCallback = constraintLayout2;
        this.IAuthTabCallback = tdsImageView;
        this.onWarmupCompleted = constraintLayout3;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onTransact = typography5;
        this.asInterface = subTypography3;
        this.IAuthTabCallbackDefault = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMP_Update_MakeTbsKurProtection onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMP_Update_MakeTbsKurProtection onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_savingbox_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CMP_Update_MakeTbsKurProtection onWarmupCompleted(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        SubTypography3 subTypography3OnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.contentLayout))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.createSavingBoxBgImage))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.createSavingBoxContentLayout))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.createSavingBoxCta))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.createSavingBoxDesc))) != null && (subTypography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.createSavingBoxTitle))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CMP_Update_MakeTbsKurProtection((ConstraintLayout) view, appBarLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent2, tdsBottomCtaV1ViewOnNavigationEvent, typography5OnNavigationEvent, subTypography3OnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
