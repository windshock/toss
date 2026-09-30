package okhttp3.brotli;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BrotliInterceptor implements Interceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    public static final BrotliInterceptor INSTANCE;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    static {
        onExtraCallback();
        INSTANCE = new BrotliInterceptor();
        int i = onNavigationEvent + 29;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private BrotliInterceptor() {
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(chain, BuildConfig.FLAVOR);
        Request request = chain.request();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -126, -120, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - ExpandableListView.getPackedPositionType(0L), objArr);
        if (request.header(((String) objArr[0]).intern()) != null) {
            return chain.proceed(chain.request());
        }
        int i4 = onTransact + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, -120, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -126, -120, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, -126, ISOFileInfo.DATA_BYTES2}, 127 - KeyEvent.getDeadChar(0, 0), objArr2);
        return uncompress$okhttp_brotli(chain.proceed(builderNewBuilder.header(((String) objArr2[0]).intern(), "br,gzip").build()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r1 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = okhttp3.brotli.BrotliInterceptor.asBinder + 109;
        okhttp3.brotli.BrotliInterceptor.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r3 = okhttp3.Response.header$default(r7, "Content-Encoding", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r1 = okhttp3.brotli.BrotliInterceptor.asBinder + 1;
        okhttp3.brotli.BrotliInterceptor.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (kotlin.text.StringsKt.equals(r3, "br", true) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r3 = o.TTCeilingLandingPageActivity5.onExtraCallback(o.TTCeilingLandingPageActivity5.IAuthTabCallback(new o.TopLayoutDislike25(r1.source().IAuthTabCallbackStubProxy())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (kotlin.text.StringsKt.equals(r3, "gzip", true) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r3 = o.TTCeilingLandingPageActivity5.onExtraCallback(new o.TTCeilingLandingPageActivity1(r1.source()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r7 = r7.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(okhttp3.ResponseBody.Companion.create(r3, r1.contentType(), -1)).build();
        r1 = okhttp3.brotli.BrotliInterceptor.onTransact + 71;
        okhttp3.brotli.BrotliInterceptor.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r1 = okhttp3.brotli.BrotliInterceptor.onTransact + 5;
        okhttp3.brotli.BrotliInterceptor.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (okhttp3.internal.http.HttpHeaders.promisesBody(r7) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (okhttp3.internal.http.HttpHeaders.promisesBody(r7) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response uncompress$okhttp_brotli(@NotNull Response response) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), Color.green(0) + 77, View.resolveSizeAndState(0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 75 - View.resolveSizeAndState(0, 0, 0), Color.red(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 33;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted << 1;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 95;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 63 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 12214 - KeyEvent.getDeadChar(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{32590, 32620, 32610, 32415, 32403, 32602, 32578, 32409, 32408, 32611, 32614, 32608};
        onExtraCallback = -1184334065;
        onExtraCallbackWithResult = true;
        onWarmupCompleted = true;
    }
}
