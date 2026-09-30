package o;

import com.google.android.gms.internal.ads.zzgc;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.getAdUnitIds;
import o.trackCustomTabsNavigationFailed;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsNavigationFailed implements getAdUnitIds {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final access27100<getAdUnitIds.onExtraCallback> onExtraCallback;
    private final findSnapView<getAdUnitIds.onExtraCallback, getAdUnitIds.onExtraCallbackWithResult, Object> onWarmupCompleted = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda4
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed = this.f$0;
            findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) obj;
            if (i3 == 0) {
                return trackCustomTabsNavigationFailed.IAuthTabCallback(trackcustomtabsnavigationfailed, onextracallbackwithresult);
            }
            trackCustomTabsNavigationFailed.IAuthTabCallback(trackcustomtabsnavigationfailed, onextracallbackwithresult);
            throw null;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(new Object[]{trackcustomtabsnavigationfailed, onextracallbackwithresult}, -697824560, 697824560, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onNavigationEvent onnavigationevent, getAdUnitIds.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, onnavigationevent, onwarmupcompleted);
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent2;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(trackcustomtabsnavigationfailed, iAuthTabCallback);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(trackcustomtabsnavigationfailed, iAuthTabCallback);
        int i3 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i) | i2));
        int i11 = (~(i4 | i)) | (~(i7 | i4)) | (~i8);
        int i12 = i2 + i + i3 + ((-953487067) * i6) + ((-1992133889) * i5);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i3) + ((-1703411712) * i6) + (1961361408 * i5) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i3 * 272662391) + (i6 * 2077717299) + (i5 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallback);
        int i4 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onNavigationEvent onnavigationevent, getAdUnitIds.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(onextracallback, onnavigationevent, onnavigationevent2);
        }
        IAuthTabCallback(onextracallback, onnavigationevent, onnavigationevent2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onWarmupCompleted onwarmupcompleted, getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallback}, -1361727840, 1361727841, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i3 = 73 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallback}, -1361727840, 1361727841, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.C0014onExtraCallback c0014onExtraCallback, getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, c0014onExtraCallback, iAuthTabCallback);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(onextracallback);
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return unitOnTransact;
    }

    @Inject
    public trackCustomTabsNavigationFailed() {
        access27100<getAdUnitIds.onExtraCallback> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onExtraCallbackWithResult());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onExtraCallback = access27100VarIAuthTabCallback;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onNavigationEvent onnavigationevent, getAdUnitIds.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(onnavigationevent2, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getAdUnitIds.onExtraCallback.C0014onExtraCallback.onExtraCallbackWithResult, (Object) null, 5, (Object) null);
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(onnavigationevent2, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getAdUnitIds.onExtraCallback.C0014onExtraCallback.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onNavigationEvent onnavigationevent, getAdUnitIds.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, new getAdUnitIds.onExtraCallback.onWarmupCompleted(onwarmupcompleted.onNavigationEvent()), (Object) null, 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 117;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationFailed.onExtraCallbackWithResult(onextracallback, (getAdUnitIds.onExtraCallback.onNavigationEvent) obj, (getAdUnitIds.onExtraCallbackWithResult.onNavigationEvent) obj2);
                int i5 = IAuthTabCallback + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getAdUnitIds.onExtraCallbackWithResult.onNavigationEvent.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getAdUnitIds.onExtraCallbackWithResult.onWarmupCompleted.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackCustomTabsNavigationFailed.IAuthTabCallback(onextracallback, (getAdUnitIds.onExtraCallback.onNavigationEvent) obj, (getAdUnitIds.onExtraCallbackWithResult.onWarmupCompleted) obj2);
                int i5 = onExtraCallback + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.C0014onExtraCallback c0014onExtraCallback, getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0014onExtraCallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0014onExtraCallback, getAdUnitIds.onExtraCallback.onNavigationEvent.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackCustomTabsNavigationFailed.onNavigationEvent(onextracallback, (getAdUnitIds.onExtraCallback.C0014onExtraCallback) obj, (getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback) obj2);
                int i5 = onExtraCallback + 103;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 87 / 0;
                }
                return onNavigationEvent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getAdUnitIds.onExtraCallback.onNavigationEvent onnavigationevent;
        Object obj;
        int i;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getAdUnitIds.onExtraCallback.onWarmupCompleted onwarmupcompleted = (getAdUnitIds.onExtraCallback.onWarmupCompleted) objArr[1];
        getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback = (getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback) objArr[2];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            onnavigationevent = getAdUnitIds.onExtraCallback.onNavigationEvent.onWarmupCompleted;
            obj = null;
            i = 3;
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            onnavigationevent = getAdUnitIds.onExtraCallback.onNavigationEvent.onWarmupCompleted;
            obj = null;
            i = 2;
        }
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onwarmupcompleted, onnavigationevent, obj, i, (Object) null);
    }

    private static final Unit onTransact(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getAdUnitIds.onExtraCallback.onWarmupCompleted onwarmupcompleted = (getAdUnitIds.onExtraCallback.onWarmupCompleted) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationFailed.onExtraCallbackWithResult(onextracallback2, onwarmupcompleted, (getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationFailed.onExtraCallbackWithResult(onextracallback2, onwarmupcompleted, (getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback) obj2);
                int i5 = 24 / 0;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback) {
            int i4 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            trackcustomtabsnavigationfailed.onExtraCallback.onWarmupCompleted(((findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback).IAuthTabCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed = (trackCustomTabsNavigationFailed) objArr[0];
        findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(getAdUnitIds.onExtraCallback.onNavigationEvent.onWarmupCompleted);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 27;
                IAuthTabCallback = i3 % 128;
                Object obj2 = null;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 == 0) {
                    trackCustomTabsNavigationFailed.onExtraCallbackWithResult(onextracallback);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = trackCustomTabsNavigationFailed.onExtraCallbackWithResult(onextracallback);
                int i4 = onExtraCallback + 63;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getAdUnitIds.onExtraCallback.onNavigationEvent.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getAdUnitIds.onExtraCallback.C0014onExtraCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 1;
                onWarmupCompleted = i3 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 != 0) {
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    throw null;
                }
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) trackCustomTabsNavigationFailed.onExtraCallbackWithResult(new Object[]{onextracallback}, -122442890, 122442892, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                int i4 = IAuthTabCallback + 57;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
                return unit;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getAdUnitIds.onExtraCallback.onWarmupCompleted.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = trackCustomTabsNavigationFailed.onWarmupCompleted((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onExtraCallback + 119;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 16 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.AppVersionCheckStateImpl$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = trackCustomTabsNavigationFailed.onExtraCallback(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = onNavigationEvent + 69;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 37 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // o.getAdUnitIds
    public getAdUnitIds.onExtraCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getAdUnitIds.onExtraCallback onextracallback = (getAdUnitIds.onExtraCallback) this.onWarmupCompleted.onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    @Override // o.getAdUnitIds
    public JsonReaderUnknownNumberParsing<getAdUnitIds.onExtraCallback> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.IAuthTabCallbackDefault().access000(), "");
            throw null;
        }
        JsonReaderUnknownNumberParsing<getAdUnitIds.onExtraCallback> jsonReaderUnknownNumberParsingAccess000 = this.onExtraCallback.IAuthTabCallbackDefault().access000();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAccess000, "");
        return jsonReaderUnknownNumberParsingAccess000;
    }

    @Override // o.getAdUnitIds
    public void onEvent(@NotNull getAdUnitIds.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onWarmupCompleted.onExtraCallback(onextracallbackwithresult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onWarmupCompleted.onExtraCallback(onextracallbackwithresult);
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(new Object[]{onextracallback}, -122442890, 122442892, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(trackCustomTabsNavigationFailed trackcustomtabsnavigationfailed, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(new Object[]{trackcustomtabsnavigationfailed, onextracallbackwithresult}, -697824560, 697824560, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getAdUnitIds.onExtraCallback.onWarmupCompleted onwarmupcompleted, getAdUnitIds.onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onExtraCallbackWithResult(new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallback}, -1361727840, 1361727841, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }
}
