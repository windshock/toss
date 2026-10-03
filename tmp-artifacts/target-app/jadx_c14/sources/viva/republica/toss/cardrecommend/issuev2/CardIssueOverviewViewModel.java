package viva.republica.toss.cardrecommend.issuev2;

import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.AccessDescription;
import o.AdSettingsIntegrationErrorMode;
import o.BaseRoundCornerProgressBar1;
import o.CertificationRequest;
import o.CloseableUtils;
import o.CxxInspectorPackagerConnection;
import o.DefaultMediaViewVideoRenderer;
import o.EncryptedPrivateKeyInfo;
import o.ExtraHints;
import o.FbValidationUtils;
import o.IAnimation;
import o.MacData;
import o.MapConverter;
import o.NISTObjectIdentifiers;
import o.NativeAdLayoutApi;
import o.NativeAdScrollViewApi;
import o.NativeAdViewApi;
import o.NativeAdViewAttributesApi;
import o.NativeBannerAdApi;
import o.NetConverter3;
import o.PageShowPoint;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RewardedInterstitialAdApi;
import o.RewardedVideoAdApi;
import o.Rmipmap;
import o.SignedDataParser;
import o.SignerIdentifier;
import o.SignerInfo;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TypographyKtExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17$onUserLeaveHint;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.clearTid;
import o.commonTestFlag;
import o.createAdSizeApi;
import o.createRewardedInterstitialAd;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.failAtMillis;
import o.findResAndMsg;
import o.getANActivityLifecycleCallbacksListener;
import o.getAuthenticatedAttributes;
import o.getCoefficient;
import o.getCornerRadius;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getExponent2;
import o.getModulus;
import o.getPSourceAlgorithm;
import o.getPublicExponent;
import o.getTypeID;
import o.isRemoteRenderingProcess;
import o.isTestMode;
import o.maybeUpdateAnimatable;
import o.nLockFileSegment;
import o.setApTextSize;
import o.setLogBuffers;
import o.setMessageBytes;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.warnAtMillis;
import o.wasLastName;
import o.writeRaw;
import o.ycxycx;
import o.zb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSettingFragment;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertResultRequest;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatus;
import viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatusResp;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishNameResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueOverviewViewModel extends isTestMode {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;
    private final Map<String, wasLastName> IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private SignerInfo IAuthTabCallbackStub;
    private final deserializeUriCollection IAuthTabCallbackStubProxy;
    private final Map<String, RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1> IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private String ICustomTabsCallbackDefault;
    private Boolean ICustomTabsCallbackStub;
    private BaseRoundCornerProgressBar1 ICustomTabsCallbackStubProxy;
    private final Rmipmap<getDigestAlgorithms<MacData>> ICustomTabsCallback_Parcel;
    private final Rmipmap<Unit> ICustomTabsService;
    private NativeAdLayoutApi access000;
    private final Rmipmap<createAdSizeApi.onExtraCallbackWithResult> access100;
    private Long asBinder;
    private CxxInspectorPackagerConnection asInterface;
    private boolean extraCallback;
    private onExtraCallback extraCallbackWithResult;
    private String extraCommand;
    private String getInterfaceDescriptor;
    private final Rmipmap<Throwable> isEngagementSignalsApiAvailable;
    private final Rmipmap<Boolean> mayLaunchUrl;
    private final Rmipmap<Unit> newAuthTabSession;
    private final Rmipmap<getDigestAlgorithms<getModulus>> newSession;
    private final Rmipmap<getExponent2> newSessionWithExtras;
    private Integer onActivityLayout;
    private String onActivityResized;
    private final List<createRewardedInterstitialAd> onExtraCallbackWithResult;
    private final Rmipmap<createAdSizeApi.onNavigationEvent> onMessageChannelReady;
    private final RxSharedApiCall<RecommendedEnglishNameResponse> onMinimized;
    private final getCornerRadius<SignerIdentifier> onNavigationEvent;
    private CertificationRequest onPostMessage;
    private BaseRoundCornerProgressBar1 onRelationshipValidationResult;
    private final DefaultMediaViewVideoRenderer onTransact;
    private String onUnminimized;
    private final nLockFileSegment<getAuthenticatedAttributes> onWarmupCompleted;
    private final Rmipmap<getDigestAlgorithms<getPSourceAlgorithm>> postMessage;
    private final IAnimation<getAuthenticatedAttributes> prefetch;
    private final Rmipmap<getPublicExponent> prefetchWithMultipleUrls;
    private final Rmipmap<Triple<TypographyKtExternalSyntheticLambda0, getANActivityLifecycleCallbacksListener, getDigestAlgorithms<getCoefficient>>> readTypedObject;
    private final Rmipmap<getDigestAlgorithms<getCoefficient>> receiveFile;
    private boolean requestPostMessageChannel;
    private String setEngagementSignalsCallback;
    private CardIssueSettingFragment.IAuthTabCallback writeTypedObject;

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardIssueOverviewViewModel.this.onWarmupCompleted((String) null, (String) null, (String) null, (access13800<? super Boolean>) this);
        }
    }

    static final class asBinder extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CardIssueOverviewViewModel.this.onWarmupCompleted(false, (NativeAdLayoutApi) null, (List<NativeAdViewApi>) null, (access13800<? super Boolean>) this);
        }
    }

    public static final class IAuthTabCallbackStub<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallbackStub(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<NativeAdViewAttributesApi> apply(writeRaw<BaseApiResponse<NativeAdViewAttributesApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onUserLeaveHint(new Function1<BaseApiResponse<NativeAdViewAttributesApi>, deserializeIp<? extends NativeAdViewAttributesApi>>() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.IAuthTabCallbackStub.2
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends NativeAdViewAttributesApi> invoke(BaseApiResponse<NativeAdViewAttributesApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = NativeAdViewAttributesApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackStubProxy<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallbackStubProxy(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<RecommendedEnglishNameResponse> apply(writeRaw<BaseApiResponse<RecommendedEnglishNameResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onUserLeaveHint(new Function1<BaseApiResponse<RecommendedEnglishNameResponse>, deserializeIp<? extends RecommendedEnglishNameResponse>>() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.IAuthTabCallbackStubProxy.5
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends RecommendedEnglishNameResponse> invoke(BaseApiResponse<RecommendedEnglishNameResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = RecommendedEnglishNameResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class access000<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public access000(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onUserLeaveHint(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.access000.1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Object.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onTransact<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onTransact(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<NativeAdViewAttributesApi> apply(writeRaw<BaseApiResponse<NativeAdViewAttributesApi>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onUserLeaveHint(new Function1<BaseApiResponse<NativeAdViewAttributesApi>, deserializeIp<? extends NativeAdViewAttributesApi>>() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onTransact.1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends NativeAdViewAttributesApi> invoke(BaseApiResponse<NativeAdViewAttributesApi> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = NativeAdViewAttributesApi.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onUserLeaveHint(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onWarmupCompleted.4
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    @Inject
    public CardIssueOverviewViewModel(@NotNull DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer) {
        Intrinsics.checkNotNullParameter(defaultMediaViewVideoRenderer, "");
        this.onTransact = defaultMediaViewVideoRenderer;
        this.onActivityResized = "";
        this.IAuthTabCallbackStubProxy = new deserializeUriCollection();
        this.getInterfaceDescriptor = "";
        this.ICustomTabsCallback = true;
        ArrayList arrayList = new ArrayList();
        List listIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listIAuthTabCallback) {
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).requestPostMessageChannelWithExtras()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            String strIAuthTabCallback = null;
            if (!it.hasNext()) {
                arrayList.addAll(arrayList3);
                this.onExtraCallbackWithResult = arrayList;
                this.IAuthTabCallback_Parcel = new LinkedHashMap();
                this.IAuthTabCallback = new LinkedHashMap();
                this.ICustomTabsCallback_Parcel = new Rmipmap<>();
                this.newSessionWithExtras = new Rmipmap<>();
                this.prefetchWithMultipleUrls = new Rmipmap<>();
                this.receiveFile = new Rmipmap<>();
                this.newSession = new Rmipmap<>();
                this.onNavigationEvent = setShine.onNavigationEvent(SignerIdentifier.onExtraCallbackWithResult.IAuthTabCallback);
                this.setEngagementSignalsCallback = "";
                this.ICustomTabsService = new Rmipmap<>();
                this.postMessage = new Rmipmap<>();
                this.newAuthTabSession = new Rmipmap<>();
                this.access100 = new Rmipmap<>();
                this.onMessageChannelReady = new Rmipmap<>();
                this.mayLaunchUrl = new Rmipmap<>();
                this.isEngagementSignalsApiAvailable = new Rmipmap<>();
                this.readTypedObject = new Rmipmap<>();
                RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
                writeRaw<BaseApiResponse<RecommendedEnglishNameResponse>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onNavigationEvent();
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallbackStubProxy(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                this.onMinimized = RxSharedApiCall.Companion.onWarmupCompleted(companion, "recommendName", writerawIAuthTabCallback, (Object) null, (setLogBuffers) null, 12, (Object) null);
                nLockFileSegment<getAuthenticatedAttributes> nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(0, (CloseableUtils) null, (Function1) null, 7, (Object) null);
                this.onWarmupCompleted = nlockfilesegmentOnExtraCallbackWithResult;
                this.prefetch = ycxycx.IAuthTabCallback(nlockfilesegmentOnExtraCallbackWithResult);
                this.writeTypedObject = CardIssueSettingFragment.IAuthTabCallback.NORMAL;
                return;
            }
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next();
            Date dateIAuthTabCallbackStubProxy = tabBarInfoQueryPointOnTabBarInfoQueryListener.IAuthTabCallbackStubProxy();
            if (dateIAuthTabCallbackStubProxy != null) {
                strIAuthTabCallback = commonTestFlag.onExtraCallback.IAuthTabCallback("yyyyMMdd", dateIAuthTabCallbackStubProxy);
            }
            arrayList3.add(new createRewardedInterstitialAd(tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface(), tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_(), strIAuthTabCallback));
        }
    }

    public final String onActivityResized() {
        return this.onActivityResized;
    }

    public final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onActivityResized = str;
    }

    public final String onPostMessage() {
        return this.ICustomTabsCallbackDefault;
    }

    public final void onWarmupCompleted(@Nullable String str) {
        this.ICustomTabsCallbackDefault = str;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        this.onUnminimized = str;
    }

    public final String ICustomTabsCallbackStub() {
        return this.onUnminimized;
    }

    public final deserializeUriCollection access100() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final String getInterfaceDescriptor() {
        return this.getInterfaceDescriptor;
    }

    public final String ICustomTabsCallbackStubProxy() {
        return this.extraCommand;
    }

    public final void asInterface(@Nullable String str) {
        this.extraCommand = str;
    }

    public final void IAuthTabCallback(@Nullable Long l) {
        this.asBinder = l;
    }

    public final Long IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public final void onExtraCallbackWithResult(@Nullable String str) {
        this.IAuthTabCallbackDefault = str;
    }

    public final String onTransact() {
        return this.IAuthTabCallbackDefault;
    }

    public final void onNavigationEvent(boolean z) {
        this.ICustomTabsCallback = z;
    }

    public final boolean writeTypedObject() {
        return this.ICustomTabsCallback;
    }

    public final List<createRewardedInterstitialAd> onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final Map<String, RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1> access000() {
        return this.IAuthTabCallback_Parcel;
    }

    public final Map<String, wasLastName> asBinder() {
        return this.IAuthTabCallback;
    }

    public final BaseRoundCornerProgressBar1 onRelationshipValidationResult() {
        return this.ICustomTabsCallbackStubProxy;
    }

    public final void onExtraCallback(@Nullable BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1) {
        this.ICustomTabsCallbackStubProxy = baseRoundCornerProgressBar1;
        SignedDataParser.IAuthTabCallback.onNavigationEvent(baseRoundCornerProgressBar1);
    }

    public final BaseRoundCornerProgressBar1 onUnminimized() {
        return this.onRelationshipValidationResult;
    }

    public final void onWarmupCompleted(@Nullable BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1) {
        this.onRelationshipValidationResult = baseRoundCornerProgressBar1;
    }

    public final void onExtraCallbackWithResult(@NotNull IdVerificationFormValue.IdType idType, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        IAuthTabCallback();
        this.extraCallbackWithResult = new onExtraCallback(idType, bArr);
    }

    public final onExtraCallback ICustomTabsCallback() {
        return this.extraCallbackWithResult;
    }

    public final void IAuthTabCallback() {
        byte[] bArrIAuthTabCallback;
        onExtraCallback onextracallback = this.extraCallbackWithResult;
        if (onextracallback != null && (bArrIAuthTabCallback = onextracallback.IAuthTabCallback()) != null) {
            ArraysKt.fill$default(bArrIAuthTabCallback, (byte) 0, 0, 0, 6, (Object) null);
        }
        this.extraCallbackWithResult = null;
    }

    public final Rmipmap<getDigestAlgorithms<MacData>> extraCommand() {
        return this.ICustomTabsCallback_Parcel;
    }

    public final Rmipmap<getExponent2> prefetch() {
        return this.newSessionWithExtras;
    }

    public final Rmipmap<getPublicExponent> receiveFile() {
        return this.prefetchWithMultipleUrls;
    }

    public final Rmipmap<getDigestAlgorithms<getCoefficient>> requestPostMessageChannel() {
        return this.receiveFile;
    }

    public final Rmipmap<getDigestAlgorithms<getModulus>> newSession() {
        return this.newSession;
    }

    public final setRubIn<SignerIdentifier> prefetchWithMultipleUrls() {
        return ycxycx.onExtraCallback(this.onNavigationEvent);
    }

    public final void IAuthTabCallback(boolean z) {
        this.requestPostMessageChannel = z;
    }

    public final boolean postMessage() {
        return this.requestPostMessageChannel;
    }

    public final Rmipmap<Unit> ICustomTabsService() {
        return this.ICustomTabsService;
    }

    public final Rmipmap<getDigestAlgorithms<getPSourceAlgorithm>> isEngagementSignalsApiAvailable() {
        return this.postMessage;
    }

    public final Rmipmap<Unit> newAuthTabSession() {
        return this.newAuthTabSession;
    }

    public final Rmipmap<createAdSizeApi.onExtraCallbackWithResult> IAuthTabCallbackStubProxy() {
        return this.access100;
    }

    public final Rmipmap<createAdSizeApi.onNavigationEvent> onMessageChannelReady() {
        return this.onMessageChannelReady;
    }

    public final Rmipmap<Boolean> ICustomTabsCallback_Parcel() {
        return this.mayLaunchUrl;
    }

    public final Rmipmap<Throwable> mayLaunchUrl() {
        return this.isEngagementSignalsApiAvailable;
    }

    public final CertificationRequest readTypedObject() {
        return this.onPostMessage;
    }

    public final Rmipmap<Triple<TypographyKtExternalSyntheticLambda0, getANActivityLifecycleCallbacksListener, getDigestAlgorithms<getCoefficient>>> extraCallbackWithResult() {
        return this.readTypedObject;
    }

    public final RxSharedApiCall<RecommendedEnglishNameResponse> onMinimized() {
        return this.onMinimized;
    }

    public final void onNavigationEvent(@Nullable NativeAdLayoutApi nativeAdLayoutApi) {
        this.access000 = nativeAdLayoutApi;
    }

    public final SignerInfo IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    public final void onExtraCallback(@Nullable SignerInfo signerInfo) {
        this.IAuthTabCallbackStub = signerInfo;
    }

    public final Boolean ICustomTabsCallbackDefault() {
        return this.ICustomTabsCallbackStub;
    }

    public final void IAuthTabCallback(@Nullable CxxInspectorPackagerConnection cxxInspectorPackagerConnection) {
        this.asInterface = cxxInspectorPackagerConnection;
    }

    public final CxxInspectorPackagerConnection asInterface() {
        return this.asInterface;
    }

    public final void onWarmupCompleted(boolean z) {
        this.extraCallback = z;
    }

    public final boolean requestPostMessageChannelWithExtras() {
        return this.extraCallback;
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        this.onActivityLayout = num;
    }

    public final Integer onActivityLayout() {
        return this.onActivityLayout;
    }

    public final IAnimation<getAuthenticatedAttributes> newSessionWithExtras() {
        return this.prefetch;
    }

    public final void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getInterfaceDescriptor = str;
        ICustomTabsServiceStub();
        Object[] objArr = {this.onMinimized, null, null, false, 7, null};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult((writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent()), new CardIssueOverviewViewModel$.ExternalSyntheticLambda0(), new CardIssueOverviewViewModel$.ExternalSyntheticLambda1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(RecommendedEnglishNameResponse recommendedEnglishNameResponse) {
        Intrinsics.checkNotNullParameter(recommendedEnglishNameResponse, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public final writeRaw<NativeAdViewAttributesApi> setEngagementSignalsCallback() {
        writeRaw<BaseApiResponse<NativeAdViewAttributesApi>> writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onExtraCallbackWithResult(this.getInterfaceDescriptor, new failAtMillis(0, this.IAuthTabCallback_Parcel, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, null, true, this.onActivityResized));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(60L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onTransact(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda14
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.IAuthTabCallback_Parcel(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda15
            public final void run() {
                CardIssueOverviewViewModel.asInterface(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onExtraCallbackWithResult(this.f$0, (NativeAdViewAttributesApi) obj);
            }
        };
        writeRaw<NativeAdViewAttributesApi> writerawOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda17
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.access000(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        return writerawOnNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(CardIssueOverviewViewModel cardIssueOverviewViewModel, deserializeUriNullableCollection deserializeurinullablecollection) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access000(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueOverviewViewModel cardIssueOverviewViewModel, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        isRemoteRenderingProcess isremoterenderingprocessOnWarmupCompleted = nativeAdViewAttributesApi.onWarmupCompleted();
        cardIssueOverviewViewModel.onPostMessage = isremoterenderingprocessOnWarmupCompleted != null ? EncryptedPrivateKeyInfo.onExtraCallbackWithResult(isremoterenderingprocessOnWarmupCompleted) : null;
        cardIssueOverviewViewModel.onWarmupCompleted(nativeAdViewAttributesApi.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    public final writeRaw<NativeAdViewAttributesApi> IAuthTabCallback(int i) {
        writeRaw<BaseApiResponse<NativeAdViewAttributesApi>> writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onExtraCallbackWithResult(this.getInterfaceDescriptor, new failAtMillis(i, this.IAuthTabCallback_Parcel, this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, this.extraCommand, false, this.onActivityResized, 32, null));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onTransact(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(60L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnExtraCallback = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.IAuthTabCallbackStub(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.IAuthTabCallback(this.f$0, (NativeAdViewAttributesApi) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnExtraCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.onTransact(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        writeRaw<NativeAdViewAttributesApi> writerawOnWarmupCompleted2 = writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda7
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.asBinder(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted2, "");
        return writerawOnWarmupCompleted2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CardIssueOverviewViewModel cardIssueOverviewViewModel, deserializeUriNullableCollection deserializeurinullablecollection) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.FALSE);
        isRemoteRenderingProcess isremoterenderingprocessOnWarmupCompleted = nativeAdViewAttributesApi.onWarmupCompleted();
        cardIssueOverviewViewModel.onPostMessage = isremoterenderingprocessOnWarmupCompleted != null ? EncryptedPrivateKeyInfo.onExtraCallbackWithResult(isremoterenderingprocessOnWarmupCompleted) : null;
        cardIssueOverviewViewModel.onWarmupCompleted(nativeAdViewAttributesApi.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, Throwable th) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(int i) {
        writeRaw<BaseApiResponse<Object>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onNavigationEvent(this.getInterfaceDescriptor, new NativeBannerAdApi(this.extraCommand, i, this.IAuthTabCallback_Parcel));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new access000(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.IAuthTabCallbackStub((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onExtraCallbackWithResult(obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult() {
        writeRaw<BaseApiResponse<Boolean>> writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.asInterface().onExtraCallbackWithResult(this.getInterfaceDescriptor, this.extraCommand);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onExtraCallback(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda9
            public final void accept(Object obj) {
                CardIssueOverviewViewModel.asInterface(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda10
            public final void run() {
                CardIssueOverviewViewModel.IAuthTabCallbackDefault(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onExtraCallback((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return CardIssueOverviewViewModel.onNavigationEvent(this.f$0, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueOverviewViewModel cardIssueOverviewViewModel, deserializeUriNullableCollection deserializeurinullablecollection) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        cardIssueOverviewViewModel.mayLaunchUrl.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CardIssueOverviewViewModel cardIssueOverviewViewModel, Boolean bool) {
        cardIssueOverviewViewModel.access100.onWarmupCompleted();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(List<? extends FbValidationUtils> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            onWarmupCompleted((FbValidationUtils) it.next());
        }
    }

    private final void onWarmupCompleted(FbValidationUtils fbValidationUtils) {
        if (this.IAuthTabCallback.get(fbValidationUtils.onNavigationEvent()) == null) {
            this.IAuthTabCallback.put(fbValidationUtils.onNavigationEvent(), NISTObjectIdentifiers.onExtraCallback(fbValidationUtils));
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOverviewViewModel.this.new IAuthTabCallbackDefault(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CardIssueOverviewViewModel cardIssueOverviewViewModel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueOverviewViewModel cardIssueOverviewViewModel2 = CardIssueOverviewViewModel.this;
                getTypeID gettypeid = getTypeID.IAuthTabCallback;
                this.L$0 = cardIssueOverviewViewModel2;
                this.label = 1;
                Object objOnWarmupCompleted2 = getTypeID.onWarmupCompleted(gettypeid, false, (Long) null, this, 3, (Object) null);
                if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                cardIssueOverviewViewModel = cardIssueOverviewViewModel2;
                obj = objOnWarmupCompleted2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cardIssueOverviewViewModel = (CardIssueOverviewViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            cardIssueOverviewViewModel.IAuthTabCallback((CxxInspectorPackagerConnection) obj);
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsServiceStub() {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
    }

    @Override // o.isTestMode
    public void onCleared() {
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
        onWarmupCompleted();
    }

    public final void onWarmupCompleted() {
        this.extraCommand = null;
        this.IAuthTabCallback_Parcel.clear();
        IAuthTabCallback();
        SignedDataParser.IAuthTabCallback.onWarmupCompleted();
    }

    public final void onNavigationEvent(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getANActivityLifecycleCallbacksListener getanactivitylifecyclecallbackslistener, @NotNull getDigestAlgorithms<getCoefficient> getdigestalgorithms) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getanactivitylifecyclecallbackslistener, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        this.readTypedObject.setValue(new Triple(typographyKtExternalSyntheticLambda0, getanactivitylifecyclecallbackslistener, getdigestalgorithms));
    }

    public final Object onExtraCallbackWithResult(@NotNull List<NativeAdViewApi> list, @NotNull access13800<? super Boolean> access13800Var) {
        return onWarmupCompleted(false, this.access000, list, access13800Var);
    }

    public final Object onNavigationEvent(@NotNull List<NativeAdViewApi> list, @NotNull access13800<? super Boolean> access13800Var) {
        SignerInfo signerInfo = this.IAuthTabCallbackStub;
        return onWarmupCompleted(true, signerInfo != null ? signerInfo.IAuthTabCallback() : null, list, access13800Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        r0 = onExtraCallback((java.lang.String) null, r0.onNavigationEvent());
     */
    /* JADX WARN: Path cross not found for [B:49:0x0141, B:23:0x0092], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e9 -> B:39:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015d -> B:59:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(boolean r24, o.NativeAdLayoutApi r25, java.util.List<o.NativeAdViewApi> r26, o.access13800<? super java.lang.Boolean> r27) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onWarmupCompleted(boolean, o.NativeAdLayoutApi, java.util.List, o.access13800):java.lang.Object");
    }

    private final boolean onExtraCallback(String str, List<NativeAdScrollViewApi> list) {
        if (str == null || str.length() == 0 || list.isEmpty()) {
            return false;
        }
        return onNavigationEvent(str, list);
    }

    private final boolean onWarmupCompleted(String str, List<NativeAdScrollViewApi> list) {
        if (str == null || list.isEmpty()) {
            return false;
        }
        return onNavigationEvent(str, list);
    }

    public final Object IAuthTabCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @NotNull List<NativeAdScrollViewApi> list, @NotNull access13800<? super Boolean> access13800Var) {
        boolean zOnNavigationEvent = false;
        if (str == null) {
            return access14000.onNavigationEvent(false);
        }
        if (!z || list.isEmpty()) {
            if (z) {
                return onWarmupCompleted(str, str2, str3, access13800Var);
            }
            zOnNavigationEvent = !list.isEmpty() ? onNavigationEvent(str2, list) : true;
        } else if (onNavigationEvent(str2, list)) {
            return onWarmupCompleted(str, str2, str3, access13800Var);
        }
        return access14000.onNavigationEvent(zOnNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(java.lang.String r11, java.lang.String r12, java.lang.String r13, o.access13800<? super java.lang.Boolean> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.IAuthTabCallback_Parcel
            if (r0 == 0) goto L13
            r0 = r14
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$IAuthTabCallback_Parcel r0 = (viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.IAuthTabCallback_Parcel) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$IAuthTabCallback_Parcel r0 = new viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$IAuthTabCallback_Parcel
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r11 = r0.L$3
            o.access13800 r11 = (o.access13800) r11
            java.lang.Object r11 = r0.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.onNavigationEvent(r14)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            goto L7d
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            kotlin.ResultKt.onNavigationEvent(r14)
            kotlin.Result$Companion r14 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            o.GeckoHubImp r14 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$access100 r2 = new viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$access100     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r5 = 0
            r4 = r2
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            java.lang.Object r11 = o.access15400.onNavigationEvent(r11)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.L$0 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            java.lang.Object r11 = o.access15400.onNavigationEvent(r12)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.L$1 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            java.lang.Object r11 = o.access15400.onNavigationEvent(r13)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.L$2 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            java.lang.Object r11 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.L$3 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r11 = 0
            r0.I$0 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.I$1 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.I$2 = r11     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            r0.label = r3     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            java.lang.Object r14 = o.maybeUpdateAnimatable.onExtraCallback(r14, r2, r0)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            if (r14 != r1) goto L7d
            return r1
        L7d:
            java.lang.Object r11 = kotlin.Result.constructor-impl(r14)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8e o.WebResourceResponseModel -> L90
            goto L9b
        L82:
            r11 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.constructor-impl(r11)
            goto L9b
        L8e:
            r11 = move-exception
            throw r11
        L90:
            r11 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.constructor-impl(r11)
        L9b:
            kotlin.ResultKt.onNavigationEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onWarmupCompleted(java.lang.String, java.lang.String, java.lang.String, o.access13800):java.lang.Object");
    }

    public static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        final /* synthetic */ String $address$inlined;
        final /* synthetic */ String $addressDetail$inlined;
        final /* synthetic */ String $zipCode$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CardIssueOverviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(access13800 access13800Var, CardIssueOverviewViewModel cardIssueOverviewViewModel, String str, String str2, String str3) {
            super(2, access13800Var);
            this.this$0 = cardIssueOverviewViewModel;
            this.$address$inlined = str;
            this.$addressDetail$inlined = str2;
            this.$zipCode$inlined = str3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new access100(access13800Var, this.this$0, this.$address$inlined, this.$addressDetail$inlined, this.$zipCode$inlined);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ExtraHints extraHintsOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onExtraCallback();
                String interfaceDescriptor = this.this$0.getInterfaceDescriptor();
                String str = this.$address$inlined;
                if (str == null) {
                    str = "";
                }
                String str2 = this.$addressDetail$inlined;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.$zipCode$inlined;
                warnAtMillis warnatmillis = new warnAtMillis(str, str2, str3 != null ? str3 : "");
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = extraHintsOnExtraCallback.onWarmupCompleted(interfaceDescriptor, warnatmillis, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (Boolean) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(Boolean.class, Object.class) || Intrinsics.areEqual(Boolean.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    @Deprecated
    public final String IAuthTabCallback(@Nullable String str, @NotNull List<NativeAdScrollViewApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (str == null || str.length() == 0) {
            return null;
        }
        for (NativeAdScrollViewApi nativeAdScrollViewApi : list) {
            if (!new Regex(nativeAdScrollViewApi.onNavigationEvent()).onExtraCallbackWithResult(str)) {
                return nativeAdScrollViewApi.IAuthTabCallback();
            }
        }
        return null;
    }

    private final boolean onNavigationEvent(String str, List<NativeAdScrollViewApi> list) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String strIAuthTabCallback = IAuthTabCallback(str, list);
        return strIAuthTabCallback == null || strIAuthTabCallback.length() == 0;
    }

    public final void IAuthTabCallback(@NotNull getDigestAlgorithms<getModulus> getdigestalgorithms) {
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, getdigestalgorithms, (access13800) null), 3, (Object) null);
    }

    public final void onNavigationEvent() {
        Long lOnNavigationEvent;
        Integer numIAuthTabCallback;
        getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) this.newSession.getValue();
        if (getdigestalgorithms == null) {
            return;
        }
        RetryPolicy retryPolicyOnTransact = ((getModulus) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onTransact();
        int iIntValue = (retryPolicyOnTransact == null || (numIAuthTabCallback = retryPolicyOnTransact.IAuthTabCallback()) == null) ? 3 : numIAuthTabCallback.intValue();
        RetryPolicy retryPolicyOnTransact2 = ((getModulus) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onTransact();
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(iIntValue, (retryPolicyOnTransact2 == null || (lOnNavigationEvent = retryPolicyOnTransact2.onNavigationEvent()) == null) ? 1L : lOnNavigationEvent.longValue(), getdigestalgorithms, null), 3, (Object) null);
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ int $maxRetry;
        final /* synthetic */ getDigestAlgorithms<getModulus> $navigator;
        final /* synthetic */ long $retryIntervalSecond;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final /* synthetic */ class onExtraCallbackWithResult {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

            static {
                int[] iArr = new int[CardIssueTossCertStatus.values().length];
                try {
                    iArr[CardIssueTossCertStatus.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardIssueTossCertStatus.REQUESTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CardIssueTossCertStatus.IN_PROGRESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(int i, long j, getDigestAlgorithms<getModulus> getdigestalgorithms, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$maxRetry = i;
            this.$retryIntervalSecond = j;
            this.$navigator = getdigestalgorithms;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOverviewViewModel.this.new asInterface(this.$maxRetry, this.$retryIntervalSecond, this.$navigator, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0185 -> B:59:0x0188). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0196 -> B:61:0x019f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.asInterface.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CardIssueTossCertStatusResp>, Object> {
            final /* synthetic */ getDigestAlgorithms $navigator$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CardIssueOverviewViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, CardIssueOverviewViewModel cardIssueOverviewViewModel, getDigestAlgorithms getdigestalgorithms) {
                super(2, access13800Var);
                this.this$0 = cardIssueOverviewViewModel;
                this.$navigator$inlined = getdigestalgorithms;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(access13800Var, this.this$0, this.$navigator$inlined);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super CardIssueTossCertStatusResp> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer = this.this$0.onTransact;
                    String str = this.this$0.setEngagementSignalsCallback;
                    String strAsInterface = ((getModulus) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{this.$navigator$inlined}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).asInterface();
                    if (strAsInterface == null) {
                        strAsInterface = "";
                    }
                    CardIssueTossCertResultRequest cardIssueTossCertResultRequest = new CardIssueTossCertResultRequest(str, strAsInterface);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = defaultMediaViewVideoRenderer.onExtraCallback(cardIssueTossCertResultRequest, (access13800<? super BaseApiResponse<CardIssueTossCertStatusResp>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (CardIssueTossCertStatusResp) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.cardsales.funnel.CardIssueTossCertStatusResp");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(CardIssueTossCertStatusResp.class, Object.class) || Intrinsics.areEqual(CardIssueTossCertStatusResp.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }
    }

    public final void onNavigationEvent(@Nullable RetryPolicy retryPolicy, int i) {
        Long lOnNavigationEvent;
        Integer numIAuthTabCallback;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent((retryPolicy == null || (numIAuthTabCallback = retryPolicy.IAuthTabCallback()) == null) ? 30 : numIAuthTabCallback.intValue(), this, (retryPolicy == null || (lOnNavigationEvent = retryPolicy.onNavigationEvent()) == null) ? 1L : lOnNavigationEvent.longValue(), i, null), 3, (Object) null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ int $cursor;
        final /* synthetic */ int $maxRetry;
        final /* synthetic */ long $retryIntervalSecond;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ CardIssueOverviewViewModel this$0;

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final /* synthetic */ class C0023onNavigationEvent {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

            static {
                int[] iArr = new int[RewardedVideoAdApi.values().length];
                try {
                    iArr[RewardedVideoAdApi.COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RewardedVideoAdApi.PROGRESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, CardIssueOverviewViewModel cardIssueOverviewViewModel, long j, int i2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$maxRetry = i;
            this.this$0 = cardIssueOverviewViewModel;
            this.$retryIntervalSecond = j;
            this.$cursor = i2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$maxRetry, this.this$0, this.$retryIntervalSecond, this.$cursor, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super RewardedInterstitialAdApi>, Object> {
            final /* synthetic */ int $cursor$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CardIssueOverviewViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, CardIssueOverviewViewModel cardIssueOverviewViewModel, int i) {
                super(2, access13800Var);
                this.this$0 = cardIssueOverviewViewModel;
                this.$cursor$inlined = i;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(access13800Var, this.this$0, this.$cursor$inlined);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super RewardedInterstitialAdApi> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer = this.this$0.onTransact;
                    String interfaceDescriptor = this.this$0.getInterfaceDescriptor();
                    failAtMillis failatmillis = new failAtMillis(this.$cursor$inlined, this.this$0.access000(), this.this$0.onExtraCallback(), this.this$0.onTransact(), this.this$0.ICustomTabsCallbackStubProxy(), false, this.this$0.onActivityResized());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = defaultMediaViewVideoRenderer.onWarmupCompleted(interfaceDescriptor, failatmillis, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (RewardedInterstitialAdApi) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.cardsales.funnel.CardIssueSubmitResultResp");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(RewardedInterstitialAdApi.class, Object.class) || Intrinsics.areEqual(RewardedInterstitialAdApi.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x016d, code lost:
        
            if (r3.onExtraCallback(r4, r22) != r2) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01a0, code lost:
        
            if (r5.onExtraCallback(r8, r22) == r2) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01ca, code lost:
        
            if (r4.onExtraCallback(r5, r22) != r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01f8, code lost:
        
            if (r3.onExtraCallback(r5, r22) != r2) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0258, code lost:
        
            if (r0.onExtraCallback(r3, r22) == r2) goto L75;
         */
        /* JADX WARN: Path cross not found for [B:39:0x012f, B:59:0x01cf], limit reached: 78 */
        /* JADX WARN: Path cross not found for [B:59:0x01cf, B:39:0x012f], limit reached: 78 */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0227 -> B:70:0x022c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0239 -> B:72:0x023c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 626
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final AccessDescription IAuthTabCallback_Parcel() {
        return new AccessDescription(this.writeTypedObject);
    }

    public static final class onExtraCallback {
        private final byte[] IAuthTabCallback;
        private final IdVerificationFormValue.IdType onExtraCallbackWithResult;

        public onExtraCallback(@NotNull IdVerificationFormValue.IdType idType, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(idType, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            this.onExtraCallbackWithResult = idType;
            this.IAuthTabCallback = bArr;
        }

        public final IdVerificationFormValue.IdType onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final byte[] IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    public final void IAuthTabCallback(@NotNull CardIssueSettingFragment.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.writeTypedObject = iAuthTabCallback;
    }

    public final CardIssueSettingFragment.IAuthTabCallback extraCallback() {
        return this.writeTypedObject;
    }
}
