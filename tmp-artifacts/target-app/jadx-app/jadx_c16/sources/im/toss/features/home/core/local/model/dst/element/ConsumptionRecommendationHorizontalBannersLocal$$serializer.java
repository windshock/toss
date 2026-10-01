package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.widget.ConsumptionRecommendationBannerLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.registerExtensionsForFinalExecute;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionRecommendationHorizontalBannersLocal$$serializer implements aeu2<ConsumptionRecommendationHorizontalBannersLocal> {
    private static int IAuthTabCallback = 1;
    public static final ConsumptionRecommendationHorizontalBannersLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ConsumptionRecommendationHorizontalBannersLocal$$serializer consumptionRecommendationHorizontalBannersLocal$$serializer = new ConsumptionRecommendationHorizontalBannersLocal$$serializer();
        INSTANCE = consumptionRecommendationHorizontalBannersLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ConsumptionRecommendationHorizontalBannersLocal", consumptionRecommendationHorizontalBannersLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionRecommendationHorizontalBannersLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        registerExtensionsForFinalExecute registerextensionsforfinalexecute = registerExtensionsForFinalExecute.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {registerextensionsforfinalexecute, registerextensionsforfinalexecute};
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionRecommendationHorizontalBannersLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ConsumptionRecommendationBannerLocal consumptionRecommendationBannerLocal;
        ConsumptionRecommendationBannerLocal consumptionRecommendationBannerLocal2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            consumptionRecommendationBannerLocal2 = null;
            consumptionRecommendationBannerLocal = null;
            boolean z = true;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback + 1;
                    int i5 = i4 % 128;
                    onExtraCallbackWithResult = i5;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i6 = i5 + 35;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            consumptionRecommendationBannerLocal2 = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, registerExtensionsForFinalExecute.IAuthTabCallback, consumptionRecommendationBannerLocal2);
                            i |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            consumptionRecommendationBannerLocal2 = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, registerExtensionsForFinalExecute.IAuthTabCallback, consumptionRecommendationBannerLocal2);
                            i |= 2;
                        }
                    } else {
                        consumptionRecommendationBannerLocal = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, registerExtensionsForFinalExecute.IAuthTabCallback, consumptionRecommendationBannerLocal);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i7 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            registerExtensionsForFinalExecute registerextensionsforfinalexecute = registerExtensionsForFinalExecute.IAuthTabCallback;
            if (i8 != 0) {
                consumptionRecommendationBannerLocal = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, registerextensionsforfinalexecute, (Object) null);
                consumptionRecommendationBannerLocal2 = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, registerextensionsforfinalexecute, (Object) null);
                i = 5;
            } else {
                consumptionRecommendationBannerLocal = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, registerextensionsforfinalexecute, (Object) null);
                consumptionRecommendationBannerLocal2 = (ConsumptionRecommendationBannerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, registerextensionsforfinalexecute, (Object) null);
                i = 3;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionRecommendationHorizontalBannersLocal(i, consumptionRecommendationBannerLocal, consumptionRecommendationBannerLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m324deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionRecommendationHorizontalBannersLocal consumptionRecommendationHorizontalBannersLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return consumptionRecommendationHorizontalBannersLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionRecommendationHorizontalBannersLocal consumptionRecommendationHorizontalBannersLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(consumptionRecommendationHorizontalBannersLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ConsumptionRecommendationHorizontalBannersLocal.IAuthTabCallback(consumptionRecommendationHorizontalBannersLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 47 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(consumptionRecommendationHorizontalBannersLocal, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ConsumptionRecommendationHorizontalBannersLocal.IAuthTabCallback(consumptionRecommendationHorizontalBannersLocal, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionRecommendationHorizontalBannersLocal) obj);
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
