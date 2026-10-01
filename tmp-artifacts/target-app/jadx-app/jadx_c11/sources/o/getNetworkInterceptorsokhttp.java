package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getNetworkInterceptorsokhttp {
    void onExtraCallbackWithResult(@Nullable setByteOrder setbyteorder);

    default void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        onExtraCallbackWithResult(num != null ? setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(num.intValue())) : null);
    }
}
