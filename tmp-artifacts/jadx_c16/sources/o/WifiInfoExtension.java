package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WifiInfoExtension implements KSerializer<List<? extends onGetWifiList>> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final /* synthetic */ KSerializer<List<onGetWifiList>> $$delegate_0 = sp.onExtraCallback(WifiManagerBridgeExtension.INSTANCE);
    public static final WifiInfoExtension INSTANCE = new WifiInfoExtension();
    public static final int $stable = 8;

    static {
        int i = onNavigationEvent + 47;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor descriptor = this.$$delegate_0.getDescriptor();
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return descriptor;
    }

    public List<onGetWifiList> onExtraCallbackWithResult(@NotNull Decoder decoder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        List<onGetWifiList> list = (List) this.$$delegate_0.deserialize(decoder);
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void onNavigationEvent(@NotNull Encoder encoder, @NotNull List<? extends onGetWifiList> list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.$$delegate_0.serialize(encoder, list);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private WifiInfoExtension() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<onGetWifiList> listOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallbackWithResult;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(encoder, (List) obj);
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
