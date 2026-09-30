package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
public final /* synthetic */ class AccountTransactionLocal$$serializer implements aeu2<AccountTransactionLocal> {
    private static int IAuthTabCallback = 0;
    public static final AccountTransactionLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AccountTransactionLocal$$serializer accountTransactionLocal$$serializer = new AccountTransactionLocal$$serializer();
        INSTANCE = accountTransactionLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AccountTransactionLocal", accountTransactionLocal$$serializer, 6);
        setanimationsloop.onWarmupCompleted("leftText", false);
        setanimationsloop.onWarmupCompleted("centerText1", false);
        setanimationsloop.onWarmupCompleted("centerText2", false);
        setanimationsloop.onWarmupCompleted("rightText1", false);
        setanimationsloop.onWarmupCompleted("rightText2", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AccountTransactionLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[PHI: r0 r2
      0x0078: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0038, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r0 r2
      0x003a: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0038, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccountTransactionLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int i;
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        TextContentLocal textContentLocal3;
        TextContentLocal textContentLocal4;
        HandlerLocal handlerLocal;
        TextContentLocal textContentLocal5;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 41;
        IAuthTabCallback = i4 % 128;
        TextContentLocal textContentLocal6 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i5 = 54 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i6 = onNavigationEvent + 117;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
                TextContentLocal textContentLocal7 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
                TextContentLocal textContentLocal8 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
                TextContentLocal textContentLocal9 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
                TextContentLocal textContentLocal10 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
                i = 63;
                textContentLocal = textContentLocal10;
                textContentLocal2 = textContentLocal8;
                textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, serializerVar, (Object) null);
                textContentLocal4 = textContentLocal9;
                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, (Object) null);
                textContentLocal5 = textContentLocal7;
            } else {
                boolean z = true;
                int i8 = 0;
                HandlerLocal handlerLocal2 = null;
                textContentLocal = null;
                TextContentLocal textContentLocal11 = null;
                TextContentLocal textContentLocal12 = null;
                TextContentLocal textContentLocal13 = null;
                while (z) {
                    int i9 = onNavigationEvent + 117;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % i2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i2 = 2;
                        case 0:
                            textContentLocal13 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal13);
                            i8 |= 1;
                            i2 = 2;
                        case 1:
                            textContentLocal12 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal12);
                            i8 |= 2;
                        case 2:
                            textContentLocal11 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, TextContentLocal$.serializer.INSTANCE, textContentLocal11);
                            i8 |= 4;
                        case 3:
                            textContentLocal = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal);
                            i8 |= 8;
                        case 4:
                            textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                            i8 |= 16;
                        case 5:
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i8 |= 32;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                i = i8;
                textContentLocal3 = textContentLocal6;
                handlerLocal = handlerLocal2;
                textContentLocal4 = textContentLocal11;
                textContentLocal2 = textContentLocal12;
                textContentLocal5 = textContentLocal13;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AccountTransactionLocal(i, textContentLocal5, textContentLocal2, textContentLocal4, textContentLocal, textContentLocal3, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m265deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AccountTransactionLocal accountTransactionLocalDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return accountTransactionLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AccountTransactionLocal accountTransactionLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accountTransactionLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AccountTransactionLocal.onExtraCallbackWithResult(accountTransactionLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AccountTransactionLocal) obj);
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 38 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
