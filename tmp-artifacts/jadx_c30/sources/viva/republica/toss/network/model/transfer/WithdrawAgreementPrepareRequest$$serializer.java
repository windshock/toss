package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.accessgetValueMapcp;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class WithdrawAgreementPrepareRequest$$serializer implements aeu2<WithdrawAgreementPrepareRequest> {
    private static int IAuthTabCallback = 1;
    public static final WithdrawAgreementPrepareRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        WithdrawAgreementPrepareRequest$$serializer withdrawAgreementPrepareRequest$$serializer = new WithdrawAgreementPrepareRequest$$serializer();
        INSTANCE = withdrawAgreementPrepareRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.WithdrawAgreementPrepareRequest", withdrawAgreementPrepareRequest$$serializer, 1);
        setanimationsloop.onWarmupCompleted("agreementType", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 45;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private WithdrawAgreementPrepareRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ?? r4 = new KSerializer[1];
            r4[1] = WithdrawAgreementPrepareRequest.onExtraCallback()[0].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{WithdrawAgreementPrepareRequest.onExtraCallback()[0].getValue()};
        }
        int i3 = onExtraCallback + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        WithdrawAgreementPrepareRequest withdrawAgreementPrepareRequestM111deserialize = m111deserialize(decoder);
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return withdrawAgreementPrepareRequestM111deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final WithdrawAgreementPrepareRequest m111deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        accessgetValueMapcp accessgetvaluemapcp;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = WithdrawAgreementPrepareRequest.onExtraCallback();
        int i2 = 1;
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 77;
            onExtraCallback = i3 % 128;
            accessgetvaluemapcp = (accessgetValueMapcp) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, i3 % 2 != 0 ? (jp) lazyArrOnExtraCallback[0].getValue() : (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
        } else {
            boolean z = true;
            accessgetValueMapcp accessgetvaluemapcp2 = null;
            int i4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallback + 123;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    accessgetvaluemapcp2 = (accessgetValueMapcp) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), accessgetvaluemapcp2);
                    int i6 = IAuthTabCallback + 23;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 1;
                } else {
                    z = false;
                }
            }
            accessgetvaluemapcp = accessgetvaluemapcp2;
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WithdrawAgreementPrepareRequest(i2, accessgetvaluemapcp, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WithdrawAgreementPrepareRequest) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WithdrawAgreementPrepareRequest withdrawAgreementPrepareRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(withdrawAgreementPrepareRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WithdrawAgreementPrepareRequest.IAuthTabCallback(withdrawAgreementPrepareRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
