package o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FontFamilyResolverImplExternalSyntheticLambda4 {
    private final Map<String, IAuthTabCallback> onExtraCallbackWithResult = new HashMap();
    private final onNavigationEvent onNavigationEvent = new onNavigationEvent();

    FontFamilyResolverImplExternalSyntheticLambda4() {
    }

    void onWarmupCompleted(String str) {
        IAuthTabCallback IAuthTabCallback2;
        synchronized (this) {
            IAuthTabCallback2 = this.onExtraCallbackWithResult.get(str);
            if (IAuthTabCallback2 == null) {
                IAuthTabCallback2 = this.onNavigationEvent.IAuthTabCallback();
                this.onExtraCallbackWithResult.put(str, IAuthTabCallback2);
            }
            IAuthTabCallback2.onExtraCallback++;
        }
        IAuthTabCallback2.onNavigationEvent.lock();
    }

    void onExtraCallbackWithResult(String str) {
        IAuthTabCallback iAuthTabCallback;
        synchronized (this) {
            iAuthTabCallback = (IAuthTabCallback) markHierarchyDirty.onExtraCallbackWithResult(this.onExtraCallbackWithResult.get(str));
            int i2 = iAuthTabCallback.onExtraCallback;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + iAuthTabCallback.onExtraCallback);
            }
            int i3 = i2 - 1;
            iAuthTabCallback.onExtraCallback = i3;
            if (i3 == 0) {
                IAuthTabCallback iAuthTabCallbackRemove = this.onExtraCallbackWithResult.remove(str);
                if (!iAuthTabCallbackRemove.equals(iAuthTabCallback)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + iAuthTabCallback + ", but actually removed: " + iAuthTabCallbackRemove + ", safeKey: " + str);
                }
                this.onNavigationEvent.onNavigationEvent(iAuthTabCallbackRemove);
            }
        }
        iAuthTabCallback.onNavigationEvent.unlock();
    }

    static class IAuthTabCallback {
        int onExtraCallback;
        final Lock onNavigationEvent = new ReentrantLock();

        IAuthTabCallback() {
        }
    }

    static class onNavigationEvent {
        private final Queue<IAuthTabCallback> onExtraCallback = new ArrayDeque();

        onNavigationEvent() {
        }

        IAuthTabCallback IAuthTabCallback() {
            IAuthTabCallback iAuthTabCallbackPoll;
            synchronized (this.onExtraCallback) {
                iAuthTabCallbackPoll = this.onExtraCallback.poll();
            }
            return iAuthTabCallbackPoll == null ? new IAuthTabCallback() : iAuthTabCallbackPoll;
        }

        void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallback.size() < 10) {
                    this.onExtraCallback.offer(iAuthTabCallback);
                }
            }
        }
    }
}
