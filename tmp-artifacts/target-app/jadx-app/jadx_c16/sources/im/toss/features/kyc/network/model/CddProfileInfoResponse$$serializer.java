package im.toss.features.kyc.network.model;

import im.toss.features.kyc.network.model.CddProfileInfoResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
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
public final /* synthetic */ class CddProfileInfoResponse$$serializer implements aeu2<CddProfileInfoResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final CddProfileInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        CddProfileInfoResponse$$serializer cddProfileInfoResponse$$serializer = new CddProfileInfoResponse$$serializer();
        INSTANCE = cddProfileInfoResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.network.model.CddProfileInfoResponse", cddProfileInfoResponse$$serializer, 8);
        setanimationsloop.onWarmupCompleted("companyAddress", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("email", true);
        setanimationsloop.onWarmupCompleted("homeAddress", true);
        setanimationsloop.onWarmupCompleted("industrialClassification", true);
        setanimationsloop.onWarmupCompleted("jobType", true);
        setanimationsloop.onWarmupCompleted("recentCddYn", false);
        setanimationsloop.onWarmupCompleted("industryCodeVersion", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private CddProfileInfoResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(CddProfileInfoResponse$CompanyAddress$$serializer.INSTANCE);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(CddProfileInfoResponse$HomeAddress$$serializer.INSTANCE), sp.IAuthTabCallback(CddProfileInfoResponse$IndustryCodeDescription$$serializer.INSTANCE), sp.IAuthTabCallback(CddProfileInfoResponse$JobTypeDescription$$serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CddProfileInfoResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        CddProfileInfoResponse.IndustryCodeDescription industryCodeDescription;
        CddProfileInfoResponse.JobTypeDescription jobTypeDescription;
        String str2;
        CddProfileInfoResponse.CompanyAddress companyAddress;
        CddProfileInfoResponse.HomeAddress homeAddress;
        Integer num;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        String str3 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 7;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            CddProfileInfoResponse.CompanyAddress companyAddress2 = (CddProfileInfoResponse.CompanyAddress) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CddProfileInfoResponse$CompanyAddress$$serializer.INSTANCE, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            CddProfileInfoResponse.HomeAddress homeAddress2 = (CddProfileInfoResponse.HomeAddress) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CddProfileInfoResponse$HomeAddress$$serializer.INSTANCE, (Object) null);
            CddProfileInfoResponse.IndustryCodeDescription industryCodeDescription2 = (CddProfileInfoResponse.IndustryCodeDescription) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CddProfileInfoResponse$IndustryCodeDescription$$serializer.INSTANCE, (Object) null);
            CddProfileInfoResponse.JobTypeDescription jobTypeDescription2 = (CddProfileInfoResponse.JobTypeDescription) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CddProfileInfoResponse$JobTypeDescription$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getDynamicHeight.onWarmupCompleted, (Object) null);
            companyAddress = companyAddress2;
            i = 255;
            str2 = str4;
            z = zOnExtraCallbackWithResult;
            str = str5;
            jobTypeDescription = jobTypeDescription2;
            homeAddress = homeAddress2;
            industryCodeDescription = industryCodeDescription2;
        } else {
            Integer num2 = null;
            CddProfileInfoResponse.JobTypeDescription jobTypeDescription3 = null;
            String str6 = null;
            CddProfileInfoResponse.CompanyAddress companyAddress3 = null;
            CddProfileInfoResponse.HomeAddress homeAddress3 = null;
            boolean z2 = true;
            int i5 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            CddProfileInfoResponse.IndustryCodeDescription industryCodeDescription3 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i6 = onNavigationEvent + 103;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        i4 = 7;
                        z2 = false;
                    case 0:
                        companyAddress3 = (CddProfileInfoResponse.CompanyAddress) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CddProfileInfoResponse$CompanyAddress$$serializer.INSTANCE, companyAddress3);
                        i5 |= 1;
                        i4 = 7;
                    case 1:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 2;
                        i4 = 7;
                    case 2:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 4;
                        i4 = 7;
                    case 3:
                        homeAddress3 = (CddProfileInfoResponse.HomeAddress) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CddProfileInfoResponse$HomeAddress$$serializer.INSTANCE, homeAddress3);
                        i5 |= 8;
                    case 4:
                        industryCodeDescription3 = (CddProfileInfoResponse.IndustryCodeDescription) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CddProfileInfoResponse$IndustryCodeDescription$$serializer.INSTANCE, industryCodeDescription3);
                        i5 |= 16;
                    case 5:
                        jobTypeDescription3 = (CddProfileInfoResponse.JobTypeDescription) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CddProfileInfoResponse$JobTypeDescription$$serializer.INSTANCE, jobTypeDescription3);
                        i5 |= 32;
                    case 6:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i5 |= 64;
                    case 7:
                        num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getDynamicHeight.onWarmupCompleted, num2);
                        i5 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str3;
            industryCodeDescription = industryCodeDescription3;
            jobTypeDescription = jobTypeDescription3;
            str2 = str6;
            companyAddress = companyAddress3;
            homeAddress = homeAddress3;
            num = num2;
            i = i5;
            z = zOnExtraCallbackWithResult2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CddProfileInfoResponse(i, companyAddress, str2, str, homeAddress, industryCodeDescription, jobTypeDescription, z, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m627deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        CddProfileInfoResponse cddProfileInfoResponseDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return cddProfileInfoResponseDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CddProfileInfoResponse cddProfileInfoResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cddProfileInfoResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CddProfileInfoResponse.onWarmupCompleted(cddProfileInfoResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CddProfileInfoResponse) obj);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
