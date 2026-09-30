package com.tnkfactory.ad.tnkassert;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.engine.api.common.log.IgnoreLogUtils;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.tnkfactory.ad.TnkAdConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdiscopeReport {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    public static final String c;
    public static final String d;
    private static char onExtraCallback;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    public AdiscopeBoday a;
    public AdiscopeHeader b;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String getHost() {
            return AdiscopeReport.access$getHost$cp();
        }

        public final String getUrl() {
            return AdiscopeReport.access$getUrl$cp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, short s2) {
        int i3;
        int i4 = s * 2;
        int i5 = 110 - i2;
        int i6 = (s2 * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i5 = i6;
            int i9 = 0;
            i6++;
            i5 += -i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i6++;
            i5 += -i8;
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
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        Object[] objArr = new Object[1];
        e((char) (65202 - (ViewConfiguration.getScrollBarSize() >> 8)), ExpandableListView.getPackedPositionType(0L), new char[]{5531, 20884, 62616, 36771, 3610, 30084, 51186, 3658, 12733, 51362, 19924, 23790, 61024, 49669, 29366, 13160, 46766, 34177, 11003, 58072, 40638, 59083, 33748, 8631, 9650, 2091, 35007, 54037, 20055, 40444, 58409, 34329, 35714, 18525, 27738, 54638, 57376, 28955, 41438, 42214, 47953, 21100}, new char[]{0, 0, 0, 0}, new char[]{45273, 62466, 45592, 33278}, objArr);
        c = ((String) objArr[0]).intern();
        d = "/analytics/v2/report";
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdiscopeReport() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ String access$getHost$cp() {
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        String str = c;
        int i6 = i4 + 101;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return str;
    }

    public static final /* synthetic */ String access$getUrl$cp() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        String str = d;
        int i6 = i3 + 11;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final AdiscopeBoday getBody() {
        AdiscopeBoday adiscopeBoday;
        int i2 = 2 % 2;
        int i3 = asInterface + 53;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            adiscopeBoday = this.a;
            int i5 = 27 / 0;
        } else {
            adiscopeBoday = this.a;
        }
        int i6 = i4 + 99;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 70 / 0;
        }
        return adiscopeBoday;
    }

    public final AdiscopeHeader getHeader() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 93;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AdiscopeHeader adiscopeHeader = this.b;
        int i5 = i3 + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return adiscopeHeader;
        }
        obj.hashCode();
        throw null;
    }

    public final void setBody(@NotNull AdiscopeBoday adiscopeBoday) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adiscopeBoday, "");
            this.a = adiscopeBoday;
        } else {
            Intrinsics.checkNotNullParameter(adiscopeBoday, "");
            this.a = adiscopeBoday;
            int i4 = 66 / 0;
        }
    }

    public final void setHeader(@NotNull AdiscopeHeader adiscopeHeader) {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adiscopeHeader, "");
            this.b = adiscopeHeader;
            int i4 = 28 / 0;
        } else {
            Intrinsics.checkNotNullParameter(adiscopeHeader, "");
            this.b = adiscopeHeader;
        }
        int i5 = asInterface + 41;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public AdiscopeReport(@NotNull AdiscopeBoday adiscopeBoday, @NotNull AdiscopeHeader adiscopeHeader) {
        Intrinsics.checkNotNullParameter(adiscopeBoday, "");
        Intrinsics.checkNotNullParameter(adiscopeHeader, "");
        this.a = adiscopeBoday;
        this.b = adiscopeHeader;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AdiscopeReport(com.tnkfactory.ad.tnkassert.AdiscopeBoday r22, com.tnkfactory.ad.tnkassert.AdiscopeHeader r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r21 = this;
            r0 = r24 & 1
            r1 = 2
            if (r0 == 0) goto L1d
            com.tnkfactory.ad.tnkassert.AdiscopeBoday r0 = new com.tnkfactory.ad.tnkassert.AdiscopeBoday
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8)
            int r2 = com.tnkfactory.ad.tnkassert.AdiscopeReport.IAuthTabCallbackStub
            int r2 = r2 + 3
            int r3 = r2 % 128
            com.tnkfactory.ad.tnkassert.AdiscopeReport.asInterface = r3
            int r2 = r2 % r1
            int r2 = r1 % r1
            goto L1f
        L1d:
            r0 = r22
        L1f:
            r2 = r24 & 2
            if (r2 == 0) goto L4c
            com.tnkfactory.ad.tnkassert.AdiscopeHeader r2 = new com.tnkfactory.ad.tnkassert.AdiscopeHeader
            r3 = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32767(0x7fff, float:4.5916E-41)
            r20 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r3 = com.tnkfactory.ad.tnkassert.AdiscopeReport.IAuthTabCallbackStub
            int r3 = r3 + 21
            int r4 = r3 % 128
            com.tnkfactory.ad.tnkassert.AdiscopeReport.asInterface = r4
            int r3 = r3 % r1
            int r1 = r1 % r1
            r1 = r21
            goto L50
        L4c:
            r1 = r21
            r2 = r23
        L50:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tnkfactory.ad.tnkassert.AdiscopeReport.<init>(com.tnkfactory.ad.tnkassert.AdiscopeBoday, com.tnkfactory.ad.tnkassert.AdiscopeHeader, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private static void e(char c2, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $11 + 39;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $10 + 81;
            $11 = i8 % 128;
            int i9 = i8 % i4;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 43, 1451 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.alpha(0)), 43 - TextUtils.lastIndexOf("", '0', 0, 0), Drawable.resolveOpacity(0, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23972), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 22939 - ExpandableListView.getPackedPositionGroup(0L), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i3 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.lastIndexOf("", '0', 0)), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16789793, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i4 = i3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final void postData() throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (!TnkAdConfig.INSTANCE.isTrackingApplication()) {
            int i5 = asInterface + 111;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientTime", this.a.getClientTime());
        jSONObject.put("mediaId", this.a.getMediaId());
        ArrayList<AssertData> datas = this.a.getDatas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(datas, 10));
        for (AssertData assertData : datas) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IgnoreLogUtils.TYPE_EVENT, assertData.getDocName());
            jSONObject2.put("params", new JSONObject(assertData.postData()));
            jSONObject2.put("time", assertData.getTime());
            arrayList.add(jSONObject2);
        }
        jSONObject.put("datas", new JSONArray((Collection) arrayList));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Object[] objArr = new Object[1];
        e((char) Color.green(0), (-1219563710) - (Process.myTid() >> 22), new char[]{18207, 57231, 45068, 30786, 30182, 7672, 3860, 17103, 6414, 3440, 11841, 23512, 2548, 16368, 13945, 41937, 51625, 41594, 7515, 45118, 3532, 15956, 35757, 23338, 62076, 41044, 10626, 17870, 17272, 2730, 1990, 54109, 6400, 38322, 29202, 54047, 37687, 52632, 44707, 62032, 34760, 52088, 46900, 53162, 44988, 20729, 57038}, new char[]{0, 0, 0, 0}, new char[]{17100, 20207, 56503, 48998}, objArr);
        URLConnection uRLConnectionOpenConnection = new URL(((String) objArr[0]).intern()).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        Object[] objArr2 = new Object[1];
        e((char) (28545 - Process.getGidForName("")), Color.alpha(0), new char[]{9077, 6375, 50433, 11557}, new char[]{0, 0, 0, 0}, new char[]{4931, 14274, 33385, 18031}, objArr2);
        httpURLConnection.setRequestMethod(((String) objArr2[0]).intern());
        AdiscopeHeader adiscopeHeader = this.b;
        httpURLConnection.setRequestProperty("installerName", adiscopeHeader.getInstallerName());
        httpURLConnection.setRequestProperty("locale", adiscopeHeader.getLocale());
        httpURLConnection.setRequestProperty("location", adiscopeHeader.getLocation());
        httpURLConnection.setRequestProperty("minSdkVersion", adiscopeHeader.getMinSdkVersion());
        httpURLConnection.setRequestProperty("model", adiscopeHeader.getModel());
        httpURLConnection.setRequestProperty("os", adiscopeHeader.getOs());
        httpURLConnection.setRequestProperty("osVersion", adiscopeHeader.getOsVersion());
        httpURLConnection.setRequestProperty("packageName", adiscopeHeader.getPackageName());
        httpURLConnection.setRequestProperty("sdkVersion", adiscopeHeader.getSdkVersion());
        httpURLConnection.setRequestProperty("targetSdkVersion", adiscopeHeader.getTargetSdkVersion());
        httpURLConnection.setRequestProperty("unityRuntimeVersion", adiscopeHeader.getUnityRuntimeVersion());
        httpURLConnection.setRequestProperty("unityVersion", adiscopeHeader.getUnityVersion());
        httpURLConnection.setRequestProperty("versionCode", adiscopeHeader.getVersionCode());
        httpURLConnection.setRequestProperty("versionName", adiscopeHeader.getVersionName());
        httpURLConnection.setRequestProperty("widevineId", adiscopeHeader.getWidevineId());
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_LENGTH, String.valueOf(bytes.length));
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStream, (Throwable) null);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200 && responseCode != 201) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                Intrinsics.checkNotNullExpressionValue(errorStream, "");
                TextStreamsKt.readText(new BufferedReader(new InputStreamReader(errorStream, charset), 8192));
                return;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, charset), 8192));
            System.currentTimeMillis();
            int i6 = IAuthTabCallbackStub + 39;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } finally {
        }
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        onExtraCallback = (char) 10312;
    }
}
