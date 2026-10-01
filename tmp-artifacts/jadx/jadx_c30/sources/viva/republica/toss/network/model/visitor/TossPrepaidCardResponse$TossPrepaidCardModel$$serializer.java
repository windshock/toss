package viva.republica.toss.network.model.visitor;

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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.visitor.TossPrepaidCardResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossPrepaidCardResponse$TossPrepaidCardModel$$serializer implements aeu2<TossPrepaidCardResponse.TossPrepaidCardModel> {
    private static int IAuthTabCallback = 1;
    public static final TossPrepaidCardResponse$TossPrepaidCardModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return serialDescriptor;
    }

    static {
        TossPrepaidCardResponse$TossPrepaidCardModel$$serializer tossPrepaidCardResponse$TossPrepaidCardModel$$serializer = new TossPrepaidCardResponse$TossPrepaidCardModel$$serializer();
        INSTANCE = tossPrepaidCardResponse$TossPrepaidCardModel$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.visitor.TossPrepaidCardResponse.TossPrepaidCardModel", tossPrepaidCardResponse$TossPrepaidCardModel$$serializer, 2);
        setanimationsloop.onWarmupCompleted("cardDesign", true);
        setanimationsloop.onWarmupCompleted("transportationCardNumber", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 15;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TossPrepaidCardResponse$TossPrepaidCardModel$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) TossPrepaidCardResponse.TossPrepaidCardModel.onExtraCallback()[0].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModelM121deserialize = m121deserialize(decoder);
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return tossPrepaidCardModelM121deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossPrepaidCardResponse.TossPrepaidCardModel m121deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TossPrepaidCardDesign tossPrepaidCardDesign;
        String str;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = TossPrepaidCardResponse.TossPrepaidCardModel.onExtraCallback();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            tossPrepaidCardDesign = (TossPrepaidCardDesign) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i3 = 0;
            TossPrepaidCardDesign tossPrepaidCardDesign2 = null;
            String str2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback;
                    int i5 = i4 + 79;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        tossPrepaidCardDesign2 = (TossPrepaidCardDesign) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), tossPrepaidCardDesign2);
                        i3 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i6 = i4 + 77;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i3 |= 2;
                        int i8 = IAuthTabCallback + 49;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    z = false;
                }
            }
            tossPrepaidCardDesign = tossPrepaidCardDesign2;
            str = str2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossPrepaidCardResponse.TossPrepaidCardModel(i, tossPrepaidCardDesign, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossPrepaidCardResponse.TossPrepaidCardModel) obj);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossPrepaidCardResponse.TossPrepaidCardModel tossPrepaidCardModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(tossPrepaidCardModel, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossPrepaidCardResponse.TossPrepaidCardModel.onExtraCallback(tossPrepaidCardModel, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
