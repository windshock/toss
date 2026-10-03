package viva.republica.toss.send;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DERConstructedSequence;
import o.DERConstructedSet;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.KeyBoardVisiblePoint;
import o.ParamImpl;
import o.ParamUtils;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.RecomposerawaitIdle2;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_TSA_VerifyTimeStampToken;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getJSMessageQueueThread;
import o.getLongName;
import o.getNavigationBar;
import o.hasCurrentActivity;
import o.issueCertV3;
import o.maybeUpdateAnimatable;
import o.onDisclaimerClick;
import o.onPageExit;
import o.setAuthenticatorokhttp;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.TransferBalance;
import viva.republica.toss.network.model.transfer.TransferBalanceStatus;
import viva.republica.toss.send.AbsCompactSendActivity$;
import viva.republica.toss.send.common.WithdrawAccountListBottomSheet;
import viva.republica.toss.send.v3.TransferRegisterAccountActivity;
import viva.republica.toss.send.v4.viewmodel.MyAccountInfoViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class AbsCompactSendActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onTransact = 8;
    private KeyBoardVisiblePoint IAuthTabCallbackStub;
    private long asBinder;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public getJSMessageQueueThread transferKycHelper;
    private final Lazy asInterface = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(MyAccountInfoViewModel.class), new IAuthTabCallbackStub(this), new asBinder(this), new onTransact(null, this));
    private String access000 = "";
    private String IAuthTabCallbackStubProxy = "";
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(this));
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback_Parcel = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.send.AbsCompactSendActivity$$ExternalSyntheticLambda5
        public final Object invoke(Object obj) {
            return AbsCompactSendActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static final class onNavigationEvent extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbsCompactSendActivity.this.onWarmupCompleted((access13800<? super Boolean>) this);
        }
    }

    public void IAuthTabCallback(@Nullable KeyBoardVisiblePoint keyBoardVisiblePoint) {
    }

    public abstract void ICustomTabsServiceDefault();

    public void ICustomTabsServiceStub() {
    }

    protected KeyBoardVisiblePoint aA_() {
        return null;
    }

    protected boolean validateRelationship() {
        return false;
    }

    public static final class asInterface implements Function0<UST_TSA_VerifyTimeStampToken> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public asInterface(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final UST_TSA_VerifyTimeStampToken invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return UST_TSA_VerifyTimeStampToken.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public final getJSMessageQueueThread IEngagementSignalsCallbackStub() {
        getJSMessageQueueThread getjsmessagequeuethread = this.transferKycHelper;
        if (getjsmessagequeuethread != null) {
            return getjsmessagequeuethread;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final SessionTrackerb onVerticalScrollEvent() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final MyAccountInfoViewModel updateVisuals() {
        return (MyAccountInfoViewModel) this.asInterface.getValue();
    }

    public final String IEngagementSignalsCallback() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackStubProxy = str;
    }

    protected final UST_TSA_VerifyTimeStampToken ICustomTabsServiceStubProxy() {
        Object value = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (UST_TSA_VerifyTimeStampToken) value;
    }

    protected final TdsListRowV1View IEngagementSignalsCallbackDefault() {
        TdsListRowV1View tdsListRowV1View = ICustomTabsServiceStubProxy().access000;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    public final TdsButtonV1View onSessionEnded() {
        TdsButtonV1View tdsButtonV1View = ICustomTabsServiceStubProxy().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    protected final TdsImageView ICustomTabsService_Parcel() {
        TdsImageView tdsImageView = ICustomTabsServiceStubProxy().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        return tdsImageView;
    }

    protected final Typography2 writeTypedList() {
        Typography2 typography2 = ICustomTabsServiceStubProxy().asBinder;
        Intrinsics.checkNotNullExpressionValue(typography2, "");
        return typography2;
    }

    public static final class asBinder implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public asBinder(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    public final boolean IPostMessageService() {
        return Intrinsics.areEqual(CollectionsKt.firstOrNull(setEngagementSignalsCallback()), this.IAuthTabCallbackStub);
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallbackWithResult.getViewModelStore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(AbsCompactSendActivity absCompactSendActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        absCompactSendActivity.IPostMessageService_Parcel();
        return Unit.INSTANCE;
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onWarmupCompleted.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStubProxy().getRoot());
        IEngagementSignalsCallbackDefault().setOnClickListener(new AbsCompactSendActivity$.ExternalSyntheticLambda2(this));
        Object[] objArr = {onSessionEnded(), ParamUtils.NORMAL, new AbsCompactSendActivity$.ExternalSyntheticLambda3(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        onExtraCallbackWithResult(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(15));
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        IEngagementSignalsCallbackDefault().setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A_ANIMATE_TEXT);
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            baseTextViewICustomTabsCallbackStubProxy.setVisibility(8);
        }
        updateVisuals().onTransact().observe(this, new BaseActivity.ICustomTabsServiceStubProxy(new onExtraCallback()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(AbsCompactSendActivity absCompactSendActivity, View view) {
        absCompactSendActivity.IPostMessageServiceStubProxy();
        absCompactSendActivity.ICustomTabsServiceStub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(AbsCompactSendActivity absCompactSendActivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        KeyBoardVisiblePoint keyBoardVisiblePointOnGreatestScrollPercentageIncreased = absCompactSendActivity.onGreatestScrollPercentageIncreased();
        AbsCompactSendActivity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AbsCompactSendActivity$.ExternalSyntheticLambda1(absCompactSendActivity);
        boolean z = keyBoardVisiblePointOnGreatestScrollPercentageIncreased instanceof onDisclaimerClick;
        if (z && KeyBoardVisiblePoint.IAuthTabCallback(keyBoardVisiblePointOnGreatestScrollPercentageIncreased, 0L, 1, (Object) null) < absCompactSendActivity.access200() && !absCompactSendActivity.IPostMessageServiceStub() && absCompactSendActivity.validateRelationship()) {
            absCompactSendActivity.IEngagementSignalsCallback_Parcel();
        } else if (z) {
            externalSyntheticLambda1.invoke();
        } else {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(absCompactSendActivity), (CoroutineContext) null, (setRandomHost) null, absCompactSendActivity.new onWarmupCompleted(externalSyntheticLambda1, null), 3, (Object) null);
        }
        absCompactSendActivity.IAuthTabCallback(keyBoardVisiblePointOnGreatestScrollPercentageIncreased);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(AbsCompactSendActivity absCompactSendActivity) {
        if (absCompactSendActivity.onNavigationEvent()) {
            absCompactSendActivity.ICustomTabsServiceDefault();
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $tryToSend;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$tryToSend = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AbsCompactSendActivity.this.new onWarmupCompleted(this.$tryToSend, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                AbsCompactSendActivity absCompactSendActivity = AbsCompactSendActivity.this;
                this.label = 1;
                obj = absCompactSendActivity.onWarmupCompleted((access13800<? super Boolean>) this);
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
                this.$tryToSend.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private final void IPostMessageService_Parcel() {
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.IAuthTabCallbackStub;
        if (keyBoardVisiblePoint == null) {
            return;
        }
        this.IAuthTabCallbackStub = DERConstructedSet.onWarmupCompleted(keyBoardVisiblePoint.onExtraCallbackWithResult(), keyBoardVisiblePoint.onWarmupCompleted());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onNavigationEvent() {
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = this.IAuthTabCallbackStub;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null && (tabBarInfoQueryPointOnTabBarInfoQueryListener instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener)) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = tabBarInfoQueryPointOnTabBarInfoQueryListener;
            if (tabBarInfoQueryPointOnTabBarInfoQueryListener2.receiveFile()) {
                SessionTrackerb.onNavigationEvent(onVerticalScrollEvent(), this, tabBarInfoQueryPointOnTabBarInfoQueryListener2.prefetch(), this.IAuthTabCallback_Parcel, (Bundle) null, 8, (Object) null);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(o.access13800<? super java.lang.Boolean> r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            r10 = this;
            boolean r0 = r11 instanceof viva.republica.toss.send.AbsCompactSendActivity.onNavigationEvent
            if (r0 == 0) goto L13
            r0 = r11
            viva.republica.toss.send.AbsCompactSendActivity$onNavigationEvent r0 = (viva.republica.toss.send.AbsCompactSendActivity.onNavigationEvent) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.send.AbsCompactSendActivity$onNavigationEvent r0 = new viva.republica.toss.send.AbsCompactSendActivity$onNavigationEvent
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.onNavigationEvent(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.onNavigationEvent()
            goto L5c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            kotlin.ResultKt.onNavigationEvent(r11)
            o.getJSMessageQueueThread r11 = r10.IEngagementSignalsCallbackStub()
            o.getJSMessageQueueThread$onExtraCallback r2 = o.getJSMessageQueueThread.onExtraCallback.TRANSFER
            int r4 = viva.republica.toss.R.string.app_compact_send_kyc_title
            java.lang.String r5 = o.PlayerErrorCode.onPostMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = r10.getString(r4, r5)
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.label = r3
            java.lang.Object r11 = r11.onNavigationEvent(r10, r2, r4, r0)
            if (r11 != r1) goto L5c
            return r1
        L5c:
            boolean r0 = kotlin.Result.onNavigationEvent(r11)
            r1 = 0
            if (r0 == 0) goto L7e
            o.getJSMessageQueueThread$onNavigationEvent r11 = (o.getJSMessageQueueThread.onNavigationEvent) r11
            boolean r0 = r11 instanceof o.getJSMessageQueueThread.onNavigationEvent.IAuthTabCallback
            if (r0 != 0) goto L79
            boolean r0 = r11 instanceof o.getJSMessageQueueThread.onNavigationEvent.onExtraCallback
            if (r0 != 0) goto L78
            boolean r11 = r11 instanceof o.getJSMessageQueueThread.onNavigationEvent.onWarmupCompleted
            if (r11 == 0) goto L72
            goto L78
        L72:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L78:
            r3 = r1
        L79:
            java.lang.Boolean r11 = o.access14000.onNavigationEvent(r3)
            return r11
        L7e:
            java.lang.Throwable r11 = kotlin.Result.exceptionOrNull-impl(r11)
            if (r11 == 0) goto La2
            o.ConvertFloatArrayToByteArray r2 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r3 = "AbsCompactSendActivity"
            java.lang.String r4 = "error on checkKyc"
            r6 = 0
            r7 = 8
            r8 = 0
            r5 = r11
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r2, r3, r4, r5, r6, r7, r8)
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 30
            r9 = 0
            r2 = r11
            r3 = r10
            o.getParamImp.onWarmupCompleted(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = o.access14000.onNavigationEvent(r1)
            return r11
        La2:
            java.lang.Boolean r11 = o.access14000.onNavigationEvent(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.AbsCompactSendActivity.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30002 && i2 == -1) {
            IEngagementSignalsCallbackStubProxy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new AbsCompactSendActivity$.ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(AbsCompactSendActivity absCompactSendActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(absCompactSendActivity.getString(R.string.app_send___a49ec9c10a, getLongName.onNavigationEvent(absCompactSendActivity.access200(), (ParamImpl) null, 1, (Object) null)));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new AbsCompactSendActivity$.ExternalSyntheticLambda6(absCompactSendActivity))};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(AbsCompactSendActivity absCompactSendActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        getNavigationBar.IAuthTabCallback(TransferRegisterAccountActivity.onWarmupCompleted.onNavigationEvent(TransferRegisterAccountActivity.Companion, absCompactSendActivity, absCompactSendActivity.getScreenName(), absCompactSendActivity.getString(R.string.app_send___1d41cb8e19), (String) null, (String) null, (String) null, (UTF8Decoder) null, (TransferRegisterAccountActivity.onExtraCallbackWithResult) null, false, false, false, (String) null, (String) null, (String) null, 16376, (Object) null), absCompactSendActivity, 30002);
        return Unit.INSTANCE;
    }

    private final boolean IPostMessageServiceDefault() {
        onDisclaimerClick ondisclaimerclickOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased();
        onDisclaimerClick ondisclaimerclick = ondisclaimerclickOnGreatestScrollPercentageIncreased instanceof onDisclaimerClick ? ondisclaimerclickOnGreatestScrollPercentageIncreased : null;
        if (ondisclaimerclick == null) {
            return true;
        }
        long jAccess200 = access200();
        return jAccess200 > 0 && jAccess200 <= KeyBoardVisiblePoint.IAuthTabCallback(ondisclaimerclick, 0L, 1, (Object) null);
    }

    private final boolean IPostMessageServiceStub() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) DERConstructedSet.onWarmupCompleted(1404184340, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1404184329, new Object[0])).booleanValue();
    }

    private final void ITrustedWebActivityCallbackStub() {
        onSessionEnded().setEnabled(IPostMessageServiceDefault() || validateRelationship());
    }

    public final void IEngagementSignalsCallbackStubProxy() {
        KeyBoardVisiblePoint keyBoardVisiblePoint;
        List<KeyBoardVisiblePoint> engagementSignalsCallback = setEngagementSignalsCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(engagementSignalsCallback, 10));
        Iterator<T> it = engagementSignalsCallback.iterator();
        while (it.hasNext()) {
            arrayList.add(issueCertV3.IAuthTabCallbackDefault((KeyBoardVisiblePoint) it.next()));
        }
        MyAccountInfo myAccountInfoOnNavigationEvent = hasCurrentActivity.IAuthTabCallback.onNavigationEvent(arrayList);
        if (myAccountInfoOnNavigationEvent == null) {
            myAccountInfoOnNavigationEvent = (MyAccountInfo) CollectionsKt.firstOrNull(arrayList);
        }
        if (myAccountInfoOnNavigationEvent != null) {
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            keyBoardVisiblePoint = (KeyBoardVisiblePoint) MyAccountInfo.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1346435167, iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{myAccountInfoOnNavigationEvent}, iOnNavigationEvent, -1346435165);
        } else {
            keyBoardVisiblePoint = null;
        }
        onNavigationEvent(keyBoardVisiblePoint);
    }

    private final List<KeyBoardVisiblePoint> setEngagementSignalsCallback() {
        List<KeyBoardVisiblePoint> listOnExtraCallback = DERConstructedSet.onExtraCallback();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnExtraCallback) {
            String strOnExtraCallbackWithResult = ((KeyBoardVisiblePoint) obj).onExtraCallbackWithResult();
            KeyBoardVisiblePoint keyBoardVisiblePointAA_ = aA_();
            if (!Intrinsics.areEqual(strOnExtraCallbackWithResult, keyBoardVisiblePointAA_ != null ? keyBoardVisiblePointAA_.onExtraCallbackWithResult() : null)) {
                arrayList.add(obj);
            }
        }
        return DERConstructedSequence.onNavigationEvent.IAuthTabCallback(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStubProxy() {
        SessionTrackerb sessionTrackerbOnVerticalScrollEvent = onVerticalScrollEvent();
        MyAccountInfoViewModel myAccountInfoViewModelUpdateVisuals = updateVisuals();
        List<KeyBoardVisiblePoint> engagementSignalsCallback = setEngagementSignalsCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(engagementSignalsCallback, 10));
        Iterator<T> it = engagementSignalsCallback.iterator();
        while (it.hasNext()) {
            arrayList.add(issueCertV3.IAuthTabCallbackDefault((KeyBoardVisiblePoint) it.next()));
        }
        List listOnWarmupCompleted = myAccountInfoViewModelUpdateVisuals.onWarmupCompleted(arrayList);
        KeyBoardVisiblePoint keyBoardVisiblePointOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased();
        new WithdrawAccountListBottomSheet(this, sessionTrackerbOnVerticalScrollEvent, listOnWarmupCompleted, keyBoardVisiblePointOnGreatestScrollPercentageIncreased != null ? issueCertV3.IAuthTabCallbackDefault(keyBoardVisiblePointOnGreatestScrollPercentageIncreased) : null, new IAuthTabCallback(), null, null, false, WithdrawAccountListBottomSheet.onWarmupCompleted.COMPACT_TRANSFER, this.IAuthTabCallbackStubProxy, null, null, new AbsCompactSendActivity$.ExternalSyntheticLambda4(this), 3296, null).show();
    }

    public static final class IAuthTabCallback implements WithdrawAccountListBottomSheet.onExtraCallbackWithResult {
        IAuthTabCallback() {
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public /* bridge */ void IAuthTabCallback() {
            super.IAuthTabCallback();
        }

        @Override // viva.republica.toss.send.common.WithdrawAccountListBottomSheet.onExtraCallbackWithResult
        public void IAuthTabCallback(MyAccountInfo myAccountInfo) {
            Intrinsics.checkNotNullParameter(myAccountInfo, "");
            AbsCompactSendActivity.this.onNavigationEvent(myAccountInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(AbsCompactSendActivity absCompactSendActivity, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        absCompactSendActivity.updateVisuals().onNavigationEvent(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onNavigationEvent(@NotNull MyAccountInfo myAccountInfo) {
        RecomposerawaitIdle2.onNavigationEvent onNavigationEvent2;
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) MyAccountInfo.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1346435167, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{myAccountInfo}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1346435165);
        this.IAuthTabCallbackStub = keyBoardVisiblePoint;
        if (keyBoardVisiblePoint != null && (onNavigationEvent2 = issueCertV3.onNavigationEvent(keyBoardVisiblePoint, this)) != null) {
            IEngagementSignalsCallbackDefault().setLeftImage(onNavigationEvent2);
        }
        IEngagementSignalsCallbackDefault().setCenterText1(getString(R.string.app_send___aeeb9819ee, myAccountInfo.onTransact()));
        TransferBalance transferBalanceAsInterface = myAccountInfo.asInterface();
        if (transferBalanceAsInterface == null) {
            BaseTextView baseTextViewICustomTabsCallbackStubProxy = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy != null) {
                baseTextViewICustomTabsCallbackStubProxy.setVisibility(0);
            }
            AnimateText animateTextOnPostMessage = IEngagementSignalsCallbackDefault().onPostMessage();
            if (animateTextOnPostMessage != null) {
                animateTextOnPostMessage.setVisibility(8);
            }
            IEngagementSignalsCallbackDefault().setCenterText2(MyAccountInfo.onNavigationEvent(myAccountInfo, false, 0L, null, 7, null));
        } else {
            String strOnNavigationEvent = MyAccountInfo.onNavigationEvent(myAccountInfo, false, ((Long) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1707573646, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{transferBalanceAsInterface}, -1707573645, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback())).longValue(), Long.valueOf(transferBalanceAsInterface.IAuthTabCallback()), 1, null);
            if (transferBalanceAsInterface.onExtraCallbackWithResult() == TransferBalanceStatus.INQUIRY && transferBalanceAsInterface.onTransact()) {
                BaseTextView baseTextViewICustomTabsCallbackStubProxy2 = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
                if (baseTextViewICustomTabsCallbackStubProxy2 != null) {
                    baseTextViewICustomTabsCallbackStubProxy2.setVisibility(8);
                }
                AnimateText animateTextOnPostMessage2 = IEngagementSignalsCallbackDefault().onPostMessage();
                if (animateTextOnPostMessage2 != null) {
                    animateTextOnPostMessage2.setVisibility(0);
                }
                TdsListRowV1View.setAnimateText2Infinite$default(IEngagementSignalsCallbackDefault(), strOnNavigationEvent, setAuthenticatorokhttp.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult, 0, false, (String) null, (AnimateText.onNavigationEvent) null, (Function0) null, (Function0) null, (Function0) null, 508, (Object) null);
            } else {
                BaseTextView baseTextViewICustomTabsCallbackStubProxy3 = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
                if (baseTextViewICustomTabsCallbackStubProxy3 != null) {
                    baseTextViewICustomTabsCallbackStubProxy3.setVisibility(0);
                }
                AnimateText animateTextOnPostMessage3 = IEngagementSignalsCallbackDefault().onPostMessage();
                if (animateTextOnPostMessage3 != null) {
                    animateTextOnPostMessage3.setVisibility(8);
                }
                IEngagementSignalsCallbackDefault().setCenterText2(strOnNavigationEvent);
            }
        }
        boolean z = setEngagementSignalsCallback().size() > 1;
        IEngagementSignalsCallbackDefault().setRightArrow(z);
        IEngagementSignalsCallbackDefault().setClickable(z);
        ITrustedWebActivityCallbackStub();
        if ((transferBalanceAsInterface != null ? transferBalanceAsInterface.onExtraCallbackWithResult() : null) == null || transferBalanceAsInterface.onExtraCallbackWithResult() == TransferBalanceStatus.INVALID || (transferBalanceAsInterface.onExtraCallbackWithResult() == TransferBalanceStatus.INQUIRY && transferBalanceAsInterface.onTransact())) {
            updateVisuals().onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@Nullable KeyBoardVisiblePoint keyBoardVisiblePoint) {
        TransferBalanceStatus transferBalanceStatus;
        this.IAuthTabCallbackStub = keyBoardVisiblePoint;
        if (keyBoardVisiblePoint != null) {
            TransferBalance transferBalanceIAuthTabCallback = updateVisuals().IAuthTabCallback(keyBoardVisiblePoint.asInterface(), keyBoardVisiblePoint.bP_());
            if (transferBalanceIAuthTabCallback == null) {
                updateVisuals().onExtraCallbackWithResult(keyBoardVisiblePoint.asInterface(), keyBoardVisiblePoint.bP_());
            } else {
                RecomposerawaitIdle2.onNavigationEvent onNavigationEvent2 = issueCertV3.onNavigationEvent(keyBoardVisiblePoint, this);
                if (onNavigationEvent2 != null) {
                    IEngagementSignalsCallbackDefault().setLeftImage(onNavigationEvent2);
                }
                IEngagementSignalsCallbackDefault().setCenterText1(getString(R.string.app_send___aeeb9819ee, issueCertV3.onNavigationEvent(keyBoardVisiblePoint)));
                int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                boolean z = ((Long) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1707573646, iIAuthTabCallback2, new Object[]{transferBalanceIAuthTabCallback}, -1707573645, iIAuthTabCallback)).longValue() >= 0;
                int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                String str = (String) issueCertV3.onExtraCallback(-274250284, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 274250288, new Object[]{keyBoardVisiblePoint, Boolean.valueOf(z), Long.valueOf(((Long) TransferBalance.onWarmupCompleted(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1707573646, iIAuthTabCallback4, new Object[]{transferBalanceIAuthTabCallback}, -1707573645, iIAuthTabCallback3)).longValue()), Long.valueOf(transferBalanceIAuthTabCallback.IAuthTabCallback())}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
                TransferBalanceStatus transferBalanceStatusOnExtraCallbackWithResult = transferBalanceIAuthTabCallback.onExtraCallbackWithResult();
                TransferBalanceStatus transferBalanceStatus2 = TransferBalanceStatus.INQUIRY;
                if (transferBalanceStatusOnExtraCallbackWithResult == transferBalanceStatus2 && transferBalanceIAuthTabCallback.onTransact()) {
                    BaseTextView baseTextViewICustomTabsCallbackStubProxy = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
                    if (baseTextViewICustomTabsCallbackStubProxy != null) {
                        baseTextViewICustomTabsCallbackStubProxy.setVisibility(8);
                    }
                    AnimateText animateTextOnPostMessage = IEngagementSignalsCallbackDefault().onPostMessage();
                    if (animateTextOnPostMessage != null) {
                        animateTextOnPostMessage.setVisibility(0);
                    }
                    transferBalanceStatus = transferBalanceStatus2;
                    TdsListRowV1View.setAnimateText2Infinite$default(IEngagementSignalsCallbackDefault(), str, setAuthenticatorokhttp.onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult, 0, false, (String) null, (AnimateText.onNavigationEvent) null, (Function0) null, (Function0) null, (Function0) null, 508, (Object) null);
                } else {
                    transferBalanceStatus = transferBalanceStatus2;
                    BaseTextView baseTextViewICustomTabsCallbackStubProxy2 = IEngagementSignalsCallbackDefault().ICustomTabsCallbackStubProxy();
                    if (baseTextViewICustomTabsCallbackStubProxy2 != null) {
                        baseTextViewICustomTabsCallbackStubProxy2.setVisibility(0);
                    }
                    AnimateText animateTextOnPostMessage2 = IEngagementSignalsCallbackDefault().onPostMessage();
                    if (animateTextOnPostMessage2 != null) {
                        animateTextOnPostMessage2.setVisibility(8);
                    }
                    IEngagementSignalsCallbackDefault().setCenterText2(str);
                }
                boolean z2 = setEngagementSignalsCallback().size() > 1;
                IEngagementSignalsCallbackDefault().setRightArrow(z2);
                IEngagementSignalsCallbackDefault().setClickable(z2);
                if (transferBalanceIAuthTabCallback.onExtraCallbackWithResult() == TransferBalanceStatus.INVALID || (transferBalanceIAuthTabCallback.onExtraCallbackWithResult() == transferBalanceStatus && transferBalanceIAuthTabCallback.onTransact())) {
                    updateVisuals().onExtraCallbackWithResult(keyBoardVisiblePoint.asInterface(), keyBoardVisiblePoint.bP_());
                }
            }
        } else {
            List<KeyBoardVisiblePoint> engagementSignalsCallback = setEngagementSignalsCallback();
            if (!engagementSignalsCallback.isEmpty()) {
                onNavigationEvent((KeyBoardVisiblePoint) CollectionsKt.firstOrNull(engagementSignalsCallback));
            } else {
                IEngagementSignalsCallbackDefault().setVisibility(8);
            }
        }
        ITrustedWebActivityCallbackStub();
    }

    public final KeyBoardVisiblePoint onGreatestScrollPercentageIncreased() {
        return this.IAuthTabCallbackStub;
    }

    public final long access200() {
        return this.asBinder;
    }

    public static /* synthetic */ void onExtraCallback(AbsCompactSendActivity absCompactSendActivity, String str, long j, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitle");
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        absCompactSendActivity.onWarmupCompleted(str, j, str2);
    }

    public final void onWarmupCompleted(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.access000 = str;
        this.asBinder = j;
        Typography2 typography2WriteTypedList = writeTypedList();
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            sb.append(str);
            sb.append('\n');
        }
        String strOnNavigationEvent = getLongName.onNavigationEvent(j, (ParamImpl) null, 1, (Object) null);
        if (str2.length() == 0) {
            str2 = "을 보냅니다";
        }
        sb.append(strOnNavigationEvent + ((Object) str2));
        typography2WriteTypedList.setText(sb);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TdsImageView.setImage$default(ICustomTabsService_Parcel(), str, (Function1) null, (Function1) null, 6, (Object) null);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class onExtraCallback implements Function1<Unit, Unit> {
        public onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Unit unit) {
            AbsCompactSendActivity absCompactSendActivity = AbsCompactSendActivity.this;
            absCompactSendActivity.onNavigationEvent(absCompactSendActivity.IAuthTabCallbackStub);
        }
    }
}
