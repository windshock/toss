package okhttp3.internal;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTHistoryActivity42;
import o.setLogBuffers;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _UtilJvmKt {
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$0(EventListener eventListener, Call call) {
        Intrinsics.checkNotNullParameter(call, "");
        return eventListener;
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final ThreadFactory threadFactory(@NotNull final String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ThreadFactory() { // from class: okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return _UtilJvmKt.threadFactory$lambda$0(str, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$0(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z) {
        String strHost;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null)) {
            strHost = '[' + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ':' + httpUrl.port();
    }

    public static final String format(@NotNull String str, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static final Charset readBomAsCharset(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(charset, "");
        int iIAuthTabCallback = tTAppOpenAdTransActivity.IAuthTabCallback(_UtilCommonKt.getUNICODE_BOMS());
        if (iIAuthTabCallback == -1) {
            return charset;
        }
        if (iIAuthTabCallback == 0) {
            return Charsets.UTF_8;
        }
        if (iIAuthTabCallback == 1) {
            return Charsets.UTF_16BE;
        }
        if (iIAuthTabCallback == 2) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        if (iIAuthTabCallback == 3) {
            return Charsets.UTF_16LE;
        }
        if (iIAuthTabCallback == 4) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        throw new AssertionError();
    }

    public static final int checkDuration(@NotNull String str, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (j < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small").toString());
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m307checkDurationHG0u8IE(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        if (setLogBuffers.writeTypedObject(j)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long jAsBinder = setLogBuffers.asBinder(j);
        if (jAsBinder > 2147483647L) {
            throw new IllegalArgumentException((str + " too large").toString());
        }
        if (jAsBinder != 0 || !setLogBuffers.onMinimized(j)) {
            return (int) jAsBinder;
        }
        throw new IllegalArgumentException((str + " too small").toString());
    }

    public static final Headers toHeaders(@NotNull List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().IAuthTabCallback_Parcel(), header.component2().IAuthTabCallback_Parcel());
        }
        return builder.build();
    }

    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl httpUrl2) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(httpUrl2, "");
        return Intrinsics.areEqual(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.areEqual(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final EventListener.Factory asFactory(@NotNull final EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "");
        return new EventListener.Factory() { // from class: okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda0
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return _UtilJvmKt.asFactory$lambda$0(eventListener, call);
            }
        };
    }

    public static final boolean skipAll(@NotNull TTHistoryActivity42 tTHistoryActivity42, int i, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = tTHistoryActivity42.timeout().hasDeadline() ? tTHistoryActivity42.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        tTHistoryActivity42.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            while (tTHistoryActivity42.read(tTBaseActivity, 8192L) != -1) {
                tTBaseActivity.onWarmupCompleted();
            }
            if (jDeadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                tTHistoryActivity42.timeout().clearDeadline();
                return true;
            }
            tTHistoryActivity42.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                tTHistoryActivity42.timeout().clearDeadline();
                return false;
            }
            tTHistoryActivity42.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == LongCompanionObject.MAX_VALUE) {
                tTHistoryActivity42.timeout().clearDeadline();
            } else {
                tTHistoryActivity42.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final void skipAll(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        while (!tTAppOpenAdTransActivity.IAuthTabCallback_Parcel()) {
            tTAppOpenAdTransActivity.IAuthTabCallbackDefault(tTAppOpenAdTransActivity.access100().ICustomTabsCallbackDefault());
        }
    }

    public static final boolean discard(@NotNull TTHistoryActivity42 tTHistoryActivity42, int i, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            return skipAll(tTHistoryActivity42, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws SocketException {
        Intrinsics.checkNotNullParameter(socket, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean zIAuthTabCallback_Parcel = tTAppOpenAdTransActivity.IAuthTabCallback_Parcel();
                socket.setSoTimeout(soTimeout);
                return !zIAuthTabCallback_Parcel;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void threadName(@NotNull String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            threadCurrentThread.setName(name);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final long headersContentLength(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return _UtilCommonKt.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final <T> List<T> unmodifiable(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public static final <T> Set<T> unmodifiable(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> unmodifiable(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "");
        List<T> listUnmodifiableList = Collections.unmodifiableList(ArraysKt___ArraysJvmKt.asList(array));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        Intrinsics.checkNotNull(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return toImmutableList(tArr);
    }

    public static final <T> List<T> toImmutableList(@Nullable T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (tArr.length == 1) {
            List<T> listSingletonList = Collections.singletonList(tArr[0]);
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "");
            return listSingletonList;
        }
        List<T> listUnmodifiableList = Collections.unmodifiableList(ArraysKt___ArraysJvmKt.asList((Object[]) tArr.clone()));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public static final void closeQuietly(@NotNull Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) throws IOException {
        Intrinsics.checkNotNullParameter(serverSocket, "");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final <T> T readFieldOrNull(@NotNull Object obj, @NotNull Class<T> cls, @NotNull String str) {
        T tCast;
        Object fieldOrNull;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (!Intrinsics.areEqual(superclass, Object.class)) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    tCast = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                    Intrinsics.checkNotNullExpressionValue(superclass, "");
                }
            } else {
                if (Intrinsics.areEqual(str, "delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
        }
        return tCast;
    }

    public static final void assertLockNotHeld(@NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "");
        if (assertionsEnabled && Thread.holdsLock(dispatcher)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
        }
    }
}
