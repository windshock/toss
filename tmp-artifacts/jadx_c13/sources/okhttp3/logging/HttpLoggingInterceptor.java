package okhttp3.logging;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access15300;
import o.clearNumber;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;
    private volatile Set<String> queryParamsNameToRedact;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2 = b + 4;
        int i3 = 115 - (b2 * 4);
        byte[] bArr = $$a;
        int i4 = s * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 = (-i3) + i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = i3;
            i3 = bArr[i2];
            i3 = (-i3) + i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = asInterface + 11;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "");
        this.logger = logger;
        this.headersToRedact = clearNumber.onNavigationEvent();
        this.queryParamsNameToRedact = clearNumber.onNavigationEvent();
        this.level = Level.NONE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onTransact + 71;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                logger = Logger.DEFAULT;
                int i3 = 66 / 0;
            } else {
                logger = Logger.DEFAULT;
            }
            int i4 = IAuthTabCallbackDefault + 107;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(logger);
    }

    public final Level getLevel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Level level = this.level;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return level;
    }

    public final void level(@NotNull Level level) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(level, "");
        this.level = level;
        int i4 = onTransact + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new Level("NONE", 0);
        public static final Level BASIC = new Level("BASIC", 1);
        public static final Level HEADERS = new Level("HEADERS", 2);
        public static final Level BODY = new Level("BODY", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY};
        }

        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        private Level(String str, int i) {
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(levelArr$values);
        }
    }

    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        void log(@NotNull String str);

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }
        }
    }

    public final void redactHeader(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TreeSet treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        CollectionsKt__MutableCollectionsKt.addAll(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void redactQueryParams(@NotNull String... strArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        TreeSet treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        CollectionsKt__MutableCollectionsKt.addAll(treeSet, this.queryParamsNameToRedact);
        CollectionsKt__MutableCollectionsKt.addAll(treeSet, strArr);
        this.queryParamsNameToRedact = treeSet;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(level, "");
            this.level = level;
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(level, "");
            this.level = level;
        }
        int i4 = IAuthTabCallbackDefault + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Deprecated
    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m319deprecated_level() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Level level = this.level;
        int i4 = onTransact + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return level;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 43424), 42 - View.MeasureSpec.getSize(0), 22439 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i6 = $11 + 97;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char packedPositionGroup = (char) (12843 - ExpandableListView.getPackedPositionGroup(0L));
                                int trimmedLength = TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 55;
                                int offsetBefore = TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 2167;
                                byte b2 = (byte) ($$a[1] + 1);
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, trimmedLength, offsetBefore, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 42, 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                if (z) {
                    int i9 = $10 + 1;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 86 - View.resolveSize(0, 0), 9567 - Color.alpha(0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
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
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134 A[LOOP:0: B:47:0x0132->B:48:0x0134, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x039b  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
        boolean z;
        String string;
        String str;
        String str2;
        String str3;
        long jNanoTime;
        Response responseProceed;
        Long lValueOf;
        TTCeilingLandingPageActivity1 tTCeilingLandingPageActivity1;
        String str4;
        int size;
        int i;
        Long lValueOf2;
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(chain, "");
            chain.request();
            Level level = Level.NONE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(chain, "");
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain.proceed(request);
        }
        if (level2 == Level.BODY) {
            int i4 = onTransact + 21;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z || level2 == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(redactUrl$logging_interceptor(request.url()));
        if (connection != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(connection.protocol());
            string = sb2.toString();
        } else {
            string = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb.append(string);
        String string2 = sb.toString();
        if (!z2) {
            int i6 = IAuthTabCallbackDefault + 101;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (requestBodyBody != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" (");
                str = " (";
                sb3.append(requestBodyBody.contentLength());
                sb3.append("-byte body)");
                string2 = sb3.toString();
            } else {
                str = " (";
            }
        }
        this.logger.log(string2);
        try {
            if (z2) {
                Headers headers = request.headers();
                if (requestBodyBody == null) {
                    str4 = "-byte body omitted)";
                    size = headers.size();
                    for (i = 0; i < size; i++) {
                        int i7 = IAuthTabCallbackDefault + 63;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        logHeader(headers, i);
                    }
                    if (z || requestBodyBody == null) {
                        str2 = str4;
                        str3 = str;
                        this.logger.log("--> END " + request.method());
                    } else {
                        if (bodyHasUnknownEncoding(request.headers())) {
                            this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                        } else if (requestBodyBody.isDuplex()) {
                            this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                        } else if (requestBodyBody.isOneShot()) {
                            this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                        } else {
                            TTBaseActivity tTBaseActivity = new TTBaseActivity();
                            requestBodyBody.writeTo(tTBaseActivity);
                            if (StringsKt__StringsJVMKt.equals("gzip", headers.get("Content-Encoding"), true)) {
                                lValueOf2 = Long.valueOf(tTBaseActivity.ICustomTabsCallbackDefault());
                                tTCeilingLandingPageActivity1 = new TTCeilingLandingPageActivity1(tTBaseActivity);
                                try {
                                    tTBaseActivity = new TTBaseActivity();
                                    tTBaseActivity.onExtraCallbackWithResult(tTCeilingLandingPageActivity1);
                                    CloseableKt.closeFinally(tTCeilingLandingPageActivity1, null);
                                } finally {
                                }
                            } else {
                                lValueOf2 = null;
                            }
                            Charset charsetCharsetOrUtf8 = Internal.charsetOrUtf8(requestBodyBody.contentType());
                            this.logger.log(_UrlKt.FRAGMENT_ENCODE_SET);
                            str2 = str4;
                            if (!IsProbablyUtf8Kt.isProbablyUtf8(tTBaseActivity, 16L)) {
                                this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + str2);
                            } else if (lValueOf2 != null) {
                                Logger logger = this.logger;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("--> END ");
                                sb4.append(request.method());
                                str3 = str;
                                sb4.append(str3);
                                str2 = str2;
                                sb4.append(tTBaseActivity.ICustomTabsCallbackDefault());
                                sb4.append("-byte, ");
                                sb4.append(lValueOf2.longValue());
                                sb4.append("-gzipped-byte body)");
                                logger.log(sb4.toString());
                            } else {
                                str2 = str2;
                                str3 = str;
                                this.logger.log(tTBaseActivity.IAuthTabCallback(charsetCharsetOrUtf8));
                                this.logger.log("--> END " + request.method() + str3 + requestBodyBody.contentLength() + "-byte body)");
                            }
                        }
                        str2 = str4;
                    }
                } else {
                    MediaType mediaTypeContentType = requestBodyBody.contentType();
                    if (mediaTypeContentType != null && headers.get("Content-Type") == null) {
                        this.logger.log("Content-Type: " + mediaTypeContentType);
                    }
                    if (requestBodyBody.contentLength() != -1) {
                        int i9 = onTransact + 107;
                        IAuthTabCallbackDefault = i9 % 128;
                        int i10 = i9 % 2;
                        if (headers.get("Content-Length") == null) {
                            Logger logger2 = this.logger;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Content-Length: ");
                            str4 = "-byte body omitted)";
                            sb5.append(requestBodyBody.contentLength());
                            logger2.log(sb5.toString());
                        }
                        size = headers.size();
                        while (i < size) {
                        }
                        if (z) {
                            str2 = str4;
                            str3 = str;
                            this.logger.log("--> END " + request.method());
                        }
                    }
                }
                jNanoTime = System.nanoTime();
                responseProceed = chain.proceed(request);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                ResponseBody responseBodyBody = responseProceed.body();
                Intrinsics.checkNotNull(responseBodyBody);
                long jContentLength = responseBodyBody.contentLength();
                String str5 = jContentLength == -1 ? jContentLength + "-byte" : "unknown-length";
                Logger logger3 = this.logger;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("<-- " + responseProceed.code());
                if (responseProceed.message().length() > 0) {
                    sb6.append(' ' + responseProceed.message());
                }
                sb6.append(' ' + redactUrl$logging_interceptor(responseProceed.request().url()) + str3 + millis + "ms");
                if (!z2) {
                    sb6.append(", " + str5 + " body");
                }
                sb6.append(")");
                logger3.log(sb6.toString());
                if (z2) {
                    Headers headers2 = responseProceed.headers();
                    int size2 = headers2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        logHeader(headers2, i11);
                    }
                    if (z && HttpHeaders.promisesBody(responseProceed)) {
                        if (!(!bodyHasUnknownEncoding(responseProceed.headers()))) {
                            this.logger.log("<-- END HTTP (encoded body omitted)");
                            return responseProceed;
                        }
                        if (bodyIsStreaming(responseProceed)) {
                            this.logger.log("<-- END HTTP (streaming)");
                            return responseProceed;
                        }
                        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBodyBody.source();
                        tTAppOpenAdTransActivitySource.asBinder(LongCompanionObject.MAX_VALUE);
                        long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                        TTBaseActivity tTBaseActivityAccess100 = tTAppOpenAdTransActivitySource.access100();
                        if (StringsKt__StringsJVMKt.equals("gzip", headers2.get("Content-Encoding"), true)) {
                            long jICustomTabsCallbackDefault = tTBaseActivityAccess100.ICustomTabsCallbackDefault();
                            tTCeilingLandingPageActivity1 = new TTCeilingLandingPageActivity1(tTBaseActivityAccess100.clone());
                            try {
                                tTBaseActivityAccess100 = new TTBaseActivity();
                                tTBaseActivityAccess100.onExtraCallbackWithResult(tTCeilingLandingPageActivity1);
                                CloseableKt.closeFinally(tTCeilingLandingPageActivity1, null);
                                lValueOf = Long.valueOf(jICustomTabsCallbackDefault);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        Charset charsetCharsetOrUtf82 = Internal.charsetOrUtf8(responseBodyBody.contentType());
                        if (!IsProbablyUtf8Kt.isProbablyUtf8(tTBaseActivityAccess100, 16L)) {
                            this.logger.log(_UrlKt.FRAGMENT_ENCODE_SET);
                            this.logger.log("<-- END HTTP (" + millis2 + "ms, binary " + tTBaseActivityAccess100.ICustomTabsCallbackDefault() + str2);
                            return responseProceed;
                        }
                        if (jContentLength != 0) {
                            this.logger.log(_UrlKt.FRAGMENT_ENCODE_SET);
                            this.logger.log(tTBaseActivityAccess100.clone().IAuthTabCallback(charsetCharsetOrUtf82));
                        }
                        Logger logger4 = this.logger;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("<-- END HTTP (" + millis2 + "ms, " + tTBaseActivityAccess100.ICustomTabsCallbackDefault() + "-byte");
                        if (lValueOf != null) {
                            sb7.append(", " + lValueOf.longValue() + "-gzipped-byte");
                        }
                        sb7.append(" body)");
                        logger4.log(sb7.toString());
                        int i12 = onTransact + 27;
                        IAuthTabCallbackDefault = i12 % 128;
                        int i13 = i12 % 2;
                        return responseProceed;
                    }
                    this.logger.log("<-- END HTTP");
                }
                return responseProceed;
            }
            str2 = "-byte body omitted)";
            responseProceed = chain.proceed(request);
            long millis3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody2 = responseProceed.body();
            Intrinsics.checkNotNull(responseBodyBody2);
            long jContentLength2 = responseBodyBody2.contentLength();
            if (jContentLength2 == -1) {
            }
            Logger logger32 = this.logger;
            StringBuilder sb62 = new StringBuilder();
            sb62.append("<-- " + responseProceed.code());
            if (responseProceed.message().length() > 0) {
            }
            sb62.append(' ' + redactUrl$logging_interceptor(responseProceed.request().url()) + str3 + millis3 + "ms");
            if (!z2) {
            }
            sb62.append(")");
            logger32.log(sb62.toString());
            if (z2) {
            }
            return responseProceed;
        } catch (Exception e) {
            long millis4 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            Logger logger5 = this.logger;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("<-- HTTP FAILED: " + e + '.');
            sb8.append(' ' + redactUrl$logging_interceptor(request.url()) + str3 + millis4 + "ms)");
            logger5.log(sb8.toString());
            throw e;
        }
        str3 = str;
        jNanoTime = System.nanoTime();
    }

    public final String redactUrl$logging_interceptor(@NotNull HttpUrl httpUrl) {
        String strQueryParameterValue;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (!this.queryParamsNameToRedact.isEmpty()) {
            int i4 = onTransact + 25;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (httpUrl.querySize() != 0) {
                HttpUrl.Builder builderQuery = httpUrl.newBuilder().query(null);
                int iQuerySize = httpUrl.querySize();
                int i6 = onTransact + 125;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                for (int i8 = 0; i8 < iQuerySize; i8++) {
                    int i9 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    String strQueryParameterName = httpUrl.queryParameterName(i8);
                    if (this.queryParamsNameToRedact.contains(strQueryParameterName)) {
                        int i11 = onTransact + 91;
                        IAuthTabCallbackDefault = i11 % 128;
                        strQueryParameterValue = "██";
                        if (i11 % 2 != 0) {
                            int i12 = 69 / 0;
                        }
                    } else {
                        strQueryParameterValue = httpUrl.queryParameterValue(i8);
                    }
                    builderQuery.addEncodedQueryParameter(strQueryParameterName, strQueryParameterValue);
                }
                return builderQuery.toString();
            }
        }
        return httpUrl.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void logHeader(Headers headers, int i) {
        String strValue;
        int i2 = 2 % 2;
        int i3 = onTransact + 19;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
            if (!this.headersToRedact.contains(headers.name(i))) {
                strValue = headers.value(i);
                int i5 = onTransact + 21;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                strValue = "██";
            }
        } else if (this.headersToRedact.contains(headers.name(i))) {
        }
        this.logger.log(headers.name(i) + ": " + strValue);
        int i7 = IAuthTabCallbackDefault + 57;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        int i = 2 % 2;
        String str = headers.get("Content-Encoding");
        if (str != null) {
            if (!(!StringsKt__StringsJVMKt.equals(str, "identity", true)) || StringsKt__StringsJVMKt.equals(str, "gzip", true)) {
                return false;
            }
            int i2 = onTransact + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final boolean bodyIsStreaming(Response response) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MediaType mediaTypeContentType = response.body().contentType();
        if (mediaTypeContentType != null) {
            String strType = mediaTypeContentType.type();
            Object[] objArr = new Object[1];
            a((short) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), (byte) (98 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1145846259 - ((Process.getThreadPriority(0) + 20) >> 6), 246100167 - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) - 6, objArr);
            if (Intrinsics.areEqual(strType, ((String) objArr[0]).intern()) && Intrinsics.areEqual(mediaTypeContentType.subtype(), "event-stream")) {
                return true;
            }
        }
        int i4 = IAuthTabCallbackDefault + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return false;
    }

    static void onExtraCallback() {
        onNavigationEvent = 536092165;
        onExtraCallback = -1538795506;
        IAuthTabCallback = 1427314597;
        onExtraCallbackWithResult = new byte[]{-10, -106, 121, -101};
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
