package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.addLinks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class createListItemDetailSubSpannedString {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ List<appendQueryParameters> $screenStates;
        final /* synthetic */ createListItemDetailSpannedString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(createListItemDetailSpannedString createlistitemdetailspannedstring, List<? extends appendQueryParameters> list, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = createlistitemdetailspannedstring;
            this.$screenStates = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$screenStates, access13800Var);
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallback(this.$screenStates);
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ float $contentsMaxHeightRatio;
        final /* synthetic */ createListItemDetailSpannedString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(createListItemDetailSpannedString createlistitemdetailspannedstring, float f, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = createlistitemdetailspannedstring;
            this.$contentsMaxHeightRatio = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$contentsMaxHeightRatio, access13800Var);
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(this.$contentsMaxHeightRatio);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ createListItemDetailSpannedString $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(createListItemDetailSpannedString createlistitemdetailspannedstring, long j, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = createlistitemdetailspannedstring;
            this.$backgroundColor = j;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$backgroundColor, access13800Var);
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                this.$state.onWarmupCompleted(this.$backgroundColor);
                return Unit.INSTANCE;
            }
            this.$state.onWarmupCompleted(this.$backgroundColor);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defaultIfEmpty onExtraCallback(@NotNull addLinks.IAuthTabCallback iAuthTabCallback, float f, long j, @Nullable List<? extends appendQueryParameters> list, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        float f2 = (i2 & 2) != 0 ? 1.0f : f;
        long jOnWarmupCompleted = (i2 & 4) != 0 ? onWarmupCompleted(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 14) : j;
        List<? extends appendQueryParameters> listEmptyList = (i2 & 8) != 0 ? CollectionsKt.emptyList() : list;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(419113954, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.rememberTdsAgreementV4ScreenState (TdsAgreementV4ScreenState.kt:65)");
        }
        boolean z3 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback)) || (i & 6) == 4;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z3) {
            int i4 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                createListItemDetailSpannedString createlistitemdetailspannedstring = new createListItemDetailSpannedString(f2, listEmptyList, jOnWarmupCompleted, iAuthTabCallback, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(createlistitemdetailspannedstring);
                objOnMinimized = createlistitemdetailspannedstring;
            }
        }
        createListItemDetailSpannedString createlistitemdetailspannedstring2 = (createListItemDetailSpannedString) objOnMinimized;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(createlistitemdetailspannedstring2);
        if (((i & 7168) ^ 3072) > 2048) {
            int i6 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(listEmptyList)) {
                z = (i & 3072) == 2048;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z)) {
            int i8 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new IAuthTabCallback(createlistitemdetailspannedstring2, listEmptyList, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(listEmptyList, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 9) & 14);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(createlistitemdetailspannedstring2);
        if ((((i & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) && (i & 48) != 32) {
            int i10 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            z2 = true;
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent2 | z2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new onNavigationEvent(createlistitemdetailspannedstring2, f2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f2), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jOnWarmupCompleted);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(createlistitemdetailspannedstring2);
        boolean z4 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnWarmupCompleted)) || (i & 384) == 256;
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent3 | z4)) {
            int i12 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new onWarmupCompleted(createlistitemdetailspannedstring2, jOnWarmupCompleted, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(setbyteorderOnNavigationEvent, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i15 != 0) {
                int i16 = 92 / 0;
            }
        }
        return createlistitemdetailspannedstring2;
    }

    private static final long onWarmupCompleted(addLinks.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1805066171, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.defaultBackgroundColor (TdsAgreementV4ScreenState.kt:92)");
        }
        if (Intrinsics.areEqual(iAuthTabCallback, addLinks.IAuthTabCallback.onExtraCallback.onWarmupCompleted)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(498202643);
            jOnNavigationEvent = ((Long) u7.onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 585339600, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -585339599, new Object[]{u7.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6})).longValue();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(498204310);
            jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return jOnNavigationEvent;
    }
}
