package im.toss.core.tuba;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class TriggerInactiveHour$$serializer implements aeu2<TriggerInactiveHour> {
    private static int IAuthTabCallback = 0;
    public static final TriggerInactiveHour$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        TriggerInactiveHour$$serializer triggerInactiveHour$$serializer = new TriggerInactiveHour$$serializer();
        INSTANCE = triggerInactiveHour$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.TriggerInactiveHour", triggerInactiveHour$$serializer, 4);
        setanimationsloop.onWarmupCompleted("startHour", false);
        setanimationsloop.onWarmupCompleted("startMinute", false);
        setanimationsloop.onWarmupCompleted("endHour", false);
        setanimationsloop.onWarmupCompleted("endMinute", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 43;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TriggerInactiveHour$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, getdynamicheight, getdynamicheight};
        int i4 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TriggerInactiveHour deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        int iOnTransact3;
        int iOnTransact4;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = true;
            i = 0;
            iOnTransact2 = 0;
            iOnTransact = 0;
            iOnTransact3 = 0;
            iOnTransact4 = 0;
            while (z) {
                int i5 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i6 = 10 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        int i7 = onExtraCallbackWithResult;
                        int i8 = i7 + 85;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent != 1) {
                            int i10 = i7 + 61;
                            int i11 = i10 % 128;
                            IAuthTabCallback = i11;
                            if (i10 % 2 != 0) {
                                if (iOnNavigationEvent == 2) {
                                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                                    i |= 4;
                                } else {
                                    if (iOnNavigationEvent == 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i12 = i11 + 37;
                                    onExtraCallbackWithResult = i12 % 128;
                                    int i13 = i12 % 2;
                                    iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                                    i |= 8;
                                }
                            } else if (iOnNavigationEvent == 2) {
                                iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                                i |= 4;
                            } else if (iOnNavigationEvent == 3) {
                            }
                        } else {
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i |= 2;
                        }
                    } else {
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i |= 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
        } else {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
            i = 15;
        }
        int i14 = iOnTransact;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TriggerInactiveHour(i, i14, iOnTransact2, iOnTransact3, iOnTransact4, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m93deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TriggerInactiveHour triggerInactiveHourDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return triggerInactiveHourDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TriggerInactiveHour triggerInactiveHour) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(triggerInactiveHour, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TriggerInactiveHour.onNavigationEvent(triggerInactiveHour, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(triggerInactiveHour, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TriggerInactiveHour.onNavigationEvent(triggerInactiveHour, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TriggerInactiveHour) obj);
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
