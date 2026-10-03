package viva.republica.toss.network.model.loan;

import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanAccountResponse$$serializer implements aeu2<LoanAccountResponse> {
    private static int IAuthTabCallback = 1;
    public static final LoanAccountResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        LoanAccountResponse$$serializer loanAccountResponse$$serializer = new LoanAccountResponse$$serializer();
        INSTANCE = loanAccountResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanAccountResponse", loanAccountResponse$$serializer, 15);
        setanimationsloop.onWarmupCompleted("balanceAmount", true);
        setanimationsloop.onWarmupCompleted("limitAmount", true);
        setanimationsloop.onWarmupCompleted("companyName", true);
        setanimationsloop.onWarmupCompleted("accountName", true);
        setanimationsloop.onWarmupCompleted("bankCode", true);
        setanimationsloop.onWarmupCompleted("orgCode", true);
        setanimationsloop.onWarmupCompleted("companyIconFillUrl", true);
        setanimationsloop.onWarmupCompleted("companyIconUrl", true);
        setanimationsloop.onWarmupCompleted("repayMethod", true);
        setanimationsloop.onWarmupCompleted("repayCalculatorMethod", true);
        setanimationsloop.onWarmupCompleted("expiredDate", true);
        setanimationsloop.onWarmupCompleted("period", true);
        setanimationsloop.onWarmupCompleted("accountType", true);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("isOverdraftAccount", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 99;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanAccountResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {oty1Var, oty1Var, getwrigglelayout, getwrigglelayout, getdynamicheight, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getdynamicheight, getwrigglelayout, dj3.onWarmupCompleted, getBgColor.IAuthTabCallback};
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanAccountResponse loanAccountResponseM32deserialize = m32deserialize(decoder);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return loanAccountResponseM32deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final LoanAccountResponse m32deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        boolean zOnExtraCallbackWithResult;
        float fOnWarmupCompleted;
        String str;
        String str2;
        String str3;
        int i;
        long j;
        String str4;
        String str5;
        String str6;
        int i2;
        long j2;
        String str7;
        String str8;
        int i3;
        char c;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 10;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallback + 11;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 11);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 13);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14);
            i3 = 32767;
            str = strAsInterface10;
            str8 = strAsInterface2;
            str2 = strAsInterface9;
            str3 = strAsInterface8;
            str4 = strAsInterface6;
            str5 = strAsInterface5;
            str7 = strAsInterface4;
            strAsInterface = strAsInterface3;
            str6 = strAsInterface7;
            i2 = iOnTransact;
            i = iOnTransact2;
            j2 = jIAuthTabCallbackDefault2;
            j = jIAuthTabCallbackDefault;
        } else {
            int i8 = 14;
            long jIAuthTabCallbackDefault3 = 0;
            float fOnWarmupCompleted2 = 0.0f;
            boolean z = true;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            strAsInterface = null;
            String strAsInterface18 = null;
            long jIAuthTabCallbackDefault4 = 0;
            int i9 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact3 = 0;
            int iOnTransact4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i9 |= 1;
                        i8 = 14;
                        i5 = 10;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        c = 3;
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i9 |= 2;
                        i8 = 14;
                        i5 = 10;
                    case 2:
                        c = 3;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i9 |= 4;
                        i8 = 14;
                        i5 = 10;
                    case 3:
                        c = 3;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i9 |= 8;
                        i8 = 14;
                        i5 = 10;
                    case 4:
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i9 |= 16;
                        i8 = 14;
                        i5 = 10;
                    case 5:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i9 |= 32;
                        i8 = 14;
                        i5 = 10;
                    case 6:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i9 |= 64;
                        i8 = 14;
                        i5 = 10;
                    case 7:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i9 |= 128;
                        int i10 = onExtraCallback + 63;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i8 = 14;
                        i5 = 10;
                    case 8:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i9 |= 256;
                        i8 = 14;
                    case 9:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i9 |= 512;
                        i8 = 14;
                    case 10:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i9 |= 1024;
                        i8 = 14;
                    case 11:
                        iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 11);
                        i9 |= 2048;
                        i8 = 14;
                    case 12:
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        i9 |= 4096;
                        i8 = 14;
                    case 13:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 13);
                        i9 |= 8192;
                    case 14:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8);
                        i9 |= 16384;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            str = strAsInterface11;
            str2 = strAsInterface13;
            str3 = strAsInterface14;
            i = iOnTransact4;
            j = jIAuthTabCallbackDefault4;
            str4 = strAsInterface15;
            str5 = strAsInterface16;
            str6 = strAsInterface18;
            i2 = iOnTransact3;
            j2 = jIAuthTabCallbackDefault3;
            str7 = strAsInterface17;
            str8 = strAsInterface12;
            i3 = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        LoanAccountResponse loanAccountResponse = new LoanAccountResponse(i3, j, j2, str8, strAsInterface, i2, str7, str5, str4, str6, str3, str2, i, str, fOnWarmupCompleted, zOnExtraCallbackWithResult, (okycx) null);
        int i12 = IAuthTabCallback + 59;
        onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 76 / 0;
        }
        return loanAccountResponse;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanAccountResponse) obj);
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanAccountResponse loanAccountResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanAccountResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        LoanAccountResponse.onExtraCallbackWithResult(1157559017, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent, new Object[]{loanAccountResponse, vylVarOnExtraCallback, serialDescriptor}, -1157559015);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
