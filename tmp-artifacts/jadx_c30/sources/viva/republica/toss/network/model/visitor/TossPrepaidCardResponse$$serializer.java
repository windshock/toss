package viva.republica.toss.network.model.visitor;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.visitor.TossPrepaidCardResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossPrepaidCardResponse$$serializer implements aeu2<TossPrepaidCardResponse> {
    private static int IAuthTabCallback = 1;
    public static final TossPrepaidCardResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TossPrepaidCardResponse$$serializer tossPrepaidCardResponse$$serializer = new TossPrepaidCardResponse$$serializer();
        INSTANCE = tossPrepaidCardResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.visitor.TossPrepaidCardResponse", tossPrepaidCardResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("currentCard", true);
        setanimationsloop.onWarmupCompleted("newCard", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TossPrepaidCardResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossPrepaidCardResponse$TossPrepaidCardModel$$serializer tossPrepaidCardResponse$TossPrepaidCardModel$$serializer = TossPrepaidCardResponse$TossPrepaidCardModel$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(tossPrepaidCardResponse$TossPrepaidCardModel$$serializer), sp.IAuthTabCallback(tossPrepaidCardResponse$TossPrepaidCardModel$$serializer)};
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossPrepaidCardResponse tossPrepaidCardResponseM120deserialize = m120deserialize(decoder);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return tossPrepaidCardResponseM120deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossPrepaidCardResponse m120deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModel;
        TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModel2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TossPrepaidCardResponse$TossPrepaidCardModel$$serializer tossPrepaidCardResponse$TossPrepaidCardModel$$serializer = TossPrepaidCardResponse$TossPrepaidCardModel$$serializer.INSTANCE;
            tossPrepaidCardModel2 = (TossPrepaidCardResponse.TossPrepaidCardModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, tossPrepaidCardResponse$TossPrepaidCardModel$$serializer, (Object) null);
            tossPrepaidCardModel = (TossPrepaidCardResponse.TossPrepaidCardModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, tossPrepaidCardResponse$TossPrepaidCardModel$$serializer, (Object) null);
            i = 3;
        } else {
            TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModel3 = null;
            TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModel4 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback + 35;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    tossPrepaidCardModel3 = (TossPrepaidCardResponse.TossPrepaidCardModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TossPrepaidCardResponse$TossPrepaidCardModel$$serializer.INSTANCE, tossPrepaidCardModel3);
                    i4 |= 2;
                } else {
                    tossPrepaidCardModel4 = (TossPrepaidCardResponse.TossPrepaidCardModel) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TossPrepaidCardResponse$TossPrepaidCardModel$$serializer.INSTANCE, tossPrepaidCardModel4);
                    i4 |= 1;
                    int i7 = onWarmupCompleted + 115;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            tossPrepaidCardModel = tossPrepaidCardModel3;
            tossPrepaidCardModel2 = tossPrepaidCardModel4;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossPrepaidCardResponse(i, tossPrepaidCardModel2, tossPrepaidCardModel, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossPrepaidCardResponse) obj);
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossPrepaidCardResponse tossPrepaidCardResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(tossPrepaidCardResponse, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TossPrepaidCardResponse.onNavigationEvent(tossPrepaidCardResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(tossPrepaidCardResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TossPrepaidCardResponse.onNavigationEvent(tossPrepaidCardResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
