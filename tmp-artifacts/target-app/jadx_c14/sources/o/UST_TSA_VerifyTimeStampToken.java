package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSpace;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_TSA_VerifyTimeStampToken implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final TdsImageView IAuthTabCallbackDefault;
    public final TdsButtonV1View IAuthTabCallbackStub;
    public final TdsListRowV1View access000;
    public final Typography2 asBinder;
    public final Toolbar asInterface;
    private final ConstraintLayout getInterfaceDescriptor;
    public final Space onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final TdsSpace onTransact;
    public final Typography5 onWarmupCompleted;

    private UST_TSA_VerifyTimeStampToken(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography5 typography5, @NonNull Space space, @NonNull Typography5 typography52, @NonNull TdsImageView tdsImageView, @NonNull Typography2 typography2, @NonNull TdsSpace tdsSpace, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Toolbar toolbar, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.getInterfaceDescriptor = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onNavigationEvent = typography5;
        this.onExtraCallback = space;
        this.onWarmupCompleted = typography52;
        this.IAuthTabCallbackDefault = tdsImageView;
        this.asBinder = typography2;
        this.onTransact = tdsSpace;
        this.IAuthTabCallbackStub = tdsButtonV1View;
        this.asInterface = toolbar;
        this.access000 = tdsListRowV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.getInterfaceDescriptor;
    }

    public static UST_TSA_VerifyTimeStampToken onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static UST_TSA_VerifyTimeStampToken onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_abs_compact_send, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static UST_TSA_VerifyTimeStampToken onWarmupCompleted(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography2 typography2OnNavigationEvent;
        TdsSpace tdsSpaceOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        int i = R.id.appbarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.headerAlert;
            Typography5 typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (typography5OnNavigationEvent2 != null) {
                i = R.id.headerBottomSpace;
                Space space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (space != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerDescription))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerImage))) != null && (typography2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerTitle))) != null && (tdsSpaceOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerTopSpace))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.sendCta))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.withdrawAccountRow))) != null) {
                    return new UST_TSA_VerifyTimeStampToken(constraintLayout, appBarLayoutOnNavigationEvent, constraintLayout, typography5OnNavigationEvent2, space, typography5OnNavigationEvent, tdsImageViewOnNavigationEvent, typography2OnNavigationEvent, tdsSpaceOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
