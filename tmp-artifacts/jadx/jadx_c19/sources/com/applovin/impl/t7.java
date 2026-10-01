package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.core.impl.Quirks$;
import com.alcherainc.facesdk.pro.ALCFaceSDK$;
import com.alibaba.ariver.kernel.RVParams;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7$;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class t7 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static final int[] a;
    private static final String[] b;
    private static final String[] c;
    private static final DecimalFormat d;
    private static final Random e;
    private static Boolean f = null;
    private static Boolean g = null;
    private static String h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Boolean f7i = null;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static /* synthetic */ void $r8$lambda$KjloZvf5E1WMQtjWA7WFzt_yVrg(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        a(context, str);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallback + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        onWarmupCompleted();
        a = new int[]{60, 60, 24, 7, 4, 12};
        b = new String[]{" second", " minute", " hour", " day", " week", " month"};
        c = new String[]{"s", "m", "h", "d", "w", "mth"};
        d = new DecimalFormat();
        e = new Random();
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static double a(long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        double d2 = j;
        double d3 = i3 % 2 == 0 ? d2 - 1024.0d : d2 / 1024.0d;
        int i5 = i4 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return d3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int a(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 3;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        int i7 = i5 % 2;
        if (i2 >= 0) {
            int i8 = i6 + 3;
            int i9 = i8 % 128;
            onExtraCallback = i9;
            int i10 = i8 % 2;
            if (i2 <= 100) {
                int i11 = i9 + 33;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    return i2;
                }
                throw null;
            }
        }
        return i3;
    }

    public static void a() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    public static boolean a(long j, long j2) {
        int i2 = 2 % 2;
        if ((j & j2) == 0) {
            return false;
        }
        int i3 = onExtraCallback;
        int i4 = i3 + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 113;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static float b(float f2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        float f3 = f2 * 1000.0f;
        int i6 = i3 + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return f3;
    }

    public static long b(long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 5;
        onNavigationEvent = i4 % 128;
        long j2 = i4 % 2 == 0 ? j >>> 2 : j << 3;
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j2;
    }

    public static void b() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int c(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int iA = a(i2, 95);
        int i6 = onExtraCallback + 89;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return iA;
    }

    public static void c() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
    }

    public static double d(long j) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        double d2 = j / 1000.0d;
        int i6 = i3 + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int d(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 69;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i2 << 10;
        int i8 = i5 + 75;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public static boolean i() {
        int i2 = 2 % 2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            int i3 = onNavigationEvent + 25;
            onExtraCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static boolean j() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static long c(float f2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long jA = a(b(f2));
        int i5 = onNavigationEvent + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jA;
    }

    public static double c(long j) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        double dA = a(b(j));
        int i5 = onExtraCallback + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return dA;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
            if (str != null) {
                if (str.length() > d(8)) {
                    p.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + d(8) + " maximum)");
                }
            }
        } else if (str != null) {
        }
        int i5 = onExtraCallback + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static boolean l() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            l.p();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context contextP = l.p();
        if (contextP == null) {
            return false;
        }
        boolean zA = y.a(contextP).a("applovin.sdk.verbose_logging");
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return zA;
    }

    public static long e(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            StringUtils.isValidString(str);
            obj.hashCode();
            throw null;
        }
        if (StringUtils.isValidString(str)) {
            try {
                long color = Color.parseColor(str);
                int i4 = onNavigationEvent + 107;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return color;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
        int i5 = onNavigationEvent + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Long.MAX_VALUE;
    }

    public static boolean l(Context context) {
        int i2 = 2 % 2;
        if (context == null) {
            int i3 = onExtraCallback + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallback + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static boolean m(Context context) {
        int i2 = 2 % 2;
        if (context == null) {
            int i3 = onExtraCallback + 117;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                l.p();
                throw null;
            }
            context = l.p();
        }
        if (context == null) {
            return false;
        }
        int i4 = onExtraCallback + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return y.a(context).a("applovin.sdk.verbose_logging", false);
    }

    public static boolean c(l lVar) {
        int i2 = 2 % 2;
        String str = (String) lVar.p0().getExtraParameters().get("run_in_release_mode");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            int i3 = onNavigationEvent + 21;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if ((l.p().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return false;
    }

    public static String f(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str != null && str.length() > 4) {
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str.substring(str.length() - 4);
        }
        int i6 = onExtraCallback + 65;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return "NOKEY";
        }
        throw null;
    }

    public static boolean j(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (g == null) {
            g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        boolean zBooleanValue = g.booleanValue();
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    public static long c(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long jA = a(bArr, 0);
        int i5 = onNavigationEvent + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return jA;
    }

    public static String b(Class cls, String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            Field fieldA = a(cls, str);
            fieldA.setAccessible(true);
            String str2 = (String) fieldA.get(null);
            int i5 = onExtraCallback + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String strReplace = str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
        int i5 = onNavigationEvent + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return strReplace;
    }

    public static int d(Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WindowManager windowManagerF = f(context);
        if (windowManagerF != null) {
            return windowManagerF.getDefaultDisplay().getRotation();
        }
        int i5 = onExtraCallback + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public static WindowManager f(Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StrictMode.setVmPolicy(vmPolicy);
        int i5 = onExtraCallback + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return windowManager;
    }

    public static boolean h() {
        int i2 = 2 % 2;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i3 = onNavigationEvent + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            p.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i5 = runningAppProcessInfo.importance;
        if (i5 == 100 || i5 == 200) {
            return true;
        }
        int i6 = onNavigationEvent + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static boolean k() {
        int i2 = 2 % 2;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (!displayName.contains("tun") && !displayName.contains("ppp")) {
                    int i5 = onNavigationEvent + 57;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (displayName.contains("ipsec")) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            p.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static String d() {
        int i2 = 2 % 2;
        try {
            String str = Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
            int i3 = onExtraCallback + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Throwable th) {
            p.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static boolean k(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            String packageName = context.getPackageName();
            if ((!"com.revolverolver.fliptrickster".equals(packageName)) && !"com.mindstormstudios.idlemakeover".equals(packageName)) {
                return false;
            }
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        "com.revolverolver.fliptrickster".equals(context.getPackageName());
        throw null;
    }

    public static l f() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        l lVar = l.E0;
        if (lVar != null) {
            return lVar;
        }
        Context contextP = l.p();
        if (contextP != null) {
            return AppLovinSdk.getInstance(contextP).a();
        }
        int i5 = onNavigationEvent;
        int i6 = i5 + 73;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        int i8 = i5 + 43;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static String e() {
        int i2 = 2 % 2;
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                int i3 = onNavigationEvent + 69;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    int i5 = onExtraCallback + 79;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return field.getName();
                    }
                    int i6 = 1 / 0;
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            p.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static int g(String str) {
        String str2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String[] strArrSplit = str.replaceAll("-beta", ".").split("\\.");
        int length = strArrSplit.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = onNavigationEvent + 5;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                str2 = strArrSplit[i6];
                if (str2.length() > 3) {
                    p.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                    return i5;
                }
                i5 = (i5 * 100) + Integer.parseInt(str2);
            } else {
                str2 = strArrSplit[i6];
                if (str2.length() > 2) {
                    p.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                    return i5;
                }
                i5 = (i5 * 100) + Integer.parseInt(str2);
            }
        }
        if (!str.contains("-beta")) {
            i5 = (i5 * 100) + 99;
        }
        int i8 = onNavigationEvent + 89;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    public static boolean h(Context context) {
        int i2 = 2 % 2;
        if (f == null) {
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
            } else {
                f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        boolean zBooleanValue = f.booleanValue();
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static void b(AppLovinAd appLovinAd, l lVar) {
        int i2 = 2 % 2;
        if (appLovinAd instanceof AppLovinAdBase) {
            int i3 = onExtraCallback + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String strK0 = lVar.k0();
            String strK02 = appLovinAdBase.getSdk().k0();
            if (!strK0.equals(strK02)) {
                String str = "Ad was loaded from sdk with key: " + strK02 + ", but is being rendered from sdk with key: " + strK0;
                p.h("AppLovinAd", str);
                a(str, appLovinAdBase, "AppLovinAd", lVar);
            }
        }
        int i5 = onNavigationEvent + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static boolean g(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        y yVarA = y.a(context);
        if (i4 != 0) {
            yVarA.a("applovin.sdk.is_test_environment");
            throw null;
        }
        boolean zA = yVarA.a("applovin.sdk.is_test_environment");
        int i5 = onNavigationEvent + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zA;
    }

    public static int g() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            if (!(!p0.b())) {
                return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
            }
            int i4 = onNavigationEvent + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        p0.b();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean e(l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (((Boolean) lVar.a(c5.i2)).booleanValue()) {
                int i4 = onExtraCallback + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return lVar.p0().isMuted();
                }
                lVar.p0().isMuted();
                obj.hashCode();
                throw null;
            }
            return ((Boolean) lVar.a(c5.g2)).booleanValue();
        }
        ((Boolean) lVar.a(c5.i2)).booleanValue();
        obj.hashCode();
        throw null;
    }

    public static Context e(Context context) {
        int i2 = 2 % 2;
        if (!l(context)) {
            return l.p();
        }
        int i3 = onExtraCallback + 43;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return context;
    }

    public static byte[] d(byte[] bArr) throws IOException {
        int i2 = 2 % 2;
        if (bArr == null) {
            return bArr;
        }
        int i3 = onExtraCallback + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (bArr.length == 0) {
            return bArr;
        }
        if (b(bArr)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i5 = gZIPInputStream.read(bArr2);
                if (i5 > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i5);
                } else {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            int i6 = onNavigationEvent + 117;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return bArr;
            }
            int i7 = 22 / 0;
            return bArr;
        }
    }

    public static String d(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            a(str, str.split("\\.").length);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strA = a(str, str.split("\\.").length);
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return strA;
    }

    public static Boolean i(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        Boolean bool = f7i;
        if (bool != null) {
            return bool;
        }
        try {
            String strA = y.a(context).a();
            String strC = c(context);
            if (strC == null) {
                int i4 = onNavigationEvent + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            if (strC.equals(strA)) {
                Boolean bool2 = Boolean.TRUE;
                f7i = bool2;
                int i6 = onNavigationEvent + 37;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return bool2;
                }
                throw null;
            }
            if (TextUtils.isEmpty(strA)) {
                int i7 = onNavigationEvent + 115;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (strC.equals(context.getPackageName())) {
                    Boolean bool3 = Boolean.TRUE;
                    f7i = bool3;
                    return bool3;
                }
            }
            Boolean bool4 = Boolean.FALSE;
            f7i = bool4;
            return bool4;
        } catch (Throwable th) {
            p.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean d(l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) lVar.p0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        int i5 = onExtraCallback + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r6 != 3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context) {
        int i2 = 2 % 2;
        Point pointB = p0.b(context);
        int i3 = pointB.x;
        int i4 = pointB.y;
        int iD = d(context);
        if (i3 > i4) {
            int i5 = onExtraCallback;
            int i6 = i5 + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iD != 0) {
                int i7 = i5 + 73;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                if (iD != 2) {
                    if (i4 > i3) {
                        int i9 = onNavigationEvent + 69;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        if (iD != 1) {
                        }
                    }
                    return b(iD);
                }
            }
        }
        return a(iD);
    }

    public static String c(Context context) {
        int iMyPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (context == null) {
            return null;
        }
        if (!(!StringUtils.isValidString(h))) {
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return h;
        }
        try {
            iMyPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            p.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            p.c("Utils", "No running app processes. Unable to determine process name");
            int i6 = onNavigationEvent + 45;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (iMyPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                h = str;
                return str;
            }
        }
        return null;
    }

    public static String a(Map map, boolean z) {
        int i2 = 2 % 2;
        if (map == null || map.isEmpty()) {
            int i3 = onNavigationEvent + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        Iterator it = map.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            if (sb.length() > 0) {
                sb.append("&");
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                int i5 = onExtraCallback + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                String str = (String) value;
                if (str.contains("&")) {
                    int i7 = onNavigationEvent + 85;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    value = str.replace("&", "%26");
                }
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(value);
        }
        return sb.toString();
    }

    private static String b(int i2) throws Throwable {
        int i3 = 2 % 2;
        if (i2 == 0) {
            return RVParams.LONG_PORTRAIT;
        }
        if (i2 == 1) {
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return "landscape_right";
        }
        if (i2 == 2) {
            return "portrait_upside_down";
        }
        if (i2 == 3) {
            return "landscape_left";
        }
        Object[] objArr = new Object[1];
        n(new int[]{1, 7, 0, 4}, false, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i6 = onExtraCallback + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return new java.io.File(r4).length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 87;
        com.applovin.impl.t7.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long b(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    public static boolean b(byte[] bArr) {
        int i2 = 2 % 2;
        if (bArr.length < 2 || bArr[0] != 31 || bArr[1] != -117) {
            return false;
        }
        int i3 = onExtraCallback + 7;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 11;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Map a(Map map) {
        Iterator it;
        int i2 = 2 % 2;
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            int i3 = onNavigationEvent + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                it = map.entrySet().iterator();
                int i4 = 14 / 0;
            } else {
                it = map.entrySet().iterator();
            }
            while (it.hasNext()) {
                int i5 = onNavigationEvent + 79;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
                    throw null;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                map2.put((String) entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        return map2;
    }

    public static boolean a(String str, List list) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return StringUtils.startsWithAtLeastOnePrefix(str, list);
        }
        StringUtils.startsWithAtLeastOnePrefix(str, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean b(l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        boolean z = false;
        try {
            if (i3 % 2 != 0) {
                JSONObject.wrap(JSONObject.NULL);
            } else {
                JSONObject.wrap(JSONObject.NULL);
                z = true;
            }
            return z;
        } catch (Throwable th) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().d("Utils", "Failed to wrap JSONObject with exception", th);
            }
            return z;
        }
    }

    public static long a(l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long jLongValue = ((Long) lVar.a(c5.R5)).longValue();
        long jLongValue2 = ((Long) lVar.a(c5.S5)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jLongValue > 0) {
            int i5 = onNavigationEvent + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0 ? jLongValue2 > 0 : jLongValue2 > 0) {
                jCurrentTimeMillis += jLongValue - jLongValue2;
            }
        }
        int i6 = onExtraCallback + 71;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return jCurrentTimeMillis;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean b(List list) {
        int i2 = 2 % 2;
        Context contextP = l.p();
        if (contextP == null) {
            int i3 = onExtraCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            p.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        boolean zContains = list.contains(contextP.getPackageName());
        int i5 = onNavigationEvent + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zContains;
    }

    public static WebView b(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WebView webViewA = a(context, str, false);
        int i5 = onNavigationEvent + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return webViewA;
    }

    public static void a(String str, String str2, Map map) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!map.containsKey(str)) {
            return;
        }
        int i5 = onNavigationEvent + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            map.put(str2, map.get(str));
            map.remove(str);
        } else {
            map.put(str2, map.get(str));
            map.remove(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static long a(float f2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long jRound = Math.round(f2);
        int i5 = onNavigationEvent + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jRound;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(long j, boolean z) {
        String str;
        int i2 = 2 % 2;
        String[] strArr = z ? b : c;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        int i3 = 0;
        while (i3 < strArr.length) {
            long j2 = a[i3];
            if (jCurrentTimeMillis < j2) {
                int i4 = onExtraCallback + 121;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                if (i4 % 2 != 0 ? jCurrentTimeMillis <= 0 : jCurrentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                if (z) {
                    int i6 = i5 + 101;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (jCurrentTimeMillis > 1) {
                        str = "s";
                    } else {
                        int i8 = onExtraCallback + 9;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        str = "";
                    }
                }
                return String.format("%d%s%s%s", Long.valueOf(jCurrentTimeMillis), strArr[i3], str, z ? " ago" : "");
            }
            jCurrentTimeMillis /= j2;
            i3++;
            int i10 = onExtraCallback + 35;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        if (!z) {
            return "now";
        }
        int i12 = onNavigationEvent + 11;
        onExtraCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return "just now";
        }
        throw null;
    }

    class b extends y4 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = 8598235350012935034L;
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        protected Map a() throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            b(new char[]{48675, 47553, 45562, 43503}, ((byte) KeyEvent.getModifierMetaStateMask()) + 2030, objArr);
            HashMap mapHashMap = CollectionUtils.hashMap(((String) objArr[0]).intern(), "Utils:" + this.a);
            int i3 = onExtraCallbackWithResult + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return mapHashMap;
            }
            throw null;
        }

        private static void b(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = $11 + 43;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19627 - Drawable.resolveOpacity(0, 0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (onNavigationEvent / 5407414049857832247L);
                        try {
                            Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - Color.alpha(0), 19627 - ExpandableListView.getPackedPositionType(0L), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                        try {
                            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                int i7 = $11 + 99;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 3;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i9 = $10 + 3;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 59, 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static double a(String str, double d2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        try {
            double d3 = Double.parseDouble(str);
            int i5 = onExtraCallback + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return d3;
        } catch (Throwable th) {
            p.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static String a(Uri uri, String str, l lVar) {
        int i2 = 2 % 2;
        List listC = lVar.c(c5.H0);
        String lastPathSegment = uri.getLastPathSegment();
        if (!listC.contains(lastPathSegment)) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = uri.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                int i3 = onExtraCallback + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String queryParameter = uri.getQueryParameter(it.next());
                if (StringUtils.isValidString(queryParameter)) {
                    int i5 = onNavigationEvent + 39;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        arrayList.add(queryParameter);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(queryParameter);
                }
            }
            arrayList.addAll(uri.getPathSegments());
            String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
            Integer num = (Integer) lVar.a(c5.I0);
            int length = StringUtils.emptyIfNull(strEncodeUriString).length() + StringUtils.emptyIfNull(str).length();
            if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
                strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
            }
            if (!StringUtils.isValidString(strEncodeUriString) || !StringUtils.isValidString(str)) {
                return strEncodeUriString;
            }
            return str + strEncodeUriString;
        }
        int i6 = onExtraCallback + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return lastPathSegment;
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, l lVar) {
        String label;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder();
            sb.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            if (maxAdFormat != null) {
                int i5 = onExtraCallback + 103;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    maxAdFormat.getLabel();
                    throw null;
                }
                label = maxAdFormat.getLabel();
            } else {
                label = "None";
                int i6 = onExtraCallback + 107;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            sb.append(label);
            sb.append("\"\n..SDK KEY: \"");
            sb.append(lVar.k0());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(l.p().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String string = sb.toString();
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("AppLovinSdk", string);
                int i8 = onNavigationEvent + 65;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AppLovinAd a(AppLovinAd appLovinAd, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
            if (appLovinAd instanceof c) {
                c cVar = (c) appLovinAd;
                AppLovinAdImpl appLovinAdImplDequeueAd = lVar.l().dequeueAd(cVar.getAdZone());
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("Utils", "Dequeued ad for dummy ad: " + appLovinAdImplDequeueAd);
                }
                if (appLovinAdImplDequeueAd != null) {
                    int i5 = onExtraCallback + 85;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        cVar.a(appLovinAdImplDequeueAd);
                        appLovinAdImplDequeueAd.setDummyAd(cVar);
                        return appLovinAdImplDequeueAd;
                    }
                    cVar.a(appLovinAdImplDequeueAd);
                    appLovinAdImplDequeueAd.setDummyAd(cVar);
                    throw null;
                }
                appLovinAd = cVar.f();
            }
        } else if (appLovinAd instanceof c) {
        }
        int i6 = onExtraCallback + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return appLovinAd;
        }
        obj.hashCode();
        throw null;
    }

    public static u a(JSONObject jSONObject, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        u uVarA = u.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", (String) null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", (String) null)), JsonUtils.getString(jSONObject, "zone_id", (String) null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
        int i5 = onExtraCallback + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return uVarA;
    }

    public static Field a(Class cls, String str) throws NoSuchFieldException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            Field declaredField = cls.getDeclaredField(str);
            int i5 = onNavigationEvent + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return declaredField;
            }
            obj.hashCode();
            throw null;
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        return i3 % 2 == 0 ? a(jSONObject, str, null, str2, null, false, lVar) : a(jSONObject, str, null, str2, null, false, lVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        List listA = a(jSONObject, map3, str2, map2, z, lVar);
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return listA;
        }
        throw null;
    }

    private static void n(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 35283), ImageFormat.getBitsPerPixel(0) + 36, (Process.myTid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i8 = $11 + 35;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.getDefaultSize(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 65, 16718 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 29 - ((Process.getThreadPriority(0) + 20) >> 6), 17657 - View.resolveSize(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49467), TextUtils.lastIndexOf("", '0', 0, 0) + 71, TextUtils.indexOf((CharSequence) "", '0') + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $11 + 107;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $11 + 75;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z, l lVar) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        Object obj = null;
        if (StringUtils.isValidString(str)) {
            arrayList.add(new e(str, (String) null, map2, z));
        }
        if (jSONObject.length() > 0) {
            int i3 = onNavigationEvent + 57;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObject.keys();
                obj.hashCode();
                throw null;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                int i4 = onExtraCallback + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (AppLovinSdkUtils.isValidString(strOptString)) {
                            int i6 = onExtraCallback + 23;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                StringUtils.replace(strOptString, map);
                                throw null;
                            }
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new e(strReplace, strOptString, map2, z));
                        int i7 = onNavigationEvent + 89;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                    }
                } catch (Throwable th) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("Utils", "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r1.length() == 86) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l lVar, String str) {
        String str2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String strK0 = lVar.k0();
        if (((Boolean) lVar.a(c5.x)).booleanValue()) {
            int i5 = onNavigationEvent + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                if (strK0 != null) {
                }
                if (TextUtils.isEmpty(strK0)) {
                }
                a(str2, str, lVar);
                return;
            }
            int i6 = 64 / 0;
            if (strK0 != null) {
            }
            if (TextUtils.isEmpty(strK0)) {
                str2 = "Invalid SDK key length";
            } else {
                int i7 = onExtraCallback + 103;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                str2 = "Empty SDK key";
            }
            a(str2, str, lVar);
            return;
        }
        int i9 = onNavigationEvent + 9;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    private static void a(String str, String str2, l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        a(str, (AppLovinAdBase) null, str2, lVar);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
    }

    private static void a(String str, AppLovinAdBase appLovinAdBase, String str2, l lVar) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("sdkKey=");
        sb.append(lVar.k0());
        if (appLovinAdBase != null) {
            int i3 = onNavigationEvent + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            sb.append(",adSdkKey=");
            sb.append(appLovinAdBase.getSdk().k0());
        }
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), map);
        CollectionUtils.putStringIfValid("error_message", str, map);
        lVar.E().a(h2.e1, str2, map);
        int i5 = onExtraCallback + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    public static Map a(Map map, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                int i5 = onExtraCallback + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        int i7 = onNavigationEvent + 15;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return map2;
        }
        throw null;
    }

    public static String a(Context context, String str, l lVar) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (!listQueryIntentActivities.isEmpty()) {
                int i3 = onNavigationEvent + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return listQueryIntentActivities.get(0).activityInfo.name;
            }
        } catch (Throwable th) {
            lVar.E().a(str, th);
        }
        int i5 = onNavigationEvent + 121;
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static String a(int i2) throws Throwable {
        int i3 = 2 % 2;
        if (i2 == 0) {
            return "landscape_right";
        }
        int i4 = onExtraCallback + 51;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 == 0) {
            if (i2 == 0) {
                return "portrait_upside_down";
            }
        } else if (i2 == 1) {
            return "portrait_upside_down";
        }
        if (i2 == 2) {
            return "landscape_left";
        }
        if (i2 != 3) {
            int i6 = i5 + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            n(new int[]{1, 7, 0, 4}, false, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
            return ((String) objArr[0]).intern();
        }
        int i8 = i5 + 27;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 89 / 0;
        }
        return RVParams.LONG_PORTRAIT;
    }

    public static boolean a(String str) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i3 = onNavigationEvent + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        try {
            Class.forName(str);
            int i5 = onNavigationEvent + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(List list) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a((String) it.next())) {
                    int i4 = onNavigationEvent + 59;
                    onExtraCallback = i4 % 128;
                    return i4 % 2 == 0;
                }
            }
            int i5 = onNavigationEvent + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return false;
        }
        list.iterator();
        throw null;
    }

    public static void a(Runnable runnable) {
        int i2 = 2 % 2;
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
        int i3 = onNavigationEvent + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void a(Closeable closeable, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (closeable != null) {
            int i5 = i3 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            try {
                closeable.close();
                return;
            } catch (Throwable th) {
                if (lVar != null) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("Utils", "Unable to close stream: " + closeable, th);
                    }
                }
            }
        }
        int i7 = onExtraCallback + 19;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void a(HttpURLConnection httpURLConnection, l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                int i4 = onExtraCallback + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 95 / 0;
                }
            } catch (Throwable th) {
                if (lVar != null) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                    }
                }
            }
        }
    }

    public static void a(String str, Context context) {
        int i2 = 2 % 2;
        AppLovinSdkUtils.runOnUiThread(new t7$.ExternalSyntheticLambda0(context, str));
        int i3 = onExtraCallback + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ void a(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallback = i3 % 128;
        Toast toastMakeText = Toast.makeText(context, str, i3 % 2 != 0 ? 1 : 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        int i2 = 2 % 2;
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER) {
            return true;
        }
        int i5 = onExtraCallback + 25;
        onNavigationEvent = i5 % 128;
        return i5 % 2 == 0;
    }

    public static String a(Object obj) {
        int i2 = 2 % 2;
        if (!(obj instanceof c3)) {
            if (!a4.a(obj)) {
                return null;
            }
            String mediationServeId = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
            int i3 = onNavigationEvent + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return mediationServeId;
        }
        int i5 = onNavigationEvent + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return ((c3) obj).T();
        }
        ((c3) obj).T();
        throw null;
    }

    public static List a(boolean z, com.applovin.impl.sdk.ad.b bVar, l lVar, Context context) {
        int i2 = 2 % 2;
        if (bVar instanceof u7) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.m().keySet()).iterator();
        int i3 = onNavigationEvent + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            Uri uri = Uri.parse((String) it.next());
            if (a(uri, lVar, context)) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("Utils", "Cached HTML asset missing: " + uri);
                    int i5 = onExtraCallback + 53;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
                arrayList.add(uri);
            }
        }
        Uri uriN0 = bVar.n0();
        if (z && uriN0 != null && a(uriN0, lVar, context)) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("Utils", "Cached video missing: " + uriN0);
            }
            arrayList.add(uriN0);
        }
        int i7 = onNavigationEvent + 57;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 95 / 0;
        }
        return arrayList;
    }

    private static boolean a(Uri uri, l lVar, Context context) {
        boolean z;
        int i2 = 2 % 2;
        boolean zC = lVar.I().c(uri.getLastPathSegment(), context);
        if (((Boolean) lVar.a(c5.f6)).booleanValue() && b(uri.getPath()) == 0) {
            int i3 = onExtraCallback + 79;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if ((!zC) || z) {
            return true;
        }
        int i8 = onExtraCallback + 105;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public static boolean a(List list, com.applovin.impl.sdk.ad.b bVar) {
        int i2 = 2 % 2;
        if (list.isEmpty()) {
            int i3 = onExtraCallback + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        List listS = bVar.S();
        Map mapM = bVar.m();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            int i5 = onExtraCallback + 111;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                listS.contains((String) mapM.get(((Uri) it.next()).toString()));
                throw null;
            }
            if (listS.contains((String) mapM.get(((Uri) it.next()).toString()))) {
                return true;
            }
        }
        return false;
    }

    public static void a(MaxError maxError, String str, Context context) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() != -5001) {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = onExtraCallback + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                    MaxError error = maxNetworkResponseInfo.getError();
                    String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                    sb.append("\nFailed to load " + str + " from " + name + ":\n");
                    sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                    sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
                }
            } else {
                maxError.getWaterfall().getNetworkResponses().iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        a("", sb.toString(), context);
    }

    public static void a(String str, String str2, Context context) {
        int i2 = 2 % 2;
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
        int i3 = onExtraCallback + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public static boolean a(double d2) {
        int i2 = 2 % 2;
        if (d2 >= 100.0d) {
            int i3 = onExtraCallback + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (d2 <= 0.0d) {
            return false;
        }
        if (e.nextFloat() < d2 / 100.0d) {
            int i5 = onExtraCallback + 121;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = onNavigationEvent + 121;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return false;
    }

    public static byte[] a(byte[] bArr) throws IOException {
        int i2 = 2 % 2;
        Object obj = null;
        if (bArr != null) {
            int i3 = onExtraCallback + 81;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                obj.hashCode();
                throw null;
            }
            if (bArr.length != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i4 = onExtraCallback + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 53 / 0;
                }
                return byteArray;
            }
        }
        return null;
    }

    public static long a(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 11;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i2 + 8;
        if (bArr.length >= i7) {
            int i8 = i5 + 75;
            onExtraCallback = i8 % 128;
            long j = i8 % 2 != 0 ? 1L : 0L;
            int i9 = i5 + 85;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            while (i2 < i7) {
                j |= (bArr[i2] & 255) << (i2 << 3);
                i2++;
            }
            return j;
        }
        throw new IllegalArgumentException("byte array must be at least 8 bytes long");
    }

    public static int a(Context context) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallback = i3 % 128;
        int i4 = Settings.System.getInt(context.getContentResolver(), "always_finish_activities", i3 % 2 != 0 ? 1 : 0);
        int i5 = onExtraCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static String a(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        String[] strArrSplit = StringUtils.toDigitsOnlyVersionString(str).split("\\.");
        if (strArrSplit.length != i2) {
            if (strArrSplit.length > i2) {
                return Quirks$.ExternalSyntheticBackport0.onExtraCallbackWithResult(".", new ArrayList(Arrays.asList(strArrSplit)).subList(0, i2));
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
            int size = i2 - arrayList.size();
            Object[] objArr = new Object[1];
            n(new int[]{0, 1, 0, 1}, false, new byte[]{0}, objArr);
            arrayList.addAll(Collections.nCopies(size, ((String) objArr[0]).intern()));
            String strOnExtraCallbackWithResult = Quirks$.ExternalSyntheticBackport0.onExtraCallbackWithResult(".", arrayList);
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return strOnExtraCallbackWithResult;
        }
        int i6 = onNavigationEvent + 111;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return ALCFaceSDK$.ExternalSyntheticBackport0.onExtraCallback(".", strArrSplit);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, String str2) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
            if (TextUtils.isEmpty(str)) {
                int i5 = onExtraCallback + 29;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (TextUtils.isEmpty(str2)) {
                    int i7 = onExtraCallback + 31;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return 0;
                }
            }
        } else if (TextUtils.isEmpty(str)) {
        }
        if (TextUtils.isEmpty(str)) {
            int i9 = onExtraCallback + 105;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 90 / 0;
            }
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            for (int i11 = 0; i11 < iMax; i11++) {
                int length = strArrSplit.length;
                Object[] objArr = new Object[1];
                n(new int[]{0, 1, 0, 1}, false, new byte[]{0}, objArr);
                String strIntern2 = ((String) objArr[0]).intern();
                if (i11 < length) {
                    strIntern = strArrSplit[i11];
                } else {
                    Object[] objArr2 = new Object[1];
                    n(new int[]{0, 1, 0, 1}, false, new byte[]{0}, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    int i12 = onExtraCallback + 1;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                }
                if (i11 < strArrSplit2.length) {
                    strIntern2 = strArrSplit2[i11];
                }
                int i14 = Integer.parseInt(strIntern);
                int i15 = Integer.parseInt(strIntern2);
                if (i14 < i15) {
                    int i16 = onExtraCallback + 35;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    return -1;
                }
                if (i14 > i15) {
                    int i18 = onExtraCallback + 125;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            p.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static WebView a(Context context, String str, boolean z) {
        int i2 = 2 % 2;
        try {
            WebView webView = new WebView(context);
            if (z) {
                webView.setWebViewClient(new b(str));
                return webView;
            }
            int i3 = onNavigationEvent + 69;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 7 / 0;
            }
            return webView;
        } catch (Throwable th) {
            p.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            int i5 = onNavigationEvent + 91;
            onExtraCallback = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static void a(Uri uri, Activity activity, l lVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (activity == null) {
            int i6 = i3 + 109;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                activity = lVar.w0();
            } else {
                lVar.w0();
                throw null;
            }
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra("sdk_key", lVar.k0());
        intent.putExtra("load_url", uri.toString());
        activity.startActivity(intent);
    }

    public static String a(int i2, Context context, l lVar) {
        int i3 = 2 % 2;
        if (i2 == 0) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 31;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return "";
            }
            throw null;
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i2);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e2) {
                if (lVar != null) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a(inputStreamOpenRawResource, lVar);
            }
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("Utils", "Failed to retrieve resource " + i2, th);
                }
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            int i5 = 46 / 0;
            if (maxAdFormat != null) {
                if (maxAdFormat2 != null) {
                    int i6 = i4 + 57;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (maxAdFormat != maxAdFormat2) {
                        int i8 = i4 + 115;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if ((!maxAdFormat.isAdViewAd() || !maxAdFormat2.isAdViewAd()) && ((!maxAdFormat.isFullscreenAd()) || !maxAdFormat2.isFullscreenAd())) {
                        }
                    }
                    return true;
                }
            }
        } else if (maxAdFormat != null) {
        }
        return false;
    }

    public static boolean a(String str, l lVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (str != null) {
            return StringUtils.containsAtLeastOneSubstring(str, lVar.c(c5.t0));
        }
        int i6 = i4 + 81;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 7;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (activityManager == null) {
            int i6 = i3 + 65;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 52 / 0;
            }
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            int i8 = onNavigationEvent + 79;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return memoryInfo;
        } catch (Throwable th) {
            p.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static String a(AppLovinSdkSettings appLovinSdkSettings) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String strEmptyIfNull = StringUtils.emptyIfNull((String) appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(strEmptyIfNull)) {
            return null;
        }
        Map mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(strEmptyIfNull, new JSONObject()));
        if (!CollectionUtils.isEmpty(mapTryToStringMap)) {
            return (String) mapTryToStringMap.get("UnityVersion");
        }
        int i5 = onNavigationEvent + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static void a(String str, int i2, int i3, s1 s1Var) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 > i3) {
            s1Var.a(h2.g1, str, CollectionUtils.hashMap("details", i2 + " Leaking Instances"));
        }
        int i6 = onExtraCallback + 21;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void a(float f2, long j, l lVar) {
        int i2 = 2 % 2;
        Vibrator vibrator = (Vibrator) l.p().getSystemService("vibrator");
        if (vibrator != null) {
            int i3 = onNavigationEvent + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 92 / 0;
                if (!vibrator.hasVibrator()) {
                    return;
                }
            } else if (!vibrator.hasVibrator()) {
                return;
            }
            try {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("Utils", "Vibrating with intensity: " + f2 + " for duration: " + j + "ms");
                }
                if (p0.d()) {
                    vibrator.vibrate(VibrationEffect.createOneShot(j, Math.max(1, Math.min(OggPageHeader.MAX_SEGMENT_COUNT, (int) (255.0f * f2)))));
                } else {
                    vibrator.vibrate(j);
                }
            } catch (Throwable th) {
                lVar.Q();
                if (p.a()) {
                    int i5 = onNavigationEvent + 37;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        lVar.Q().a("Utils", "Failed to vibrate", th);
                    } else {
                        lVar.Q().a("Utils", "Failed to vibrate", th);
                        int i6 = 81 / 0;
                    }
                }
                HashMap map = new HashMap();
                map.put("top_main_method", th.toString());
                map.put("details", "intensity=" + f2 + ", duration=" + j);
                lVar.E().a(h2.d1, "hapticsVibrate", map);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r7 = com.applovin.impl.t7.onExtraCallback + 39;
        com.applovin.impl.t7.onNavigationEvent = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(String str, List list, l lVar) {
        int i2 = 2 % 2;
        if (CollectionUtils.isEmpty(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int i3 = onExtraCallback + 41;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (CollectionUtils.isEmpty(arrayList)) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (StringUtils.containsIgnoreCase(line, str2)) {
                            int i5 = onNavigationEvent + 37;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                arrayList2.add(str2);
                                it.remove();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            arrayList2.add(str2);
                            it.remove();
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            lVar.E().b("Utils", "getStringsPresentInFileLines", th);
            return arrayList2;
        }
    }

    public static PackageInfo a(Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), i2);
            int i6 = onNavigationEvent + 69;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 95 / 0;
            }
            return packageInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27222, 27257, 27168, 27197, 27196, 27199, 27199, 27170};
    }
}
