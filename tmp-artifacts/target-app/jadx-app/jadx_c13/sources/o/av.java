package o;

import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class av {
    public static final void onExtraCallback(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        bhi.onExtraCallbackWithResult(receiveChannel, th);
    }

    public static final <E> Object onExtraCallbackWithResult(@NotNull lt<? super E> ltVar, E e) {
        return setWindowVisibilityChangedListener.onExtraCallbackWithResult(ltVar, e);
    }
}
