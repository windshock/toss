package o;

import im.toss.features.alltab.feature.total_service.feature.common.transition.ScaleTransitionExtensionsKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onCapsuleReady {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i4 | i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i4);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i4) | (~i5)));
        int i13 = i4 + i5 + i + (1699743442 * i3) + (2071835342 * i6);
        int i14 = i13 * i13;
        int i15 = ((i4 * (-557635572)) - 1375207424) + ((-557635572) * i5) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i) + ((-648019968) * i3) + ((-1801453568) * i6) + (1296564224 * i14);
        int i16 = ((i4 * (-355764420)) - 259725689) + (i5 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i * (-355763899)) + (i3 * 2119243930) + (i6 * (-943812730)) + (i14 * (-597164032));
        return i15 + ((i16 * i16) * 58195968) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static final /* synthetic */ void onExtraCallback(AtomicBoolean atomicBoolean, Ref.ObjectRef objectRef, Function0 function0, Function0 function02) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(atomicBoolean, objectRef, function0, function02);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback();
        int i3 = onExtraCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(findResAndMsg findresandmsg, boolean z, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 99;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 33;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = new ScaleTransitionExtensionsKt$.ExternalSyntheticLambda0();
        }
        if ((i & 8) != 0) {
            function02 = new ScaleTransitionExtensionsKt$.ExternalSyntheticLambda1();
        }
        if ((i & 16) != 0) {
            function03 = new ScaleTransitionExtensionsKt$.ExternalSyntheticLambda2();
        }
        onWarmupCompleted(findresandmsg, z, function0, function02, function03);
    }

    private static final Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onWarmupCompleted(@NotNull findResAndMsg findresandmsg, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            setForeground.onExtraCallback.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        startWork startworkOnExtraCallbackWithResult = setForeground.onExtraCallback.onExtraCallbackWithResult();
        if (z || startworkOnExtraCallbackWithResult == null || !startworkOnExtraCallbackWithResult.ICustomTabsService()) {
            function0.invoke();
            function03.invoke();
            return;
        }
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Function0 function04 = (Function0) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{startworkOnExtraCallbackWithResult}, iOnExtraCallback2, -1666755789);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        function02.invoke();
        function0.invoke();
        startworkOnExtraCallbackWithResult.onExtraCallbackWithResult(new onExtraCallback(atomicBoolean, objectRef, function04, function03));
        objectRef.element = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(startworkOnExtraCallbackWithResult, atomicBoolean, objectRef, function04, function03, (access13800) null), 3, (Object) null);
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onExtraCallbackWithResult(AtomicBoolean atomicBoolean, Ref.ObjectRef<getPackageType> objectRef, Function0<Unit> function0, Function0<Unit> function02) {
        int i = 2 % 2;
        if (atomicBoolean.compareAndSet(false, true)) {
            getPackageType getpackagetype = (getPackageType) objectRef.element;
            Object obj = null;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
            if (function0 != null) {
                int i2 = onExtraCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    function0.invoke();
                    obj.hashCode();
                    throw null;
                }
                function0.invoke();
                int i3 = onExtraCallback + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            function02.invoke();
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Ref.ObjectRef<getPackageType> $completionWatcher;
        final /* synthetic */ AtomicBoolean $didComplete;
        final /* synthetic */ Function0<Unit> $onTransitionEnd;
        final /* synthetic */ Function0<Unit> $previousCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(AtomicBoolean atomicBoolean, Ref.ObjectRef<getPackageType> objectRef, Function0<Unit> function0, Function0<Unit> function02) {
            super(0, Intrinsics.Kotlin.class, "completeTransition", "runAfterTransitionIfNeeded$completeTransition(Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0);
            this.$didComplete = atomicBoolean;
            this.$completionWatcher = objectRef;
            this.$previousCallback = function0;
            this.$onTransitionEnd = function02;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AtomicBoolean atomicBoolean = this.$didComplete;
            if (i3 == 0) {
                onCapsuleReady.onExtraCallback(atomicBoolean, this.$completionWatcher, this.$previousCallback, this.$onTransitionEnd);
            } else {
                onCapsuleReady.onExtraCallback(atomicBoolean, this.$completionWatcher, this.$previousCallback, this.$onTransitionEnd);
                throw null;
            }
        }
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[0], -604746845, 604746845, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return (Unit) IAuthTabCallback(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[0], 56207364, -56207363, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }
}
