package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.TTBaseLandingPageActivity;
import o.h1;
import o.wie2;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.interceptor.ApiCipherInterceptorException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBaseImage implements Interceptor {
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static char IAuthTabCallbackStub;
    private static int asBinder;
    private static long asInterface;
    private static long onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final Object onExtraCallback;
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, short r6, int r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = 110 - r6
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = o.NativeAdBaseImage.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r5
            r4 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdBaseImage.$$c(byte, short, int):java.lang.String");
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 1, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41684), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallback = 8;
        int i = onTransact + 119;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeAdBaseImage() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public NativeAdBaseImage(@Nullable Object obj) {
        this.onExtraCallback = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdBaseImage(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStubProxy + 107;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            int i4 = 2 % 2;
            obj = null;
        }
        this(obj);
    }

    public Response intercept(@NotNull Interceptor.Chain chain) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(chain, "");
            return onExtraCallbackWithResult(chain.proceed(onExtraCallbackWithResult(chain.request())));
        }
        Intrinsics.checkNotNullParameter(chain, "");
        int i3 = 4 / 0;
        return onExtraCallbackWithResult(chain.proceed(onExtraCallbackWithResult(chain.request())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r4 = r22.url();
        r5 = new java.lang.StringBuilder();
        r14 = new java.lang.Object[1];
        a(88 - android.widget.ExpandableListView.getPackedPositionType(0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, (char) (59741 - android.os.Process.getGidForName("")), r14);
        r5.append(((java.lang.String) r14[0]).intern());
        r5.append(r4);
        r4 = r5.toString();
        r5 = o.RemoteWorkManager.onWarmupCompleted;
        r8 = r5.IAuthTabCallback(r4);
        r17 = r5.onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r8.length() == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (r17.length() == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        r4 = new o.TTBaseActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        r1.writeTo(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        r1 = o.RemoteWorkManager.onNavigationEvent(r5, r4, r8, r17, (o.DiagnosticsWorker.IAuthTabCallback) null, 8, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r4, (java.lang.Throwable) null);
        r4 = okhttp3.RequestBody.Companion;
        r14 = new o.PangleEncryptManager();
        r11 = new java.lang.Object[1];
        b(android.view.KeyEvent.getDeadChar(0, 0), (char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 18668), new char[]{35585, 65468, 14149, 17975}, new char[]{63298, 3669, 60336, 37704}, new char[]{0, 0, 0, 0}, r11);
        o.dynamicTrack.onExtraCallback(r14, ((java.lang.String) r11[0]).intern(), r1.onWarmupCompleted());
        r0 = r22.newBuilder().method(r22.method(), r4.create(r14.onExtraCallbackWithResult().toString(), o.gc.onWarmupCompleted.onWarmupCompleted()));
        r2 = o.buildLoadAdConfig.onNavigationEvent(r1.IAuthTabCallback()).getValue();
        r7 = new java.lang.Object[1];
        a(android.os.Process.getGidForName("") + 21, 23 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8287), r7);
        r0 = r0.addHeader(((java.lang.String) r7[0]).intern(), r2);
        r4 = r21.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0137, code lost:
    
        r6 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-702979868);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013b, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013d, code lost:
    
        r6 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 23096), 16 - android.view.KeyEvent.normalizeMetaState(0), 11038 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), -413557132, false, "IAuthTabCallback", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0165, code lost:
    
        r4 = (java.lang.String) ((java.lang.reflect.Method) r6).invoke(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016e, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0171, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0172, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0176, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0178, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0179, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017a, code lost:
    
        r4 = r5.asInterface();
        r5 = o.NativeAdBaseImage.IAuthTabCallbackStubProxy + 95;
        o.NativeAdBaseImage.access100 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0188, code lost:
    
        if ((r5 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018a, code lost:
    
        r5 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018d, code lost:
    
        r6 = new java.lang.Object[1];
        b((android.os.Process.getThreadPriority(0) + 20) >> 6, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), new char[]{51066, 44977, 26323, 36175, 55240, 51263, 55235, 52685, 48870, 30564, 24618, 54305, 39753, 29701, 27040, 62869, 48764, 38704, 62297, 48251, 31849, 7379}, new char[]{20868, 31894, 62946, 55087}, new char[]{0, 0, 0, 0}, r6);
        r0 = r0.addHeader(((java.lang.String) r6[0]).intern(), r4);
        r9 = new java.lang.Object[1];
        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 119, 10 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.View.getDefaultSize(0, 0) + 4638), r9);
        r0 = r0.addHeader(((java.lang.String) r9[0]).intern(), r8);
        r4 = new java.lang.Object[1];
        b(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))), new char[]{17882, 27407, 10708, 43805, 44655, 20048, 22455, 11248, 32898, 9082}, new char[]{18213, 14450, 46758, 63072}, new char[]{0, 0, 0, 0}, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0232, code lost:
    
        return r0.addHeader(((java.lang.String) r4[0]).intern(), r1.onExtraCallback().asInterface()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0233, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023c, code lost:
    
        throw new viva.republica.toss.network.interceptor.ApiCipherInterceptorException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x023f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0242, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0243, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0244, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0245, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0249, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x024a, code lost:
    
        r6 = new java.lang.Object[1];
        b((-2126823456) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), new char[]{7281, 43803, 17649, 47480, 45223, 36362, 19864, 9830, 42192, 4756, 11383, 7261, 45819, 34865, 26316, 12602, 25109, 53142, 60168, 62375, 46396, 28487, 28851}, new char[]{57384, 15167, 50561, 35568}, new char[]{0, 0, 0, 0}, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0288, code lost:
    
        throw new viva.republica.toss.network.interceptor.ApiCipherInterceptorException(((java.lang.String) r6[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = o.NativeAdBaseImage.IAuthTabCallbackStubProxy + 121;
        o.NativeAdBaseImage.access100 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.Request onExtraCallbackWithResult(okhttp3.Request r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdBaseImage.onExtraCallbackWithResult(okhttp3.Request):okhttp3.Request");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r33, int r34, char r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdBaseImage.a(int, int, char, java.lang.Object[]):void");
    }

    private final Response onExtraCallbackWithResult(Response response) throws Throwable {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        int i = 2 % 2;
        ResponseBody responseBodyPeekBody = response.peekBody(Long.MAX_VALUE);
        try {
            wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
            TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBodyPeekBody.source();
            iAuthTabCallback.onExtraCallback();
            JsonElement jsonElement2 = (JsonElement) HomeWatcherReceiver.onExtraCallbackWithResult(iAuthTabCallback, JsonElement.Companion.serializer(), tTAppOpenAdTransActivitySource);
            h1.onExtraCallbackWithResult onextracallbackwithresult = h1.Companion;
            Object[] objArr = new Object[1];
            a(19 - Process.getGidForName(""), View.MeasureSpec.getSize(0) + 23, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 8288), objArr);
            h1 h1VarOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(Response.header$default(response, ((String) objArr[0]).intern(), (String) null, 2, (Object) null));
            if (h1VarOnWarmupCompleted == null) {
                AudienceNetworkAds.onExtraCallbackWithResult.onExtraCallback(jsonElement2);
                Object[] objArr2 = new Object[1];
                b(View.MeasureSpec.getMode(0), (char) ((Process.myTid() >> 22) + 4001), new char[]{2657, 19577, 32989, 5553, 14613, 26564, 44809, 61996, 19710, 64009, 36430, 16739, 18532, 29863, 42281, 30851, 20327, 27462, 4274, 49236, 51120, 40459, 19107, 44777, 4508, 6224, 18644, 63867, 28348, 47393}, new char[]{21185, 25874, 41307, 34319}, new char[]{0, 0, 0, 0}, objArr2);
                onExtraCallbackWithResult(this, response, ((String) objArr2[0]).intern(), null, null, 6, null);
                return response;
            }
            JsonObject jsonObject = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            if (jsonObject != null) {
                Object[] objArr3 = new Object[1];
                b((Process.getThreadPriority(0) + 20) >> 6, (char) (18667 - (ViewConfiguration.getTouchSlop() >> 8)), new char[]{35585, 65468, 14149, 17975}, new char[]{63298, 3669, 60336, 37704}, new char[]{0, 0, 0, 0}, objArr3);
                jsonElement = (JsonElement) jsonObject.get(((String) objArr3[0]).intern());
            } else {
                jsonElement = null;
            }
            if (jsonElement instanceof JsonPrimitive) {
                int i2 = IAuthTabCallbackStubProxy;
                int i3 = i2 + 103;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                jsonPrimitive = (JsonPrimitive) jsonElement;
                int i5 = i2 + 89;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                jsonPrimitive = null;
            }
            String strOnNavigationEvent = jsonPrimitive != null ? initRenderFinish.onNavigationEvent(jsonPrimitive) : null;
            if (strOnNavigationEvent == null) {
                int i7 = IAuthTabCallbackStubProxy + 47;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                AudienceNetworkAds.onExtraCallbackWithResult.onExtraCallback(jsonElement2);
                Object[] objArr4 = new Object[1];
                a(43 - TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetAfter("", 0) + 24, (char) (3892 - MotionEvent.axisFromString("")), objArr4);
                onExtraCallbackWithResult(this, response, ((String) objArr4[0]).intern(), null, null, 6, null);
                return response;
            }
            TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback2 = TTBaseLandingPageActivity.Companion;
            Object[] objArr5 = new Object[1];
            b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) TextUtils.indexOf("", "", 0), new char[]{17882, 27407, 10708, 43805, 44655, 20048, 22455, 11248, 32898, 9082}, new char[]{18213, 14450, 46758, 63072}, new char[]{0, 0, 0, 0}, objArr5);
            String strHeader$default = Response.header$default(response, ((String) objArr5[0]).intern(), (String) null, 2, (Object) null);
            if (strHeader$default == null) {
                strHeader$default = "";
            }
            DiagnosticsWorker diagnosticsWorker = new DiagnosticsWorker(strOnNavigationEvent, iAuthTabCallback2.onExtraCallbackWithResult(strHeader$default), buildLoadAdConfig.onExtraCallbackWithResult(h1VarOnWarmupCompleted));
            HttpUrl httpUrlUrl = response.request().url();
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (17074 - (ViewConfiguration.getEdgeSlop() >> 16)), new char[]{56244, 54000, 31168, 25884, 42519, 41349, 4586, 55801, 42986, 6861, 29294, 24785, 31592, 29301, 6499, 9525, 56399, 40397, 49561, 52564, 56262, 11033, 28590, 6483, 52840, 38304, 32675, 39472, 56353, 26706, 41872, 25195}, new char[]{21549, 46360, 45722, 23362}, new char[]{0, 0, 0, 0}, objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb.append(httpUrlUrl);
            String string = sb.toString();
            RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
            try {
                Response responseBuild = response.newBuilder().body(ResponseBody.Companion.create(remoteWorkManager.onExtraCallbackWithResult(diagnosticsWorker, remoteWorkManager.IAuthTabCallback(string), remoteWorkManager.onExtraCallback(string)), response.body().contentType())).build();
                _UtilCommonKt.closeQuietly(response);
                return responseBuild;
            } catch (Exception e) {
                AudienceNetworkAds.onExtraCallbackWithResult.onExtraCallback(jsonElement2);
                PointF.length(0.0f, 0.0f);
                Process.getGidForName("");
                Color.rgb(0, 0, 0);
                ViewConfiguration.getTapTimeout();
                View.combineMeasuredStates(0, 0);
                TextUtils.indexOf("", "", 0, 0);
                Object[] objArr7 = new Object[1];
                a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 67, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, (char) (2753 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr7);
                onExtraCallbackWithResult(this, response, ((String) objArr7[0]).intern(), e, null, 4, null);
                throw new ApiCipherInterceptorException(e);
            }
        } catch (qn e2) {
            String strString = response.peekBody(Long.MAX_VALUE).string();
            if (strString.length() > 33) {
                String strTake = StringsKt.take(strString, 15);
                String strTakeLast = StringsKt.takeLast(strString, 15);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strTake);
                Object[] objArr8 = new Object[1];
                b(1402132681 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (59660 - Color.green(0)), new char[]{38922, 59392, 54651}, new char[]{51304, 37592, 3155, 61929}, new char[]{0, 0, 0, 0}, objArr8);
                sb2.append(((String) objArr8[0]).intern());
                sb2.append(strTakeLast);
                strString = sb2.toString();
            }
            Object[] objArr9 = new Object[1];
            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 84, TextUtils.lastIndexOf("", '0') + 5, (char) (22681 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr9);
            Map<String, String> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), strString));
            Object[] objArr10 = new Object[1];
            b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 531943783, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 57267), new char[]{9602, 65039, 49558, 40268, 50422, 21979, 59191, 4885, 32787, 24634, 9204, 22566, 9356, 38858, 23180, 15692, 41392}, new char[]{26207, 46289, 45855, 63711}, new char[]{0, 0, 0, 0}, objArr10);
            onExtraCallbackWithResult(response, ((String) objArr10[0]).intern(), e2, mapOnNavigationEvent);
            int i9 = IAuthTabCallbackStubProxy + 53;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            return response;
        }
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 55;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 43, 1451 - KeyEvent.normalizeMetaState(0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), AndroidCharacter.getMirror('0') - 4, (ViewConfiguration.getTouchSlop() >> 8) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.indexOf("", "", 0)), 50 - View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 45849), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12577 - TextUtils.indexOf("", "", 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 113;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(NativeAdBaseImage nativeAdBaseImage, Response response, String str, Throwable th, Map map, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = access100 + 97;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            th = null;
        }
        if ((i & 4) != 0) {
            int i5 = access100 + 87;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            map = null;
        }
        nativeAdBaseImage.onExtraCallbackWithResult(response, str, th, map);
    }

    private final void onExtraCallbackWithResult(Response response, String str, Throwable th, Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0) + 1, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{63757, 29741, 4727, 12738, 53764, 45800, 56509, 7183}, new char[]{52944, 39122, 54930, 14494}, new char[]{0, 0, 0, 0}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), response.request().url().toString());
        Object[] objArr2 = new Object[1];
        a(129 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), onExtraCallback(response).url().toString());
        Object[] objArr3 = new Object[1];
        a(141 - (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 16, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50283), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Headers headers = response.headers();
        Object[] objArr4 = new Object[1];
        a(Color.alpha(0) + 141, 14 - TextUtils.lastIndexOf("", '0'), (char) (50284 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr4);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(strIntern, headers.get(((String) objArr4[0]).intern()));
        Object[] objArr5 = new Object[1];
        a(20 - View.MeasureSpec.makeMeasureSpec(0, 0), 23 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 8288), objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Headers headers2 = response.headers();
        Object[] objArr6 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 20, 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (8287 - TextUtils.indexOf((CharSequence) "", '0')), objArr6);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(strIntern2, headers2.get(((String) objArr6[0]).intern()));
        Object[] objArr7 = new Object[1];
        b(ExpandableListView.getPackedPositionType(0L) + 598372868, (char) (51305 - KeyEvent.keyCodeFromString("")), new char[]{35925, 47758, 27181, 24567, 59265, 60957, 42922, 11735, 55800, 50264, 55777, 32113, 27754, 7745, 63154, 52667, 12523, 52432, 961, 19682, 39447, 8862, 53795, 58319, 42209, 59231, 16440, 54050, 35145, 37768, 52568}, new char[]{1088, 43634, 26915, 27848}, new char[]{0, 0, 0, 0}, objArr7);
        String strIntern3 = ((String) objArr7[0]).intern();
        Headers headers3 = response.request().headers();
        Object[] objArr8 = new Object[1];
        a(TextUtils.indexOf("", "") + 20, 23 - TextUtils.indexOf("", "", 0, 0), (char) (Color.green(0) + 8288), objArr8);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(strIntern3, headers3.get(((String) objArr8[0]).intern()));
        Object[] objArr9 = new Object[1];
        b((-16777216) - Color.rgb(0, 0, 0), (char) (View.resolveSize(0, 0) + 36419), new char[]{54644, 9156, 13506, 58553, 12978, 33622, 38658, 63490, 54785, 42611, 33514, 7440, 4824, 25069, 59852, 24664, 24795, 35384, 22440, 370, 11387, 29028, 16894, 59163, 52867, 9726, 52537, 61038, 29790, 63232}, new char[]{10959, 22503, 17225, 44942}, new char[]{0, 0, 0, 0}, objArr9);
        String strIntern4 = ((String) objArr9[0]).intern();
        Headers headers4 = response.request().headers();
        Object[] objArr10 = new Object[1];
        b(ViewConfiguration.getPressedStateDuration() >> 16, (char) Color.alpha(0), new char[]{51066, 44977, 26323, 36175, 55240, 51263, 55235, 52685, 48870, 30564, 24618, 54305, 39753, 29701, 27040, 62869, 48764, 38704, 62297, 48251, 31849, 7379}, new char[]{20868, 31894, 62946, 55087}, new char[]{0, 0, 0, 0}, objArr10);
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(strIntern4, headers4.get(((String) objArr10[0]).intern()))});
        if (map != null) {
            mapIAuthTabCallback.putAll(map);
            int i2 = access100 + 27;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        Object[] objArr11 = new Object[1];
        a(Drawable.resolveOpacity(0, 0), (-16777196) - Color.rgb(0, 0, 0), (char) (MotionEvent.axisFromString("") + 41685), objArr11);
        convertFloatArrayToByteArray.onExtraCallbackWithResult(((String) objArr11[0]).intern(), str, th, mapIAuthTabCallback);
        int i4 = IAuthTabCallbackStubProxy + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Request onExtraCallback(Response response) {
        int i = 2 % 2;
        while (true) {
            Response responsePriorResponse = response.priorResponse();
            if (responsePriorResponse == null) {
                break;
            }
            response = responsePriorResponse;
        }
        int i2 = IAuthTabCallbackStubProxy + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Request request = response.request();
        int i4 = IAuthTabCallbackStubProxy + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return request;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{20289, 39632, 58409, 53155, 6633, 25424, 20136, 38917, 57970, 52713, 5934, 25236, 19685, 38482, 57763, 51973, 5488, 24788, 18991, 38290, 52716, 6201, 26272, 19771, 39751, 57831, 52313, 6807, 24795, 20346, 38272, 57393, 52826, 5344, 25433, 18833, 38874, 57975, 51355, 5936, 32093, 19450, 38419, 57988, 14127, 18882, 25203, 46104, 52913, 58197, 13796, 20357, 24673, 47813, 53088, 57621, 15264, 19457, 26351, 47246, 52533, 59265, 14439, 21006, 25780, 47439, 54245, 59251, 13012, 19516, 26521, 45552, 52049, 59125, 12289, 19066, 26005, 48945, 51856, 58614, 15943, 18860, 25349, 48481, 46382, 24707, 7784, 13781, 1227, 53594, 44963, 33833, 21091, 10458, 1314, 54159, 43512, 34403, 23716, 10526, 1903, 56792, 43561, 32911, 24314, 11102, 421, 56856, 46128, 33424, 24376, 13711, 1019, 55391, 46767, 33561, 22910, 14224, 3184, 65426, 10823, 21726, 32581, 43321, 54169, 65063, 10494, 21177, 32026, 60838, 14353, 18149, 27969, 47921, 49543, 60512, 15057, 16560, 28449, 46566, 49240, 10720, 64565, 33452, 43319, 32587, 1515, 10325, 65181, 33998, 43901, 29078, 1068, 10773, 61649, 34588};
        onExtraCallbackWithResult = 1989017414539688052L;
        asInterface = 7798559133331975163L;
        asBinder = -1776194565;
        IAuthTabCallbackStub = (char) 36915;
    }
}
