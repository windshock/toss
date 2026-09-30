package im.toss.feature.credit.ui.main.home.raise_edge_case;

import androidx.lifecycle.ViewModel;
import im.toss.feature.credit.overview.network.response.CreditOverview;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.enableGetSortedAppVersionsOpt;
import o.enableInputHideOpt;
import o.enableShowReminderOnAppPauseOpt;
import o.findResAndMsg;
import o.getCornerRadius;
import o.getSortedAppVersionsThresholdValue;
import o.isColdStartup;
import o.isFistLaunch;
import o.maybeUpdateAnimatable;
import o.setHeaders;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditScoreRaiseCoolTimeViewModel extends ViewModel {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final getSortedAppVersionsThresholdValue IAuthTabCallback;
    private final enableGetSortedAppVersionsOpt onExtraCallback;
    private final enableInputHideOpt onExtraCallbackWithResult;
    private final setRubIn<isColdStartup> onNavigationEvent;
    private final getCornerRadius<isColdStartup> onWarmupCompleted;

    @Inject
    public CreditScoreRaiseCoolTimeViewModel(@NotNull getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue, @NotNull enableInputHideOpt enableinputhideopt, @NotNull enableGetSortedAppVersionsOpt enablegetsortedappversionsopt) {
        Intrinsics.checkNotNullParameter(getsortedappversionsthresholdvalue, "");
        Intrinsics.checkNotNullParameter(enableinputhideopt, "");
        Intrinsics.checkNotNullParameter(enablegetsortedappversionsopt, "");
        this.IAuthTabCallback = getsortedappversionsthresholdvalue;
        this.onExtraCallbackWithResult = enableinputhideopt;
        this.onExtraCallback = enablegetsortedappversionsopt;
        getCornerRadius<isColdStartup> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(isColdStartup.onWarmupCompleted.onNavigationEvent);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.onNavigationEvent = getcornerradiusOnNavigationEvent;
    }

    public static final /* synthetic */ enableInputHideOpt onExtraCallback(CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        enableInputHideOpt enableinputhideopt = creditScoreRaiseCoolTimeViewModel.onExtraCallbackWithResult;
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return enableinputhideopt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ enableGetSortedAppVersionsOpt onExtraCallbackWithResult(CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        enableGetSortedAppVersionsOpt enablegetsortedappversionsopt = creditScoreRaiseCoolTimeViewModel.onExtraCallback;
        int i5 = i2 + 23;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return enablegetsortedappversionsopt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<isColdStartup> getcornerradius = creditScoreRaiseCoolTimeViewModel.onWarmupCompleted;
        int i5 = i2 + 79;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ getSortedAppVersionsThresholdValue onWarmupCompleted(CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue = creditScoreRaiseCoolTimeViewModel.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return getsortedappversionsthresholdvalue;
    }

    public final setRubIn<isColdStartup> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        setRubIn<isColdStartup> setrubin = this.onNavigationEvent;
        int i5 = i3 + 23;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return setrubin;
        }
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CreditScoreRaiseCoolTimeViewModel.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object objOnNavigationEvent;
            setHeaders setheaders;
            CreditOverview creditOverview;
            Integer numIAuthTabCallback_Parcel;
            Integer num;
            isColdStartup.onExtraCallbackWithResult onextracallbackwithresult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                enableGetSortedAppVersionsOpt enablegetsortedappversionsoptOnExtraCallbackWithResult = CreditScoreRaiseCoolTimeViewModel.onExtraCallbackWithResult(CreditScoreRaiseCoolTimeViewModel.this);
                String logReferrer = isFistLaunch.COOLTIME.getLogReferrer();
                this.label = 1;
                obj = enablegetsortedappversionsoptOnExtraCallbackWithResult.onNavigationEvent(logReferrer, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i3 = onExtraCallback + 49;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 11;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    num = (Integer) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    setheaders = (setHeaders) obj;
                    numIAuthTabCallback_Parcel = num;
                    getCornerRadius getcornerradiusOnNavigationEvent = CreditScoreRaiseCoolTimeViewModel.onNavigationEvent(CreditScoreRaiseCoolTimeViewModel.this);
                    if (numIAuthTabCallback_Parcel != null) {
                        int i8 = onWarmupCompleted + 55;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        onextracallbackwithresult = setheaders != null ? new isColdStartup.onExtraCallbackWithResult(numIAuthTabCallback_Parcel.intValue(), setheaders, str) : new isColdStartup.onNavigationEvent(str);
                    }
                    getcornerradiusOnNavigationEvent.onWarmupCompleted(onextracallbackwithresult);
                    return Unit.INSTANCE;
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                setheaders = null;
                if (Result.onExtraCallback(objOnNavigationEvent)) {
                    objOnNavigationEvent = null;
                }
                creditOverview = (CreditOverview) objOnNavigationEvent;
                if (creditOverview == null) {
                    int i10 = onExtraCallback + 87;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        creditOverview.IAuthTabCallback_Parcel();
                        throw null;
                    }
                    numIAuthTabCallback_Parcel = creditOverview.IAuthTabCallback_Parcel();
                } else {
                    numIAuthTabCallback_Parcel = null;
                }
                if (numIAuthTabCallback_Parcel != null) {
                    CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel = CreditScoreRaiseCoolTimeViewModel.this;
                    int iIntValue = numIAuthTabCallback_Parcel.intValue();
                    enableInputHideOpt enableinputhideoptOnExtraCallback = CreditScoreRaiseCoolTimeViewModel.onExtraCallback(creditScoreRaiseCoolTimeViewModel);
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(iIntValue);
                    this.L$0 = str;
                    this.L$1 = numIAuthTabCallback_Parcel;
                    this.I$0 = iIntValue;
                    this.I$1 = 0;
                    this.label = 3;
                    Object objOnExtraCallback = enableinputhideoptOnExtraCallback.onExtraCallback(numOnNavigationEvent, this);
                    if (objOnExtraCallback != objOnWarmupCompleted) {
                        num = numIAuthTabCallback_Parcel;
                        obj = objOnExtraCallback;
                        setheaders = (setHeaders) obj;
                        numIAuthTabCallback_Parcel = num;
                    }
                    return objOnWarmupCompleted;
                }
                getCornerRadius getcornerradiusOnNavigationEvent2 = CreditScoreRaiseCoolTimeViewModel.onNavigationEvent(CreditScoreRaiseCoolTimeViewModel.this);
                if (numIAuthTabCallback_Parcel != null) {
                }
                getcornerradiusOnNavigationEvent2.onWarmupCompleted(onextracallbackwithresult);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            String str2 = (String) obj;
            getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalueOnWarmupCompleted = CreditScoreRaiseCoolTimeViewModel.onWarmupCompleted(CreditScoreRaiseCoolTimeViewModel.this);
            enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = enableShowReminderOnAppPauseOpt.CREDIT_MAIN;
            this.L$0 = str2;
            this.label = 2;
            Object objIAuthTabCallback = getsortedappversionsthresholdvalueOnWarmupCompleted.IAuthTabCallback(false, enableshowreminderonapppauseopt, this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                str = str2;
                objOnNavigationEvent = objIAuthTabCallback;
                setheaders = null;
                if (Result.onExtraCallback(objOnNavigationEvent)) {
                }
                creditOverview = (CreditOverview) objOnNavigationEvent;
                if (creditOverview == null) {
                }
                if (numIAuthTabCallback_Parcel != null) {
                }
                getCornerRadius getcornerradiusOnNavigationEvent22 = CreditScoreRaiseCoolTimeViewModel.onNavigationEvent(CreditScoreRaiseCoolTimeViewModel.this);
                if (numIAuthTabCallback_Parcel != null) {
                }
                getcornerradiusOnNavigationEvent22.onWarmupCompleted(onextracallbackwithresult);
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        }
    }
}
