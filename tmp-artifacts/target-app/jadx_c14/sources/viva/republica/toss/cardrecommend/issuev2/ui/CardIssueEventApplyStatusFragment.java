package viva.republica.toss.cardrecommend.issuev2.ui;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.PBES2Algorithms;
import o.PKCS12_GetCertWithPFX;
import o.PageContext;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.addAllCommandLine;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.preFillDefault;
import o.setCTATextColor;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueEventApplyStatusFragment extends CardIssueBaseFragment<PBES2Algorithms> {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueEventApplyStatusFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueEventApplyStatusBinding;", 0)};
    public static final int onWarmupCompleted = 8;
    private final PageContext onNavigationEvent;

    public CardIssueEventApplyStatusFragment() {
        super(R.layout.fragment_card_issue_event_apply_status);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onWarmupCompleted);
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, PKCS12_GetCertWithPFX> {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
            super(1, PKCS12_GetCertWithPFX.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueEventApplyStatusBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final PKCS12_GetCertWithPFX invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return PKCS12_GetCertWithPFX.onExtraCallback(view);
        }
    }

    private final PKCS12_GetCertWithPFX onWarmupCompleted() {
        return (PKCS12_GetCertWithPFX) this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        Integer numOnWarmupCompleted;
        Integer numOnNavigationEvent;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final PBES2Algorithms pBES2Algorithms = (PBES2Algorithms) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onExtraCallback;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setTitleText(pBES2Algorithms.onTransact());
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        tdsTopV2View.setSubtitle2Text(pBES2Algorithms.IAuthTabCallbackStub());
        TdsImageView tdsImageView = onWarmupCompleted().onNavigationEvent;
        ViewGroup.LayoutParams layoutParams = tdsImageView.getLayoutParams();
        setCTATextColor setctatextcolorOnWarmupCompleted = pBES2Algorithms.onWarmupCompleted();
        if (setctatextcolorOnWarmupCompleted == null || (numOnNavigationEvent = setctatextcolorOnWarmupCompleted.onNavigationEvent()) == null) {
            DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(100, displayMetrics);
        } else {
            DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics2);
        }
        layoutParams.width = iOnNavigationEvent;
        setCTATextColor setctatextcolorOnWarmupCompleted2 = pBES2Algorithms.onWarmupCompleted();
        if (setctatextcolorOnWarmupCompleted2 == null || (numOnWarmupCompleted = setctatextcolorOnWarmupCompleted2.onWarmupCompleted()) == null) {
            DisplayMetrics displayMetrics3 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            iOnNavigationEvent2 = varyMatches.onNavigationEvent(100, displayMetrics3);
        } else {
            DisplayMetrics displayMetrics4 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            iOnNavigationEvent2 = varyMatches.onNavigationEvent(numOnWarmupCompleted, displayMetrics4);
        }
        layoutParams.height = iOnNavigationEvent2;
        Intrinsics.checkNotNull(tdsImageView);
        setCTATextColor setctatextcolorOnWarmupCompleted3 = pBES2Algorithms.onWarmupCompleted();
        TdsImageView.setImage$default(tdsImageView, setctatextcolorOnWarmupCompleted3 != null ? setctatextcolorOnWarmupCompleted3.onExtraCallbackWithResult() : null, (Function1) null, (Function1) null, 6, (Object) null);
        final TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onExtraCallbackWithResult;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, pBES2Algorithms.onExtraCallbackWithResult().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueEventApplyStatusFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueEventApplyStatusFragment.onExtraCallbackWithResult(this.f$0, tdsBottomCtaV1View, pBES2Algorithms, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueEventApplyStatusFragment cardIssueEventApplyStatusFragment, TdsBottomCtaV1View tdsBottomCtaV1View, PBES2Algorithms pBES2Algorithms, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms<PBES2Algorithms> getdigestalgorithmsWriteTypedObject = cardIssueEventApplyStatusFragment.writeTypedObject();
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), cardIssueEventApplyStatusFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, pBES2Algorithms.onExtraCallbackWithResult().onNavigationEvent(), (Map) null, 40, (Object) null);
        return Unit.INSTANCE;
    }
}
