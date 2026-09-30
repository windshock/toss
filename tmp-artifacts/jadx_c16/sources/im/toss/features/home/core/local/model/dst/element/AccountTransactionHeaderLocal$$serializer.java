package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTransactionHeaderLocal$$serializer implements aeu2<AccountTransactionHeaderLocal> {
    private static int IAuthTabCallback = 0;
    public static final AccountTransactionHeaderLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AccountTransactionHeaderLocal$$serializer accountTransactionHeaderLocal$$serializer = new AccountTransactionHeaderLocal$$serializer();
        INSTANCE = accountTransactionHeaderLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AccountTransactionHeaderLocal", accountTransactionHeaderLocal$$serializer, 1);
        setanimationsloop.onWarmupCompleted("searchHandler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 17;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    private AccountTransactionHeaderLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AccountTransactionHeaderLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setAppxVersionInWorker.onExtraCallback, (Object) null);
        } else {
            HandlerLocal handlerLocal2 = null;
            int i3 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallbackWithResult + 105;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                    i3 = 1;
                } else {
                    int i6 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                }
            }
            handlerLocal = handlerLocal2;
            i2 = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AccountTransactionHeaderLocal(i2, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m264deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AccountTransactionHeaderLocal accountTransactionHeaderLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return accountTransactionHeaderLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AccountTransactionHeaderLocal accountTransactionHeaderLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(accountTransactionHeaderLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AccountTransactionHeaderLocal.onExtraCallbackWithResult(accountTransactionHeaderLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accountTransactionHeaderLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AccountTransactionHeaderLocal.onExtraCallbackWithResult(accountTransactionHeaderLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AccountTransactionHeaderLocal) obj);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
