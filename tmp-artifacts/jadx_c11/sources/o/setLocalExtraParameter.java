package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class setLocalExtraParameter implements Executor {
    private final ArrayDeque<Runnable> onExtraCallback = new ArrayDeque<>();
    private Runnable onExtraCallbackWithResult;
    private final Executor onNavigationEvent;

    public setLocalExtraParameter(Executor executor) {
        this.onNavigationEvent = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        synchronized (this) {
            this.onExtraCallback.offer(new Runnable() { // from class: o.setLocalExtraParameter.3
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // java.lang.Runnable
                public void run() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i2 % 128;
                    try {
                        if (i2 % 2 != 0) {
                            runnable.run();
                            setLocalExtraParameter.this.onExtraCallback();
                            int i3 = onNavigationEvent + 125;
                            onExtraCallbackWithResult = i3 % 128;
                            if (i3 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        runnable.run();
                        throw null;
                    } finally {
                        setLocalExtraParameter.this.onExtraCallback();
                    }
                }
            });
            if (this.onExtraCallbackWithResult == null) {
                onExtraCallback();
            }
        }
    }

    void onExtraCallback() {
        synchronized (this) {
            Runnable runnablePoll = this.onExtraCallback.poll();
            this.onExtraCallbackWithResult = runnablePoll;
            if (runnablePoll != null) {
                this.onNavigationEvent.execute(runnablePoll);
            }
        }
    }
}
