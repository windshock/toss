package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal.LeftImage.Card> {
    private static int IAuthTabCallback = 1;
    public static final ExperimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer experimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer = new ExperimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal.LeftImage.Card", experimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer, 4);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        setanimationsloop.onWarmupCompleted("showImageOutline", false);
        setanimationsloop.onWarmupCompleted("imageOutline", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 79;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExperimentHomeOverviewAssetRowALocal$LeftImage$Card$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE), sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetRowALocal.LeftImage.Card deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        int i;
        ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline imageOutline;
        ImageSourceLocal imageSourceLocal;
        ColorAttributeLocal colorAttributeLocal;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            imageOutline = (ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE, (Object) null);
            imageSourceLocal = imageSourceLocal2;
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            z = zOnExtraCallbackWithResult;
            i = 15;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline imageOutline2 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            ColorAttributeLocal colorAttributeLocal2 = null;
            int i4 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i4 |= 1;
                        i2 = onExtraCallback + 57;
                    } else if (iOnNavigationEvent != 1) {
                        int i5 = onNavigationEvent + 89;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            if (iOnNavigationEvent == 4) {
                                imageOutline2 = (ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE, imageOutline2);
                                i4 |= 4;
                                i2 = onExtraCallback + 33;
                            } else {
                                if (iOnNavigationEvent == 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                                i4 |= 8;
                            }
                        } else if (iOnNavigationEvent == 2) {
                            imageOutline2 = (ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE, imageOutline2);
                            i4 |= 4;
                            i2 = onExtraCallback + 33;
                        } else if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i4 |= 2;
                    }
                    onNavigationEvent = i2 % 128;
                    int i6 = i2 % 2;
                } else {
                    z2 = false;
                }
            }
            z = zOnExtraCallbackWithResult2;
            i = i4;
            imageOutline = imageOutline2;
            imageSourceLocal = imageSourceLocal3;
            colorAttributeLocal = colorAttributeLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetRowALocal.LeftImage.Card(i, imageSourceLocal, z, imageOutline, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m368deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Card cardDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return cardDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal.LeftImage.Card card) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(card, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAssetRowALocal.LeftImage.Card.IAuthTabCallback(card, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(card, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Card.IAuthTabCallback(card, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal.LeftImage.Card) obj);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
