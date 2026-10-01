package o;

import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r2ExternalSyntheticLambda4 implements KSerializer<List<? extends OverviewItemInfo>> {
    public static final r2ExternalSyntheticLambda4 IAuthTabCallback = new r2ExternalSyntheticLambda4();
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallback = 0;
    private static final KSerializer<List<OverviewItemInfo>> onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static final SerialDescriptor onWarmupCompleted;

    private r2ExternalSyntheticLambda4() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(decoder);
        }
        onNavigationEvent(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(encoder, (List) obj);
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        KSerializer<List<OverviewItemInfo>> kSerializerOnExtraCallback = sp.onExtraCallback(r2ExternalSyntheticLambda5.onExtraCallback);
        onExtraCallbackWithResult = kSerializerOnExtraCallback;
        onWarmupCompleted = kSerializerOnExtraCallback.getDescriptor();
        int i = onNavigationEvent + 109;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = onWarmupCompleted;
        int i5 = i3 + 101;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return serialDescriptor;
    }

    public void IAuthTabCallback(@NotNull Encoder encoder, @NotNull List<? extends OverviewItemInfo> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(list, "");
        onExtraCallbackWithResult.serialize(encoder, list);
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    public List<OverviewItemInfo> onNavigationEvent(@NotNull Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        List<OverviewItemInfo> list = (List) onExtraCallbackWithResult.deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
