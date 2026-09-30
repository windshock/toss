package im.toss.securities.widget.calendar.ui.model;

import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class CalendarWidgetState$NetworkError$$serializer implements aeu2<CalendarWidgetState.NetworkError> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CalendarWidgetState$NetworkError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CalendarWidgetState$NetworkError$$serializer calendarWidgetState$NetworkError$$serializer = new CalendarWidgetState$NetworkError$$serializer();
        INSTANCE = calendarWidgetState$NetworkError$$serializer;
        $stable = 8;
        descriptor = new setAnimationsLoop("NetworkError", calendarWidgetState$NetworkError$$serializer, 0);
        int i = onNavigationEvent + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CalendarWidgetState$NetworkError$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        KSerializer<?>[] kSerializerArr = i2 % 2 == 0 ? new KSerializer[1] : new KSerializer[0];
        int i4 = i3 + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r2 == (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        throw new kotlinx.serialization.UnknownFieldException(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r2 == (-1)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CalendarWidgetState.NetworkError deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onWarmupCompleted + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                int i5 = 94 / 0;
            } else {
                iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CalendarWidgetState.NetworkError(0, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m33deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CalendarWidgetState.NetworkError networkErrorDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return networkErrorDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CalendarWidgetState.NetworkError networkError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(networkError, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CalendarWidgetState.NetworkError.onExtraCallback(networkError, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CalendarWidgetState.NetworkError) obj);
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
