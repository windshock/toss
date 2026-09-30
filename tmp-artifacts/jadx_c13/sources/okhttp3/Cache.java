package okhttp3;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TrackGroupExternalSyntheticLambda0;
import o.clearNumber;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import okio.FileSystem;
import okio.ForwardingSink;
import okio.ForwardingSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cache implements Closeable, Flushable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static int IAuthTabCallback = 1;
    private static final int VERSION = 201105;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    static {
        onExtraCallback();
        Companion = new Companion(null);
        int i = onExtraCallback + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @JvmStatic
    public static final String key(@NotNull HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strKey = Companion.key(httpUrl);
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return strKey;
    }

    public Cache(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, long j, @NotNull FileSystem fileSystem, @NotNull TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(taskRunner, "");
        this.cache = new DiskLruCache(fileSystem, tTFullScreenVideoActivity3, VERSION, 2, j, taskRunner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, long j) {
        this(tTFullScreenVideoActivity3, j, fileSystem, TaskRunner.INSTANCE);
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull File file, long j) {
        this(FileSystem.SYSTEM, TTFullScreenVideoActivity3.onExtraCallback.onNavigationEvent(TTFullScreenVideoActivity3.Companion, file, false, 1, null), j);
        Intrinsics.checkNotNullParameter(file, "");
    }

    public final DiskLruCache getCache$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        DiskLruCache diskLruCache = this.cache;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return diskLruCache;
    }

    public final int getWriteSuccessCount$okhttp() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            i = this.writeSuccessCount;
            int i5 = 81 / 0;
        } else {
            i = this.writeSuccessCount;
        }
        int i6 = i4 + 79;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.writeSuccessCount = i;
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
    }

    public final int getWriteAbortCount$okhttp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.writeAbortCount;
        int i6 = i3 + 107;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        this.writeAbortCount = i;
        int i6 = i3 + 57;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean isClosed() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCache diskLruCache = this.cache;
        if (i3 == 0) {
            return diskLruCache.isClosed();
        }
        diskLruCache.isClosed();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Response get$okhttp(@NotNull Request request) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(request, "");
                this.cache.get(Companion.key(request.url()));
                throw null;
            }
            Intrinsics.checkNotNullParameter(request, "");
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                int i3 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    int i4 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 43 / 0;
                    }
                    return response;
                }
                int i6 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    _UtilCommonKt.closeQuietly(response.body());
                    return null;
                }
                _UtilCommonKt.closeQuietly(response.body());
                obj.hashCode();
                throw null;
            } catch (IOException unused) {
                _UtilCommonKt.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i8]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.normalizeMetaState(i3)), ExpandableListView.getPackedPositionGroup(j) + 35, 14240 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 95;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10934), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65, View.combineMeasuredStates(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    int i11 = $11 + 17;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 5 / 5;
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 29, 17657 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 70, Drawable.resolveOpacity(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i14, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i14);
            int i15 = $11 + 35;
            $10 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
        } else {
            i = 2;
        }
        if (z) {
            int i17 = $10 + 73;
            $11 = i17 % 128;
            int i18 = i17 % i;
            char[] cArr6 = new char[i5];
            int i19 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i19;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                i19 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i20;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                int i21 = $10 + 81;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[4]);
                    i20 = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i20 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
            }
        }
        objArr[0] = new String(cArr4);
    }

    public final CacheRequest put$okhttp(@NotNull Response response) throws Throwable {
        DiskLruCache.Editor editorEdit$default;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        String strMethod = response.request().method();
        Object obj = null;
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return null;
        }
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 3}, true, new byte[]{0, 1, 0}, objArr);
        if (!Intrinsics.areEqual(strMethod, ((String) objArr[0]).intern())) {
            return null;
        }
        Companion companion = Companion;
        if (!(!companion.hasVaryAll(response))) {
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                int i6 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(@NotNull Request request) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(request, "");
        this.cache.remove(Companion.key(request.url()));
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void update$okhttp(@NotNull Response response, @NotNull Response response2) {
        DiskLruCache.Editor editorEdit;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(response2, "");
        Entry entry = new Entry(response2);
        ResponseBody responseBodyBody = response.body();
        Intrinsics.checkNotNull(responseBodyBody, "");
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.writeTo(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                abortQuietly(editorEdit);
                int i2 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        int i = 2 % 2;
        if (editor != null) {
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    editor.abort();
                    int i3 = 87 / 0;
                } else {
                    editor.abort();
                }
                int i4 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (IOException unused) {
            }
        }
    }

    public final void initialize() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.cache.initialize();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void delete() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.cache.delete();
            throw null;
        }
        this.cache.delete();
        int i3 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void evictAll() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.cache.evictAll();
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    /* renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<String>, KMutableIterator {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        AnonymousClass1(Cache cache) {
            this.delegate = cache.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = TTCeilingLandingPageActivity5.onExtraCallback(next.getSource(0)).onUnminimized();
                        CloseableKt.closeFinally(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            Intrinsics.checkNotNull(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()");
            }
            this.delegate.remove();
        }
    }

    public final Iterator<String> urls() throws IOException {
        int i = 2 % 2;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return anonymousClass1;
    }

    public final int writeAbortCount() {
        int i;
        synchronized (this) {
            i = this.writeAbortCount;
        }
        return i;
    }

    public final int writeSuccessCount() {
        int i;
        synchronized (this) {
            i = this.writeSuccessCount;
        }
        return i;
    }

    public final long size() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long size = this.cache.size();
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final long maxSize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCache diskLruCache = this.cache;
        if (i3 == 0) {
            return diskLruCache.getMaxSize();
        }
        diskLruCache.getMaxSize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.cache.flush();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.cache.close();
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final File directory() {
        File fileAsBinder;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            fileAsBinder = this.cache.getDirectory().asBinder();
            int i3 = 78 / 0;
        } else {
            fileAsBinder = this.cache.getDirectory().asBinder();
        }
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fileAsBinder;
    }

    public final TTFullScreenVideoActivity3 directoryPath() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TTFullScreenVideoActivity3 directory = this.cache.getDirectory();
        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return directory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m172deprecated_directory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TTFullScreenVideoActivity3 directory = this.cache.getDirectory();
        if (i3 == 0) {
            return directory.asBinder();
        }
        directory.asBinder();
        throw null;
    }

    public final void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(cacheStrategy, "");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        }
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    public final int networkCount() {
        int i;
        synchronized (this) {
            i = this.networkCount;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int requestCount() {
        int i;
        synchronized (this) {
            i = this.requestCount;
        }
        return i;
    }

    final class RealCacheRequest implements CacheRequest {
        private final TTHistoryActivity41 body;
        private final TTHistoryActivity41 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(@NotNull final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "");
            this.this$0 = cache;
            this.editor = editor;
            TTHistoryActivity41 tTHistoryActivity41NewSink = editor.newSink(1);
            this.cacheOut = tTHistoryActivity41NewSink;
            this.body = new ForwardingSink(tTHistoryActivity41NewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
                public void close() throws IOException {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() throws IOException {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                _UtilCommonKt.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public TTHistoryActivity41 body() {
            return this.body;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{27236, 27138, 27144};
    }

    static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        public Entry(@NotNull TTHistoryActivity42 tTHistoryActivity42) throws IOException {
            TlsVersion tlsVersionForJavaName;
            Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
            try {
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42);
                String strOnUnminimized = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
                HttpUrl httpUrl = HttpUrl.Companion.parse(strOnUnminimized);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for " + strOnUnminimized);
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.Companion.readInt$okhttp(tTAppOpenAdTransActivityOnExtraCallback);
                for (int i = 0; i < int$okhttp; i++) {
                    builder.addLenient$okhttp(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.Companion.parse(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.Companion.readInt$okhttp(tTAppOpenAdTransActivityOnExtraCallback);
                for (int i2 = 0; i2 < int$okhttp2; i2++) {
                    builder2.addLenient$okhttp(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (this.url.isHttps()) {
                    String strOnUnminimized2 = tTAppOpenAdTransActivityOnExtraCallback.onUnminimized();
                    if (strOnUnminimized2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strOnUnminimized2 + '\"');
                    }
                    CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                    List<Certificate> certificateList = readCertificateList(tTAppOpenAdTransActivityOnExtraCallback);
                    List<Certificate> certificateList2 = readCertificateList(tTAppOpenAdTransActivityOnExtraCallback);
                    if (!tTAppOpenAdTransActivityOnExtraCallback.IAuthTabCallback_Parcel()) {
                        tlsVersionForJavaName = TlsVersion.Companion.forJavaName(tTAppOpenAdTransActivityOnExtraCallback.onUnminimized());
                    } else {
                        tlsVersionForJavaName = TlsVersion.SSL_3_0;
                    }
                    this.handshake = Handshake.Companion.get(tlsVersionForJavaName, cipherSuiteForJavaName, certificateList, certificateList2);
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(tTHistoryActivity42, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(tTHistoryActivity42, th);
                    throw th2;
                }
            }
        }

        public Entry(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public final void writeTo(@NotNull DiskLruCache.Editor editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "");
            TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(editor.newSink(0));
            try {
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(this.url.toString()).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(this.requestMethod).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.IAuthTabCallbackStubProxy(this.varyHeaders.size()).onExtraCallbackWithResult(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(this.varyHeaders.name(i)).onExtraCallback(": ").onExtraCallback(this.varyHeaders.value(i)).onExtraCallbackWithResult(10);
                }
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(new StatusLine(this.protocol, this.code, this.message).toString()).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.IAuthTabCallbackStubProxy(this.responseHeaders.size() + 2).onExtraCallbackWithResult(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(this.responseHeaders.name(i2)).onExtraCallback(": ").onExtraCallback(this.responseHeaders.value(i2)).onExtraCallbackWithResult(10);
                }
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(SENT_MILLIS).onExtraCallback(": ").IAuthTabCallbackStubProxy(this.sentRequestMillis).onExtraCallbackWithResult(10);
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(RECEIVED_MILLIS).onExtraCallback(": ").IAuthTabCallbackStubProxy(this.receivedResponseMillis).onExtraCallbackWithResult(10);
                if (this.url.isHttps()) {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(10);
                    Handshake handshake = this.handshake;
                    Intrinsics.checkNotNull(handshake);
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(handshake.cipherSuite().javaName()).onExtraCallbackWithResult(10);
                    writeCertList(tTAppOpenAdActivity9OnExtraCallbackWithResult, this.handshake.peerCertificates());
                    writeCertList(tTAppOpenAdActivity9OnExtraCallbackWithResult, this.handshake.localCertificates());
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(this.handshake.tlsVersion().javaName()).onExtraCallbackWithResult(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, null);
            } finally {
            }
        }

        private final List<Certificate> readCertificateList(TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException, CertificateException {
            int int$okhttp = Cache.Companion.readInt$okhttp(tTAppOpenAdTransActivity);
            if (int$okhttp == -1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    String strOnUnminimized = tTAppOpenAdTransActivity.onUnminimized();
                    TTBaseActivity tTBaseActivity = new TTBaseActivity();
                    TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = TTBaseLandingPageActivity.Companion.onExtraCallback(strOnUnminimized);
                    if (tTBaseLandingPageActivityOnExtraCallback == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    tTBaseActivity.onExtraCallback(tTBaseLandingPageActivityOnExtraCallback);
                    arrayList.add(certificateFactory.generateCertificate(tTBaseActivity.IAuthTabCallbackStubProxy()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(TTAppOpenAdActivity9 tTAppOpenAdActivity9, List<? extends Certificate> list) throws IOException, CertificateEncodingException {
            try {
                tTAppOpenAdActivity9.IAuthTabCallbackStubProxy(list.size()).onExtraCallbackWithResult(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
                    Intrinsics.checkNotNull(encoded);
                    tTAppOpenAdActivity9.onExtraCallback(TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, encoded, 0, 0, 3, null).IAuthTabCallback()).onExtraCallbackWithResult(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@NotNull Request request, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(request, "");
            Intrinsics.checkNotNullParameter(response, "");
            return Intrinsics.areEqual(this.url, request.url()) && Intrinsics.areEqual(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(@NotNull DiskLruCache.Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request(this.url, this.varyHeaders, this.requestMethod, null, 8, null)).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }
    }

    static final class CacheResponseBody extends ResponseBody {
        private final TTAppOpenAdTransActivity bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@NotNull DiskLruCache.Snapshot snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = TTCeilingLandingPageActivity5.onExtraCallback(new ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return _UtilCommonKt.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public TTAppOpenAdTransActivity source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String key(@NotNull HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            return TTBaseLandingPageActivity.Companion.IAuthTabCallback(httpUrl.toString()).onTransact().asInterface();
        }

        public final int readInt$okhttp(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            try {
                long typedObject = tTAppOpenAdTransActivity.readTypedObject();
                String strOnUnminimized = tTAppOpenAdTransActivity.onUnminimized();
                if (typedObject >= 0 && typedObject <= 2147483647L && strOnUnminimized.length() <= 0) {
                    return (int) typedObject;
                }
                throw new IOException("expected an int but was \"" + typedObject + strOnUnminimized + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean varyMatches(@NotNull Response response, @NotNull Headers headers, @NotNull Request request) {
            Intrinsics.checkNotNullParameter(response, "");
            Intrinsics.checkNotNullParameter(headers, "");
            Intrinsics.checkNotNullParameter(request, "");
            Set<String> setVaryFields = varyFields(response.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!Intrinsics.areEqual(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean hasVaryAll(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            return varyFields(response.headers()).contains("*");
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals("Vary", headers.name(i), true)) {
                    String strValue = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt__StringsJVMKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    Iterator it = StringsKt__StringsKt.split$default((CharSequence) strValue, new char[]{','}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? clearNumber.onNavigationEvent() : treeSet;
        }

        public final Headers varyHeaders(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            Response responseNetworkResponse = response.networkResponse();
            Intrinsics.checkNotNull(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> setVaryFields = varyFields(headers2);
            if (setVaryFields.isEmpty()) {
                return Headers.EMPTY;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String strName = headers.name(i);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, headers.value(i));
                }
            }
            return builder.build();
        }
    }
}
