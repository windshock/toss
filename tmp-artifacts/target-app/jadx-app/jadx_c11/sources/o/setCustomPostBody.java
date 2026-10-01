package o;

import android.os.Process;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.splittarget.spec.fsm.AppState;
import java.util.Calendar;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.setCustomPostBody;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCustomPostBody implements AppState {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallback;
    private final zzdj onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final access27100<AppState.State> onNavigationEvent;
    private final boolean onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onTransact + 107;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setCustomPostBody setcustompostbody = (setCustomPostBody) objArr[0];
        findSnapView.IAuthTabCallback iAuthTabCallback = (findSnapView.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setcustompostbody, iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback);
        int i4 = IAuthTabCallbackDefault + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setCustomPostBody setcustompostbody, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(setcustompostbody, onextracallbackwithresult);
        }
        onNavigationEvent(setcustompostbody, onextracallbackwithresult);
        throw null;
    }

    public static /* synthetic */ Boolean onExtraCallback(AppState.State state) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(state);
            throw null;
        }
        Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult(state);
        int i3 = IAuthTabCallbackDefault + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
        return boolOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(setCustomPostBody setcustompostbody, AppState.State.Terminate terminate, AppState.Event event) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(setcustompostbody, terminate, event);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setcustompostbody, terminate, event);
        int i3 = asInterface + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Foreground foreground, AppState.Event.OnAppBackground onAppBackground) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, foreground, onAppBackground);
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Initialize initialize, AppState.Event.OnAppForeground onAppForeground) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, initialize, onAppForeground);
        int i4 = asInterface + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Terminate terminate, AppState.Event.OnAppForeground onAppForeground) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onextracallback, terminate, onAppForeground}, iOnExtraCallback2, -371421746, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 371421752);
        int i4 = IAuthTabCallbackDefault + 75;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i6) | i7);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i6)) | (~(i3 | i6));
        int i11 = i7 | i6;
        int i12 = i9 | i11;
        int i13 = i3 + i6 + i2 + ((-1542968645) * i) + (1789173782 * i4);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i3) + 752877568 + ((-368479342) * i6) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i2) + (1802502144 * i) + (148897792 * i4) + (289275904 * i14);
        int i16 = (i3 * (-930071408)) + 1959937684 + (i6 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i2 * (-930070801)) + (i * 1059663509) + (i4 * (-1428764534)) + (i14 * 484573184);
        switch (i15 + (i16 * i16 * 411172864)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(onextracallback);
        }
        onNavigationEvent(onextracallback);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Background background, AppState.Event.OnAppForeground onAppForeground) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, background, onAppForeground);
        int i4 = asInterface + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Initialize initialize, AppState.Event.OnAppBackground onAppBackground) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, initialize, onAppBackground);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent;
    }

    public static /* synthetic */ findSnapView onExtraCallbackWithResult(setCustomPostBody setcustompostbody) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findSnapView findsnapviewOnNavigationEvent = onNavigationEvent(setcustompostbody);
        int i4 = asInterface + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return findsnapviewOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        AppState.State.Background background = (AppState.State.Background) objArr[1];
        AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed = (AppState.Event.OnAllActivityDestroyed) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, background, onAllActivityDestroyed);
        int i4 = IAuthTabCallbackDefault + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCustomPostBody setcustompostbody, AppState.State.Terminate terminate, AppState.Event event) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {setcustompostbody, terminate, event};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback3, objArr, iOnExtraCallback2, 805266352, iOnExtraCallback4, iOnExtraCallback, -805266349);
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCustomPostBody setcustompostbody, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setcustompostbody, onextracallback);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = IAuthTabCallbackDefault + 99;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return boolOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(onextracallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(onextracallback);
        int i3 = IAuthTabCallbackDefault + 107;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Foreground foreground, AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onextracallback, foreground, onAllActivityDestroyed}, iOnExtraCallback4, -1522356356, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback3, 1522356356);
        int i3 = IAuthTabCallbackDefault + 81;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return onnavigationevent;
    }

    @Inject
    public setCustomPostBody(@NotNull zzdj zzdjVar) {
        Intrinsics.checkNotNullParameter(zzdjVar, "");
        this.onExtraCallback = zzdjVar;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(setCustomPostBody.class.getSimpleName());
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                setCustomPostBody setcustompostbody = this.f$0;
                if (i3 != 0) {
                    return setCustomPostBody.onExtraCallbackWithResult(setcustompostbody);
                }
                setCustomPostBody.onExtraCallbackWithResult(setcustompostbody);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        access27100<AppState.State> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onWarmupCompleted());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onNavigationEvent = access27100VarIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setCustomPostBody setcustompostbody = (setCustomPostBody) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = setcustompostbody.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return (findSnapView) value;
        }
        int i4 = 19 / 0;
        return (findSnapView) value;
    }

    private static final findSnapView onNavigationEvent(final setCustomPostBody setcustompostbody) {
        int i = 2 % 2;
        findSnapView findsnapviewOnNavigationEvent = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                setCustomPostBody setcustompostbody2 = this.f$0;
                findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) obj;
                if (i4 == 0) {
                    return setCustomPostBody.IAuthTabCallback(setcustompostbody2, onextracallbackwithresult);
                }
                Unit unitIAuthTabCallback = setCustomPostBody.IAuthTabCallback(setcustompostbody2, onextracallbackwithresult);
                int i5 = 80 / 0;
                return unitIAuthTabCallback;
            }
        });
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return findsnapviewOnNavigationEvent;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Initialize initialize, AppState.Event.OnAppBackground onAppBackground) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(initialize, "");
            Intrinsics.checkNotNullParameter(onAppBackground, "");
            onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(initialize, AppState.State.Background.onExtraCallbackWithResult, AppState.onExtraCallback.C0000onExtraCallback.onExtraCallback);
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(initialize, "");
            Intrinsics.checkNotNullParameter(onAppBackground, "");
            onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(initialize, AppState.State.Background.onExtraCallbackWithResult, AppState.onExtraCallback.C0000onExtraCallback.onExtraCallback);
        }
        int i4 = IAuthTabCallbackDefault + 51;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Initialize initialize, AppState.Event.OnAppForeground onAppForeground) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(initialize, "");
            Intrinsics.checkNotNullParameter(onAppForeground, "");
            return onextracallback.onWarmupCompleted(initialize, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.onExtraCallbackWithResult.onExtraCallback);
        }
        Intrinsics.checkNotNullParameter(initialize, "");
        Intrinsics.checkNotNullParameter(onAppForeground, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(initialize, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.onExtraCallbackWithResult.onExtraCallback);
        int i3 = 29 / 0;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = setCustomPostBody.onExtraCallbackWithResult(onextracallback, (AppState.State.Initialize) obj, (AppState.Event.OnAppBackground) obj2);
                int i5 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 67 / 0;
                }
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAppBackground.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAppForeground.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 83;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    setCustomPostBody.onExtraCallback(onextracallback, (AppState.State.Initialize) obj, (AppState.Event.OnAppForeground) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = setCustomPostBody.onExtraCallback(onextracallback, (AppState.State.Initialize) obj, (AppState.Event.OnAppForeground) obj2);
                int i4 = IAuthTabCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Foreground foreground, AppState.Event.OnAppBackground onAppBackground) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(foreground, "");
            Intrinsics.checkNotNullParameter(onAppBackground, "");
            onextracallback.onWarmupCompleted(foreground, AppState.State.Background.onExtraCallbackWithResult, AppState.onExtraCallback.C0000onExtraCallback.onExtraCallback);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(foreground, "");
        Intrinsics.checkNotNullParameter(onAppBackground, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(foreground, AppState.State.Background.onExtraCallbackWithResult, AppState.onExtraCallback.C0000onExtraCallback.onExtraCallback);
        int i3 = IAuthTabCallbackDefault + 79;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        AppState.State.Foreground foreground = (AppState.State.Foreground) objArr[1];
        AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed = (AppState.Event.OnAllActivityDestroyed) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(foreground, "");
            Intrinsics.checkNotNullParameter(onAllActivityDestroyed, "");
            return onextracallback.onWarmupCompleted(foreground, AppState.State.Terminate.onExtraCallbackWithResult, AppState.onExtraCallback.onNavigationEvent.onNavigationEvent);
        }
        Intrinsics.checkNotNullParameter(foreground, "");
        Intrinsics.checkNotNullParameter(onAllActivityDestroyed, "");
        onextracallback.onWarmupCompleted(foreground, AppState.State.Terminate.onExtraCallbackWithResult, AppState.onExtraCallback.onNavigationEvent.onNavigationEvent);
        throw null;
    }

    private static final Unit onNavigationEvent(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 41;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = setCustomPostBody.onExtraCallback(onextracallback, (AppState.State.Foreground) obj, (AppState.Event.OnAppBackground) obj2);
                int i5 = onWarmupCompleted + 59;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAppBackground.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAllActivityDestroyed.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = setCustomPostBody.onWarmupCompleted(onextracallback, (AppState.State.Foreground) obj, (AppState.Event.OnAllActivityDestroyed) obj2);
                int i5 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Background background, AppState.Event.OnAppForeground onAppForeground) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(background, "");
            Intrinsics.checkNotNullParameter(onAppForeground, "");
            onextracallback.onWarmupCompleted(background, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.IAuthTabCallback.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(background, "");
        Intrinsics.checkNotNullParameter(onAppForeground, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(background, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.IAuthTabCallback.onNavigationEvent);
        int i3 = asInterface + 19;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Background background, AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(background, "");
        Intrinsics.checkNotNullParameter(onAllActivityDestroyed, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onextracallback.onWarmupCompleted(background, AppState.State.Terminate.onExtraCallbackWithResult, AppState.onExtraCallback.onNavigationEvent.onNavigationEvent);
        int i4 = IAuthTabCallbackDefault + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit asInterface(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda15
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = setCustomPostBody.onExtraCallbackWithResult(onextracallback, (AppState.State.Background) obj, (AppState.Event.OnAppForeground) obj2);
                int i5 = onNavigationEvent + 83;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAppForeground.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(AppState.Event.OnAllActivityDestroyed.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (AppState.State.Background) obj, (AppState.Event.OnAllActivityDestroyed) obj2};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) setCustomPostBody.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 175089992, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -175089990);
                int i5 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        AppState.State.Terminate terminate = (AppState.State.Terminate) objArr[1];
        AppState.Event.OnAppForeground onAppForeground = (AppState.Event.OnAppForeground) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(terminate, "");
            Intrinsics.checkNotNullParameter(onAppForeground, "");
            return onextracallback.onWarmupCompleted(terminate, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.onWarmupCompleted.onWarmupCompleted);
        }
        Intrinsics.checkNotNullParameter(terminate, "");
        Intrinsics.checkNotNullParameter(onAppForeground, "");
        onextracallback.onWarmupCompleted(terminate, AppState.State.Foreground.onExtraCallbackWithResult, AppState.onExtraCallback.onWarmupCompleted.onWarmupCompleted);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(setCustomPostBody setcustompostbody, AppState.State.Terminate terminate, AppState.Event event) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(terminate, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (addPolicy.ITrustedWebActivityCallback().onExtraCallback("ENABLE_DEBUG_PROCESS_RESET", false)) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppState", "killProcess immediate", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            Process.killProcess(Process.myPid());
        } else if (DERSet.onExtraCallback.onMessageChannelReady()) {
            int i4 = IAuthTabCallbackDefault + 49;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            calendar.add(5, 1);
            calendar.set(11, 3);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
            if (setcustompostbody.onWarmupCompleted) {
                TimeUnit.MILLISECONDS.toHours(timeInMillis);
            }
            zzdj.onWarmupCompleted(setcustompostbody.onExtraCallback, timeInMillis, false, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setCustomPostBody setcustompostbody = (setCustomPostBody) objArr[0];
        AppState.State.Terminate terminate = (AppState.State.Terminate) objArr[1];
        AppState.Event event = (AppState.Event) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(terminate, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (!addPolicy.ITrustedWebActivityCallback().onExtraCallback("ENABLE_DEBUG_PROCESS_RESET", false)) {
            int i2 = IAuthTabCallbackDefault + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (setcustompostbody.onExtraCallback.onExtraCallbackWithResult()) {
                int i4 = IAuthTabCallbackDefault + 17;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    setcustompostbody.onExtraCallback.onNavigationEvent();
                    int i5 = 69 / 0;
                } else {
                    setcustompostbody.onExtraCallback.onNavigationEvent();
                }
                int i6 = IAuthTabCallbackDefault + 9;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 2;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final setCustomPostBody setcustompostbody, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(AppState.Event.OnAppForeground.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                AppState.State.Terminate terminate = (AppState.State.Terminate) obj;
                if (i4 != 0) {
                    return setCustomPostBody.onExtraCallback(onextracallback2, terminate, (AppState.Event.OnAppForeground) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = setCustomPostBody.onExtraCallback(onextracallback2, terminate, (AppState.Event.OnAppForeground) obj2);
                int i5 = 31 / 0;
                return onnavigationeventOnExtraCallback;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = setCustomPostBody.onExtraCallback(this.f$0, (AppState.State.Terminate) obj, (AppState.Event) obj2);
                int i5 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        onextracallback.onExtraCallbackWithResult(new Function2() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 117;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnNavigationEvent = setCustomPostBody.onNavigationEvent(this.f$0, (AppState.State.Terminate) obj, (AppState.Event) obj2);
                    int i4 = 33 / 0;
                } else {
                    unitOnNavigationEvent = setCustomPostBody.onNavigationEvent(this.f$0, (AppState.State.Terminate) obj, (AppState.Event) obj2);
                }
                int i5 = onExtraCallback + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(setCustomPostBody setcustompostbody, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!(iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback)) {
            AppSetIdAndScope1 appSetIdAndScope1 = setcustompostbody.onExtraCallbackWithResult;
            Objects.toString(iAuthTabCallback);
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = setcustompostbody.onExtraCallbackWithResult;
        Objects.toString(iAuthTabCallback);
        findSnapView.IAuthTabCallback.onExtraCallback onextracallback = (findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback;
        setcustompostbody.onNavigationEvent.onWarmupCompleted(onextracallback.IAuthTabCallback());
        AppState.onExtraCallback onextracallback2 = (AppState.onExtraCallback) onextracallback.onExtraCallback();
        if (onextracallback2 != null) {
            int i4 = IAuthTabCallbackDefault + 75;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            onextracallback2.onExtraCallback();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final setCustomPostBody setcustompostbody, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(AppState.State.Initialize.onNavigationEvent);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i3 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 != 0) {
                    setCustomPostBody.IAuthTabCallback(onextracallback);
                    throw null;
                }
                Unit unitIAuthTabCallback = setCustomPostBody.IAuthTabCallback(onextracallback);
                int i4 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(AppState.State.Initialize.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(AppState.State.Foreground.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = setCustomPostBody.onExtraCallbackWithResult((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                if (i4 == 0) {
                    int i5 = 41 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(AppState.State.Background.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = setCustomPostBody.onWarmupCompleted((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                if (i4 == 0) {
                    int i5 = 15 / 0;
                }
                int i6 = IAuthTabCallback + 59;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(AppState.State.Terminate.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    setCustomPostBody.onNavigationEvent(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = setCustomPostBody.onNavigationEvent(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i4 = onExtraCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 1 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new AppStateImpl$$ExternalSyntheticLambda11(setcustompostbody));
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public AppState.State onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        AppState.State state = (AppState.State) ((findSnapView) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this}, iOnExtraCallback4, 1550580253, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback3, -1550580252)).onWarmupCompleted();
        int i3 = asInterface + 9;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return state;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AppState.State stateOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            return Intrinsics.areEqual(stateOnWarmupCompleted, AppState.State.Foreground.onExtraCallbackWithResult);
        }
        Intrinsics.areEqual(stateOnWarmupCompleted, AppState.State.Foreground.onExtraCallbackWithResult);
        throw null;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public ALCOcclusion onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCOcclusion aLCOcclusionIAuthTabCallbackStubProxy = AppStateManager.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return aLCOcclusionIAuthTabCallbackStubProxy;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public findSnapView.IAuthTabCallback<AppState.State, AppState.Event, AppState.onExtraCallback> onNavigationEvent(@NotNull AppState.Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        findSnapView.IAuthTabCallback<AppState.State, AppState.Event, AppState.onExtraCallback> iAuthTabCallbackOnExtraCallback = ((findSnapView) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 1550580253, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1550580252)).onExtraCallback(event);
        int i4 = asInterface + 25;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackOnExtraCallback;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public JsonReaderUnknownNumberParsing<AppState.State> IAuthTabCallback(boolean z) {
        long j;
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onNavigationEvent.IAuthTabCallbackDefault().access000();
        if (z) {
            int i2 = asInterface + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        } else {
            int i4 = IAuthTabCallbackDefault + 91;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            j = 1;
        }
        JsonReaderUnknownNumberParsing<AppState.State> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        int i6 = IAuthTabCallbackDefault + 19;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final Boolean onExtraCallback(Function1 function1, Object obj) {
        Boolean bool;
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            bool = (Boolean) function1.invoke(obj);
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            bool = (Boolean) function1.invoke(obj);
        }
        int i4 = IAuthTabCallbackDefault + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return bool;
    }

    @Override // im.toss.splittarget.spec.fsm.AppState
    public JsonReaderUnknownNumberParsing<Boolean> onNavigationEvent(boolean z) {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<AppState.State> jsonReaderUnknownNumberParsingIAuthTabCallback = IAuthTabCallback(z);
        final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolOnExtraCallback = setCustomPostBody.onExtraCallback((AppState.State) obj);
                int i5 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return boolOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        JsonReaderUnknownNumberParsing<Boolean> jsonReaderUnknownNumberParsingAsInterface = jsonReaderUnknownNumberParsingIAuthTabCallback.onNavigationEvent(new deserializeIntNullableCollection() { // from class: im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, obj};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                Boolean bool = (Boolean) setCustomPostBody.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -691684507, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 691684512);
                int i5 = onNavigationEvent + 99;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return bool;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return jsonReaderUnknownNumberParsingAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Boolean onExtraCallbackWithResult(AppState.State state) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.areEqual(state, AppState.State.Foreground.onExtraCallbackWithResult));
        int i4 = IAuthTabCallbackDefault + 93;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setCustomPostBody setcustompostbody, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{setcustompostbody, iAuthTabCallback}, iOnExtraCallback2, -1659670441, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 1659670445);
    }

    public static /* synthetic */ Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Boolean) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback2, -691684507, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 691684512);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Background background, AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onextracallback, background, onAllActivityDestroyed}, iOnExtraCallback2, 175089992, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -175089990);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Foreground foreground, AppState.Event.OnAllActivityDestroyed onAllActivityDestroyed) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onextracallback, foreground, onAllActivityDestroyed}, iOnExtraCallback2, -1522356356, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 1522356356);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, AppState.State.Terminate terminate, AppState.Event.OnAppForeground onAppForeground) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{onextracallback, terminate, onAppForeground}, iOnExtraCallback2, -371421746, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, 371421752);
    }

    private static final Unit IAuthTabCallback(setCustomPostBody setcustompostbody, AppState.State.Terminate terminate, AppState.Event event) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{setcustompostbody, terminate, event}, iOnExtraCallback2, 805266352, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -805266349);
    }

    private final findSnapView<AppState.State, AppState.Event, AppState.onExtraCallback> onExtraCallback() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (findSnapView) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, 1550580253, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, -1550580252);
    }
}
