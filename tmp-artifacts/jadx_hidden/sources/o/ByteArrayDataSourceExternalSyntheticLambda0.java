package o;

import o.ExoPlayerImplExternalSyntheticLambda12;

/* loaded from: classes.dex */
public abstract class ByteArrayDataSourceExternalSyntheticLambda0<T extends ExoPlayerImplExternalSyntheticLambda12> {
    protected ReorderingBufferQueueBuffersWithTimestamp onExtraCallback;

    public abstract T onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14<T> exoPlayerImplExternalSyntheticLambda14, byte[] bArr);

    public ByteArrayDataSourceExternalSyntheticLambda0(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
        this.onExtraCallback = reorderingBufferQueueBuffersWithTimestamp;
    }
}
