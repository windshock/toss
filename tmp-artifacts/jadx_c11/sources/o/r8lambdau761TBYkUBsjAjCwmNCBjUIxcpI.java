package o;

import im.toss.features.tosscert.ui.R;
import im.toss.rn.toss.core.portal.MonoHermesFlagSessionObserver$;
import im.toss.splittarget.spec.fsm.AppState;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI {
    private static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final AppState onExtraCallbackWithResult;
    private final AtomicBoolean onWarmupCompleted;

    static {
        int i = onNavigationEvent + 95;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI r8lambdau761tbykubsjajcwmncbjuixcpi = (r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI) objArr[0];
        AppState.State state = (AppState.State) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(r8lambdau761tbykubsjajcwmncbjuixcpi, state);
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function1, obj);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(function1, obj);
        int i3 = IAuthTabCallback + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            onNavigationEvent(R.drawable.IAuthTabCallback(), 1139493211, iIAuthTabCallback, -1139493211, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
            throw null;
        }
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), 1139493211, iIAuthTabCallback3, -1139493211, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), iIAuthTabCallback4);
        int i3 = onExtraCallback + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AppState.State state) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(state);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i2);
        int i11 = i9 | i10 | (~(i4 | i3));
        int i12 = i8 | i4;
        int i13 = (~((~i3) | i4)) | i10;
        int i14 = i4 + i2 + i6 + (111814883 * i) + (1975835455 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i2) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i) + (1432616960 * i5) + (442957824 * i15);
        int i17 = ((i4 * 961080817) - 60187382) + (i2 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i * 1618335983) + (i5 * 193609403) + (i15 * 1988296704);
        return i16 + ((i17 * i17) * 176226304) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }

    @Inject
    public r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI(@NotNull AppState appState) {
        Intrinsics.checkNotNullParameter(appState, "");
        this.onExtraCallbackWithResult = appState;
        this.onWarmupCompleted = new AtomicBoolean(false);
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted.compareAndSet(false, true)) {
            onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback(false));
            int i4 = onExtraCallback + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = IAuthTabCallback + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(AppState.State state) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        boolean zAreEqual = Intrinsics.areEqual(state, AppState.State.Terminate.onExtraCallbackWithResult);
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit IAuthTabCallback(r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI r8lambdau761tbykubsjajcwmncbjuixcpi, AppState.State state) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult.onWarmupCompleted();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj)) {
            int i4 = IAuthTabCallback + 51;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Result.exceptionOrNull-impl(obj);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    public final deserializeUriNullableCollection onExtraCallback(@NotNull JsonReaderUnknownNumberParsing<AppState.State> jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsing.onWarmupCompleted(new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda1(new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda0())).onWarmupCompleted(new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda3(new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda2(this)), new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda5(new MonoHermesFlagSessionObserver$.ExternalSyntheticLambda4()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return deserializeurinullablecollectionOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdau761TBYkUBsjAjCwmNCBjUIxcpI r8lambdau761tbykubsjajcwmncbjuixcpi, AppState.State state) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), 707997147, iIAuthTabCallback, -707997146, new Object[]{r8lambdau761tbykubsjajcwmncbjuixcpi, state}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), 1139493211, iIAuthTabCallback, -1139493211, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2);
    }
}
