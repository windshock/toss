package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.post.ListItemSmall;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.RangesKt;
import o.CertBag;
import o.DynamicLoader;
import o.PageRenderReadyListener;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.TSA_GetTimeStampTokenInfo;
import o.ZslRingBuffer;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.createAudienceNetworkAdsApi;
import o.getClaimedAttributes;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getSignaturePolicyId;
import o.getSubjectPublicKeyInfo;
import o.preFillDefault;
import o.setMinWebSocketMessageToCompressokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueAgreementStepFragment extends CardIssueBaseFragment<CertBag> {
    private final PageRenderReadyListener onExtraCallback;
    private List<getSignaturePolicyId> onExtraCallbackWithResult;
    private int onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new PropertyReference1Impl<>(CardIssueAgreementStepFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueFreeformBinding;", 0)};
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onNavigationEvent = 8;

    public CardIssueAgreementStepFragment() {
        super(R.layout.fragment_card_issue_freeform);
        this.onExtraCallback = preFillDefault.IAuthTabCallback(this, onNavigationEvent.onExtraCallback);
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, TSA_GetTimeStampTokenInfo> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(1, TSA_GetTimeStampTokenInfo.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueFreeformBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_GetTimeStampTokenInfo invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return TSA_GetTimeStampTokenInfo.onNavigationEvent(view);
        }
    }

    private final TSA_GetTimeStampTokenInfo onExtraCallbackWithResult() {
        return (TSA_GetTimeStampTokenInfo) this.onExtraCallback.onNavigationEvent(this, IAuthTabCallback[0]);
    }

    private final TdsTopV1View onTransact() {
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult != null) {
            return tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.IAuthTabCallbackDefault;
        }
        return null;
    }

    private final TdsBottomCtaV1View onExtraCallback() {
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult != null) {
            return tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onExtraCallbackWithResult;
        }
        return null;
    }

    private final LinearLayout onWarmupCompleted() {
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult != null) {
            return tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.IAuthTabCallback;
        }
        return null;
    }

    private final List<getSignaturePolicyId> IAuthTabCallback() {
        Object objOnExtraCallback;
        List<getSignaturePolicyId> list = this.onExtraCallbackWithResult;
        if (list != null) {
            return list;
        }
        List<createAudienceNetworkAdsApi> listAsInterface = readTypedObject().asInterface();
        ArrayList arrayList = new ArrayList();
        for (createAudienceNetworkAdsApi createaudiencenetworkadsapi : listAsInterface) {
            if (createaudiencenetworkadsapi != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                objOnExtraCallback = getSubjectPublicKeyInfo.onExtraCallback(createaudiencenetworkadsapi, contextRequireContext, RippleNode.onNavigationEvent(this), extraCallback(), writeTypedObject());
            } else {
                objOnExtraCallback = null;
            }
            getSignaturePolicyId getsignaturepolicyid = objOnExtraCallback instanceof getSignaturePolicyId ? (getSignaturePolicyId) objOnExtraCallback : null;
            if (getsignaturepolicyid != null) {
                arrayList.add(getsignaturepolicyid);
            }
        }
        this.onExtraCallbackWithResult = arrayList;
        return arrayList;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallback_Parcel();
        IAuthTabCallbackStubProxy();
        IAuthTabCallbackDefault();
        asInterface();
        access100();
    }

    public void onDestroyView() {
        this.onExtraCallbackWithResult = null;
        super.onDestroyView();
    }

    private final void IAuthTabCallback_Parcel() {
        CertBag certBag = (CertBag) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        TdsTopV1View tdsTopV1ViewOnTransact = onTransact();
        if (tdsTopV1ViewOnTransact != null) {
            tdsTopV1ViewOnTransact.setUpperText(certBag.access000());
        }
        String strIAuthTabCallbackStub = certBag.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null) {
            TdsTopV1View tdsTopV1ViewOnTransact2 = onTransact();
            if (tdsTopV1ViewOnTransact2 != null) {
                tdsTopV1ViewOnTransact2.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
            }
            TdsTopV1View tdsTopV1ViewOnTransact3 = onTransact();
            if (tdsTopV1ViewOnTransact3 != null) {
                tdsTopV1ViewOnTransact3.setLowerText(strIAuthTabCallbackStub);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[LOOP:0: B:13:0x003e->B:15:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallbackStubProxy() {
        /*
            r2 = this;
            java.util.List r0 = r2.IAuthTabCallback()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L13
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L30
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            o.getSignaturePolicyId r1 = (o.getSignaturePolicyId) r1
            boolean r1 = r1.onExtraCallbackWithResult()
            if (r1 != 0) goto L17
            r0 = 0
            r2.onWarmupCompleted(r0)
            r2.onWarmupCompleted = r0
            goto L59
        L30:
            java.util.List r0 = r2.IAuthTabCallback()
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.ranges.IntRange r0 = kotlin.collections.CollectionsKt.getIndices(r0)
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            r1 = r0
            kotlin.collections.IntIterator r1 = (kotlin.collections.IntIterator) r1
            int r1 = r1.nextInt()
            r2.onWarmupCompleted(r1)
            goto L3e
        L4f:
            java.util.List r0 = r2.IAuthTabCallback()
            int r0 = r0.size()
            r2.onWarmupCompleted = r0
        L59:
            java.util.List r0 = r2.IAuthTabCallback()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            o.getSignaturePolicyId r1 = (o.getSignaturePolicyId) r1
            r2.onExtraCallback(r1)
            goto L63
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment.IAuthTabCallbackStubProxy():void");
    }

    private final void IAuthTabCallbackDefault() {
        ComposeView composeView;
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult == null || (composeView = tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onExtraCallback) == null) {
            return;
        }
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
    }

    private final void onExtraCallback(final getSignaturePolicyId getsignaturepolicyid) {
        getsignaturepolicyid.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda3
            public final Object invoke() {
                return CardIssueAgreementStepFragment.onNavigationEvent(this.f$0, getsignaturepolicyid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueAgreementStepFragment cardIssueAgreementStepFragment, getSignaturePolicyId getsignaturepolicyid) {
        Object next;
        View viewIAuthTabCallbackStub;
        if (!cardIssueAgreementStepFragment.isAdded() || cardIssueAgreementStepFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        if (getsignaturepolicyid.onExtraCallbackWithResult()) {
            Iterator<T> it = cardIssueAgreementStepFragment.IAuthTabCallback().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                getSignaturePolicyId getsignaturepolicyid2 = (getSignaturePolicyId) next;
                if (!getsignaturepolicyid2.onExtraCallbackWithResult() && (viewIAuthTabCallbackStub = getsignaturepolicyid2.IAuthTabCallbackStub()) != null && viewIAuthTabCallbackStub.getVisibility() == 0) {
                    break;
                }
            }
            getSignaturePolicyId getsignaturepolicyid3 = (getSignaturePolicyId) next;
            if (getsignaturepolicyid3 != null) {
                cardIssueAgreementStepFragment.onNavigationEvent(getsignaturepolicyid3.IAuthTabCallbackStub());
            } else if (cardIssueAgreementStepFragment.IAuthTabCallbackStub()) {
                int i = cardIssueAgreementStepFragment.onWarmupCompleted + 1;
                cardIssueAgreementStepFragment.onWarmupCompleted = i;
                if (i < cardIssueAgreementStepFragment.IAuthTabCallback().size()) {
                    cardIssueAgreementStepFragment.onWarmupCompleted(cardIssueAgreementStepFragment.onWarmupCompleted);
                }
            }
        }
        cardIssueAgreementStepFragment.access100();
        return Unit.INSTANCE;
    }

    private final void asInterface() {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback;
        BaseTextView baseTextViewIAuthTabCallbackDefault;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback2;
        CertBag certBag = (CertBag) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        final DynamicLoader dynamicLoaderOnNavigationEvent = certBag.onExtraCallbackWithResult().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null && (tdsBottomCtaV1ViewOnExtraCallback2 = onExtraCallback()) != null) {
            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1ViewOnExtraCallback2, dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CardIssueAgreementStepFragment.IAuthTabCallback(this.f$0, dynamicLoaderOnNavigationEvent, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        final DynamicLoader dynamicLoaderIAuthTabCallback = certBag.onExtraCallbackWithResult().IAuthTabCallback();
        if (dynamicLoaderIAuthTabCallback != null) {
            TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback3 = onExtraCallback();
            if (tdsBottomCtaV1ViewOnExtraCallback3 != null) {
                tdsBottomCtaV1ViewOnExtraCallback3.setBottomDescription(dynamicLoaderIAuthTabCallback.onNavigationEvent());
            }
            TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback4 = onExtraCallback();
            if (tdsBottomCtaV1ViewOnExtraCallback4 != null && (baseTextViewIAuthTabCallbackDefault = tdsBottomCtaV1ViewOnExtraCallback4.IAuthTabCallbackDefault()) != null) {
                baseTextViewIAuthTabCallbackDefault.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CardIssueAgreementStepFragment.onExtraCallbackWithResult(this.f$0, dynamicLoaderIAuthTabCallback, view);
                    }
                });
            }
        }
        String strOnWarmupCompleted = certBag.onExtraCallbackWithResult().onWarmupCompleted();
        if (strOnWarmupCompleted == null || (tdsBottomCtaV1ViewOnExtraCallback = onExtraCallback()) == null) {
            return;
        }
        tdsBottomCtaV1ViewOnExtraCallback.setTopDescription(strOnWarmupCompleted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueAgreementStepFragment cardIssueAgreementStepFragment, DynamicLoader dynamicLoader, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms.onExtraCallbackWithResult(cardIssueAgreementStepFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueAgreementStepFragment), dynamicLoader.onWarmupCompleted(), cardIssueAgreementStepFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(CardIssueAgreementStepFragment cardIssueAgreementStepFragment, DynamicLoader dynamicLoader, View view) {
        getDigestAlgorithms.onExtraCallbackWithResult(cardIssueAgreementStepFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueAgreementStepFragment), dynamicLoader.onWarmupCompleted(), cardIssueAgreementStepFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
    }

    private final void onWarmupCompleted(int i) {
        List<String> listOnTransact;
        if (i < 0 || i >= IAuthTabCallback().size()) {
            return;
        }
        getSignaturePolicyId getsignaturepolicyid = IAuthTabCallback().get(i);
        LinearLayout linearLayoutOnWarmupCompleted = onWarmupCompleted();
        if (linearLayoutOnWarmupCompleted != null) {
            View viewOnWarmupCompleted = getsignaturepolicyid.onWarmupCompleted();
            setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getClaimedAttributes.onExtraCallback.onWarmupCompleted(IAuthTabCallback(), i, getsignaturepolicyid, false));
            viewOnWarmupCompleted.setAlpha(0.0f);
            viewOnWarmupCompleted.animate().alpha(1.0f).setDuration(300L).start();
            linearLayoutOnWarmupCompleted.addView(viewOnWarmupCompleted);
        }
        if (i == CollectionsKt.getLastIndex(IAuthTabCallback()) && readTypedObject().onTransact() != null && (listOnTransact = readTypedObject().onTransact()) != null) {
            for (String str : listOnTransact) {
                LinearLayout linearLayoutOnWarmupCompleted2 = onWarmupCompleted();
                if (linearLayoutOnWarmupCompleted2 != null) {
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ListItemSmall listItemSmall = new ListItemSmall(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    listItemSmall.setText(str);
                    listItemSmall.setBullet("• ");
                    linearLayoutOnWarmupCompleted2.addView(listItemSmall);
                }
            }
        }
        onNavigationEvent(getsignaturepolicyid.IAuthTabCallbackStub());
    }

    private final void access100() {
        String strOnNavigationEvent;
        CertBag certBag = (CertBag) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        if (IAuthTabCallbackStub()) {
            strOnNavigationEvent = certBag.onWarmupCompleted();
        } else {
            strOnNavigationEvent = certBag.onExtraCallbackWithResult().onExtraCallback().onNavigationEvent();
        }
        String str = strOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallback = onExtraCallback();
        if (tdsBottomCtaV1ViewOnExtraCallback != null) {
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewOnExtraCallback, str, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return CardIssueAgreementStepFragment.IAuthTabCallback(this.f$0, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueAgreementStepFragment cardIssueAgreementStepFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (cardIssueAgreementStepFragment.IAuthTabCallbackStub()) {
            cardIssueAgreementStepFragment.onNavigationEvent();
        } else {
            cardIssueAgreementStepFragment.asBinder();
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() {
        Object next;
        View viewIAuthTabCallbackStub;
        Iterator<T> it = IAuthTabCallback().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            getSignaturePolicyId getsignaturepolicyid = (getSignaturePolicyId) next;
            if (!getsignaturepolicyid.onExtraCallbackWithResult() && (viewIAuthTabCallbackStub = getsignaturepolicyid.IAuthTabCallbackStub()) != null && viewIAuthTabCallbackStub.getVisibility() == 0) {
                break;
            }
        }
        getSignaturePolicyId getsignaturepolicyid2 = (getSignaturePolicyId) next;
        if (getsignaturepolicyid2 != null) {
            getsignaturepolicyid2.IAuthTabCallback(true);
            boolean zAreEqual = Intrinsics.areEqual(CollectionsKt.lastOrNull(IAuthTabCallback()), getsignaturepolicyid2);
            List<getSignaturePolicyId> listIAuthTabCallback = IAuthTabCallback();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listIAuthTabCallback) {
                View viewIAuthTabCallbackStub2 = ((getSignaturePolicyId) obj).IAuthTabCallbackStub();
                if (viewIAuthTabCallbackStub2 != null && viewIAuthTabCallbackStub2.getVisibility() == 0) {
                    arrayList.add(obj);
                }
            }
            boolean zAreEqual2 = Intrinsics.areEqual(CollectionsKt.getOrNull(arrayList, arrayList.size() - 2), getsignaturepolicyid2);
            if (zAreEqual) {
                access000();
            } else if (!zAreEqual2) {
                onNavigationEvent(getsignaturepolicyid2.IAuthTabCallbackStub());
            }
        } else if (this.onWarmupCompleted < IAuthTabCallback().size()) {
            int i = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i;
            onWarmupCompleted(i);
            onNavigationEvent(IAuthTabCallback().get(this.onWarmupCompleted).IAuthTabCallbackStub());
        }
        access100();
    }

    private final void asBinder() {
        DynamicLoader dynamicLoaderOnExtraCallback = ((CertBag) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallbackWithResult().onExtraCallback();
        if (dynamicLoaderOnExtraCallback.onWarmupCompleted() instanceof createAdSizeApi.onWarmupCompleted) {
            getDigestAlgorithms.onExtraCallback(writeTypedObject(), RippleNode.onNavigationEvent(this), extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, dynamicLoaderOnExtraCallback.onNavigationEvent(), (Map) null, 40, (Object) null);
        } else {
            getDigestAlgorithms.onExtraCallbackWithResult(writeTypedObject(), RippleNode.onNavigationEvent(this), dynamicLoaderOnExtraCallback.onWarmupCompleted(), extraCallback(), dynamicLoaderOnExtraCallback.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    private final void onNavigationEvent(final View view) {
        ScrollView scrollView;
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult == null || (scrollView = tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onWarmupCompleted) == null) {
            return;
        }
        scrollView.postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CardIssueAgreementStepFragment.onNavigationEvent(this.f$0, view);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(CardIssueAgreementStepFragment cardIssueAgreementStepFragment, View view) {
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        ScrollView scrollView;
        if (!cardIssueAgreementStepFragment.isAdded() || cardIssueAgreementStepFragment.getView() == null || view == null || (context = cardIssueAgreementStepFragment.getContext()) == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        int top = view.getTop();
        int iOnNavigationEvent = varyMatches.onNavigationEvent(32, displayMetrics);
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = cardIssueAgreementStepFragment.onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult == null || (scrollView = tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onWarmupCompleted) == null) {
            return;
        }
        scrollView.smoothScrollTo(0, RangesKt.coerceAtLeast(top - iOnNavigationEvent, 0));
    }

    private final void access000() {
        ScrollView scrollView;
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult == null || (scrollView = tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onWarmupCompleted) == null) {
            return;
        }
        scrollView.postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CardIssueAgreementStepFragment.onExtraCallback(this.f$0);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(CardIssueAgreementStepFragment cardIssueAgreementStepFragment) {
        TSA_GetTimeStampTokenInfo tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult;
        ScrollView scrollView;
        if (!cardIssueAgreementStepFragment.isAdded() || cardIssueAgreementStepFragment.getView() == null || (tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult = cardIssueAgreementStepFragment.onExtraCallbackWithResult()) == null || (scrollView = tSA_GetTimeStampTokenInfoOnExtraCallbackWithResult.onWarmupCompleted) == null) {
            return;
        }
        scrollView.fullScroll(130);
    }

    private final boolean IAuthTabCallbackStub() {
        List<getSignaturePolicyId> listIAuthTabCallback = IAuthTabCallback();
        if ((listIAuthTabCallback instanceof Collection) && listIAuthTabCallback.isEmpty()) {
            return false;
        }
        Iterator<T> it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            if (!((getSignaturePolicyId) it.next()).onExtraCallbackWithResult()) {
                return true;
            }
        }
        return false;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
