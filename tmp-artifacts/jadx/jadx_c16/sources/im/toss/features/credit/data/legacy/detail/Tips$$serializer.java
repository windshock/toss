package im.toss.features.credit.data.legacy.detail;

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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class Tips$$serializer implements aeu2<Tips> {
    private static int IAuthTabCallback = 1;
    public static final Tips$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        Tips$$serializer tips$$serializer = new Tips$$serializer();
        INSTANCE = tips$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.legacy.detail.Tips", tips$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bad", false);
        setanimationsloop.onWarmupCompleted("neutral", false);
        setanimationsloop.onWarmupCompleted("good", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 79;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Tips$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnNavigationEvent = Tips.onNavigationEvent();
            return new KSerializer[]{lazyArrOnNavigationEvent[0].getValue(), lazyArrOnNavigationEvent[1].getValue(), lazyArrOnNavigationEvent[2].getValue()};
        }
        Lazy[] lazyArrOnNavigationEvent2 = Tips.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = lazyArrOnNavigationEvent2[1].getValue();
        kSerializerArr[0] = lazyArrOnNavigationEvent2[0].getValue();
        kSerializerArr[2] = lazyArrOnNavigationEvent2[4].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Tips deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i;
        List list2;
        List list3;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = Tips.onNavigationEvent();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
            i = 7;
            list2 = list4;
            list3 = list5;
        } else {
            int i7 = 0;
            boolean z = true;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            while (z) {
                int i8 = onExtraCallbackWithResult + 93;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i9 = onExtraCallback + 113;
                    int i10 = i9 % 128;
                    onExtraCallbackWithResult = i10;
                    int i11 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i12 = i10 + 59;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        if (iOnNavigationEvent != 1) {
                            int i14 = i10 + 51;
                            onExtraCallback = i14 % 128;
                            if (i14 % 2 == 0) {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), list6);
                                i7 |= 4;
                            } else {
                                if (iOnNavigationEvent != 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), list6);
                                i7 |= 4;
                            }
                        } else {
                            list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list8);
                            i7 |= 2;
                        }
                    } else {
                        list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list7);
                        i7 |= 1;
                        int i15 = onExtraCallback + 107;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                    }
                } else {
                    z = false;
                }
            }
            list = list6;
            i = i7;
            list2 = list7;
            list3 = list8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Tips(i, list2, list3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m115deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Tips tipsDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return tipsDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Tips tips) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tips, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Tips.onWarmupCompleted(tips, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Tips) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
