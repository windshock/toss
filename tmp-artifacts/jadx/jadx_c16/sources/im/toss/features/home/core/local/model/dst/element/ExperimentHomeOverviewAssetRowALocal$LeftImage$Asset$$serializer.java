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
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset> {
    public static final ExperimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ExperimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer experimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer = new ExperimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset", experimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer, 4);
        setanimationsloop.onWarmupCompleted("imageSource", false);
        setanimationsloop.onWarmupCompleted("showImageOutline", false);
        setanimationsloop.onWarmupCompleted("imageOutline", true);
        setanimationsloop.onWarmupCompleted("backgroundColor", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ExperimentHomeOverviewAssetRowALocal$LeftImage$Asset$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE), sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset deserialize(@NotNull Decoder decoder) throws Throwable {
        ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline imageOutline;
        ImageSourceLocal imageSourceLocal;
        ColorAttributeLocal colorAttributeLocal;
        boolean z;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Throwable th = null;
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
            int i3 = 0;
            boolean z2 = true;
            ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline imageOutline2 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            ColorAttributeLocal colorAttributeLocal2 = null;
            while (!(!z2)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onNavigationEvent + 113;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    if (i4 % 2 == 0) {
                        throw th;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i6 = i5 + 97;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i3 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i7 = i5 + 91;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 != 0) {
                                if (iOnNavigationEvent != 5) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                                i3 |= 8;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                                i3 |= 8;
                            }
                        } else {
                            imageOutline2 = (ExperimentHomeOverviewAssetRowALocal.LeftImage.ImageOutline) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ExperimentHomeOverviewAssetRowALocal$LeftImage$ImageOutline$$serializer.INSTANCE, imageOutline2);
                            i3 |= 4;
                        }
                    } else {
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i3 |= 1;
                    }
                    th = null;
                } else {
                    z2 = false;
                }
            }
            imageOutline = imageOutline2;
            imageSourceLocal = imageSourceLocal3;
            colorAttributeLocal = colorAttributeLocal2;
            z = zOnExtraCallbackWithResult2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset(i, imageSourceLocal, z, imageOutline, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m367deserialize(Decoder decoder) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset assetDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return assetDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset asset) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(asset, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset.onNavigationEvent(asset, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal.LeftImage.Asset) obj);
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
