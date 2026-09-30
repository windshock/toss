package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getMinFlingVelocity extends hasFixedSize<byte[]> {
    private final int IAuthTabCallback;
    private LinkedBlockingQueue<byte[]> onExtraCallback;
    private onNavigationEvent onNavigationEvent;

    public getMinFlingVelocity(int i2, @Nullable onNavigationEvent onnavigationevent) {
        super(i2, byte[].class);
        if (onnavigationevent != null) {
            this.onNavigationEvent = onnavigationevent;
            this.IAuthTabCallback = 0;
        } else {
            this.onExtraCallback = new LinkedBlockingQueue<>(i2);
            this.IAuthTabCallback = 1;
        }
    }

    @Override // o.hasFixedSize
    public void onExtraCallbackWithResult(int i2, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull getChildPosition getchildposition) {
        super.onExtraCallbackWithResult(i2, removeonchildattachstatechangelistener, getchildposition);
        int iIAuthTabCallback = IAuthTabCallback();
        for (int i3 = 0; i3 < onNavigationEvent(); i3++) {
            if (this.IAuthTabCallback == 0) {
                this.onNavigationEvent.onWarmupCompleted(new byte[iIAuthTabCallback]);
            } else {
                this.onExtraCallback.offer(new byte[iIAuthTabCallback]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasFixedSize
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NonNull byte[] bArr, boolean z) {
        if (z && bArr.length == IAuthTabCallback()) {
            if (this.IAuthTabCallback == 0) {
                this.onNavigationEvent.onWarmupCompleted(bArr);
            } else {
                this.onExtraCallback.offer(bArr);
            }
        }
    }

    @Override // o.hasFixedSize
    public void onWarmupCompleted() {
        super.onWarmupCompleted();
        if (this.IAuthTabCallback == 1) {
            this.onExtraCallback.clear();
        }
    }
}
