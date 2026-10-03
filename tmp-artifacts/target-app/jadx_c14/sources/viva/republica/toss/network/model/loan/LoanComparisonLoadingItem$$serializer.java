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
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanComparisonLoadingItem$$serializer implements aeu2<LoanComparisonLoadingItem> {
    private static int IAuthTabCallback = 0;
    public static final LoanComparisonLoadingItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        LoanComparisonLoadingItem$$serializer loanComparisonLoadingItem$$serializer = new LoanComparisonLoadingItem$$serializer();
        INSTANCE = loanComparisonLoadingItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanComparisonLoadingItem", loanComparisonLoadingItem$$serializer, 7);
        setanimationsloop.onWarmupCompleted("loanReqNo", false);
        setanimationsloop.onWarmupCompleted("companyName", false);
        setanimationsloop.onWarmupCompleted("companyLogoUrl", false);
        setanimationsloop.onWarmupCompleted("productName", false);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("amount", true);
        setanimationsloop.onWarmupCompleted("isMortgage", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private LoanComparisonLoadingItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, dj3.onWarmupCompleted, oty1.onExtraCallback, getBgColor.IAuthTabCallback};
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonLoadingItem loanComparisonLoadingItemM39deserialize = m39deserialize(decoder);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return loanComparisonLoadingItemM39deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanComparisonLoadingItem m39deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        float fOnWarmupCompleted;
        long jIAuthTabCallbackDefault;
        boolean zOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface2 = null;
            boolean z = true;
            fOnWarmupCompleted = 0.0f;
            jIAuthTabCallbackDefault = 0;
            i = 0;
            zOnExtraCallbackWithResult = false;
            strAsInterface = null;
            strAsInterface3 = null;
            strAsInterface4 = null;
            while (z) {
                int i5 = onWarmupCompleted + 47;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        i |= 2;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        break;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
                        i |= 32;
                        int i7 = onWarmupCompleted + 97;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 3 % 3;
                            break;
                        }
                        break;
                    case 6:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
        } else {
            int i9 = onNavigationEvent + 29;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 5);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            i = 127;
        }
        String str = strAsInterface;
        int i11 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LoanComparisonLoadingItem(i11, str, strAsInterface2, strAsInterface3, strAsInterface4, fOnWarmupCompleted, jIAuthTabCallbackDefault, zOnExtraCallbackWithResult, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanComparisonLoadingItem) obj);
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanComparisonLoadingItem loanComparisonLoadingItem) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanComparisonLoadingItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanComparisonLoadingItem.onWarmupCompleted(loanComparisonLoadingItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
