package okhttp3;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TTBaseActivity;
import o.clearRegisters;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Request {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = 6678779866528940539L;
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public final String toCurl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? toCurl$default(this, false, 0, null) : toCurl$default(this, false, 1, null);
    }

    public Request(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        HttpUrl url$okhttp = builder.getUrl$okhttp();
        if (url$okhttp == null) {
            throw new IllegalStateException("url == null");
        }
        this.url = url$okhttp;
        this.method = builder.getMethod$okhttp();
        this.headers = builder.getHeaders$okhttp().build();
        this.body = builder.getBody$okhttp();
        this.cacheUrlOverride = builder.getCacheUrlOverride$okhttp();
        this.tags = builder.getTags$okhttp();
        int i = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final HttpUrl url() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        HttpUrl httpUrl = this.url;
        int i5 = i2 + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return httpUrl;
    }

    public final String method() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.method;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Headers headers() {
        Headers headers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            headers = this.headers;
            int i4 = 69 / 0;
        } else {
            headers = this.headers;
        }
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return headers;
    }

    public final RequestBody body() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.body;
        }
        throw null;
    }

    public final HttpUrl cacheUrlOverride() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        HttpUrl httpUrl = this.cacheUrlOverride;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return httpUrl;
    }

    public final Tags getTags$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Tags tags = this.tags;
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return tags;
    }

    public final boolean isHttps() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsHttps = this.url.isHttps();
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsHttps;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            headers = Headers.Companion.of(new String[0]);
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            str = "\u0000";
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(httpUrl, headers, str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(@NotNull HttpUrl httpUrl, @NotNull Headers headers, @NotNull String str, @Nullable RequestBody requestBody) throws Throwable {
        Object obj;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(str, "");
        Builder builderHeaders = new Builder().url(httpUrl).headers(headers);
        if (Intrinsics.areEqual(str, "\u0000")) {
            if (requestBody != null) {
                int i = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{33948, 53656, 11945, 31689}, (ViewConfiguration.getTouchSlop() >> 14) + 12614, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{33948, 53656, 11945, 31689}, (ViewConfiguration.getTouchSlop() >> 8) + 21787, objArr2);
                    obj = objArr2[0];
                }
                str = ((String) obj).intern();
                int i2 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                Object[] objArr3 = new Object[1];
                a(new char[]{33931, 57916, 18930}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26292, objArr3);
                str = ((String) objArr3[0]).intern();
            }
        }
        this(builderHeaders.method(str, requestBody));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 24, 19627 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 1), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 59, 6383 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 99;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 59 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $10 + 89;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public final String header(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.headers.get(str);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public final List<String> headers(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.headers.values(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 85 / 0;
        return this.headers.values(str);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        Intrinsics.reifiedOperationMarker(i2 % 2 != 0 ? 4 : 2, "T");
        return (T) tag(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> T tag(@NotNull KClass<T> kClass) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(kClass, "");
            clearRegisters.onNavigationEvent(kClass).cast(this.tags.get(kClass));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(kClass, "");
        T t = (T) clearRegisters.onNavigationEvent(kClass).cast(this.tags.get(kClass));
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return t;
    }

    public final <T> T tag(@NotNull Class<? extends T> cls) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cls, "");
            tag(clearRegisters.IAuthTabCallback(cls));
            throw null;
        }
        Intrinsics.checkNotNullParameter(cls, "");
        T t = (T) tag(clearRegisters.IAuthTabCallback(cls));
        int i3 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return t;
    }

    public final Builder newBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder(this);
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return builder;
    }

    public final CacheControl cacheControl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            cacheControl = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = cacheControl;
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        }
        return cacheControl;
    }

    @Deprecated
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m287deprecated_url() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        HttpUrl httpUrl = this.url;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return httpUrl;
    }

    @Deprecated
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m286deprecated_method() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.method;
        }
        throw null;
    }

    @Deprecated
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m285deprecated_headers() {
        Headers headers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 109;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            headers = this.headers;
            int i4 = 11 / 0;
        } else {
            headers = this.headers;
        }
        int i5 = i2 + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return headers;
    }

    @Deprecated
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m283deprecated_body() {
        RequestBody requestBody;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            requestBody = this.body;
            int i4 = 17 / 0;
        } else {
            requestBody = this.body;
        }
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return requestBody;
    }

    @Deprecated
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m284deprecated_cacheControl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            cacheControl();
            obj.hashCode();
            throw null;
        }
        CacheControl cacheControl = cacheControl();
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return cacheControl;
        }
        obj.hashCode();
        throw null;
    }

    public static class Builder {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int onExtraCallback;
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;
        private static char[] onExtraCallbackWithResult = {32709, 32711, 32752, 32764, 32765, 32753};
        private static int onWarmupCompleted = -1184333940;
        private static boolean onNavigationEvent = true;
        private static boolean IAuthTabCallback = true;

        public final Builder delete() {
            int i = 2 % 2;
            int i2 = asBinder + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Builder builderDelete$default = delete$default(this, null, 1, null);
            int i4 = asBinder + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return builderDelete$default;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onExtraCallbackWithResult;
            char c = '0';
            if (cArr3 != null) {
                int i4 = $11 + 7;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 79;
                    $11 = i6 % 128;
                    int i7 = i6 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), '}' - AndroidCharacter.getMirror(c), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        i2 = 2;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.red(0) + 75, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16036, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (!(!IAuthTabCallback)) {
                    int i8 = $11 + 35;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 63 - View.resolveSizeAndState(0, 0, 0), 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i10 = $10 + 49;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i12 = $11 + 35;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.combineMeasuredStates(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public final HttpUrl getUrl$okhttp() {
            int i = 2 % 2;
            int i2 = asBinder + 47;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            HttpUrl httpUrl = this.url;
            int i4 = i3 + 89;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return httpUrl;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.url = httpUrl;
            int i5 = i2 + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
        }

        public final String getMethod$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String str = this.method;
            if (i3 == 0) {
                int i4 = 88 / 0;
            }
            return str;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.method = str;
            int i4 = asBinder + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final Headers.Builder getHeaders$okhttp() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Headers.Builder builder = this.headers;
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return builder;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            int i = 2 % 2;
            int i2 = asBinder + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(builder, "");
                this.headers = builder;
            } else {
                Intrinsics.checkNotNullParameter(builder, "");
                this.headers = builder;
                throw null;
            }
        }

        public final RequestBody getBody$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            RequestBody requestBody = this.body;
            int i5 = i3 + 67;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return requestBody;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            int i = 2 % 2;
            int i2 = asBinder + 23;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.body = requestBody;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 89;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final HttpUrl getCacheUrlOverride$okhttp() {
            int i = 2 % 2;
            int i2 = asBinder + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            HttpUrl httpUrl = this.cacheUrlOverride;
            int i5 = i3 + 51;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            return httpUrl;
        }

        public final void setCacheUrlOverride$okhttp(@Nullable HttpUrl httpUrl) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            this.cacheUrlOverride = httpUrl;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Tags getTags$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.tags;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setTags$okhttp(@NotNull Tags tags) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tags, "");
            this.tags = tags;
            int i4 = onExtraCallback + 15;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
        }

        public Builder() throws Throwable {
            this.tags = EmptyTags.INSTANCE;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-125, -126, -127}, 127 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr);
            this.method = ((String) objArr[0]).intern();
            this.headers = new Headers.Builder();
        }

        public Builder(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.cacheUrlOverride();
        }

        public Builder url(@NotNull HttpUrl httpUrl) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(httpUrl, "");
                this.url = httpUrl;
                throw null;
            }
            Intrinsics.checkNotNullParameter(httpUrl, "");
            this.url = httpUrl;
            int i3 = onExtraCallback + 53;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public Builder url(@NotNull String str) {
            Builder builderUrl;
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                builderUrl = url(HttpUrl.Companion.get(canonicalUrl(str)));
                int i3 = 14 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                builderUrl = url(HttpUrl.Companion.get(canonicalUrl(str)));
            }
            int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return builderUrl;
            }
            throw null;
        }

        private final String canonicalUrl(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            asBinder = i2 % 128;
            if (i2 % 2 != 0 ? StringsKt__StringsJVMKt.startsWith(str, "ws:", true) : StringsKt__StringsJVMKt.startsWith(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                return sb.toString();
            }
            if (StringsKt__StringsJVMKt.startsWith(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                sb2.append(strSubstring2);
                str = sb2.toString();
            }
            int i3 = asBinder + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public Builder url(@NotNull URL url) {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(url, "");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Builder builderUrl = url(companion.get(string));
            int i4 = onExtraCallback + 109;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return builderUrl;
        }

        public Builder header(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = asBinder + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.headers.set(str, str2);
                return this;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.headers.set(str, str2);
            throw null;
        }

        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = asBinder + 23;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.headers.add(str, str2);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.headers.add(str, str2);
            int i3 = asBinder + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public Builder removeHeader(@NotNull String str) {
            int i = 2 % 2;
            int i2 = asBinder + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.headers.removeAll(str);
            int i4 = asBinder + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public Builder headers(@NotNull Headers headers) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(headers, "");
            this.headers = headers.newBuilder();
            int i4 = asBinder + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        
            return removeHeader("Cache-Control");
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r5 = header("Cache-Control", r5);
            r1 = okhttp3.Request.Builder.onExtraCallback + 9;
            okhttp3.Request.Builder.asBinder = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        
            if (r5.length() == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        
            if (r5.length() == 0) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            String string;
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cacheControl, "");
                string = cacheControl.toString();
                int i3 = 58 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cacheControl, "");
                string = cacheControl.toString();
            }
        }

        public Builder get() throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = asBinder + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-125, -126, -127}, 17892 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-125, -126, -127}, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                obj = objArr2[0];
            }
            Builder builderMethod = method(((String) obj).intern(), null);
            int i3 = asBinder + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return builderMethod;
        }

        public Builder head() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Builder builderMethod = method("HEAD", null);
            int i4 = onExtraCallback + 49;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return builderMethod;
        }

        public Builder post(@NotNull RequestBody requestBody) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(requestBody, "");
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-125, -122, -123, -124}, 48 >>> View.MeasureSpec.getMode(1), objArr);
                obj = objArr[0];
            } else {
                Intrinsics.checkNotNullParameter(requestBody, "");
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-125, -122, -123, -124}, 127 - View.MeasureSpec.getMode(0), objArr2);
                obj = objArr2[0];
            }
            Builder builderMethod = method(((String) obj).intern(), requestBody);
            int i3 = onExtraCallback + 63;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return builderMethod;
            }
            throw null;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = asBinder + 119;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                int i6 = i4 + 15;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                requestBody = RequestBody.EMPTY;
                int i8 = asBinder + 67;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            return builder.delete(requestBody);
        }

        public Builder delete(@Nullable RequestBody requestBody) {
            int i = 2 % 2;
            int i2 = asBinder + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Builder builderMethod = method("DELETE", requestBody);
            int i4 = asBinder + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return builderMethod;
            }
            throw null;
        }

        public Builder put(@NotNull RequestBody requestBody) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(requestBody, "");
            Builder builderMethod = method("PUT", requestBody);
            int i4 = asBinder + 31;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return builderMethod;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder patch(@NotNull RequestBody requestBody) {
            int i = 2 % 2;
            int i2 = asBinder + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(requestBody, "");
            Builder builderMethod = method("PATCH", requestBody);
            int i4 = onExtraCallback + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return builderMethod;
        }

        public Builder query(@NotNull RequestBody requestBody) {
            Builder builderMethod;
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(requestBody, "");
                builderMethod = method("QUERY", requestBody);
                int i3 = 14 / 0;
            } else {
                Intrinsics.checkNotNullParameter(requestBody, "");
                builderMethod = method("QUERY", requestBody);
            }
            int i4 = asBinder + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return builderMethod;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if (r5 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            if (okhttp3.internal.http.HttpMethod.requiresRequestBody(r4) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            throw new java.lang.IllegalArgumentException(("method " + r4 + " must have a request body.").toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (okhttp3.internal.http.HttpMethod.permitsRequestBody(r4) == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r3.method = r4;
            r3.body = r5;
            r4 = okhttp3.Request.Builder.asBinder + 45;
            okhttp3.Request.Builder.onExtraCallback = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if ((r4 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        
            throw new java.lang.IllegalArgumentException(("method " + r4 + " must not have a request body.").toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        
            throw new java.lang.IllegalArgumentException("method.isEmpty() == true");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r4.length() > 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r4.length() > 0) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder method(@NotNull String str, @Nullable RequestBody requestBody) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int i3 = 67 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        public final /* synthetic */ <T> Builder reifiedTag(T t) {
            Class<Object> cls;
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.reifiedOperationMarker(5, "T");
                cls = Object.class;
            } else {
                Intrinsics.reifiedOperationMarker(4, "T");
                cls = Object.class;
            }
            return tag((KClass<KClass<T>>) Reflection.getOrCreateKotlinClass(cls), (KClass<T>) t);
        }

        public final <T> Builder tag(@NotNull KClass<T> kClass, @Nullable T t) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(kClass, "");
                this.tags = this.tags.plus(kClass, t);
                throw null;
            }
            Intrinsics.checkNotNullParameter(kClass, "");
            this.tags = this.tags.plus(kClass, t);
            int i3 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public Builder tag(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            if (i3 != 0) {
                return tag((KClass<KClass>) orCreateKotlinClass, (KClass) obj);
            }
            tag((KClass<KClass>) orCreateKotlinClass, (KClass) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(cls, "");
            Builder builderTag = tag((KClass<KClass<T>>) clearRegisters.IAuthTabCallback(cls), (KClass<T>) t);
            int i4 = onExtraCallback + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return builderTag;
        }

        public final Builder cacheUrlOverride(@Nullable HttpUrl httpUrl) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.cacheUrlOverride = httpUrl;
            int i5 = i2 + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if (r2 != null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        
            r5.headers.add("Content-Encoding", "gzip");
            r5.body = new okhttp3.internal.http.GzipRequestBody(r1);
            r1 = okhttp3.Request.Builder.onExtraCallback + 31;
            okhttp3.Request.Builder.asBinder = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
            throw new java.lang.IllegalStateException(("Content-Encoding already set: " + r2).toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            throw new java.lang.IllegalStateException("cannot gzip a request that has no body");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r1 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r5.headers.get("Content-Encoding");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Builder gzip() {
            RequestBody requestBody;
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                requestBody = this.body;
                int i3 = 86 / 0;
            } else {
                requestBody = this.body;
            }
        }

        public Request build() {
            int i = 2 % 2;
            Request request = new Request(this);
            int i2 = asBinder + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return request;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        Object obj = null;
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strOnExtraCallbackWithResult = pair2.onExtraCallbackWithResult();
                String strIAuthTabCallback = pair2.IAuthTabCallback();
                if (i2 > 0) {
                    int i3 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        sb.append(", ");
                    } else {
                        sb.append(", ");
                        obj.hashCode();
                        throw null;
                    }
                }
                sb.append(strOnExtraCallbackWithResult);
                sb.append(':');
                if (_UtilCommonKt.isSensitiveHeader(strOnExtraCallbackWithResult)) {
                    int i4 = onExtraCallbackWithResult + 85;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    strIAuthTabCallback = "██";
                }
                sb.append(strIAuthTabCallback);
                i2++;
            }
            sb.append(']');
        }
        if (!Intrinsics.areEqual(this.tags, EmptyTags.INSTANCE)) {
            int i6 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                sb.append(", tags=");
                sb.append(this.tags);
            } else {
                sb.append(", tags=");
                sb.append(this.tags);
                obj.hashCode();
                throw null;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 57;
            onExtraCallbackWithResult = i6 % 128;
            z = i6 % 2 != 0;
        }
        return request.toCurl(z);
    }

    public final String toCurl(boolean z) throws Throwable {
        String string;
        String strIntern;
        String strOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        MediaType mediaTypeContentType;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("curl " + shellEscape(this.url.toString()));
        RequestBody requestBody = this.body;
        if (requestBody == null || (mediaTypeContentType = requestBody.contentType()) == null) {
            string = null;
        } else {
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            string = mediaTypeContentType.toString();
        }
        if (!z || this.body == null) {
            Object[] objArr = new Object[1];
            a(new char[]{33931, 57916, 18930}, AndroidCharacter.getMirror('0') + 26245, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new char[]{33948, 53656, 11945, 31689}, 19650 - (ViewConfiguration.getFadingEdgeLength() * 116), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            } else {
                Object[] objArr3 = new Object[1];
                a(new char[]{33948, 53656, 11945, 31689}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 21787, objArr3);
                strIntern = ((String) objArr3[0]).intern();
            }
        }
        if (!Intrinsics.areEqual(this.method, strIntern)) {
            sb.append(" \\\n  -X " + shellEscape(this.method));
        }
        Iterator<Pair<? extends String, ? extends String>> it = this.headers.iterator();
        int i5 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i5 % 128;
        loop0: while (true) {
            int i6 = i5 % 2;
            while (it.hasNext()) {
                Pair<? extends String, ? extends String> next = it.next();
                strOnExtraCallbackWithResult = next.onExtraCallbackWithResult();
                strIAuthTabCallback = next.IAuthTabCallback();
                if (string == null || !StringsKt__StringsJVMKt.equals(strOnExtraCallbackWithResult, "Content-Type", true)) {
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" \\\n  -H ");
            sb2.append(shellEscape(strOnExtraCallbackWithResult + ": " + strIAuthTabCallback));
            sb.append(sb2.toString());
            i5 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i5 % 128;
        }
        if (string != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" \\\n  -H ");
            sb3.append(shellEscape("Content-Type: " + string));
            sb.append(sb3.toString());
        }
        if (!(!z) && this.body != null) {
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            this.body.writeTo(tTBaseActivity);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(tTBaseActivity, 0L, 1, null)) {
                sb.append(" \\\n  --data " + shellEscape(tTBaseActivity.onRelationshipValidationResult()));
            } else {
                sb.append(" \\\n  --data-binary " + shellEscape(tTBaseActivity.writeTypedObject().asInterface()));
            }
        }
        return sb.toString();
    }

    private final String shellEscape(String str) {
        int i = 2 % 2;
        String str2 = '\'' + StringsKt__StringsJVMKt.replace$default(str, "'", "'\\''", false, 4, (Object) null) + '\'';
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    public final Object tag() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objTag = tag((KClass<Object>) Reflection.getOrCreateKotlinClass(Object.class));
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objTag;
    }
}
