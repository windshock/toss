package o;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFd1wSDK1;
import o.AFd1wSDKExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDKExternalSyntheticLambda0 implements r8lambdaqCQJz0WTiGcBg92EEpExj0ZOE {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final AppSetIdAndScope1 IAuthTabCallback;
    private final AFd1wSDKExternalSyntheticLambda3 onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = (AFd1wSDKExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, aFd1wSDKExternalSyntheticLambda0);
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(aFd1wSDKExternalSyntheticLambda0, str, z);
        }
        onExtraCallback(aFd1wSDKExternalSyntheticLambda0, str, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(aFd1wSDKExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(aFd1wSDKExternalSyntheticLambda0, str);
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str, str2}, iOnExtraCallback3, -1122647334, 1122647337);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~((~i) | i8 | i6);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i6);
        int i13 = (~(i | i7)) | (~(i7 | i5)) | i10;
        int i14 = i6 + i5 + i2 + (1787548100 * i4) + (1101416392 * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-930662234)) + 656878810 + (i5 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + ((-930661477) * i2) + (2052861356 * i4) + (749768216 * i3) + (i15 * (-2028863488));
        int i17 = (((-61410478) * i6) - 623378432) + (561581232 * i5) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i2) + ((-778043392) * i4) + ((-46137344) * i3) + (324403200 * i15) + (i16 * i16 * (-1850081280));
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 4) {
            return i17 != 5 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }
        int i18 = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(((AFd1wSDKExternalSyntheticLambda0) objArr[0]).onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallbackDefault(null, (String) objArr[1], null, null, 13, null), (String) objArr[2], false, 0L, 12, null);
        Unit unit = Unit.INSTANCE;
        int i19 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = (AFd1wSDKExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(str, aFd1wSDKExternalSyntheticLambda0);
        }
        onTransact(str, aFd1wSDKExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, String str3, Map map, String str4, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, long j, String str5) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, map, str4, aFd1wSDKExternalSyntheticLambda0, j, str5);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(str, aFd1wSDKExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(aFd1wSDKExternalSyntheticLambda0, z);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, aFd1wSDKExternalSyntheticLambda0}, iOnExtraCallback3, 1152877020, -1152877018);
            int i3 = 26 / 0;
        } else {
            int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback5 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback6 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback4, iOnExtraCallback5, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, aFd1wSDKExternalSyntheticLambda0}, iOnExtraCallback6, 1152877020, -1152877018);
        }
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0, str);
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str, str2}, iOnExtraCallback3, -1089072773, 1089072777);
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str}, iOnExtraCallback3, -486885300, 486885305);
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0, str, str2);
        }
        IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0, str, str2);
        throw null;
    }

    public AFd1wSDKExternalSyntheticLambda0(@NotNull AFd1wSDKExternalSyntheticLambda3 aFd1wSDKExternalSyntheticLambda3) {
        Intrinsics.checkNotNullParameter(aFd1wSDKExternalSyntheticLambda3, "");
        this.onExtraCallback = aFd1wSDKExternalSyntheticLambda3;
        this.IAuthTabCallback = ea10.onExtraCallbackWithResult(Reflection.getOrCreateKotlinClass(AFd1wSDKExternalSyntheticLambda0.class).getSimpleName());
    }

    public void IAuthTabCallback(final boolean z) {
        int i = 2 % 2;
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.SecuritiesPerformanceTrackerImpl$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = this.f$0;
                if (i4 == 0) {
                    return AFd1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(aFd1wSDKExternalSyntheticLambda0, z);
                }
                AFd1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(aFd1wSDKExternalSyntheticLambda0, z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.onNavigationEvent(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z), null, 2, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public void onWarmupCompleted(@NotNull final String str, final boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.SecuritiesPerformanceTrackerImpl$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = AFd1wSDKExternalSyntheticLambda0.IAuthTabCallback(this.f$0, str, z);
                int i5 = onWarmupCompleted + 89;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, boolean z) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallback(null, null, 2, null), str, z, 0L, 8, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.SecuritiesPerformanceTrackerImpl$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = AFd1wSDKExternalSyntheticLambda0.onExtraCallback(this.f$0);
                int i5 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
    }

    private static final Unit onNavigationEvent(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(new AFd1wSDK1.onWarmupCompleted.IAuthTabCallback(null, null, 2, null));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return unit;
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.SecuritiesPerformanceTrackerImpl$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AFd1wSDKExternalSyntheticLambda0.onWarmupCompleted(this.f$0);
                int i5 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallback(null, null, 2, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.onNavigationEvent(((AFd1wSDKExternalSyntheticLambda0) objArr[0]).onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallbackDefault(null, (String) objArr[1], null, null, 13, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.IAuthTabCallbackDefault("basicChart", str, null, null, 12, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(new AFd1wSDK1.onWarmupCompleted.IAuthTabCallbackDefault(null, str, null, null, 13, null));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return unit;
    }

    public void onExtraCallback(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, final long j, @NotNull final String str5, @Nullable final Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.SecuritiesPerformanceTrackerImpl$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 111;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnExtraCallbackWithResult = AFd1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(str, str2, str3, map, str4, this, j, str5);
                    int i4 = 9 / 0;
                } else {
                    unitOnExtraCallbackWithResult = AFd1wSDKExternalSyntheticLambda0.onExtraCallbackWithResult(str, str2, str3, map, str4, this, j, str5);
                }
                int i5 = onWarmupCompleted + 61;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 36 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, Map map, String str4, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, long j, String str5) {
        int i = 2 % 2;
        AFd1wSDK1.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = AFd1wSDK1.onWarmupCompleted.Companion.onExtraCallbackWithResult(str, str2, str3, map);
        AFd1wSDK1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = AFd1wSDK1.IAuthTabCallback.Companion.onExtraCallback(str4);
        Object obj = null;
        if (Intrinsics.areEqual(iAuthTabCallbackOnExtraCallback, AFd1wSDK1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback)) {
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                aFd1wSDKExternalSyntheticLambda0.onExtraCallback.onExtraCallback(onwarmupcompletedOnExtraCallbackWithResult, j);
                obj.hashCode();
                throw null;
            }
            aFd1wSDKExternalSyntheticLambda0.onExtraCallback.onExtraCallback(onwarmupcompletedOnExtraCallbackWithResult, j);
        } else if (iAuthTabCallbackOnExtraCallback instanceof AFd1wSDK1.IAuthTabCallback.onExtraCallback) {
            int i3 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, onwarmupcompletedOnExtraCallbackWithResult, str5, false, j, 3, null);
            } else {
                AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, onwarmupcompletedOnExtraCallbackWithResult, str5, false, j, 4, null);
            }
        } else if (Intrinsics.areEqual(iAuthTabCallbackOnExtraCallback, AFd1wSDK1.IAuthTabCallback.C0011IAuthTabCallback.onWarmupCompleted)) {
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult, j);
                throw null;
            }
            aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult, j);
        } else {
            if (!Intrinsics.areEqual(iAuthTabCallbackOnExtraCallback, AFd1wSDK1.IAuthTabCallback.onWarmupCompleted.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = (AFd1wSDKExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            int i3 = 23 / 0;
            return Unit.INSTANCE;
        }
        AFd1wSDKExternalSyntheticLambda3.onNavigationEvent(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.onExtraCallback(null, str, null, null, 13, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.onExtraCallback(null, str, null, null, 13, null), str2, false, 0L, 12, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onTransact(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (str == null) {
            int i5 = i3 + 109;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return Unit.INSTANCE;
            }
            int i6 = 23 / 0;
            return Unit.INSTANCE;
        }
        AFd1wSDKExternalSyntheticLambda3.onNavigationEvent(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.onTransact(null, str, null, null, 13, null), 0L, 2, null);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        AFd1wSDKExternalSyntheticLambda3.onNavigationEvent(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.onNavigationEvent(str, null, null, 6, null), 0L, 2, null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = (AFd1wSDKExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        AFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(aFd1wSDKExternalSyntheticLambda0.onExtraCallback, new AFd1wSDK1.onWarmupCompleted.onNavigationEvent(str, null, null, 6, null), (String) objArr[2], false, 0L, 12, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        aFd1wSDKExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(new AFd1wSDK1.onWarmupCompleted.onNavigationEvent(str, null, null, 6, null));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                function0.invoke();
                return;
            }
            function0.invoke();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, aFd1wSDKExternalSyntheticLambda0}, iOnExtraCallback3, -750409045, 750409045);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, aFd1wSDKExternalSyntheticLambda0}, iOnExtraCallback3, 262583471, -262583470);
    }

    private static final Unit onExtraCallbackWithResult(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str, str2}, iOnExtraCallback3, -1122647334, 1122647337);
    }

    private static final Unit asBinder(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str, String str2) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str, str2}, iOnExtraCallback3, -1089072773, 1089072777);
    }

    private static final Unit asBinder(String str, AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, aFd1wSDKExternalSyntheticLambda0}, iOnExtraCallback3, 1152877020, -1152877018);
    }

    private static final Unit IAuthTabCallbackDefault(AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0, String str) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{aFd1wSDKExternalSyntheticLambda0, str}, iOnExtraCallback3, -486885300, 486885305);
    }
}
