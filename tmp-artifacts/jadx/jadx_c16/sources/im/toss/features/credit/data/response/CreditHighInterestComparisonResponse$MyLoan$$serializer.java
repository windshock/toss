package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonResponse$MyLoan$$serializer implements aeu2<CreditHighInterestComparisonResponse.MyLoan> {
    private static int IAuthTabCallback = 1;
    public static final CreditHighInterestComparisonResponse$MyLoan$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditHighInterestComparisonResponse$MyLoan$$serializer creditHighInterestComparisonResponse$MyLoan$$serializer = new CreditHighInterestComparisonResponse$MyLoan$$serializer();
        INSTANCE = creditHighInterestComparisonResponse$MyLoan$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHighInterestComparisonResponse.MyLoan", creditHighInterestComparisonResponse$MyLoan$$serializer, 4);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("interestRate", true);
        setanimationsloop.onWarmupCompleted("contractAmount", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditHighInterestComparisonResponse$MyLoan$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditHighInterestComparisonResponse.MyLoan deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
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
            boolean z = true;
            i = 0;
            strAsInterface = null;
            strAsInterface2 = null;
            strAsInterface3 = null;
            strAsInterface4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onNavigationEvent + 13;
                    int i5 = i4 % 128;
                    IAuthTabCallback = i5;
                    if (i4 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i6 = i5 + 71;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i2 = i5 + 79;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 == 0) {
                                strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                                i |= 69;
                            } else {
                                strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i2 = i5 + 79;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 == 0) {
                            }
                        }
                    } else {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        int i7 = IAuthTabCallback + 85;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                } else {
                    int i9 = IAuthTabCallback + 105;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 / 5;
                    }
                    z = false;
                }
            }
        } else {
            int i11 = IAuthTabCallback + 37;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            i = 15;
        }
        int i13 = i;
        String str = strAsInterface;
        String str2 = strAsInterface2;
        String str3 = strAsInterface3;
        String str4 = strAsInterface4;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHighInterestComparisonResponse.MyLoan(i13, str, str2, str3, str4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m150deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonResponse.MyLoan myLoanDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return myLoanDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHighInterestComparisonResponse.MyLoan myLoan) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(myLoan, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditHighInterestComparisonResponse.MyLoan.onWarmupCompleted(myLoan, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(myLoan, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditHighInterestComparisonResponse.MyLoan.onWarmupCompleted(myLoan, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHighInterestComparisonResponse.MyLoan) obj);
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
