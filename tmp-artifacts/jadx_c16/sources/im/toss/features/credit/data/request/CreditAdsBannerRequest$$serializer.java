package im.toss.features.credit.data.request;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditAdsBannerRequest$$serializer implements aeu2<CreditAdsBannerRequest> {
    private static int IAuthTabCallback = 1;
    public static final CreditAdsBannerRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        CreditAdsBannerRequest$$serializer creditAdsBannerRequest$$serializer = new CreditAdsBannerRequest$$serializer();
        INSTANCE = creditAdsBannerRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.request.CreditAdsBannerRequest", creditAdsBannerRequest$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bannerType", false);
        setanimationsloop.onWarmupCompleted("creditScore", true);
        setanimationsloop.onWarmupCompleted("changedScore", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 17;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditAdsBannerRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditAdsBannerRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Integer num;
        Integer num2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onWarmupCompleted = i3 % 128;
        Integer num3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getdynamicheight, (Object) null);
            str = strAsInterface;
            i = 7;
            num = num4;
        } else {
            String strAsInterface2 = null;
            Integer num5 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onWarmupCompleted + 85;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i8 = i6 + 51;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, num5);
                            i4 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            num5 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, num5);
                            i4 |= 4;
                        }
                    } else {
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num3);
                        i4 |= 2;
                    }
                } else {
                    int i9 = IAuthTabCallback + 119;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
            }
            str = strAsInterface2;
            num = num3;
            num2 = num5;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditAdsBannerRequest(i, str, num, num2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m126deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditAdsBannerRequest creditAdsBannerRequestDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return creditAdsBannerRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditAdsBannerRequest creditAdsBannerRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditAdsBannerRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditAdsBannerRequest.IAuthTabCallback(creditAdsBannerRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditAdsBannerRequest) obj);
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
