package im.toss.features.deadaccount.impl.api.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AffiliateInfoResponse$$serializer implements aeu2<AffiliateInfoResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AffiliateInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AffiliateInfoResponse$$serializer affiliateInfoResponse$$serializer = new AffiliateInfoResponse$$serializer();
        INSTANCE = affiliateInfoResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.deadaccount.impl.api.response.AffiliateInfoResponse", affiliateInfoResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("hasTossBankAccount", true);
        setanimationsloop.onWarmupCompleted("hasTossSecuritiesAccount", true);
        setanimationsloop.onWarmupCompleted("hasTossPoint", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private AffiliateInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[3];
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            kSerializerArr[1] = getbgcolor;
            kSerializerArr[1] = getbgcolor;
            kSerializerArr[2] = getbgcolor;
        } else {
            getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
            kSerializerArr = new KSerializer[]{getbgcolor2, getbgcolor2, getbgcolor2};
        }
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AffiliateInfoResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        boolean zOnExtraCallbackWithResult3;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = 18;
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            } else {
                boolean zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                boolean zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                i2 = 7;
                zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult4;
                zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult5;
            }
            i = i2;
        } else {
            boolean z = true;
            boolean zOnExtraCallbackWithResult6 = false;
            boolean zOnExtraCallbackWithResult7 = false;
            boolean zOnExtraCallbackWithResult8 = false;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = IAuthTabCallback + 39;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        zOnExtraCallbackWithResult8 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i5 |= 3;
                    } else {
                        zOnExtraCallbackWithResult8 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i5 |= 4;
                    }
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult6;
            zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult7;
            zOnExtraCallbackWithResult3 = zOnExtraCallbackWithResult8;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AffiliateInfoResponse(i, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, zOnExtraCallbackWithResult3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m229deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AffiliateInfoResponse affiliateInfoResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return affiliateInfoResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AffiliateInfoResponse affiliateInfoResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(affiliateInfoResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AffiliateInfoResponse.onWarmupCompleted(affiliateInfoResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AffiliateInfoResponse) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        int i3 = 2 / 0;
        return super.typeParametersSerializers();
    }
}
