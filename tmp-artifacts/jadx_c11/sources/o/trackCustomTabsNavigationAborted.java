package o;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.splittarget.spec.fsm.CriticalMalwareState;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.trackCustomTabsNavigationAborted;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsNavigationAborted implements CriticalMalwareState {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private final findSnapView<CriticalMalwareState.State, CriticalMalwareState.Event, Object> IAuthTabCallback;
    private final zzad onExtraCallback;
    private final AppSetIdAndScope1 onNavigationEvent;
    private final access27100<CriticalMalwareState.State> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(onextracallback);
        int i4 = asBinder + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(onextracallback, criticalState, onClear);
        }
        onExtraCallbackWithResult(onextracallback, criticalState, onClear);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, userIgnoredSuspiciousState, onAllMalwareRemoved}, -1249003417, iOnExtraCallbackWithResult2, 1249003419, iOnExtraCallbackWithResult3);
        int i4 = onExtraCallbackWithResult + 79;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected = (CriticalMalwareState.Event.OnCriticalMalwareDetected) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, suspiciousState, onCriticalMalwareDetected);
        int i4 = onExtraCallbackWithResult + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.Ready ready = (CriticalMalwareState.State.Ready) objArr[1];
        CriticalMalwareState.Event.OnSuspiciousMalwareDetected onSuspiciousMalwareDetected = (CriticalMalwareState.Event.OnSuspiciousMalwareDetected) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, ready, onSuspiciousMalwareDetected);
        int i4 = onExtraCallbackWithResult + 97;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(onextracallback);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(onextracallback);
        int i3 = onExtraCallbackWithResult + 95;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, normal, onClear);
        int i4 = asBinder + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, normal, onCriticalMalwareDetected);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = onExtraCallbackWithResult + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onNavigationEvent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnSuspiciousMalwareDetected onSuspiciousMalwareDetected) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, normal, onSuspiciousMalwareDetected);
        int i4 = asBinder + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        CriticalMalwareState.State.Normal normal;
        Object obj;
        int i7;
        int i8 = ~((~i) | i5 | i3);
        int i9 = i | i5 | i3;
        int i10 = (~((~i5) | (~i3))) | i8;
        int i11 = i5 + i3 + i4 + (1512347918 * i6) + (2033855975 * i2);
        int i12 = i11 * i11;
        int i13 = ((i5 * 1295388527) - 26148864) + (1295388527 * i3) + (2139102940 * i8) + (i9 * 1077932178) + (1077932178 * i10) + ((-1921646592) * i4) + (1114898432 * i6) + (1668939776 * i2) + (346619904 * i12);
        int i14 = ((i5 * 1848112433) - 751391395) + (i3 * 1848112433) + (i8 * (-92)) + (i9 * 46) + (i10 * 46) + (i4 * 1848112479) + (i6 * (-818859470)) + (i2 * (-357164103)) + (i12 * 1740046336);
        switch (i13 + (i14 * i14 * 1721171968)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
                CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState = (CriticalMalwareState.State.UserIgnoredSuspiciousState) objArr[1];
                CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved = (CriticalMalwareState.Event.OnAllMalwareRemoved) objArr[2];
                int i15 = 2 % 2;
                int i16 = asBinder + 101;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(userIgnoredSuspiciousState, "");
                    Intrinsics.checkNotNullParameter(onAllMalwareRemoved, "");
                    normal = CriticalMalwareState.State.Normal.INSTANCE;
                    obj = null;
                    i7 = 3;
                } else {
                    Intrinsics.checkNotNullParameter(userIgnoredSuspiciousState, "");
                    Intrinsics.checkNotNullParameter(onAllMalwareRemoved, "");
                    normal = CriticalMalwareState.State.Normal.INSTANCE;
                    obj = null;
                    i7 = 2;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, userIgnoredSuspiciousState, normal, obj, i7, (Object) null);
                int i17 = onExtraCallbackWithResult + 81;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                return onnavigationeventOnWarmupCompleted;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(onextracallback);
        int i4 = onExtraCallbackWithResult + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(trackcustomtabsnavigationaborted, iAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnClear onClear = (CriticalMalwareState.Event.OnClear) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onClear}, 294970508, iOnExtraCallbackWithResult2, -294970503, iOnExtraCallbackWithResult3);
        int i4 = asBinder + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ Unit onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(onextracallback);
        int i4 = asBinder + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(trackcustomtabsnavigationaborted, onextracallbackwithresult);
        int i4 = onExtraCallbackWithResult + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnCriticalMalwareRemoved onCriticalMalwareRemoved) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, criticalState, onCriticalMalwareRemoved);
        int i4 = asBinder + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(onextracallback, ready, onClear);
        }
        onExtraCallback(onextracallback, ready, onClear);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, userIgnoredSuspiciousState, onClear}, 955298198, iOnExtraCallbackWithResult2, -955298198, iOnExtraCallbackWithResult3);
        int i4 = onExtraCallbackWithResult + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(onextracallback, userIgnoredSuspiciousState, onCriticalMalwareDetected);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, userIgnoredSuspiciousState, onCriticalMalwareDetected);
        int i3 = asBinder + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Unit unit;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {onextracallback};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        if (i3 != 0) {
            unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr2, 1226388129, iOnExtraCallbackWithResult2, -1226388120, iOnExtraCallbackWithResult3);
            int i4 = 94 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, objArr2, 1226388129, iOnExtraCallbackWithResult2, -1226388120, iOnExtraCallbackWithResult3);
        }
        int i5 = onExtraCallbackWithResult + 71;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, CriticalMalwareState.State state) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(trackcustomtabsnavigationaborted, state);
        }
        onExtraCallbackWithResult(trackcustomtabsnavigationaborted, state);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, criticalState, onAllMalwareRemoved);
        int i4 = asBinder + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, ready, onCriticalMalwareDetected);
        int i4 = asBinder + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return onNavigationEvent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onAllMalwareRemoved}, -500826755, iOnExtraCallbackWithResult2, 500826763, iOnExtraCallbackWithResult3);
        int i4 = onExtraCallbackWithResult + 13;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return onnavigationevent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert onUserIgnoredSuspiciousMalwareAlert) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onUserIgnoredSuspiciousMalwareAlert}, 1201385748, iOnExtraCallbackWithResult2, -1201385741, iOnExtraCallbackWithResult3);
        }
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult4, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onUserIgnoredSuspiciousMalwareAlert}, 1201385748, iOnExtraCallbackWithResult5, -1201385741, iOnExtraCallbackWithResult6);
        int i3 = 28 / 0;
        return onnavigationevent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = onExtraCallbackWithResult + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public trackCustomTabsNavigationAborted(@NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onExtraCallback = zzadVar;
        this.onNavigationEvent = ea10.onExtraCallbackWithResult("Malware");
        this.IAuthTabCallback = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    trackCustomTabsNavigationAborted.onNavigationEvent(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                obj2.hashCode();
                throw null;
            }
        });
        access27100<CriticalMalwareState.State> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onWarmupCompleted = access27100VarIAuthTabCallback;
        if (zzadVar.onActivityLayout()) {
            JsonReaderUnknownNumberParsing<CriticalMalwareState.State> jsonReaderUnknownNumberParsingIAuthTabCallback = IAuthTabCallback(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 19;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnWarmupCompleted = trackCustomTabsNavigationAborted.onWarmupCompleted(this.f$0, (CriticalMalwareState.State) obj);
                    int i4 = onExtraCallback + 71;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 29 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            };
            jsonReaderUnknownNumberParsingIAuthTabCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda14
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 109;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        trackCustomTabsNavigationAborted.onWarmupCompleted(function1, obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    trackCustomTabsNavigationAborted.onWarmupCompleted(function1, obj);
                    int i3 = onExtraCallback + 63;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 79 / 0;
                    }
                }
            });
            int i = asBinder + 9;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 3;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = onExtraCallbackWithResult + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(ready, "");
        Intrinsics.checkNotNullParameter(onClear, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ready, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = asBinder + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(ready, "");
            Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ready, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(ready, "");
            Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ready, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 2, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnSuspiciousMalwareDetected onSuspiciousMalwareDetected) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(ready, "");
            Intrinsics.checkNotNullParameter(onSuspiciousMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ready, CriticalMalwareState.State.SuspiciousState.INSTANCE, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(ready, "");
            Intrinsics.checkNotNullParameter(onSuspiciousMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ready, CriticalMalwareState.State.SuspiciousState.INSTANCE, (Object) null, 2, (Object) null);
        }
        int i3 = asBinder + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onTransact(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i3 % 128;
                Object obj3 = null;
                if (i3 % 2 != 0) {
                    trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback, (CriticalMalwareState.State.Ready) obj, (CriticalMalwareState.Event.OnClear) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback, (CriticalMalwareState.State.Ready) obj, (CriticalMalwareState.Event.OnClear) obj2);
                int i4 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return onNavigationEvent;
                }
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnClear.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnCriticalMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback, (CriticalMalwareState.State.Ready) obj, (CriticalMalwareState.Event.OnCriticalMalwareDetected) obj2);
                int i5 = onNavigationEvent + 123;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnSuspiciousMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (CriticalMalwareState.State.Ready) obj, (CriticalMalwareState.Event.OnSuspiciousMalwareDetected) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackCustomTabsNavigationAborted.onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1980041093, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1980041090, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
                int i5 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnClear onClear) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(normal, "");
            Intrinsics.checkNotNullParameter(onClear, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, normal, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 3, (Object) null);
        }
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(onClear, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, normal, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, normal, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Normal normal, CriticalMalwareState.Event.OnSuspiciousMalwareDetected onSuspiciousMalwareDetected) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(normal, "");
            Intrinsics.checkNotNullParameter(onSuspiciousMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, normal, CriticalMalwareState.State.SuspiciousState.INSTANCE, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(normal, "");
            Intrinsics.checkNotNullParameter(onSuspiciousMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, normal, CriticalMalwareState.State.SuspiciousState.INSTANCE, (Object) null, 2, (Object) null);
        }
        int i3 = asBinder + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallbackStub(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda15
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                CriticalMalwareState.State.Normal normal = (CriticalMalwareState.State.Normal) obj;
                if (i4 == 0) {
                    return trackCustomTabsNavigationAborted.onExtraCallback(onextracallback2, normal, (CriticalMalwareState.Event.OnClear) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackCustomTabsNavigationAborted.onExtraCallback(onextracallback2, normal, (CriticalMalwareState.Event.OnClear) obj2);
                int i5 = 44 / 0;
                return onnavigationeventOnExtraCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnClear.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnCriticalMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda16
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackCustomTabsNavigationAborted.onExtraCallback(onextracallback, (CriticalMalwareState.State.Normal) obj, (CriticalMalwareState.Event.OnCriticalMalwareDetected) obj2);
                int i5 = onExtraCallback + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnExtraCallback;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnSuspiciousMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackCustomTabsNavigationAborted.onExtraCallback(onextracallback, (CriticalMalwareState.State.Normal) obj, (CriticalMalwareState.Event.OnSuspiciousMalwareDetected) obj2);
                if (i4 == 0) {
                    int i5 = 30 / 0;
                }
                return onnavigationeventOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnClear onClear) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(criticalState, "");
            Intrinsics.checkNotNullParameter(onClear, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, criticalState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(criticalState, "");
            Intrinsics.checkNotNullParameter(onClear, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, criticalState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        }
        int i3 = asBinder + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnCriticalMalwareRemoved onCriticalMalwareRemoved) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(criticalState, "");
        Intrinsics.checkNotNullParameter(onCriticalMalwareRemoved, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, criticalState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = asBinder + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.CriticalState criticalState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(criticalState, "");
        Intrinsics.checkNotNullParameter(onAllMalwareRemoved, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, criticalState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = asBinder + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                CriticalMalwareState.State.CriticalState criticalState = (CriticalMalwareState.State.CriticalState) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationAborted.IAuthTabCallback(onextracallback2, criticalState, (CriticalMalwareState.Event.OnClear) obj2);
                }
                trackCustomTabsNavigationAborted.IAuthTabCallback(onextracallback2, criticalState, (CriticalMalwareState.Event.OnClear) obj2);
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnClear.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnCriticalMalwareRemoved.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback, (CriticalMalwareState.State.CriticalState) obj, (CriticalMalwareState.Event.OnCriticalMalwareRemoved) obj2);
                int i5 = onExtraCallback + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return onNavigationEvent;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnAllMalwareRemoved.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback, (CriticalMalwareState.State.CriticalState) obj, (CriticalMalwareState.Event.OnAllMalwareRemoved) obj2);
                int i5 = onWarmupCompleted + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnClear onClear = (CriticalMalwareState.Event.OnClear) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(suspiciousState, "");
        Intrinsics.checkNotNullParameter(onClear, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, suspiciousState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved = (CriticalMalwareState.Event.OnAllMalwareRemoved) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(suspiciousState, "");
        Intrinsics.checkNotNullParameter(onAllMalwareRemoved, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, suspiciousState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = asBinder + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState;
        Object obj;
        int i;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert onUserIgnoredSuspiciousMalwareAlert = (CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert) objArr[2];
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(suspiciousState, "");
            Intrinsics.checkNotNullParameter(onUserIgnoredSuspiciousMalwareAlert, "");
            userIgnoredSuspiciousState = CriticalMalwareState.State.UserIgnoredSuspiciousState.INSTANCE;
            obj = null;
            i = 5;
        } else {
            Intrinsics.checkNotNullParameter(suspiciousState, "");
            Intrinsics.checkNotNullParameter(onUserIgnoredSuspiciousMalwareAlert, "");
            userIgnoredSuspiciousState = CriticalMalwareState.State.UserIgnoredSuspiciousState.INSTANCE;
            obj = null;
            i = 2;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, suspiciousState, userIgnoredSuspiciousState, obj, i, (Object) null);
        int i4 = asBinder + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(suspiciousState, "");
            Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, suspiciousState, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(suspiciousState, "");
            Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, suspiciousState, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 2, (Object) null);
        }
        int i3 = asBinder + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit asInterface(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda21
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (CriticalMalwareState.State.SuspiciousState) obj, (CriticalMalwareState.Event.OnClear) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackCustomTabsNavigationAborted.onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -114215983, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 114215984, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
                int i5 = onWarmupCompleted + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationevent;
                }
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnClear.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnAllMalwareRemoved.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                CriticalMalwareState.State.SuspiciousState suspiciousState = (CriticalMalwareState.State.SuspiciousState) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback2, suspiciousState, (CriticalMalwareState.Event.OnAllMalwareRemoved) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback2, suspiciousState, (CriticalMalwareState.Event.OnAllMalwareRemoved) obj2);
                int i5 = 73 / 0;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda23
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i3 % 128;
                Object obj3 = null;
                if (i3 % 2 == 0) {
                    trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback, (CriticalMalwareState.State.SuspiciousState) obj, (CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert) obj2);
                    obj3.hashCode();
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackCustomTabsNavigationAborted.onWarmupCompleted(onextracallback, (CriticalMalwareState.State.SuspiciousState) obj, (CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert) obj2);
                int i4 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnCriticalMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda24
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (CriticalMalwareState.State.SuspiciousState) obj, (CriticalMalwareState.Event.OnCriticalMalwareDetected) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackCustomTabsNavigationAborted.onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -70752932, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 70752938, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
                int i5 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState = (CriticalMalwareState.State.UserIgnoredSuspiciousState) objArr[1];
        CriticalMalwareState.Event.OnClear onClear = (CriticalMalwareState.Event.OnClear) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(userIgnoredSuspiciousState, "");
        Intrinsics.checkNotNullParameter(onClear, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, userIgnoredSuspiciousState, CriticalMalwareState.State.Normal.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = asBinder + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(userIgnoredSuspiciousState, "");
        Intrinsics.checkNotNullParameter(onCriticalMalwareDetected, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, userIgnoredSuspiciousState, CriticalMalwareState.State.CriticalState.INSTANCE, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallbackDefault(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    onNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback, (CriticalMalwareState.State.UserIgnoredSuspiciousState) obj, (CriticalMalwareState.Event.OnClear) obj2);
                    int i4 = 53 / 0;
                } else {
                    onNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback, (CriticalMalwareState.State.UserIgnoredSuspiciousState) obj, (CriticalMalwareState.Event.OnClear) obj2);
                }
                int i5 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onNavigationEvent;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnClear.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnAllMalwareRemoved.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackCustomTabsNavigationAborted.IAuthTabCallback(onextracallback, (CriticalMalwareState.State.UserIgnoredSuspiciousState) obj, (CriticalMalwareState.Event.OnAllMalwareRemoved) obj2);
                int i5 = onExtraCallback + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(CriticalMalwareState.Event.OnCriticalMalwareDetected.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState = (CriticalMalwareState.State.UserIgnoredSuspiciousState) obj;
                CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected = (CriticalMalwareState.Event.OnCriticalMalwareDetected) obj2;
                if (i4 != 0) {
                    return trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback2, userIgnoredSuspiciousState, onCriticalMalwareDetected);
                }
                trackCustomTabsNavigationAborted.onNavigationEvent(onextracallback2, userIgnoredSuspiciousState, onCriticalMalwareDetected);
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationaborted.onNavigationEvent;
            Objects.toString(iAuthTabCallback);
            trackcustomtabsnavigationaborted.onWarmupCompleted.onWarmupCompleted(((findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback).IAuthTabCallback());
        } else {
            AppSetIdAndScope1 appSetIdAndScope12 = trackcustomtabsnavigationaborted.onNavigationEvent;
            Objects.toString(iAuthTabCallback);
            int i4 = asBinder + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(CriticalMalwareState.State.Ready.INSTANCE);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = trackCustomTabsNavigationAborted.onNavigationEvent((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onNavigationEvent + 41;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(CriticalMalwareState.State.Ready.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(CriticalMalwareState.State.Normal.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 != 0) {
                    trackCustomTabsNavigationAborted.IAuthTabCallback(onextracallback);
                    throw null;
                }
                Unit unitIAuthTabCallback = trackCustomTabsNavigationAborted.IAuthTabCallback(onextracallback);
                int i4 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                obj2.hashCode();
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(CriticalMalwareState.State.CriticalState.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                Unit unit = (Unit) trackCustomTabsNavigationAborted.onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{(findSnapView.onExtraCallbackWithResult.onExtraCallback) obj}, -560482520, iOnExtraCallbackWithResult2, 560482524, iOnExtraCallbackWithResult3);
                int i5 = IAuthTabCallback + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(CriticalMalwareState.State.SuspiciousState.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackCustomTabsNavigationAborted.onExtraCallbackWithResult((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = IAuthTabCallback + 75;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(CriticalMalwareState.State.UserIgnoredSuspiciousState.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                IAuthTabCallback = i3 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 == 0) {
                    trackCustomTabsNavigationAborted.onExtraCallback(onextracallback);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = trackCustomTabsNavigationAborted.onExtraCallback(onextracallback);
                int i4 = IAuthTabCallback + 59;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.CriticalMalwareStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackCustomTabsNavigationAborted.onExtraCallbackWithResult(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = onWarmupCompleted + 109;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public CriticalMalwareState.State onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        if (i3 != 0) {
            return (CriticalMalwareState.State) objOnWarmupCompleted;
        }
        throw null;
    }

    @Override // im.toss.splittarget.spec.fsm.CriticalMalwareState
    public findSnapView.IAuthTabCallback<CriticalMalwareState.State, CriticalMalwareState.Event, Object> IAuthTabCallback(@NotNull CriticalMalwareState.Event event) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        findSnapView.IAuthTabCallback<CriticalMalwareState.State, CriticalMalwareState.Event, Object> iAuthTabCallbackOnExtraCallback = this.IAuthTabCallback.onExtraCallback(event);
        int i4 = asBinder + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackOnExtraCallback;
    }

    @Override // im.toss.splittarget.spec.fsm.CriticalMalwareState
    public JsonReaderUnknownNumberParsing<CriticalMalwareState.State> IAuthTabCallback(boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onWarmupCompleted.IAuthTabCallbackDefault().access000();
        if (!z) {
            j = 1;
        } else {
            int i4 = asBinder + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            j = 0;
        }
        JsonReaderUnknownNumberParsing<CriticalMalwareState.State> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(trackCustomTabsNavigationAborted trackcustomtabsnavigationaborted, CriticalMalwareState.State state) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationaborted.onNavigationEvent;
        Objects.toString(state);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.Ready ready, CriticalMalwareState.Event.OnSuspiciousMalwareDetected onSuspiciousMalwareDetected) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, ready, onSuspiciousMalwareDetected}, 1980041093, iOnExtraCallbackWithResult2, -1980041090, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnCriticalMalwareDetected onCriticalMalwareDetected) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onCriticalMalwareDetected}, -70752932, iOnExtraCallbackWithResult2, 70752938, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnClear onClear) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onClear}, -114215983, iOnExtraCallbackWithResult2, 114215984, iOnExtraCallbackWithResult3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback}, -560482520, iOnExtraCallbackWithResult2, 560482524, iOnExtraCallbackWithResult3);
    }

    private static final Unit asBinder(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback}, 1226388129, iOnExtraCallbackWithResult2, -1226388120, iOnExtraCallbackWithResult3);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnClear onClear) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onClear}, 294970508, iOnExtraCallbackWithResult2, -294970503, iOnExtraCallbackWithResult3);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onAllMalwareRemoved}, -500826755, iOnExtraCallbackWithResult2, 500826763, iOnExtraCallbackWithResult3);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.SuspiciousState suspiciousState, CriticalMalwareState.Event.OnUserIgnoredSuspiciousMalwareAlert onUserIgnoredSuspiciousMalwareAlert) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, suspiciousState, onUserIgnoredSuspiciousMalwareAlert}, 1201385748, iOnExtraCallbackWithResult2, -1201385741, iOnExtraCallbackWithResult3);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnClear onClear) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, userIgnoredSuspiciousState, onClear}, 955298198, iOnExtraCallbackWithResult2, -955298198, iOnExtraCallbackWithResult3);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, CriticalMalwareState.State.UserIgnoredSuspiciousState userIgnoredSuspiciousState, CriticalMalwareState.Event.OnAllMalwareRemoved onAllMalwareRemoved) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{onextracallback, userIgnoredSuspiciousState, onAllMalwareRemoved}, -1249003417, iOnExtraCallbackWithResult2, 1249003419, iOnExtraCallbackWithResult3);
    }
}
