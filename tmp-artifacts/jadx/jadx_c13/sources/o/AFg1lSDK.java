package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AFg1lSDK;
import o.HandlerScheduledExecutorService2;
import o.TimeoutCompanionNONE1;
import o.getPreRenderJob;
import o.setUseCaseAttached;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1lSDK extends IoConfigBuilder implements StreamSpecQueryResult {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private Function1<Object, Unit> IAuthTabCallback;
    private final AsyncFunction IAuthTabCallbackDefault;
    private AFg1qSDK asInterface;
    private float onExtraCallback;
    private Function0<Boolean> onExtraCallbackWithResult;
    private Function2<Object, ? super setUseCaseAttached, Unit> onNavigationEvent;
    private Function1<Object, Unit> onWarmupCompleted;

    public /* synthetic */ AFg1lSDK(AFg1qSDK aFg1qSDK, float f, Function0 function0, Function2 function2, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFg1qSDK, f, function0, function2, function1, function12);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = (~(i7 | (~i6) | i2)) | (~(i8 | i7 | i6));
        int i11 = (~(i6 | i2)) | (~(i | i2));
        int i12 = i + i2 + i3 + ((-1520811122) * i5) + (1880343047 * i4);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i) - 1254686720) + (875799021 * i2) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i3) + ((-206831616) * i5) + (408289280 * i4) + ((-683737088) * i13);
        int i15 = ((i * (-660833811)) - 1995073173) + (i2 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i3 * (-660833671)) + (i5 * 644061726) + (i4 * (-2012083377)) + (i13 * (-1027145728));
        return i14 + ((i15 * i15) * 814809088) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, AFg1lSDK aFg1lSDK, Ref.LongRef longRef) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(1340740080, -1340740080, iOnWarmupCompleted5, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{booleanRef, objectRef, aFg1lSDK, longRef}, iOnWarmupCompleted4);
        int i3 = IAuthTabCallbackStub + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, AFg1lSDK aFg1lSDK, Ref.LongRef longRef) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(booleanRef, objectRef, aFg1lSDK, longRef);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.LongRef longRef, float f, AFg1lSDK aFg1lSDK, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(objectRef, booleanRef, longRef, f, aFg1lSDK, handlerScheduledExecutorService2, setusecaseattached);
        int i4 = IAuthTabCallbackStub + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1lSDK aFg1lSDK, Ref.ObjectRef objectRef, Ref.LongRef longRef, Ref.BooleanRef booleanRef, setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(aFg1lSDK, objectRef, longRef, booleanRef, setusecaseattached);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private AFg1lSDK(AFg1qSDK aFg1qSDK, float f, Function0<Boolean> function0, Function2<Object, ? super setUseCaseAttached, Unit> function2, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.asInterface = aFg1qSDK;
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = function0;
        this.onNavigationEvent = function2;
        this.IAuthTabCallback = function1;
        this.onWarmupCompleted = function12;
        this.IAuthTabCallbackDefault = IAuthTabCallback(SequentialExecutorWorkerRunningState.onExtraCallback(new onNavigationEvent()));
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFg1lSDK aFg1lSDK = (AFg1lSDK) objArr[0];
        HighPriorityExecutor highPriorityExecutor = (HighPriorityExecutor) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = aFg1lSDK.onExtraCallbackWithResult(highPriorityExecutor, access13800Var);
        int i4 = IAuthTabCallbackStub + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    static final class onNavigationEvent implements PointerInputEventHandler {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onNavigationEvent() {
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {AFg1lSDK.this, highPriorityExecutor, access13800Var};
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Object objOnExtraCallbackWithResult = AFg1lSDK.onExtraCallbackWithResult(-908317129, 908317130, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, iOnWarmupCompleted);
            if (objOnExtraCallbackWithResult == access14100.onExtraCallback()) {
                return objOnExtraCallbackWithResult;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public final void onNavigationEvent(@NotNull AFg1qSDK aFg1qSDK, float f, @NotNull Function0<Boolean> function0, @NotNull Function2<Object, ? super setUseCaseAttached, Unit> function2, @NotNull Function1<Object, Unit> function1, @NotNull Function1<Object, Unit> function12) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (this.asInterface != aFg1qSDK) {
            int i4 = onTransact + 53;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = onTransact + 71;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        boolean zOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, f);
        this.asInterface = aFg1qSDK;
        this.onExtraCallback = f;
        this.onExtraCallbackWithResult = function0;
        this.onNavigationEvent = function2;
        this.IAuthTabCallback = function1;
        this.onWarmupCompleted = function12;
        if (!z) {
            int i8 = IAuthTabCallbackStub;
            int i9 = i8 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (zOnNavigationEvent) {
                int i10 = i8 + 81;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
        this.IAuthTabCallbackDefault.onExtraCallback();
    }

    public void IAuthTabCallback(@NotNull Futures3 futures3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        long jOnTransact = FuturesCallbackListener.onTransact(futures3);
        if (!setUseCaseAttached.onWarmupCompleted(this.asInterface.onTransact(), jOnTransact)) {
            int i2 = onTransact + 85;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            AFg1qSDK.onExtraCallback(new Object[]{this.asInterface, Long.valueOf(jOnTransact)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1038743611, -1038743607);
        }
        int iAsBinder = (int) futures3.asBinder();
        if (this.asInterface.asInterface() != iAsBinder) {
            int i4 = IAuthTabCallbackStub + 91;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.asInterface.onNavigationEvent(iAsBinder);
        }
    }

    private static final void onWarmupCompleted(Ref.ObjectRef<Object> objectRef, Ref.BooleanRef booleanRef, Ref.LongRef longRef) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        objectRef.element = null;
        booleanRef.element = false;
        longRef.element = setUseCaseAttached.Companion.IAuthTabCallback();
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Object onExtraCallbackWithResult(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = setUseCaseAttached.Companion.IAuthTabCallback();
        final float fOnExtraCallback = highPriorityExecutor.onExtraCallback(this.onExtraCallback);
        Object objOnExtraCallbackWithResult = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallbackWithResult(highPriorityExecutor, new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.DragAndDropContainerNode$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 71;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AFg1lSDK.onWarmupCompleted(this.f$0, objectRef, longRef, booleanRef, (setUseCaseAttached) obj);
                int i5 = onExtraCallback + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, new Function0() { // from class: im.toss.tosssecurities.uikit.dnd.DragAndDropContainerNode$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnNavigationEvent = AFg1lSDK.onNavigationEvent(booleanRef, objectRef, this, longRef);
                    int i4 = 58 / 0;
                } else {
                    unitOnNavigationEvent = AFg1lSDK.onNavigationEvent(booleanRef, objectRef, this, longRef);
                }
                int i5 = onExtraCallback + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, new Function0() { // from class: im.toss.tosssecurities.uikit.dnd.DragAndDropContainerNode$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AFg1lSDK.onWarmupCompleted(booleanRef, objectRef, this, longRef);
                int i5 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.DragAndDropContainerNode$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 7;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return AFg1lSDK.onWarmupCompleted(objectRef, booleanRef, longRef, fOnExtraCallback, this, (HandlerScheduledExecutorService2) obj, (setUseCaseAttached) obj2);
                }
                Unit unitOnWarmupCompleted = AFg1lSDK.onWarmupCompleted(objectRef, booleanRef, longRef, fOnExtraCallback, this, (HandlerScheduledExecutorService2) obj, (setUseCaseAttached) obj2);
                int i4 = 58 / 0;
                return unitOnWarmupCompleted;
            }
        }, access13800Var);
        if (objOnExtraCallbackWithResult != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, java.lang.Object] */
    private static final Unit onExtraCallbackWithResult(AFg1lSDK aFg1lSDK, Ref.ObjectRef objectRef, Ref.LongRef longRef, Ref.BooleanRef booleanRef, setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            if (aFg1lSDK.onExtraCallbackWithResult.invoke().booleanValue()) {
                ?? OnExtraCallbackWithResult = aFg1lSDK.asInterface.onExtraCallbackWithResult(setUseCaseAttached.onNavigationEvent(setusecaseattached.onExtraCallback(), aFg1lSDK.asInterface.onTransact()));
                objectRef.element = OnExtraCallbackWithResult;
                longRef.element = setUseCaseAttached.Companion.IAuthTabCallback();
                if (OnExtraCallbackWithResult != 0) {
                    aFg1lSDK.onNavigationEvent.invoke(OnExtraCallbackWithResult, setusecaseattached);
                    int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                    int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                }
                return Unit.INSTANCE;
            }
            int i3 = onTransact + 11;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            onWarmupCompleted(objectRef, booleanRef, longRef);
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallbackStub + 95;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
        aFg1lSDK.onExtraCallbackWithResult.invoke().booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.LongRef longRef, float f, AFg1lSDK aFg1lSDK, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
        Object obj = objectRef.element;
        if (obj == null) {
            return Unit.INSTANCE;
        }
        handlerScheduledExecutorService2.onExtraCallback();
        if (booleanRef.element) {
            aFg1lSDK.asInterface.onWarmupCompleted(setusecaseattached.onExtraCallback());
        } else {
            long jOnNavigationEvent = setUseCaseAttached.onNavigationEvent(longRef.element, setusecaseattached.onExtraCallback());
            longRef.element = jOnNavigationEvent;
            if (setUseCaseAttached.onWarmupCompleted(jOnNavigationEvent) < f) {
                int i2 = onTransact + 101;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    Unit unit = Unit.INSTANCE;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i3 = onTransact + 63;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }
            if (!aFg1lSDK.asInterface.IAuthTabCallbackStubProxy(obj)) {
                int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                aFg1lSDK.IAuthTabCallback.invoke(obj);
                onWarmupCompleted(objectRef, booleanRef, longRef);
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
            aFg1lSDK.onWarmupCompleted.invoke(obj);
            aFg1lSDK.asInterface.onWarmupCompleted(longRef.element);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
        AFg1lSDK aFg1lSDK = (AFg1lSDK) objArr[2];
        Ref.LongRef longRef = (Ref.LongRef) objArr[3];
        int i = 2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        boolean z = booleanRef.element;
        Object obj = objectRef.element;
        if (booleanRef.element) {
            int i2 = onTransact + 47;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                aFg1lSDK.asInterface.onWarmupCompleted();
                int i3 = 63 / 0;
            } else {
                aFg1lSDK.asInterface.onWarmupCompleted();
            }
        } else if (obj != null) {
            int i4 = IAuthTabCallbackStub + 57;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                aFg1lSDK.IAuthTabCallback.invoke(obj);
            } else {
                aFg1lSDK.IAuthTabCallback.invoke(obj);
                throw null;
            }
        }
        onWarmupCompleted(objectRef, booleanRef, longRef);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, AFg1lSDK aFg1lSDK, Ref.LongRef longRef) {
        int i = 2 % 2;
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        boolean z = booleanRef.element;
        Object obj = objectRef.element;
        if (booleanRef.element) {
            int i2 = IAuthTabCallbackStub + 17;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            aFg1lSDK.asInterface.onNavigationEvent();
        } else if (obj != null) {
            aFg1lSDK.IAuthTabCallback.invoke(obj);
            int i4 = onTransact + 101;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        onWarmupCompleted(objectRef, booleanRef, longRef);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ Object IAuthTabCallback(AFg1lSDK aFg1lSDK, HighPriorityExecutor highPriorityExecutor, access13800 access13800Var) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return onExtraCallbackWithResult(-908317129, 908317130, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{aFg1lSDK, highPriorityExecutor, access13800Var}, iOnWarmupCompleted);
    }

    private static final Unit onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, AFg1lSDK aFg1lSDK, Ref.LongRef longRef) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1340740080, -1340740080, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{booleanRef, objectRef, aFg1lSDK, longRef}, iOnWarmupCompleted);
    }
}
