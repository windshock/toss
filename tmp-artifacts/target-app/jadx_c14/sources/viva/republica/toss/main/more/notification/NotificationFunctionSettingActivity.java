package viva.republica.toss.main.more.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.tooltip.TdsFullTooltipV1View;
import im.toss.utils.RxUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.CERT_GetVersion;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.IPostMessageServiceStubProxy;
import o.InterstitialAdInterstitialLoadAdConfig;
import o.MultiPoint;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access502;
import o.access8100;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getByteBuffer;
import o.getFieldInfos;
import o.getParameterAnnotations;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.mergeVHost;
import o.onJsBridgeReady;
import o.onRewardedAdCompleted;
import o.onRewardedAdServerSucceeded;
import o.onRewardedInterstitialCompleted;
import o.onRewardedVideoCompleted;
import o.r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg;
import o.readIntokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setRandomHost;
import o.varyMatches;
import o.wipeOffVhost;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.terms.UpdateNotificationTermsRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NotificationFunctionSettingActivity extends Hilt_NotificationFunctionSettingActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallbackStub = 8;
    private onRewardedAdCompleted IAuthTabCallbackDefault;
    private String IAuthTabCallbackStubProxy;
    private Long IAuthTabCallback_Parcel;
    private onRewardedVideoCompleted access100;

    @Inject
    public InterstitialAdInterstitialLoadAdConfig api;
    private boolean asBinder;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackStub(this));

    @Inject
    public getFieldInfos blockPushNotificationUseCase;
    private String getInterfaceDescriptor;

    @Inject
    public r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg getSubscriptionTemplateTermsStateUseCase;
    private boolean onTransact;

    @Inject
    public zzag tossClock;

    @Inject
    public getParameterAnnotations unblockPushNotificationUseCase;

    static final class asBinder extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationFunctionSettingActivity.this.onExtraCallbackWithResult((access13800<? super Unit>) this);
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationFunctionSettingActivity.this.onNavigationEvent((String) null, (access13800<? super Unit>) this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationFunctionSettingActivity.this.onWarmupCompleted((String) null, (access13800<? super Unit>) this);
        }
    }

    public long getScreenId() {
        return 1007941L;
    }

    public static final class IAuthTabCallbackStub implements Function0<CERT_GetVersion> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_GetVersion invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetVersion.onNavigationEvent(layoutInflater);
        }
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

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CERT_GetVersion ICustomTabsServiceStub() {
        return (CERT_GetVersion) this.asInterface.getValue();
    }

    public final getParameterAnnotations updateVisuals() {
        getParameterAnnotations getparameterannotations = this.unblockPushNotificationUseCase;
        if (getparameterannotations != null) {
            return getparameterannotations;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final getFieldInfos onNavigationEvent() {
        getFieldInfos getfieldinfos = this.blockPushNotificationUseCase;
        if (getfieldinfos != null) {
            return getfieldinfos;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg setEngagementSignalsCallback() {
        r8lambday3P4J6z2ObsQuA2W0wf0wTSBzg r8lambday3p4j6z2obsqua2w0wf0wtsbzg = this.getSubscriptionTemplateTermsStateUseCase;
        if (r8lambday3p4j6z2obsqua2w0wf0wtsbzg != null) {
            return r8lambday3p4j6z2obsqua2w0wf0wtsbzg;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final InterstitialAdInterstitialLoadAdConfig IAuthTabCallback() {
        InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig = this.api;
        if (interstitialAdInterstitialLoadAdConfig != null) {
            return interstitialAdInterstitialLoadAdConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzag validateRelationship() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.main.more.notification.Hilt_NotificationFunctionSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        onExtraCallbackWithResult(intent);
        setContentView(ICustomTabsServiceStub().getRoot());
        ConstraintLayout root = ICustomTabsServiceStub().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, ICustomTabsServiceStub().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        this.access100 = new onRewardedVideoCompleted();
        ICustomTabsService_Parcel();
        ICustomTabsServiceDefault();
    }

    private final void ICustomTabsService_Parcel() {
        onRewardedVideoCompleted onrewardedvideocompleted = this.access100;
        RecyclerView.Adapter adapter = null;
        if (onrewardedvideocompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedvideocompleted = null;
        }
        onRewardedAdCompleted onrewardedadcompleted = new onRewardedAdCompleted(this, onrewardedvideocompleted);
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onExtraCallback(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda6());
        onextracallbackwithresult.onWarmupCompleted(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda7());
        onextracallbackwithresult.IAuthTabCallback(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda8(this));
        onrewardedadcompleted.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        this.IAuthTabCallbackDefault = onrewardedadcompleted;
        RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView.Adapter adapter2 = this.IAuthTabCallbackDefault;
        if (adapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            adapter = adapter2;
        }
        recyclerView.setAdapter(adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof onExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View onExtraCallback(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        TdsFullTooltipV1View tdsFullTooltipV1View = new TdsFullTooltipV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsFullTooltipV1View, -1, -2);
        tdsFullTooltipV1View.setTitleAlignment(TdsFullTooltipV1View.IAuthTabCallback.LEFT);
        tdsFullTooltipV1View.setArrowAlignment(TdsFullTooltipV1View.onExtraCallback.LEFT);
        tdsFullTooltipV1View.setArrowOffset(varyMatches.IAuthTabCallback(38, context));
        tdsFullTooltipV1View.setDirection(TdsFullTooltipV1View.onExtraCallbackWithResult.DOWN);
        return tdsFullTooltipV1View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(NotificationFunctionSettingActivity notificationFunctionSettingActivity, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        TdsFullTooltipV1View tdsFullTooltipV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        TdsFullTooltipV1View tdsFullTooltipV1View2 = tdsFullTooltipV1View instanceof TdsFullTooltipV1View ? tdsFullTooltipV1View : null;
        if (tdsFullTooltipV1View2 != null) {
            tdsFullTooltipV1View2.setTitle(notificationFunctionSettingActivity.getString(R.string.notification_function_tooltip));
            TdsFullTooltipV1View.IAuthTabCallback(tdsFullTooltipV1View2, (Function0) null, Integer.MAX_VALUE, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsServiceDefault() {
        onRewardedVideoCompleted onrewardedvideocompleted = this.access100;
        if (onrewardedvideocompleted == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onrewardedvideocompleted = null;
        }
        getByteBuffer getbytebufferOnExtraCallback = onrewardedvideocompleted.onWarmupCompleted().onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getbytebufferOnExtraCallback.onExtraCallbackWithResult(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda2(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda1(this)), new NotificationFunctionSettingActivity$.ExternalSyntheticLambda4(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda3()));
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(this, (access13800) null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(NotificationFunctionSettingActivity notificationFunctionSettingActivity, Pair pair) {
        onRewardedInterstitialCompleted onrewardedinterstitialcompleted = (onRewardedInterstitialCompleted) pair.onExtraCallbackWithResult();
        View view = (View) pair.IAuthTabCallback();
        boolean zOnNavigationEvent = onrewardedinterstitialcompleted.onWarmupCompleted().onNavigationEvent();
        long jIAuthTabCallbackStub = onrewardedinterstitialcompleted.onWarmupCompleted().IAuthTabCallbackStub();
        Long l = notificationFunctionSettingActivity.IAuthTabCallback_Parcel;
        int i = 0;
        boolean z = l != null && jIAuthTabCallbackStub == l.longValue();
        if (zOnNavigationEvent && z) {
            notificationFunctionSettingActivity.onTransact = false;
            onRewardedAdCompleted onrewardedadcompleted = notificationFunctionSettingActivity.IAuthTabCallbackDefault;
            RecyclerView.Adapter adapter = null;
            if (onrewardedadcompleted == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                onrewardedadcompleted = null;
            }
            List mutableList = CollectionsKt.toMutableList(onrewardedadcompleted.onExtraCallbackWithResult());
            Iterator it = mutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (next instanceof onExtraCallback) {
                    long jOnWarmupCompleted = ((onExtraCallback) next).onWarmupCompleted();
                    Long l2 = notificationFunctionSettingActivity.IAuthTabCallback_Parcel;
                    if (l2 != null && jOnWarmupCompleted == l2.longValue()) {
                        break;
                    }
                }
                i++;
            }
            ExoPlayerImplExternalSyntheticLambda31 exoPlayerImplExternalSyntheticLambda31 = notificationFunctionSettingActivity.IAuthTabCallbackDefault;
            if (exoPlayerImplExternalSyntheticLambda31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exoPlayerImplExternalSyntheticLambda31 = null;
            }
            mutableList.remove(i);
            exoPlayerImplExternalSyntheticLambda31.onNavigationEvent(mutableList);
            RecyclerView.Adapter adapter2 = notificationFunctionSettingActivity.IAuthTabCallbackDefault;
            if (adapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                adapter = adapter2;
            }
            adapter.notifyItemRemoved(i);
        }
        notificationFunctionSettingActivity.onExtraCallback(onrewardedinterstitialcompleted.onWarmupCompleted().IAuthTabCallbackStub(), onrewardedinterstitialcompleted.onWarmupCompleted().onNavigationEvent(), onrewardedinterstitialcompleted.onWarmupCompleted().asInterface(), view, (deserializeFloat<Boolean>) new NotificationFunctionSettingActivity$.ExternalSyntheticLambda0(notificationFunctionSettingActivity, onrewardedinterstitialcompleted, z, zOnNavigationEvent));
        return Unit.INSTANCE;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $isAgreed;
        final /* synthetic */ boolean $isTargetTermsUpdated;
        int label;
        final /* synthetic */ NotificationFunctionSettingActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(boolean z, boolean z2, NotificationFunctionSettingActivity notificationFunctionSettingActivity, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$isTargetTermsUpdated = z;
            this.$isAgreed = z2;
            this.this$0 = notificationFunctionSettingActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onTransact(this.$isTargetTermsUpdated, this.$isAgreed, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        
            if (r5.onNavigationEvent(r1, (o.access13800<? super kotlin.Unit>) r4) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        
            if (r5.onWarmupCompleted(r1, (o.access13800<? super kotlin.Unit>) r4) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L4e
            L1b:
                kotlin.ResultKt.onNavigationEvent(r5)
                boolean r5 = r4.$isTargetTermsUpdated
                if (r5 == 0) goto L4e
                boolean r5 = r4.$isAgreed
                if (r5 == 0) goto L3a
                viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity r5 = r4.this$0
                java.lang.String r1 = viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onWarmupCompleted(r5)
                if (r1 != 0) goto L31
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L31:
                r4.label = r3
                java.lang.Object r5 = r5.onNavigationEvent(r1, r4)
                if (r5 != r0) goto L4e
                goto L4d
            L3a:
                viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity r5 = r4.this$0
                java.lang.String r1 = viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onWarmupCompleted(r5)
                if (r1 != 0) goto L45
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L45:
                r4.label = r2
                java.lang.Object r5 = r5.onWarmupCompleted(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(NotificationFunctionSettingActivity notificationFunctionSettingActivity, onRewardedInterstitialCompleted onrewardedinterstitialcompleted, boolean z, boolean z2, Boolean bool) {
        Object next;
        RecyclerView.Adapter adapter = null;
        if (bool.booleanValue()) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(notificationFunctionSettingActivity), (CoroutineContext) null, (setRandomHost) null, new onTransact(z, z2, notificationFunctionSettingActivity, null), 3, (Object) null);
            notificationFunctionSettingActivity.onNavigationEvent(onrewardedinterstitialcompleted);
            return;
        }
        onRewardedAdCompleted onrewardedadcompleted = notificationFunctionSettingActivity.IAuthTabCallbackDefault;
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
            Object next2 = it.next();
            if (next2 instanceof mergeVHost) {
                Iterator it2 = ((mergeVHost) next2).onExtraCallbackWithResult().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((wipeOffVhost) next).IAuthTabCallback() == onrewardedinterstitialcompleted.onWarmupCompleted().IAuthTabCallbackStub()) {
                            break;
                        }
                    }
                }
                if (next != null) {
                    break;
                }
            }
            i++;
        }
        if (i >= 0) {
            RecyclerView.Adapter adapter2 = notificationFunctionSettingActivity.IAuthTabCallbackDefault;
            if (adapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                adapter = adapter2;
            }
            adapter.notifyItemChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NotificationFunctionSettingActivity", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void IEngagementSignalsCallback() {
        TdsResultV0View tdsResultV0View = ICustomTabsServiceStub().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsResultV0View, "");
        tdsResultV0View.setVisibility(0);
        RecyclerView recyclerView = ICustomTabsServiceStub().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        ICustomTabsServiceStub().onWarmupCompleted.setLottieImageFromAsset("lottie/spot-empty.json");
        ICustomTabsServiceStub().onWarmupCompleted.setTitle(getString(R.string.app_notification_no_subscription_title));
        ICustomTabsServiceStub().onWarmupCompleted.setSubtitle(getString(R.string.app_notification_no_subscription_subtitle));
    }

    private final void onExtraCallback(long j, boolean z, Long l, View view, deserializeFloat<Boolean> deserializefloat) {
        writeRaw writerawIAuthTabCallback = IAuthTabCallback().onExtraCallbackWithResult(new UpdateNotificationTermsRequest(j, l, z)).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda10(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda9(this))).onWarmupCompleted(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda11(this)).onNavigationEvent(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda13(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda12(deserializefloat, this, z, view)), new NotificationFunctionSettingActivity$.ExternalSyntheticLambda15(new NotificationFunctionSettingActivity$.ExternalSyntheticLambda14(this, deserializefloat)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(NotificationFunctionSettingActivity notificationFunctionSettingActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        BaseActivity.IAuthTabCallback(notificationFunctionSettingActivity, (String) null, false, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(NotificationFunctionSettingActivity notificationFunctionSettingActivity) {
        notificationFunctionSettingActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access000(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(deserializeFloat deserializefloat, NotificationFunctionSettingActivity notificationFunctionSettingActivity, boolean z, View view, BaseApiResponse baseApiResponse) {
        if (deserializefloat != null) {
            deserializefloat.accept(Boolean.valueOf(((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()));
        }
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
            onJsBridgeReady.onNavigationEvent(notificationFunctionSettingActivity, apiServerErrorAsInterface != null ? apiServerErrorAsInterface.IAuthTabCallbackDefault() : null, 0, 2, (Object) null);
        }
        onRewardedAdServerSucceeded.onWarmupCompleted(notificationFunctionSettingActivity, MultiPoint.TOSS_CORE, notificationFunctionSettingActivity.validateRelationship(), z, view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(NotificationFunctionSettingActivity notificationFunctionSettingActivity, deserializeFloat deserializefloat, Throwable th) {
        notificationFunctionSettingActivity.bo_();
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NotificationFunctionSettingActivity", th.getMessage(), th, (Map) null, 8, (Object) null);
        if (deserializefloat != null) {
            deserializefloat.accept(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r6
            viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$onWarmupCompleted r0 = (viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$onWarmupCompleted r0 = new viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$onWarmupCompleted
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.onNavigationEvent(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.onNavigationEvent()
            goto L50
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.onNavigationEvent(r6)
            o.getFieldInfos r6 = r4.onNavigationEvent()
            java.lang.Object r2 = o.access15400.onNavigationEvent(r5)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r5 = r6.onNavigationEvent(r5, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            r5 = -1
            r4.setResult(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onWarmupCompleted(java.lang.String, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.getInterfaceDescriptor
            if (r0 == 0) goto L13
            r0 = r6
            viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$getInterfaceDescriptor r0 = (viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.getInterfaceDescriptor) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$getInterfaceDescriptor r0 = new viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity$getInterfaceDescriptor
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.onNavigationEvent(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.onNavigationEvent()
            goto L4c
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.onNavigationEvent(r6)
            o.getParameterAnnotations r6 = r4.updateVisuals()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.onExtraCallback(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r0 = "target_function_content_id"
            r6.putExtra(r0, r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r0 = -1
            r4.setResult(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onNavigationEvent(java.lang.String, o.access13800):java.lang.Object");
    }

    private final void onNavigationEvent(onRewardedInterstitialCompleted onrewardedinterstitialcompleted) {
        ConvertByteArrayToFloatArray.onExtraCallback(1010667L, false, (String) null, (Map) null, new NotificationFunctionSettingActivity$.ExternalSyntheticLambda5(onrewardedinterstitialcompleted), 14, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(onRewardedInterstitialCompleted onrewardedinterstitialcompleted, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service", onrewardedinterstitialcompleted.onNavigationEvent());
        setDetectableSize.onExtraCallback("on_off", onrewardedinterstitialcompleted.onWarmupCompleted().onNavigationEvent() ? "on" : "off");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(o.access13800<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    public static final class asInterface extends LinearSmoothScroller {
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (int) ((i3 + ((i4 - i3) * 0.5d)) - (i + ((i2 - i) * 0.5d)));
        }

        asInterface(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNull(displayMetrics);
            return 50.0f / displayMetrics.densityDpi;
        }
    }

    private final void onNavigationEvent(int i) {
        asInterface asinterface = new asInterface(getContext());
        asinterface.setTargetPosition(i);
        LinearLayoutManager layoutManager = ICustomTabsServiceStub().onNavigationEvent.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.startSmoothScroll(asinterface);
        }
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("setting_type", "functional")});
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) NotificationFunctionSettingActivity.class);
            intent.putExtra("notification_function_setting_screen_referrer", str);
            intent.putExtra("target_function_content_id", str2);
            intent.putExtra("target_function_terms_id", l);
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0f9c  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 4006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.notification.NotificationFunctionSettingActivity.onExtraCallbackWithResult(android.content.Intent):void");
    }

    @Override // viva.republica.toss.main.more.notification.Hilt_NotificationFunctionSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.main.more.notification.Hilt_NotificationFunctionSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.main.more.notification.Hilt_NotificationFunctionSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.main.more.notification.Hilt_NotificationFunctionSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
