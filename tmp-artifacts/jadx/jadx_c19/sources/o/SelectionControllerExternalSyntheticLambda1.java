package o;

import android.util.Pair;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SelectionControllerExternalSyntheticLambda1 extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 {
    private final BottomNavigationKtExternalSyntheticLambda7 IAuthTabCallback;
    private final int onExtraCallback;
    private final boolean onExtraCallbackWithResult;

    protected abstract int IAuthTabCallbackStub(int i2);

    protected abstract int asBinder(int i2);

    protected abstract int onExtraCallback(Object obj);

    protected abstract Object onExtraCallback(int i2);

    protected abstract int onExtraCallbackWithResult(int i2);

    protected abstract CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onTransact(int i2);

    protected abstract int onWarmupCompleted(int i2);

    public static Object onWarmupCompleted(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object onExtraCallbackWithResult(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object onWarmupCompleted(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public SelectionControllerExternalSyntheticLambda1(boolean z, BottomNavigationKtExternalSyntheticLambda7 bottomNavigationKtExternalSyntheticLambda7) {
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallback = bottomNavigationKtExternalSyntheticLambda7;
        this.onExtraCallback = bottomNavigationKtExternalSyntheticLambda7.onExtraCallback();
    }

    public int onNavigationEvent(int i2, int i3, boolean z) {
        if (this.onExtraCallbackWithResult) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        int iAsBinder = asBinder(iOnExtraCallbackWithResult);
        int iOnNavigationEvent = onTransact(iOnExtraCallbackWithResult).onNavigationEvent(i2 - iAsBinder, i3 != 2 ? i3 : 0, z);
        if (iOnNavigationEvent != -1) {
            return iAsBinder + iOnNavigationEvent;
        }
        int iIAuthTabCallback = IAuthTabCallback(iOnExtraCallbackWithResult, z);
        while (iIAuthTabCallback != -1 && onTransact(iIAuthTabCallback).onExtraCallback()) {
            iIAuthTabCallback = IAuthTabCallback(iIAuthTabCallback, z);
        }
        if (iIAuthTabCallback != -1) {
            return asBinder(iIAuthTabCallback) + onTransact(iIAuthTabCallback).onNavigationEvent(z);
        }
        if (i3 == 2) {
            return onNavigationEvent(z);
        }
        return -1;
    }

    public int IAuthTabCallback(int i2, int i3, boolean z) {
        if (this.onExtraCallbackWithResult) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        int iAsBinder = asBinder(iOnExtraCallbackWithResult);
        int iIAuthTabCallback = onTransact(iOnExtraCallbackWithResult).IAuthTabCallback(i2 - iAsBinder, i3 != 2 ? i3 : 0, z);
        if (iIAuthTabCallback != -1) {
            return iAsBinder + iIAuthTabCallback;
        }
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnExtraCallbackWithResult, z);
        while (iOnExtraCallbackWithResult2 != -1 && onTransact(iOnExtraCallbackWithResult2).onExtraCallback()) {
            iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnExtraCallbackWithResult2, z);
        }
        if (iOnExtraCallbackWithResult2 != -1) {
            return asBinder(iOnExtraCallbackWithResult2) + onTransact(iOnExtraCallbackWithResult2).onWarmupCompleted(z);
        }
        if (i3 == 2) {
            return onWarmupCompleted(z);
        }
        return -1;
    }

    public int onWarmupCompleted(boolean z) {
        int i2 = this.onExtraCallback;
        if (i2 == 0) {
            return -1;
        }
        if (this.onExtraCallbackWithResult) {
            z = false;
        }
        int iIAuthTabCallback = z ? this.IAuthTabCallback.IAuthTabCallback() : i2 - 1;
        while (onTransact(iIAuthTabCallback).onExtraCallback()) {
            iIAuthTabCallback = onExtraCallbackWithResult(iIAuthTabCallback, z);
            if (iIAuthTabCallback == -1) {
                return -1;
            }
        }
        return asBinder(iIAuthTabCallback) + onTransact(iIAuthTabCallback).onWarmupCompleted(z);
    }

    public int onNavigationEvent(boolean z) {
        if (this.onExtraCallback == 0) {
            return -1;
        }
        if (this.onExtraCallbackWithResult) {
            z = false;
        }
        int iOnNavigationEvent = z ? this.IAuthTabCallback.onNavigationEvent() : 0;
        while (onTransact(iOnNavigationEvent).onExtraCallback()) {
            iOnNavigationEvent = IAuthTabCallback(iOnNavigationEvent, z);
            if (iOnNavigationEvent == -1) {
                return -1;
            }
        }
        return asBinder(iOnNavigationEvent) + onTransact(iOnNavigationEvent).onNavigationEvent(z);
    }

    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2);
        int iAsBinder = asBinder(iOnExtraCallbackWithResult);
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(iOnExtraCallbackWithResult);
        onTransact(iOnExtraCallbackWithResult).onWarmupCompleted(i2 - iAsBinder, iAuthTabCallback, j);
        Object objOnExtraCallback = onExtraCallback(iOnExtraCallbackWithResult);
        if (!CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback.onNavigationEvent.equals(iAuthTabCallback.extraCallback)) {
            objOnExtraCallback = onWarmupCompleted(objOnExtraCallback, iAuthTabCallback.extraCallback);
        }
        iAuthTabCallback.extraCallback = objOnExtraCallback;
        iAuthTabCallback.IAuthTabCallback += iIAuthTabCallbackStub;
        iAuthTabCallback.asBinder += iIAuthTabCallbackStub;
        return iAuthTabCallback;
    }

    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onExtraCallbackWithResult(Object obj, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        Object objOnWarmupCompleted = onWarmupCompleted(obj);
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnExtraCallback = onExtraCallback(objOnWarmupCompleted);
        int iAsBinder = asBinder(iOnExtraCallback);
        onTransact(iOnExtraCallback).onExtraCallbackWithResult(objOnExtraCallbackWithResult, onextracallback);
        onextracallback.IAuthTabCallbackStub += iAsBinder;
        onextracallback.asBinder = obj;
        return onextracallback;
    }

    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
        int iOnWarmupCompleted = onWarmupCompleted(i2);
        int iAsBinder = asBinder(iOnWarmupCompleted);
        onTransact(iOnWarmupCompleted).IAuthTabCallback(i2 - IAuthTabCallbackStub(iOnWarmupCompleted), onextracallback, z);
        onextracallback.IAuthTabCallbackStub += iAsBinder;
        if (z) {
            onextracallback.asBinder = onWarmupCompleted(onExtraCallback(iOnWarmupCompleted), RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.asBinder));
        }
        return onextracallback;
    }

    public final int IAuthTabCallback(Object obj) {
        int iIAuthTabCallback;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(obj);
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnExtraCallback = onExtraCallback(objOnWarmupCompleted);
        if (iOnExtraCallback == -1 || (iIAuthTabCallback = onTransact(iOnExtraCallback).IAuthTabCallback(objOnExtraCallbackWithResult)) == -1) {
            return -1;
        }
        return IAuthTabCallbackStub(iOnExtraCallback) + iIAuthTabCallback;
    }

    public final Object onNavigationEvent(int i2) {
        int iOnWarmupCompleted = onWarmupCompleted(i2);
        return onWarmupCompleted(onExtraCallback(iOnWarmupCompleted), onTransact(iOnWarmupCompleted).onNavigationEvent(i2 - IAuthTabCallbackStub(iOnWarmupCompleted)));
    }

    private int IAuthTabCallback(int i2, boolean z) {
        if (z) {
            return this.IAuthTabCallback.onExtraCallback(i2);
        }
        if (i2 < this.onExtraCallback - 1) {
            return i2 + 1;
        }
        return -1;
    }

    private int onExtraCallbackWithResult(int i2, boolean z) {
        if (z) {
            return this.IAuthTabCallback.onNavigationEvent(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }
}
