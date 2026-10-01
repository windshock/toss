package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
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

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeLargeBannerResponse$DualColumnContents$$serializer implements aeu2<CreditHomeLargeBannerResponse.DualColumnContents> {
    private static int IAuthTabCallback = 0;
    public static final CreditHomeLargeBannerResponse$DualColumnContents$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditHomeLargeBannerResponse$DualColumnContents$$serializer creditHomeLargeBannerResponse$DualColumnContents$$serializer = new CreditHomeLargeBannerResponse$DualColumnContents$$serializer();
        INSTANCE = creditHomeLargeBannerResponse$DualColumnContents$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeLargeBannerResponse.DualColumnContents", creditHomeLargeBannerResponse$DualColumnContents$$serializer, 4);
        setanimationsloop.onWarmupCompleted("bannerTitle", true);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("changeMessage", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 119;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditHomeLargeBannerResponse$DualColumnContents$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer = CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer), sp.IAuthTabCallback(creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHomeLargeBannerResponse.DualColumnContents deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContent;
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContent2;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContent3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer = CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer.INSTANCE;
            CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContent4 = (CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer, (Object) null);
            columnContent = (CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, creditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer, (Object) null);
            str = strAsInterface;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 15;
            columnContent2 = columnContent4;
        } else {
            int i3 = 0;
            boolean z = true;
            CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent columnContent5 = null;
            String strAsInterface2 = null;
            String str3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i4 = onWarmupCompleted + 63;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 2) {
                        int i7 = i5 + 75;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                            i3 |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                            i3 |= 8;
                        }
                    } else {
                        columnContent3 = (CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer.INSTANCE, columnContent3);
                        i3 |= 4;
                    }
                } else {
                    columnContent5 = (CreditHomeLargeBannerResponse.DualColumnContents.ColumnContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CreditHomeLargeBannerResponse$DualColumnContents$ColumnContent$$serializer.INSTANCE, columnContent5);
                    i3 |= 2;
                    int i8 = onWarmupCompleted + 111;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 2 / 2;
                    }
                }
            }
            i = i3;
            columnContent = columnContent3;
            columnContent2 = columnContent5;
            str = strAsInterface2;
            str2 = str3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHomeLargeBannerResponse.DualColumnContents(i, str, columnContent2, columnContent, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m158deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeLargeBannerResponse.DualColumnContents dualColumnContentsDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return dualColumnContentsDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeLargeBannerResponse.DualColumnContents dualColumnContents) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dualColumnContents, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditHomeLargeBannerResponse.DualColumnContents.onExtraCallback(dualColumnContents, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeLargeBannerResponse.DualColumnContents) obj);
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
