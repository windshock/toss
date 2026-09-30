package o;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onNestedFling {
    private final Class<?> IAuthTabCallbackDefault;
    private final Class<?> IAuthTabCallbackStub;
    private final removePreDrawListener IAuthTabCallbackStubProxy;
    private final Method IAuthTabCallback_Parcel;
    private final Class<?> ICustomTabsCallback;
    private final Set<String> access000 = new CopyOnWriteArraySet();
    private final Method access100;
    private final Context asBinder;
    private final Object asInterface;
    private final Class<?> extraCallback;
    private final Method extraCallbackWithResult;
    private final Method getInterfaceDescriptor;
    private final Class<?> onActivityResized;
    private final Method onMinimized;
    private final Class<?> onPostMessage;
    private final Method onTransact;
    private final Method readTypedObject;
    private final Class<?> writeTypedObject;
    private static final AtomicBoolean onExtraCallbackWithResult = new AtomicBoolean(false);
    private static onNestedFling onExtraCallback = null;
    public static final AtomicBoolean onNavigationEvent = new AtomicBoolean(false);
    public static final Map<String, JSONObject> onWarmupCompleted = new ConcurrentHashMap();
    public static final Map<String, JSONObject> IAuthTabCallback = new ConcurrentHashMap();

    static class onExtraCallback implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    static /* synthetic */ Class IAuthTabCallback(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.onActivityResized;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    static /* synthetic */ Method IAuthTabCallbackStub(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.getInterfaceDescriptor;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    static /* synthetic */ Class onExtraCallback(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.IAuthTabCallbackStub;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    static /* synthetic */ Method onExtraCallbackWithResult(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.access100;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(onNestedFling onnestedfling, String str, List list, Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return;
        }
        try {
            onnestedfling.onExtraCallback(str, list, runnable);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
        }
    }

    static /* synthetic */ Context onNavigationEvent(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.asBinder;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    static /* synthetic */ Set onWarmupCompleted(onNestedFling onnestedfling) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            return onnestedfling.access000;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    private onNestedFling(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, removePreDrawListener removepredrawlistener) {
        this.asBinder = context;
        this.asInterface = obj;
        this.IAuthTabCallbackDefault = cls;
        this.ICustomTabsCallback = cls2;
        this.extraCallback = cls3;
        this.onActivityResized = cls4;
        this.IAuthTabCallbackStub = cls5;
        this.onPostMessage = cls6;
        this.writeTypedObject = cls7;
        this.readTypedObject = method;
        this.IAuthTabCallback_Parcel = method2;
        this.onTransact = method3;
        this.getInterfaceDescriptor = method4;
        this.access100 = method5;
        this.onMinimized = method6;
        this.extraCallbackWithResult = method7;
        this.IAuthTabCallbackStubProxy = removepredrawlistener;
    }

    public static onNestedFling onExtraCallbackWithResult(Context context) {
        synchronized (onNestedFling.class) {
            if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
                return null;
            }
            try {
                AtomicBoolean atomicBoolean = onExtraCallbackWithResult;
                if (atomicBoolean.get()) {
                    return onExtraCallback;
                }
                IAuthTabCallback(context);
                atomicBoolean.set(true);
                return onExtraCallback;
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
                return null;
            }
        }
    }

    private static void IAuthTabCallback(Context context) {
        Object objOnWarmupCompleted;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return;
        }
        try {
            removePreDrawListener removepredrawlistenerOnExtraCallback = removePreDrawListener.onExtraCallback();
            if (removepredrawlistenerOnExtraCallback != null) {
                Class<?> clsIAuthTabCallback = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.BillingClient");
                Class<?> clsIAuthTabCallback2 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.Purchase");
                Class<?> clsIAuthTabCallback3 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> clsIAuthTabCallback4 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.SkuDetails");
                Class<?> clsIAuthTabCallback5 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> clsIAuthTabCallback6 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> clsIAuthTabCallback7 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (clsIAuthTabCallback == null || clsIAuthTabCallback3 == null || clsIAuthTabCallback2 == null || clsIAuthTabCallback4 == null || clsIAuthTabCallback6 == null || clsIAuthTabCallback5 == null || clsIAuthTabCallback7 == null) {
                    return;
                }
                Method methodOnExtraCallbackWithResult = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "queryPurchases", String.class);
                Method methodOnExtraCallbackWithResult2 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback3, "getPurchasesList", new Class[0]);
                Method methodOnExtraCallbackWithResult3 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback2, "getOriginalJson", new Class[0]);
                Method methodOnExtraCallbackWithResult4 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback4, "getOriginalJson", new Class[0]);
                Method methodOnExtraCallbackWithResult5 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback5, "getOriginalJson", new Class[0]);
                Method methodOnExtraCallbackWithResult6 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "querySkuDetailsAsync", removepredrawlistenerOnExtraCallback.onExtraCallbackWithResult(), clsIAuthTabCallback6);
                Method methodOnExtraCallbackWithResult7 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "queryPurchaseHistoryAsync", String.class, clsIAuthTabCallback7);
                if (methodOnExtraCallbackWithResult == null || methodOnExtraCallbackWithResult2 == null || methodOnExtraCallbackWithResult3 == null || methodOnExtraCallbackWithResult4 == null || methodOnExtraCallbackWithResult5 == null || methodOnExtraCallbackWithResult6 == null || methodOnExtraCallbackWithResult7 == null || (objOnWarmupCompleted = onWarmupCompleted(context, clsIAuthTabCallback)) == null) {
                    return;
                }
                onNestedFling onnestedfling = new onNestedFling(context, objOnWarmupCompleted, clsIAuthTabCallback, clsIAuthTabCallback3, clsIAuthTabCallback2, clsIAuthTabCallback4, clsIAuthTabCallback5, clsIAuthTabCallback6, clsIAuthTabCallback7, methodOnExtraCallbackWithResult, methodOnExtraCallbackWithResult2, methodOnExtraCallbackWithResult3, methodOnExtraCallbackWithResult4, methodOnExtraCallbackWithResult5, methodOnExtraCallbackWithResult6, methodOnExtraCallbackWithResult7, removepredrawlistenerOnExtraCallback);
                onExtraCallback = onnestedfling;
                onnestedfling.onExtraCallbackWithResult();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
        }
    }

    static Object onWarmupCompleted(Context context, Class<?> cls) {
        Object objOnNavigationEvent;
        Object objOnNavigationEvent2;
        Object objOnNavigationEvent3;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedFling.class)) {
            return null;
        }
        try {
            Class<?> clsIAuthTabCallback = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsIAuthTabCallback2 = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsIAuthTabCallback != null && clsIAuthTabCallback2 != null) {
                Method methodOnExtraCallbackWithResult = recordLastChildRect.onExtraCallbackWithResult(cls, "newBuilder", Context.class);
                Method methodOnExtraCallbackWithResult2 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "enablePendingPurchases", new Class[0]);
                Method methodOnExtraCallbackWithResult3 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "setListener", clsIAuthTabCallback2);
                Method methodOnExtraCallbackWithResult4 = recordLastChildRect.onExtraCallbackWithResult(clsIAuthTabCallback, "build", new Class[0]);
                if (methodOnExtraCallbackWithResult == null || methodOnExtraCallbackWithResult2 == null || methodOnExtraCallbackWithResult3 == null || methodOnExtraCallbackWithResult4 == null || (objOnNavigationEvent = recordLastChildRect.onNavigationEvent(cls, methodOnExtraCallbackWithResult, null, context)) == null || (objOnNavigationEvent2 = recordLastChildRect.onNavigationEvent(clsIAuthTabCallback, methodOnExtraCallbackWithResult3, objOnNavigationEvent, Proxy.newProxyInstance(clsIAuthTabCallback2.getClassLoader(), new Class[]{clsIAuthTabCallback2}, new onExtraCallback()))) == null || (objOnNavigationEvent3 = recordLastChildRect.onNavigationEvent(clsIAuthTabCallback, methodOnExtraCallbackWithResult2, objOnNavigationEvent2, new Object[0])) == null) {
                    return null;
                }
                return recordLastChildRect.onNavigationEvent(clsIAuthTabCallback, methodOnExtraCallbackWithResult4, objOnNavigationEvent3, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedFling.class);
            return null;
        }
    }

    public void onExtraCallbackWithResult(String str, final Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            onWarmupCompleted(str, new Runnable() { // from class: o.onNestedFling.4
                @Override // java.lang.Runnable
                public void run() {
                    if (convertResponseToCredentialManager.onExtraCallback(this)) {
                        return;
                    }
                    try {
                        onNestedFling.onExtraCallbackWithResult(onNestedFling.this, "inapp", new ArrayList(onNestedFling.onWarmupCompleted(onNestedFling.this)), runnable);
                    } catch (Throwable th) {
                        convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    public void onNavigationEvent(String str, Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            Object objOnNavigationEvent = recordLastChildRect.onNavigationEvent(this.ICustomTabsCallback, this.IAuthTabCallback_Parcel, recordLastChildRect.onNavigationEvent(this.IAuthTabCallbackDefault, this.readTypedObject, this.asInterface, "inapp"), new Object[0]);
            if (objOnNavigationEvent instanceof List) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objOnNavigationEvent).iterator();
                    while (it.hasNext()) {
                        Object objOnNavigationEvent2 = recordLastChildRect.onNavigationEvent(this.extraCallback, this.onTransact, it.next(), new Object[0]);
                        if (objOnNavigationEvent2 instanceof String) {
                            JSONObject jSONObject = new JSONObject((String) objOnNavigationEvent2);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                onWarmupCompleted.put(string, jSONObject);
                            }
                        }
                    }
                    onExtraCallback(str, arrayList, runnable);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void onExtraCallback(String str, List<String> list, Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.onPostMessage.getClassLoader(), new Class[]{this.onPostMessage}, new IAuthTabCallback(runnable));
            recordLastChildRect.onNavigationEvent(this.IAuthTabCallbackDefault, this.onMinimized, this.asInterface, this.IAuthTabCallbackStubProxy.onExtraCallback(str, list), objNewProxyInstance);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void onWarmupCompleted(String str, Runnable runnable) {
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            recordLastChildRect.onNavigationEvent(this.IAuthTabCallbackDefault, this.extraCallbackWithResult, this.asInterface, str, Proxy.newProxyInstance(this.writeTypedObject.getClassLoader(), new Class[]{this.writeTypedObject}, new onWarmupCompleted(runnable)));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    private void onExtraCallbackWithResult() {
        Method methodOnExtraCallbackWithResult;
        if (convertResponseToCredentialManager.onExtraCallback(this)) {
            return;
        }
        try {
            Class<?> clsIAuthTabCallback = recordLastChildRect.IAuthTabCallback("com.android.billingclient.api.BillingClientStateListener");
            if (clsIAuthTabCallback != null && (methodOnExtraCallbackWithResult = recordLastChildRect.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, "startConnection", clsIAuthTabCallback)) != null) {
                recordLastChildRect.onNavigationEvent(this.IAuthTabCallbackDefault, methodOnExtraCallbackWithResult, this.asInterface, Proxy.newProxyInstance(clsIAuthTabCallback.getClassLoader(), new Class[]{clsIAuthTabCallback}, new onNavigationEvent()));
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
        }
    }

    static class onNavigationEvent implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onBillingSetupFinished")) {
                onNestedFling.onNavigationEvent.set(true);
                return null;
            }
            if (!method.getName().endsWith("onBillingServiceDisconnected")) {
                return null;
            }
            onNestedFling.onNavigationEvent.set(false);
            return null;
        }
    }

    class onWarmupCompleted implements InvocationHandler {
        Runnable onExtraCallback;

        public onWarmupCompleted(Runnable runnable) {
            this.onExtraCallback = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
            if (!method.getName().equals("onPurchaseHistoryResponse")) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof List)) {
                return null;
            }
            onExtraCallbackWithResult((List) obj2);
            return null;
        }

        private void onExtraCallbackWithResult(List<?> list) throws JSONException {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object objOnNavigationEvent = recordLastChildRect.onNavigationEvent(onNestedFling.onExtraCallback(onNestedFling.this), onNestedFling.onExtraCallbackWithResult(onNestedFling.this), it.next(), new Object[0]);
                    if (objOnNavigationEvent instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) objOnNavigationEvent);
                        jSONObject.put("packageName", onNestedFling.onNavigationEvent(onNestedFling.this).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            onNestedFling.onWarmupCompleted(onNestedFling.this).add(string);
                            onNestedFling.onWarmupCompleted.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.onExtraCallback.run();
        }
    }

    class IAuthTabCallback implements InvocationHandler {
        Runnable onExtraCallbackWithResult;

        public IAuthTabCallback(Runnable runnable) {
            this.onExtraCallbackWithResult = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
            if (!method.getName().equals("onSkuDetailsResponse")) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof List)) {
                return null;
            }
            onWarmupCompleted((List) obj2);
            return null;
        }

        void onWarmupCompleted(List<?> list) throws JSONException {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object objOnNavigationEvent = recordLastChildRect.onNavigationEvent(onNestedFling.IAuthTabCallback(onNestedFling.this), onNestedFling.IAuthTabCallbackStub(onNestedFling.this), it.next(), new Object[0]);
                    if (objOnNavigationEvent instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) objOnNavigationEvent);
                        if (jSONObject.has("productId")) {
                            onNestedFling.IAuthTabCallback.put(jSONObject.getString("productId"), jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.onExtraCallbackWithResult.run();
        }
    }
}
