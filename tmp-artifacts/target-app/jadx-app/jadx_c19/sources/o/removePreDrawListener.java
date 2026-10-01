package o;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class removePreDrawListener {
    private static final AtomicBoolean onNavigationEvent = new AtomicBoolean(false);
    private static removePreDrawListener onWarmupCompleted;
    private final Method IAuthTabCallback;
    private final Method IAuthTabCallbackDefault;
    private final Method asInterface;
    private final Class<?> onExtraCallback;
    private final Method onExtraCallbackWithResult;
    private final Class<?> onTransact;

    public removePreDrawListener(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.onTransact = cls;
        this.onExtraCallback = cls2;
        this.IAuthTabCallback = method;
        this.asInterface = method2;
        this.IAuthTabCallbackDefault = method3;
        this.onExtraCallbackWithResult = method4;
    }

    public static removePreDrawListener onExtraCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(removePreDrawListener.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = onNavigationEvent;
            if (atomicBoolean.get()) {
                return onWarmupCompleted;
            }
            IAuthTabCallback();
            atomicBoolean.set(true);
            return onWarmupCompleted;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, removePreDrawListener.class);
            return null;
        }
    }

    private static void IAuthTabCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(removePreDrawListener.class)) {
            return;
        }
        try {
            Class<?> clsIAuthTabCallback = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsIAuthTabCallback2 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsIAuthTabCallback == null || clsIAuthTabCallback2 == null) {
                return;
            }
            Method methodOnExtraCallbackWithResult = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "newBuilder", new Class[0]);
            Method methodOnExtraCallbackWithResult2 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback2, "setType", String.class);
            Method methodOnExtraCallbackWithResult3 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback2, "setSkusList", List.class);
            Method methodOnExtraCallbackWithResult4 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback2, "build", new Class[0]);
            if (methodOnExtraCallbackWithResult == null || methodOnExtraCallbackWithResult2 == null || methodOnExtraCallbackWithResult3 == null || methodOnExtraCallbackWithResult4 == null) {
                return;
            }
            onWarmupCompleted = new removePreDrawListener(clsIAuthTabCallback, clsIAuthTabCallback2, methodOnExtraCallbackWithResult, methodOnExtraCallbackWithResult2, methodOnExtraCallbackWithResult3, methodOnExtraCallbackWithResult4);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, removePreDrawListener.class);
        }
    }

    public Class<?> onExtraCallbackWithResult() {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return null;
        }
        try {
            return this.onTransact;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            return null;
        }
    }

    public Object onExtraCallback(String str, List<String> list) {
        Object objOnNavigationEvent;
        Object objOnNavigationEvent2;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return null;
        }
        try {
            Object objOnNavigationEvent3 = recordLastChildRect.onNavigationEvent(this.onTransact, this.IAuthTabCallback, null, new Object[0]);
            if (objOnNavigationEvent3 == null || (objOnNavigationEvent = recordLastChildRect.onNavigationEvent(this.onExtraCallback, this.asInterface, objOnNavigationEvent3, str)) == null || (objOnNavigationEvent2 = recordLastChildRect.onNavigationEvent(this.onExtraCallback, this.IAuthTabCallbackDefault, objOnNavigationEvent, list)) == null) {
                return null;
            }
            return recordLastChildRect.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult, objOnNavigationEvent2, new Object[0]);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            return null;
        }
    }
}
