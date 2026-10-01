package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.toJsonArray, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class C0084toJsonArray {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* renamed from: o.toJsonArray$onExtraCallbackWithResult */
    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ toList $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(toList tolist, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = tolist;
            this.$isVisible = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$isVisible, access13800Var);
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(this.$isVisible);
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final optList onNavigationEvent(@Nullable Object obj, @Nullable List<? extends appendQueryParameters> list, @Nullable setOnQueryTextListener setonquerytextlistener, float f, long j, long j2, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        List<? extends appendQueryParameters> list2;
        float f2;
        boolean z3;
        List<? extends appendQueryParameters> listEmptyList;
        int i3 = 2 % 2;
        Object obj2 = (i2 & 1) != 0 ? null : obj;
        if ((i2 & 2) != 0) {
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i5 = 1 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            list2 = listEmptyList;
        } else {
            list2 = list;
        }
        setOnQueryTextListener setinputtype = (i2 & 4) != 0 ? new setInputType(0.8f, 0.0f, 0.72f, 0.8f) : setonquerytextlistener;
        if ((i2 & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            f2 = 0.1f;
        } else {
            f2 = f;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent() : j;
        long jOnNavigationEvent2 = (i2 & 32) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent() : j2;
        boolean z4 = (i2 & 64) != 0 ? true : z;
        boolean z5 = (i2 & 128) != 0 ? true : z2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1264762372, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.rememberTdsPaymentAgreementScreenState (TdsPaymentAgreementScreenState.kt:89)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            z3 = true;
            objOnMinimized = new toList(setinputtype, f2, jOnNavigationEvent, jOnNavigationEvent2, list2, z5, z4, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        } else {
            z3 = true;
        }
        toList tolist = (toList) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tolist);
        boolean z6 = ((((29360128 & i) ^ 12582912) <= 8388608 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z5)) && (i & 12582912) != 8388608) ? false : z3;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent2 | z6)) {
            int i7 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(tolist, z5, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z5), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 21) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return tolist;
    }
}
