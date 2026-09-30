package o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 {
    long IAuthTabCallback();

    void onExtraCallback(IAuthTabCallback iAuthTabCallback);

    default long onExtraCallbackWithResult() {
        return -9223372036854775807L;
    }

    TextFieldSelectionStateExternalSyntheticLambda7 onNavigationEvent();

    void onWarmupCompleted(Handler handler, IAuthTabCallback iAuthTabCallback);

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(int i2, long j, long j2);

        public static final class onNavigationEvent {
            private final CopyOnWriteArrayList<onExtraCallbackWithResult> onExtraCallback = new CopyOnWriteArrayList<>();

            public void onExtraCallbackWithResult(Handler handler, IAuthTabCallback iAuthTabCallback) {
                IAuthTabCallback(iAuthTabCallback);
                this.onExtraCallback.add(new onExtraCallbackWithResult(handler, iAuthTabCallback));
            }

            public void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
                Iterator<onExtraCallbackWithResult> it = this.onExtraCallback.iterator();
                while (it.hasNext()) {
                    onExtraCallbackWithResult next = it.next();
                    if (next.onWarmupCompleted == iAuthTabCallback) {
                        next.onExtraCallbackWithResult();
                        this.onExtraCallback.remove(next);
                    }
                }
            }

            public void onExtraCallbackWithResult(final int i2, final long j, final long j2) {
                Iterator<onExtraCallbackWithResult> it = this.onExtraCallback.iterator();
                while (it.hasNext()) {
                    final onExtraCallbackWithResult next = it.next();
                    if (!next.onNavigationEvent) {
                        next.onExtraCallbackWithResult.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                next.onWarmupCompleted.onExtraCallbackWithResult(i2, j, j2);
                            }
                        });
                    }
                }
            }

            public static final class onExtraCallbackWithResult {
                private final Handler onExtraCallbackWithResult;
                private boolean onNavigationEvent;
                private final IAuthTabCallback onWarmupCompleted;

                public onExtraCallbackWithResult(Handler handler, IAuthTabCallback iAuthTabCallback) {
                    this.onExtraCallbackWithResult = handler;
                    this.onWarmupCompleted = iAuthTabCallback;
                }

                public void onExtraCallbackWithResult() {
                    this.onNavigationEvent = true;
                }
            }
        }
    }
}
