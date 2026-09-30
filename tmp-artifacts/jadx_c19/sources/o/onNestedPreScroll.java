package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onNestedPreScroll {
    private static Application.ActivityLifecycleCallbacks IAuthTabCallback;
    private static ServiceConnection asBinder;
    private static Object onExtraCallbackWithResult;
    private static Intent onWarmupCompleted;
    private static final AtomicBoolean onTransact = new AtomicBoolean(false);
    private static Boolean onNavigationEvent = null;
    private static Boolean onExtraCallback = null;

    public static void IAuthTabCallback() throws ClassNotFoundException {
        onExtraCallback();
        if (onNavigationEvent.booleanValue() && requestDisallowInterceptTouchEvent.onWarmupCompleted()) {
            onNavigationEvent();
        }
    }

    private static void onExtraCallback() throws ClassNotFoundException {
        if (onNavigationEvent != null) {
            return;
        }
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
            Boolean bool = Boolean.TRUE;
            onNavigationEvent = bool;
            try {
                Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                onExtraCallback = bool;
            } catch (ClassNotFoundException unused) {
                onExtraCallback = Boolean.FALSE;
            }
            onNestedScroll.onExtraCallback();
            onWarmupCompleted = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            asBinder = new ServiceConnection() { // from class: o.onNestedPreScroll.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Object unused2 = onNestedPreScroll.onExtraCallbackWithResult = onNestedScroll.onExtraCallback(performIntercept.onExtraCallbackWithResult(), iBinder);
                }
            };
            IAuthTabCallback = new Application.ActivityLifecycleCallbacks() { // from class: o.onNestedPreScroll.3
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    try {
                        performIntercept.IAuthTabCallbackStubProxy().execute(new Runnable() { // from class: o.onNestedPreScroll.3.3
                            @Override // java.lang.Runnable
                            public void run() {
                                if (convertResponseToCredentialManager.onExtraCallback(this)) {
                                    return;
                                }
                                try {
                                    Context contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
                                    onNestedPreScroll.onWarmupCompleted(contextOnExtraCallbackWithResult, onNestedScroll.onNavigationEvent(contextOnExtraCallbackWithResult, onNestedPreScroll.onExtraCallbackWithResult), false);
                                    onNestedPreScroll.onWarmupCompleted(contextOnExtraCallbackWithResult, onNestedScroll.onExtraCallback(contextOnExtraCallbackWithResult, onNestedPreScroll.onExtraCallbackWithResult), true);
                                } catch (Throwable th) {
                                    convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                                }
                            }
                        });
                    } catch (Exception unused2) {
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    try {
                        if (onNestedPreScroll.onExtraCallback.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                            performIntercept.IAuthTabCallbackStubProxy().execute(new Runnable() { // from class: o.onNestedPreScroll.3.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                                        return;
                                    }
                                    try {
                                        Context contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
                                        ArrayList<String> arrayListOnNavigationEvent = onNestedScroll.onNavigationEvent(contextOnExtraCallbackWithResult, onNestedPreScroll.onExtraCallbackWithResult);
                                        if (arrayListOnNavigationEvent.isEmpty()) {
                                            arrayListOnNavigationEvent = onNestedScroll.onWarmupCompleted(contextOnExtraCallbackWithResult, onNestedPreScroll.onExtraCallbackWithResult);
                                        }
                                        onNestedPreScroll.onWarmupCompleted(contextOnExtraCallbackWithResult, arrayListOnNavigationEvent, false);
                                    } catch (Throwable th) {
                                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                                    }
                                }
                            });
                        }
                    } catch (Exception unused2) {
                    }
                }
            };
        } catch (ClassNotFoundException unused2) {
            onNavigationEvent = Boolean.FALSE;
        }
    }

    private static void onNavigationEvent() {
        if (onTransact.compareAndSet(false, true)) {
            Context contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
            if (contextOnExtraCallbackWithResult instanceof Application) {
                ((Application) contextOnExtraCallbackWithResult).registerActivityLifecycleCallbacks(IAuthTabCallback);
                contextOnExtraCallbackWithResult.bindService(onWarmupCompleted, asBinder, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(Context context, ArrayList<String> arrayList, boolean z) throws JSONException {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String string = new JSONObject(next).getString("productId");
                map.put(string, next);
                arrayList2.add(string);
            } catch (JSONException unused) {
            }
        }
        for (Map.Entry<String, String> entry : onNestedScroll.onExtraCallback(context, arrayList2, onExtraCallbackWithResult, z).entrySet()) {
            requestDisallowInterceptTouchEvent.onWarmupCompleted((String) map.get(entry.getKey()), entry.getValue(), z);
        }
    }
}
