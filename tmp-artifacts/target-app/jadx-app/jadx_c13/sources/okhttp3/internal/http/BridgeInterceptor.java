package okhttp3.internal.http;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTCeilingLandingPageActivity1;
import o.TTCeilingLandingPageActivity5;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BridgeInterceptor implements Interceptor {
    private static short[] onExtraCallback;
    private final CookieJar cookieJar;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 1321154067;
    private static int onNavigationEvent = -1538795454;
    private static int onWarmupCompleted = -1899959711;
    private static byte[] onExtraCallbackWithResult = {112, 124, 124, -116, 101, -116, 64, 81, -80, 125, 110, 103, 121, 71, -114, ByteCompanionObject.MIN_VALUE, -114, -118, 94, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        int i5 = 115 - (b * 2);
        int i6 = i + 4;
        int i7 = (i2 * 2) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            i4 = 0;
            int i10 = i6 + i9;
            i3 = i4;
            int i11 = i8;
            i5 = i10;
            i6 = i11;
            i4 = i3 + 1;
            int i12 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i12];
            int i13 = i5;
            i8 = i12;
            i6 = i13;
            int i102 = i6 + i9;
            i3 = i4;
            int i112 = i8;
            i5 = i102;
            i6 = i112;
            i4 = i3 + 1;
            int i122 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            int i1222 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public BridgeInterceptor(@NotNull CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "");
        this.cookieJar = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        boolean z;
        ResponseBody responseBodyBody;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        Object obj = null;
        if (requestBodyBody != null) {
            int i2 = IAuthTabCallbackStub + 57;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                requestBodyBody.contentType();
                obj.hashCode();
                throw null;
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header("Content-Type", mediaTypeContentType.toString());
                int i3 = IAuthTabCallbackStub + 91;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header("Content-Length", String.valueOf(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", _UtilJvmKt.toHostHeader$default(request.url(), false, 1, null));
            int i5 = asInterface + 53;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 3;
            }
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", "Keep-Alive");
        }
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 10), (byte) (123 - KeyEvent.normalizeMetaState(0)), 352784870 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 713503271, (-59) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        if (request.header(((String) objArr[0]).intern()) == null && request.header("Range") == null) {
            Object[] objArr2 = new Object[1];
            a((short) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 10), (byte) (ImageFormat.getBitsPerPixel(0) + 124), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 352784869, ExpandableListView.getPackedPositionType(0L) - 713503272, Color.green(0) - 59, objArr2);
            builderNewBuilder.header(((String) objArr2[0]).intern(), "gzip");
            z = true;
        } else {
            z = false;
        }
        List<Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!listLoadForRequest.isEmpty()) {
            Object[] objArr3 = new Object[1];
            a((short) (123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 3), 4643 - AndroidCharacter.getMirror('0'), (-713503270) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) - 68, objArr3);
            builderNewBuilder.header(((String) objArr3[0]).intern(), cookieHeader(listLoadForRequest));
        }
        if (request.header("User-Agent") == null) {
            int i7 = asInterface + 95;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            builderNewBuilder.header("User-Agent", _UtilCommonKt.USER_AGENT);
        }
        Request requestBuild = builderNewBuilder.build();
        Response responseProceed = chain.proceed(requestBuild);
        HttpHeaders.receiveHeaders(this.cookieJar, requestBuild.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(requestBuild);
        if (z && StringsKt__StringsJVMKt.equals("gzip", Response.header$default(responseProceed, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
            TTCeilingLandingPageActivity1 tTCeilingLandingPageActivity1 = new TTCeilingLandingPageActivity1(responseBodyBody.source());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            builderRequest.body(new RealResponseBody(Response.header$default(responseProceed, "Content-Type", null, 2, null), -1L, TTCeilingLandingPageActivity5.onExtraCallback(tTCeilingLandingPageActivity1)));
        }
        return builderRequest.build();
    }

    private final String cookieHeader(List<Cookie> list) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = IAuthTabCallbackStub + 19;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                int i5 = IAuthTabCallbackStub + 113;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            Cookie cookie = (Cookie) obj;
            if (i2 > 0) {
                int i7 = IAuthTabCallbackStub + 65;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    sb.append("; ");
                    int i8 = 50 / 0;
                } else {
                    sb.append("; ");
                }
            }
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
            i2++;
        }
        return sb.toString();
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, 22439 - (Process.myTid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = -1;
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 3;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i5;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ((Process.getThreadPriority(0) + 20) >> 6)), 54 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2166, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Gravity.getAbsoluteGravity(0, 0)), (Process.myTid() >> 22) + 55, 2167 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0)), 41 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 22438 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i6;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.red(0) + 86, 9567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i12 = $11 + 15;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    if (!z) {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
