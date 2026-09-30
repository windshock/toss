package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda7;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsScaffoldKtExternalSyntheticLambda7 {
    private static final Comparator<onNavigationEvent> IAuthTabCallback = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposableSingletonsScaffoldKtExternalSyntheticLambda7.onExtraCallback((ComposableSingletonsScaffoldKtExternalSyntheticLambda7.onNavigationEvent) obj, (ComposableSingletonsScaffoldKtExternalSyntheticLambda7.onNavigationEvent) obj2);
        }
    };
    private static final Comparator<onNavigationEvent> onExtraCallback = new Comparator() { // from class: androidx.media3.exoplayer.upstream.SlidingPercentile$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((ComposableSingletonsScaffoldKtExternalSyntheticLambda7.onNavigationEvent) obj).IAuthTabCallback, ((ComposableSingletonsScaffoldKtExternalSyntheticLambda7.onNavigationEvent) obj2).IAuthTabCallback);
        }
    };
    private int asInterface;
    private final int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private final onNavigationEvent[] IAuthTabCallbackDefault = new onNavigationEvent[5];
    private final ArrayList<onNavigationEvent> IAuthTabCallbackStub = new ArrayList<>();
    private int onWarmupCompleted = -1;

    public static /* synthetic */ int onExtraCallback(onNavigationEvent onnavigationevent, onNavigationEvent onnavigationevent2) {
        return onnavigationevent.onExtraCallbackWithResult - onnavigationevent2.onExtraCallbackWithResult;
    }

    public ComposableSingletonsScaffoldKtExternalSyntheticLambda7(int i2) {
        this.onExtraCallbackWithResult = i2;
    }

    public void onNavigationEvent() {
        this.IAuthTabCallbackStub.clear();
        this.onWarmupCompleted = -1;
        this.onNavigationEvent = 0;
        this.onTransact = 0;
    }

    public void onExtraCallback(int i2, float f) {
        onNavigationEvent onnavigationevent;
        IAuthTabCallback();
        int i3 = this.asInterface;
        if (i3 > 0) {
            onNavigationEvent[] onnavigationeventArr = this.IAuthTabCallbackDefault;
            int i4 = i3 - 1;
            this.asInterface = i4;
            onnavigationevent = onnavigationeventArr[i4];
        } else {
            onnavigationevent = new onNavigationEvent();
        }
        int i5 = this.onNavigationEvent;
        this.onNavigationEvent = i5 + 1;
        onnavigationevent.onExtraCallbackWithResult = i5;
        onnavigationevent.onNavigationEvent = i2;
        onnavigationevent.IAuthTabCallback = f;
        this.IAuthTabCallbackStub.add(onnavigationevent);
        this.onTransact += i2;
        while (true) {
            int i6 = this.onTransact;
            int i7 = this.onExtraCallbackWithResult;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            onNavigationEvent onnavigationevent2 = this.IAuthTabCallbackStub.get(0);
            int i9 = onnavigationevent2.onNavigationEvent;
            if (i9 <= i8) {
                this.onTransact -= i9;
                this.IAuthTabCallbackStub.remove(0);
                int i10 = this.asInterface;
                if (i10 < 5) {
                    onNavigationEvent[] onnavigationeventArr2 = this.IAuthTabCallbackDefault;
                    this.asInterface = i10 + 1;
                    onnavigationeventArr2[i10] = onnavigationevent2;
                }
            } else {
                onnavigationevent2.onNavigationEvent = i9 - i8;
                this.onTransact -= i8;
            }
        }
    }

    public float onNavigationEvent(float f) {
        onWarmupCompleted();
        float f2 = this.onTransact;
        int i2 = 0;
        for (int i3 = 0; i3 < this.IAuthTabCallbackStub.size(); i3++) {
            onNavigationEvent onnavigationevent = this.IAuthTabCallbackStub.get(i3);
            i2 += onnavigationevent.onNavigationEvent;
            if (i2 >= f * f2) {
                return onnavigationevent.IAuthTabCallback;
            }
        }
        if (this.IAuthTabCallbackStub.isEmpty()) {
            return Float.NaN;
        }
        return this.IAuthTabCallbackStub.get(r7.size() - 1).IAuthTabCallback;
    }

    private void IAuthTabCallback() {
        if (this.onWarmupCompleted != 1) {
            Collections.sort(this.IAuthTabCallbackStub, IAuthTabCallback);
            this.onWarmupCompleted = 1;
        }
    }

    private void onWarmupCompleted() {
        if (this.onWarmupCompleted != 0) {
            Collections.sort(this.IAuthTabCallbackStub, onExtraCallback);
            this.onWarmupCompleted = 0;
        }
    }

    public static class onNavigationEvent {
        public float IAuthTabCallback;
        public int onExtraCallbackWithResult;
        public int onNavigationEvent;

        private onNavigationEvent() {
        }
    }
}
