package o;

import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.tds.view.R;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.findSnapView;
import o.getSegmentCollection;
import o.trackImpression;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackImpression implements getSegmentCollection {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final access27100<getSegmentCollection.onExtraCallback> IAuthTabCallback;
    private final AppSetIdAndScope1 onNavigationEvent = ea10.onExtraCallbackWithResult(trackImpression.class.getSimpleName());
    private final findSnapView<getSegmentCollection.onExtraCallback, getSegmentCollection.onWarmupCompleted, Object> onExtraCallback = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda6
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = trackImpression.onWarmupCompleted(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
            int i4 = onNavigationEvent + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    static {
        int i = asInterface + 61;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) objArr[1];
        getSegmentCollection.onWarmupCompleted.IAuthTabCallback iAuthTabCallback = (getSegmentCollection.onWarmupCompleted.IAuthTabCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallback);
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallback);
        int i3 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1042544946, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1042544929);
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(trackImpression trackimpression, findSnapView.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(trackimpression, iAuthTabCallback);
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(trackImpression trackimpression, getSegmentCollection.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trackimpression, onextracallback);
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, iAuthTabCallbackStub, asinterface);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onTransact ontransact) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, iAuthTabCallbackStub, ontransact);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onNavigationEvent2;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, c0025onExtraCallback, access100Var);
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(onextracallback, onextracallbackwithresult, iAuthTabCallbackDefault);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, onextracallbackwithresult, iAuthTabCallbackDefault);
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onNavigationEvent2;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onTransact ontransact, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, ontransact, access100Var);
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(onextracallback, onwarmupcompleted, access100Var);
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, onwarmupcompleted, access100Var);
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) objArr[1];
        getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = (getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, iAuthTabCallbackStub, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return onNavigationEvent2;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(onextracallback);
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedObject;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent = (getSegmentCollection.onExtraCallback.onNavigationEvent) objArr[1];
        getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(onextracallback, onnavigationevent, iAuthTabCallbackStubProxy);
        }
        onNavigationEvent(onextracallback, onnavigationevent, iAuthTabCallbackStubProxy);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(onextracallback);
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) objArr[1];
        getSegmentCollection.onWarmupCompleted.onExtraCallback onextracallback2 = (getSegmentCollection.onWarmupCompleted.onExtraCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(onextracallback, iAuthTabCallbackStub, onextracallback2);
        }
        onExtraCallback(onextracallback, iAuthTabCallbackStub, onextracallback2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault iAuthTabCallbackDefault = (getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault) objArr[1];
        getSegmentCollection.onWarmupCompleted.access100 access100Var = (getSegmentCollection.onWarmupCompleted.access100) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, iAuthTabCallbackDefault, access100Var);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback = (getSegmentCollection.onExtraCallback.IAuthTabCallback) objArr[1];
        getSegmentCollection.onWarmupCompleted.access100 access100Var = (getSegmentCollection.onWarmupCompleted.access100) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(onextracallback, iAuthTabCallback, access100Var);
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    public static /* synthetic */ Unit asBinder(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onextracallback};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        if (i3 == 0) {
            unit = (Unit) onNavigationEvent(iOnNavigationEvent, -155525926, objArr, iOnNavigationEvent2, iOnNavigationEvent4, iOnNavigationEvent3, 155525938);
            int i4 = 97 / 0;
        } else {
            unit = (Unit) onNavigationEvent(iOnNavigationEvent, -155525926, objArr, iOnNavigationEvent2, iOnNavigationEvent4, iOnNavigationEvent3, 155525938);
        }
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(onextracallback);
        int i4 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(onextracallback);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(onextracallback);
        }
        extraCallback(onextracallback);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel iAuthTabCallback_Parcel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallback_Parcel);
        }
        IAuthTabCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallback_Parcel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted c0026onWarmupCompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(onextracallback, iAuthTabCallbackStub, c0026onWarmupCompleted);
        }
        onWarmupCompleted(onextracallback, iAuthTabCallbackStub, c0026onWarmupCompleted);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asInterface asinterface, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(onextracallback, asinterface, access100Var);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, asinterface, access100Var);
        int i3 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onNavigationEvent2;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, onextracallbackwithresult, iAuthTabCallbackStub);
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(onextracallback, onnavigationevent, access100Var);
        }
        onNavigationEvent(onextracallback, onnavigationevent, access100Var);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onTransact ontransact, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, ontransact, iAuthTabCallbackStubProxy);
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return onNavigationEvent2;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback = (getSegmentCollection.onExtraCallback.C0025onExtraCallback) objArr[1];
        getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(onextracallback, c0025onExtraCallback, iAuthTabCallbackStubProxy);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, c0025onExtraCallback, iAuthTabCallbackStubProxy);
        int i3 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault iAuthTabCallbackDefault, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(onextracallback, iAuthTabCallbackDefault, iAuthTabCallbackStubProxy);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, iAuthTabCallbackDefault, iAuthTabCallbackStubProxy);
        int i3 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return onNavigationEvent2;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallbackStubProxy);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(onextracallback, onextracallbackwithresult, iAuthTabCallbackStubProxy);
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.getInterfaceDescriptor getinterfacedescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(onextracallback, onnavigationevent, getinterfacedescriptor);
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = onNavigationEvent(onextracallback, onnavigationevent, getinterfacedescriptor);
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i2;
        int i10 = (~(i9 | i6)) | i8;
        int i11 = ~i;
        int i12 = i11 | i6;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i6 + i2 + i3 + ((-1254723898) * i5) + ((-1667789834) * i4);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i6) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i5) + ((-106430464) * i4) + (1552875520 * i18);
        int i20 = ((i6 * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i3 * (-402393527)) + (i5 * (-1219896714)) + (i4 * (-610841306)) + (i18 * (-825819136));
        switch (i19 + (i20 * i20 * (-1063190528))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
                getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted = (getSegmentCollection.onExtraCallback.onWarmupCompleted) objArr[1];
                getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) objArr[2];
                int i21 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 344816664, new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -344816655);
                int i24 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                return onnavigationevent;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access000(objArr);
            case 13:
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
                getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = (getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) objArr[1];
                getSegmentCollection.onWarmupCompleted.access100 access100Var = (getSegmentCollection.onWarmupCompleted.access100) objArr[2];
                int i26 = 2 % 2;
                int i27 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(access100Var, "");
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback2, onextracallbackwithresult, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
                int i29 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i29 % 128;
                int i30 = i29 % 2;
                return onnavigationeventOnWarmupCompleted;
            case 14:
                return access100(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback3 = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
                int i31 = 2 % 2;
                Intrinsics.checkNotNullParameter(onextracallback3, "");
                Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda20
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i32 = 2 % 2;
                        int i33 = onExtraCallbackWithResult + 55;
                        onExtraCallback = i33 % 128;
                        int i34 = i33 % 2;
                        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackImpression.IAuthTabCallback(onextracallback3, (getSegmentCollection.onExtraCallback.onTransact) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                        int i35 = onExtraCallbackWithResult + 83;
                        onExtraCallback = i35 % 128;
                        int i36 = i35 % 2;
                        return onnavigationeventIAuthTabCallback;
                    }
                };
                findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent2 = findSnapView.onWarmupCompleted.Companion;
                onextracallback3.onWarmupCompleted(onnavigationevent2.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
                onextracallback3.onWarmupCompleted(onnavigationevent2.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda21
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i32 = 2 % 2;
                        int i33 = onNavigationEvent + 45;
                        onExtraCallbackWithResult = i33 % 128;
                        if (i33 % 2 != 0) {
                            trackImpression.onExtraCallback(onextracallback3, (getSegmentCollection.onExtraCallback.onTransact) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                            throw null;
                        }
                        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackImpression.onExtraCallback(onextracallback3, (getSegmentCollection.onExtraCallback.onTransact) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                        int i34 = onNavigationEvent + 45;
                        onExtraCallbackWithResult = i34 % 128;
                        if (i34 % 2 == 0) {
                            return onnavigationeventOnExtraCallback;
                        }
                        throw null;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i32 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i32 % 128;
                int i33 = i32 % 2;
                return unit;
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1362896432, new Object[]{onextracallback, iAuthTabCallback, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1362896435);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, iAuthTabCallbackStub, iAuthTabCallbackDefault);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, iAuthTabCallbackStub, iAuthTabCallbackStub2);
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asInterface asinterface, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, asinterface, iAuthTabCallbackStubProxy);
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    public static /* synthetic */ Unit onTransact(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {onextracallback};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent, -914191948, objArr, iOnNavigationEvent2, iOnNavigationEvent4, iOnNavigationEvent3, 914191964);
        int i4 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(onextracallback);
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            extraCallbackWithResult(onextracallback);
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(onextracallback);
        int i3 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackImpression trackimpression, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {trackimpression, onextracallbackwithresult};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent, 500529670, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -500529669);
        int i4 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.asBinder asbinder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, iAuthTabCallbackStub, asbinder);
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(onextracallback, iAuthTabCallbackStub, onnavigationevent);
        }
        onNavigationEvent(onextracallback, iAuthTabCallbackStub, onnavigationevent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asBinder asbinder, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(onextracallback, asbinder, iAuthTabCallbackStubProxy);
        }
        onNavigationEvent(onextracallback, asbinder, iAuthTabCallbackStubProxy);
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asBinder asbinder, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, asbinder, access100Var);
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1936186530, new Object[]{onextracallback, onextracallbackwithresult, access100Var}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1936186543);
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    @Inject
    public trackImpression() {
        access27100<getSegmentCollection.onExtraCallback> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onExtraCallbackWithResult());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.IAuthTabCallback = access27100VarIAuthTabCallback;
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            JsonReaderUnknownNumberParsing<getSegmentCollection.onExtraCallback> jsonReaderUnknownNumberParsingIAuthTabCallback = IAuthTabCallback(true);
            final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda7
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 71;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    trackImpression trackimpression = this.f$0;
                    getSegmentCollection.onExtraCallback onextracallback = (getSegmentCollection.onExtraCallback) obj;
                    if (i3 == 0) {
                        return trackImpression.IAuthTabCallback(trackimpression, onextracallback);
                    }
                    trackImpression.IAuthTabCallback(trackimpression, onextracallback);
                    throw null;
                }
            };
            jsonReaderUnknownNumberParsingIAuthTabCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda8
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 1;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    trackImpression.onExtraCallback(function1, obj);
                    int i4 = onExtraCallback + 43;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
            });
            int i = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 % 5;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onTransact ontransact) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.asBinder.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.asBinder asbinder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            Intrinsics.checkNotNullParameter(asbinder, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault.onWarmupCompleted, (Object) null, 3, (Object) null);
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(asbinder, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault.onWarmupCompleted, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted c0026onWarmupCompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(c0026onWarmupCompleted, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, new getSegmentCollection.onExtraCallback.onNavigationEvent(getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted.onExtraCallback), (Object) null, 2, (Object) null);
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, new getSegmentCollection.onExtraCallback.onNavigationEvent(getSegmentCollection.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback), (Object) null, 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onExtraCallback onextracallback2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, new getSegmentCollection.onExtraCallback.onNavigationEvent(getSegmentCollection.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult), (Object) null, 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel iAuthTabCallback_Parcel) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback_Parcel, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.asInterface.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.onWarmupCompleted.onExtraCallback, (Object) null, 4, (Object) null);
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.onWarmupCompleted.onExtraCallback, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onNavigationEvent onnavigationevent) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.C0025onExtraCallback.onWarmupCompleted, (Object) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, getSegmentCollection.onExtraCallback.C0025onExtraCallback.onWarmupCompleted, (Object) null, 2, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, new getSegmentCollection.onExtraCallback.onTransact(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault.onWarmupCompleted), (Object) null, 2, (Object) null);
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub2, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackStub, new getSegmentCollection.onExtraCallback.onTransact(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.onNavigationEvent), (Object) null, 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda35
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 83;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    trackImpression.onExtraCallbackWithResult(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackImpression.onExtraCallbackWithResult(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                int i4 = IAuthTabCallback + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.asInterface.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj;
                if (i4 == 0) {
                    return trackImpression.IAuthTabCallback(onextracallback2, iAuthTabCallbackStub, (getSegmentCollection.onWarmupCompleted.asInterface) obj2);
                }
                trackImpression.IAuthTabCallback(onextracallback2, iAuthTabCallbackStub, (getSegmentCollection.onWarmupCompleted.asInterface) obj2);
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.onTransact.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda39
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackImpression.IAuthTabCallback(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onTransact) obj2);
                int i5 = IAuthTabCallback + 37;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.asBinder.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda40
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 43;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj;
                if (i4 != 0) {
                    return trackImpression.onWarmupCompleted(onextracallback2, iAuthTabCallbackStub, (getSegmentCollection.onWarmupCompleted.asBinder) obj2);
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback2, iAuthTabCallbackStub, (getSegmentCollection.onWarmupCompleted.asBinder) obj2);
                int i5 = 62 / 0;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda41
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub = (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj;
                getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted c0026onWarmupCompleted = (getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted) obj2;
                if (i4 == 0) {
                    return trackImpression.onExtraCallback(onextracallback2, iAuthTabCallbackStub, c0026onWarmupCompleted);
                }
                trackImpression.onExtraCallback(onextracallback2, iAuthTabCallbackStub, c0026onWarmupCompleted);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda42
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallback) obj2};
                if (i4 != 0) {
                    return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1840870592, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1840870590);
                }
                int i5 = 7 / 0;
                return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1840870592, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1840870590);
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.onExtraCallback.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda43
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onExtraCallback) obj2};
                    throw null;
                }
                Object[] objArr2 = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onExtraCallback) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1758723275, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1758723286);
                int i4 = onExtraCallback + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationevent2;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda44
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    trackImpression.onExtraCallback(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackImpression.onExtraCallback(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallback_Parcel) obj2);
                int i4 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 66 / 0;
                }
                return onnavigationeventOnExtraCallback;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda45
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1964260113, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1964260121);
                int i5 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationevent2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.onNavigationEvent.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda46
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 73;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onNavigationEvent) obj2);
                    int i4 = 84 / 0;
                } else {
                    onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.onNavigationEvent) obj2);
                }
                int i5 = onExtraCallback + 123;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda36
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault) obj2);
                int i4 = IAuthTabCallback + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return onNavigationEvent2;
                }
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda37
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                IAuthTabCallback = i3 % 128;
                Object obj3 = null;
                if (i3 % 2 == 0) {
                    trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub) obj2);
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackStub) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub) obj2);
                int i4 = IAuthTabCallback + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return onNavigationEvent2;
                }
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asInterface asinterface, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asinterface, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asinterface, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asInterface asinterface, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(asinterface, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asinterface, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(asinterface, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asinterface, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        }
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackImpression.onExtraCallback(onextracallback, (getSegmentCollection.onExtraCallback.asInterface) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                int i5 = onNavigationEvent + 97;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
                return onnavigationeventOnExtraCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda19
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.asInterface) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                int i5 = onExtraCallback + 73;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onNavigationEvent2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        }
        int i3 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, new getSegmentCollection.onExtraCallback.onTransact(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault.onWarmupCompleted), (Object) null, 2, (Object) null);
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult, new getSegmentCollection.onExtraCallback.onTransact(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.onNavigationEvent), (Object) null, 2, (Object) null);
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit getInterfaceDescriptor(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback, (getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                int i5 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = (getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) obj;
                if (i4 == 0) {
                    return trackImpression.onExtraCallbackWithResult(onextracallback2, onextracallbackwithresult, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                }
                trackImpression.onExtraCallbackWithResult(onextracallback2, onextracallbackwithresult, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackImpression.IAuthTabCallback(onextracallback, (getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackDefault) obj2);
                int i5 = onNavigationEvent + 57;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackImpression.onExtraCallback(onextracallback, (getSegmentCollection.onExtraCallback.onExtraCallbackWithResult) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStub) obj2);
                int i5 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onwarmupcompleted, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted = (getSegmentCollection.onExtraCallback.onWarmupCompleted) objArr[1];
        getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onwarmupcompleted, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = trackImpression.IAuthTabCallback(onextracallback, (getSegmentCollection.onExtraCallback.onWarmupCompleted) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                int i5 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.onWarmupCompleted) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2};
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object[] objArr2 = {onextracallback, (getSegmentCollection.onExtraCallback.onWarmupCompleted) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1916532628, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1916532632);
                int i4 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 96 / 0;
                }
                return onnavigationevent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        }
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback = (getSegmentCollection.onExtraCallback.IAuthTabCallback) objArr[1];
        getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda16
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallback) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -639506734, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 639506741);
                int i5 = onExtraCallbackWithResult + 17;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent2 = trackImpression.onNavigationEvent(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallback) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                int i5 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onNavigationEvent2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asBinder asbinder, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asbinder, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asbinder, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.asBinder asbinder, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(asbinder, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asbinder, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(asbinder, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, asbinder, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit writeTypedObject(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda33
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback, (getSegmentCollection.onExtraCallback.asBinder) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                int i5 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
                return onnavigationeventOnWarmupCompleted;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda34
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = trackImpression.onWarmupCompleted(onextracallback, (getSegmentCollection.onExtraCallback.asBinder) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                int i5 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault iAuthTabCallbackDefault, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackDefault, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackDefault, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault iAuthTabCallbackDefault, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackDefault, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, iAuthTabCallbackDefault, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
    }

    private static final Unit extraCallback(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda14
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2};
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object[] objArr2 = {onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 728519320, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -728519306);
                int i4 = onWarmupCompleted + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationevent;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackImpression.onExtraCallbackWithResult(onextracallback, (getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2);
                int i5 = IAuthTabCallback + 95;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.getInterfaceDescriptor getinterfacedescriptor) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(getinterfacedescriptor, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        }
        int i3 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 3, (Object) null);
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, onnavigationevent, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
    }

    private static final Unit extraCallbackWithResult(final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = trackImpression.onExtraCallbackWithResult(onextracallback, (getSegmentCollection.onExtraCallback.onNavigationEvent) obj, (getSegmentCollection.onWarmupCompleted.getInterfaceDescriptor) obj2);
                int i5 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.getInterfaceDescriptor.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = trackImpression.onExtraCallback(onextracallback, (getSegmentCollection.onExtraCallback.onNavigationEvent) obj, (getSegmentCollection.onWarmupCompleted.access100) obj2);
                int i5 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 99 / 0;
                }
                return onnavigationeventOnExtraCallback;
            }
        });
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda13
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (getSegmentCollection.onExtraCallback.onNavigationEvent) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2};
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent2 = (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 869010176, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -869010170);
                int i5 = onExtraCallback + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0025onExtraCallback, "");
        Intrinsics.checkNotNullParameter(access100Var, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0025onExtraCallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        int i4 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(c0025onExtraCallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, c0025onExtraCallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
        int i4 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback2 = onextracallback;
                getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback = (getSegmentCollection.onExtraCallback.C0025onExtraCallback) obj;
                getSegmentCollection.onWarmupCompleted.access100 access100Var = (getSegmentCollection.onWarmupCompleted.access100) obj2;
                if (i4 != 0) {
                    return trackImpression.IAuthTabCallback(onextracallback2, c0025onExtraCallback, access100Var);
                }
                trackImpression.IAuthTabCallback(onextracallback2, c0025onExtraCallback, access100Var);
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.access100.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy.class), new Function2() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {onextracallback, (getSegmentCollection.onExtraCallback.C0025onExtraCallback) obj, (getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy) obj2};
                if (i4 == 0) {
                    return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1749388807, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1749388812);
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onTransact ontransact, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(ontransact, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ontransact, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(ontransact, "");
            Intrinsics.checkNotNullParameter(access100Var, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ontransact, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted, (Object) null, 2, (Object) null);
        }
        int i3 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onTransact ontransact, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(ontransact, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ontransact, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 5, (Object) null);
        }
        Intrinsics.checkNotNullParameter(ontransact, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStubProxy, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, ontransact, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, (Object) null, 2, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallback(trackImpression trackimpression, findSnapView.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Object objOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        getSegmentCollection.onWarmupCompleted onwarmupcompletedIAuthTabCallback = null;
        getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent = !(objOnWarmupCompleted instanceof getSegmentCollection.onExtraCallback.onNavigationEvent) ? null : (getSegmentCollection.onExtraCallback.onNavigationEvent) objOnWarmupCompleted;
        if (onnavigationevent != null) {
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onwarmupcompletedIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        }
        boolean z = Intrinsics.areEqual(onwarmupcompletedIAuthTabCallback, getSegmentCollection.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback) && Intrinsics.areEqual(iAuthTabCallback.onExtraCallbackWithResult(), getSegmentCollection.onWarmupCompleted.asInterface.onWarmupCompleted);
        boolean z2 = iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback;
        if (z2 || z) {
            AppSetIdAndScope1 appSetIdAndScope1 = trackimpression.onNavigationEvent;
            if (iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallbackWithResult) {
                trackimpression.IAuthTabCallback.onWarmupCompleted(getSegmentCollection.onExtraCallback.IAuthTabCallback.onExtraCallbackWithResult);
            } else {
                if (!z2) {
                    throw new NoWhenBranchMatchedException();
                }
                trackimpression.IAuthTabCallback.onWarmupCompleted(((findSnapView.IAuthTabCallback.onExtraCallback) iAuthTabCallback).IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = trackimpression.onNavigationEvent;
        Objects.toString(iAuthTabCallback);
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "UserState", "invalid transition:" + iAuthTabCallback, (Throwable) null, (Map) null, 12, (Object) null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        final trackImpression trackimpression = (trackImpression) objArr[0];
        findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (!(!setSegmentCollection.Companion.onWarmupCompleted().onExtraCallbackWithResult())) {
            obj = getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.onWarmupCompleted;
            int i4 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            obj = getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent;
        }
        onextracallbackwithresult.onNavigationEvent(obj);
        Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda22
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 11;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallbackStub = trackImpression.IAuthTabCallbackStub((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2);
                int i9 = onWarmupCompleted + 45;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallbackStub;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.IAuthTabCallbackStub.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.asInterface.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda24
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 9;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unit = (Unit) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1424984781, new Object[]{(findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1424984771);
                int i9 = onExtraCallbackWithResult + 37;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.onExtraCallbackWithResult.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda25
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 17;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unit = (Unit) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 725111228, new Object[]{(findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -725111213);
                int i9 = onNavigationEvent + 57;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.onWarmupCompleted.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 5;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unit = (Unit) trackImpression.onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1499964848, new Object[]{(findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1499964848);
                int i9 = onWarmupCompleted + 99;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 20 / 0;
                }
                return unit;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.IAuthTabCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda27
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 67;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitAsBinder = trackImpression.asBinder((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2);
                int i9 = onExtraCallbackWithResult + 55;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return unitAsBinder;
                }
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.asBinder.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 115;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallbackDefault = trackImpression.IAuthTabCallbackDefault((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2);
                int i9 = IAuthTabCallback + 101;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallbackDefault;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 67;
                onNavigationEvent = i7 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2;
                if (i7 % 2 == 0) {
                    return trackImpression.onExtraCallback(onextracallback);
                }
                trackImpression.onExtraCallback(onextracallback);
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.onNavigationEvent.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda30
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 67;
                IAuthTabCallback = i7 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2;
                if (i7 % 2 != 0) {
                    return trackImpression.onWarmupCompleted(onextracallback);
                }
                trackImpression.onWarmupCompleted(onextracallback);
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.C0025onExtraCallback.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda31
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 109;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = trackImpression.IAuthTabCallback((findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2);
                int i9 = onNavigationEvent + 115;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(getSegmentCollection.onExtraCallback.onTransact.class), new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda32
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i7 % 128;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj2;
                if (i7 % 2 != 0) {
                    trackImpression.onTransact(onextracallback);
                    throw null;
                }
                Unit unitOnTransact = trackImpression.onTransact(onextracallback);
                int i8 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnTransact;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.splittarget.impl.fsm.UserStateImpl$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 123;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = trackImpression.IAuthTabCallback(this.f$0, (findSnapView.IAuthTabCallback) obj2);
                int i9 = onNavigationEvent + 43;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallback;
            }
        });
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    @Override // o.getSegmentCollection
    public boolean onWarmupCompleted() {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0 ? (zOnExtraCallback = addPolicy.ITrustedWebActivityServiceStub().onExtraCallback("PREFS_HAS_LOGIN_ERROR", false)) : (zOnExtraCallback = addPolicy.ITrustedWebActivityServiceStub().onExtraCallback("PREFS_HAS_LOGIN_ERROR", true))) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "hasLoginError", "hasLoginError", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return zOnExtraCallback;
    }

    @Override // o.getSegmentCollection
    public getSegmentCollection.onExtraCallback onExtraCallbackWithResult() {
        getSegmentCollection.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onextracallback = (getSegmentCollection.onExtraCallback) this.onExtraCallback.onWarmupCompleted();
            int i3 = 83 / 0;
        } else {
            onextracallback = (getSegmentCollection.onExtraCallback) this.onExtraCallback.onWarmupCompleted();
        }
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return onextracallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    @Override // o.getSegmentCollection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEvent(@NotNull getSegmentCollection.onWarmupCompleted onwarmupcompleted) {
        boolean z;
        getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onExtraCallback.onExtraCallback(onwarmupcompleted);
        if (onExtraCallbackWithResult() instanceof getSegmentCollection.IAuthTabCallback) {
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSegmentCollection.onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            z = false;
            if (onextracallbackOnExtraCallbackWithResult instanceof getSegmentCollection.onExtraCallback.onNavigationEvent) {
                int i4 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    onnavigationevent = (getSegmentCollection.onExtraCallback.onNavigationEvent) onextracallbackOnExtraCallbackWithResult;
                    if (onnavigationevent.IAuthTabCallback() instanceof getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted) {
                        z = true;
                    }
                } else {
                    onnavigationevent = (getSegmentCollection.onExtraCallback.onNavigationEvent) onextracallbackOnExtraCallbackWithResult;
                    if (!(onnavigationevent.IAuthTabCallback() instanceof getSegmentCollection.onWarmupCompleted.C0026onWarmupCompleted)) {
                    }
                }
                int i5 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (!(onnavigationevent.IAuthTabCallback() instanceof getSegmentCollection.onWarmupCompleted.IAuthTabCallback)) {
                }
            } else if (!(onextracallbackOnExtraCallbackWithResult instanceof getSegmentCollection.onExtraCallback.C0025onExtraCallback)) {
            }
        } else {
            z = onwarmupcompleted instanceof getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy;
        }
        if (!(!z)) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "hasLoginError", "onEventHasLoginError", access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", onwarmupcompleted)), (String) null, false, (String) null, 56, (Object) null);
            int i7 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
        }
        addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent("PREFS_HAS_LOGIN_ERROR", z);
    }

    @Override // o.getSegmentCollection
    public JsonReaderUnknownNumberParsing<getSegmentCollection.onExtraCallback> IAuthTabCallback(boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.IAuthTabCallback.IAuthTabCallbackDefault().access000();
        if (z) {
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            j = 0;
        } else {
            j = 1;
        }
        JsonReaderUnknownNumberParsing<getSegmentCollection.onExtraCallback> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(trackImpression trackimpression, getSegmentCollection.onExtraCallback onextracallback) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = trackimpression.onNavigationEvent;
        Objects.toString(onextracallback);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return unit;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1916532628, new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1916532632);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.C0025onExtraCallback c0025onExtraCallback, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1749388807, new Object[]{onextracallback, c0025onExtraCallback, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1749388812);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -639506734, new Object[]{onextracallback, iAuthTabCallback, access100Var}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 639506741);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1964260113, new Object[]{onextracallback, iAuthTabCallbackStub, onextracallbackwithresult}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1964260121);
    }

    public static /* synthetic */ Unit onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1424984781, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1424984771);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 725111228, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -725111213);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onNavigationEvent onnavigationevent, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 869010176, new Object[]{onextracallback, onnavigationevent, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -869010170);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackDefault iAuthTabCallbackDefault, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 728519320, new Object[]{onextracallback, iAuthTabCallbackDefault, access100Var}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -728519306);
    }

    public static /* synthetic */ Unit asInterface(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1499964848, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1499964848);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.IAuthTabCallback iAuthTabCallback) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1840870592, new Object[]{onextracallback, iAuthTabCallbackStub, iAuthTabCallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1840870590);
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallbackStub iAuthTabCallbackStub, getSegmentCollection.onWarmupCompleted.onExtraCallback onextracallback2) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1758723275, new Object[]{onextracallback, iAuthTabCallbackStub, onextracallback2}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1758723286);
    }

    private static final Unit onNavigationEvent(trackImpression trackimpression, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 500529670, new Object[]{trackimpression, onextracallbackwithresult}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -500529669);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, getSegmentCollection.onWarmupCompleted.access100 access100Var) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1936186530, new Object[]{onextracallback, onextracallbackwithresult, access100Var}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1936186543);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.onWarmupCompleted onwarmupcompleted, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 344816664, new Object[]{onextracallback, onwarmupcompleted, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -344816655);
    }

    private static final Unit access000(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -155525926, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 155525938);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, getSegmentCollection.onExtraCallback.IAuthTabCallback iAuthTabCallback, getSegmentCollection.onWarmupCompleted.IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy) {
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -1362896432, new Object[]{onextracallback, iAuthTabCallback, iAuthTabCallbackStubProxy}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1362896435);
    }

    private static final Unit readTypedObject(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), 1042544946, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1042544929);
    }

    private static final Unit ICustomTabsCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        return (Unit) onNavigationEvent(TransactionFilterLocal.Companion.onNavigationEvent(), -914191948, new Object[]{onextracallback}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 914191964);
    }
}
