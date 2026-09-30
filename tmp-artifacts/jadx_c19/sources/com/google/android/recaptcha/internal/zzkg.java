package com.google.android.recaptcha.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkg {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final char[] zza;

    static {
        IAuthTabCallback();
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(int i2, StringBuilder sb) {
        int i3;
        int i4 = 2 % 2;
        while (i2 > 0) {
            int i5 = onWarmupCompleted + 1;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            if (i5 % 2 != 0) {
                i3 = 80;
                if (i2 <= 80) {
                }
            } else if (i2 <= 15) {
                int i7 = i6 + 17;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 64 / 0;
                }
                i3 = i2;
            } else {
                i3 = 125;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }

    static String zza(zzke zzkeVar, String str) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzkeVar, sb, 0);
        String string = sb.toString();
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void zzb(StringBuilder sb, int i2, String str, Object obj) throws Throwable {
        int i3 = 2 % 2;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                int i4 = onWarmupCompleted + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    zzb(sb, i2, str, it.next());
                    int i5 = 4 / 0;
                } else {
                    zzb(sb, i2, str, it.next());
                }
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i6 = 1; i6 < str.length(); i6++) {
                char cCharAt = str.charAt(i6);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzlg.zza(new zzgt(((String) obj).getBytes(zzjc.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgw) {
            int i7 = onWarmupCompleted + 87;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                sb.append(": \"");
                sb.append(zzlg.zza((zzgw) obj));
                sb.append('|');
                return;
            } else {
                sb.append(": \"");
                sb.append(zzlg.zza((zzgw) obj));
                sb.append('\"');
                return;
            }
        }
        if (!(!(obj instanceof zzit))) {
            sb.append(" {");
            zzd((zzit) obj, sb, i2 + 2);
            sb.append("\n");
            zzc(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i8 = onNavigationEvent + 125;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i2 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        Object[] objArr = new Object[1];
        a(new char[]{11289, 11378, 52906, 36585, 21471, 54250, 5533}, TextUtils.lastIndexOf("", '0') + 1, objArr);
        zzb(sb, i10, ((String) objArr[0]).intern(), entry.getKey());
        Object[] objArr2 = new Object[1];
        a(new char[]{37380, 37490, 41957, 58274, 37457, 4721, 34304, 17927, 37625}, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        zzb(sb, i10, ((String) objArr2[0]).intern(), entry.getValue());
        sb.append("\n");
        zzc(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[PHI: r14
      0x0053: PHI (r14v31 java.lang.reflect.Method) = (r14v30 java.lang.reflect.Method), (r14v32 java.lang.reflect.Method) binds: [B:11:0x0051, B:8:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzd(zzke zzkeVar, StringBuilder sb, int i2) throws Throwable {
        boolean zEquals;
        Method method;
        int i3 = 2 % 2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzkeVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = onNavigationEvent + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                method = declaredMethods[i4];
                int i6 = 95 / 0;
                if (Modifier.isStatic(method.getModifiers())) {
                    continue;
                } else {
                    int i7 = onNavigationEvent + 31;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (method.getName().length() < 3) {
                            continue;
                        } else if (!(!method.getName().startsWith("set"))) {
                            hashSet.add(method.getName());
                        } else if (Modifier.isPublic(method.getModifiers())) {
                            int i8 = onNavigationEvent + 97;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0) {
                                int length2 = method.getParameterTypes().length;
                                throw null;
                            }
                            if (method.getParameterTypes().length == 0) {
                                if (method.getName().startsWith("has")) {
                                    map.put(method.getName(), method);
                                } else if (method.getName().startsWith("get")) {
                                    int i9 = onNavigationEvent + 97;
                                    onWarmupCompleted = i9 % 128;
                                    int i10 = i9 % 2;
                                    treeMap.put(method.getName(), method);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (method.getName().length() < 3) {
                        continue;
                    }
                }
            } else {
                method = declaredMethods[i4];
                if (Modifier.isStatic(method.getModifiers())) {
                    continue;
                }
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(3);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List")) {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                    int i11 = onNavigationEvent + 93;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    Method method2 = (Method) entry.getValue();
                    if (method2 != null) {
                        int i12 = onWarmupCompleted + 97;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            method2.getReturnType().equals(Map.class);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                            zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzit.zzz(method2, zzkeVar, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring))) {
                            if (strSubstring.endsWith("Bytes")) {
                                int i13 = onNavigationEvent + 75;
                                onWarmupCompleted = i13 % 128;
                                if (i13 % 2 != 0) {
                                    if (!treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() % 5))))) {
                                    }
                                } else if (!treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5))))) {
                                }
                            }
                            Method method3 = (Method) entry.getValue();
                            Method method4 = (Method) map.get("has".concat(strSubstring));
                            if (method3 != null) {
                                Object objZzz = zzit.zzz(method3, zzkeVar, new Object[0]);
                                if (method4 == null) {
                                    if (objZzz instanceof Boolean) {
                                        if (((Boolean) objZzz).booleanValue()) {
                                        }
                                    } else if (objZzz instanceof Integer) {
                                        if (((Integer) objZzz).intValue() != 0) {
                                        }
                                    } else if (objZzz instanceof Float) {
                                        if (Float.floatToRawIntBits(((Float) objZzz).floatValue()) != 0) {
                                        }
                                    } else if (!(objZzz instanceof Double)) {
                                        if (objZzz instanceof String) {
                                            zEquals = objZzz.equals("");
                                        } else if (objZzz instanceof zzgw) {
                                            zEquals = objZzz.equals(zzgw.zzb);
                                            int i14 = onNavigationEvent + 111;
                                            onWarmupCompleted = i14 % 128;
                                            int i15 = i14 % 2;
                                        } else if (!(objZzz instanceof zzke)) {
                                            if (!(objZzz instanceof Enum) || ((Enum) objZzz).ordinal() != 0) {
                                            }
                                        } else if (objZzz != ((zzke) objZzz).zzY()) {
                                        }
                                        if (!zEquals) {
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objZzz).doubleValue()) != 0) {
                                    }
                                } else if (((Boolean) zzit.zzz(method4, zzkeVar, new Object[0])).booleanValue()) {
                                }
                                zzb(sb, i2, strSubstring, objZzz);
                            }
                        }
                    }
                }
                if (hashSet.contains("set".concat(strSubstring))) {
                }
            } else {
                int i16 = onWarmupCompleted + 67;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                Method method5 = (Method) entry.getValue();
                if (method5 != null && method5.getReturnType().equals(List.class)) {
                    zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzit.zzz(method5, zzkeVar, new Object[0]));
                }
            }
        }
        if (zzkeVar instanceof zzip) {
            int i18 = onNavigationEvent + 101;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            Iterator itZzf = ((zzip) zzkeVar).zzb.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb, i2, "[" + ((zziq) entry2.getKey()).zza + "]", entry2.getValue());
            }
        }
        zzlm zzlmVar = ((zzit) zzkeVar).zzc;
        if (zzlmVar != null) {
            zzlmVar.zzi(sb, i2);
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - KeyEvent.normalizeMetaState(0)), 84 - View.combineMeasuredStates(0, 0), 21233 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 14185), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, TextUtils.indexOf("", "", 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $11 + 9;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -1179807539291407574L;
    }
}
