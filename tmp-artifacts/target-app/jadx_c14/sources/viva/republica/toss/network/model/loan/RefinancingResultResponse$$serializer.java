package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.dj3;
import o.getDynamicHeight;
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
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class RefinancingResultResponse$$serializer implements aeu2<RefinancingResultResponse> {
    private static int IAuthTabCallback = 0;
    public static final RefinancingResultResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        RefinancingResultResponse$$serializer refinancingResultResponse$$serializer = new RefinancingResultResponse$$serializer();
        INSTANCE = refinancingResultResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.RefinancingResultResponse", refinancingResultResponse$$serializer, 18);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("guaranteeOrg", true);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("sortInterestRate", true);
        setanimationsloop.onWarmupCompleted("logoImageUrl", true);
        setanimationsloop.onWarmupCompleted("logoFillImageUrl", true);
        setanimationsloop.onWarmupCompleted("period", true);
        setanimationsloop.onWarmupCompleted("loanProductId", true);
        setanimationsloop.onWarmupCompleted("loanReqNo", true);
        setanimationsloop.onWarmupCompleted("rightBadge", true);
        setanimationsloop.onWarmupCompleted("productName", true);
        setanimationsloop.onWarmupCompleted("requestInformation", true);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("statusName", true);
        setanimationsloop.onWarmupCompleted("bottomInformation", true);
        setanimationsloop.onWarmupCompleted("badges", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private RefinancingResultResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = RefinancingResultResponse.onExtraCallbackWithResult();
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        dj3 dj3Var = dj3.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {oty1Var, oty1Var, getwrigglelayout, getwrigglelayout, dj3Var, sp.IAuthTabCallback(dj3Var), getwrigglelayout, getwrigglelayout, getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(LoanProductBadge$$serializer.INSTANCE), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(BottomInformation$$serializer.INSTANCE), lazyArrOnExtraCallbackWithResult[17].getValue()};
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RefinancingResultResponse refinancingResultResponseM57deserialize = m57deserialize(decoder);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return refinancingResultResponseM57deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final RefinancingResultResponse m57deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        String strAsInterface5;
        float f;
        int i;
        LoanProductBadge loanProductBadge;
        BottomInformation bottomInformation;
        List list;
        long j;
        long j2;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        Float f2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = RefinancingResultResponse.onExtraCallbackWithResult();
        int i6 = 17;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = 0;
            float fOnWarmupCompleted = 0.0f;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            int i7 = 0;
            LoanProductBadge loanProductBadge2 = null;
            BottomInformation bottomInformation2 = null;
            List list2 = null;
            String strAsInterface6 = null;
            int iOnTransact = 0;
            String strAsInterface7 = null;
            String str6 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            Float f3 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            strAsInterface5 = null;
            strAsInterface4 = null;
            strAsInterface3 = null;
            while (z) {
                int i8 = onWarmupCompleted + 69;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i6 = 17;
                    case 0:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                        i6 = 17;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = 17;
                    case 2:
                        i7 |= 4;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 = 17;
                    case 3:
                        i7 |= 8;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 = 17;
                    case 4:
                        i7 |= 16;
                        fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                        i6 = 17;
                    case 5:
                        i7 |= 32;
                        f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, dj3.onWarmupCompleted, f3);
                        i6 = 17;
                    case 6:
                        i7 |= 64;
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i6 = 17;
                    case 7:
                        i7 |= 128;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i6 = 17;
                    case 8:
                        i7 |= 256;
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
                        i6 = 17;
                    case 9:
                        i7 |= 512;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i6 = 17;
                    case 10:
                        i7 |= 1024;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        i6 = 17;
                    case 11:
                        i3 = i7 | 2048;
                        loanProductBadge2 = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, LoanProductBadge$$serializer.INSTANCE, loanProductBadge2);
                        i7 = i3;
                        i6 = 17;
                    case 12:
                        i7 |= 4096;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        i6 = 17;
                    case 13:
                        i3 = i7 | 8192;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        i7 = i3;
                        i6 = 17;
                    case 14:
                        String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
                        i3 = i7 | 16384;
                        int i9 = onExtraCallback + 67;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        str6 = strAsInterface10;
                        i7 = i3;
                        i6 = 17;
                    case 15:
                        i3 = 32768 | i7;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
                        i7 = i3;
                        i6 = 17;
                    case 16:
                        bottomInformation2 = (BottomInformation) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, BottomInformation$$serializer.INSTANCE, bottomInformation2);
                        i4 = 65536;
                        i7 = i4 | i7;
                        i6 = 17;
                    case 17:
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, (jp) lazyArrOnExtraCallbackWithResult[i6].getValue(), list2);
                        i4 = 131072;
                        i7 = i4 | i7;
                        i6 = 17;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            f = fOnWarmupCompleted;
            f2 = f3;
            i = i7;
            loanProductBadge = loanProductBadge2;
            bottomInformation = bottomInformation2;
            list = list2;
            j = jIAuthTabCallbackDefault;
            j2 = jIAuthTabCallbackDefault2;
            str = strAsInterface6;
            i2 = iOnTransact;
            str2 = strAsInterface7;
            str3 = str6;
            str4 = strAsInterface8;
            str5 = strAsInterface9;
        } else {
            int i11 = onExtraCallback + 125;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            long jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
            Float f4 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, dj3.onWarmupCompleted, (Object) null);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            LoanProductBadge loanProductBadge3 = (LoanProductBadge) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, LoanProductBadge$$serializer.INSTANCE, (Object) null);
            String strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            String strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            String strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
            String strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
            f = fOnWarmupCompleted2;
            i = 262143;
            loanProductBadge = loanProductBadge3;
            bottomInformation = (BottomInformation) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, BottomInformation$$serializer.INSTANCE, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 17, (jp) lazyArrOnExtraCallbackWithResult[17].getValue(), (Object) null);
            j = jIAuthTabCallbackDefault3;
            j2 = jIAuthTabCallbackDefault4;
            str = strAsInterface11;
            i2 = iOnTransact2;
            str2 = strAsInterface15;
            str3 = strAsInterface14;
            str4 = strAsInterface13;
            str5 = strAsInterface12;
            f2 = f4;
        }
        String str7 = strAsInterface;
        String str8 = strAsInterface4;
        String str9 = strAsInterface3;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RefinancingResultResponse(i, j, j2, str7, strAsInterface2, f, f2, str9, str8, i2, str, strAsInterface5, loanProductBadge, str5, str4, str3, str2, bottomInformation, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RefinancingResultResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RefinancingResultResponse refinancingResultResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(refinancingResultResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RefinancingResultResponse.onNavigationEvent(refinancingResultResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
