package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TeensTransportationTradeUidResponse$$serializer implements aeu2<TeensTransportationTradeUidResponse> {
    private static int IAuthTabCallback = 0;
    public static final TeensTransportationTradeUidResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TeensTransportationTradeUidResponse$$serializer teensTransportationTradeUidResponse$$serializer = new TeensTransportationTradeUidResponse$$serializer();
        INSTANCE = teensTransportationTradeUidResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.TeensTransportationTradeUidResponse", teensTransportationTradeUidResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("tradeUid", false);
        setanimationsloop.onWarmupCompleted("expiredAt", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TeensTransportationTradeUidResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout2;
            kSerializerArr[1] = getwrigglelayout2;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TeensTransportationTradeUidResponse teensTransportationTradeUidResponseM82deserialize = m82deserialize(decoder);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = onNavigationEvent + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return teensTransportationTradeUidResponseM82deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r1 r13
      0x003f: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r13
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TeensTransportationTradeUidResponse m82deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        String strAsInterface2;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 9 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                i = 3;
            } else {
                String strAsInterface3 = null;
                String strAsInterface4 = null;
                boolean z = true;
                int i5 = 0;
                while (z) {
                    int i6 = onExtraCallback + 123;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i7 = 11 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent != 0) {
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i5 |= 1;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent != 0) {
                        }
                    }
                }
                strAsInterface = strAsInterface3;
                strAsInterface2 = strAsInterface4;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TeensTransportationTradeUidResponse(i, strAsInterface, strAsInterface2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TeensTransportationTradeUidResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TeensTransportationTradeUidResponse teensTransportationTradeUidResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(teensTransportationTradeUidResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TeensTransportationTradeUidResponse.IAuthTabCallback(teensTransportationTradeUidResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
