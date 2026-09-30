package o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.decrementVideoUsage;
import o.isInVideoUsage;
import o.v4;
import o.v5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v5 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static final Unit onExtraCallback(boolean z, v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, Float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(z, onextracallbackwithresult, function1, f, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, Float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(z, onextracallbackwithresult, function1, f, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, Float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, onextracallbackwithresult, function1, f, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(boolean z, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallback = onExtraCallback(z, brickModuleImplExternalSyntheticLambda2, isinvideousage);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return decrementvideousageOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, Float f, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, onextracallbackwithresult, function1, f, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 72 / 0;
        }
        return unitOnExtraCallback;
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ BrickModuleImplExternalSyntheticLambda2 onExtraCallback;

        public IAuthTabCallback(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2) {
            this.onExtraCallback = brickModuleImplExternalSyntheticLambda2;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.onWarmupCompleted();
            if (!(!this.onExtraCallback.isShowing())) {
                this.onExtraCallback.dismiss();
            }
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ BrickModuleImplExternalSyntheticLambda2 $dialog;
        final /* synthetic */ Float $maxHeightRatio;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Float f, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$maxHeightRatio = f;
            this.$dialog = brickModuleImplExternalSyntheticLambda2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$maxHeightRatio, this.$dialog, access13800Var);
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 119;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return objIAuthTabCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Float f = this.$maxHeightRatio;
            if (f != null) {
                int i4 = onNavigationEvent + 125;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                this.$dialog.onWarmupCompleted(f.floatValue());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ BrickModuleImplExternalSyntheticLambda2 $dialog;
        final /* synthetic */ Function1<v4.onExtraCallback, Unit> $onDismissRequest;
        final /* synthetic */ v4.onExtraCallbackWithResult $properties;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, v4.onExtraCallbackWithResult onextracallbackwithresult, Function1<? super v4.onExtraCallback, Unit> function1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$dialog = brickModuleImplExternalSyntheticLambda2;
            this.$properties = onextracallbackwithresult;
            this.$onDismissRequest = function1;
        }

        public static /* synthetic */ boolean onNavigationEvent(v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, function1, i);
            int i5 = IAuthTabCallback + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return zOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$dialog, this.$properties, this.$onDismissRequest, access13800Var);
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2 = this.$dialog;
            final v4.onExtraCallbackWithResult onextracallbackwithresult = this.$properties;
            final Function1<v4.onExtraCallback, Unit> function1 = this.$onDismissRequest;
            brickModuleImplExternalSyntheticLambda2.onExtraCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.compat.bottomsheet.TdsBottomSheetV2Kt$TdsBottomSheetV2$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 123;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(v5.onExtraCallback.onNavigationEvent(onextracallbackwithresult, function1, ((Integer) obj2).intValue()));
                    int i7 = onWarmupCompleted + 23;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        return boolValueOf;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            this.$dialog.onNavigationEvent(0, this.$properties.onExtraCallback());
            this.$dialog.onNavigationEvent(1, this.$properties.onNavigationEvent());
            this.$dialog.onNavigationEvent(2, this.$properties.onExtraCallbackWithResult());
            this.$dialog.onNavigationEvent(-1, this.$properties.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return unit;
        }

        private static final boolean onWarmupCompleted(v4.onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                onextracallbackwithresult.onExtraCallbackWithResult(i);
                throw null;
            }
            if (!onextracallbackwithresult.onExtraCallbackWithResult(i)) {
                return false;
            }
            function1.invoke(v4.onExtraCallback.Companion.IAuthTabCallback(i));
            int i4 = IAuthTabCallback + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $bottomSheetState;
        final /* synthetic */ Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> $content;
        final /* synthetic */ BrickModuleImplExternalSyntheticLambda2 $dialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$bottomSheetState = z;
            this.$dialog = brickModuleImplExternalSyntheticLambda2;
            this.$content = function2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$bottomSheetState, this.$dialog, this.$content, access13800Var);
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 59 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$bottomSheetState) {
                int i3 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.$dialog.onNavigationEvent(this.$content);
                int i5 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 4;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r0
      0x0045: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r0
      0x003a: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(final boolean z, @Nullable v4.onExtraCallbackWithResult onextracallbackwithresult, @NotNull final Function1<? super v4.onExtraCallback, Unit> function1, @Nullable Float f, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        v4.onExtraCallbackWithResult onextracallbackwithresult2;
        int i4;
        Float f2;
        boolean z2;
        final v4.onExtraCallbackWithResult onextracallbackwithresult3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function22;
        boolean z3;
        int i5;
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2048619231);
            if ((i & 124) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2048619231);
            if ((i & 6) == 0) {
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            int i9 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i9 % 128;
            i3 = i9 % 2 == 0 ? i3 | 24 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                int i10 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                onextracallbackwithresult2 = onextracallbackwithresult;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                int i12 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    f2 = f;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(f2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                        int i14 = onExtraCallbackWithResult + 35;
                        onNavigationEvent = i14 % 128;
                        i5 = i14 % 2 == 0 ? 24803 : 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    int i15 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i15 % 128;
                    z2 = i15 % 2 == 0;
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1))) {
                    Object obj = null;
                    v4.onExtraCallbackWithResult onextracallbackwithresult4 = i8 != 0 ? new v4.onExtraCallbackWithResult(false, 1, (DefaultConstructorMarker) null) : onextracallbackwithresult2;
                    if (i4 != 0) {
                        f2 = null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2048619231, i3, -1, "im.toss.tds.compose.component.compound.compat.bottomsheet.TdsBottomSheetV2 (TdsBottomSheetV2.kt:77)");
                    }
                    Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                    if (activityIAuthTabCallback == null) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i16 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i16 % 128;
                            if (i16 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                obj.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final v4.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult4;
                            final Float f3 = f2;
                            function22 = new Function2() { // from class: im.toss.tds.compose.component.compound.compat.bottomsheet.TdsBottomSheetV2Kt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i17 = 2 % 2;
                                    int i18 = IAuthTabCallback + 15;
                                    onExtraCallback = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        return v5.onWarmupCompleted(z, onextracallbackwithresult5, function1, f3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    }
                                    v5.onWarmupCompleted(z, onextracallbackwithresult5, function1, f3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function22);
                            return;
                        }
                        return;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2 = new BrickModuleImplExternalSyntheticLambda2(activityIAuthTabCallback);
                        brickModuleImplExternalSyntheticLambda2.setCanceledOnTouchOutside(false);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(brickModuleImplExternalSyntheticLambda2);
                        obj2 = brickModuleImplExternalSyntheticLambda2;
                    }
                    final BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda22 = (BrickModuleImplExternalSyntheticLambda2) obj2;
                    boolean z4 = (i3 & 7168) == 2048;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(brickModuleImplExternalSyntheticLambda22);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z4 | zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new onExtraCallbackWithResult(f2, brickModuleImplExternalSyntheticLambda22, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    int i17 = i3 >> 9;
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(f2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i17 & 14);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(brickModuleImplExternalSyntheticLambda22);
                    if ((i3 & 112) == 32) {
                        int i18 = onExtraCallbackWithResult + 105;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z5 = (i3 & 896) == 256;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z5 | zOnExtraCallback2 | z3) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new onExtraCallback(brickModuleImplExternalSyntheticLambda22, onextracallbackwithresult4, function1, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(onextracallbackwithresult4, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14);
                    int i20 = i3 & 14;
                    boolean z6 = i20 == 4;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(brickModuleImplExternalSyntheticLambda22);
                    boolean z7 = (i3 & 57344) == 16384;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z7 | z6 | zOnExtraCallback3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new onWarmupCompleted(z, brickModuleImplExternalSyntheticLambda22, function2, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        int i21 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(Boolean.valueOf(z), function2, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i17 & 112) | i20);
                    boolean z8 = i20 == 4;
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(brickModuleImplExternalSyntheticLambda22);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback4 | z8) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.compound.compat.bottomsheet.TdsBottomSheetV2Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj3) {
                                int i23 = 2 % 2;
                                int i24 = onNavigationEvent + 37;
                                IAuthTabCallback = i24 % 128;
                                int i25 = i24 % 2;
                                decrementVideoUsage decrementvideousageOnNavigationEvent = v5.onNavigationEvent(z, brickModuleImplExternalSyntheticLambda22, (isInVideoUsage) obj3);
                                int i26 = onNavigationEvent + 35;
                                IAuthTabCallback = i26 % 128;
                                if (i26 % 2 != 0) {
                                    int i27 = 72 / 0;
                                }
                                return decrementvideousageOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(Boolean.valueOf(z), (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i20);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    onextracallbackwithresult3 = onextracallbackwithresult4;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    onextracallbackwithresult3 = onextracallbackwithresult2;
                }
                final Float f4 = f2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function22 = new Function2() { // from class: im.toss.tds.compose.component.compound.compat.bottomsheet.TdsBottomSheetV2Kt$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i23 = 2 % 2;
                            int i24 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitOnNavigationEvent = v5.onNavigationEvent(z, onextracallbackwithresult3, function1, f4, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i26 = onWarmupCompleted + 95;
                            onExtraCallbackWithResult = i26 % 128;
                            int i27 = i26 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function22);
                    return;
                }
                return;
            }
            i3 |= 3072;
            f2 = f;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) != 9362) {
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1))) {
            }
            final Float f42 = f2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        onextracallbackwithresult2 = onextracallbackwithresult;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        f2 = f;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1))) {
        }
        final Float f422 = f2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final decrementVideoUsage onExtraCallback(boolean z, BrickModuleImplExternalSyntheticLambda2 brickModuleImplExternalSyntheticLambda2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        if (z) {
            if (!brickModuleImplExternalSyntheticLambda2.isShowing()) {
                int i4 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    brickModuleImplExternalSyntheticLambda2.onContentChanged();
                    brickModuleImplExternalSyntheticLambda2.show();
                    throw null;
                }
                brickModuleImplExternalSyntheticLambda2.onContentChanged();
                brickModuleImplExternalSyntheticLambda2.show();
            }
        } else if (brickModuleImplExternalSyntheticLambda2.isShowing()) {
            brickModuleImplExternalSyntheticLambda2.dismiss();
        }
        return new IAuthTabCallback(brickModuleImplExternalSyntheticLambda2);
    }
}
