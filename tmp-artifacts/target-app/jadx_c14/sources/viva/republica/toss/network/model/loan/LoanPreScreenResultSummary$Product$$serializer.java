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
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanPreScreenResultSummary;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanPreScreenResultSummary$Product$$serializer implements aeu2<LoanPreScreenResultSummary.Product> {
    private static int IAuthTabCallback = 0;
    public static final LoanPreScreenResultSummary$Product$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        LoanPreScreenResultSummary$Product$$serializer loanPreScreenResultSummary$Product$$serializer = new LoanPreScreenResultSummary$Product$$serializer();
        INSTANCE = loanPreScreenResultSummary$Product$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanPreScreenResultSummary.Product", loanPreScreenResultSummary$Product$$serializer, 8);
        setanimationsloop.onWarmupCompleted("productId", true);
        setanimationsloop.onWarmupCompleted("loanReqNo", true);
        setanimationsloop.onWarmupCompleted("logoImageUrl", true);
        setanimationsloop.onWarmupCompleted("productName", true);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("limitAmount", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("badgeText", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 115;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private LoanPreScreenResultSummary$Product$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, setVideoListener.onWarmupCompleted, oty1.onExtraCallback, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanPreScreenResultSummary.Product productM50deserialize = m50deserialize(decoder);
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return productM50deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanPreScreenResultSummary.Product m50deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        double dIAuthTabCallback;
        long jIAuthTabCallbackDefault;
        String strAsInterface3;
        int i;
        String str2;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 7;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            dIAuthTabCallback = 0.0d;
            jIAuthTabCallbackDefault = 0;
            boolean z = true;
            String str4 = null;
            str = null;
            i = 0;
            strAsInterface3 = null;
            strAsInterface2 = null;
            strAsInterface = null;
            String str5 = null;
            while (z) {
                int i6 = IAuthTabCallback + 87;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i |= 1;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                        i3 = 7;
                        break;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str4);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str2 = str4;
            str3 = str5;
        } else {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            i = 255;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            str3 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LoanPreScreenResultSummary.Product product = new LoanPreScreenResultSummary.Product(i, str3, strAsInterface, str, strAsInterface2, dIAuthTabCallback, jIAuthTabCallbackDefault, strAsInterface3, str2, (okycx) null);
        int i7 = onExtraCallback + 35;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return product;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanPreScreenResultSummary.Product) obj);
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanPreScreenResultSummary.Product product) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(product, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanPreScreenResultSummary.Product.onNavigationEvent(product, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(product, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanPreScreenResultSummary.Product.onNavigationEvent(product, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
