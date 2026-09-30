package im.toss.feature.credit.ui.history.detail;

import androidx.lifecycle.ViewModel;
import im.toss.features.credit.data.request.CreditAdsBannerRequest;
import im.toss.features.credit.data.response.CreditAdsBannerResponse;
import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CipherSuiteCompanion;
import o.GeckoHubImp;
import o.PlayerErrorCode;
import o.RuntimeEnvironment1;
import o.RuntimeEnvironmentRuntimeEnvironmentInner;
import o.WebResourceResponseModel;
import o.WifiConnectorExternalSyntheticApiModelOutline1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.connectWifiV29;
import o.enableInputHideOpt;
import o.enableNebulaServiceInitOpt;
import o.enableOrientationOpt;
import o.findResAndMsg;
import o.getAppAlias;
import o.getCornerRadius;
import o.maybeUpdateAnimatable;
import o.networkInfoOpt;
import o.onAvailable;
import o.onUnavailable;
import o.optimizeEventThreadOpt;
import o.putChannelInfo;
import o.setHeaders;
import o.setRubIn;
import o.setShine;
import o.supportH5PreCache;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHistoryDetailViewModel extends ViewModel {
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private final getCornerRadius<RuntimeEnvironmentRuntimeEnvironmentInner> onExtraCallback;
    private final enableOrientationOpt onExtraCallbackWithResult;
    private final enableInputHideOpt onNavigationEvent;
    private final getAppAlias onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            CreditHistoryDetailViewModel creditHistoryDetailViewModel = CreditHistoryDetailViewModel.this;
            if (i3 != 0) {
                objOnExtraCallback = CreditHistoryDetailViewModel.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -988572837, new Object[]{creditHistoryDetailViewModel, 0, null, this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 988572838);
            } else {
                objOnExtraCallback = CreditHistoryDetailViewModel.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -988572837, new Object[]{creditHistoryDetailViewModel, 0, null, this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 988572838);
            }
            int i4 = onExtraCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = CreditHistoryDetailViewModel.onNavigationEvent(CreditHistoryDetailViewModel.this, (access13800) this);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i2 | i7 | (~i4);
        int i9 = ~i2;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i6 + i2 + i5 + ((-92689393) * i) + (1942122663 * i3);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i6) - 357761024) + ((-674687396) * i2) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i5) + ((-1056047104) * i) + ((-742522880) * i3) + ((-592117760) * i12);
        int i14 = (i6 * 1048061654) + 1366922925 + (i2 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i5 * 1048061961) + (i * 439444615) + (i3 * (-1279783457)) + (i12 * 173867008);
        return i13 + ((i14 * i14) * (-1898250240)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    @Inject
    public CreditHistoryDetailViewModel(@NotNull getAppAlias getappalias, @NotNull enableInputHideOpt enableinputhideopt, @NotNull enableOrientationOpt enableorientationopt) {
        Intrinsics.checkNotNullParameter(getappalias, "");
        Intrinsics.checkNotNullParameter(enableinputhideopt, "");
        Intrinsics.checkNotNullParameter(enableorientationopt, "");
        this.onWarmupCompleted = getappalias;
        this.onNavigationEvent = enableinputhideopt;
        this.onExtraCallbackWithResult = enableorientationopt;
        this.onExtraCallback = setShine.onNavigationEvent((Object) null);
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(CreditHistoryDetailViewModel creditHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getCornerRadius<RuntimeEnvironmentRuntimeEnvironmentInner> getcornerradius = creditHistoryDetailViewModel.onExtraCallback;
        int i5 = i3 + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(CreditHistoryDetailViewModel creditHistoryDetailViewModel, onAvailable onavailable) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = creditHistoryDetailViewModel.onWarmupCompleted(onavailable);
        int i4 = IAuthTabCallback + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static final /* synthetic */ Object onNavigationEvent(CreditHistoryDetailViewModel creditHistoryDetailViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = creditHistoryDetailViewModel.onExtraCallbackWithResult((access13800<? super RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent>) access13800Var);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = onTransact + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditHistoryDetailViewModel creditHistoryDetailViewModel = (CreditHistoryDetailViewModel) objArr[0];
        RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner = (RuntimeEnvironmentRuntimeEnvironmentInner) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onUnavailable onunavailableOnExtraCallbackWithResult = creditHistoryDetailViewModel.onExtraCallbackWithResult(runtimeEnvironmentRuntimeEnvironmentInner);
        int i4 = IAuthTabCallback + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onunavailableOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ enableOrientationOpt onNavigationEvent(CreditHistoryDetailViewModel creditHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        enableOrientationOpt enableorientationopt = creditHistoryDetailViewModel.onExtraCallbackWithResult;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enableorientationopt;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditHistoryDetailViewModel creditHistoryDetailViewModel = (CreditHistoryDetailViewModel) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        networkInfoOpt networkinfoopt = (networkInfoOpt) objArr[2];
        access13800<? super onUnavailable> access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = creditHistoryDetailViewModel.onExtraCallbackWithResult(iIntValue, networkinfoopt, access13800Var);
        int i4 = IAuthTabCallback + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ getAppAlias onWarmupCompleted(CreditHistoryDetailViewModel creditHistoryDetailViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getAppAlias getappalias = creditHistoryDetailViewModel.onWarmupCompleted;
        int i5 = i2 + 3;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return getappalias;
    }

    public final setRubIn<RuntimeEnvironmentRuntimeEnvironmentInner> onExtraCallback() {
        setRubIn<RuntimeEnvironmentRuntimeEnvironmentInner> setrubinOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setrubinOnExtraCallback = ycxycx.onExtraCallback(this.onExtraCallback);
            int i3 = 18 / 0;
        } else {
            setrubinOnExtraCallback = ycxycx.onExtraCallback(this.onExtraCallback);
        }
        int i4 = onTransact + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return setrubinOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        o.maybeUpdateAnimatable.onNavigationEvent(o.ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(r11), (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel.IAuthTabCallback(r14, r11, r12, r13, r15, null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r14 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r14 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r12 = im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel.IAuthTabCallback + 89;
        im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel.onTransact = r12 % 128;
        r12 = r12 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(int i, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, @Nullable onAvailable onavailable, @Nullable DisclaimerV2 disclaimerV2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            int i4 = 52 / 0;
        } else {
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ enableNebulaServiceInitOpt $creditBureauType;
        final /* synthetic */ int $creditScore;
        final /* synthetic */ DisclaimerV2 $disclaimer;
        final /* synthetic */ onAvailable $historyDetail;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CreditHistoryDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(onAvailable onavailable, CreditHistoryDetailViewModel creditHistoryDetailViewModel, int i, enableNebulaServiceInitOpt enablenebulaserviceinitopt, DisclaimerV2 disclaimerV2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$historyDetail = onavailable;
            this.this$0 = creditHistoryDetailViewModel;
            this.$creditScore = i;
            this.$creditBureauType = enablenebulaserviceinitopt;
            this.$disclaimer = disclaimerV2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$historyDetail, this.this$0, this.$creditScore, this.$creditBureauType, this.$disclaimer, access13800Var);
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 66 / 0;
            }
            int i5 = IAuthTabCallback + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
        
            if (r6 != r2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
        
            if (r6 != r2) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[PHI: r1 r2 r3 r4
          0x012d: PHI (r1v9 o.getCornerRadius) = (r1v8 o.getCornerRadius), (r1v13 o.getCornerRadius) binds: [B:36:0x012b, B:33:0x0112] A[DONT_GENERATE, DONT_INLINE]
          0x012d: PHI (r2v15 o.onAvailable) = (r2v14 o.onAvailable), (r2v18 o.onAvailable) binds: [B:36:0x012b, B:33:0x0112] A[DONT_GENERATE, DONT_INLINE]
          0x012d: PHI (r3v16 int) = (r3v15 int), (r3v18 int) binds: [B:36:0x012b, B:33:0x0112] A[DONT_GENERATE, DONT_INLINE]
          0x012d: PHI (r4v6 java.lang.Integer) = (r4v5 java.lang.Integer), (r4v9 java.lang.Integer) binds: [B:36:0x012b, B:33:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            networkInfoOpt networkinfooptIAuthTabCallback;
            onUnavailable onunavailableIAuthTabCallback;
            Object objOnExtraCallback;
            Object objOnNavigationEvent;
            networkInfoOpt networkinfoopt;
            onUnavailable onunavailable;
            int iIntValue;
            getCornerRadius getcornerradiusIAuthTabCallback;
            onAvailable onavailable;
            int i;
            Integer numIAuthTabCallback;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            int iIntValue2 = 0;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                networkinfooptIAuthTabCallback = optimizeEventThreadOpt.IAuthTabCallback(this.$historyDetail);
                if (networkinfooptIAuthTabCallback == null) {
                    networkinfooptIAuthTabCallback = networkInfoOpt.SAME;
                }
                if (onNavigationEvent.onExtraCallbackWithResult[networkinfooptIAuthTabCallback.ordinal()] != 1) {
                    onunavailableIAuthTabCallback = optimizeEventThreadOpt.IAuthTabCallback(networkinfooptIAuthTabCallback);
                    CreditHistoryDetailViewModel creditHistoryDetailViewModel = this.this$0;
                    this.L$0 = networkinfooptIAuthTabCallback;
                    this.L$1 = onunavailableIAuthTabCallback;
                    this.label = 2;
                    objOnNavigationEvent = CreditHistoryDetailViewModel.onNavigationEvent(creditHistoryDetailViewModel, (access13800) this);
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                int i4 = IAuthTabCallback + 3;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    CreditHistoryDetailViewModel creditHistoryDetailViewModel2 = this.this$0;
                    int iAccess100 = this.$historyDetail.access100();
                    this.L$0 = networkinfooptIAuthTabCallback;
                    this.label = 0;
                    objOnExtraCallback = CreditHistoryDetailViewModel.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -988572837, new Object[]{creditHistoryDetailViewModel2, Integer.valueOf(iAccess100), networkinfooptIAuthTabCallback, this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 988572838);
                } else {
                    CreditHistoryDetailViewModel creditHistoryDetailViewModel3 = this.this$0;
                    int iAccess1002 = this.$historyDetail.access100();
                    this.L$0 = networkinfooptIAuthTabCallback;
                    this.label = 1;
                    objOnExtraCallback = CreditHistoryDetailViewModel.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -988572837, new Object[]{creditHistoryDetailViewModel3, Integer.valueOf(iAccess1002), networkinfooptIAuthTabCallback, this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 988572838);
                }
                CreditHistoryDetailViewModel creditHistoryDetailViewModel4 = this.this$0;
                this.L$0 = networkinfooptIAuthTabCallback;
                this.L$1 = onunavailableIAuthTabCallback;
                this.label = 2;
                objOnNavigationEvent = CreditHistoryDetailViewModel.onNavigationEvent(creditHistoryDetailViewModel4, (access13800) this);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    networkinfoopt = networkinfooptIAuthTabCallback;
                    onunavailable = onunavailableIAuthTabCallback;
                    RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent onnavigationevent = (RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent) objOnNavigationEvent;
                    if (CreditHistoryDetailViewModel.IAuthTabCallback(this.this$0, this.$historyDetail)) {
                    }
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                onUnavailable onunavailable2 = (onUnavailable) this.L$1;
                networkInfoOpt networkinfoopt2 = (networkInfoOpt) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = obj;
                onunavailable = onunavailable2;
                networkinfoopt = networkinfoopt2;
                RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent onnavigationevent2 = (RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent) objOnNavigationEvent;
                if (CreditHistoryDetailViewModel.IAuthTabCallback(this.this$0, this.$historyDetail)) {
                    int i7 = IAuthTabCallback + 71;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        getcornerradiusIAuthTabCallback = CreditHistoryDetailViewModel.IAuthTabCallback(this.this$0);
                        onavailable = this.$historyDetail;
                        i = this.$creditScore;
                        numIAuthTabCallback = CreditHistoryDetailViewModel.onNavigationEvent(this.this$0).IAuthTabCallback(this.$creditBureauType);
                        int i8 = 11 / 0;
                        if (numIAuthTabCallback != null) {
                            iIntValue2 = numIAuthTabCallback.intValue();
                        }
                    } else {
                        getcornerradiusIAuthTabCallback = CreditHistoryDetailViewModel.IAuthTabCallback(this.this$0);
                        onavailable = this.$historyDetail;
                        i = this.$creditScore;
                        numIAuthTabCallback = CreditHistoryDetailViewModel.onNavigationEvent(this.this$0).IAuthTabCallback(this.$creditBureauType);
                        if (numIAuthTabCallback != null) {
                        }
                    }
                    getcornerradiusIAuthTabCallback.onWarmupCompleted(RuntimeEnvironment1.onExtraCallbackWithResult(onavailable, i, iIntValue2, this.$creditBureauType, onunavailable, networkinfoopt, onnavigationevent2, this.$disclaimer));
                    return Unit.INSTANCE;
                }
                onAvailable onavailable2 = this.$historyDetail;
                int i9 = this.$creditScore;
                Integer numIAuthTabCallback2 = CreditHistoryDetailViewModel.onNavigationEvent(this.this$0).IAuthTabCallback(this.$creditBureauType);
                if (numIAuthTabCallback2 != null) {
                    int i10 = onNavigationEvent + 1;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        iIntValue = numIAuthTabCallback2.intValue();
                        int i11 = 50 / 0;
                    } else {
                        iIntValue = numIAuthTabCallback2.intValue();
                    }
                    iIntValue2 = iIntValue;
                }
                RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInnerOnExtraCallbackWithResult = RuntimeEnvironment1.onExtraCallbackWithResult(onavailable2, i9, iIntValue2, this.$creditBureauType, onunavailable, networkinfoopt, onnavigationevent2, this.$disclaimer);
                CreditHistoryDetailViewModel.IAuthTabCallback(this.this$0).onWarmupCompleted(RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent(runtimeEnvironmentRuntimeEnvironmentInnerOnExtraCallbackWithResult, 0, 0, (enableNebulaServiceInitOpt) null, (WifiConnectorExternalSyntheticApiModelOutline1) null, (onAvailable) null, (onUnavailable) CreditHistoryDetailViewModel.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), 1880921654, new Object[]{this.this$0, runtimeEnvironmentRuntimeEnvironmentInnerOnExtraCallbackWithResult}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1880921654), (networkInfoOpt) null, (String) null, (RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent) null, (DisclaimerV2) null, 991, (Object) null));
                return Unit.INSTANCE;
            }
            networkinfooptIAuthTabCallback = (networkInfoOpt) this.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback = obj;
            onunavailableIAuthTabCallback = (onUnavailable) objOnExtraCallback;
            CreditHistoryDetailViewModel creditHistoryDetailViewModel42 = this.this$0;
            this.L$0 = networkinfooptIAuthTabCallback;
            this.L$1 = onunavailableIAuthTabCallback;
            this.label = 2;
            objOnNavigationEvent = CreditHistoryDetailViewModel.onNavigationEvent(creditHistoryDetailViewModel42, (access13800) this);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r4 r7
      0x0031: PHI (r4v19 im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel$onExtraCallbackWithResult) = 
      (r4v18 im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel$onExtraCallbackWithResult)
      (r4v21 im.toss.feature.credit.ui.history.detail.CreditHistoryDetailViewModel$onExtraCallbackWithResult)
     binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r7v3 int) = (r7v2 int), (r7v5 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(int i, networkInfoOpt networkinfoopt, access13800<? super onUnavailable> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        networkInfoOpt networkinfoopt2;
        GeckoHubImp geckoHubImpIAuthTabCallback;
        onExtraCallback onextracallback;
        networkInfoOpt networkinfoopt3;
        Object obj;
        List list;
        onUnavailable onunavailableIAuthTabCallback;
        int i2;
        CreditAdsBannerResponse creditAdsBannerResponse;
        int i3;
        int i4 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i5 = IAuthTabCallback + 79;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                i3 = onextracallbackwithresult.label;
                int i6 = 84 / 0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    onextracallbackwithresult.label = i3 - 2147483648;
                } else {
                    onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                }
            } else {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                i3 = onextracallbackwithresult.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        Object obj2 = null;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                try {
                    Result.Companion companion = Result.Companion;
                    geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onextracallback = new onExtraCallback(null, this, i);
                    networkinfoopt2 = networkinfoopt;
                } catch (Exception e) {
                    e = e;
                    networkinfoopt2 = networkinfoopt;
                } catch (WebResourceResponseModel e2) {
                    e = e2;
                    networkinfoopt2 = networkinfoopt;
                }
                try {
                    onextracallbackwithresult.L$0 = networkinfoopt2;
                    onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                    onextracallbackwithresult.I$0 = i;
                    onextracallbackwithresult.I$1 = 0;
                    onextracallbackwithresult.I$2 = 0;
                    onextracallbackwithresult.I$3 = 0;
                    onextracallbackwithresult.label = 1;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, onextracallbackwithresult);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        int i8 = IAuthTabCallback + 97;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        return objOnWarmupCompleted;
                    }
                    networkinfoopt3 = networkinfoopt2;
                } catch (Exception e3) {
                    e = e3;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    networkinfoopt3 = networkinfoopt2;
                    if (Result.onExtraCallback(obj)) {
                    }
                    list = (List) obj;
                    if (list == null) {
                        onunavailableIAuthTabCallback = optimizeEventThreadOpt.IAuthTabCallback(networkinfoopt3);
                    }
                    i2 = IAuthTabCallback + 105;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                } catch (WebResourceResponseModel e4) {
                    e = e4;
                    Result.Companion companion3 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    networkinfoopt3 = networkinfoopt2;
                    if (Result.onExtraCallback(obj)) {
                    }
                    list = (List) obj;
                    if (list == null) {
                    }
                    i2 = IAuthTabCallback + 105;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkinfoopt3 = (networkInfoOpt) onextracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                } catch (Exception e5) {
                    e = e5;
                    networkinfoopt2 = networkinfoopt3;
                    Result.Companion companion22 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    networkinfoopt3 = networkinfoopt2;
                    if (Result.onExtraCallback(obj)) {
                    }
                    list = (List) obj;
                    if (list == null) {
                    }
                    i2 = IAuthTabCallback + 105;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                } catch (WebResourceResponseModel e6) {
                    e = e6;
                    networkinfoopt2 = networkinfoopt3;
                    Result.Companion companion32 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                    networkinfoopt3 = networkinfoopt2;
                    if (Result.onExtraCallback(obj)) {
                    }
                    list = (List) obj;
                    if (list == null) {
                    }
                    i2 = IAuthTabCallback + 105;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                }
            }
            obj = Result.constructor-impl(objOnExtraCallback);
            int i10 = IAuthTabCallback + 113;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            if (Result.onExtraCallback(obj)) {
                int i12 = onTransact + 89;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                obj = null;
            }
            list = (List) obj;
            if (list == null || (creditAdsBannerResponse = (CreditAdsBannerResponse) CollectionsKt.firstOrNull(list)) == null) {
                onunavailableIAuthTabCallback = optimizeEventThreadOpt.IAuthTabCallback(networkinfoopt3);
            } else {
                int i14 = IAuthTabCallback + 35;
                onTransact = i14 % 128;
                int i15 = i14 % 2;
                onUnavailable onunavailableOnExtraCallback = supportH5PreCache.onExtraCallback(creditAdsBannerResponse);
                if (onunavailableOnExtraCallback != null) {
                    int i16 = onTransact + 97;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0 ? (onunavailableIAuthTabCallback = onUnavailable.onWarmupCompleted(onunavailableOnExtraCallback, (String) null, (String) null, (String) null, (String) null, false, (CipherSuiteCompanion) null, (String) null, (String) null, (CipherSuiteCompanion) null, (connectWifiV29) null, (String) null, (Map) null, (Boolean) null, false, true, (CipherSuiteCompanion) null, (String) null, (String) null, (Function0) null, 507903, (Object) null)) != null : (onunavailableIAuthTabCallback = onUnavailable.onWarmupCompleted(onunavailableOnExtraCallback, (String) null, (String) null, (String) null, (String) null, true, (CipherSuiteCompanion) null, (String) null, (String) null, (CipherSuiteCompanion) null, (connectWifiV29) null, (String) null, (Map) null, (Boolean) null, true, false, (CipherSuiteCompanion) null, (String) null, (String) null, (Function0) null, 507903, (Object) null)) != null) {
                        int i17 = IAuthTabCallback + 69;
                        onTransact = i17 % 128;
                        int i18 = i17 % 2;
                    }
                }
            }
            i2 = IAuthTabCallback + 105;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return onunavailableIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(access13800<? super RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onTransact + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
                int i5 = onTransact + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object objIAuthTabCallback = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onwarmupcompleted.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            enableInputHideOpt enableinputhideopt = this.onNavigationEvent;
            onwarmupcompleted.label = 1;
            objIAuthTabCallback = enableInputHideOpt.IAuthTabCallback(enableinputhideopt, null, onwarmupcompleted, 1, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i8 = onTransact + 45;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        setHeaders setheaders = (setHeaders) objIAuthTabCallback;
        if (setheaders == null) {
            return null;
        }
        RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent onnavigationevent = new RuntimeEnvironmentRuntimeEnvironmentInner.onNavigationEvent(setheaders);
        int i10 = IAuthTabCallback + 27;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return onnavigationevent;
    }

    private final boolean onWarmupCompleted(onAvailable onavailable) {
        int i = 2 % 2;
        if (onavailable.readTypedObject() == WifiConnectorExternalSyntheticApiModelOutline1.SCORE) {
            int i2 = onTransact;
            int i3 = i2 + 27;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 == 0;
            int i4 = i2 + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onUnavailable onExtraCallbackWithResult(RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner) {
        String strOnExtraCallbackWithResult;
        int i;
        String str;
        int i2 = 2 % 2;
        onUnavailable onunavailableIAuthTabCallback = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback();
        String strAccess100 = null;
        if (onunavailableIAuthTabCallback == null) {
            return null;
        }
        int i3 = onTransact + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        networkInfoOpt networkinfooptIAuthTabCallbackStub = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackStub();
        networkInfoOpt networkinfoopt = networkInfoOpt.DOWN;
        if (networkinfooptIAuthTabCallbackStub == networkinfoopt) {
            String strOnExtraCallbackWithResult2 = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback().onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult2 == null) {
                str = null;
                if (runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackStub() != networkinfoopt) {
                    String strAccess1002 = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback().access100();
                    if (strAccess1002 != null) {
                        strAccess100 = String.format(strAccess1002, Arrays.copyOf(new Object[]{Integer.valueOf(runtimeEnvironmentRuntimeEnvironmentInner.onExtraCallbackWithResult())}, 1));
                        Intrinsics.checkNotNullExpressionValue(strAccess100, "");
                    }
                } else {
                    strAccess100 = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback().access100();
                }
                return onUnavailable.onWarmupCompleted(onunavailableIAuthTabCallback, strAccess100, str, (String) null, (String) null, false, (CipherSuiteCompanion) null, (String) null, (String) null, (CipherSuiteCompanion) null, (connectWifiV29) null, (String) null, (Map) null, (Boolean) null, false, false, (CipherSuiteCompanion) null, (String) null, (String) null, (Function0) null, 524284, (Object) null);
            }
            int i5 = IAuthTabCallback + 81;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            strOnExtraCallbackWithResult = String.format(strOnExtraCallbackWithResult2, Arrays.copyOf(new Object[]{PlayerErrorCode.onPostMessage()}, 1));
            Intrinsics.checkNotNullExpressionValue(strOnExtraCallbackWithResult, "");
            i = IAuthTabCallback + 21;
        } else {
            strOnExtraCallbackWithResult = runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallback().onExtraCallbackWithResult();
            i = IAuthTabCallback + 117;
        }
        onTransact = i % 128;
        int i7 = i % 2;
        str = strOnExtraCallbackWithResult;
        if (runtimeEnvironmentRuntimeEnvironmentInner.IAuthTabCallbackStub() != networkinfoopt) {
        }
        return onUnavailable.onWarmupCompleted(onunavailableIAuthTabCallback, strAccess100, str, (String) null, (String) null, false, (CipherSuiteCompanion) null, (String) null, (String) null, (CipherSuiteCompanion) null, (connectWifiV29) null, (String) null, (Map) null, (Boolean) null, false, false, (CipherSuiteCompanion) null, (String) null, (String) null, (Function0) null, 524284, (Object) null);
    }

    public static final /* synthetic */ onUnavailable onNavigationEvent(CreditHistoryDetailViewModel creditHistoryDetailViewModel, RuntimeEnvironmentRuntimeEnvironmentInner runtimeEnvironmentRuntimeEnvironmentInner) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (onUnavailable) onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), 1880921654, new Object[]{creditHistoryDetailViewModel, runtimeEnvironmentRuntimeEnvironmentInner}, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1880921654);
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends CreditAdsBannerResponse>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ int $scoreDiff$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ CreditHistoryDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, CreditHistoryDetailViewModel creditHistoryDetailViewModel, int i) {
            super(2, access13800Var);
            this.this$0 = creditHistoryDetailViewModel;
            this.$scoreDiff$inlined = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var, this.this$0, this.$scoreDiff$inlined);
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 42 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<? extends CreditAdsBannerResponse>> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getAppAlias getappaliasOnWarmupCompleted = CreditHistoryDetailViewModel.onWarmupCompleted(this.this$0);
                CreditAdsBannerRequest creditAdsBannerRequest = new CreditAdsBannerRequest("SCORE_CHANGE_UP", (Integer) null, access14000.onNavigationEvent(this.$scoreDiff$inlined), 2, (DefaultConstructorMarker) null);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = getappaliasOnWarmupCompleted.IAuthTabCallback(creditAdsBannerRequest, this);
                if (obj == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i8 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    baseApiResponse.onTransact();
                    throw null;
                }
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact != null) {
                    return (List) objOnTransact;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<im.toss.features.credit.data.response.CreditAdsBannerResponse>");
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(List.class, Object.class) && !Intrinsics.areEqual(List.class, Unit.class)) {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
                List list = Unit.INSTANCE;
                int i9 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    return list;
                }
                obj2.hashCode();
                throw null;
            }
        }
    }
}
