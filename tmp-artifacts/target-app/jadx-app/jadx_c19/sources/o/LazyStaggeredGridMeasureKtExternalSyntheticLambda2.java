package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridMeasureKtExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private static final char[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    static {
        onNavigationEvent();
        char[] cArr = new char[80];
        onExtraCallback = cArr;
        Arrays.fill(cArr, ' ');
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static String onNavigationEvent(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, String str) throws SecurityException {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        onWarmupCompleted(lazyStaggeredGridMeasureKtExternalSyntheticLambda1, sb, 0);
        String string = sb.toString();
        int i3 = asInterface + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $11 + 61;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iKeyCodeFromString = 12434 - KeyEvent.keyCodeFromString("");
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), keyRepeatTimeout, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 10 - (ViewConfiguration.getTapTimeout() >> 16), 12434 - (ViewConfiguration.getPressedStateDuration() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i11 = $10 + 95;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 5 % 2;
                    }
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 14, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116 A[PHI: r10
      0x0116: PHI (r10v32 java.lang.reflect.Method) = (r10v31 java.lang.reflect.Method), (r10v34 java.lang.reflect.Method) binds: [B:45:0x0114, B:42:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onWarmupCompleted(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, StringBuilder sb, int i2) throws SecurityException {
        int i3;
        Method method;
        Method method2;
        int i4 = 2 % 2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = lazyStaggeredGridMeasureKtExternalSyntheticLambda1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i3 = 3;
            if (i5 >= length) {
                break;
            }
            int i6 = asInterface + 71;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                int i8 = asInterface + 49;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 19 / 0;
                    if (method3.getName().startsWith("set")) {
                        hashSet.add(method3.getName());
                        int i10 = asInterface + 73;
                        IAuthTabCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                    } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                        if (method3.getName().startsWith("has")) {
                            map.put(method3.getName(), method3);
                        } else if (method3.getName().startsWith("get")) {
                            treeMap.put(method3.getName(), method3);
                        }
                    }
                } else if (method3.getName().startsWith("set")) {
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List")) {
                int i12 = IAuthTabCallbackDefault + 107;
                asInterface = i12 % 128;
                if (i12 % 2 != 0) {
                    strSubstring.endsWith("OrBuilderList");
                    throw null;
                }
                if (strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List")) {
                    if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class)) {
                        int i13 = asInterface + 57;
                        IAuthTabCallbackDefault = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 65 / 0;
                            if (!method.isAnnotationPresent(Deprecated.class)) {
                                if (Modifier.isPublic(method.getModifiers())) {
                                    i3 = 3;
                                    onExtraCallbackWithResult(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(method, lazyStaggeredGridMeasureKtExternalSyntheticLambda1, new Object[0]));
                                }
                            }
                        } else if (!method.isAnnotationPresent(Deprecated.class)) {
                        }
                    }
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                Method method4 = (Method) entry.getValue();
                                Method method5 = (Method) map.get("has" + strSubstring);
                                if (method4 != null) {
                                    boolean zBooleanValue = false;
                                    Object objOnExtraCallback = PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(method4, lazyStaggeredGridMeasureKtExternalSyntheticLambda1, new Object[0]);
                                    if (method5 != null) {
                                        zBooleanValue = ((Boolean) PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(method5, lazyStaggeredGridMeasureKtExternalSyntheticLambda1, new Object[0])).booleanValue();
                                    } else if (!IAuthTabCallback(objOnExtraCallback)) {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        int i15 = asInterface + 49;
                                        IAuthTabCallbackDefault = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            onExtraCallbackWithResult(sb, i2, strSubstring, objOnExtraCallback);
                                            int i16 = 35 / 0;
                                        } else {
                                            onExtraCallbackWithResult(sb, i2, strSubstring, objOnExtraCallback);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i3 = 3;
                } else {
                    int i17 = asInterface + 83;
                    IAuthTabCallbackDefault = i17 % 128;
                    if (i17 % 2 == 0) {
                        method2 = (Method) entry.getValue();
                        int i18 = 38 / 0;
                        if (method2 != null) {
                            if (method2.getReturnType().equals(List.class)) {
                                onExtraCallbackWithResult(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(method2, lazyStaggeredGridMeasureKtExternalSyntheticLambda1, new Object[0]));
                            }
                            i3 = 3;
                        }
                    } else {
                        method2 = (Method) entry.getValue();
                        if (method2 != null) {
                        }
                    }
                }
            }
        }
        if (lazyStaggeredGridMeasureKtExternalSyntheticLambda1 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onWarmupCompleted) {
            Iterator<Map.Entry<T, Object>> itAsBinder = ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onWarmupCompleted) lazyStaggeredGridMeasureKtExternalSyntheticLambda1).extensions.asBinder();
            while (itAsBinder.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itAsBinder.next();
                onExtraCallbackWithResult(sb, i2, "[" + ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback) entry2.getKey()).onWarmupCompleted() + "]", entry2.getValue());
            }
        }
        PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7 = ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) lazyStaggeredGridMeasureKtExternalSyntheticLambda1).IAuthTabCallback;
        if (pagerKtExternalSyntheticLambda7 != null) {
            int i19 = IAuthTabCallbackDefault + 15;
            asInterface = i19 % 128;
            if (i19 % 2 == 0) {
                pagerKtExternalSyntheticLambda7.IAuthTabCallback(sb, i2);
            } else {
                pagerKtExternalSyntheticLambda7.IAuthTabCallback(sb, i2);
                int i20 = 39 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean IAuthTabCallback(Object obj) {
        int i2 = 2 % 2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof Integer)) {
            if (obj instanceof Float) {
                return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
            }
            if (obj instanceof Double) {
                int i3 = IAuthTabCallbackDefault + 99;
                asInterface = i3 % 128;
                return i3 % 2 == 0 ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
            }
            if (obj instanceof String) {
                return obj.equals("");
            }
            if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                return obj.equals(LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult);
            }
            if (obj instanceof LazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
                int i4 = IAuthTabCallbackDefault + 49;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                if (obj != ((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj).readTypedObject()) {
                    return false;
                }
                int i6 = IAuthTabCallbackDefault + 71;
                asInterface = i6 % 128;
                return i6 % 2 == 0;
            }
            if (obj instanceof Enum) {
                int i7 = asInterface + 117;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    ((Enum) obj).ordinal();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (((Enum) obj).ordinal() == 0) {
                    return true;
                }
            }
            return false;
        }
        int i8 = IAuthTabCallbackDefault + 27;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 25 / 0;
            return ((Integer) obj).intValue() == 0;
        }
        if (((Integer) obj).intValue() == 0) {
        }
    }

    static void onExtraCallbackWithResult(StringBuilder sb, int i2, String str, Object obj) {
        int i3 = 2 % 2;
        int i4 = asInterface + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                int i6 = IAuthTabCallbackDefault + 61;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    onExtraCallbackWithResult(sb, i2, str, (Map.Entry) it2.next());
                    int i7 = 49 / 0;
                } else {
                    onExtraCallbackWithResult(sb, i2, str, (Map.Entry) it2.next());
                }
            }
            return;
        }
        sb.append('\n');
        onWarmupCompleted(i2, sb);
        sb.append(onNavigationEvent(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(PagerKtExternalSyntheticLambda0.onNavigationEvent((String) obj));
            sb.append('\"');
            return;
        }
        if (!(!(obj instanceof LazyLayoutKtExternalSyntheticLambda3))) {
            sb.append(": \"");
            sb.append(PagerKtExternalSyntheticLambda0.IAuthTabCallback((LazyLayoutKtExternalSyntheticLambda3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
            int i8 = IAuthTabCallbackDefault + 111;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            sb.append(" {");
            onWarmupCompleted((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) obj, sb, i2 + 2);
            sb.append("\n");
            onWarmupCompleted(i2, sb);
            sb.append("}");
            int i10 = IAuthTabCallbackDefault + 1;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = asInterface + 81;
        IAuthTabCallbackDefault = i12 % 128;
        int i13 = i12 % 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i14 = i2 + 2;
        Object[] objArr = new Object[1];
        a(new char[]{46929, 13097, 61621, 2778}, 2 - TextUtils.lastIndexOf("", '0', 0), objArr);
        onExtraCallbackWithResult(sb, i14, ((String) objArr[0]).intern(), entry.getKey());
        Object[] objArr2 = new Object[1];
        a(new char[]{6918, 26649, 9356, 33890, 48148, 13418}, 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        onExtraCallbackWithResult(sb, i14, ((String) objArr2[0]).intern(), entry.getValue());
        sb.append("\n");
        onWarmupCompleted(i2, sb);
        sb.append("}");
    }

    private static void onWarmupCompleted(int i2, StringBuilder sb) {
        int length;
        int i3 = 2 % 2;
        while (i2 > 0) {
            int i4 = asInterface + 35;
            int i5 = i4 % 128;
            IAuthTabCallbackDefault = i5;
            int i6 = i4 % 2;
            char[] cArr = onExtraCallback;
            if (i2 > cArr.length) {
                length = cArr.length;
            } else {
                int i7 = i5 + 83;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 3;
                }
                length = i2;
            }
            sb.append(cArr, 0, length);
            i2 -= length;
        }
        int i9 = asInterface + 109;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
    }

    private static String onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (str.isEmpty()) {
            int i5 = asInterface + 81;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        int i7 = 1;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                int i8 = IAuthTabCallbackDefault + 97;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    sb.append("_");
                    int i9 = 22 / 0;
                } else {
                    sb.append("_");
                }
            }
            sb.append(Character.toLowerCase(cCharAt));
            i7++;
            int i10 = asInterface + 1;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return sb.toString();
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 3475;
        onWarmupCompleted = (char) 64976;
        onExtraCallbackWithResult = (char) 48736;
        onNavigationEvent = (char) 24039;
    }
}
