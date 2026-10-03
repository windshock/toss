package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TdsSearchFieldV1View;
import viva.republica.toss.R;
import viva.republica.toss.send.v3.view.TouchRecyclerView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_MakePKCS9AuthAttributes implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final TdsSearchFieldV1View IAuthTabCallbackDefault;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final RecyclerView asBinder;
    public final TdsResultV0View asInterface;
    public final View onExtraCallback;
    public final TouchRecyclerView onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final Toolbar onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CMS_MakePKCS9AuthAttributes(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TouchRecyclerView touchRecyclerView, @NonNull LinearLayout linearLayout, @NonNull TdsResultV0View tdsResultV0View, @NonNull TdsSearchFieldV1View tdsSearchFieldV1View, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallback = view;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = touchRecyclerView;
        this.onNavigationEvent = linearLayout;
        this.asInterface = tdsResultV0View;
        this.IAuthTabCallbackDefault = tdsSearchFieldV1View;
        this.asBinder = recyclerView;
        this.onTransact = toolbar;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMS_MakePKCS9AuthAttributes onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMS_MakePKCS9AuthAttributes onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_dutch_invite, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CMS_MakePKCS9AuthAttributes onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TouchRecyclerView touchRecyclerViewOnNavigationEvent;
        TdsResultV0View tdsResultV0ViewOnNavigationEvent;
        TdsSearchFieldV1View tdsSearchFieldV1ViewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.border))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_cta))) != null && (touchRecyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.contact_list_view))) != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.empty_view))) != null && (tdsSearchFieldV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_contact_field))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.selected_list_view))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CMS_MakePKCS9AuthAttributes((ConstraintLayout) view, appBarLayoutOnNavigationEvent, viewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, touchRecyclerViewOnNavigationEvent, linearLayout, tdsResultV0ViewOnNavigationEvent, tdsSearchFieldV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
