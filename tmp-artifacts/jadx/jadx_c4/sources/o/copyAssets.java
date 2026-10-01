package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.share.LinkGenerator;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class copyAssets implements checkModelValidation {
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallback;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private final parseDate onExtraCallback;
    private final initLayout onExtraCallbackWithResult;
    private static final byte[] $$a = {70, -47, -65, 52};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        byte[] bArr = $$a;
        int i2 = b * 2;
        int i3 = (s * 2) + 4;
        int i4 = (s2 * 4) + 97;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 = (-i4) + i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i + 1;
            i6 = i4;
            i4 = bArr[i3];
            i7 = i8;
            i4 = (-i4) + i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        int i = asInterface + 27;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public copyAssets(@NotNull parseDate parsedate, @NotNull initLayout initlayout) {
        Intrinsics.checkNotNullParameter(parsedate, "");
        Intrinsics.checkNotNullParameter(initlayout, "");
        this.onExtraCallback = parsedate;
        this.onExtraCallbackWithResult = initlayout;
    }

    public static final /* synthetic */ String onWarmupCompleted(copyAssets copyassets, String str, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return copyassets.onWarmupCompleted(str, i);
        }
        copyassets.onWarmupCompleted(str, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r5 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        r8 = o.getWrite.IAuthTabCallback("package_name", r17);
        r13 = new java.lang.Object[1];
        a(android.view.KeyEvent.getDeadChar(0, 0), 7 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (char) (android.text.TextUtils.getTrimmedLength("") + 12738), r13);
        o.ConvertFloatArrayToByteArray.onExtraCallback(r5, "appsflyer_cross_promotion_click", (java.lang.String) null, o.access8100.onWarmupCompleted(new kotlin.Pair[]{r8, o.getWrite.IAuthTabCallback(((java.lang.String) r13[0]).intern(), r18)}), (java.lang.String) null, false, (java.lang.String) null, 58, (java.lang.Object) null);
        r16.onExtraCallback.onExtraCallback("af_cross_promotion", o.access8100.IAuthTabCallback(r19, o.getWrite.IAuthTabCallback("af_campaign", r18)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        return o.doGet.onWarmupCompleted(r20, new o.copyAssets.IAuthTabCallback(r16, onNavigationEvent(r17, r18, r19), (int) (r20 / 2), (o.access13800) null), r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r16.onExtraCallbackWithResult.IAuthTabCallback(o.onViewDraw.Marketing) != o.getIconPaddingTop.Start) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r16.onExtraCallbackWithResult.IAuthTabCallback(o.onViewDraw.Marketing) != o.getIconPaddingTop.Start) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r1 = o.copyAssets.onTransact + 19;
        o.copyAssets.IAuthTabCallbackStub = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // o.checkModelValidation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map, long j, @NotNull access13800<? super String> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    private final String onNavigationEvent(String str, String str2, Map<String, String> map) {
        int i = 2 % 2;
        LinkGenerator linkGeneratorAddParameters = new LinkGenerator("af_cross_promotion").setBaseURL((String) null, (String) null, str).addParameter("af_siteid", UserChoiceBillingListener.onExtraCallback.onExtraCallback().getPackageName()).addParameters(map);
        if (str2 != null) {
            int i2 = onTransact + 101;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            linkGeneratorAddParameters.setCampaign(str2);
        }
        String strGenerateLink = linkGeneratorAddParameters.generateLink();
        String strOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            Intrinsics.checkNotNull(strGenerateLink);
            return strGenerateLink;
        }
        String str3 = strGenerateLink + "&advertising_id=" + strOnExtraCallbackWithResult;
        int i4 = onTransact + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return str3;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onWarmupCompleted(String str, int i) throws Throwable {
        Exception exc;
        HttpURLConnection httpURLConnection;
        int i2 = 2 % 2;
        HttpURLConnection httpURLConnection2 = null;
        str = null;
        str = null;
        str = null;
        String str2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            try {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null && 300 <= responseCode) {
                        int i3 = onTransact;
                        int i4 = i3 + 27;
                        IAuthTabCallbackStub = i4 % 128;
                        if (i4 % 2 == 0 ? responseCode < 400 : responseCode < 15473) {
                            int i5 = i3 + 61;
                            IAuthTabCallbackStub = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i6 = 86 / 0;
                            }
                            str2 = headerField;
                        }
                    }
                    httpURLConnection.disconnect();
                    return str2;
                } catch (Exception e) {
                    exc = e;
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerCrossPromotionTracker", "Failed to log cross promotion click", exc, (Map) null, 8, (Object) null);
                    if (httpURLConnection != null) {
                        int i7 = IAuthTabCallbackStub + 27;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        httpURLConnection.disconnect();
                        if (i8 == 0) {
                            httpURLConnection2.hashCode();
                            throw null;
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                httpURLConnection2 = httpURLConnection;
                th = th;
                if (httpURLConnection2 != null) {
                    int i9 = onTransact + 85;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    httpURLConnection2.disconnect();
                    int i11 = IAuthTabCallbackStub + 17;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                }
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection2 != null) {
            }
            throw th;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 101;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 59697), 16 - ExpandableListView.getPackedPositionChild(0L), 10973 - View.MeasureSpec.getSize(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0)), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 20221 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49124), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 57;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49123), 44 - TextUtils.getOffsetBefore("", 0), 1494 - View.resolveSizeAndState(0, 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{56437, 55791, 55115, 52398, 51735, 51079, 64993, 64336};
        onNavigationEvent = 7585998644192995404L;
    }
}
