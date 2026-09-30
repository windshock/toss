package o;

import android.os.Process;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.SaversKtExternalSyntheticLambda60;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda49 {
    private volatile onNavigationEvent IAuthTabCallback;
    private final Executor IAuthTabCallbackDefault;
    private final ReferenceQueue<SaversKtExternalSyntheticLambda60<?>> IAuthTabCallbackStub;
    private final boolean onExtraCallback;
    final Map<SaversKtExternalSyntheticLambda26, onWarmupCompleted> onExtraCallbackWithResult;
    private volatile boolean onNavigationEvent;
    private SaversKtExternalSyntheticLambda60.IAuthTabCallback onWarmupCompleted;

    interface onNavigationEvent {
    }

    SaversKtExternalSyntheticLambda49(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.SaversKtExternalSyntheticLambda49.3
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull final Runnable runnable) {
                return new Thread(new Runnable() { // from class: o.SaversKtExternalSyntheticLambda49.3.1
                    @Override // java.lang.Runnable
                    public void run() throws SecurityException, IllegalArgumentException {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    SaversKtExternalSyntheticLambda49(boolean z, Executor executor) {
        this.onExtraCallbackWithResult = new HashMap();
        this.IAuthTabCallbackStub = new ReferenceQueue<>();
        this.onExtraCallback = z;
        this.IAuthTabCallbackDefault = executor;
        executor.execute(new Runnable() { // from class: o.SaversKtExternalSyntheticLambda49.2
            @Override // java.lang.Runnable
            public void run() {
                SaversKtExternalSyntheticLambda49.this.onExtraCallbackWithResult();
            }
        });
    }

    void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda60.IAuthTabCallback iAuthTabCallback) {
        synchronized (iAuthTabCallback) {
            synchronized (this) {
                this.onWarmupCompleted = iAuthTabCallback;
            }
        }
    }

    void onWarmupCompleted(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60) {
        synchronized (this) {
            onWarmupCompleted onwarmupcompletedPut = this.onExtraCallbackWithResult.put(saversKtExternalSyntheticLambda26, new onWarmupCompleted(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda60, this.IAuthTabCallbackStub, this.onExtraCallback));
            if (onwarmupcompletedPut != null) {
                onwarmupcompletedPut.onNavigationEvent();
            }
        }
    }

    void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        synchronized (this) {
            onWarmupCompleted onwarmupcompletedRemove = this.onExtraCallbackWithResult.remove(saversKtExternalSyntheticLambda26);
            if (onwarmupcompletedRemove != null) {
                onwarmupcompletedRemove.onNavigationEvent();
            }
        }
    }

    SaversKtExternalSyntheticLambda60<?> onNavigationEvent(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        synchronized (this) {
            onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult.get(saversKtExternalSyntheticLambda26);
            if (onwarmupcompleted == null) {
                return null;
            }
            SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60 = onwarmupcompleted.get();
            if (saversKtExternalSyntheticLambda60 == null) {
                onExtraCallbackWithResult(onwarmupcompleted);
            }
            return saversKtExternalSyntheticLambda60;
        }
    }

    void onExtraCallbackWithResult(@NonNull onWarmupCompleted onwarmupcompleted) {
        synchronized (this) {
            this.onExtraCallbackWithResult.remove(onwarmupcompleted.onWarmupCompleted);
            if (onwarmupcompleted.onExtraCallback) {
                Resource<?> resource = onwarmupcompleted.onNavigationEvent;
                if (resource != null) {
                    this.onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted.onWarmupCompleted, new SaversKtExternalSyntheticLambda60<>(resource, true, false, onwarmupcompleted.onWarmupCompleted, this.onWarmupCompleted));
                }
            }
        }
    }

    void onExtraCallbackWithResult() {
        while (!this.onNavigationEvent) {
            try {
                onExtraCallbackWithResult((onWarmupCompleted) this.IAuthTabCallbackStub.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static final class onWarmupCompleted extends WeakReference<SaversKtExternalSyntheticLambda60<?>> {
        final boolean onExtraCallback;
        Resource<?> onNavigationEvent;
        final SaversKtExternalSyntheticLambda26 onWarmupCompleted;

        onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, @NonNull SaversKtExternalSyntheticLambda60<?> saversKtExternalSyntheticLambda60, @NonNull ReferenceQueue<? super SaversKtExternalSyntheticLambda60<?>> referenceQueue, boolean z) {
            super(saversKtExternalSyntheticLambda60, referenceQueue);
            this.onWarmupCompleted = (SaversKtExternalSyntheticLambda26) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
            this.onNavigationEvent = (saversKtExternalSyntheticLambda60.asInterface() && z) ? (Resource) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda60.onNavigationEvent()) : null;
            this.onExtraCallback = saversKtExternalSyntheticLambda60.asInterface();
        }

        void onNavigationEvent() {
            this.onNavigationEvent = null;
            clear();
        }
    }
}
