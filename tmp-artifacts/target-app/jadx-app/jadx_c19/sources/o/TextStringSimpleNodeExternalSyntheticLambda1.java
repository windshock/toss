package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextStringSimpleNodeExternalSyntheticLambda1 {
    public int IAuthTabCallback;
    public int IAuthTabCallbackDefault;
    public int IAuthTabCallbackStub;
    public long access000;
    public int asBinder;
    public int asInterface;
    public int getInterfaceDescriptor;
    public int onExtraCallback;
    public int onExtraCallbackWithResult;
    public int onNavigationEvent;
    public int onTransact;
    public int onWarmupCompleted;

    public void onExtraCallback() {
        synchronized (this) {
        }
    }

    public void onExtraCallbackWithResult(long j) {
        onWarmupCompleted(j, 1);
    }

    private void onWarmupCompleted(long j, int i2) {
        this.access000 += j;
        this.getInterfaceDescriptor += i2;
    }

    public String toString() {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", new Object[]{Integer.valueOf(this.onExtraCallbackWithResult), Integer.valueOf(this.IAuthTabCallback), Integer.valueOf(this.asInterface), Integer.valueOf(this.IAuthTabCallbackStub), Integer.valueOf(this.IAuthTabCallbackDefault), Integer.valueOf(this.onTransact), Integer.valueOf(this.onNavigationEvent), Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(this.asBinder), Integer.valueOf(this.onExtraCallback), Long.valueOf(this.access000), Integer.valueOf(this.getInterfaceDescriptor)});
    }
}
