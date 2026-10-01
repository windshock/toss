package o;

import android.graphics.Color;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.executor.RuntimeCompat;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TypefaceRequestCacheExternalSyntheticLambda0 implements ExecutorService, AutoCloseable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static boolean asBinder;
    private static boolean asInterface;
    private static final long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static volatile int onWarmupCompleted;
    private final ExecutorService onExtraCallback;

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onUnminimized.onExtraCallback(this);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackStubProxy + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        IAuthTabCallbackDefault();
        onExtraCallbackWithResult = TimeUnit.SECONDS.toMillis(10L);
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static onExtraCallbackWithResult IAuthTabCallback() {
        int i2 = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = new onExtraCallbackWithResult(true).onExtraCallback(1).onExtraCallback("disk-cache");
        int i3 = onTransact + 111;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return onextracallbackwithresultOnExtraCallback;
    }

    public static TypefaceRequestCacheExternalSyntheticLambda0 onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onTransact + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback();
        if (i4 != 0) {
            return onextracallbackwithresultIAuthTabCallback.onWarmupCompleted();
        }
        onextracallbackwithresultIAuthTabCallback.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onExtraCallbackWithResult asBinder() {
        int i2 = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = new onExtraCallbackWithResult(false).onExtraCallback(onExtraCallbackWithResult()).onExtraCallback("source");
        int i3 = IAuthTabCallbackStubProxy + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return onextracallbackwithresultOnExtraCallback;
    }

    public static TypefaceRequestCacheExternalSyntheticLambda0 asInterface() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0OnWarmupCompleted = asBinder().onWarmupCompleted();
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return typefaceRequestCacheExternalSyntheticLambda0OnWarmupCompleted;
    }

    public static TypefaceRequestCacheExternalSyntheticLambda0 onTransact() {
        int i2 = 2 % 2;
        TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0 = new TypefaceRequestCacheExternalSyntheticLambda0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, onExtraCallbackWithResult, TimeUnit.MILLISECONDS, new SynchronousQueue(), new onNavigationEvent(new onExtraCallback(), "source-unlimited", onWarmupCompleted.onWarmupCompleted, false)));
        int i3 = IAuthTabCallbackStubProxy + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return typefaceRequestCacheExternalSyntheticLambda0;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 23;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 77, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 77, View.MeasureSpec.getMode(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), TextUtils.indexOf("", "", 0, 0) + 75, TextUtils.indexOf("", "", 0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 63 - TextUtils.indexOf("", "", 0, 0), Color.blue(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 62 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            int i7 = $11 + 73;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    public static onExtraCallbackWithResult onWarmupCompleted() throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0 ? onExtraCallbackWithResult() < 4 : onExtraCallbackWithResult() < 2) {
            int i5 = onTransact + 93;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 4;
            }
            i2 = 1;
        }
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = new onExtraCallbackWithResult(true).onExtraCallback(i2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -122, -125, -123, -127, -124, -125, -126, -127}, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        return onextracallbackwithresultOnExtraCallback.onExtraCallback(((String) objArr[0]).intern());
    }

    public static TypefaceRequestCacheExternalSyntheticLambda0 onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted().onWarmupCompleted();
            throw null;
        }
        TypefaceRequestCacheExternalSyntheticLambda0 typefaceRequestCacheExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted().onWarmupCompleted();
        int i4 = IAuthTabCallbackStubProxy + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return typefaceRequestCacheExternalSyntheticLambda0OnWarmupCompleted;
    }

    TypefaceRequestCacheExternalSyntheticLambda0(ExecutorService executorService) {
        this.onExtraCallback = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.execute(runnable);
        int i5 = IAuthTabCallbackStubProxy + 5;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(@NonNull Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = onTransact + 121;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Future<?> futureSubmit = this.onExtraCallback.submit(runnable);
        int i5 = IAuthTabCallbackStubProxy + 69;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        ExecutorService executorService = this.onExtraCallback;
        if (i4 != 0) {
            return executorService.invokeAll(collection);
        }
        executorService.invokeAll(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 51;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallback.invokeAll(collection, j, timeUnit);
            throw null;
        }
        List<Future<T>> listInvokeAll = this.onExtraCallback.invokeAll(collection, j, timeUnit);
        int i4 = IAuthTabCallbackStubProxy + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return listInvokeAll;
        }
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        T t = (T) this.onExtraCallback.invokeAny(collection);
        int i5 = IAuthTabCallbackStubProxy + 63;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        ExecutorService executorService = this.onExtraCallback;
        if (i4 != 0) {
            return (T) executorService.invokeAny(collection, j, timeUnit);
        }
        executorService.invokeAny(collection, j, timeUnit);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Future<T> futureSubmit = this.onExtraCallback.submit(runnable, t);
        int i5 = IAuthTabCallbackStubProxy + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onExtraCallback.submit(callable);
            throw null;
        }
        Future<T> futureSubmit = this.onExtraCallback.submit(callable);
        int i4 = onTransact + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return futureSubmit;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.shutdown();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 117;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onExtraCallback.shutdownNow();
            obj.hashCode();
            throw null;
        }
        List<Runnable> listShutdownNow = this.onExtraCallback.shutdownNow();
        int i4 = IAuthTabCallbackStubProxy + 53;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return listShutdownNow;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsShutdown = this.onExtraCallback.isShutdown();
        int i5 = onTransact + 63;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsShutdown;
        }
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 71;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallback.isTerminated();
            throw null;
        }
        boolean zIsTerminated = this.onExtraCallback.isTerminated();
        int i4 = IAuthTabCallbackStubProxy + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zIsTerminated;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean zAwaitTermination = this.onExtraCallback.awaitTermination(j, timeUnit);
        int i5 = IAuthTabCallbackStubProxy + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zAwaitTermination;
    }

    public String toString() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String string = this.onExtraCallback.toString();
        int i5 = IAuthTabCallbackStubProxy + 45;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        if (onWarmupCompleted == 0) {
            int i3 = onTransact + 85;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted = Math.min(4, RuntimeCompat.onExtraCallbackWithResult());
            int i5 = IAuthTabCallbackStubProxy + 73;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return onWarmupCompleted;
    }

    static void IAuthTabCallbackDefault() {
        onNavigationEvent = new char[]{32416, 32467, 32472, 32476, 32469, 32466};
        IAuthTabCallback = -1184334015;
        asInterface = true;
        asBinder = true;
    }

    public interface onWarmupCompleted {
        public static final onWarmupCompleted IAuthTabCallback;
        public static final onWarmupCompleted onExtraCallbackWithResult;
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted() { // from class: o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted.3
            @Override // o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted
            public void onExtraCallbackWithResult(Throwable th) {
            }
        };
        public static final onWarmupCompleted onWarmupCompleted;

        void onExtraCallbackWithResult(Throwable th);

        static {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted() { // from class: o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted.2
                @Override // o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted
                public void onExtraCallbackWithResult(Throwable th) {
                }
            };
            onExtraCallbackWithResult = onwarmupcompleted;
            IAuthTabCallback = new onWarmupCompleted() { // from class: o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted.4
                @Override // o.TypefaceRequestCacheExternalSyntheticLambda0.onWarmupCompleted
                public void onExtraCallbackWithResult(Throwable th) {
                    if (th != null) {
                        throw new RuntimeException("Request threw uncaught throwable", th);
                    }
                }
            };
            onWarmupCompleted = onwarmupcompleted;
        }
    }

    static final class onExtraCallback implements ThreadFactory {
        private onExtraCallback() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable) { // from class: o.TypefaceRequestCacheExternalSyntheticLambda0.onExtraCallback.4
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() throws SecurityException, IllegalArgumentException {
                    Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    static final class onNavigationEvent implements ThreadFactory {
        private final AtomicInteger IAuthTabCallback = new AtomicInteger();
        final boolean onExtraCallback;
        private final ThreadFactory onExtraCallbackWithResult;
        private final String onNavigationEvent;
        final onWarmupCompleted onWarmupCompleted;

        onNavigationEvent(ThreadFactory threadFactory, String str, onWarmupCompleted onwarmupcompleted, boolean z) {
            this.onExtraCallbackWithResult = threadFactory;
            this.onNavigationEvent = str;
            this.onWarmupCompleted = onwarmupcompleted;
            this.onExtraCallback = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull final Runnable runnable) {
            Thread threadNewThread = this.onExtraCallbackWithResult.newThread(new Runnable() { // from class: o.TypefaceRequestCacheExternalSyntheticLambda0.onNavigationEvent.3
                @Override // java.lang.Runnable
                public void run() {
                    if (onNavigationEvent.this.onExtraCallback) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        onNavigationEvent.this.onWarmupCompleted.onExtraCallbackWithResult(th);
                    }
                }
            });
            threadNewThread.setName("glide-" + this.onNavigationEvent + "-thread-" + this.IAuthTabCallback.getAndIncrement());
            return threadNewThread;
        }
    }

    public static final class onExtraCallbackWithResult {
        private final ThreadFactory IAuthTabCallback = new onExtraCallback();
        private onWarmupCompleted IAuthTabCallbackDefault = onWarmupCompleted.onWarmupCompleted;
        private long asBinder;
        private int onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private int onNavigationEvent;
        private String onWarmupCompleted;

        onExtraCallbackWithResult(boolean z) {
            this.onExtraCallbackWithResult = z;
        }

        public onExtraCallbackWithResult onExtraCallback(int i2) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = i2;
            return this;
        }

        public onExtraCallbackWithResult onExtraCallback(String str) {
            this.onWarmupCompleted = str;
            return this;
        }

        public TypefaceRequestCacheExternalSyntheticLambda0 onWarmupCompleted() {
            if (TextUtils.isEmpty(this.onWarmupCompleted)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.onWarmupCompleted);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.onNavigationEvent, this.onExtraCallback, this.asBinder, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new onNavigationEvent(this.IAuthTabCallback, this.onWarmupCompleted, this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult));
            if (this.asBinder != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new TypefaceRequestCacheExternalSyntheticLambda0(threadPoolExecutor);
        }
    }
}
