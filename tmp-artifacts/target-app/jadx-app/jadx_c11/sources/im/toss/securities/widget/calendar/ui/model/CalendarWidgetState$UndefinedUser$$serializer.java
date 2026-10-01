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
public final /* synthetic */ class CalendarWidgetState$UndefinedUser$$serializer implements aeu2<CalendarWidgetState.UndefinedUser> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CalendarWidgetState$UndefinedUser$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        CalendarWidgetState$UndefinedUser$$serializer calendarWidgetState$UndefinedUser$$serializer = new CalendarWidgetState$UndefinedUser$$serializer();
        INSTANCE = calendarWidgetState$UndefinedUser$$serializer;
        $stable = 8;
        descriptor = new setAnimationsLoop("UndefinedUser", calendarWidgetState$UndefinedUser$$serializer, 0);
        int i = onWarmupCompleted + 61;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CalendarWidgetState$UndefinedUser$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CalendarWidgetState.UndefinedUser deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
            if (iOnNavigationEvent != -1) {
                throw new UnknownFieldException(iOnNavigationEvent);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CalendarWidgetState.UndefinedUser(0, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m37deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CalendarWidgetState.UndefinedUser undefinedUserDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return undefinedUserDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CalendarWidgetState.UndefinedUser undefinedUser) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(undefinedUser, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CalendarWidgetState.UndefinedUser.onExtraCallback(undefinedUser, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CalendarWidgetState.UndefinedUser) obj);
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
