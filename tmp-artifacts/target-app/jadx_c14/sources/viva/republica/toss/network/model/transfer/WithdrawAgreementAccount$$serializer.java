package viva.republica.toss.network.model.transfer;

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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class WithdrawAgreementAccount$$serializer implements aeu2<WithdrawAgreementAccount> {
    public static final WithdrawAgreementAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        WithdrawAgreementAccount$$serializer withdrawAgreementAccount$$serializer = new WithdrawAgreementAccount$$serializer();
        INSTANCE = withdrawAgreementAccount$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.WithdrawAgreementAccount", withdrawAgreementAccount$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("bankAccountNo", false);
        setanimationsloop.onWarmupCompleted("agreementSignDoc", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 81;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private WithdrawAgreementAccount$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(SignDoc$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return m128deserialize(decoder);
        }
        m128deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final WithdrawAgreementAccount m128deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        SignDoc signDoc;
        String str;
        int i2;
        int iOnTransact;
        String strAsInterface;
        SignDoc signDoc2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        SignDoc signDoc3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                signDoc2 = (SignDoc) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SignDoc$$serializer.INSTANCE, (Object) null);
                i3 = 13;
            } else {
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                signDoc2 = (SignDoc) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SignDoc$$serializer.INSTANCE, (Object) null);
                i3 = 7;
            }
            int i6 = onExtraCallback + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = iOnTransact;
            signDoc = signDoc2;
            str = strAsInterface;
            i2 = i3;
        } else {
            String strAsInterface2 = null;
            int iOnTransact2 = 0;
            int i8 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onExtraCallbackWithResult;
                    int i10 = i9 + 77;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    if (iOnNavigationEvent == 1) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i12 = i9 + 15;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        signDoc3 = (SignDoc) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SignDoc$$serializer.INSTANCE, signDoc3);
                        i8 |= 4;
                    }
                } else {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                    i8 |= 1;
                }
            }
            i = iOnTransact2;
            signDoc = signDoc3;
            str = strAsInterface2;
            i2 = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WithdrawAgreementAccount(i2, i, str, signDoc, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WithdrawAgreementAccount) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WithdrawAgreementAccount withdrawAgreementAccount) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(withdrawAgreementAccount, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WithdrawAgreementAccount.onNavigationEvent(withdrawAgreementAccount, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
