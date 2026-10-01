package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.AssetActivationBannerButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.AssetActivationBannerButtonLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.getWriggleLayout;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetActivationBannerLocal$$serializer implements aeu2<AssetActivationBannerLocal> {
    private static int IAuthTabCallback = 0;
    public static final AssetActivationBannerLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return serialDescriptor;
    }

    static {
        AssetActivationBannerLocal$$serializer assetActivationBannerLocal$$serializer = new AssetActivationBannerLocal$$serializer();
        INSTANCE = assetActivationBannerLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AssetActivationBannerLocal", assetActivationBannerLocal$$serializer, 7);
        setanimationsloop.onWarmupCompleted("categoryType", false);
        setanimationsloop.onWarmupCompleted("leftImage", false);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("rightButtonText", false);
        setanimationsloop.onWarmupCompleted("footerButton", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AssetActivationBannerLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(AssetActivationBannerButtonLocal$$serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetActivationBannerLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextContentLocal textContentLocal;
        HandlerLocal handlerLocal;
        AssetActivationBannerButtonLocal assetActivationBannerButtonLocal;
        TextContentLocal textContentLocal2;
        String str;
        int i;
        TextContentLocal textContentLocal3;
        ImageSourceLocal imageSourceLocal;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        HandlerLocal handlerLocal2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 6;
        int i5 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            TextContentLocal textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, serializerVar, (Object) null);
            AssetActivationBannerButtonLocal assetActivationBannerButtonLocal2 = (AssetActivationBannerButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, AssetActivationBannerButtonLocal$$serializer.INSTANCE, (Object) null);
            textContentLocal2 = textContentLocal4;
            str = str2;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 127;
            assetActivationBannerButtonLocal = assetActivationBannerButtonLocal2;
            textContentLocal3 = textContentLocal5;
            textContentLocal = textContentLocal6;
            imageSourceLocal = imageSourceLocal2;
        } else {
            int i6 = onWarmupCompleted + 9;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            TextContentLocal textContentLocal7 = null;
            TextContentLocal textContentLocal8 = null;
            String str3 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            TextContentLocal textContentLocal9 = null;
            AssetActivationBannerButtonLocal assetActivationBannerButtonLocal3 = null;
            boolean z = true;
            int i8 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i9 = onWarmupCompleted + 115;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        z = false;
                        i4 = 6;
                        i5 = 5;
                    case 0:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i8 |= 1;
                        i4 = 6;
                    case 1:
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i8 |= 2;
                        i4 = 6;
                    case 2:
                        textContentLocal8 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal8);
                        i8 |= 4;
                        i4 = 6;
                    case 3:
                        textContentLocal9 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal9);
                        i8 |= 8;
                        i4 = 6;
                    case 4:
                        textContentLocal7 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TextContentLocal$.serializer.INSTANCE, textContentLocal7);
                        i8 |= 16;
                        int i11 = onNavigationEvent + 23;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        i4 = 6;
                    case 5:
                        assetActivationBannerButtonLocal3 = (AssetActivationBannerButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, AssetActivationBannerButtonLocal$$serializer.INSTANCE, assetActivationBannerButtonLocal3);
                        i8 |= 32;
                    case 6:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i8 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            textContentLocal = textContentLocal7;
            handlerLocal = handlerLocal2;
            assetActivationBannerButtonLocal = assetActivationBannerButtonLocal3;
            textContentLocal2 = textContentLocal8;
            ImageSourceLocal imageSourceLocal4 = imageSourceLocal3;
            str = str3;
            i = i8;
            textContentLocal3 = textContentLocal9;
            imageSourceLocal = imageSourceLocal4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetActivationBannerLocal(i, str, imageSourceLocal, textContentLocal2, textContentLocal3, textContentLocal, assetActivationBannerButtonLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m273deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetActivationBannerLocal assetActivationBannerLocalDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return assetActivationBannerLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetActivationBannerLocal assetActivationBannerLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetActivationBannerLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetActivationBannerLocal.onExtraCallback(assetActivationBannerLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetActivationBannerLocal) obj);
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
