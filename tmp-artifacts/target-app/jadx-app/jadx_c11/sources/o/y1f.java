package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.quickstart.TdsErrorPageV1$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1f {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    public static final y1f onExtraCallbackWithResult;
    private static onNavigationEvent onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        y1f y1fVar = (y1f) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1fVar, function0, function02, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = onExtraCallback + 19;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Integer numValueOf = Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i6 != 0) {
            onNavigationEvent(new Object[]{y1fVar, function0, function02, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, -326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        } else {
            onNavigationEvent(new Object[]{y1fVar, function0, function02, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, -326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 97;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            access100(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess100 = access100(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    private static final Unit onExtraCallback(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        y1fVar.onWarmupCompleted(function0, function02, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 85;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(new Object[]{function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, 198883913, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -198883912, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 99;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            onWarmupCompleted(y1fVar, function0, function02, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(y1fVar, function0, function02, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 95;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i;
        int i9 = ~(i8 | i5);
        int i10 = ~(i8 | i2);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = (~((~i2) | i8 | i5)) | (~(i8 | i12 | i2));
        int i14 = i10 | (~(i12 | i));
        int i15 = i + i5 + i4 + ((-1696018712) * i3) + (2108813197 * i6);
        int i16 = i15 * i15;
        int i17 = ((i * 362004572) - 1408384217) + (i5 * 362004174) + (i11 * (-398)) + (i13 * 199) + (i14 * 199) + (362004373 * i4) + ((-1290304248) * i3) + (155295761 * i6) + (i16 * (-60686336));
        int i18 = ((212195308 * i) - 2121662464) + (1221732374 * i5) + (1009537066 * i11) + (i13 * (-504768533)) + ((-504768533) * i14) + (716963840 * i4) + (39845888 * i3) + (227278848 * i6) + ((-1705377792) * i16) + (i17 * i17 * (-1680474112));
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        Function0<Unit> function0 = (Function0) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            int i20 = onExtraCallback + 91;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i22 = onExtraCallback + 63;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            iIntValue |= i7;
            int i24 = onWarmupCompleted + 89;
            onExtraCallback = i24 % 128;
            int i25 = i24 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1635004874, iIntValue, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.BadRequest.<anonymous> (TdsErrorPageV1.kt:150)");
                int i26 = onWarmupCompleted + 89;
                onExtraCallback = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 4 / 2;
                }
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_400_cta, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, iIntValue & 14, 774);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i28 = onExtraCallback + 3;
                onWarmupCompleted = i28 % 128;
                int i29 = i28 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(y1fVar, function0, function02, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 75;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 92 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
        int i6 = onWarmupCompleted + 27;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnTransact;
    }

    private static final Unit onWarmupCompleted(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        y1fVar.onExtraCallback(function0, function02, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 33;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private y1f() {
    }

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new y1f();
        onNavigationEvent = onNavigationEvent.Companion.onWarmupCompleted();
        int i = onTransact + 31;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onNavigationEvent = onnavigationevent;
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public interface onNavigationEvent {
        public static final C0076onNavigationEvent Companion = C0076onNavigationEvent.IAuthTabCallback;

        /* renamed from: o.y1f$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0076onNavigationEvent {
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            static final /* synthetic */ C0076onNavigationEvent IAuthTabCallback = new C0076onNavigationEvent();
            private static final onNavigationEvent onWarmupCompleted = new onWarmupCompleted();

            private C0076onNavigationEvent() {
            }

            /* renamed from: o.y1f$onNavigationEvent$onNavigationEvent$onWarmupCompleted */
            public static final class onWarmupCompleted implements onNavigationEvent {
                onWarmupCompleted() {
                }
            }

            static {
                int i = onExtraCallbackWithResult + 41;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public final onNavigationEvent onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                onNavigationEvent onnavigationevent = onWarmupCompleted;
                int i5 = i3 + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 41;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - Process.getGidForName("")), ExpandableListView.getPackedPositionType(0L) + 84, Gravity.getAbsoluteGravity(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14185), TextUtils.indexOf("", "") + 19, 8808 - (Process.myPid() >> 22), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 97;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2 == 0 ? 2 : 4;
            i2 = i | i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onWarmupCompleted + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1633113650, i2, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.InternalServerError.<anonymous> (TdsErrorPageV1.kt:97)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_500_cta, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onWarmupCompleted + 125;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 121) == 0) {
                int i6 = onExtraCallback + 89;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 64 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ^ true ? 2 : 4;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i8 = onExtraCallback + 65;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1288197905, i3, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.InternalServerError.<anonymous> (TdsErrorPageV1.kt:107)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_500_secondary, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Weak, setCallToAction.onWarmupCompleted.Dark, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i3 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r1
      0x0045: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1
      0x003a: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 27;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(3889395);
            if ((i & 99) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(3889395);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i8 = onWarmupCompleted + 11;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 63 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            int i10 = onExtraCallback + 123;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (i7 != 0) {
                int i12 = onExtraCallback + 115;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(3889395, i3, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.InternalServerError (TdsErrorPageV1.kt:91)");
            }
            Object[] objArr = new Object[1];
            a(new char[]{8797, 41590, 8757, 9033, 48724, 37094, 18165, 9864, 59838, 23608, 4670, 55879, 46350, 26630, 57280, 37356, 16516, 14209, 60191, 17788, 3186, 49953, 46898, 30870, 56292, 36527, 31998, 11291, 59225, 23071, 2052, 57397, 45762, 25032, 54680, 38843, 32498, 11623, 57648, 19262, 2683, 63683, 44710, 32453, 53650, 33920, 31296, 12918, 40202, 20487, 1948, 59883, 43250, 8124, 54180, 40214, 29821, 11052, 40758}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr[0]).intern()), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_500_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_500_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), quirksExternalSyntheticBackport02, ForwardingCameraControl.onExtraCallback(1633113650, true, new TdsErrorPageV1$.ExternalSyntheticLambda0(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(1288197905, true, new TdsErrorPageV1$.ExternalSyntheticLambda1(function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 7168) | 221184, 448);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i13 = onWarmupCompleted + 3;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsErrorPageV1$.ExternalSyntheticLambda2(this, function0, function02, quirksExternalSyntheticBackport03, i, i2));
        }
    }

    private static final Unit asInterface(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i5 = onExtraCallback + 87;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onExtraCallback + 37;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = onWarmupCompleted + 55;
            onExtraCallback = i9 % 128;
            Object obj = null;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(846169719, i2, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.BadRequest.<anonymous> (TdsErrorPageV1.kt:160)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_400_secondary, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Weak, setCallToAction.onWarmupCompleted.Dark, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 109;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1995276715);
        if ((i & 6) == 0) {
            int i7 = onWarmupCompleted + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i9 = onWarmupCompleted + 3;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                int i11 = onExtraCallback + 91;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i13 = onExtraCallback + 39;
                onWarmupCompleted = i13 % 128;
                i4 = i13 % 2 != 0 ? 109 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            if ((i3 & 147) == 146) {
                int i15 = onExtraCallback + 15;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1995276715, i3, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.BadRequest (TdsErrorPageV1.kt:144)");
                }
                Object[] objArr = new Object[1];
                a(new char[]{7412, 47193, 7324, 1412, 33423, 35529, 24632, 6739, 55063, 17943, 13555, 59036, 35751, 29225, 63757, 44343, 32301, 11694, 52690, 31143, 13019, 55566, 37375, 17485, 58701, 38016, 23091, 4288, 55792, 16432, 11977, 56558, 35947, 31719, 62293, 43872, 16475, 14152, 51197, 30693, 13521, 58012, 34917, 16926, 61222, 40632, 23704, 3766, 41910, 18979, 8530, 54563, 38490, 1434}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
                y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr[0]).intern()), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_400_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_400_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(-1635004874, true, new TdsErrorPageV1$.ExternalSyntheticLambda6(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(846169719, true, new TdsErrorPageV1$.ExternalSyntheticLambda7(function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 7168) | 221184, 448);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onExtraCallback + 35;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i19 = onWarmupCompleted + 19;
                onExtraCallback = i19 % 128;
                int i20 = i19 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsErrorPageV1$.ExternalSyntheticLambda8(this, function0, function02, quirksExternalSyntheticBackport02, i, i2));
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStubProxy(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 42) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    i2 = 4;
                } else {
                    int i6 = onExtraCallback + 37;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 7;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-477334991, i3, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.NotFound.<anonymous> (TdsErrorPageV1.kt:203)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-477334991, i3, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.NotFound.<anonymous> (TdsErrorPageV1.kt:203)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_cta, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i3 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onExtraCallback + 45;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z = true;
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 2;
            } else {
                int i7 = onWarmupCompleted + 49;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onExtraCallback + 119;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 59;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-304920910, i2, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.NotFound.<anonymous> (TdsErrorPageV1.kt:213)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-304920910, i2, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.NotFound.<anonymous> (TdsErrorPageV1.kt:213)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_secondary, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, function0, setCallToAction.onExtraCallback.Weak, setCallToAction.onWarmupCompleted.Dark, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 55;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int i;
        int i2;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        y1f y1fVar = (y1f) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[3];
        int i3 = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-571564528);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i5 = onWarmupCompleted + 97;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i7 = onWarmupCompleted + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
        }
        int i9 = iIntValue2 & 4;
        if (i9 == 0) {
            if ((iIntValue & 384) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 256 : 128) | i;
            }
            if ((i2 & 147) == 146) {
                int i10 = onWarmupCompleted + 77;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i9 != 0) {
                    int i12 = onExtraCallback + 101;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 != 0) {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        int i13 = 3 / 0;
                    } else {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    }
                    onextracallback2 = onextracallback;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-571564528, i2, -1, "im.toss.tds.compose.component.quickstart.TdsErrorPageV1.NotFound (TdsErrorPageV1.kt:197)");
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{7412, 47193, 7324, 1412, 33423, 35529, 24632, 6739, 55063, 17943, 13555, 59036, 35751, 29225, 63757, 44343, 32301, 11694, 52690, 31143, 13019, 55566, 37375, 17485, 58701, 38016, 23091, 4288, 55792, 16432, 11977, 56558, 35947, 31719, 62293, 43872, 16475, 14152, 51197, 30693, 13521, 58012, 34917, 16926, 61222, 40632, 23704, 3766, 41910, 18979, 8530, 54563, 38490, 1434}, TextUtils.getOffsetBefore("", 0), objArr2);
                y1h.onNavigationEvent(deprecated_authenticator.onExtraCallback(((String) objArr2[0]).intern()), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.error_page_404_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), onextracallback2, ForwardingCameraControl.onExtraCallback(-477334991, true, new TdsErrorPageV1$.ExternalSyntheticLambda3(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-304920910, true, new TdsErrorPageV1$.ExternalSyntheticLambda4(function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 7168) | 221184, 448);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsErrorPageV1$.ExternalSyntheticLambda5(y1fVar, function0, function02, onextracallback3, iIntValue, iIntValue2));
            return null;
        }
        int i14 = onWarmupCompleted + 25;
        onExtraCallback = i14 % 128;
        i = i14 % 2 == 0 ? i | 31055 : i | 384;
        i2 = i;
        if ((i2 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback32 = onextracallback2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(new Object[]{function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1262183775, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1262183777, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1f y1fVar, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onNavigationEvent(new Object[]{y1fVar, function0, function02, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, -1989505814, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1989505817, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit asBinder(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(new Object[]{function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 198883913, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -198883912, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onNavigationEvent(new Object[]{this, function0, function02, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, -326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 326088687, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 1668102938037602792L;
    }
}
