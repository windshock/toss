package o;

import im.toss.core.cache.RxSharedApiCall;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.bank.tuba.BankTubaDistribution$;
import im.toss.state.spec.SessionState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class calculateSpeed {
    private static final Lazy IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static final Map<String, RxSharedApiCall<Boolean>> onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static int onTransact = 1;
    public static final calculateSpeed onWarmupCompleted;

    public static /* synthetic */ SessionState onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionStateAsInterface = asInterface();
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return sessionStateAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(SessionState.State state) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(state);
        }
        onNavigationEvent(state);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = asBinder + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ setValues onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setValues setvaluesOnTransact = onTransact();
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setvaluesOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private calculateSpeed() {
    }

    static {
        calculateSpeed calculatespeed = new calculateSpeed();
        onWarmupCompleted = calculatespeed;
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new BankTubaDistribution$.ExternalSyntheticLambda0());
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new BankTubaDistribution$.ExternalSyntheticLambda1());
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new BankTubaDistribution$.ExternalSyntheticLambda2());
        onExtraCallback = new LinkedHashMap();
        calculatespeed.IAuthTabCallbackDefault().onExtraCallbackWithResult(true).asInterface().onWarmupCompleted(NetConverter3.onExtraCallback()).IAuthTabCallback(new BankTubaDistribution$.ExternalSyntheticLambda4(new BankTubaDistribution$.ExternalSyntheticLambda3()));
        int i = asInterface + 63;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    private final SessionState IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionState = (SessionState) onNavigationEvent.getValue();
        if (i3 == 0) {
            return sessionState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final SessionState asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        SessionState sessionStatePerformMenuItemShortcut = ((SessionState.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionState.onExtraCallback.class)).performMenuItemShortcut();
        int i4 = asBinder + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return sessionStatePerformMenuItemShortcut;
    }

    private static final setValues onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        setValues setvaluesUpdateVisuals = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).updateVisuals();
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setvaluesUpdateVisuals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getRearDisplayPresentation IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        getRearDisplayPresentation getreardisplaypresentationAsInterface = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).asInterface();
        int i4 = asBinder + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return getreardisplaypresentationAsInterface;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(SessionState.State state) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted.onExtraCallbackWithResult();
        if (i3 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.clear();
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = ~((~i) | i9);
        int i11 = ~(i9 | i3);
        int i12 = i10 | i11;
        int i13 = (~(i | i7)) | i11 | i8;
        int i14 = i5 + i3 + i2 + ((-168536539) * i6) + (1787681333 * i4);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i5) + 1460535296 + ((-923239215) * i3) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i4) + (1778253824 * i15);
        int i17 = (i5 * (-925914073)) + 175428941 + (i3 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i2 * (-925913209)) + (i6 * 1252505731) + (i4 * 30625011) + (i15 * (-2030960640));
        if (i16 + (i17 * i17 * 899809280) == 1) {
            return onWarmupCompleted(objArr);
        }
        int i18 = 2 % 2;
        int i19 = asBinder + 95;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        getRearDisplayPresentation getreardisplaypresentationIAuthTabCallback = IAuthTabCallback();
        int i21 = asBinder + 37;
        onTransact = i21 % 128;
        int i22 = i21 % 2;
        return getreardisplaypresentationIAuthTabCallback;
    }

    public static /* synthetic */ getRearDisplayPresentation onNavigationEvent() {
        return (getRearDisplayPresentation) IAuthTabCallback(new Object[0], WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -713661886, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 713661886, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
    }
}
