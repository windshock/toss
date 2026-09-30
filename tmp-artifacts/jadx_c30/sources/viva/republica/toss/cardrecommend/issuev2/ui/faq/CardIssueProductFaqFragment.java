package viva.republica.toss.cardrecommend.issuev2.ui.faq;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import o.IDEACBCPar;
import o.NTTObjectIdentifiers;
import o.PageContext;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SigPolicyQualifiers;
import o.TSA_VerifyTimeStampTokenWithHash;
import o.addAllCommandLine;
import o.doCallInitialize;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getEncryptionScheme;
import o.preFillDefault;
import o.setPositionProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueProductFaqFragment extends CardIssueBaseFragment<getEncryptionScheme> {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueProductFaqFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueProductFaqBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final PageContext onWarmupCompleted;

    public CardIssueProductFaqFragment() {
        super(R.layout.fragment_card_issue_product_faq);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, TSA_VerifyTimeStampTokenWithHash> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, TSA_VerifyTimeStampTokenWithHash.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueProductFaqBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final TSA_VerifyTimeStampTokenWithHash invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return TSA_VerifyTimeStampTokenWithHash.IAuthTabCallback(view);
        }
    }

    private final TSA_VerifyTimeStampTokenWithHash onWarmupCompleted() {
        return (TSA_VerifyTimeStampTokenWithHash) this.onWarmupCompleted.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onWarmupCompleted;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string = tdsTopV2View.getContext().getString(R.string.app_cardrecommend_issue_shinhan_product_faq);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        tdsTopV2View.setTitleText(string);
        onWarmupCompleted().IAuthTabCallback.addView(onExtraCallback());
        final TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onExtraCallback;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, readTypedObject().onExtraCallbackWithResult().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.CardIssueProductFaqFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueProductFaqFragment.IAuthTabCallback(this.f$0, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        onWarmupCompleted().onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.CardIssueProductFaqFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardIssueProductFaqFragment.onNavigationEvent(this.f$0, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueProductFaqFragment cardIssueProductFaqFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        cardIssueProductFaqFragment.readTypedObject().onExtraCallbackWithResult().onWarmupCompleted();
        getDigestAlgorithms getdigestalgorithmsWriteTypedObject = cardIssueProductFaqFragment.writeTypedObject();
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject, PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), cardIssueProductFaqFragment.readTypedObject().onExtraCallbackWithResult().onWarmupCompleted(), cardIssueProductFaqFragment.extraCallback(), cardIssueProductFaqFragment.readTypedObject().onExtraCallbackWithResult().onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(CardIssueProductFaqFragment cardIssueProductFaqFragment, View view) {
        IDEACBCPar.onExtraCallback(RippleNode.onNavigationEvent(cardIssueProductFaqFragment), R.id.cardFaqAction, cardIssueProductFaqFragment.requireArguments(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 12, (Object) null);
    }

    private final LinearLayout onExtraCallback() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        List listIAuthTabCallbackStub = ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub();
        ArrayList<SigPolicyQualifiers> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallbackStub, 10));
        Iterator it = listIAuthTabCallbackStub.iterator();
        while (it.hasNext()) {
            arrayList.add(NTTObjectIdentifiers.onExtraCallback((doCallInitialize) it.next()));
        }
        for (SigPolicyQualifiers sigPolicyQualifiers : arrayList) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, BuildConfig.FLAVOR);
            linearLayout.addView(sigPolicyQualifiers.onNavigationEvent(contextRequireContext2));
        }
        return linearLayout;
    }
}
