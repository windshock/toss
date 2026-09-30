package okhttp3;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.internal.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CompressionInterceptor implements Interceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted = {27257, 27174, 27175, 27175, 27176, 27173, 27172, 27162, 27164, 27181, 27178, 27172, 27196, 27166, 27255};
    private final String acceptEncoding;
    private final DecompressionAlgorithm[] algorithms;

    public interface DecompressionAlgorithm {
        TTHistoryActivity42 decompress(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity);

        String getEncoding();
    }

    public CompressionInterceptor(@NotNull DecompressionAlgorithm... decompressionAlgorithmArr) {
        Intrinsics.checkNotNullParameter(decompressionAlgorithmArr, BuildConfig.FLAVOR);
        this.algorithms = decompressionAlgorithmArr;
        ArrayList arrayList = new ArrayList(decompressionAlgorithmArr.length);
        int length = decompressionAlgorithmArr.length;
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onNavigationEvent + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                arrayList.add(decompressionAlgorithmArr[i2].getEncoding());
                i2 += 28;
            } else {
                arrayList.add(decompressionAlgorithmArr[i2].getEncoding());
                i2++;
            }
        }
        this.acceptEncoding = CollectionsKt.joinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final DecompressionAlgorithm[] getAlgorithms() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        DecompressionAlgorithm[] decompressionAlgorithmArr = this.algorithms;
        int i4 = i2 + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return decompressionAlgorithmArr;
        }
        throw null;
    }

    public final String getAcceptEncoding$okhttp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.acceptEncoding;
        int i5 = i2 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(chain, BuildConfig.FLAVOR);
        if (this.algorithms.length == 0) {
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            Request request = chain.request();
            Object[] objArr = new Object[1];
            a(new int[]{0, 15, 0, 7}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0}, objArr);
            if (request.header(((String) objArr[0]).intern()) == null) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 15, 0, 7}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0}, objArr2);
                return decompress$okhttp(chain.proceed(builderNewBuilder.header(((String) objArr2[0]).intern(), this.acceptEncoding).build()));
            }
        }
        Response responseProceed = chain.proceed(chain.request());
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return responseProceed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Response decompress$okhttp(@NotNull Response response) {
        DecompressionAlgorithm decompressionAlgorithmLookupDecompressor$okhttp;
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
            HttpHeaders.promisesBody(response);
            throw null;
        }
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        if (!HttpHeaders.promisesBody(response)) {
            return response;
        }
        ResponseBody responseBodyBody = response.body();
        String strHeader$default = Response.header$default(response, "Content-Encoding", (String) null, 2, (Object) null);
        if (strHeader$default != null && (decompressionAlgorithmLookupDecompressor$okhttp = lookupDecompressor$okhttp(strHeader$default)) != null) {
            response = response.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(ResponseBody.Companion.create(TTCeilingLandingPageActivity5.onExtraCallback(decompressionAlgorithmLookupDecompressor$okhttp.decompress(responseBodyBody.source())), responseBodyBody.contentType(), -1L)).build();
            int i3 = onNavigationEvent + 21;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 54 / 0;
            }
        }
        return response;
    }

    public final DecompressionAlgorithm lookupDecompressor$okhttp(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        for (DecompressionAlgorithm decompressionAlgorithm : this.algorithms) {
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.equals(decompressionAlgorithm.getEncoding(), str, true)) {
                int i4 = onExtraCallback + 65;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return decompressionAlgorithm;
                }
                throw null;
            }
        }
        int i5 = onExtraCallback + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onWarmupCompleted;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 35283), (ViewConfiguration.getJumpTapTimeout() >> 16) + 35, (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 65 - Color.blue(0), KeyEvent.normalizeMetaState(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 29 - Color.red(0), 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 69 - Process.getGidForName(BuildConfig.FLAVOR), 12486 - View.combineMeasuredStates(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = $10 + 89;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 % 4;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $11 + 91;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 41;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $11 + 75;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
