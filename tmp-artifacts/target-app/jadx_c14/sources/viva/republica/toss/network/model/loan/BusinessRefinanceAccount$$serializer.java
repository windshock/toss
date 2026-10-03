package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class BusinessRefinanceAccount$$serializer implements aeu2<BusinessRefinanceAccount> {
    private static int IAuthTabCallback = 0;
    public static final BusinessRefinanceAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return serialDescriptor;
    }

    static {
        BusinessRefinanceAccount$$serializer businessRefinanceAccount$$serializer = new BusinessRefinanceAccount$$serializer();
        INSTANCE = businessRefinanceAccount$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.BusinessRefinanceAccount", businessRefinanceAccount$$serializer, 7);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("loanAmount", false);
        setanimationsloop.onWarmupCompleted("interestRate", false);
        setanimationsloop.onWarmupCompleted("loanName", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("companyLogoUrl", true);
        setanimationsloop.onWarmupCompleted("corporateName", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private BusinessRefinanceAccount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[93];
            oty1 oty1Var = oty1.onExtraCallback;
            kSerializerArr[1] = oty1Var;
            kSerializerArr[0] = oty1Var;
            kSerializerArr[2] = setVideoListener.onWarmupCompleted;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[5] = getwrigglelayout;
            kSerializerArr[42] = getwrigglelayout;
        } else {
            oty1 oty1Var2 = oty1.onExtraCallback;
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{oty1Var2, oty1Var2, setVideoListener.onWarmupCompleted, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BusinessRefinanceAccount businessRefinanceAccountM26deserialize = m26deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return businessRefinanceAccountM26deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final BusinessRefinanceAccount m26deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackDefault2;
        double dIAuthTabCallback;
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault2 = 0;
            boolean z = true;
            dIAuthTabCallback = 0.0d;
            strAsInterface2 = null;
            i = 0;
            strAsInterface3 = null;
            strAsInterface = null;
            strAsInterface4 = null;
            jIAuthTabCallbackDefault = 0;
            while (z) {
                int i4 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i |= 2;
                        continue;
                    case 2:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i |= 4;
                        continue;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        i2 = onWarmupCompleted + 21;
                        onExtraCallbackWithResult = i2 % 128;
                        break;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i |= 16;
                        int i5 = onExtraCallbackWithResult + 65;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            i2 = 5;
                            break;
                        }
                    case 5:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        continue;
                    case 6:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                int i6 = i2 % 2;
            }
        } else {
            int i7 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            i = 127;
        }
        long j = jIAuthTabCallbackDefault;
        int i9 = i;
        String str = strAsInterface;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BusinessRefinanceAccount(i9, j, jIAuthTabCallbackDefault2, dIAuthTabCallback, str, strAsInterface2, strAsInterface3, strAsInterface4, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BusinessRefinanceAccount) obj);
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BusinessRefinanceAccount businessRefinanceAccount) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(businessRefinanceAccount, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BusinessRefinanceAccount.onNavigationEvent(businessRefinanceAccount, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
