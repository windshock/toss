package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class WithdrawAgreementPrepareResponseV2$$serializer implements aeu2<WithdrawAgreementPrepareResponseV2> {
    private static int IAuthTabCallback = 1;
    public static final WithdrawAgreementPrepareResponseV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        WithdrawAgreementPrepareResponseV2$$serializer withdrawAgreementPrepareResponseV2$$serializer = new WithdrawAgreementPrepareResponseV2$$serializer();
        INSTANCE = withdrawAgreementPrepareResponseV2$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.WithdrawAgreementPrepareResponseV2", withdrawAgreementPrepareResponseV2$$serializer, 2);
        setanimationsloop.onWarmupCompleted("termIds", true);
        setanimationsloop.onWarmupCompleted("accounts", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 3;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private WithdrawAgreementPrepareResponseV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = WithdrawAgreementPrepareResponseV2.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallbackWithResult[0].getValue(), lazyArrOnExtraCallbackWithResult[1].getValue()};
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return m112deserialize(decoder);
        }
        m112deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final WithdrawAgreementPrepareResponseV2 m112deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = WithdrawAgreementPrepareResponseV2.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            i = 3;
        } else {
            List list3 = null;
            List list4 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int i6 = onNavigationEvent + 119;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 47;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i7 + 51;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list4);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i92 = i7 + 51;
                        IAuthTabCallback = i92 % 128;
                        int i102 = i92 % 2;
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), list4);
                        i5 |= 2;
                    }
                } else {
                    list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list3);
                    i5 |= 1;
                }
            }
            list = list3;
            list2 = list4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WithdrawAgreementPrepareResponseV2(i, list, list2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (WithdrawAgreementPrepareResponseV2) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WithdrawAgreementPrepareResponseV2 withdrawAgreementPrepareResponseV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(withdrawAgreementPrepareResponseV2, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WithdrawAgreementPrepareResponseV2.onWarmupCompleted(withdrawAgreementPrepareResponseV2, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(withdrawAgreementPrepareResponseV2, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WithdrawAgreementPrepareResponseV2.onWarmupCompleted(withdrawAgreementPrepareResponseV2, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
