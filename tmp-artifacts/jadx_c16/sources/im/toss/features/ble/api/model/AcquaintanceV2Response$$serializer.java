package im.toss.features.ble.api.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AcquaintanceV2Response$$serializer implements aeu2<AcquaintanceV2Response> {
    public static final AcquaintanceV2Response$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 81 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AcquaintanceV2Response$$serializer acquaintanceV2Response$$serializer = new AcquaintanceV2Response$$serializer();
        INSTANCE = acquaintanceV2Response$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.ble.api.model.AcquaintanceV2Response", acquaintanceV2Response$$serializer, 5);
        setanimationsloop.onWarmupCompleted("acquaintanceSize", true);
        setanimationsloop.onWarmupCompleted("acquaintances", true);
        setanimationsloop.onWarmupCompleted("cursor", true);
        setanimationsloop.onWarmupCompleted("hasNext", true);
        setanimationsloop.onWarmupCompleted("pageSize", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 95;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AcquaintanceV2Response$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) AcquaintanceV2Response.onExtraCallback()[0].getValue());
            kSerializerArr = new KSerializer[4];
            oty1 oty1Var = oty1.onExtraCallback;
            kSerializerArr[1] = oty1Var;
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[5] = oty1Var;
            kSerializerArr[4] = getBgColor.IAuthTabCallback;
            kSerializerArr[4] = oty1Var;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) AcquaintanceV2Response.onExtraCallback()[1].getValue());
            KSerializer<?> kSerializer = oty1.onExtraCallback;
            kSerializerArr = new KSerializer[]{kSerializer, kSerializerIAuthTabCallback2, kSerializer, getBgColor.IAuthTabCallback, kSerializer};
        }
        int i3 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AcquaintanceV2Response deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        List list;
        long j;
        long jIAuthTabCallbackDefault;
        int i;
        long j2;
        char c;
        char c2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = AcquaintanceV2Response.onExtraCallback();
        List list2 = null;
        char c3 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            List list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            list = list3;
            j = jIAuthTabCallbackDefault3;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            i = 31;
            j2 = jIAuthTabCallbackDefault2;
        } else {
            long jIAuthTabCallbackDefault4 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int i7 = 0;
            boolean z = true;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent != 0) {
                        int i8 = onExtraCallbackWithResult + 97;
                        int i9 = i8 % 128;
                        onWarmupCompleted = i9;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent == 0) {
                                c2 = 4;
                                c = 3;
                                list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list2);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent == 2) {
                                c = 3;
                                if (iOnNavigationEvent != 3) {
                                    int i10 = i9 + 7;
                                    onExtraCallbackWithResult = i10 % 128;
                                    int i11 = i10 % 2;
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i12 = i9 + 109;
                                    onExtraCallbackWithResult = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                                        i7 |= 53;
                                        c3 = 3;
                                    } else {
                                        jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                                        i7 |= 16;
                                        c3 = 3;
                                    }
                                } else {
                                    c2 = 4;
                                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                                    i7 |= 8;
                                }
                            } else {
                                c2 = 4;
                                c = 3;
                                jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                                i7 |= 4;
                            }
                        } else {
                            if (iOnNavigationEvent == 1) {
                                c2 = 4;
                                c = 3;
                                list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list2);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent == 2) {
                            }
                        }
                    } else {
                        c = c3;
                        c2 = 4;
                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                    }
                    c3 = c;
                } else {
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            list = list2;
            j = jIAuthTabCallbackDefault4;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault5;
            i = i7;
            j2 = jIAuthTabCallbackDefault6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AcquaintanceV2Response(i, j2, list, j, zOnExtraCallbackWithResult, jIAuthTabCallbackDefault, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m100deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AcquaintanceV2Response acquaintanceV2ResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return acquaintanceV2ResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AcquaintanceV2Response acquaintanceV2Response) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(acquaintanceV2Response, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AcquaintanceV2Response.onExtraCallbackWithResult(acquaintanceV2Response, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AcquaintanceV2Response) obj);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
