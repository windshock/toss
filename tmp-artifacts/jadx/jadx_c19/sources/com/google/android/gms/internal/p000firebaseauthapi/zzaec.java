package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.onMeasure;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzaec {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final Map<String, zzaeb> zza;
    private static final Map<String, List<WeakReference<zzaee>>> zzb;

    private static String zza(String str, int i2, boolean z) {
        int i3 = 2 % 2;
        int i4 = onTransact + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (z) {
            return "http://[" + str + "]:" + i2 + "/";
        }
        String str2 = "http://" + str + ":" + i2 + "/";
        int i5 = asInterface + 37;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    public static String zza(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")) + "emulator/auth/handler";
    }

    public static String zzb(String str) throws Throwable {
        zzaeb zzaebVar;
        String string;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            string = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            Object[] objArr = new Object[1];
            a(new char[]{22254, 10424, 47775, 59536, 43589, 13969, 16560, 10638}, 8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        Object[] objArr2 = new Object[1];
        a(new char[]{16862, 14616, 36417, 56034, 46394, 40655, 29111, 23669, 61139, 12535, 38783, 8442, 4702, 54878, 17459, 37896, 61753, 50843, 53401, 10091, 34013, 2484, 54997, 63737, 40637, 34893, 3872, 60849, 29365, 25639, 7388, 4602, 40637, 34893, 32433, 14982, 44420, 28433, 35758, 8787, 40294, 40305, 56741, 39101, 3057, 35880, 49439, 31569, 54100, 14522}, Color.red(0) + 50, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        return sb2.toString();
    }

    public static String zzc(String str) throws Throwable {
        zzaeb zzaebVar;
        String string;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            string = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            Object[] objArr = new Object[1];
            a(new char[]{22254, 10424, 47775, 59536, 43589, 13969, 16560, 10638}, 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            string = sb.toString();
        }
        return string + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) throws Throwable {
        zzaeb zzaebVar;
        String string;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            string = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            Object[] objArr = new Object[1];
            a(new char[]{22254, 10424, 47775, 59536, 43589, 13969, 16560, 10638}, 8 - Color.alpha(0), objArr);
            sb.append(((String) objArr[0]).intern());
            string = sb.toString();
        }
        return string + "securetoken.googleapis.com/v1";
    }

    static {
        onExtraCallback();
        zza = new onMeasure();
        zzb = new onMeasure();
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static void zza(String str, zzaee zzaeeVar) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzaeeVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference<>(zzaeeVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, int i2) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzaeb(str, i2));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(apiKey)) {
                Iterator<WeakReference<zzaee>> it = map2.get(apiKey).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    zzaee zzaeeVar = it.next().get();
                    if (zzaeeVar != null) {
                        zzaeeVar.zza();
                        z = true;
                    }
                }
                if (!z) {
                    zza.remove(apiKey);
                }
            }
        }
    }

    public static boolean zza(@NonNull FirebaseApp firebaseApp) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean zContainsKey = zza.containsKey(firebaseApp.getOptions().getApiKey());
        int i5 = onTransact + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zContainsKey;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $10 + 107;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[c] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                        int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, touchSlop, i13, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i14 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 11, TextUtils.indexOf((CharSequence) "", '0') + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i14 + 1;
                    int i15 = $11 + 57;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16014), 14 - View.combineMeasuredStates(0, 0), View.resolveSize(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i17 = $11 + 31;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 62149;
        onNavigationEvent = (char) 10114;
        IAuthTabCallback = (char) 31774;
        onExtraCallbackWithResult = (char) 56638;
    }
}
