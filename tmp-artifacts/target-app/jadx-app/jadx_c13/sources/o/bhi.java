package o;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class bhi {
    public static final void onExtraCallbackWithResult(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        if (th != null) {
            cancellationExceptionOnExtraCallbackWithResult = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionOnExtraCallbackWithResult == null) {
                cancellationExceptionOnExtraCallbackWithResult = getUniversalStrategies.onExtraCallbackWithResult("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.onNavigationEvent(cancellationExceptionOnExtraCallbackWithResult);
    }
}
