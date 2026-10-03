package viva.republica.toss.main.more.push;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import o.AppLovinAdImpl;
import o.BitmapUtilWhenMappingsExternalSyntheticApiModelOutline0;
import o.CERT_SetTrustRootCACert;
import o.CheckMask;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.GeckoHubImp;
import o.IPostMessageServiceStubProxy;
import o.InterstitialAdInterstitialLoadAdConfig;
import o.LifecyclesKtawaitStarted21;
import o.ReactJsExceptionHandlerProcessedErrorStackFrame;
import o.ResetInputBGRLivenessChecker;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WebResourceResponseModel;
import o.WorkForegroundRunnableExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.clearRevision;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getByteBuffer;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDummyAd;
import o.getKekid;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getPricingPhaseList;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.initMiniApp;
import o.isVideoAutoplay;
import o.maybeUpdateAnimatable;
import o.onRewardedAdCompleted;
import o.onRewardedAdServerFailed;
import o.onRewardedVideoCompleted;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.readIntokhttp;
import o.setHasShown;
import o.setRandomHost;
import o.setSerializerFeatures;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.block.RefreshNotificationChannel;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.Setting;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.Term;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NotificationMarketingSettingActivity extends Hilt_NotificationMarketingSettingActivity {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallbackStub = 8;
    private boolean IAuthTabCallbackDefault;
    private onRewardedVideoCompleted IAuthTabCallbackStubProxy;
    private onRewardedAdCompleted.onExtraCallbackWithResult access000;
    private onRewardedAdCompleted asBinder;

    @Inject
    public setSerializerFeatures marketingNotificationAvailability;

    @Inject
    public getPricingPhaseList region;

    @Inject
    public InterstitialAdInterstitialLoadAdConfig serviceManagementApi;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStubProxy(this));
    private final Map<Long, Boolean> access100 = new LinkedHashMap();
    private boolean getInterfaceDescriptor = true;
    private final SessionTrackera IAuthTabCallback_Parcel = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda33
        public final Object invoke(Object obj) {
            return NotificationMarketingSettingActivity.IAuthTabCallback(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });
    private final SessionTrackera asInterface = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda34
        public final Object invoke(Object obj) {
            return NotificationMarketingSettingActivity.onExtraCallbackWithResult(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });

    public long getScreenId() {
        return 1007941L;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<CERT_SetTrustRootCACert> {
        final /* synthetic */ Activity IAuthTabCallback;

        public IAuthTabCallbackStubProxy(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_SetTrustRootCACert invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_SetTrustRootCACert.onNavigationEvent(layoutInflater);
        }
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("setting_type", "marketing")});
    }

    private final CERT_SetTrustRootCACert ICustomTabsServiceStub() {
        return (CERT_SetTrustRootCACert) this.onTransact.getValue();
    }

    public final SessionTrackerb ICustomTabsServiceDefault() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzag updateVisuals() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final InterstitialAdInterstitialLoadAdConfig setEngagementSignalsCallback() {
        InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig = this.serviceManagementApi;
        if (interstitialAdInterstitialLoadAdConfig != null) {
            return interstitialAdInterstitialLoadAdConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final getDummyAd validateRelationship() {
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final setSerializerFeatures onNavigationEvent() {
        setSerializerFeatures setserializerfeatures = this.marketingNotificationAvailability;
        if (setserializerfeatures != null) {
            return setserializerfeatures;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final getPricingPhaseList IAuthTabCallback() {
        getPricingPhaseList getpricingphaselist = this.region;
        if (getpricingphaselist != null) {
            return getpricingphaselist;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult = notificationMarketingSettingActivity.access000;
        notificationMarketingSettingActivity.access000 = null;
        if (onextracallbackwithresult == null) {
            return Unit.INSTANCE;
        }
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(notificationMarketingSettingActivity), (CoroutineContext) null, (setRandomHost) null, notificationMarketingSettingActivity.new IAuthTabCallback_Parcel(onextracallbackwithresult, null), 3, (Object) null);
        } else {
            notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresult);
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onRewardedAdCompleted.onExtraCallbackWithResult $affiliateSetting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$affiliateSetting = onextracallbackwithresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new IAuthTabCallback_Parcel(this.$affiliateSetting, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ResultKt.onNavigationEvent(obj);
                NotificationMarketingSettingActivity.this.onExtraCallbackWithResult(this.$affiliateSetting);
                RefreshNotificationChannel.onNavigationEvent.onWarmupCompleted();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(NotificationMarketingSettingActivity notificationMarketingSettingActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            onExtraCallbackWithResult(notificationMarketingSettingActivity, null, 1, null);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(notificationMarketingSettingActivity), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RefreshNotificationChannel.onNavigationEvent.onWarmupCompleted();
            return Unit.INSTANCE;
        }
    }

    @Override // viva.republica.toss.main.more.push.Hilt_NotificationMarketingSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (IAuthTabCallback() == getPricingPhaseList.KR) {
            IEngagementSignalsCallback();
        } else {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new asBinder(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setSerializerFeatures setserializerfeaturesOnNavigationEvent = NotificationMarketingSettingActivity.this.onNavigationEvent();
                this.label = 1;
                obj = setserializerfeaturesOnNavigationEvent.onExtraCallback(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                NotificationMarketingSettingActivity.this.IEngagementSignalsCallback();
            } else {
                NotificationMarketingSettingActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void IEngagementSignalsCallback() {
        if (this.IAuthTabCallbackDefault || isFinishing()) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        setContentView(ICustomTabsServiceStub().getRoot());
        ConstraintLayout root = ICustomTabsServiceStub().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, ICustomTabsServiceStub().IAuthTabCallback, ICustomTabsServiceStub().onNavigationEvent, (View) null, false, 12, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            supportActionBar.onExtraCallbackWithResult(R.string.title_notification_marketing_setting);
        }
        this.IAuthTabCallbackStubProxy = new onRewardedVideoCompleted();
        ICustomTabsService_Parcel();
        writeTypedList();
        this.getInterfaceDescriptor = false;
        onExtraCallbackWithResult(this, null, 1, null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RefreshNotificationChannel.onNavigationEvent.onWarmupCompleted();
            return Unit.INSTANCE;
        }
    }

    public void onDestroy() {
        isVideoAutoplay isvideoautoplay = this.IAuthTabCallbackStubProxy;
        if (isvideoautoplay != null) {
            if (isvideoautoplay == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                isvideoautoplay = null;
            }
            isvideoautoplay.IAuthTabCallbackStubProxy();
        }
        super.onDestroy();
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RefreshNotificationChannel.onNavigationEvent.onWarmupCompleted();
            return Unit.INSTANCE;
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i2 == -1) {
            if (i == 1240) {
                onExtraCallbackWithResult(this, null, 1, null);
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
            } else {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // viva.republica.toss.main.more.push.Hilt_NotificationMarketingSettingActivity
    public void onResume() {
        super.onResume();
        if (this.IAuthTabCallbackDefault && this.getInterfaceDescriptor) {
            this.getInterfaceDescriptor = false;
            onExtraCallbackWithResult(this, null, 1, null);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            RefreshNotificationChannel.onNavigationEvent.onWarmupCompleted();
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsService_Parcel() {
        TdsSkeletonV1View tdsSkeletonV1View = ICustomTabsServiceStub().onExtraCallbackWithResult;
        Intrinsics.checkNotNull(tdsSkeletonV1View);
        Context context = tdsSkeletonV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsSkeletonV1View.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted());
        tdsSkeletonV1View.setVisibility(0);
        TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor getinterfacedescriptor = TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
        getinterfacedescriptor.onExtraCallback(3);
        tdsSkeletonV1View.setSkeletonType(getinterfacedescriptor);
        onRewardedVideoCompleted onrewardedvideocompleted = this.IAuthTabCallbackStubProxy;
        RecyclerView.Adapter adapter = null;
        if (onrewardedvideocompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedvideocompleted = null;
        }
        this.asBinder = new onRewardedAdCompleted(this, onrewardedvideocompleted);
        RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView.Adapter adapter2 = this.asBinder;
        if (adapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            adapter = adapter2;
        }
        recyclerView.setAdapter(adapter);
    }

    private final void writeTypedList() {
        onRewardedVideoCompleted onrewardedvideocompleted = this.IAuthTabCallbackStubProxy;
        if (onrewardedvideocompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedvideocompleted = null;
        }
        getByteBuffer getbytebufferOnExtraCallback = onrewardedvideocompleted.onNavigationEvent().onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getbytebufferOnExtraCallback.onExtraCallbackWithResult(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda12(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda11(this)), new NotificationMarketingSettingActivity$.ExternalSyntheticLambda14(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda13()));
        onRewardedVideoCompleted onrewardedvideocompleted2 = this.IAuthTabCallbackStubProxy;
        if (onrewardedvideocompleted2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedvideocompleted2 = null;
        }
        getByteBuffer getbytebufferOnExtraCallback2 = onrewardedvideocompleted2.onExtraCallbackWithResult().onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback2, "");
        getbytebufferOnExtraCallback2.onExtraCallbackWithResult(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda16(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda15(this)), new NotificationMarketingSettingActivity$.ExternalSyntheticLambda18(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda17()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access100(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdServerFailed onrewardedadserverfailed) {
        Intrinsics.checkNotNull(onrewardedadserverfailed);
        notificationMarketingSettingActivity.onNavigationEvent(onrewardedadserverfailed);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readTypedObject(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationMarketing", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extraCallbackWithResult(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        if (notificationMarketingSettingActivity.onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent()) && notificationMarketingSettingActivity.IAuthTabCallback(onextracallbackwithresult.onNavigationEvent())) {
            Intrinsics.checkNotNull(onextracallbackwithresult);
            notificationMarketingSettingActivity.onNavigationEvent(onextracallbackwithresult);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(onextracallbackwithresult);
        String strIAuthTabCallback = notificationMarketingSettingActivity.IAuthTabCallback(onextracallbackwithresult);
        if (onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult() && strIAuthTabCallback != null) {
            notificationMarketingSettingActivity.onWarmupCompleted(onextracallbackwithresult, strIAuthTabCallback);
        } else {
            notificationMarketingSettingActivity.onWarmupCompleted(onextracallbackwithresult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationMarketing", th);
        return Unit.INSTANCE;
    }

    private final boolean onExtraCallbackWithResult(String str) {
        onRewardedAdCompleted onrewardedadcompleted = this.asBinder;
        if (onrewardedadcompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedadcompleted = null;
        }
        List listOnExtraCallbackWithResult = onrewardedadcompleted.onExtraCallbackWithResult();
        if ((listOnExtraCallbackWithResult instanceof Collection) && listOnExtraCallbackWithResult.isEmpty()) {
            return true;
        }
        for (Object obj : listOnExtraCallbackWithResult) {
            if (obj instanceof onRewardedAdCompleted.onExtraCallbackWithResult) {
                onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult = (onRewardedAdCompleted.onExtraCallbackWithResult) obj;
                if (Intrinsics.areEqual(onextracallbackwithresult.onNavigationEvent(), str) && onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean IAuthTabCallback(String str) {
        Term term;
        onRewardedAdCompleted onrewardedadcompleted = this.asBinder;
        Object obj = null;
        if (onrewardedadcompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedadcompleted = null;
        }
        Sequence sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(CollectionsKt.asSequence(onrewardedadcompleted.onExtraCallbackWithResult()), asInterface.onExtraCallbackWithResult);
        Intrinsics.checkNotNull(sequenceOnWarmupCompleted, "");
        Sequence sequenceAsBinder = clearRevision.asBinder(clearRevision.onWarmupCompleted(sequenceOnWarmupCompleted, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda24(str)), new NotificationMarketingSettingActivity$.ExternalSyntheticLambda25());
        if (!Intrinsics.areEqual(str, "TOSS_CORE")) {
            term = (Term) clearRevision.asBinder(sequenceAsBinder);
        } else {
            Iterator itIAuthTabCallback = sequenceAsBinder.IAuthTabCallback();
            while (true) {
                if (!itIAuthTabCallback.hasNext()) {
                    break;
                }
                Object next = itIAuthTabCallback.next();
                if (Intrinsics.areEqual(((Term) next).onExtraCallback(), "marketing-notification")) {
                    obj = next;
                    break;
                }
            }
            term = (Term) obj;
        }
        return term != null && term.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(String str, onRewardedAdCompleted.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(asinterface, "");
        return Intrinsics.areEqual(asinterface.IAuthTabCallback(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Term IAuthTabCallback(onRewardedAdCompleted.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(asinterface, "");
        return asinterface.onWarmupCompleted();
    }

    private final String IAuthTabCallback(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        Object next;
        Term termOnWarmupCompleted;
        StdConsentModuleCodes stdConsentModuleCodesIAuthTabCallback;
        onRewardedAdCompleted onrewardedadcompleted = this.asBinder;
        if (onrewardedadcompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedadcompleted = null;
        }
        List listOnExtraCallbackWithResult = onrewardedadcompleted.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnExtraCallbackWithResult) {
            if (obj instanceof onRewardedAdCompleted.asInterface) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((onRewardedAdCompleted.asInterface) next).IAuthTabCallback(), onextracallbackwithresult.onNavigationEvent())) {
                break;
            }
        }
        onRewardedAdCompleted.asInterface asinterface = (onRewardedAdCompleted.asInterface) next;
        if (asinterface == null || (termOnWarmupCompleted = asinterface.onWarmupCompleted()) == null || (stdConsentModuleCodesIAuthTabCallback = termOnWarmupCompleted.IAuthTabCallback()) == null) {
            return null;
        }
        String strOnNavigationEvent = onextracallbackwithresult.onExtraCallback().onNavigationEvent();
        int iHashCode = strOnNavigationEvent.hashCode();
        if (iHashCode != -1824972932) {
            if (iHashCode != -1446088425) {
                if (iHashCode == 504834271 && strOnNavigationEvent.equals("sms-notification")) {
                    return stdConsentModuleCodesIAuthTabCallback.onExtraCallbackWithResult();
                }
            } else if (strOnNavigationEvent.equals("app-notification")) {
                return stdConsentModuleCodesIAuthTabCallback.onWarmupCompleted();
            }
        } else if (strOnNavigationEvent.equals("email-notification")) {
            return stdConsentModuleCodesIAuthTabCallback.onExtraCallback();
        }
        return null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onRewardedAdCompleted.onExtraCallbackWithResult $affiliateSetting;
        final /* synthetic */ String $standardTermsCode;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(String str, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$standardTermsCode = str;
            this.$affiliateSetting = onextracallbackwithresult;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new onTransact(this.$standardTermsCode, this.$affiliateSetting, access13800Var);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context, viva.republica.toss.main.more.push.NotificationMarketingSettingActivity] */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnExtraCallback;
            SessionTrackera sessionTrackera;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ?? r1 = NotificationMarketingSettingActivity.this;
                    String str = this.$standardTermsCode;
                    Result.Companion companion = Result.Companion;
                    SessionTrackera sessionTrackera2 = ((NotificationMarketingSettingActivity) r1).IAuthTabCallback_Parcel;
                    getDummyAd getdummyadValidateRelationship = r1.validateRelationship();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = sessionTrackera2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadValidateRelationship, (Context) r1, str, (String) null, (String) null, 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388604, (Object) null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    sessionTrackera = sessionTrackera2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionTrackera = (SessionTrackera) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
                sessionTrackera.onNavigationEvent(objOnExtraCallback);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            NotificationMarketingSettingActivity notificationMarketingSettingActivity = NotificationMarketingSettingActivity.this;
            onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult = this.$affiliateSetting;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                notificationMarketingSettingActivity.access000 = null;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationMarketing", th.getMessage(), th, (Map) null, 8, (Object) null);
                notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresult);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str) {
        this.access000 = onextracallbackwithresult;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(str, onextracallbackwithresult, null), 3, (Object) null);
    }

    private final boolean onWarmupCompleted(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        if (!StringsKt.startsWith$default(str, "STD_", false, 2, (Object) null)) {
            return true;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(str, null), 3, (Object) null);
        return true;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $standardTermsCode;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$standardTermsCode = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new onNavigationEvent(this.$standardTermsCode, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context, viva.republica.toss.main.more.push.NotificationMarketingSettingActivity] */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnExtraCallback;
            SessionTrackera sessionTrackera;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ?? r1 = NotificationMarketingSettingActivity.this;
                    String str = this.$standardTermsCode;
                    Result.Companion companion = Result.Companion;
                    SessionTrackera sessionTrackera2 = ((NotificationMarketingSettingActivity) r1).asInterface;
                    getDummyAd getdummyadValidateRelationship = r1.validateRelationship();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = sessionTrackera2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadValidateRelationship, (Context) r1, str, (String) null, (String) null, 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388604, (Object) null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    sessionTrackera = sessionTrackera2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionTrackera = (SessionTrackera) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
                sessionTrackera.onNavigationEvent(objOnExtraCallback);
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationMarketing", th.getMessage(), th, (Map) null, 8, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        writeRaw writerawIAuthTabCallback = setEngagementSignalsCallback().onExtraCallback(onextracallbackwithresult.onNavigationEvent(), new BitmapUtilWhenMappingsExternalSyntheticApiModelOutline0(onextracallbackwithresult.onExtraCallback().onNavigationEvent(), onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult())).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda2(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda1(this))).onWarmupCompleted(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda3(this)).onNavigationEvent(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda5(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda4(this, onextracallbackwithresult)), new NotificationMarketingSettingActivity$.ExternalSyntheticLambda7(new NotificationMarketingSettingActivity$.ExternalSyntheticLambda6(this, onextracallbackwithresult)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMinimized(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(NotificationMarketingSettingActivity notificationMarketingSettingActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        BaseActivity.IAuthTabCallback(notificationMarketingSettingActivity, (String) null, false, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(NotificationMarketingSettingActivity notificationMarketingSettingActivity) {
        notificationMarketingSettingActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPostMessage(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, BaseApiResponse baseApiResponse) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(notificationMarketingSettingActivity), (CoroutineContext) null, (setRandomHost) null, notificationMarketingSettingActivity.new access000(onextracallbackwithresult, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
        if (baseApiResponse.asBinder()) {
            notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresult);
        }
        return Unit.INSTANCE;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ onRewardedAdCompleted.onExtraCallbackWithResult $affiliateSetting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$affiliateSetting = onextracallbackwithresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new access000(this.$affiliateSetting, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ResultKt.onNavigationEvent(obj);
                NotificationMarketingSettingActivity.this.onExtraCallbackWithResult(this.$affiliateSetting);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityLayout(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationMarketing", th.getMessage(), th, (Map) null, 8, (Object) null);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, notificationMarketingSettingActivity, false, (initMiniApp) null, (Function0) null, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda8(notificationMarketingSettingActivity, onextracallbackwithresult), 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, DialogInterface dialogInterface) {
        notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback().onExtraCallback(!onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult());
        IAuthTabCallbackStub(onextracallbackwithresult);
    }

    private final void IAuthTabCallbackStub(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        onRewardedAdCompleted onrewardedadcompleted = this.asBinder;
        RecyclerView.Adapter adapter = null;
        if (onrewardedadcompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedadcompleted = null;
        }
        Iterator it = onrewardedadcompleted.onExtraCallbackWithResult().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof onRewardedAdCompleted.onExtraCallbackWithResult) {
                onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = (onRewardedAdCompleted.onExtraCallbackWithResult) next;
                if (Intrinsics.areEqual(onextracallbackwithresult2.onExtraCallback().onNavigationEvent(), onextracallbackwithresult.onExtraCallback().onNavigationEvent()) && Intrinsics.areEqual(onextracallbackwithresult2.onNavigationEvent(), onextracallbackwithresult.onNavigationEvent())) {
                    break;
                }
            }
            i++;
        }
        if (i >= 0) {
            RecyclerView.Adapter adapter2 = this.asBinder;
            if (adapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                adapter = adapter2;
            }
            adapter.notifyItemChanged(i);
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj) {
        if ((i & 1) != 0) {
            onextracallbackwithresult = null;
        }
        notificationMarketingSettingActivity.onExtraCallbackWithResult(onextracallbackwithresult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        writeRaw writerawIAuthTabCallback = setEngagementSignalsCallback().IAuthTabCallback().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                return NotificationMarketingSettingActivity.IAuthTabCallback(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda27
            public final void accept(Object obj) {
                NotificationMarketingSettingActivity.writeTypedObject(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda28
            public final void run() {
                NotificationMarketingSettingActivity.onTransact(this.f$0);
            }
        });
        final NotificationMarketingSettingActivity$$ExternalSyntheticLambda29 notificationMarketingSettingActivity$$ExternalSyntheticLambda29 = new NotificationMarketingSettingActivity$$ExternalSyntheticLambda29(this, onextracallbackwithresult);
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda30
            public final void accept(Object obj) {
                NotificationMarketingSettingActivity.extraCallback(notificationMarketingSettingActivity$$ExternalSyntheticLambda29, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return NotificationMarketingSettingActivity.asInterface((Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda32
            public final void accept(Object obj) {
                NotificationMarketingSettingActivity.onActivityResized(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        BaseActivity.IAuthTabCallback(notificationMarketingSettingActivity, (String) null, false, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeTypedObject(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(NotificationMarketingSettingActivity notificationMarketingSettingActivity) {
        notificationMarketingSettingActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, BaseApiResponse baseApiResponse) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            List<MarketingNotification> listEmptyList = (List) baseApiResponse.onTransact();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            notificationMarketingSettingActivity.onExtraCallbackWithResult(listEmptyList, onextracallbackwithresult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResized(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationMarketing", th.getMessage(), th, (Map) null, 8, (Object) null);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(List<MarketingNotification> list, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        boolean zIsEmpty = this.access100.isEmpty();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IAuthTabCallback((MarketingNotification) it.next(), onextracallbackwithresult, zIsEmpty);
        }
        onRewardedAdCompleted onrewardedadcompleted = this.asBinder;
        if (onrewardedadcompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedadcompleted = null;
        }
        onrewardedadcompleted.onExtraCallbackWithResult(onNavigationEvent(list), true);
        RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        ICustomTabsServiceStub().onExtraCallbackWithResult.onExtraCallbackWithResult();
        onExtraCallbackWithResult(list);
    }

    private final void IAuthTabCallback(MarketingNotification marketingNotification, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        Object next;
        if (z) {
            for (Term term : marketingNotification.IAuthTabCallbackStub()) {
                this.access100.put(Long.valueOf(term.onExtraCallbackWithResult()), Boolean.valueOf(term.asBinder()));
            }
            return;
        }
        Iterator<T> it = marketingNotification.IAuthTabCallbackStub().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Term term2 = (Term) next;
            if (!Intrinsics.areEqual(this.access100.get(Long.valueOf(term2.onExtraCallbackWithResult())), Boolean.valueOf(term2.asBinder()))) {
                break;
            }
        }
        Term term3 = (Term) next;
        if (term3 != null) {
            this.access100.put(Long.valueOf(term3.onExtraCallbackWithResult()), Boolean.valueOf(term3.asBinder()));
            onExtraCallbackWithResult(marketingNotification.onNavigationEvent(), term3.asBinder(), term3.onTransact());
        } else {
            if (Intrinsics.areEqual(onextracallbackwithresult != null ? onextracallbackwithresult.onNavigationEvent() : null, marketingNotification.onExtraCallback())) {
                asInterface(onextracallbackwithresult);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<Object> onNavigationEvent(List<MarketingNotification> list) {
        int i;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new onRewardedAdCompleted.getInterfaceDescriptor("", getString(R.string.notification_marketing_setting_header)));
        boolean z = false;
        listCreateListBuilder.add(new onRewardedAdCompleted.IAuthTabCallbackStub(false));
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final MarketingNotification marketingNotification = (MarketingNotification) next;
            if (i2 > 0) {
                listCreateListBuilder.add(new onRewardedAdCompleted.IAuthTabCallbackStub(true));
            }
            Iterator<T> it2 = marketingNotification.asBinder().iterator();
            while (it2.hasNext()) {
                listCreateListBuilder.add(new onRewardedAdCompleted.onExtraCallbackWithResult(marketingNotification.onExtraCallback(), (Setting) it2.next(), marketingNotification.asInterface()));
            }
            for (final Term term : marketingNotification.IAuthTabCallbackStub()) {
                if (marketingNotification.asInterface()) {
                    String strIAuthTabCallbackDefault = marketingNotification.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault == null) {
                        strIAuthTabCallbackDefault = "";
                    }
                    listCreateListBuilder.add(new onRewardedAdCompleted.access100(strIAuthTabCallbackDefault));
                } else {
                    listCreateListBuilder.add(new onRewardedAdCompleted.asInterface(marketingNotification.onExtraCallback(), term, new Function0() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda19
                        public final Object invoke() {
                            return NotificationMarketingSettingActivity.onNavigationEvent(marketingNotification);
                        }
                    }, new Function0() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda20
                        public final Object invoke() {
                            return Boolean.valueOf(NotificationMarketingSettingActivity.onNavigationEvent(this.f$0, term));
                        }
                    }));
                }
            }
            i2++;
        }
        if (((Boolean) DERSet.onExtraCallback(1085761574, new Object[]{DERSet.onExtraCallback}, -1085761554, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())).booleanValue()) {
            listCreateListBuilder.add(new onRewardedAdCompleted.IAuthTabCallbackStub(z, i, null));
            String string = getString(R.string.notification_marketing_reset_push_token);
            Intrinsics.checkNotNullExpressionValue(string, "");
            listCreateListBuilder.add(new onRewardedAdCompleted.IAuthTabCallbackStubProxy(string));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final MarketingNotification marketingNotification) {
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1010665L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return NotificationMarketingSettingActivity.onWarmupCompleted(marketingNotification, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(MarketingNotification marketingNotification, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("service", marketingNotification.onExtraCallback());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, Term term) {
        StdConsentModuleCodes stdConsentModuleCodesIAuthTabCallback = term.IAuthTabCallback();
        return notificationMarketingSettingActivity.onWarmupCompleted(stdConsentModuleCodesIAuthTabCallback != null ? stdConsentModuleCodesIAuthTabCallback.IAuthTabCallback() : null);
    }

    public static final class asInterface implements Function1<Object, Boolean> {
        public static final asInterface onExtraCallbackWithResult = new asInterface();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof onRewardedAdCompleted.asInterface);
        }
    }

    private final void onExtraCallbackWithResult(List<MarketingNotification> list) {
        final ArrayList arrayList = new ArrayList();
        for (MarketingNotification marketingNotification : list) {
            List<Setting> listAsBinder = marketingNotification.asBinder();
            ArrayList<Setting> arrayList2 = new ArrayList();
            for (Object obj : listAsBinder) {
                if (((Setting) obj).onExtraCallbackWithResult()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (Setting setting : arrayList2) {
                arrayList3.add(marketingNotification.onExtraCallback() + "_" + setting.onNavigationEvent());
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1214795L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return NotificationMarketingSettingActivity.IAuthTabCallback(arrayList, (SetDetectableSize) obj2);
            }
        }, 14, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(List list, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("mkt_notice_status", list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(false);
        String string = getString(R.string.notification_marketing_denial_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(string);
        String string2 = getString(R.string.notification_marketing_denial_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2), R.string.cancel_terms_agree, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda9(this, onextracallbackwithresult), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, 8, (Object) null), im.toss.uikit.R.string.uikit_cancel, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda10(this, onextracallbackwithresult), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, DialogInterface dialogInterface, int i) {
        notificationMarketingSettingActivity.onWarmupCompleted(onextracallbackwithresult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult, DialogInterface dialogInterface, int i) {
        notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(onRewardedAdServerFailed onrewardedadserverfailed) {
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(this);
        String string = getString(R.string.app_notifictaion_marketing_setting_toss_bank_youth_agreement_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onNavigationEvent(string);
        String string2 = getString(R.string.app_notifictaion_marketing_setting_toss_bank_youth_agreement_dialog_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallback(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onExtraCallbackWithResult(string2), R.string.app_notifictaion_marketing_setting_toss_bank_youth_agreement_dialog_confirm, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda22(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null), R.string.app_notifictaion_marketing_setting_toss_bank_youth_agreement_dialog_cancel, new NotificationMarketingSettingActivity$.ExternalSyntheticLambda23(onrewardedadserverfailed, this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null));
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return NotificationMarketingSettingActivity.this.new getInterfaceDescriptor(access13800Var);
        }

        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [android.app.Activity, viva.republica.toss.main.more.push.NotificationMarketingSettingActivity] */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            ?? r1;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    NotificationMarketingSettingActivity notificationMarketingSettingActivity = NotificationMarketingSettingActivity.this;
                    Result.Companion companion = Result.Companion;
                    notificationMarketingSettingActivity.getInterfaceDescriptor = true;
                    LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                    this.L$0 = notificationMarketingSettingActivity;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                    Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "tossbank.scheme.notification.youthAgreement", "", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                    Object obj3 = objOnExtraCallback;
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    r1 = notificationMarketingSettingActivity;
                    obj = objOnExtraCallback;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    NotificationMarketingSettingActivity notificationMarketingSettingActivity2 = (NotificationMarketingSettingActivity) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    r1 = notificationMarketingSettingActivity2;
                }
                obj2 = Result.constructor-impl(access14000.onNavigationEvent(SessionTrackerb.IAuthTabCallback(r1.ICustomTabsServiceDefault(), (Activity) r1, (String) obj, false, (Function1) null, (Bundle) null, false, 60, (Object) null)));
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationMarketing", th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(NotificationMarketingSettingActivity notificationMarketingSettingActivity, DialogInterface dialogInterface, int i) {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(notificationMarketingSettingActivity), (CoroutineContext) null, (setRandomHost) null, notificationMarketingSettingActivity.new getInterfaceDescriptor(null), 3, (Object) null);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(onRewardedAdServerFailed onrewardedadserverfailed, NotificationMarketingSettingActivity notificationMarketingSettingActivity, DialogInterface dialogInterface, int i) {
        onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onrewardedadserverfailed.onWarmupCompleted();
        if (onextracallbackwithresultOnWarmupCompleted != null) {
            notificationMarketingSettingActivity.onExtraCallback(onextracallbackwithresultOnWarmupCompleted);
        }
        dialogInterface.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, boolean z, String str2) {
        String string;
        String strOnExtraCallback = ResetInputBGRLivenessChecker.onExtraCallback(CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback(), updateVisuals().asBinder(), this, (TimeZone) null, 4, (Object) null);
        if (z) {
            string = getString(R.string.notification_marketing_agree_toast);
        } else {
            string = getString(R.string.notification_marketing_denial_toast);
        }
        Intrinsics.checkNotNull(string);
        String strOnExtraCallback2 = WorkForegroundRunnableExternalSyntheticLambda0.onExtraCallback(string, new Object[]{str, strOnExtraCallback, str2});
        RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        new TdsToastV1.onNavigationEvent(recyclerView, strOnExtraCallback2).onWarmupCompleted(0).onNavigationEvent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void asInterface(onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        String string;
        if (Intrinsics.areEqual(onextracallbackwithresult.onNavigationEvent(), "TOSS_CORE")) {
            String strOnExtraCallback = ResetInputBGRLivenessChecker.onExtraCallback(CheckMask.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback(), updateVisuals().asBinder(), this, (TimeZone) null, 4, (Object) null);
            if (onextracallbackwithresult.onExtraCallback().onExtraCallbackWithResult()) {
                string = getString(R.string.app_toss_core_notification_on, strOnExtraCallback, onextracallbackwithresult.onExtraCallback().IAuthTabCallback());
            } else {
                string = getString(R.string.app_toss_core_notification_off, strOnExtraCallback, onextracallbackwithresult.onExtraCallback().IAuthTabCallback());
            }
            Intrinsics.checkNotNull(string);
            RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            new TdsToastV1.onNavigationEvent(recyclerView, string).onWarmupCompleted(0).onNavigationEvent();
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    @Override // viva.republica.toss.main.more.push.Hilt_NotificationMarketingSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.main.more.push.Hilt_NotificationMarketingSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.main.more.push.Hilt_NotificationMarketingSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
