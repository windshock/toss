package viva.republica.toss.network.model.transfer.periodic;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferModel$InvalidFields$$serializer implements aeu2<PeriodicTransferModel.InvalidFields> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final PeriodicTransferModel$InvalidFields$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        PeriodicTransferModel$InvalidFields$$serializer periodicTransferModel$InvalidFields$$serializer = new PeriodicTransferModel$InvalidFields$$serializer();
        INSTANCE = periodicTransferModel$InvalidFields$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel.InvalidFields", periodicTransferModel$InvalidFields$$serializer, 5);
        setanimationsloop.onWarmupCompleted("depositAccount", true);
        setanimationsloop.onWarmupCompleted("withdrawAccount", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("date", true);
        setanimationsloop.onWarmupCompleted("commonMessage", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 35;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PeriodicTransferModel$InvalidFields$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferModel$InvalidFields$Field$$serializer periodicTransferModel$InvalidFields$Field$$serializer = PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(periodicTransferModel$InvalidFields$Field$$serializer), sp.IAuthTabCallback(periodicTransferModel$InvalidFields$Field$$serializer), sp.IAuthTabCallback(periodicTransferModel$InvalidFields$Field$$serializer), sp.IAuthTabCallback(periodicTransferModel$InvalidFields$Field$$serializer), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        PeriodicTransferModel.InvalidFields invalidFieldsM136deserialize = m136deserialize(decoder);
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return invalidFieldsM136deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PeriodicTransferModel.InvalidFields m136deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PeriodicTransferModel.InvalidFields.Field field;
        PeriodicTransferModel.InvalidFields.Field field2;
        PeriodicTransferModel.InvalidFields.Field field3;
        int i;
        PeriodicTransferModel.InvalidFields.Field field4;
        String str;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 0;
        PeriodicTransferModel.InvalidFields.Field field5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            int i5 = 1;
            String str2 = null;
            field3 = null;
            field2 = null;
            field = null;
            while (i5 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 13;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    if (i6 % 2 == 0) {
                        int i8 = 91 / i4;
                        if (iOnNavigationEvent != 0) {
                            i2 = i7 + 15;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                                field2 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field2);
                                i |= 2;
                            } else {
                                int i9 = i7 + 5;
                                onNavigationEvent = i9 % 128;
                                if (i9 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 5) {
                                    field3 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field3);
                                    i |= 4;
                                    int i10 = IAuthTabCallback + 7;
                                    onNavigationEvent = i10 % 128;
                                    int i11 = i10 % 2;
                                } else if (iOnNavigationEvent == 3) {
                                    field5 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field5);
                                    i |= 8;
                                } else {
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str2);
                                    i |= 16;
                                }
                            }
                            i4 = 0;
                        } else {
                            i4 = 0;
                            field = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field);
                            i |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        i2 = i7 + 15;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 != 0) {
                            field2 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field2);
                            i |= 2;
                        } else {
                            field2 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field2);
                            i |= 2;
                        }
                        i4 = 0;
                    } else {
                        i4 = 0;
                        field = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE, field);
                        i |= 1;
                    }
                } else {
                    i5 = i4;
                }
            }
            str = str2;
            field4 = field5;
        } else {
            PeriodicTransferModel$InvalidFields$Field$$serializer periodicTransferModel$InvalidFields$Field$$serializer = PeriodicTransferModel$InvalidFields$Field$$serializer.INSTANCE;
            field = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, periodicTransferModel$InvalidFields$Field$$serializer, (Object) null);
            field2 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, periodicTransferModel$InvalidFields$Field$$serializer, (Object) null);
            field3 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, periodicTransferModel$InvalidFields$Field$$serializer, (Object) null);
            i = 31;
            field4 = (PeriodicTransferModel.InvalidFields.Field) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, periodicTransferModel$InvalidFields$Field$$serializer, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
        }
        PeriodicTransferModel.InvalidFields.Field field6 = field2;
        PeriodicTransferModel.InvalidFields.Field field7 = field;
        int i12 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PeriodicTransferModel.InvalidFields(i12, field7, field6, field3, field4, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferModel.InvalidFields) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferModel.InvalidFields invalidFields) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(invalidFields, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PeriodicTransferModel.InvalidFields.onNavigationEvent(invalidFields, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(invalidFields, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            PeriodicTransferModel.InvalidFields.onNavigationEvent(invalidFields, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
