package o;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class HandwritingGestureApi34ExternalSyntheticLambda17 {
    private boolean IAuthTabCallback;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallbackDefault;
    private final ImmutableList<HandwritingGestureApi34ExternalSyntheticLambda16> onExtraCallbackWithResult;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent;
    private final List<HandwritingGestureApi34ExternalSyntheticLambda16> onExtraCallback = new ArrayList();
    private ByteBuffer[] onWarmupCompleted = new ByteBuffer[0];

    public HandwritingGestureApi34ExternalSyntheticLambda17(ImmutableList<HandwritingGestureApi34ExternalSyntheticLambda16> immutableList) {
        this.onExtraCallbackWithResult = immutableList;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.onNavigationEvent = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        this.IAuthTabCallback = false;
    }

    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onExtraCallback(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        if (iAuthTabCallback.equals(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent)) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            HandwritingGestureApi34ExternalSyntheticLambda16 handwritingGestureApi34ExternalSyntheticLambda16 = (HandwritingGestureApi34ExternalSyntheticLambda16) this.onExtraCallbackWithResult.get(i2);
            HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = handwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
            if (handwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback()) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(!iAuthTabCallbackOnExtraCallbackWithResult.equals(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent));
                iAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult;
            }
        }
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        return iAuthTabCallback;
    }

    public void onExtraCallback() {
        this.onExtraCallback.clear();
        this.onNavigationEvent = this.IAuthTabCallbackDefault;
        this.IAuthTabCallback = false;
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            HandwritingGestureApi34ExternalSyntheticLambda16 handwritingGestureApi34ExternalSyntheticLambda16 = (HandwritingGestureApi34ExternalSyntheticLambda16) this.onExtraCallbackWithResult.get(i2);
            handwritingGestureApi34ExternalSyntheticLambda16.onExtraCallback();
            if (handwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback()) {
                this.onExtraCallback.add(handwritingGestureApi34ExternalSyntheticLambda16);
            }
        }
        this.onWarmupCompleted = new ByteBuffer[this.onExtraCallback.size()];
        for (int i3 = 0; i3 <= onTransact(); i3++) {
            this.onWarmupCompleted[i3] = this.onExtraCallback.get(i3).onExtraCallbackWithResult();
        }
    }

    public boolean onWarmupCompleted() {
        return !this.onExtraCallback.isEmpty();
    }

    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        if (!onWarmupCompleted() || this.IAuthTabCallback) {
            return;
        }
        onWarmupCompleted(byteBuffer);
    }

    public ByteBuffer IAuthTabCallback() {
        if (!onWarmupCompleted()) {
            return HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        }
        ByteBuffer byteBuffer = this.onWarmupCompleted[onTransact()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        onWarmupCompleted(HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent);
        return this.onWarmupCompleted[onTransact()];
    }

    public void onNavigationEvent() {
        if (!onWarmupCompleted() || this.IAuthTabCallback) {
            return;
        }
        this.IAuthTabCallback = true;
        this.onExtraCallback.get(0).onNavigationEvent();
    }

    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback && this.onExtraCallback.get(onTransact()).onWarmupCompleted() && !this.onWarmupCompleted[onTransact()].hasRemaining();
    }

    public void asBinder() {
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            HandwritingGestureApi34ExternalSyntheticLambda16 handwritingGestureApi34ExternalSyntheticLambda16 = (HandwritingGestureApi34ExternalSyntheticLambda16) this.onExtraCallbackWithResult.get(i2);
            handwritingGestureApi34ExternalSyntheticLambda16.onExtraCallback();
            handwritingGestureApi34ExternalSyntheticLambda16.onTransact();
        }
        this.onWarmupCompleted = new ByteBuffer[0];
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.onNavigationEvent = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        this.IAuthTabCallback = false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandwritingGestureApi34ExternalSyntheticLambda17)) {
            return false;
        }
        HandwritingGestureApi34ExternalSyntheticLambda17 handwritingGestureApi34ExternalSyntheticLambda17 = (HandwritingGestureApi34ExternalSyntheticLambda17) obj;
        if (this.onExtraCallbackWithResult.size() != handwritingGestureApi34ExternalSyntheticLambda17.onExtraCallbackWithResult.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            if (this.onExtraCallbackWithResult.get(i2) != handwritingGestureApi34ExternalSyntheticLambda17.onExtraCallbackWithResult.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    private void onWarmupCompleted(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i2 = 0; i2 <= onTransact(); i2++) {
                if (!this.onWarmupCompleted[i2].hasRemaining()) {
                    HandwritingGestureApi34ExternalSyntheticLambda16 handwritingGestureApi34ExternalSyntheticLambda16 = this.onExtraCallback.get(i2);
                    if (handwritingGestureApi34ExternalSyntheticLambda16.onWarmupCompleted()) {
                        if (!this.onWarmupCompleted[i2].hasRemaining() && i2 < onTransact()) {
                            this.onExtraCallback.get(i2 + 1).onNavigationEvent();
                        }
                    } else {
                        if (i2 > 0) {
                            byteBuffer2 = this.onWarmupCompleted[i2 - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        handwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(byteBuffer2);
                        this.onWarmupCompleted[i2] = handwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.onWarmupCompleted[i2].hasRemaining();
                    }
                }
            }
        } while (z);
    }

    private int onTransact() {
        return this.onWarmupCompleted.length - 1;
    }
}
