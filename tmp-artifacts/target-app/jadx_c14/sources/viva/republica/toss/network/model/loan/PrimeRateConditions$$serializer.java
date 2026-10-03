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
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PrimeRateConditions$$serializer implements aeu2<PrimeRateConditions> {
    private static int IAuthTabCallback = 0;
    public static final PrimeRateConditions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return serialDescriptor;
    }

    static {
        PrimeRateConditions$$serializer primeRateConditions$$serializer = new PrimeRateConditions$$serializer();
        INSTANCE = primeRateConditions$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.PrimeRateConditions", primeRateConditions$$serializer, 6);
        setanimationsloop.onWarmupCompleted("upperText", true);
        setanimationsloop.onWarmupCompleted("lowerText", true);
        setanimationsloop.onWarmupCompleted("isOn", true);
        setanimationsloop.onWarmupCompleted("bottomSheetHeader", true);
        setanimationsloop.onWarmupCompleted("bottomSheetMessage", true);
        setanimationsloop.onWarmupCompleted("primeRate", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 81;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private PrimeRateConditions$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getBgColor.IAuthTabCallback, getwrigglelayout, getwrigglelayout, dj3.onWarmupCompleted};
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PrimeRateConditions primeRateConditionsM55deserialize = m55deserialize(decoder);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return primeRateConditionsM55deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PrimeRateConditions m55deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        boolean zOnExtraCallbackWithResult;
        float fOnWarmupCompleted;
        String str;
        String str2;
        String str3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onWarmupCompleted + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str2 = strAsInterface2;
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 5);
            str3 = strAsInterface4;
            str = strAsInterface5;
            strAsInterface = strAsInterface3;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = 63;
        } else {
            String strAsInterface6 = null;
            float fOnWarmupCompleted2 = 0.0f;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            strAsInterface = null;
            boolean z = true;
            zOnExtraCallbackWithResult = false;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 5;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        int i7 = onWarmupCompleted + 13;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 5;
                    case 2:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i6 |= 4;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 |= 8;
                    case 4:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, i3);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            str = strAsInterface8;
            str2 = strAsInterface6;
            int i9 = i6;
            str3 = strAsInterface7;
            i = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        PrimeRateConditions primeRateConditions = new PrimeRateConditions(i, str2, strAsInterface, zOnExtraCallbackWithResult, str3, str, fOnWarmupCompleted, (okycx) null);
        int i10 = IAuthTabCallback + 89;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return primeRateConditions;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PrimeRateConditions) obj);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PrimeRateConditions primeRateConditions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(primeRateConditions, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PrimeRateConditions.IAuthTabCallback(primeRateConditions, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
