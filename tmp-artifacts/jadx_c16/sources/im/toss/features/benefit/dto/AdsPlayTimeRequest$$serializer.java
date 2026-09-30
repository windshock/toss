package im.toss.features.benefit.dto;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdsPlayTimeRequest$$serializer implements aeu2<AdsPlayTimeRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AdsPlayTimeRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 25;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AdsPlayTimeRequest$$serializer adsPlayTimeRequest$$serializer = new AdsPlayTimeRequest$$serializer();
        INSTANCE = adsPlayTimeRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.AdsPlayTimeRequest", adsPlayTimeRequest$$serializer, 10);
        setanimationsloop.onWarmupCompleted("campaignId", false);
        setanimationsloop.onWarmupCompleted("adSetId", false);
        setanimationsloop.onWarmupCompleted("adId", false);
        setanimationsloop.onWarmupCompleted("spaceId", false);
        setanimationsloop.onWarmupCompleted("contractType", false);
        setanimationsloop.onWarmupCompleted("adContentType", false);
        setanimationsloop.onWarmupCompleted("requestId", false);
        setanimationsloop.onWarmupCompleted("duration", false);
        setanimationsloop.onWarmupCompleted("unitPrice", false);
        setanimationsloop.onWarmupCompleted("eventTs", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AdsPlayTimeRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = AdsPlayTimeRequest.onNavigationEvent();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[4].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[5].getValue());
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {oty1Var, oty1Var, oty1Var, oty1Var, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, getwrigglelayout, oty1Var, oty1Var, getwrigglelayout};
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdsPlayTimeRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        long jIAuthTabCallbackDefault;
        String str;
        int i;
        ContractType contractType;
        AdContentType adContentType;
        long jIAuthTabCallbackDefault2;
        long j;
        long j2;
        long jIAuthTabCallbackDefault3;
        long jIAuthTabCallbackDefault4;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = AdsPlayTimeRequest.onNavigationEvent();
        int i4 = 9;
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            ContractType contractType2 = (ContractType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            AdContentType adContentType2 = (AdContentType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            long jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
            long jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 8);
            contractType = contractType2;
            adContentType = adContentType2;
            str = strAsInterface3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            j = jIAuthTabCallbackDefault5;
            j2 = jIAuthTabCallbackDefault6;
            i = 1023;
        } else {
            long jIAuthTabCallbackDefault7 = 0;
            int i5 = 0;
            boolean z = true;
            ContractType contractType3 = null;
            AdContentType adContentType3 = null;
            String strAsInterface4 = null;
            long jIAuthTabCallbackDefault8 = 0;
            long jIAuthTabCallbackDefault9 = 0;
            long jIAuthTabCallbackDefault10 = 0;
            long jIAuthTabCallbackDefault11 = 0;
            long jIAuthTabCallbackDefault12 = 0;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 9;
                    case 0:
                        jIAuthTabCallbackDefault9 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 9;
                    case 1:
                        jIAuthTabCallbackDefault10 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 9;
                    case 2:
                        jIAuthTabCallbackDefault11 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                        i5 |= 4;
                        i2 = IAuthTabCallback + 111;
                        onExtraCallback = i2 % 128;
                        int i6 = i2 % 2;
                        i4 = 9;
                    case 3:
                        jIAuthTabCallbackDefault12 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 9;
                    case 4:
                        contractType3 = (ContractType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), contractType3);
                        i5 |= 16;
                        i2 = onExtraCallback + 61;
                        IAuthTabCallback = i2 % 128;
                        int i62 = i2 % 2;
                        i4 = 9;
                    case 5:
                        adContentType3 = (AdContentType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), adContentType3);
                        i5 |= 32;
                        i4 = 9;
                    case 6:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 9;
                    case 7:
                        jIAuthTabCallbackDefault7 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 9;
                    case 8:
                        jIAuthTabCallbackDefault8 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 9;
                    case 9:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i5 |= 512;
                        i2 = IAuthTabCallback + 71;
                        onExtraCallback = i2 % 128;
                        int i622 = i2 % 2;
                        i4 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            strAsInterface = strAsInterface4;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault11;
            str = strAsInterface2;
            i = i5;
            long j3 = jIAuthTabCallbackDefault10;
            contractType = contractType3;
            adContentType = adContentType3;
            long j4 = jIAuthTabCallbackDefault9;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault12;
            j = jIAuthTabCallbackDefault7;
            j2 = jIAuthTabCallbackDefault8;
            jIAuthTabCallbackDefault3 = j4;
            jIAuthTabCallbackDefault4 = j3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdsPlayTimeRequest(i, jIAuthTabCallbackDefault3, jIAuthTabCallbackDefault4, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, contractType, adContentType, str, j, j2, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m84deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AdsPlayTimeRequest adsPlayTimeRequestDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = IAuthTabCallback + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return adsPlayTimeRequestDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdsPlayTimeRequest adsPlayTimeRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adsPlayTimeRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdsPlayTimeRequest.onExtraCallbackWithResult(adsPlayTimeRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adsPlayTimeRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AdsPlayTimeRequest.onExtraCallbackWithResult(adsPlayTimeRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdsPlayTimeRequest) obj);
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
