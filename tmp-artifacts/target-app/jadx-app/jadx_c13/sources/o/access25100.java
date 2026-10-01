package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access25100 {
    public static final int onExtraCallback;
    public static final boolean onWarmupCompleted;
    static final AtomicReference<ScheduledExecutorService> IAuthTabCallback = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> onNavigationEvent = new ConcurrentHashMap();

    static {
        onExtraCallback onextracallback = new onExtraCallback();
        boolean zIAuthTabCallback = IAuthTabCallback(true, "rx2.purge-enabled", true, true, onextracallback);
        onWarmupCompleted = zIAuthTabCallback;
        onExtraCallback = onExtraCallbackWithResult(zIAuthTabCallback, "rx2.purge-period-seconds", 1, 1, onextracallback);
        onWarmupCompleted();
    }

    public static void onWarmupCompleted() {
        onExtraCallback(onWarmupCompleted);
    }

    static void onExtraCallback(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = IAuthTabCallback;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (setSupportImageTintList.onNavigationEvent(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                onNavigationEvent onnavigationevent = new onNavigationEvent();
                long j = onExtraCallback;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(onnavigationevent, j, j, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    static int onExtraCallbackWithResult(boolean z, String str, int i, int i2, deserializeIntNullableCollection<String, String> deserializeintnullablecollection) {
        if (!z) {
            return i2;
        }
        try {
            String strApply = deserializeintnullablecollection.apply(str);
            if (strApply != null) {
                return Integer.parseInt(strApply);
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    static boolean IAuthTabCallback(boolean z, String str, boolean z2, boolean z3, deserializeIntNullableCollection<String, String> deserializeintnullablecollection) {
        if (!z) {
            return z3;
        }
        try {
            String strApply = deserializeintnullablecollection.apply(str);
            if (strApply != null) {
                return "true".equals(strApply);
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    static final class onExtraCallback implements deserializeIntNullableCollection<String, String> {
        onExtraCallback() {
        }

        @Override // o.deserializeIntNullableCollection
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService onNavigationEvent(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        onWarmupCompleted(onWarmupCompleted, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static void onWarmupCompleted(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            onNavigationEvent.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static final class onNavigationEvent implements Runnable {
        onNavigationEvent() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(access25100.onNavigationEvent.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    access25100.onNavigationEvent.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
