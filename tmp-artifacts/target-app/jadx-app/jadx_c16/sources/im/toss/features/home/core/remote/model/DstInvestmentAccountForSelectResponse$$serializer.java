package im.toss.features.home.core.remote.model;

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
public final /* synthetic */ class DstInvestmentAccountForSelectResponse$$serializer implements aeu2<DstInvestmentAccountForSelectResponse> {
    private static int IAuthTabCallback = 0;
    public static final DstInvestmentAccountForSelectResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        DstInvestmentAccountForSelectResponse$$serializer dstInvestmentAccountForSelectResponse$$serializer = new DstInvestmentAccountForSelectResponse$$serializer();
        INSTANCE = dstInvestmentAccountForSelectResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstInvestmentAccountForSelectResponse", dstInvestmentAccountForSelectResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("headerSections", false);
        setanimationsloop.onWarmupCompleted("accounts", false);
        setanimationsloop.onWarmupCompleted("footerSections", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DstInvestmentAccountForSelectResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnExtraCallbackWithResult = DstInvestmentAccountForSelectResponse.onExtraCallbackWithResult();
            ?? r5 = new KSerializer[4];
            r5[1] = lazyArrOnExtraCallbackWithResult[1].getValue();
            r5[0] = lazyArrOnExtraCallbackWithResult[0].getValue();
            r5[5] = lazyArrOnExtraCallbackWithResult[3].getValue();
            kSerializerArr = r5;
        } else {
            Lazy[] lazyArrOnExtraCallbackWithResult2 = DstInvestmentAccountForSelectResponse.onExtraCallbackWithResult();
            kSerializerArr = new KSerializer[]{lazyArrOnExtraCallbackWithResult2[0].getValue(), lazyArrOnExtraCallbackWithResult2[1].getValue(), lazyArrOnExtraCallbackWithResult2[2].getValue()};
        }
        int i3 = onExtraCallback + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DstInvestmentAccountForSelectResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        List list2;
        List list3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = DstInvestmentAccountForSelectResponse.onExtraCallbackWithResult();
        List list4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            List list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            List list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            i = 7;
            list3 = list5;
            list = list6;
        } else {
            int i6 = 0;
            List list7 = null;
            List list8 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 85;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i10 = i7 + 1;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            if (iOnNavigationEvent != 1) {
                                i2 = i7 + 15;
                                onExtraCallback = i2 % 128;
                                if (i2 % 2 != 0) {
                                    if (iOnNavigationEvent != 5) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), list7);
                                    i6 |= 4;
                                } else {
                                    if (iOnNavigationEvent != 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), list7);
                                    i6 |= 4;
                                }
                            } else {
                                list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list4);
                                i6 |= 2;
                            }
                        } else if (iOnNavigationEvent != 1) {
                            i2 = i7 + 15;
                            onExtraCallback = i2 % 128;
                            if (i2 % 2 != 0) {
                            }
                        } else {
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list4);
                            i6 |= 2;
                        }
                    } else {
                        list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list8);
                        i6 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            int i11 = onNavigationEvent + 111;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i = i6;
            list = list4;
            list2 = list7;
            list3 = list8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstInvestmentAccountForSelectResponse(i, list3, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m535deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DstInvestmentAccountForSelectResponse dstInvestmentAccountForSelectResponseDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return dstInvestmentAccountForSelectResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstInvestmentAccountForSelectResponse dstInvestmentAccountForSelectResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dstInvestmentAccountForSelectResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DstInvestmentAccountForSelectResponse.onNavigationEvent(dstInvestmentAccountForSelectResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstInvestmentAccountForSelectResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DstInvestmentAccountForSelectResponse.onNavigationEvent(dstInvestmentAccountForSelectResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstInvestmentAccountForSelectResponse) obj);
        int i4 = onNavigationEvent + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
