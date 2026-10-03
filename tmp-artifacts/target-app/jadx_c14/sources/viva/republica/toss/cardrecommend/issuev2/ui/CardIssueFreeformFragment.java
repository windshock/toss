package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AppLovinCmpErrorCode;
import o.BenchmarkLimitsMs;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ContentHints;
import o.ConvertFloatArrayToByteArray;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.DynamicLoader;
import o.FBLoginASID;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.JsonReaderUnknownNumberParsing;
import o.PageContext;
import o.QuirksExternalSyntheticBackport0;
import o.Repairable;
import o.RippleNode;
import o.SignerLocation;
import o.TSA_GetTimeStampTokenInfo;
import o.TypographyKtExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access8100;
import o.addAllCommandLine;
import o.areCachedAdResourcesMissing;
import o.createAdSizeApi;
import o.createAudienceNetworkRemoteService;
import o.createNativeAdRatingApi;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.enableAccessibilityOrder;
import o.getBacktraceNote;
import o.getCertifiedAttributes;
import o.getClaimedAttributes;
import o.getCommitmentTypeId;
import o.getCountryName;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getLKeySize;
import o.getObjectId;
import o.getSigPolicyId;
import o.getSigPolicyQualifiers;
import o.getSignaturePolicyId;
import o.getSubjectPublicKeyInfo;
import o.handshake;
import o.isSignaturePolicyImplied;
import o.preFillDefault;
import o.r8lambdaL3YVedIYrkax5fojVMcLJQJpM;
import o.roundUpToNearestHalfInt;
import o.setAdVideoPlaybackListener;
import o.setMinWebSocketMessageToCompressokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueFreeformFragment extends CardIssueBaseFragment<getObjectId> {
    private List<? extends isSignaturePolicyImplied> IAuthTabCallback;
    private final PageContext onExtraCallbackWithResult;
    private getCommitmentTypeId onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new PropertyReference1Impl<>(CardIssueFreeformFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueFreeformBinding;", 0)};
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;

    public CardIssueFreeformFragment() {
        super(R.layout.fragment_card_issue_freeform);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallback);
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, TSA_GetTimeStampTokenInfo> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, TSA_GetTimeStampTokenInfo.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueFreeformBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_GetTimeStampTokenInfo invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return TSA_GetTimeStampTokenInfo.onNavigationEvent(view);
        }
    }

    private final TSA_GetTimeStampTokenInfo onExtraCallback() {
        return (TSA_GetTimeStampTokenInfo) this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onNavigationEvent[0]);
    }

    private final TdsTopV1View asBinder() {
        TdsTopV1View tdsTopV1View = onExtraCallback().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        return tdsTopV1View;
    }

    private final TdsBottomCtaV1View onExtraCallbackWithResult() {
        TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    private final LinearLayout IAuthTabCallback() {
        LinearLayout linearLayout = onExtraCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    private final ComposeView onWarmupCompleted() {
        ComposeView composeView = onExtraCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(composeView, "");
        return composeView;
    }

    private final List<isSignaturePolicyImplied> asInterface() {
        List list = this.IAuthTabCallback;
        if (list != null) {
            return list;
        }
        List<createNativeAdRatingApi> listFilterNotNull = CollectionsKt.filterNotNull(readTypedObject().IAuthTabCallbackStub());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        for (createNativeAdRatingApi createnativeadratingapi : listFilterNotNull) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            arrayList.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, contextRequireContext, RippleNode.onNavigationEvent(this), extraCallback(), writeTypedObject()));
        }
        this.IAuthTabCallback = arrayList;
        return arrayList;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final getObjectId getobjectid = (getObjectId) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        String strICustomTabsCallback = getobjectid.ICustomTabsCallback();
        if (strICustomTabsCallback != null && strICustomTabsCallback.length() != 0) {
            asBinder().setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP5);
            asBinder().setUpperText(getobjectid.ICustomTabsCallback());
            asBinder().setLowerType(TdsTopV1View.onNavigationEvent.TOP2);
            asBinder().setLowerText(getobjectid.extraCallbackWithResult());
        } else {
            String strAccess000 = getobjectid.access000();
            if (strAccess000 != null && strAccess000.length() != 0) {
                asBinder().setUpperText(getobjectid.extraCallbackWithResult());
                asBinder().setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
                asBinder().setLowerText(getobjectid.access000());
            } else {
                asBinder().setUpperText(getobjectid.extraCallbackWithResult());
            }
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : asInterface()) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
            LinearLayout linearLayoutIAuthTabCallback = IAuthTabCallback();
            View viewOnWarmupCompleted = issignaturepolicyimplied.onWarmupCompleted();
            setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getClaimedAttributes.onExtraCallback.onWarmupCompleted(asInterface(), i2, issignaturepolicyimplied, false));
            linearLayoutIAuthTabCallback.addView(viewOnWarmupCompleted);
            i2++;
        }
        if (readTypedObject().onExtraCallbackWithResult()) {
            List<isSignaturePolicyImplied> listAsInterface = asInterface();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listAsInterface) {
                if (obj2 instanceof getSigPolicyId) {
                    arrayList.add(obj2);
                }
            }
            for (Object obj3 : arrayList) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((getSigPolicyId) obj3).onExtraCallbackWithResult((getSigPolicyId) CollectionsKt.getOrNull(arrayList, i3));
                i = i3;
            }
            getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList);
            if (getsigpolicyid != null) {
                getsigpolicyid.IAuthTabCallbackDefault();
            }
        }
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj4) {
                return CardIssueFreeformFragment.IAuthTabCallback(this.f$0, getobjectid, (View) obj4);
            }
        };
        ScrollView scrollView = onExtraCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        this.onWarmupCompleted = new getCommitmentTypeId(scrollView, getobjectid.writeTypedObject(), getobjectid.onTransact(), getobjectid.onWarmupCompleted().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj4) {
                return CardIssueFreeformFragment.onNavigationEvent(this.f$0, function1, (String) obj4);
            }
        });
        enableAccessibilityOrder enableaccessibilityorder = enableAccessibilityOrder.onExtraCallbackWithResult;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = enableaccessibilityorder.IAuthTabCallback(fragmentActivityRequireActivity);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj4) {
                return CardIssueFreeformFragment.onExtraCallbackWithResult(this.f$0, function1, getobjectid, (enableAccessibilityOrder.onExtraCallbackWithResult) obj4);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda7
            public final void accept(Object obj4) {
                CardIssueFreeformFragment.onWarmupCompleted(function12, obj4);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj4) {
                return CardIssueFreeformFragment.onExtraCallback((Throwable) obj4);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda9
            public final void accept(Object obj4) {
                CardIssueFreeformFragment.onNavigationEvent(function13, obj4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
        getCommitmentTypeId getcommitmenttypeid = this.onWarmupCompleted;
        if (getcommitmenttypeid != null) {
            getcommitmenttypeid.onWarmupCompleted();
        }
        final DynamicLoader dynamicLoaderOnNavigationEvent = getobjectid.onWarmupCompleted().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            TdsBottomCtaV1View.setSecondary$default(onExtraCallbackWithResult(), dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda10
                public final Object invoke(Object obj4) {
                    return CardIssueFreeformFragment.IAuthTabCallback(this.f$0, getobjectid, dynamicLoaderOnNavigationEvent, (View) obj4);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        String strOnWarmupCompleted = getobjectid.onWarmupCompleted().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            onExtraCallbackWithResult().setTopDescription(strOnWarmupCompleted);
        }
        final DynamicLoader dynamicLoaderIAuthTabCallback = getobjectid.onWarmupCompleted().IAuthTabCallback();
        if (dynamicLoaderIAuthTabCallback != null) {
            onExtraCallbackWithResult().setBottomDescription(dynamicLoaderIAuthTabCallback.onNavigationEvent());
            BaseTextView baseTextViewIAuthTabCallbackDefault = onExtraCallbackWithResult().IAuthTabCallbackDefault();
            if (baseTextViewIAuthTabCallbackDefault != null) {
                baseTextViewIAuthTabCallbackDefault.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CardIssueFreeformFragment.onNavigationEvent(this.f$0, getobjectid, dynamicLoaderIAuthTabCallback, view2);
                    }
                });
            }
        }
        onExtraCallback(getobjectid.asInterface());
        List<isSignaturePolicyImplied> listAsInterface2 = asInterface();
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : listAsInterface2) {
            if (obj4 instanceof RequireInput) {
                arrayList2.add(obj4);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((RequireInput) it.next()).onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda12
                public final Object invoke() {
                    return CardIssueFreeformFragment.onWarmupCompleted(this.f$0, view, arrayList2, linkedHashMap);
                }
            });
        }
        onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(final CardIssueFreeformFragment cardIssueFreeformFragment, final getObjectId getobjectid, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        enableAccessibilityOrder enableaccessibilityorder = enableAccessibilityOrder.onExtraCallbackWithResult;
        FragmentActivity fragmentActivityRequireActivity = cardIssueFreeformFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        if (enableaccessibilityorder.onNavigationEvent(fragmentActivityRequireActivity).isOpen()) {
            cardIssueFreeformFragment.hideSoftKeyboard();
        } else {
            getCommitmentTypeId getcommitmenttypeid = cardIssueFreeformFragment.onWarmupCompleted;
            if (getcommitmenttypeid != null) {
                getcommitmenttypeid.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return CardIssueFreeformFragment.onWarmupCompleted(this.f$0, getobjectid);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueFreeformFragment cardIssueFreeformFragment, getObjectId getobjectid) {
        cardIssueFreeformFragment.onExtraCallbackWithResult(getobjectid.onWarmupCompleted().onExtraCallbackWithResult(), getobjectid.onWarmupCompleted().onExtraCallback());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueFreeformFragment cardIssueFreeformFragment, Function1 function1, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        enableAccessibilityOrder enableaccessibilityorder = enableAccessibilityOrder.onExtraCallbackWithResult;
        FragmentActivity fragmentActivityRequireActivity = cardIssueFreeformFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        if (!enableaccessibilityorder.onNavigationEvent(fragmentActivityRequireActivity).isOpen()) {
            TdsBottomCtaV1View.setCta$default(cardIssueFreeformFragment.onExtraCallbackWithResult(), str, function1, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            cardIssueFreeformFragment.onNavigationEvent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueFreeformFragment cardIssueFreeformFragment, Function1 function1, getObjectId getobjectid, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        String strOnNavigationEvent;
        if (onextracallbackwithresult.isOpen()) {
            TdsBottomCtaV1View.setCta$default(cardIssueFreeformFragment.onExtraCallbackWithResult(), im.toss.uikit.R.string.uikit_confirm, function1, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        } else {
            TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallbackWithResult = cardIssueFreeformFragment.onExtraCallbackWithResult();
            getCommitmentTypeId getcommitmenttypeid = cardIssueFreeformFragment.onWarmupCompleted;
            if (getcommitmenttypeid == null || (strOnNavigationEvent = getcommitmenttypeid.IAuthTabCallback()) == null) {
                strOnNavigationEvent = getobjectid.onWarmupCompleted().onExtraCallback().onNavigationEvent();
            }
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewOnExtraCallbackWithResult, strOnNavigationEvent, function1, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
        cardIssueFreeformFragment.onNavigationEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CardIssueFreeformFragment", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueFreeformFragment cardIssueFreeformFragment, getObjectId getobjectid, DynamicLoader dynamicLoader, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueFreeformFragment.onExtraCallbackWithResult(getobjectid.onWarmupCompleted().onExtraCallbackWithResult(), dynamicLoader);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(CardIssueFreeformFragment cardIssueFreeformFragment, getObjectId getobjectid, DynamicLoader dynamicLoader, View view) {
        cardIssueFreeformFragment.onExtraCallbackWithResult(getobjectid.onWarmupCompleted().onExtraCallbackWithResult(), dynamicLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueFreeformFragment cardIssueFreeformFragment, View view, List list, Map map) throws NoWhenBranchMatchedException {
        Object next;
        Pair pair;
        String strOnExtraCallbackWithResult;
        ContentHints contentHints;
        Object next2;
        Pair pair2;
        Pair pair3;
        Object next3;
        View viewIAuthTabCallbackStub;
        if (!cardIssueFreeformFragment.isAdded() || view == null) {
            return Unit.INSTANCE;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RequireInput requireInput = (RequireInput) next;
            getSignaturePolicyId getsignaturepolicyid = requireInput instanceof getSignaturePolicyId ? (getSignaturePolicyId) requireInput : null;
            if (getsignaturepolicyid != null && !getsignaturepolicyid.onExtraCallbackWithResult()) {
                break;
            }
        }
        RequireInput requireInput2 = (RequireInput) next;
        if (requireInput2 != null) {
            getSignaturePolicyId getsignaturepolicyid2 = requireInput2 instanceof getSignaturePolicyId ? (getSignaturePolicyId) requireInput2 : null;
            if (getsignaturepolicyid2 != null && (viewIAuthTabCallbackStub = getsignaturepolicyid2.IAuthTabCallbackStub()) != null) {
                cardIssueFreeformFragment.onExtraCallback().onWarmupCompleted.smoothScrollTo(0, viewIAuthTabCallbackStub.getBottom() - cardIssueFreeformFragment.asBinder().getHeight());
            }
        }
        List<isSignaturePolicyImplied> listAsInterface = cardIssueFreeformFragment.asInterface();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsInterface) {
            if (obj instanceof getCertifiedAttributes) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it2.next()).IAuthTabCallbackStub();
            if (listIAuthTabCallbackStub != null) {
                arrayList2.add(listIAuthTabCallbackStub);
            }
        }
        List listFlatten = CollectionsKt.flatten(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listFlatten) {
            if (obj2 instanceof RequireInput) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (obj3 instanceof ContentHints) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof ContentHints) {
                arrayList5.add(obj4);
            }
        }
        List<ContentHints> listPlus = CollectionsKt.plus(arrayList4, arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (ContentHints contentHints2 : listPlus) {
            arrayList6.add(new Pair(contentHints2.onNavigationEvent().getFirst(), new Pair(Integer.valueOf(contentHints2.onExtraCallback()), contentHints2)));
        }
        if (!arrayList6.isEmpty()) {
            Collection collectionValues = map.values();
            Collection collectionValues2 = map.values();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : collectionValues2) {
                Pair pair4 = (Pair) obj5;
                Iterator it3 = arrayList6.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (((Number) ((Pair) ((Pair) next3).getSecond()).getFirst()).intValue() == ((Number) pair4.getFirst()).intValue()) {
                        break;
                    }
                }
                if (next3 == null) {
                    arrayList7.add(obj5);
                }
            }
            collectionValues.removeAll(arrayList7);
            ArrayList<Pair> arrayList8 = new ArrayList();
            for (Object obj6 : arrayList6) {
                Pair pair5 = (Pair) obj6;
                if (map.get(pair5.getFirst()) != null && (pair3 = (Pair) map.get(pair5.getFirst())) != null && ((Number) pair3.getFirst()).intValue() == ((Number) ((Pair) pair5.getSecond()).getFirst()).intValue()) {
                    arrayList8.add(obj6);
                }
            }
            for (Pair pair6 : arrayList8) {
                map.put(pair6.getFirst(), pair6.getSecond());
            }
            ArrayList<Pair> arrayList9 = new ArrayList();
            for (Object obj7 : arrayList6) {
                Pair pair7 = (Pair) obj7;
                if (map.get(pair7.getFirst()) == null || (pair2 = (Pair) map.get(pair7.getFirst())) == null || ((Number) pair2.getFirst()).intValue() != ((Number) ((Pair) pair7.getSecond()).getFirst()).intValue()) {
                    arrayList9.add(obj7);
                }
            }
            for (Pair pair8 : arrayList9) {
                if (map.get(pair8.getFirst()) == null) {
                    map.put(pair8.getFirst(), pair8.getSecond());
                    ((ContentHints) ((Pair) pair8.getSecond()).getSecond()).onWarmupCompleted(true, ((ContentHints) ((Pair) pair8.getSecond()).getSecond()).onExtraCallbackWithResult());
                } else {
                    if (map.get(pair8.getFirst()) != null) {
                        Iterator it4 = arrayList6.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                            Pair pair9 = (Pair) next2;
                            Pair pair10 = (Pair) map.get(pair9.getFirst());
                            if (pair10 != null && ((Number) ((Pair) pair9.getSecond()).getFirst()).intValue() == ((Number) pair10.getFirst()).intValue()) {
                                break;
                            }
                        }
                        if (next2 == null) {
                            map.remove(pair8.getFirst());
                        }
                    }
                    if (map.get(pair8.getFirst()) != null && ((pair = (Pair) map.get(pair8.getFirst())) == null || ((Number) pair.getFirst()).intValue() != ((Number) ((Pair) pair8.getSecond()).getFirst()).intValue())) {
                        Pair pair11 = (Pair) map.get(pair8.getFirst());
                        ContentHints contentHints3 = (ContentHints) ((Pair) pair8.getSecond()).getSecond();
                        if (pair11 == null || (contentHints = (ContentHints) pair11.getSecond()) == null || (strOnExtraCallbackWithResult = contentHints.onExtraCallbackWithResult()) == null) {
                            strOnExtraCallbackWithResult = "";
                        }
                        contentHints3.onWarmupCompleted(false, strOnExtraCallbackWithResult);
                    }
                }
            }
        }
        cardIssueFreeformFragment.onNavigationEvent();
        return Unit.INSTANCE;
    }

    public void onDestroyView() {
        getCommitmentTypeId getcommitmenttypeid = this.onWarmupCompleted;
        if (getcommitmenttypeid != null) {
            getcommitmenttypeid.onExtraCallbackWithResult();
        }
        this.onWarmupCompleted = null;
        this.IAuthTabCallback = null;
        super.onDestroyView();
    }

    private final void onExtraCallback(final List<BenchmarkLimitsMs> list) {
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                onWarmupCompleted().setVisibility(0);
                onWarmupCompleted().onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                onWarmupCompleted().setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(920071205, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return CardIssueFreeformFragment.onNavigationEvent(list, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                })));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(920071205, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment.initDisclaimer.<anonymous>.<anonymous> (CardIssueFreeformFragment.kt:207)");
            }
            Object[] objArr = {null, 0L, Float.valueOf(0.0f), null, ForwardingCameraControl.onExtraCallback(1106828733, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CardIssueFreeformFragment.onNavigationEvent(list, (roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15};
            r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(List list, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1106828733, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment.initDisclaimer.<anonymous>.<anonymous>.<anonymous> (CardIssueFreeformFragment.kt:208)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final BenchmarkLimitsMs benchmarkLimitsMs = (BenchmarkLimitsMs) it.next();
                String strOnNavigationEvent = benchmarkLimitsMs.onNavigationEvent();
                if (strOnNavigationEvent == null) {
                    strOnNavigationEvent = "";
                }
                int i5 = i2;
                rounduptonearesthalfint.IAuthTabCallback(AppLovinCmpErrorCode.onNavigationEvent(strOnNavigationEvent, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, i4, i3), (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, (handshake) null, 0, 0.0f, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 24) & 234881024, 254);
                rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(464374534, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CardIssueFreeformFragment.onNavigationEvent(benchmarkLimitsMs, (areCachedAdResourcesMissing) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i5 << 21) & 29360128) | 1572864, 63);
                i4 = i4;
                i2 = i5;
                i3 = i3;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(BenchmarkLimitsMs benchmarkLimitsMs, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(464374534, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment.initDisclaimer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardIssueFreeformFragment.kt:212)");
            }
            List<Repairable> listOnWarmupCompleted = benchmarkLimitsMs.onWarmupCompleted();
            if (listOnWarmupCompleted == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(92139484);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(92139485);
                for (Repairable repairable : listOnWarmupCompleted) {
                    String strIAuthTabCallback = repairable.IAuthTabCallback();
                    if (strIAuthTabCallback == null) {
                        strIAuthTabCallback = "";
                    }
                    getLKeySize.onExtraCallback(arecachedadresourcesmissing, repairable.onExtraCallbackWithResult(), AppLovinCmpErrorCode.onNavigationEvent(strIAuthTabCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2), cameraCaptureResultEmptyCameraCaptureResult, i & 14);
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(String str, DynamicLoader dynamicLoader) {
        Object next;
        Object next2;
        List<FBLoginASID> listOnExtraCallbackWithResult = dynamicLoader.onExtraCallbackWithResult();
        List<isSignaturePolicyImplied> listAsInterface = asInterface();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsInterface) {
            isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
            if ((issignaturepolicyimplied instanceof getCountryName) || (issignaturepolicyimplied instanceof ContentHints) || (issignaturepolicyimplied instanceof RadioView) || (issignaturepolicyimplied instanceof getSigPolicyQualifiers)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof RequireInput) {
                arrayList2.add(obj2);
            }
        }
        List<isSignaturePolicyImplied> listAsInterface2 = asInterface();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listAsInterface2) {
            if (obj3 instanceof getCertifiedAttributes) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it.next()).IAuthTabCallbackStub();
            if (listIAuthTabCallbackStub != null) {
                arrayList4.add(listIAuthTabCallbackStub);
            }
        }
        List listFlatten = CollectionsKt.flatten(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : listFlatten) {
            isSignaturePolicyImplied issignaturepolicyimplied2 = (isSignaturePolicyImplied) obj4;
            if ((issignaturepolicyimplied2 instanceof getCountryName) || (issignaturepolicyimplied2 instanceof ContentHints) || (issignaturepolicyimplied2 instanceof RadioView) || (issignaturepolicyimplied2 instanceof getSigPolicyQualifiers)) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            if (obj5 instanceof RequireInput) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList6);
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            arrayList8.add(((RequireInput) it2.next()).onNavigationEvent());
        }
        if (listOnExtraCallbackWithResult.isEmpty()) {
            onNavigationEvent(str, dynamicLoader);
            return;
        }
        Iterator<T> it3 = listOnExtraCallbackWithResult.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            FBLoginASID fBLoginASID = (FBLoginASID) next;
            Map<String, String> mapOnWarmupCompleted = fBLoginASID.onWarmupCompleted();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : mapOnWarmupCompleted.entrySet()) {
                Iterator it4 = arrayList8.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    Pair pair = (Pair) next2;
                    if (Intrinsics.areEqual(pair.getFirst(), entry.getKey()) && Intrinsics.areEqual(pair.getSecond(), entry.getValue())) {
                        break;
                    }
                }
                if (next2 != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.size() == fBLoginASID.onWarmupCompleted().size()) {
                break;
            }
        }
        FBLoginASID fBLoginASID2 = (FBLoginASID) next;
        if (fBLoginASID2 != null) {
            createAdSizeApi createadsizeapiOnExtraCallback = fBLoginASID2.onExtraCallback();
            if (Intrinsics.areEqual(createadsizeapiOnExtraCallback != null ? createadsizeapiOnExtraCallback.onNavigationEvent() : null, "END")) {
                writeTypedObject().onWarmupCompleted(RippleNode.onNavigationEvent(this), fBLoginASID2.onExtraCallback(), extraCallback(), dynamicLoader.onNavigationEvent(), IAuthTabCallback(str, dynamicLoader));
                return;
            } else {
                writeTypedObject().onWarmupCompleted(RippleNode.onNavigationEvent(this), fBLoginASID2.onExtraCallback(), extraCallback(), dynamicLoader.onNavigationEvent(), IAuthTabCallback(str, dynamicLoader));
                return;
            }
        }
        onNavigationEvent(str, dynamicLoader);
    }

    private final void onNavigationEvent(String str, DynamicLoader dynamicLoader) {
        List<isSignaturePolicyImplied> listAsInterface = asInterface();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsInterface) {
            if (obj instanceof SignerLocation) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            createAdSizeApi createadsizeapiOnExtraCallback = ((SignerLocation) it.next()).onExtraCallback();
            if (createadsizeapiOnExtraCallback != null) {
                arrayList2.add(createadsizeapiOnExtraCallback);
            }
        }
        createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoader.onWarmupCompleted();
        if (Intrinsics.areEqual(createadsizeapiOnWarmupCompleted != null ? createadsizeapiOnWarmupCompleted.onNavigationEvent() : null, "END")) {
            writeTypedObject().onWarmupCompleted(RippleNode.onNavigationEvent(this), dynamicLoader.onWarmupCompleted(), extraCallback(), dynamicLoader.onNavigationEvent(), IAuthTabCallback(str, dynamicLoader));
            return;
        }
        if (!arrayList2.isEmpty() && dynamicLoader.onExtraCallbackWithResult().isEmpty()) {
            getDigestAlgorithms<getObjectId> getdigestalgorithmsWriteTypedObject = writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
            createAudienceNetworkRemoteService createaudiencenetworkremoteserviceIAuthTabCallback = IAuthTabCallback(str, dynamicLoader);
            String strOnNavigationEvent = dynamicLoader.onNavigationEvent();
            createAdSizeApi createadsizeapiOnWarmupCompleted2 = dynamicLoader.onWarmupCompleted();
            getdigestalgorithmsWriteTypedObject.IAuthTabCallback(typographyKtExternalSyntheticLambda0OnNavigationEvent, arrayList2, cardIssueOverviewViewModelExtraCallback, createaudiencenetworkremoteserviceIAuthTabCallback, strOnNavigationEvent, createadsizeapiOnWarmupCompleted2 != null ? createadsizeapiOnWarmupCompleted2.IAuthTabCallback() : null);
            return;
        }
        writeTypedObject().onWarmupCompleted(RippleNode.onNavigationEvent(this), dynamicLoader.onWarmupCompleted(), extraCallback(), dynamicLoader.onNavigationEvent(), IAuthTabCallback(str, dynamicLoader));
    }

    private final createAudienceNetworkRemoteService IAuthTabCallback(String str, DynamicLoader dynamicLoader) {
        List<isSignaturePolicyImplied> listAsInterface = asInterface();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsInterface) {
            if (obj instanceof RequireInput) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RequireInput) it.next()).onNavigationEvent());
        }
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(arrayList2);
        List<isSignaturePolicyImplied> listAsInterface2 = asInterface();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listAsInterface2) {
            if (obj2 instanceof getCertifiedAttributes) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it2.next()).IAuthTabCallbackStub();
            if (listIAuthTabCallbackStub != null) {
                arrayList4.add(listIAuthTabCallbackStub);
            }
        }
        List listFlatten = CollectionsKt.flatten(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : listFlatten) {
            if (obj3 instanceof RequireInput) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((RequireInput) it3.next()).onNavigationEvent());
        }
        Map mapOnExtraCallbackWithResult2 = access8100.onExtraCallbackWithResult(arrayList6);
        createAudienceNetworkRemoteService createaudiencenetworkremoteservice = new createAudienceNetworkRemoteService();
        createaudiencenetworkremoteservice.putAll(mapOnExtraCallbackWithResult);
        createaudiencenetworkremoteservice.putAll(mapOnExtraCallbackWithResult2);
        if (str != null) {
            createaudiencenetworkremoteservice.put(str, dynamicLoader.IAuthTabCallback());
        }
        return createaudiencenetworkremoteservice;
    }

    private final void onNavigationEvent() {
        if (getView() != null) {
            TdsBottomCtaV1View tdsBottomCtaV1ViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
            List<isSignaturePolicyImplied> listAsInterface = asInterface();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsInterface) {
                if (obj instanceof RequireInput) {
                    arrayList.add(obj);
                }
            }
            boolean z = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((RequireInput) it.next()).IAuthTabCallback()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            tdsBottomCtaV1ViewOnExtraCallbackWithResult.setEnabledCta(z);
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
