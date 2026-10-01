package o;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface ReorderingBufferQueueBuffersWithTimestamp {
    byte[] onExtraCallback(int i, InputStream inputStream);

    ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> onExtraCallbackWithResult(InputStream inputStream);

    int onWarmupCompleted(InputStream inputStream);
}
