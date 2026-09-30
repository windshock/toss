package o;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.getPluginVersion;
import o.trackAndLaunchVideoClick;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackAndLaunchVideoClick implements getPluginVersion {
    private static int asBinder = 1;
    private static int onExtraCallback;
    private final zzad IAuthTabCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final access27100<getPluginVersion.onExtraCallbackWithResult> onNavigationEvent;
    private final findSnapView<getPluginVersion.onExtraCallbackWithResult, getPluginVersion.onNavigationEvent, Object> onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i6) | i5);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i6);
        int i13 = (~(i8 | i6)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i6 + i5 + i + (1039959776 * i3) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i5) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i) + ((-201326592) * i3) + ((-406847488) * i2) + (529399808 * i16);
        int i18 = ((i6 * 868240256) - 1765242424) + (i5 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i * 868239597) + (i3 * 817356128) + (i2 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i19 == 2) {
            return IAuthTabCallback(objArr);
        }
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i20 = 2 % 2;
        int i21 = onExtraCallback + 61;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallback);
        int i23 = asBinder + 31;
        onExtraCallback = i23 % 128;
        int i24 = i23 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult c0019onExtraCallbackWithResult = (getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult) objArr[1];
        getPluginVersion.onNavigationEvent.onExtraCallback onextracallback2 = (getPluginVersion.onNavigationEvent.onExtraCallback) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(onextracallback, c0019onExtraCallbackWithResult, onextracallback2);
        int i4 = asBinder + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(trackAndLaunchVideoClick trackandlaunchvideoclick, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackandlaunchvideoclick, onextracallbackwithresult);
        int i4 = asBinder + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback);
        int i4 = asBinder + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(trackAndLaunchVideoClick trackandlaunchvideoclick, getPluginVersion.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackandlaunchvideoclick, onextracallbackwithresult);
        int i4 = asBinder + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getPluginVersion.onExtraCallbackWithResult.onExtraCallback onextracallback2, getPluginVersion.onNavigationEvent.C0020onNavigationEvent c0020onNavigationEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback5 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback6 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(iOnExtraCallback5, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback4, new Object[]{onextracallback, onextracallback2, c0020onNavigationEvent}, 522750414, -522750413);
        int i3 = asBinder + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackAndLaunchVideoClick trackandlaunchvideoclick, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(trackandlaunchvideoclick, iAuthTabCallback);
        }
        IAuthTabCallback(trackandlaunchvideoclick, iAuthTabCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    @Inject
    public trackAndLaunchVideoClick(@NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.IAuthTabCallback = zzadVar;
        this.onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(trackAndLaunchVideoClick.class.getSimpleName());
        this.onWarmupCompleted = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = trackAndLaunchVideoClick.onExtraCallback(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                int i4 = onWarmupCompleted + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        access27100<getPluginVersion.onExtraCallbackWithResult> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onNavigationEvent = access27100VarIAuthTabCallback;
        if (zzadVar.onActivityLayout()) {
            JsonReaderUnknownNumberParsing<getPluginVersion.onExtraCallbackWithResult> jsonReaderUnknownNumberParsingOnNavigationEvent = onNavigationEvent();
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 123;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnExtraCallbackWithResult = trackAndLaunchVideoClick.onExtraCallbackWithResult(this.f$0, (getPluginVersion.onExtraCallbackWithResult) obj);
                    int i4 = onNavigationEvent + 125;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            jsonReaderUnknownNumberParsingOnNavigationEvent.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 65;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    trackAndLaunchVideoClick.onWarmupCompleted(function1, obj);
                    int i4 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            });
            int i = asBinder + 5;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = onExtraCallback + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getPluginVersion.onExtraCallbackWithResult.onExtraCallback onextracallback2 = (getPluginVersion.onExtraCallbackWithResult.onExtraCallback) objArr[1];
        getPluginVersion.onNavigationEvent.C0020onNavigationEvent c0020onNavigationEvent = (getPluginVersion.onNavigationEvent.C0020onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        Intrinsics.checkNotNullParameter(c0020onNavigationEvent, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallback2, getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult.onExtraCallback, (Object) null, 2, (Object) null);
        int i4 = asBinder + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getPluginVersion.onNavigationEvent.C0020onNavigationEvent.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackAndLaunchVideoClick.onNavigationEvent(onextracallback, (getPluginVersion.onExtraCallbackWithResult.onExtraCallback) obj, (getPluginVersion.onNavigationEvent.C0020onNavigationEvent) obj2);
                int i5 = onWarmupCompleted + 45;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onNavigationEvent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult c0019onExtraCallbackWithResult, getPluginVersion.onNavigationEvent.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0019onExtraCallbackWithResult, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0019onExtraCallbackWithResult, getPluginVersion.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onExtraCallback + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getPluginVersion.onNavigationEvent.onExtraCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {onextracallback, (getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult) obj, (getPluginVersion.onNavigationEvent.onExtraCallback) obj2};
                    int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                    throw null;
                }
                Object[] objArr2 = {onextracallback, (getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult) obj, (getPluginVersion.onNavigationEvent.onExtraCallback) obj2};
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackAndLaunchVideoClick.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, objArr2, 42558712, -42558710);
                int i4 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationevent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(trackAndLaunchVideoClick trackandlaunchvideoclick, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackandlaunchvideoclick.onExtraCallbackWithResult;
            Objects.toString(iAuthTabCallback);
            trackandlaunchvideoclick.onNavigationEvent.onWarmupCompleted(((findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback).IAuthTabCallback());
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = trackandlaunchvideoclick.onExtraCallbackWithResult;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(final trackAndLaunchVideoClick trackandlaunchvideoclick, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(getPluginVersion.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackAndLaunchVideoClick.onExtraCallbackWithResult((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onWarmupCompleted + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 51 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getPluginVersion.onExtraCallbackWithResult.onExtraCallback.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(findSnapView.onExtraCallbackWithResult.onExtraCallback) obj};
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                if (i4 != 0) {
                    unit = (Unit) trackAndLaunchVideoClick.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, objArr, -416362810, 416362810);
                    int i5 = 47 / 0;
                } else {
                    unit = (Unit) trackAndLaunchVideoClick.IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback, objArr, -416362810, 416362810);
                }
                int i6 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.ServiceStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = trackAndLaunchVideoClick.onWarmupCompleted(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public getPluginVersion.onExtraCallbackWithResult onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getPluginVersion.onExtraCallbackWithResult onextracallbackwithresult = (getPluginVersion.onExtraCallbackWithResult) this.onWarmupCompleted.onWarmupCompleted();
        int i4 = asBinder + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(onExtraCallback(), getPluginVersion.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(onExtraCallback(), getPluginVersion.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted);
        int i3 = onExtraCallback + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zAreEqual;
    }

    @Override // o.getPluginVersion
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onExtraCallback = i2 % 128;
        boolean zOnWarmupCompleted = i2 % 2 != 0 ? onWarmupCompleted() : !onWarmupCompleted();
        int i3 = asBinder + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    @Override // o.getPluginVersion
    public findSnapView.IAuthTabCallback<getPluginVersion.onExtraCallbackWithResult, getPluginVersion.onNavigationEvent, Object> IAuthTabCallback(@NotNull getPluginVersion.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            return this.onWarmupCompleted.onExtraCallback(onnavigationevent);
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i3 = 4 / 0;
        return this.onWarmupCompleted.onExtraCallback(onnavigationevent);
    }

    @Override // o.getPluginVersion
    public JsonReaderUnknownNumberParsing<getPluginVersion.onExtraCallbackWithResult> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderUnknownNumberParsing<getPluginVersion.onExtraCallbackWithResult> jsonReaderUnknownNumberParsingAccess000 = this.onNavigationEvent.IAuthTabCallbackDefault().access000();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAccess000, "");
        int i4 = asBinder + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonReaderUnknownNumberParsingAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
    }

    private static final Unit onWarmupCompleted(trackAndLaunchVideoClick trackandlaunchvideoclick, getPluginVersion.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackandlaunchvideoclick.onExtraCallbackWithResult;
        Objects.toString(onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{onextracallback}, -416362810, 416362810);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getPluginVersion.onExtraCallbackWithResult.C0019onExtraCallbackWithResult c0019onExtraCallbackWithResult, getPluginVersion.onNavigationEvent.onExtraCallback onextracallback2) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{onextracallback, c0019onExtraCallbackWithResult, onextracallback2}, 42558712, -42558710);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getPluginVersion.onExtraCallbackWithResult.onExtraCallback onextracallback2, getPluginVersion.onNavigationEvent.C0020onNavigationEvent c0020onNavigationEvent) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(iOnExtraCallback2, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, new Object[]{onextracallback, onextracallback2, c0020onNavigationEvent}, 522750414, -522750413);
    }
}
