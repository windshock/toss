package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Issue_IrIp implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsRoundLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar asBinder;
    public final TdsTopV1View asInterface;
    public final AppBarLayout onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CMP_Issue_IrIp(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = tdsRoundLayout;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.asBinder = toolbar;
        this.asInterface = tdsTopV1View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMP_Issue_IrIp onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMP_Issue_IrIp onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pedometer_permission_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMP_Issue_IrIp IAuthTabCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideView))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.icon_activity))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new CMP_Issue_IrIp(constraintLayout, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
