package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeConvertToIndentedString {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List<appendQueryParameters> $screenStates;
        final /* synthetic */ jsonObjectFromJsonString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(jsonObjectFromJsonString jsonobjectfromjsonstring, List<? extends appendQueryParameters> list, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = jsonobjectfromjsonstring;
            this.$screenStates = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$screenStates, access13800Var);
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 85 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 != 0) {
                this.$state.onExtraCallback(this.$screenStates);
                Unit unit = Unit.INSTANCE;
                int i4 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 56 / 0;
                }
                return unit;
            }
            this.$state.onExtraCallback(this.$screenStates);
            Unit unit2 = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ float $overlayTypeMaxHeight;
        final /* synthetic */ jsonObjectFromJsonString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(jsonObjectFromJsonString jsonobjectfromjsonstring, float f, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = jsonobjectfromjsonstring;
            this.$overlayTypeMaxHeight = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$overlayTypeMaxHeight, access13800Var);
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 63;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                this.$state.onWarmupCompleted(this.$overlayTypeMaxHeight);
                return Unit.INSTANCE;
            }
            this.$state.onWarmupCompleted(this.$overlayTypeMaxHeight);
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ jsonObjectFromJsonString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(jsonObjectFromJsonString jsonobjectfromjsonstring, long j, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = jsonobjectfromjsonstring;
            this.$backgroundColor = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$backgroundColor, access13800Var);
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            r3.$state.onWarmupCompleted(r3.$backgroundColor);
            r4 = kotlin.Unit.INSTANCE;
            r1 = o.maybeConvertToIndentedString.onExtraCallback.onExtraCallbackWithResult + 59;
            o.maybeConvertToIndentedString.onExtraCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $delay;
        final /* synthetic */ jsonObjectFromJsonString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(jsonObjectFromJsonString jsonobjectfromjsonstring, long j, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = jsonobjectfromjsonstring;
            this.$delay = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$delay, access13800Var);
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            int i5 = onNavigationEvent + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallbackWithResult(this.$delay);
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 23;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    public static final getStringList onNavigationEvent(@Nullable Object obj, @Nullable List<? extends appendQueryParameters> list, boolean z, boolean z2, @Nullable setOnQueryTextListener setonquerytextlistener, float f, long j, float f2, long j2, long j3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float f3;
        long jIAuthTabCallback;
        long j4;
        float f4;
        boolean z3;
        boolean z4;
        float f5;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = (i2 & 1) != 0 ? null : obj;
        List<? extends appendQueryParameters> listEmptyList = (i2 & 2) != 0 ? CollectionsKt.emptyList() : list;
        boolean z5 = (i2 & 4) != 0 ? false : z;
        boolean z6 = (i2 & 8) != 0 ? true : z2;
        setOnQueryTextListener setinputtype = (i2 & 16) != 0 ? new setInputType(0.8f, 0.0f, 0.72f, 0.8f) : setonquerytextlistener;
        float f6 = (i2 & 32) != 0 ? 0.33333334f : f;
        long jIAuthTabCallback2 = (i2 & 64) != 0 ? t7b.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6) : j;
        if ((i2 & 128) != 0) {
            int i6 = onWarmupCompleted + 11;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            if (!(!z5)) {
                int i9 = i7 + 79;
                onWarmupCompleted = i9 % 128;
                f5 = 0.66f;
                if (i9 % 2 == 0) {
                    int i10 = 31 / 0;
                }
            } else {
                f5 = 0.33f;
            }
            f3 = f5;
        } else {
            f3 = f2;
        }
        if ((i2 & 256) != 0) {
            int i11 = onWarmupCompleted + 125;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            jIAuthTabCallback = t7b.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jIAuthTabCallback = j2;
        }
        long j5 = (i2 & 512) != 0 ? 0L : j3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1015039042, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.overlay.rememberTdsAgreementV4OverlayState (TdsAgreementV4OverlayScreenState.kt:102)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            j4 = jIAuthTabCallback;
            f4 = f3;
            z3 = true;
            objOnMinimized = new jsonObjectFromJsonString(f3, setinputtype, f6, jIAuthTabCallback2, j4, listEmptyList, j5, z6, z5, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        } else {
            int i13 = onExtraCallback + 19;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            j4 = jIAuthTabCallback;
            f4 = f3;
            z3 = true;
        }
        jsonObjectFromJsonString jsonobjectfromjsonstring = (jsonObjectFromJsonString) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(jsonobjectfromjsonstring);
        boolean z7 = ((((i & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(listEmptyList)) && (i & 48) != 32) ? false : z3;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z7) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new onNavigationEvent(jsonobjectfromjsonstring, listEmptyList, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(listEmptyList, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(jsonobjectfromjsonstring);
        if ((((29360128 & i) ^ 12582912) <= 8388608 || !cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f4)) && (i & 12582912) != 8388608) {
            z4 = false;
        } else {
            int i15 = onWarmupCompleted + 5;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            z4 = z3;
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent3 | z4) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new onExtraCallbackWithResult(jsonobjectfromjsonstring, f4, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f4), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 21) & 14);
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j4);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(jsonobjectfromjsonstring);
        long j6 = j4;
        boolean z8 = ((((234881024 & i) ^ 100663296) <= 67108864 || !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j6)) && (i & 100663296) != 67108864) ? false : z3;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent4 | z8) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized4 = new onExtraCallback(jsonobjectfromjsonstring, j6, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(setbyteorderOnNavigationEvent, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, (i >> 24) & 14);
        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(jsonobjectfromjsonstring);
        long j7 = j5;
        boolean z9 = ((((1879048192 & i) ^ 805306368) > 536870912 && cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j7)) || (i & 805306368) == 536870912) ? z3 : false;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent5 | z9) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized5 = new onWarmupCompleted(jsonobjectfromjsonstring, j7, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Long.valueOf(j7), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, (i >> 27) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i17 = onExtraCallback + 101;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jsonobjectfromjsonstring;
    }
}
