package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DocumentWalletPollCheckMeta$$serializer implements aeu2<DocumentWalletPollCheckMeta> {
    private static int IAuthTabCallback = 0;
    public static final DocumentWalletPollCheckMeta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        DocumentWalletPollCheckMeta$$serializer documentWalletPollCheckMeta$$serializer = new DocumentWalletPollCheckMeta$$serializer();
        INSTANCE = documentWalletPollCheckMeta$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta", documentWalletPollCheckMeta$$serializer, 3);
        setanimationsloop.onWarmupCompleted("delayMs", true);
        setanimationsloop.onWarmupCompleted("maxRetry", true);
        setanimationsloop.onWarmupCompleted("totalTimeOutMs", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 75;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DocumentWalletPollCheckMeta$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[5];
            oty1 oty1Var = oty1.onExtraCallback;
            kSerializerArr[1] = oty1Var;
            kSerializerArr[0] = oty1Var;
            kSerializerArr[2] = oty1Var;
        } else {
            oty1 oty1Var2 = oty1.onExtraCallback;
            kSerializerArr = new KSerializer[]{oty1Var2, oty1Var2, oty1Var2};
        }
        int i3 = onExtraCallback + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletPollCheckMeta documentWalletPollCheckMetaM13deserialize = m13deserialize(decoder);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return documentWalletPollCheckMetaM13deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DocumentWalletPollCheckMeta m13deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        int i;
        long jIAuthTabCallbackDefault2;
        long jIAuthTabCallbackDefault3;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault4 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            long jIAuthTabCallbackDefault5 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            long jIAuthTabCallbackDefault6 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            int i5 = IAuthTabCallback + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            jIAuthTabCallbackDefault3 = jIAuthTabCallbackDefault6;
            jIAuthTabCallbackDefault2 = jIAuthTabCallbackDefault5;
            jIAuthTabCallbackDefault = jIAuthTabCallbackDefault4;
            i = 7;
        } else {
            jIAuthTabCallbackDefault = 0;
            i = 0;
            boolean z = true;
            jIAuthTabCallbackDefault2 = 0;
            jIAuthTabCallbackDefault3 = 0;
            while (z) {
                int i7 = onExtraCallback + 17;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i9 = onExtraCallback + 111;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
                        i |= 2;
                        int i10 = onExtraCallback + 71;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        jIAuthTabCallbackDefault3 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                        i |= 4;
                    }
                } else {
                    z = false;
                }
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DocumentWalletPollCheckMeta(i, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, jIAuthTabCallbackDefault3, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DocumentWalletPollCheckMeta) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DocumentWalletPollCheckMeta documentWalletPollCheckMeta) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(documentWalletPollCheckMeta, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DocumentWalletPollCheckMeta.onExtraCallback(documentWalletPollCheckMeta, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(documentWalletPollCheckMeta, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DocumentWalletPollCheckMeta.onExtraCallback(documentWalletPollCheckMeta, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
