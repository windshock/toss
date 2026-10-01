package im.toss.feature.credit.ui.main.report;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.ViewModelProvider;
import im.toss.feature.credit.ui.main.report.CreditScoreReportActivity$;
import im.toss.feature.credit.ui.main.report.CreditScoreReportActivity$onCreate$1$1$1$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ForwardingCameraControl;
import o.PerformanceGradeJudgement;
import o.PromptPoint;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access13800;
import o.addPermRequstCallback;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.createWifiConfiguration;
import o.findResAndMsg;
import o.getParamImp;
import o.isZslDisabledByByUserCaseConfig;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.updateMainThreadPriority;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditScoreReportActivity extends Hilt_CreditScoreReportActivity {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final Lazy asInterface = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditScoreReportViewModel.class), new onWarmupCompleted(this), new onExtraCallbackWithResult(this), new onExtraCallback(null, this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.main.report.CreditScoreReportActivity$$ExternalSyntheticLambda4
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            updateMainThreadPriority updatemainthreadpriorityIAuthTabCallback = CreditScoreReportActivity.IAuthTabCallback(this.f$0);
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return updatemainthreadpriorityIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ Unit IAuthTabCallback(CreditScoreReportActivity creditScoreReportActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditScoreReportActivity, str);
        int i4 = IAuthTabCallbackStub + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ updateMainThreadPriority IAuthTabCallback(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(creditScoreReportActivity);
        }
        asInterface(creditScoreReportActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i6)) | i3;
        int i9 = ~i6;
        int i10 = i7 | i3;
        int i11 = (~(i | i9 | i3)) | (~(i10 | i6));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i6 + i4 + (1353909401 * i2) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i6) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i4) + (337379328 * i2) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i6 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i4 * 521834041) + (i2 * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }
        CreditScoreReportActivity creditScoreReportActivity = (CreditScoreReportActivity) objArr[0];
        addPermRequstCallback addpermrequstcallback = (addPermRequstCallback) objArr[1];
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub + 117;
        asBinder = i19 % 128;
        if (i19 % 2 != 0) {
            iIntValue |= 1;
        }
        creditScoreReportActivity.onNavigationEvent(addpermrequstcallback, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(creditScoreReportActivity);
        int i4 = IAuthTabCallbackStub + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditScoreReportActivity);
        int i4 = asBinder + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditScoreReportActivity creditScoreReportActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1276081158, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{creditScoreReportActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1276081160);
        }
        Object[] objArr = {creditScoreReportActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 92 / 0;
        return (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1276081158, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1276081160);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditScoreReportActivity creditScoreReportActivity, addPermRequstCallback addpermrequstcallback, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = {creditScoreReportActivity, addpermrequstcallback, str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            unit = (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 562663315, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -562663314);
            int i5 = 77 / 0;
        } else {
            Object[] objArr2 = {creditScoreReportActivity, addpermrequstcallback, str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            unit = (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 562663315, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -562663314);
        }
        int i6 = asBinder + 113;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(addPermRequstCallback addpermrequstcallback, CreditScoreReportActivity creditScoreReportActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(addpermrequstcallback, creditScoreReportActivity, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(addpermrequstcallback, creditScoreReportActivity, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Result<addPermRequstCallback> resultOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = IAuthTabCallbackStub + 85;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return resultOnExtraCallback;
    }

    public static final /* synthetic */ CreditScoreReportViewModel onExtraCallback(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        CreditScoreReportViewModel engagementSignalsCallback = creditScoreReportActivity.setEngagementSignalsCallback();
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = IAuthTabCallbackStub + 109;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return engagementSignalsCallback;
    }

    private final CreditScoreReportViewModel setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CreditScoreReportViewModel creditScoreReportViewModel = (CreditScoreReportViewModel) this.asInterface.getValue();
        int i4 = asBinder + 53;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return creditScoreReportViewModel;
        }
        throw null;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = asBinder + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return null;
    }

    private final updateMainThreadPriority IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        updateMainThreadPriority updatemainthreadpriority = (updateMainThreadPriority) this.onTransact.getValue();
        int i3 = IAuthTabCallbackStub + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return updatemainthreadpriority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final updateMainThreadPriority asInterface(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        String queryParameter = null;
        if (i2 % 2 != 0) {
            updateMainThreadPriority.onWarmupCompleted onwarmupcompleted = updateMainThreadPriority.Companion;
            creditScoreReportActivity.getIntent();
            throw null;
        }
        updateMainThreadPriority.onWarmupCompleted onwarmupcompleted2 = updateMainThreadPriority.Companion;
        Intent intent = creditScoreReportActivity.getIntent();
        if (intent != null) {
            int i3 = asBinder + 97;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Uri data = intent.getData();
            if (data != null) {
                int i5 = IAuthTabCallbackStub + 123;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                queryParameter = data.getQueryParameter("anchor");
            }
        }
        return onwarmupcompleted2.IAuthTabCallback(queryParameter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(456885029, true, new CreditScoreReportActivity$.ExternalSyntheticLambda0(this))), 1, (Object) null);
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ addPermRequstCallback $screenData;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>> $screenDataResult$delegate;
        int label;
        final /* synthetic */ CreditScoreReportActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(addPermRequstCallback addpermrequstcallback, CreditScoreReportActivity creditScoreReportActivity, CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$screenData = addpermrequstcallback;
            this.this$0 = creditScoreReportActivity;
            this.$screenDataResult$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditScoreReportActivity creditScoreReportActivity, DialogInterface dialogInterface) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(creditScoreReportActivity, dialogInterface);
            int i4 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$screenData, this.this$0, this.$screenDataResult$delegate, access13800Var);
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context, im.toss.feature.credit.ui.main.report.CreditScoreReportActivity] */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$screenData != null) {
                int i4 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                CreditScoreReportActivity.onExtraCallback(this.this$0).IAuthTabCallback();
            }
            Object[] objArr = {this.$screenDataResult$delegate};
            Result result = (Result) CreditScoreReportActivity.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -21509425, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 21509425);
            if (result != null) {
                Object objOnNavigationEvent = result.onNavigationEvent();
                ?? r2 = this.this$0;
                Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                    getParamImp.onWarmupCompleted(th, r2, false, null, null, new CreditScoreReportActivity$onCreate$1$1$1$.ExternalSyntheticLambda0((CreditScoreReportActivity) r2), 14, null);
                }
                Result.IAuthTabCallback(objOnNavigationEvent);
                int i6 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onWarmupCompleted(CreditScoreReportActivity creditScoreReportActivity, DialogInterface dialogInterface) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            creditScoreReportActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        Result<addPermRequstCallback> resultOnExtraCallback;
        addPermRequstCallback addpermrequstcallback;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        CreditScoreReportActivity creditScoreReportActivity = (CreditScoreReportActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 3) != 2) {
            int i5 = i3 + 73;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 15;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = asBinder + 63;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 32 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(456885029, iIntValue, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportActivity.onCreate.<anonymous> (CreditScoreReportActivity.kt:39)");
                }
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditScoreReportActivity.setEngagementSignalsCallback().onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                resultOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                if (resultOnExtraCallback == null) {
                    Object objOnNavigationEvent = resultOnExtraCallback.onNavigationEvent();
                    if (Result.onExtraCallback(objOnNavigationEvent)) {
                        objOnNavigationEvent = null;
                    }
                    addpermrequstcallback = (addPermRequstCallback) objOnNavigationEvent;
                } else {
                    addpermrequstcallback = null;
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditScoreReportActivity.setEngagementSignalsCallback().onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                Result<addPermRequstCallback> resultOnExtraCallback2 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(addpermrequstcallback);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreReportActivity);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(addpermrequstcallback, creditScoreReportActivity, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(resultOnExtraCallback2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                creditScoreReportActivity.onNavigationEvent(addpermrequstcallback, (String) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -248115017, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 248115020), cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i11 = asBinder + 91;
                    IAuthTabCallbackStub = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = asBinder + 65;
                    IAuthTabCallbackStub = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditScoreReportActivity.setEngagementSignalsCallback().onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                resultOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                if (resultOnExtraCallback == null) {
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditScoreReportActivity.setEngagementSignalsCallback().onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7);
                Result<addPermRequstCallback> resultOnExtraCallback22 = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(addpermrequstcallback);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreReportActivity);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent)) {
                    objOnMinimized = new IAuthTabCallback(addpermrequstcallback, creditScoreReportActivity, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(resultOnExtraCallback22, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    creditScoreReportActivity.onNavigationEvent(addpermrequstcallback, (String) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -248115017, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 248115020), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseActivity*/.onResume();
        setEngagementSignalsCallback().onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallbackWithResult(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }

        public /* synthetic */ Object invoke() {
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
                int i3 = 34 / 0;
            } else {
                onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            }
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedIAuthTabCallback;
        }
    }

    private static final Unit onWarmupCompleted(CreditScoreReportActivity creditScoreReportActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            creditScoreReportActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            unit = Unit.INSTANCE;
            int i3 = 37 / 0;
        } else {
            creditScoreReportActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onWarmupCompleted implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public onWarmupCompleted(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i3 = onNavigationEvent + 121;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
                int i3 = 9 / 0;
            } else {
                viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
            }
            int i4 = onNavigationEvent + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditScoreReportActivity creditScoreReportActivity, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            SessionTrackerb.IAuthTabCallback(creditScoreReportActivity.onNavigationEvent(), creditScoreReportActivity, str, false, (Function1) null, (Bundle) null, true, 53, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            SessionTrackerb.IAuthTabCallback(creditScoreReportActivity.onNavigationEvent(), creditScoreReportActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onTransact(CreditScoreReportActivity creditScoreReportActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        creditScoreReportActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallback(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 39 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            Function0 function0 = this.onExtraCallback;
            if (function0 != null) {
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 42 / 0;
                    }
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onWarmupCompleted.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(addPermRequstCallback addpermrequstcallback, CreditScoreReportActivity creditScoreReportActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallbackStub + 99;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = asBinder + 43;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-514182934, i, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportActivity.ScoreReportScreen.<anonymous> (CreditScoreReportActivity.kt:74)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreReportActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i6 = IAuthTabCallbackStub + 119;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditScoreReportActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new CreditScoreReportActivity$.ExternalSyntheticLambda5(creditScoreReportActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                    obj = externalSyntheticLambda5;
                }
                Function1 function1 = (Function1) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreReportActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CreditScoreReportActivity$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new CreditScoreReportActivity$.ExternalSyntheticLambda6(creditScoreReportActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                        obj2 = externalSyntheticLambda6;
                    }
                    PerformanceGradeJudgement.onNavigationEvent(addpermrequstcallback, function1, (Function0) obj2, createWifiConfiguration.onExtraCallbackWithResult.onExtraCallback.onExtraCallback(str), creditScoreReportActivity.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r14
      0x002d: PHI (r14v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r14
      0x0022: PHI (r14v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(addPermRequstCallback addpermrequstcallback, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 17;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(285058512);
            if ((i & 31) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(addpermrequstcallback) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(285058512);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i7 = asBinder + 45;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
            int i9 = IAuthTabCallbackStub + 31;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((i & 384) == 0) {
            int i11 = IAuthTabCallbackStub + 63;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i13 = IAuthTabCallbackStub + 41;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(285058512, i2, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportActivity.ScoreReportScreen (CreditScoreReportActivity.kt:68)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback) {
                CreditScoreReportActivity$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new CreditScoreReportActivity$.ExternalSyntheticLambda1(this);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda1);
                obj = externalSyntheticLambda1;
                PromptPoint.onExtraCallback((QuirksExternalSyntheticBackport0) null, 0L, (Function0) obj, ForwardingCameraControl.onExtraCallback(-514182934, true, new CreditScoreReportActivity$.ExternalSyntheticLambda2(addpermrequstcallback, this, str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                PromptPoint.onExtraCallback((QuirksExternalSyntheticBackport0) null, 0L, (Function0) obj, ForwardingCameraControl.onExtraCallback(-514182934, true, new CreditScoreReportActivity$.ExternalSyntheticLambda2(addpermrequstcallback, this, str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportActivity$.ExternalSyntheticLambda3(this, addpermrequstcallback, str, i));
        }
    }

    private static final Result<addPermRequstCallback> onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Result<addPermRequstCallback>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Result<addPermRequstCallback> result = (Result) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    private static final Unit onWarmupCompleted(CreditScoreReportActivity creditScoreReportActivity, addPermRequstCallback addpermrequstcallback, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {creditScoreReportActivity, addpermrequstcallback, str, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 562663315, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -562663314);
    }

    public static final /* synthetic */ Result IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Result) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -21509425, iOnNavigationEvent2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 21509425);
    }

    private static final Unit onExtraCallbackWithResult(CreditScoreReportActivity creditScoreReportActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditScoreReportActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1276081158, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1276081160);
    }

    private static final String onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<String> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (String) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -248115017, iOnNavigationEvent2, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 248115020);
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.feature.credit.ui.main.report.Hilt_CreditScoreReportActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
