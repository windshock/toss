package o;

import kotlin.Pair;
import kotlin.Unit;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class dv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(ReceiveChannel[] receiveChannelArr, Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                av.onExtraCallback(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    setRead.onWarmupCompleted(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair onWarmupCompleted(Object obj, Object obj2) {
        return getWrite.IAuthTabCallback(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(ReceiveChannel receiveChannel, Throwable th) {
        av.onExtraCallback(receiveChannel, th);
        return Unit.INSTANCE;
    }
}
