package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.verifySignatureValue_NoAlgorithmInfo;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Transaction$$serializer implements aeu2<Transaction> {
    private static int IAuthTabCallback = 0;
    public static final Transaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        Transaction$$serializer transaction$$serializer = new Transaction$$serializer();
        INSTANCE = transaction$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.Transaction", transaction$$serializer, 5);
        setanimationsloop.onWarmupCompleted(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID, false);
        setanimationsloop.onWarmupCompleted("transactedAt", false);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("totalCanceledAmount", false);
        setanimationsloop.onWarmupCompleted("storeName", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Transaction$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {oty1Var, getwrigglelayout, oty1Var, oty1Var, getwrigglelayout};
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Transaction transactionM83deserialize = m83deserialize(decoder);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = onExtraCallback + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return transactionM83deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Transaction m83deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        char c;
        char c2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i6 = 1;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            long jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            long jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str = strAsInterface2;
            j = jIAuthTabCallbackDefault3;
            i = 31;
            j2 = jIAuthTabCallbackDefault;
            j3 = jIAuthTabCallbackDefault2;
        } else {
            String strAsInterface3 = null;
            boolean z = true;
            int i7 = 0;
            long jIAuthTabCallbackDefault4 = 0;
            long jIAuthTabCallbackDefault5 = 0;
            long jIAuthTabCallbackDefault6 = 0;
            String strAsInterface4 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent != 0) {
                        int i8 = onExtraCallback;
                        int i9 = i8 + 71;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            if (iOnNavigationEvent != 1) {
                                if (iOnNavigationEvent == 2) {
                                    int i10 = i8 + 61;
                                    onWarmupCompleted = i10 % 128;
                                    int i11 = i10 % 2;
                                    if (iOnNavigationEvent != 3) {
                                        int i12 = i8 + 47;
                                        onWarmupCompleted = i12 % 128;
                                        int i13 = i12 % 2;
                                        if (iOnNavigationEvent != 4) {
                                            throw new UnknownFieldException(iOnNavigationEvent);
                                        }
                                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                        i7 |= 16;
                                        i6 = 1;
                                    } else {
                                        c2 = 4;
                                        jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 3);
                                        i7 |= 8;
                                    }
                                } else {
                                    c2 = 4;
                                    jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                                    i7 |= 4;
                                    int i14 = onExtraCallback + 109;
                                    onWarmupCompleted = i14 % 128;
                                    int i15 = i14 % 2;
                                }
                                i6 = 1;
                            } else {
                                i2 = 1;
                                c = 4;
                                strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                                i7 |= 2;
                            }
                        } else if (iOnNavigationEvent != 1) {
                            if (iOnNavigationEvent == 2) {
                            }
                            i6 = 1;
                        } else {
                            c = 4;
                            i2 = 1;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i7 |= 2;
                        }
                    } else {
                        i2 = i6;
                        c = 4;
                        jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i7 |= 1;
                    }
                    i6 = i2;
                } else {
                    int i16 = i6;
                    int i17 = onExtraCallback + 101;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = i16;
                    z = false;
                }
            }
            strAsInterface = strAsInterface3;
            str = strAsInterface4;
            j = jIAuthTabCallbackDefault6;
            i = i7;
            j2 = jIAuthTabCallbackDefault4;
            j3 = jIAuthTabCallbackDefault5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new Transaction(i, j2, str, j3, j, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (Transaction) obj);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Transaction transaction) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(transaction, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        Transaction.onExtraCallbackWithResult(transaction, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
