package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBaseRating implements Interceptor {
    public static final onExtraCallback Companion;
    private static long IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private final RealDrawScopeSizeResolversizeinlinedmapNotNull121 onExtraCallback;
    private final zzad onNavigationEvent;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 168;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 97
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = o.NativeAdBaseRating.$$a
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdBaseRating.$$c(int, byte, byte):java.lang.String");
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        onExtraCallbackWithResult = 8;
        int i = asBinder + 7;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    private final Request onWarmupCompleted(Request request) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return request;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NativeAdBaseRating(@NotNull zzad zzadVar, @NotNull RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(realDrawScopeSizeResolversizeinlinedmapNotNull121, "");
        this.onNavigationEvent = zzadVar;
        this.onExtraCallback = realDrawScopeSizeResolversizeinlinedmapNotNull121;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        Object obj;
        String str;
        Map map;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(onWarmupCompleted(chain.request()));
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(onWarmupCompleted(responseProceed));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj)) {
            int i3 = onTransact + 67;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                Response responseBuild = responseProceed.newBuilder().header("Content-Type", "text/plain").body(ResponseBody.Companion.create((String) obj, MediaType.Companion.get("text/plain"))).build();
                _UtilCommonKt.closeQuietly(responseProceed);
                return responseBuild;
            }
            responseProceed.newBuilder().header("Content-Type", "text/plain").body(ResponseBody.Companion.create((String) obj, MediaType.Companion.get("text/plain"))).build();
            _UtilCommonKt.closeQuietly(responseProceed);
            throw null;
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = onTransact + 107;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                str = "failed to decrypt";
                map = null;
                i = 5;
            } else {
                str = "failed to decrypt";
                map = null;
                i = 4;
            }
            NativeAdBaseNativeComponentTag.IAuthTabCallback(responseProceed, str, th2, map, i, null);
        }
        return responseProceed;
    }

    private final String onWarmupCompleted(Response response) throws Exception {
        byte[] bArrAccess000;
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(this.onNavigationEvent.getActiveNotifications());
        if (tTBaseLandingPageActivityOnExtraCallback != null) {
            int i4 = IAuthTabCallbackStub + 25;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                tTBaseLandingPageActivityOnExtraCallback.access000();
                throw null;
            }
            bArrAccess000 = tTBaseLandingPageActivityOnExtraCallback.access000();
        } else {
            bArrAccess000 = null;
        }
        Object[] objArr = new Object[1];
        a(MotionEvent.axisFromString("") + 1, 2 - TextUtils.lastIndexOf("", '0'), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrAccess000));
        byte[] bArrBytes = response.body().bytes();
        byte[] bArrCopyOfRange = ArraysKt.copyOfRange(bArrBytes, 0, 256);
        byte[] bArrCopyOfRange2 = ArraysKt.copyOfRange(bArrBytes, 256, bArrBytes.length);
        java.security.Signature signature = java.security.Signature.getInstance("SHA512withRSA");
        signature.initVerify(publicKeyGeneratePublic);
        signature.update(bArrCopyOfRange2);
        try {
            if (!signature.verify(bArrCopyOfRange)) {
                throw new IllegalStateException("Signature is invalid");
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(this.onExtraCallback.onNavigationEvent(ArraysKt.copyOfRange(bArrCopyOfRange2, 0, 16), ArraysKt.copyOfRange(bArrCopyOfRange2, 16, bArrCopyOfRange2.length)))), Charsets.UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                int i5 = onTransact + 95;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return text;
            } finally {
            }
        } catch (Exception e) {
            System.out.println((Object) "Signature verification failed.");
            throw e;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 115;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 59697), Color.red(0) + 17, 10973 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46134), 31 - ExpandableListView.getPackedPositionGroup(0L), 20220 - View.MeasureSpec.makeMeasureSpec(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char doubleTapTimeout = (char) (49123 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1494;
                    byte b = (byte) ($$a[1] - 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, i7, iMakeMeasureSpec, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char c2 = (char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int i8 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iResolveSize = 1494 - View.resolveSize(0, 0);
                byte b3 = (byte) ($$a[1] - 1);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i8, iResolveSize, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $11 + 41;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{60806, 50380, 48899};
        IAuthTabCallback = -9161433884019276641L;
    }
}
