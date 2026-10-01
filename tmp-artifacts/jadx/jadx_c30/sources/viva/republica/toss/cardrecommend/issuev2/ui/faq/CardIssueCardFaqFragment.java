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
import o.GetTSASerialNumber;
import o.NTTObjectIdentifiers;
import o.PageContext;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.SigPolicyQualifiers;
import o.addAllCommandLine;
import o.doCallInitialize;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getEncryptionScheme;
import o.preFillDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueCardFaqFragment extends CardIssueBaseFragment<getEncryptionScheme> {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueCardFaqFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueCardFaqBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final PageContext onExtraCallback;

    public CardIssueCardFaqFragment() {
        super(R.layout.fragment_card_issue_card_faq);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onExtraCallback);
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, GetTSASerialNumber> {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, GetTSASerialNumber.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueCardFaqBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final GetTSASerialNumber invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return GetTSASerialNumber.onExtraCallbackWithResult(view);
        }
    }

    private final GetTSASerialNumber onWarmupCompleted() {
        return (GetTSASerialNumber) this.onExtraCallback.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        TdsTopV2View tdsTopV2View = onWarmupCompleted().onExtraCallback;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string = tdsTopV2View.getContext().getString(R.string.app_cardrecommend_shinhan_card_faq);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        tdsTopV2View.setTitleText(string);
        onWarmupCompleted().onNavigationEvent.addView(IAuthTabCallback());
        final TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onExtraCallbackWithResult;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, readTypedObject().onExtraCallbackWithResult().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.CardIssueCardFaqFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueCardFaqFragment.onWarmupCompleted(this.f$0, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueCardFaqFragment cardIssueCardFaqFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        cardIssueCardFaqFragment.readTypedObject().onExtraCallbackWithResult().onWarmupCompleted();
        getDigestAlgorithms getdigestalgorithmsWriteTypedObject = cardIssueCardFaqFragment.writeTypedObject();
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithmsWriteTypedObject, PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View), cardIssueCardFaqFragment.readTypedObject().onExtraCallbackWithResult().onWarmupCompleted(), cardIssueCardFaqFragment.extraCallback(), cardIssueCardFaqFragment.readTypedObject().onExtraCallbackWithResult().onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    private final LinearLayout IAuthTabCallback() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        List listOnWarmupCompleted = ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onWarmupCompleted();
        ArrayList<SigPolicyQualifiers> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator it = listOnWarmupCompleted.iterator();
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
