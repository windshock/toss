package androidx.media3.common;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PriorityTaskManager {
    private final Object onExtraCallbackWithResult = new Object();
    private final PriorityQueue<Integer> onNavigationEvent = new PriorityQueue<>(10, Collections.reverseOrder());
    private int IAuthTabCallback = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i2, int i3) {
            super("Priority too low [priority=" + i2 + ", highest=" + i3 + "]");
        }
    }

    public void onExtraCallbackWithResult(int i2) {
        synchronized (this.onExtraCallbackWithResult) {
            this.onNavigationEvent.add(Integer.valueOf(i2));
            this.IAuthTabCallback = Math.max(this.IAuthTabCallback, i2);
        }
    }

    public void onNavigationEvent(int i2) throws InterruptedException {
        synchronized (this.onExtraCallbackWithResult) {
            while (this.IAuthTabCallback != i2) {
                this.onExtraCallbackWithResult.wait();
            }
        }
    }

    public void onWarmupCompleted(int i2) throws PriorityTooLowException {
        synchronized (this.onExtraCallbackWithResult) {
            if (this.IAuthTabCallback != i2) {
                throw new PriorityTooLowException(i2, this.IAuthTabCallback);
            }
        }
    }

    public void onExtraCallback(int i2) {
        int iIntValue;
        synchronized (this.onExtraCallbackWithResult) {
            this.onNavigationEvent.remove(Integer.valueOf(i2));
            if (this.onNavigationEvent.isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Object[] objArr = {this.onNavigationEvent.peek()};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
                Object obj = objOnNavigationEvent;
                iIntValue = ((Integer) objOnNavigationEvent).intValue();
            }
            this.IAuthTabCallback = iIntValue;
            this.onExtraCallbackWithResult.notifyAll();
        }
    }
}
