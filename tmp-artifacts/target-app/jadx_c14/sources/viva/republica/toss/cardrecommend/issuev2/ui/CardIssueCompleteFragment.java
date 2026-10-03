package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.core.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.DynamicLoader;
import o.EncryptionScheme;
import o.FileUtilsParentDirNotFoundException;
import o.IPostMessageServiceStubProxy;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RecomposerawaitIdle2;
import o.RemoteServiceWrapperRemoteServiceConnection;
import o.SessionTrackerb;
import o.TypographyKtExternalSyntheticLambda0;
import o.createAdSizeApi;
import o.deprecated_authenticator;
import o.extraCommand;
import o.getDigestAlgorithms;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueCompleteFragment extends Hilt_CardIssueCompleteFragment<EncryptionScheme> {

    @Inject
    public SessionTrackerb tossRouter;

    public final SessionTrackerb onWarmupCompleted() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return onExtraCallback();
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IPostMessageServiceStubProxy supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            supportActionBar.onNavigationEvent(R.drawable.icn_navigation_close);
        }
        extraCommand.IAuthTabCallback(requireBaseActivity().getOnBackPressedDispatcher(), this, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCompleteFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueCompleteFragment.onNavigationEvent(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueCompleteFragment cardIssueCompleteFragment, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        cardIssueCompleteFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onExtraCallback() {
        Pair pair;
        String strOnExtraCallbackWithResult;
        String strOnNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ConstraintLayout constraintLayout = new ConstraintLayout(contextRequireContext);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, 0);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        tdsScrollView.setLayoutParams(layoutParams);
        tdsScrollView.setId(View.generateViewId());
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
        tdsTopV1View.setUpperText(((EncryptionScheme) readTypedObject()).onTransact());
        tdsTopV1View.setLowerText(((EncryptionScheme) readTypedObject()).asInterface());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        marginLayoutParams.width = varyMatches.onNavigationEvent(180, displayMetrics);
        marginLayoutParams.height = -2;
        tdsImageView.setLayoutParams(layoutParams2);
        linearLayout.setGravity(1);
        DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsImageView, varyMatches.onNavigationEvent(50, displayMetrics2));
        DisplayMetrics displayMetrics3 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsImageView, varyMatches.onNavigationEvent(50, displayMetrics3));
        if (((EncryptionScheme) readTypedObject()).onExtraCallbackWithResult().IAuthTabCallback()) {
            DisplayMetrics displayMetrics4 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(180, displayMetrics4);
            DisplayMetrics displayMetrics5 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            pair = new Pair(Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(113, displayMetrics5)));
        } else {
            DisplayMetrics displayMetrics6 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(113, displayMetrics6);
            DisplayMetrics displayMetrics7 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
            pair = new Pair(Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(180, displayMetrics7)));
        }
        int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) pair.IAuthTabCallback()).intValue();
        Context context5 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView.setImage$default(tdsImageView, new RecomposerawaitIdle2.onNavigationEvent(context5).onExtraCallback(((EncryptionScheme) readTypedObject()).onExtraCallbackWithResult().onNavigationEvent()).onExtraCallback(iIntValue, iIntValue2), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        for (FileUtilsParentDirNotFoundException fileUtilsParentDirNotFoundException : ((EncryptionScheme) readTypedObject()).IAuthTabCallbackStub()) {
            Context context6 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context6, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            DisplayMetrics displayMetrics8 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics8);
            DisplayMetrics displayMetrics9 = tdsListRowV1View.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
            tdsListRowV1View.setLeftImageSize(iOnNavigationEvent3, varyMatches.onNavigationEvent(24, displayMetrics9));
            tdsListRowV1View.setLeftImage(deprecated_authenticator.onWarmupCompleted(fileUtilsParentDirNotFoundException.onNavigationEvent()));
            tdsListRowV1View.setCenterText1(fileUtilsParentDirNotFoundException.onWarmupCompleted());
            tdsListRowV1View.setCenterText2(fileUtilsParentDirNotFoundException.onExtraCallbackWithResult());
            tdsListRowV1View.setCenterText2MaxLines(3);
            final RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnectionOnExtraCallback = fileUtilsParentDirNotFoundException.onExtraCallback();
            if (remoteServiceWrapperRemoteServiceConnectionOnExtraCallback != null && (strOnExtraCallbackWithResult = remoteServiceWrapperRemoteServiceConnectionOnExtraCallback.onExtraCallbackWithResult()) != null && strOnExtraCallbackWithResult.length() != 0 && (strOnNavigationEvent = remoteServiceWrapperRemoteServiceConnectionOnExtraCallback.onNavigationEvent()) != null && strOnNavigationEvent.length() != 0) {
                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BUTTON);
                tdsListRowV1View.setRightButtonType(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY);
                tdsListRowV1View.setRightButtonStyle(TdsButtonV1View.IAuthTabCallbackDefault.WEAK);
                tdsListRowV1View.setRightButtonSize(TdsButtonV1View.onWarmupCompleted.SMALL);
                tdsListRowV1View.setRightButtonLabel(remoteServiceWrapperRemoteServiceConnectionOnExtraCallback.onNavigationEvent());
                tdsListRowV1View.setRightOnButtonClickListener(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCompleteFragment$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return CardIssueCompleteFragment.onExtraCallback(remoteServiceWrapperRemoteServiceConnectionOnExtraCallback, this, (View) obj);
                    }
                });
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, tdsScrollView);
        Context context7 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
        tdsBottomCtaV1View.setId(View.generateViewId());
        String strOnWarmupCompleted = ((EncryptionScheme) readTypedObject()).onWarmupCompleted().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            tdsBottomCtaV1View.setTopDescription(strOnWarmupCompleted);
        }
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, ((EncryptionScheme) readTypedObject()).onWarmupCompleted().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCompleteFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueCompleteFragment.onWarmupCompleted(this.f$0, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        if (((EncryptionScheme) readTypedObject()).onWarmupCompleted().onNavigationEvent() != null) {
            DynamicLoader dynamicLoaderOnNavigationEvent = ((EncryptionScheme) readTypedObject()).onWarmupCompleted().onNavigationEvent();
            Intrinsics.checkNotNull(dynamicLoaderOnNavigationEvent);
            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCompleteFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return CardIssueCompleteFragment.IAuthTabCallback(this.f$0, tdsBottomCtaV1View, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, tdsBottomCtaV1View);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(constraintLayout);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(tdsBottomCtaV1View.getId(), 4, 0, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(tdsScrollView.getId(), 3, 0, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(tdsScrollView.getId(), 4, tdsBottomCtaV1View.getId(), 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(constraintLayout);
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection, CardIssueCompleteFragment cardIssueCompleteFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        String strOnExtraCallbackWithResult = remoteServiceWrapperRemoteServiceConnection.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null && strOnExtraCallbackWithResult.length() != 0) {
            SessionTrackerb.IAuthTabCallback(cardIssueCompleteFragment.onWarmupCompleted(), cardIssueCompleteFragment.requireBaseActivity(), remoteServiceWrapperRemoteServiceConnection.onExtraCallbackWithResult(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(CardIssueCompleteFragment cardIssueCompleteFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onExtraCallback().onWarmupCompleted() instanceof createAdSizeApi.onWarmupCompleted) {
            getDigestAlgorithms.onExtraCallback(cardIssueCompleteFragment.writeTypedObject(), PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), cardIssueCompleteFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onExtraCallback().onNavigationEvent(), (Map) null, 40, (Object) null);
        } else {
            getDigestAlgorithms.onExtraCallbackWithResult(cardIssueCompleteFragment.writeTypedObject(), PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onExtraCallback().onWarmupCompleted(), cardIssueCompleteFragment.extraCallback(), ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onExtraCallback().onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(CardIssueCompleteFragment cardIssueCompleteFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        DynamicLoader dynamicLoaderOnNavigationEvent = ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onNavigationEvent();
        if ((dynamicLoaderOnNavigationEvent != null ? dynamicLoaderOnNavigationEvent.onWarmupCompleted() : null) instanceof createAdSizeApi.onWarmupCompleted) {
            getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = cardIssueCompleteFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueCompleteFragment.extraCallback();
            DynamicLoader dynamicLoaderOnNavigationEvent2 = ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onNavigationEvent();
            Intrinsics.checkNotNull(dynamicLoaderOnNavigationEvent2);
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, cardIssueOverviewViewModelExtraCallback, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, dynamicLoaderOnNavigationEvent2.onNavigationEvent(), (Map) null, 40, (Object) null);
        } else {
            getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject2 = cardIssueCompleteFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult2 = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View);
            DynamicLoader dynamicLoaderOnNavigationEvent3 = ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onNavigationEvent();
            createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoaderOnNavigationEvent3 != null ? dynamicLoaderOnNavigationEvent3.onWarmupCompleted() : null;
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback2 = cardIssueCompleteFragment.extraCallback();
            DynamicLoader dynamicLoaderOnNavigationEvent4 = ((EncryptionScheme) cardIssueCompleteFragment.readTypedObject()).onWarmupCompleted().onNavigationEvent();
            Intrinsics.checkNotNull(dynamicLoaderOnNavigationEvent4);
            getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject2, typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult2, createadsizeapiOnWarmupCompleted, cardIssueOverviewViewModelExtraCallback2, dynamicLoaderOnNavigationEvent4.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
