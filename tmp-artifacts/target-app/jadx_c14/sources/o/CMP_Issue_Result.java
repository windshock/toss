package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsProgressBarV0View;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import viva.republica.toss.R;
import viva.republica.toss.plcc.view.showcase.PlccDateSelectView;
import viva.republica.toss.widget.LottiePlayCountAnimationView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Issue_Result implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    public final TdsButtonV1View IAuthTabCallbackDefault;
    public final Typography3 IAuthTabCallbackStub;
    public final TdsProgressBarV0View IAuthTabCallbackStubProxy;
    public final LinearLayout IAuthTabCallback_Parcel;
    public final TdsTabV1View ICustomTabsCallback;
    public final Typography5 ICustomTabsCallbackStub;
    public final LottiePlayCountAnimationView access000;
    public final Typography7 access100;
    public final Typography5 asBinder;
    public final TdsResultV0View asInterface;
    public final TdsSkeletonV1View extraCallback;
    public final ConstraintLayout extraCallbackWithResult;
    public final Typography7 getInterfaceDescriptor;
    public final LinearLayout onActivityLayout;
    public final TdsRoundLayout onActivityResized;
    public final TdsBadgeV1View onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final TdsRoundLayout onMessageChannelReady;
    public final ScrollView onMinimized;
    public final LinearLayout onNavigationEvent;
    public final LinearLayout onPostMessage;
    private final LinearLayout onRelationshipValidationResult;
    public final LinearLayout onTransact;
    public final PlccDateSelectView onUnminimized;
    public final AppBarLayout onWarmupCompleted;
    public final ScrollView readTypedObject;
    public final Toolbar writeTypedObject;

    private CMP_Issue_Result(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBadgeV1View tdsBadgeV1View, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull Typography5 typography5, @NonNull TdsResultV0View tdsResultV0View, @NonNull Typography3 typography3, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull LottiePlayCountAnimationView lottiePlayCountAnimationView, @NonNull TdsProgressBarV0View tdsProgressBarV0View, @NonNull LinearLayout linearLayout6, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull TdsSkeletonV1View tdsSkeletonV1View, @NonNull TdsTabV1View tdsTabV1View, @NonNull Toolbar toolbar, @NonNull ConstraintLayout constraintLayout, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout7, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull LinearLayout linearLayout8, @NonNull ScrollView scrollView2, @NonNull PlccDateSelectView plccDateSelectView, @NonNull Typography5 typography52) {
        this.onRelationshipValidationResult = linearLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallback = tdsBadgeV1View;
        this.onNavigationEvent = linearLayout2;
        this.IAuthTabCallback = linearLayout3;
        this.onExtraCallbackWithResult = linearLayout4;
        this.onTransact = linearLayout5;
        this.asBinder = typography5;
        this.asInterface = tdsResultV0View;
        this.IAuthTabCallbackStub = typography3;
        this.IAuthTabCallbackDefault = tdsButtonV1View;
        this.access000 = lottiePlayCountAnimationView;
        this.IAuthTabCallbackStubProxy = tdsProgressBarV0View;
        this.IAuthTabCallback_Parcel = linearLayout6;
        this.getInterfaceDescriptor = typography7;
        this.access100 = typography72;
        this.extraCallback = tdsSkeletonV1View;
        this.ICustomTabsCallback = tdsTabV1View;
        this.writeTypedObject = toolbar;
        this.extraCallbackWithResult = constraintLayout;
        this.readTypedObject = scrollView;
        this.onPostMessage = linearLayout7;
        this.onMessageChannelReady = tdsRoundLayout;
        this.onActivityResized = tdsRoundLayout2;
        this.onActivityLayout = linearLayout8;
        this.onMinimized = scrollView2;
        this.onUnminimized = plccDateSelectView;
        this.ICustomTabsCallbackStub = typography52;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onRelationshipValidationResult;
    }

    public static CMP_Issue_Result IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMP_Issue_Result onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_benefit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMP_Issue_Result onExtraCallbackWithResult(@NonNull View view) {
        TdsBadgeV1View tdsBadgeV1ViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        TdsResultV0View tdsResultV0ViewOnNavigationEvent;
        Typography3 typography3OnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        LottiePlayCountAnimationView lottiePlayCountAnimationViewOnNavigationEvent;
        TdsProgressBarV0View tdsProgressBarV0ViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        TdsSkeletonV1View tdsSkeletonV1ViewOnNavigationEvent;
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent2;
        Typography5 typography5OnNavigationEvent2;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBadgeV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.badge))) != null) {
            i = R.id.benefit_container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                i = R.id.benefit_description_content;
                LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout2 != null) {
                    i = R.id.container;
                    LinearLayout linearLayout3 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.content;
                        LinearLayout linearLayout4 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (linearLayout4 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.description_text_button))) != null && (tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.empty_container))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.hero_close))) != null && (lottiePlayCountAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.ic_recommend_lottie_card))) != null && (tdsProgressBarV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progress))) != null) {
                            i = R.id.progress_content;
                            LinearLayout linearLayout5 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                            if (linearLayout5 != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progress_left_text))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progress_right_text))) != null && (tdsSkeletonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.skeletonView))) != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tab))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                                i = R.id.view_benefit;
                                ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                if (scrollView != null) {
                                    i = R.id.view_benefit_bill;
                                    LinearLayout linearLayout6 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                    if (linearLayout6 != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_benefit_current_month_hero))) != null && (tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_benefit_description))) != null) {
                                        i = R.id.view_benefit_info;
                                        LinearLayout linearLayout7 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                        if (linearLayout7 != null) {
                                            i = R.id.view_bill_list;
                                            ScrollView scrollView2 = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                            if (scrollView2 != null) {
                                                i = R.id.view_date_select;
                                                PlccDateSelectView plccDateSelectView = (PlccDateSelectView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                                                if (plccDateSelectView != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_hero_title))) != null) {
                                                    return new CMP_Issue_Result((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsBadgeV1ViewOnNavigationEvent, linearLayout, linearLayout2, linearLayout3, linearLayout4, typography5OnNavigationEvent, tdsResultV0ViewOnNavigationEvent, typography3OnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, lottiePlayCountAnimationViewOnNavigationEvent, tdsProgressBarV0ViewOnNavigationEvent, linearLayout5, typography7OnNavigationEvent, typography7OnNavigationEvent2, tdsSkeletonV1ViewOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, toolbarOnNavigationEvent, constraintLayoutOnNavigationEvent, scrollView, linearLayout6, tdsRoundLayoutOnNavigationEvent, tdsRoundLayoutOnNavigationEvent2, linearLayout7, scrollView2, plccDateSelectView, typography5OnNavigationEvent2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
