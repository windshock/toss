package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.p000firebaseauthapi.zzaja;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzakp {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final char[] zza;

    static String zza(zzakk zzakkVar, String str) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzakkVar, sb, 0);
        String string = sb.toString();
        int i3 = asBinder + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    static {
        onWarmupCompleted();
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void zza(int i2, StringBuilder sb) {
        int i3 = 2 % 2;
        while (i2 > 0) {
            int i4 = asInterface + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = zza;
            int length = i2 > cArr.length ? cArr.length : i2;
            sb.append(cArr, 0, length);
            i2 -= length;
        }
        int i6 = asInterface + 71;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    static void zza(StringBuilder sb, int i2, String str, Object obj) throws Throwable {
        int i3 = 2 % 2;
        if (obj instanceof List) {
            int i4 = asInterface + 37;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            int i6 = asInterface + 3;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (!(!it2.hasNext())) {
                zza(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i2, sb);
        Object obj2 = null;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    int i9 = asBinder + 21;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        sb2.append("_");
                        obj2.hashCode();
                        throw null;
                    }
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            int i10 = asInterface + 121;
            asBinder = i10 % 128;
            if (i10 % 2 == 0) {
                sb.append(": \"");
                sb.append(zzalx.zza(zzahm.zza((String) obj)));
                sb.append('b');
                return;
            } else {
                sb.append(": \"");
                sb.append(zzalx.zza(zzahm.zza((String) obj)));
                sb.append('\"');
                return;
            }
        }
        if (obj instanceof zzahm) {
            int i11 = asInterface + 45;
            asBinder = i11 % 128;
            if (i11 % 2 == 0) {
                sb.append(": \"");
                sb.append(zzalx.zza((zzahm) obj));
                sb.append((char) 11);
                return;
            } else {
                sb.append(": \"");
                sb.append(zzalx.zza((zzahm) obj));
                sb.append('\"');
                return;
            }
        }
        if (obj instanceof zzaja) {
            sb.append(" {");
            zza((zzaja) obj, sb, i2 + 2);
            sb.append("\n");
            zza(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = asInterface + 69;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i14 = i2 + 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-125, -126, -127}, Color.alpha(0) + 127, objArr);
        zza(sb, i14, ((String) objArr[0]).intern(), entry.getKey());
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126, -121, -122, -123, -124}, Color.blue(0) + 127, objArr2);
        zza(sb, i14, ((String) objArr2[0]).intern(), entry.getValue());
        sb.append("\n");
        zza(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x025e, code lost:
    
        if (r9 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e2, code lost:
    
        if (((java.lang.Integer) r8).intValue() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ff, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r8).floatValue()) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021f, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r8).doubleValue()) == 0) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzakk zzakkVar, StringBuilder sb, int i2) throws Throwable {
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        int i4 = 2 % 2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzakkVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i3 = 3;
            if (i5 >= length) {
                break;
            }
            int i6 = asBinder + 15;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            int i8 = asBinder + 89;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                Object obj = null;
                ((String) ((Map.Entry) it.next()).getKey()).substring(3).endsWith("List");
                obj.hashCode();
                throw null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList")) {
                int i9 = asBinder + 7;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                if (!strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                    zza(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzaja.zza(method2, zzakkVar, new Object[0]));
                }
            } else if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class)) {
                if (hashSet.contains("set" + strSubstring)) {
                    int i11 = asBinder + 77;
                    asInterface = i11 % 128;
                    if (i11 % 2 != 0) {
                        strSubstring.endsWith("Bytes");
                        throw null;
                    }
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            Method method4 = (Method) entry.getValue();
                            Method method5 = (Method) map.get("has" + strSubstring);
                            if (method4 != null) {
                                Object objZza = zzaja.zza(method4, zzakkVar, new Object[0]);
                                if (method5 == null) {
                                    if (!(objZza instanceof Boolean)) {
                                        if (objZza instanceof Integer) {
                                            int i12 = asBinder + 83;
                                            asInterface = i12 % 128;
                                            if (i12 % 2 != 0) {
                                                ((Integer) objZza).intValue();
                                                Object obj2 = null;
                                                obj2.hashCode();
                                                throw null;
                                            }
                                        } else if (!(objZza instanceof Float)) {
                                            if (objZza instanceof Double) {
                                                int i13 = asInterface + 29;
                                                asBinder = i13 % 128;
                                                int i14 = i13 % 2;
                                            } else if (objZza instanceof String) {
                                                zEquals = objZza.equals("");
                                            } else if (!(!(objZza instanceof zzahm))) {
                                                int i15 = asInterface + 119;
                                                asBinder = i15 % 128;
                                                int i16 = i15 % 2;
                                                zEquals = objZza.equals(zzahm.zza);
                                            } else if (!(objZza instanceof zzakk)) {
                                            }
                                        }
                                    }
                                } else if (((Boolean) zzaja.zza(method5, zzakkVar, new Object[0])).booleanValue()) {
                                }
                                zza(sb, i2, strSubstring, objZza);
                            }
                        }
                    }
                }
            } else {
                int i17 = asBinder + 93;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                if (!method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    zza(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzaja.zza(method, zzakkVar, new Object[0]));
                }
            }
            i3 = 3;
        }
        if (zzakkVar instanceof zzaja.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzaja.zzd) zzakkVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzame zzameVar = ((zzaja) zzakkVar).zzb;
        if (zzameVar != null) {
            int i19 = asInterface + 61;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            zzameVar.zza(sb, i2);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 78 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20952 - View.resolveSize(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), Color.argb(0, 0, 0, 0) + 75, 16037 - (ViewConfiguration.getWindowTouchSlop() >> 8), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i7 = 1052772399;
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 63, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i7 = 1052772399;
                }
                String str = new String(cArr4);
                int i8 = $11 + 81;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $11 + 61;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i12 = $10 + 71;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i14 = $10 + 47;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i2] >> iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.getDefaultSize(0, 0) + 63, 12214 - KeyEvent.keyCodeFromString(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 63 - Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{32403, 32409, 32397, 32392, 32613, 32402, 32393};
        onExtraCallbackWithResult = -1184334074;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }
}
