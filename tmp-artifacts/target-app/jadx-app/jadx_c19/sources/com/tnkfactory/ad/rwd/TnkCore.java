package com.tnkfactory.ad.rwd;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tnkfactory.ad.AppResource;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.PlacementAdList;
import com.tnkfactory.ad.rwd.api.ConstantsUtil;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import com.tnkfactory.framework.vo.ValueObject;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCore {
    public static final TnkCore INSTANCE;
    public static final byte[] a;
    public static final Lazy b;
    public static final String c;
    public static final String d;
    public static final float e;
    public static final Lazy f;
    public static final Lazy g;
    public static final Lazy h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f50i;
    private static long onExtraCallback;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;
    public static ServiceTask serviceTask;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b2, int i2) {
        int i3;
        int i4 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        int i5 = 97 - (i2 * 2);
        int i6 = s * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5 = (-i5) + i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i5;
            i5 = bArr[i4];
            i5 = (-i5) + i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onWarmupCompleted();
        INSTANCE = new TnkCore();
        a = Utils.toHexBytes("3339306d3f2d336a666c73");
        b = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda2
            public final Object invoke() {
                return TnkCore.a();
            }
        });
        c = "tnkad_tracking";
        d = "tnkad_app_id";
        e = 320.0f;
        f = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda3
            public final Object invoke() {
                return TnkCore.f();
            }
        });
        g = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda4
            public final Object invoke() {
                return TnkCore.e();
            }
        });
        h = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda5
            public final Object invoke() {
                return TnkCore.b();
            }
        });
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final String a() {
        int i2 = 2 % 2;
        byte[] bArr = a;
        Intrinsics.checkNotNull(bArr);
        String str = new String(bArr, Charsets.UTF_8);
        int i3 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final AppResource b() {
        int i2 = 2 % 2;
        AppResource appResource = new AppResource();
        int i3 = IAuthTabCallbackStub + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return appResource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void d() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        AdidManager.INSTANCE.getAdvertisingIdThread(INSTANCE.getSessionInfo());
        int i5 = IAuthTabCallbackStub + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final TnkOffRepository e() {
        int i2 = 2 % 2;
        TnkOffRepository tnkOffRepository = new TnkOffRepository(INSTANCE.getServiceTask());
        int i3 = IAuthTabCallbackStub + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return tnkOffRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final SessionInfo f() {
        int i2 = 2 % 2;
        SessionInfo sessionInfo = new SessionInfo(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, null, null, null, 0, null, null, 0, 0, false, false, false, false, false, false, false, null, null, null, null, 0, 0.0f, 0.0f, 0.0f, null, -1, 1023, null);
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
        return sessionInfo;
    }

    public final AppResource getAppResource() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppResource appResource = (AppResource) h.getValue();
        int i4 = IAuthTabCallbackStub + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return appResource;
    }

    public final byte[] getENCRYPT_KEY_BYTES() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = a;
        int i6 = i3 + 17;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final String getENCRYPT_KEY_STR() {
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            str = (String) b.getValue();
            int i4 = 93 / 0;
        } else {
            str = (String) b.getValue();
        }
        int i5 = IAuthTabCallbackStub + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TnkOffRepository getOffRepository() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TnkOffRepository tnkOffRepository = (TnkOffRepository) g.getValue();
        if (i4 != 0) {
            int i5 = 38 / 0;
        }
        return tnkOffRepository;
    }

    public final TnkResultTask<PlacementAdList> getPlacementAdList(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return getOffRepository().getPlacementAdList(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        getOffRepository().getPlacementAdList(str);
        throw null;
    }

    public final ServiceTask getServiceTask() {
        int i2 = 2 % 2;
        ServiceTask serviceTask2 = serviceTask;
        if (serviceTask2 != null) {
            int i3 = onExtraCallbackWithResult + 119;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
            }
            return serviceTask2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = IAuthTabCallbackStub + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final SessionInfo getSessionInfo() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SessionInfo sessionInfo = (SessionInfo) f.getValue();
        int i5 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return sessionInfo;
    }

    public final ValueObject getSessionVO(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            getSessionVO(context, getSessionInfo());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        ValueObject sessionVO = getSessionVO(context, getSessionInfo());
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionVO;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isInitialized() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        boolean z = f50i;
        int i6 = i4 + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object load(@NotNull access13800<? super TnkResultTask<ArrayList<AdListVo>>> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objLoadAdData = getOffRepository().loadAdData(access13800Var);
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return objLoadAdData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object loadWithNews(@NotNull access13800<? super TnkResultTask<ArrayList<AdListVo>>> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            getOffRepository().loadAdDataWithNews(access13800Var);
            throw null;
        }
        Object objLoadAdDataWithNews = getOffRepository().loadAdDataWithNews(access13800Var);
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objLoadAdDataWithNews;
    }

    public final void setServiceTask(@NotNull ServiceTask serviceTask2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(serviceTask2, "");
            serviceTask = serviceTask2;
            int i4 = 66 / 0;
        } else {
            Intrinsics.checkNotNullParameter(serviceTask2, "");
            serviceTask = serviceTask2;
        }
        int i5 = IAuthTabCallbackStub + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDeviceIds(@Nullable String str, @Nullable String str2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            getSessionInfo().setDeviceId(str);
            getSessionInfo().setUdid(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getSessionInfo().setDeviceId(str);
        getSessionInfo().setUdid(str2);
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void cpsSearch(@NotNull String str) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String applicationId = getSessionInfo().getApplicationId();
        String mediaUserName = getSessionInfo().getMediaUserName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        j(ViewConfiguration.getWindowTouchSlop() >> 8, View.resolveSize(0, 0) + 55, (char) (TextUtils.lastIndexOf("", '0', 0) + 62866), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(applicationId);
        sb.append("&keyword=");
        sb.append(str);
        sb.append("&user_nm=");
        sb.append(mediaUserName);
        URL url = new URL(sb.toString());
        new String(TextStreamsKt.readBytes(url), Charsets.UTF_8);
        int i3 = IAuthTabCallbackStub + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final ServiceTask serviceTask(@NotNull Context context) throws PackageManager.NameNotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!isInitialized()) {
            init(context);
            int i5 = IAuthTabCallbackStub + 85;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
        }
        return getServiceTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[PHI: r1 r2
      0x004b: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v16 java.lang.String) binds: [B:15:0x0049, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r2v5 int) = (r2v4 int), (r2v3 int) binds: [B:15:0x0049, B:12:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleScheme(@NotNull String str) throws NumberFormatException {
        String queryParameter;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host == null || host.hashCode() != 215242434) {
            return;
        }
        int i5 = 1;
        if (!host.equals("select_menu")) {
            return;
        }
        int i6 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = 0;
        if (i6 % 2 == 0) {
            queryParameter = uri.getQueryParameter("cat_id");
            if (queryParameter != null) {
                int i8 = IAuthTabCallbackStub + 33;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    Integer.parseInt(queryParameter);
                    throw null;
                }
                i7 = Integer.parseInt(queryParameter);
            }
        } else {
            queryParameter = uri.getQueryParameter("cat_id");
            i5 = 0;
            if (queryParameter != null) {
            }
        }
        String queryParameter2 = uri.getQueryParameter("filter_id");
        if (queryParameter2 != null) {
            int i9 = onExtraCallbackWithResult + 23;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                Integer.parseInt(queryParameter2);
                throw null;
            }
            i5 = Integer.parseInt(queryParameter2);
        }
        INSTANCE.getOffRepository().getRwdFilter().changeFilter(i7, i5);
    }

    public static boolean a(Bundle bundle, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackStub = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                bundle.containsKey(str);
                throw null;
            }
            if (bundle.containsKey(str)) {
                return bundle.getBoolean(str);
            }
            int i4 = IAuthTabCallbackStub + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        } catch (Exception unused) {
            Logger.e("invalid meta-data, check '" + str + "' setting.");
            return false;
        }
    }

    public static final void c() {
        SessionInfo sessionInfo;
        String str;
        int i2 = 2 % 2;
        TnkCore tnkCore = INSTANCE;
        tnkCore.getSessionInfo().setWidevineIdL3("00000000000000000000000000000000");
        String[] widevineInfo = DeviceManager.INSTANCE.getWidevineInfo();
        Intrinsics.checkNotNull(widevineInfo);
        if (!Intrinsics.areEqual("L1", widevineInfo[1])) {
            if (Intrinsics.areEqual("L3", widevineInfo[1])) {
                int i3 = onExtraCallbackWithResult + 11;
                IAuthTabCallbackStub = i3 % 128;
                tnkCore.getSessionInfo().setWidevineIdL3(i3 % 2 == 0 ? widevineInfo[0] : widevineInfo[0]);
                return;
            }
            return;
        }
        int i4 = IAuthTabCallbackStub + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            sessionInfo = tnkCore.getSessionInfo();
            str = widevineInfo[1];
        } else {
            sessionInfo = tnkCore.getSessionInfo();
            str = widevineInfo[0];
        }
        sessionInfo.setWidevineIdL1(str);
    }

    public final void g() {
        int i2 = 2 % 2;
        Logger.d("* application Id      : " + getSessionInfo().getApplicationId());
        Logger.d("* application Package : " + getSessionInfo().getPackageName());
        Logger.d("* application Version : " + getSessionInfo().getAppVersion());
        Logger.d("* device Model        : " + getSessionInfo().getDeviceModel());
        Logger.d("* device OS Version   : " + getSessionInfo().getDeviceOsVersion());
        Logger.d("* device Sim Operator : " + getSessionInfo().getNetworkOperator());
        Logger.d("* device Country Code : " + getSessionInfo().getDeviceCountryCode());
        Logger.d("* device Language     : " + getSessionInfo().getDeviceLanguage());
        Logger.d("* screen Resolution   : " + getSessionInfo().getScreenResolution());
        Logger.d("* screen Scale        : " + getSessionInfo().getScreenScale());
        Logger.d("* tstore        : " + getSessionInfo().getHasTStore());
        Logger.d("* olleh market  : " + getSessionInfo().getHasOlleh());
        Logger.d("* ozstore       : " + getSessionInfo().getHasOzStore());
        int i3 = IAuthTabCallbackStub + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void j(int i2, int i3, char c2, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 << i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 10974 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getEdgeSlop() >> 16)), 30 - ImageFormat.getBitsPerPixel(0), 20219 - Process.getGidForName(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, 1493 - MotionEvent.axisFromString(""), -1657859959, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i2 + i7])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 59697), TextUtils.getOffsetAfter("", 0) + 17, 10973 - Gravity.getAbsoluteGravity(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallback), Integer.valueOf(c2)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 32, 20220 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, (ViewConfiguration.getTapTimeout() >> 16) + 1494, -1657859959, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1493 - TextUtils.lastIndexOf("", '0'), -1657859959, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i8 = $11 + 75;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 14 / 0;
            objArr[0] = str;
        }
    }

    public final ValueObject getSessionVO(@NotNull Context context, @NotNull SessionInfo sessionInfo) {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionInfo, "");
        ValueObject valueObject = new ValueObject();
        TnkCore tnkCore = INSTANCE;
        valueObject.set("ph_mdl", sessionInfo.getDeviceModel());
        valueObject.set("ph_os", sessionInfo.getDeviceOsVersion());
        valueObject.set("ph_ntn", sessionInfo.getDeviceCountryCode());
        valueObject.set("ph_lang", sessionInfo.getDeviceLanguage());
        valueObject.set("ph_telco", sessionInfo.getNetworkOperator());
        valueObject.set("ph_tz", sessionInfo.getDeviceTimezone());
        if (sessionInfo.isTablet()) {
            int i3 = IAuthTabCallbackStub + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            obj = "Y";
        } else {
            obj = "N";
        }
        valueObject.set("tblt_yn", obj);
        valueObject.set("res_cd", sessionInfo.getScreenResolution());
        valueObject.set("app_ver", sessionInfo.getAppVersion());
        valueObject.set("app_pkg", sessionInfo.getPackageName());
        valueObject.set("os_type", "A");
        valueObject.set("all_ext_mkt", sessionInfo.getGetAllExtraMarkets());
        valueObject.set("vdo_yn", "Y");
        valueObject.set("root_yn", sessionInfo.getRootYn());
        valueObject.set("vm_yn", sessionInfo.getVmYn());
        valueObject.set("cn_yn", sessionInfo.getCnYn());
        valueObject.set("os_ver", sessionInfo.getOsVersionCode());
        if (sessionInfo.getPrevAppId() > 0) {
            valueObject.set("prev_app_id", sessionInfo.getPrevAppId());
        }
        valueObject.set("dsp_yn", "Y");
        valueObject.set("do_trace", sessionInfo.getDoTracking() ? "Y" : "N");
        SessionInfo sessionInfo2 = tnkCore.getSessionInfo();
        if (sessionInfo2.getUserSex() == null) {
            sessionInfo2.setUserSex(Settings.INSTANCE.getUserSex(context));
        }
        if (sessionInfo2.getUserSex() != null) {
            int i5 = IAuthTabCallbackStub + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            valueObject.set("user_sex", sessionInfo2.getUserSex());
        }
        if (sessionInfo2.getUserAge() <= 0) {
            sessionInfo2.setUserAge(Settings.INSTANCE.getUserAge(context));
        }
        Object obj3 = null;
        if (sessionInfo2.getUserAge() > 0) {
            int i7 = onExtraCallbackWithResult + 19;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                valueObject.set("user_brth", sessionInfo2.getUserAge());
                obj3.hashCode();
                throw null;
            }
            valueObject.set("user_brth", sessionInfo2.getUserAge());
        }
        if (sessionInfo2.getUserCat() == null) {
            sessionInfo2.setUserCat(Settings.INSTANCE.getUserCat(context));
        }
        if (sessionInfo2.getUserCat() != null) {
            valueObject.set("user_cat", sessionInfo2.getUserCat());
        }
        if (sessionInfo2.getUserCatExt() == null) {
            int i8 = onExtraCallbackWithResult + 95;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            sessionInfo2.setUserCatExt(Settings.INSTANCE.getUserCatExt(context));
        }
        if (sessionInfo2.getUserCatExt() != null) {
            int i10 = IAuthTabCallbackStub + 115;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            valueObject.set("user_cat_ext", sessionInfo2.getUserCatExt());
        }
        Settings settings = Settings.INSTANCE;
        sessionInfo2.setCoppa(settings.getCOPPA(context));
        valueObject.set("coppa", sessionInfo2.getCoppa());
        sessionInfo2.setGdpr(settings.getGDPR(context));
        valueObject.set("gdpr", sessionInfo2.getGdpr());
        valueObject.set("cpm_yn", "Y");
        if (sessionInfo.getErrorMessage() != null) {
            valueObject.set("err_msg", sessionInfo.getErrorMessage());
        }
        if (sessionInfo.getAdidLimited()) {
            obj2 = "Y";
        } else {
            int i12 = IAuthTabCallbackStub + 125;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            obj2 = "N";
        }
        valueObject.set("adid_limit", obj2);
        valueObject.set("bld_osv", System.getProperty("os.version"));
        valueObject.set("bld_prd", Build.PRODUCT);
        valueObject.set("jcp", System.getProperty("java.class.path"));
        valueObject.set("inst_mkt", sessionInfo.getInstallMarket());
        valueObject.set("iv_yn", sessionInfo.getHasMediaActivity() ? "Y" : "N");
        if (sessionInfo.getWidevineIdL1() != null) {
            valueObject.set("w_lvl", "L1");
        } else if (sessionInfo.getWidevineIdL3() != null) {
            int i14 = IAuthTabCallbackStub + 125;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 != 0) {
                valueObject.set("w_lvl", "L3");
                int i15 = 39 / 0;
            } else {
                valueObject.set("w_lvl", "L3");
            }
        }
        valueObject.set("sub_app_id", sessionInfo.getSubAppId());
        int i16 = onExtraCallbackWithResult + 53;
        IAuthTabCallbackStub = i16 % 128;
        if (i16 % 2 != 0) {
            return valueObject;
        }
        throw null;
    }

    public final void init(@NotNull Context context) throws PackageManager.NameNotFoundException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i3 = 1;
        f50i = true;
        getAppResource().init(context);
        setServiceTask(new ServiceTask(context, getSessionInfo(), getSessionInfo().getUseSsl()));
        String packageName = context.getPackageName();
        getSessionInfo().setPackageName(packageName);
        PackageManager packageManager = context.getPackageManager();
        try {
            getSessionInfo().setAppVersion(packageManager.getPackageInfo(packageName, 0).versionName);
            if (Build.VERSION.SDK_INT >= 30) {
                getSessionInfo().setInstallMarket(packageManager.getInstallSourceInfo(packageName).getInstallingPackageName());
            } else {
                getSessionInfo().setInstallMarket(packageManager.getInstallerPackageName(packageName));
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
            Bundle bundle = applicationInfo.metaData;
            String applicationId = Settings.INSTANCE.getApplicationId(context);
            int i4 = 32;
            if (TextUtils.isEmpty(applicationId)) {
                SessionInfo sessionInfo = getSessionInfo();
                String string = bundle.getString(d);
                Intrinsics.checkNotNull(string);
                String strReplace = new Regex("-").replace(string, "");
                int length = strReplace.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (true) {
                    if (i5 > length) {
                        break;
                    }
                    int i6 = Intrinsics.compare(strReplace.charAt(z ? length : i5), i4) <= 0 ? i3 : 0;
                    if (!z) {
                        int i7 = onExtraCallbackWithResult + 49;
                        IAuthTabCallbackStub = i7 % 128;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        if (i6 == 0) {
                            i3 = 1;
                            i4 = 32;
                            z = true;
                        } else {
                            i5++;
                        }
                    } else {
                        if (i6 == 0) {
                            i3 = 1;
                            break;
                        }
                        int i8 = IAuthTabCallbackStub + 39;
                        int i9 = i8 % 128;
                        onExtraCallbackWithResult = i9;
                        length = i8 % 2 != 0 ? length + 70 : length - 1;
                        int i10 = i9 + 47;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    i3 = 1;
                    i4 = 32;
                }
                sessionInfo.setApplicationId(strReplace.subSequence(i5, length + i3).toString());
            } else {
                SessionInfo sessionInfo2 = getSessionInfo();
                String strReplace2 = new Regex("-").replace(applicationId, "");
                int length2 = strReplace2.length() - 1;
                int i12 = 0;
                boolean z2 = false;
                while (i12 <= length2) {
                    boolean z3 = Intrinsics.compare(strReplace2.charAt(!z2 ? i12 : length2), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        int i13 = onExtraCallbackWithResult + 125;
                        IAuthTabCallbackStub = i13 % 128;
                        int i14 = i13 % 2;
                        length2--;
                    } else if (!z3) {
                        z2 = true;
                    } else {
                        i12++;
                    }
                }
                sessionInfo2.setApplicationId(strReplace2.subSequence(i12, length2 + 1).toString());
            }
            SessionInfo sessionInfo3 = getSessionInfo();
            Intrinsics.checkNotNull(bundle);
            sessionInfo3.setDoTracking(a(bundle, c));
            getSessionInfo().setUseSsl(true);
        } catch (Exception e2) {
            Logger.e("initialization failed : no meta-data " + e2);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(packageManager.getActivityInfo(new ComponentName(packageName, "com.tnkfactory.ad.AdMediaActivity"), 0), "");
            getSessionInfo().setHasMediaActivity(true);
        } catch (Exception unused) {
            Logger.e("no tnk AdMediaActivity.");
            getSessionInfo().setHasMediaActivity(false);
        }
        getSessionInfo().setDeviceModel(Build.MODEL);
        getSessionInfo().setDeviceOsVersion(Build.VERSION.RELEASE);
        getSessionInfo().setOsVersionCode(String.valueOf(Build.VERSION.SDK_INT));
        DeviceManager deviceManager = DeviceManager.INSTANCE;
        String[] networkOperator = deviceManager.getNetworkOperator();
        SessionInfo sessionInfo4 = getSessionInfo();
        String str = networkOperator[1];
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        sessionInfo4.setDeviceCountryCode(upperCase);
        getSessionInfo().setDeviceLanguage(Locale.getDefault().getLanguage());
        getSessionInfo().setDeviceTimezone((int) (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000));
        Logger.d(getSessionInfo().getDeviceLanguage());
        getSessionInfo().setTablet(Utils.isTablet(context));
        TnkSession tnkSession = TnkSession.INSTANCE;
        tnkSession.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TnkCore.c();
            }
        });
        tnkSession.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.rwd.TnkCore$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TnkCore.d();
            }
        });
        getSessionInfo().setNetworkOperator(networkOperator[0]);
        float[] screenResolution = deviceManager.getScreenResolution();
        getSessionInfo().setScreenResolution((int) screenResolution[0]);
        getSessionInfo().setScreenScale(screenResolution[1]);
        getSessionInfo().setSizeFactor(screenResolution[2]);
        getSessionInfo().setFontScale(getSessionInfo().getScreenResolution() / e);
        if (getSessionInfo().getScreenScale() < getSessionInfo().getFontScale() / 1.24d) {
            getSessionInfo().setFontScale(getSessionInfo().getScreenScale());
            int i15 = onExtraCallbackWithResult + 7;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
        }
        boolean[] koreanStoreAvailability = Utils.getKoreanStoreAvailability(context);
        getSessionInfo().setHasTStore(koreanStoreAvailability[0]);
        getSessionInfo().setHasOlleh(koreanStoreAvailability[1]);
        getSessionInfo().setHasOzStore(koreanStoreAvailability[2]);
        SessionInfo sessionInfo5 = getSessionInfo();
        Settings settings = Settings.INSTANCE;
        sessionInfo5.setMediaUserName(settings.getMediaUserName(context));
        getSessionInfo().setRootYn(Utils.checkRooted(context));
        getSessionInfo().setVmYn(Utils.checkVM(context, getSessionInfo().getDeviceId()));
        getSessionInfo().setCnYn(Utils.checkCNDevice(context));
        g();
        String adid = settings.getAdid(context);
        if (!TextUtils.isEmpty(adid)) {
            int i17 = onExtraCallbackWithResult + 101;
            IAuthTabCallbackStub = i17 % 128;
            if (i17 % 2 == 0) {
                getSessionInfo().setAdid(adid);
                throw null;
            }
            getSessionInfo().setAdid(adid);
        }
        ConcurrentInvokeControl concurrentInvokeControl = ConcurrentInvokeControl.INSTANCE;
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        concurrentInvokeControl.prohibitConcurrentInvoke(constantsUtil.def(rpcConfig.getSERVICE_ADVERTISER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_START()));
        concurrentInvokeControl.prohibitConcurrentInvoke(constantsUtil.def(rpcConfig.getSERVICE_ADVERTISER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_ACTION()));
        concurrentInvokeControl.prohibitConcurrentInvoke(constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_INSTALL()));
        concurrentInvokeControl.prohibitConcurrentInvoke(constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_VIDEO_VIEW()));
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{6189, 32291, 54293, 10755, 32894, 58917, 31750, 53780, 10420, 36503, 58520, 31408, 53427, 14043, 36055, 58144, 30979, 57110, 13666, 35687, 57666, 18253, 56752, 13301, 35222, 61416, 17916, 56204, 12745, 34849, 60978, 17476, 55908, 12391, 38472, 60444, 17070, 55471, 16026, 38100, 60134, 16578, 42704, 15665, 37694, 59655, 20310, 42292, 15172, 37191, 63409, 19852, 41860, 14747, 40884};
        onExtraCallback = 4456828627815599046L;
    }
}
