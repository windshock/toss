package im.toss.core.tuba;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EnumC0061getAntiSpoofingExtension;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class Condition$$serializer implements aeu2<Condition> {
    private static int IAuthTabCallback = 1;
    public static final Condition$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 77 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        Condition$$serializer condition$$serializer = new Condition$$serializer();
        INSTANCE = condition$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tuba.Condition", condition$$serializer, 4);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("schemaId", true);
        setanimationsloop.onWarmupCompleted("logName", true);
        setanimationsloop.onWarmupCompleted("parameterMatch", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 87;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private Condition$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) Condition.onExtraCallbackWithResult()[0].getValue()), sp.IAuthTabCallback(oty1.onExtraCallback), getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(Node$$serializer.INSTANCE)};
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Condition deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension;
        String strAsInterface;
        Node node;
        Long l;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        String strAsInterface2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            Condition.onExtraCallbackWithResult();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = Condition.onExtraCallbackWithResult();
        int i4 = 0;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension2 = (EnumC0061getAntiSpoofingExtension) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            Long l2 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, (Object) null);
            enumC0061getAntiSpoofingExtension = enumC0061getAntiSpoofingExtension2;
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            l = l2;
            node = (Node) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, Node$$serializer.INSTANCE, (Object) null);
            i = 15;
        } else {
            int i5 = 0;
            EnumC0061getAntiSpoofingExtension enumC0061getAntiSpoofingExtension3 = null;
            Node node2 = null;
            Long l3 = null;
            int i6 = 1;
            while ((i6 ^ 1) == 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i6 = i4;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 97;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i10 = i7 + 107;
                        int i11 = i10 % 128;
                        onExtraCallback = i11;
                        int i12 = i10 % 2;
                        if (iOnNavigationEvent != 2) {
                            int i13 = i11 + 45;
                            onNavigationEvent = i13 % 128;
                            if (i13 % 2 == 0) {
                                if (iOnNavigationEvent != 5) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                node2 = (Node) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, Node$$serializer.INSTANCE, node2);
                                i5 |= 8;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                node2 = (Node) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, Node$$serializer.INSTANCE, node2);
                                i5 |= 8;
                            }
                        } else {
                            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                            i5 |= 4;
                        }
                    } else {
                        l3 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l3);
                        i5 |= 2;
                    }
                    i4 = 0;
                } else {
                    enumC0061getAntiSpoofingExtension3 = (EnumC0061getAntiSpoofingExtension) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrOnExtraCallbackWithResult[i4].getValue(), enumC0061getAntiSpoofingExtension3);
                    i5 |= 1;
                }
            }
            enumC0061getAntiSpoofingExtension = enumC0061getAntiSpoofingExtension3;
            strAsInterface = strAsInterface2;
            node = node2;
            l = l3;
            i = i5;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new Condition(i, enumC0061getAntiSpoofingExtension, l, strAsInterface, node, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m89deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Condition condition) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(condition, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Condition.IAuthTabCallback(condition, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Condition) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
