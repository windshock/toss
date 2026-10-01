package o;

import kotlin.Unit;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class nGetFD {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(ReceiveChannel receiveChannel, Throwable th) {
        av.onExtraCallback(receiveChannel, th);
        return Unit.INSTANCE;
    }
}
