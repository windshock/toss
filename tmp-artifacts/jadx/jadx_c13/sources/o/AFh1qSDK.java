package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1qSDK implements KSerializer<ZonedDateTime> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onWarmupCompleted = 1;
    public static final AFh1qSDK onNavigationEvent = new AFh1qSDK();
    private static final SerialDescriptor onExtraCallback = ujb.onExtraCallbackWithResult("Instant", spv.IAuthTabCallbackStub.onExtraCallback);
    public static final int onExtraCallbackWithResult = 8;

    private AFh1qSDK() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ZonedDateTime zonedDateTimeOnExtraCallback = onExtraCallback(decoder);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return zonedDateTimeOnExtraCallback;
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(encoder, (ZonedDateTime) obj);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = onExtraCallback;
        int i5 = i2 + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        int i = IAuthTabCallback + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    public void onExtraCallback(@NotNull Encoder encoder, @Nullable ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        if (zonedDateTime == null) {
            encoder.onWarmupCompleted();
            return;
        }
        int i4 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        String string = zonedDateTime.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        encoder.onExtraCallbackWithResult(string);
        int i6 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
    }

    public ZonedDateTime onExtraCallback(@NotNull Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(decoder, "");
                ZonedDateTime.parse(decoder.IAuthTabCallback_Parcel());
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(decoder, "");
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(decoder.IAuthTabCallback_Parcel());
            int i3 = IAuthTabCallbackDefault + 95;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 41 / 0;
            }
            return zonedDateTime;
        } catch (Throwable unused) {
            return null;
        }
    }
}
