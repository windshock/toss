package o;

import com.google.android.gms.internal.ads.zzgsa;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.getSdkKey;
import o.trackCustomTabsNavigationStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsNavigationStarted implements getSdkKey {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private final AppSetIdAndScope1 IAuthTabCallback;
    private getTestDeviceAdvertisingIds onExtraCallback;
    private final zzad onExtraCallbackWithResult;
    private final findSnapView<getSdkKey.onNavigationEvent, getSdkKey.onExtraCallback, Object> onNavigationEvent;
    private final access27100<getSdkKey.onNavigationEvent> onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8 | i4)) | (~(i2 | i | i4));
        int i10 = ~i4;
        int i11 = (~(i8 | i2)) | (~(i8 | i10));
        int i12 = (~(i4 | i)) | (~(i7 | i10));
        int i13 = i2 + i + i3 + ((-564018846) * i6) + (483938512 * i5);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i2) + 752877568 + ((-1516524009) * i) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i3) + (1390411776 * i6) + (452984832 * i5) + ((-1135738880) * i14);
        int i16 = ((i2 * 1456092922) - 824780772) + (i * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i3 * 1456093799) + (i6 * 578355822) + (i5 * 1098359728) + (i14 * 1868693504);
        int i17 = i15 + (i16 * i16 * 2110914560);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(87996888, new Object[]{onextracallback}, -87996885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        int i3 = onTransact + 75;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(trackcustomtabsnavigationstarted, onextracallbackwithresult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(trackcustomtabsnavigationstarted, onextracallbackwithresult);
        int i3 = IAuthTabCallbackDefault + 101;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSdkKey.onNavigationEvent.IAuthTabCallback iAuthTabCallback = (getSdkKey.onNavigationEvent.IAuthTabCallback) objArr[1];
        getSdkKey.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = (getSdkKey.onExtraCallback.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(onextracallback, iAuthTabCallback, onextracallbackwithresult);
        }
        onNavigationEvent(onextracallback, iAuthTabCallback, onextracallbackwithresult);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackcustomtabsnavigationstarted, iAuthTabCallback);
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent, getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(-116963919, new Object[]{onextracallback, c0024onNavigationEvent, onnavigationevent}, 116963920, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getSdkKey.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent = onNavigationEvent(onextracallback, onextracallbackwithresult, onextracallbackwithresult2);
        int i4 = onTransact + 95;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSdkKey.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = (getSdkKey.onNavigationEvent.onExtraCallbackWithResult) objArr[1];
        getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent = (getSdkKey.onExtraCallback.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, onextracallbackwithresult, onnavigationevent);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 83;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback);
        int i4 = onTransact + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(onextracallback);
        int i4 = onTransact + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, getSdkKey.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(trackcustomtabsnavigationstarted, onnavigationevent);
        }
        IAuthTabCallback(trackcustomtabsnavigationstarted, onnavigationevent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent, getSdkKey.onExtraCallback.C0023onExtraCallback c0023onExtraCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, c0024onNavigationEvent, c0023onExtraCallback);
        int i4 = onTransact + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }

    @Inject
    public trackCustomTabsNavigationStarted(@NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onExtraCallbackWithResult = zzadVar;
        this.IAuthTabCallback = ea10.onExtraCallbackWithResult(trackCustomTabsNavigationStarted.class.getSimpleName());
        this.onNavigationEvent = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda9
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted = this.f$0;
                findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) obj;
                if (i3 == 0) {
                    return trackCustomTabsNavigationStarted.IAuthTabCallback(trackcustomtabsnavigationstarted, onextracallbackwithresult);
                }
                trackCustomTabsNavigationStarted.IAuthTabCallback(trackcustomtabsnavigationstarted, onextracallbackwithresult);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        access27100<getSdkKey.onNavigationEvent> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onWarmupCompleted());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.onWarmupCompleted = access27100VarIAuthTabCallback;
        if (zzadVar.onActivityLayout()) {
            JsonReaderUnknownNumberParsing<getSdkKey.onNavigationEvent> jsonReaderUnknownNumberParsingOnNavigationEvent = onNavigationEvent(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 123;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted = this.f$0;
                    getSdkKey.onNavigationEvent onnavigationevent = (getSdkKey.onNavigationEvent) obj;
                    if (i3 != 0) {
                        return trackCustomTabsNavigationStarted.onWarmupCompleted(trackcustomtabsnavigationstarted, onnavigationevent);
                    }
                    trackCustomTabsNavigationStarted.onWarmupCompleted(trackcustomtabsnavigationstarted, onnavigationevent);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            jsonReaderUnknownNumberParsingOnNavigationEvent.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda11
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 53;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    trackCustomTabsNavigationStarted.onWarmupCompleted(function1, obj);
                    int i4 = onNavigationEvent + 19;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }
            });
            int i = IAuthTabCallbackDefault + 89;
            onTransact = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = onTransact + 7;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onWarmupCompleted(@Nullable getTestDeviceAdvertisingIds gettestdeviceadvertisingids) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = gettestdeviceadvertisingids;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, getSdkKey.onNavigationEvent.IAuthTabCallback.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getSdkKey.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, getSdkKey.onNavigationEvent.C0024onNavigationEvent.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {onextracallback, (getSdkKey.onNavigationEvent.onExtraCallbackWithResult) obj, (getSdkKey.onExtraCallback.onNavigationEvent) obj2};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackCustomTabsNavigationStarted.IAuthTabCallback(2077289040, objArr2, -2077289038, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                int i5 = onExtraCallback + 5;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSdkKey.onExtraCallback.onNavigationEvent.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSdkKey.onExtraCallback.onExtraCallbackWithResult.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationStarted.onExtraCallbackWithResult(onextracallback, (getSdkKey.onNavigationEvent.onExtraCallbackWithResult) obj, (getSdkKey.onExtraCallback.onExtraCallbackWithResult) obj2);
                    int i4 = 79 / 0;
                } else {
                    onnavigationeventOnExtraCallbackWithResult = trackCustomTabsNavigationStarted.onExtraCallbackWithResult(onextracallback, (getSdkKey.onNavigationEvent.onExtraCallbackWithResult) obj, (getSdkKey.onExtraCallback.onExtraCallbackWithResult) obj2);
                }
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.IAuthTabCallback iAuthTabCallback, getSdkKey.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent.onNavigationEvent, (Object) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent.onNavigationEvent, (Object) null, 2, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onextracallback.onWarmupCompleted(findSnapView.onWarmupCompleted.Companion.onWarmupCompleted(getSdkKey.onExtraCallback.onExtraCallbackWithResult.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (getSdkKey.onNavigationEvent.IAuthTabCallback) obj, (getSdkKey.onExtraCallback.onExtraCallbackWithResult) obj2};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackCustomTabsNavigationStarted.IAuthTabCallback(-1223248376, objArr, 1223248376, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                int i5 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent = (getSdkKey.onNavigationEvent.C0024onNavigationEvent) objArr[1];
        getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent = (getSdkKey.onExtraCallback.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0024onNavigationEvent, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0024onNavigationEvent, getSdkKey.onNavigationEvent.IAuthTabCallback.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = IAuthTabCallbackDefault + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent, getSdkKey.onExtraCallback.C0023onExtraCallback c0023onExtraCallback) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(c0024onNavigationEvent, "");
            Intrinsics.checkNotNullParameter(c0023onExtraCallback, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0024onNavigationEvent, getSdkKey.onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(c0024onNavigationEvent, "");
            Intrinsics.checkNotNullParameter(c0023onExtraCallback, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0024onNavigationEvent, getSdkKey.onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        }
        int i3 = IAuthTabCallbackDefault + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit asBinder(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    onnavigationeventOnExtraCallback = trackCustomTabsNavigationStarted.onExtraCallback(onextracallback, (getSdkKey.onNavigationEvent.C0024onNavigationEvent) obj, (getSdkKey.onExtraCallback.onNavigationEvent) obj2);
                    int i4 = 94 / 0;
                } else {
                    onnavigationeventOnExtraCallback = trackCustomTabsNavigationStarted.onExtraCallback(onextracallback, (getSdkKey.onNavigationEvent.C0024onNavigationEvent) obj, (getSdkKey.onExtraCallback.onNavigationEvent) obj2);
                }
                int i5 = onWarmupCompleted + 117;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnExtraCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSdkKey.onExtraCallback.onNavigationEvent.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSdkKey.onExtraCallback.C0023onExtraCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 51;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent = (getSdkKey.onNavigationEvent.C0024onNavigationEvent) obj;
                if (i4 != 0) {
                    return trackCustomTabsNavigationStarted.onWarmupCompleted(onextracallback2, c0024onNavigationEvent, (getSdkKey.onExtraCallback.C0023onExtraCallback) obj2);
                }
                trackCustomTabsNavigationStarted.onWarmupCompleted(onextracallback2, c0024onNavigationEvent, (getSdkKey.onExtraCallback.C0023onExtraCallback) obj2);
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationstarted.IAuthTabCallback;
            Objects.toString(iAuthTabCallback);
            findSnapView.IAuthTabCallback.onExtraCallback onextracallback = (findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback;
            trackcustomtabsnavigationstarted.onWarmupCompleted(((getSdkKey.onExtraCallback) onextracallback.onExtraCallbackWithResult()).onWarmupCompleted());
            trackcustomtabsnavigationstarted.onWarmupCompleted.onWarmupCompleted(onextracallback.IAuthTabCallback());
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = trackcustomtabsnavigationstarted.IAuthTabCallback;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(getSdkKey.onNavigationEvent.onExtraCallbackWithResult.onExtraCallbackWithResult);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 49;
                onExtraCallback = i3 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i3 % 2 == 0) {
                    trackCustomTabsNavigationStarted.IAuthTabCallback(onextracallback);
                    throw null;
                }
                Unit unitIAuthTabCallback = trackCustomTabsNavigationStarted.IAuthTabCallback(onextracallback);
                int i4 = IAuthTabCallback + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSdkKey.onNavigationEvent.onExtraCallbackWithResult.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSdkKey.onNavigationEvent.IAuthTabCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = trackCustomTabsNavigationStarted.onNavigationEvent((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSdkKey.onNavigationEvent.C0024onNavigationEvent.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = trackCustomTabsNavigationStarted.onWarmupCompleted((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = onWarmupCompleted + 107;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.CheckoutStateImpl$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = trackCustomTabsNavigationStarted.onExtraCallback(this.f$0, (findSnapView.IAuthTabCallback) obj);
                int i5 = onNavigationEvent + 49;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getSdkKey
    public getSdkKey.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSdkKey.onNavigationEvent onnavigationevent = (getSdkKey.onNavigationEvent) this.onNavigationEvent.onWarmupCompleted();
        int i3 = IAuthTabCallbackDefault + 65;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    @Override // o.getSdkKey
    public findSnapView.IAuthTabCallback<getSdkKey.onNavigationEvent, getSdkKey.onExtraCallback, Object> IAuthTabCallback(@NotNull getSdkKey.onExtraCallback onextracallback) {
        findSnapView.IAuthTabCallback<getSdkKey.onNavigationEvent, getSdkKey.onExtraCallback, Object> iAuthTabCallbackOnExtraCallback;
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            iAuthTabCallbackOnExtraCallback = this.onNavigationEvent.onExtraCallback(onextracallback);
            int i3 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            iAuthTabCallbackOnExtraCallback = this.onNavigationEvent.onExtraCallback(onextracallback);
        }
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iAuthTabCallbackOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public JsonReaderUnknownNumberParsing<getSdkKey.onNavigationEvent> onNavigationEvent(boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.onWarmupCompleted.IAuthTabCallbackDefault().access000();
            if (z) {
                j = 0;
            } else {
                int i3 = onTransact + 113;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                j = 1;
            }
            JsonReaderUnknownNumberParsing<getSdkKey.onNavigationEvent> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
            int i5 = onTransact + 39;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return jsonReaderUnknownNumberParsingOnNavigationEvent;
        }
        this.onWarmupCompleted.IAuthTabCallbackDefault().access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(trackCustomTabsNavigationStarted trackcustomtabsnavigationstarted, getSdkKey.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackcustomtabsnavigationstarted.IAuthTabCallback;
        Objects.toString(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult, getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(2077289040, new Object[]{onextracallback, onextracallbackwithresult, onnavigationevent}, -2077289038, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.IAuthTabCallback iAuthTabCallback, getSdkKey.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(-1223248376, new Object[]{onextracallback, iAuthTabCallback, onextracallbackwithresult}, 1223248376, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (Unit) IAuthTabCallback(87996888, new Object[]{onextracallback}, -87996885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSdkKey.onNavigationEvent.C0024onNavigationEvent c0024onNavigationEvent, getSdkKey.onExtraCallback.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) IAuthTabCallback(-116963919, new Object[]{onextracallback, c0024onNavigationEvent, onnavigationevent}, 116963920, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
    }
}
