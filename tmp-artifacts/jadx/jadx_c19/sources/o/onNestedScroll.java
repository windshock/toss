package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onNestedScroll {
    private static final HashMap<String, Method> onNavigationEvent = new HashMap<>();
    private static final HashMap<String, Class<?>> onExtraCallback = new HashMap<>();
    private static final String IAuthTabCallback = performIntercept.onExtraCallbackWithResult().getPackageName();
    private static final SharedPreferences onWarmupCompleted = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences onExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    static Object onExtraCallback(Context context, IBinder iBinder) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            return onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    static Map<String, String> onExtraCallback(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            Map<String, String> mapIAuthTabCallback = IAuthTabCallback(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!mapIAuthTabCallback.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            mapIAuthTabCallback.putAll(onNavigationEvent(context, arrayList2, obj, z));
            return mapIAuthTabCallback;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static Map<String, String> onNavigationEvent(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object objOnNavigationEvent = onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, IAuthTabCallback, z ? "subs" : "inapp", bundle});
                if (objOnNavigationEvent != null) {
                    Bundle bundle2 = (Bundle) objOnNavigationEvent;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                map.put(arrayList.get(i2), stringArrayList.get(i2));
                            }
                        }
                        onExtraCallback(map);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static Map<String, String> IAuthTabCallback(ArrayList<String> arrayList) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = onWarmupCompleted.getString(next, null);
                if (string != null) {
                    String[] strArrSplit = string.split(";", 2);
                    if (jCurrentTimeMillis - Long.parseLong(strArrSplit[0]) < 43200) {
                        map.put(next, strArrSplit[1]);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static void onExtraCallback(Map<String, String> map) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = onWarmupCompleted.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ";" + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
        }
    }

    private static Boolean onWarmupCompleted(Context context, Object obj, String str) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            if (obj == null) {
                return Boolean.FALSE;
            }
            boolean z = false;
            Object objOnNavigationEvent = onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, IAuthTabCallback, str});
            if (objOnNavigationEvent != null && ((Integer) objOnNavigationEvent).intValue() == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    static ArrayList<String> onNavigationEvent(Context context, Object obj) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            return onExtraCallback(onNavigationEvent(context, obj, "inapp"));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    static ArrayList<String> onExtraCallback(Context context, Object obj) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            return onExtraCallback(onNavigationEvent(context, obj, "subs"));
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<String> onNavigationEvent(Context context, Object obj, String str) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && onWarmupCompleted(context, obj, str).booleanValue()) {
                String string = null;
                int size = 0;
                do {
                    Object objOnNavigationEvent = onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, IAuthTabCallback, str, string});
                    if (objOnNavigationEvent != null) {
                        Bundle bundle = (Bundle) objOnNavigationEvent;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30) {
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    public static boolean IAuthTabCallback(String str) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return false;
        }
        try {
            String strOptString = new JSONObject(str).optString("freeTrialPeriod");
            if (strOptString != null) {
                if (!strOptString.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return false;
        }
    }

    static ArrayList<String> onWarmupCompleted(Context context, Object obj) {
        Class<?> clsOnNavigationEvent;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && (clsOnNavigationEvent = onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService")) != null && IAuthTabCallback(clsOnNavigationEvent, "getPurchaseHistory") != null) {
                return onExtraCallback(onExtraCallbackWithResult(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<String> onExtraCallbackWithResult(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (onWarmupCompleted(context, obj, str).booleanValue()) {
                char c = 0;
                String string = null;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    String str2 = IAuthTabCallback;
                    Bundle bundle = new Bundle();
                    Object[] objArr = new Object[5];
                    objArr[c] = 6;
                    objArr[1] = str2;
                    objArr[2] = str;
                    objArr[3] = string;
                    objArr[4] = bundle;
                    Object objOnNavigationEvent = onNavigationEvent(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (objOnNavigationEvent != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle2 = (Bundle) objOnNavigationEvent;
                        if (bundle2.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (jCurrentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i2++;
                            }
                            string = bundle2.getString("INAPP_CONTINUATION_TOKEN");
                        }
                        if (i2 >= 30 || string == null || z) {
                            break;
                        }
                        c = 0;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static ArrayList<String> onExtraCallback(ArrayList<String> arrayList) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor editorEdit = onExtraCallbackWithResult.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= 86400 && !onExtraCallbackWithResult.getString(string, "").equals(string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Method IAuthTabCallback(Class<?> cls, String str) {
        Class<?>[] clsArr;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            HashMap<String, Method> map = onNavigationEvent;
            Method declaredMethod = map.get(str);
            if (declaredMethod != null) {
                return declaredMethod;
            }
            try {
                int iHashCode = str.hashCode();
                Class<?> cls2 = Integer.TYPE;
                switch (iHashCode) {
                    case -1801122596:
                        if (!str.equals("getPurchases")) {
                            clsArr = null;
                            break;
                        } else {
                            clsArr = new Class[]{cls2, String.class, String.class, String.class};
                            break;
                        }
                    case -1450694211:
                        if (str.equals("isBillingSupported")) {
                            clsArr = new Class[]{cls2, String.class, String.class};
                            break;
                        }
                        break;
                    case -1123215065:
                        if (str.equals("asInterface")) {
                            clsArr = new Class[]{IBinder.class};
                            break;
                        }
                        break;
                    case -594356707:
                        if (str.equals("getPurchaseHistory")) {
                            clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                            break;
                        }
                        break;
                    case -573310373:
                        if (str.equals("getSkuDetails")) {
                            clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                            break;
                        }
                        break;
                }
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
                map.put(str, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static Class<?> onNavigationEvent(Context context, String str) {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = onExtraCallback;
            Class<?> clsLoadClass = map.get(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            try {
                clsLoadClass = context.getClassLoader().loadClass(str);
                map.put(str, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
                return clsLoadClass;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    private static Object onNavigationEvent(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodIAuthTabCallback;
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return null;
        }
        try {
            Class<?> clsOnNavigationEvent = onNavigationEvent(context, str);
            if (clsOnNavigationEvent == null || (methodIAuthTabCallback = IAuthTabCallback(clsOnNavigationEvent, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = clsOnNavigationEvent.cast(obj);
            }
            try {
                return methodIAuthTabCallback.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
            return null;
        }
    }

    static void onExtraCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(onNestedScroll.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = onWarmupCompleted;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onNestedScroll.class);
        }
    }
}
