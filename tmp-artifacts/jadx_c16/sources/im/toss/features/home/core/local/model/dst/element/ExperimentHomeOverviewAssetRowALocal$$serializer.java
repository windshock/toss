package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Image$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.addExtraInfo;
import o.aeu2;
import o.initParamAnnotation;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentHomeOverviewAssetRowALocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetRowALocal$$serializer experimentHomeOverviewAssetRowALocal$$serializer = new ExperimentHomeOverviewAssetRowALocal$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal", experimentHomeOverviewAssetRowALocal$$serializer, 8);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("leftImage", false);
        setanimationsloop.onWarmupCompleted("badgeImage", false);
        setanimationsloop.onWarmupCompleted("rightButton", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 107;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExperimentHomeOverviewAssetRowALocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImageSourceLocal$Image$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {addExtraInfo.onNavigationEvent, ExperimentHomeOverviewAssetRowALocal$Content$Text$$serializer.INSTANCE, initParamAnnotation.onExtraCallbackWithResult, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), PaddingLocal$$serializer.INSTANCE};
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0098 A[PHI: r0 r2
      0x0098: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r0 r2
      0x003c: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003a, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetRowALocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        ImageSourceLocal.Image image;
        int i;
        SerialDescriptor serialDescriptor2;
        PaddingLocal paddingLocal;
        ExperimentHomeOverviewAssetRowALocal.Content content;
        ButtonLocal buttonLocal;
        HandlerLocal handlerLocal;
        ExperimentHomeOverviewAssetRowALocal.LeftImage leftImage;
        HandlerLocal handlerLocal2;
        ExperimentHomeOverviewAssetRowALocal.Content.Text text;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = 7;
        int i6 = 6;
        ExperimentHomeOverviewAssetRowALocal.LeftImage leftImage2 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i7 = 83 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                ExperimentHomeOverviewAssetRowALocal.Content content2 = (ExperimentHomeOverviewAssetRowALocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, addExtraInfo.onNavigationEvent, (Object) null);
                ExperimentHomeOverviewAssetRowALocal.Content.Text text2 = (ExperimentHomeOverviewAssetRowALocal.Content.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAssetRowALocal$Content$Text$$serializer.INSTANCE, (Object) null);
                ExperimentHomeOverviewAssetRowALocal.LeftImage leftImage3 = (ExperimentHomeOverviewAssetRowALocal.LeftImage) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, initParamAnnotation.onExtraCallbackWithResult, (Object) null);
                image = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Image$.serializer.INSTANCE, (Object) null);
                ButtonLocal buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ButtonLocal$.serializer.INSTANCE, (Object) null);
                setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
                HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setappxversioninworker, (Object) null);
                HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setappxversioninworker, (Object) null);
                PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, PaddingLocal$$serializer.INSTANCE, (Object) null);
                int i8 = onNavigationEvent + 69;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                SerialDescriptor serialDescriptor3 = serialDescriptor;
                i = 255;
                serialDescriptor2 = serialDescriptor3;
                paddingLocal = paddingLocal2;
                content = content2;
                buttonLocal = buttonLocal2;
                handlerLocal = handlerLocal3;
                leftImage = leftImage3;
                handlerLocal2 = handlerLocal4;
                text = text2;
            } else {
                boolean z = true;
                int i10 = 0;
                ImageSourceLocal.Image image2 = null;
                PaddingLocal paddingLocal3 = null;
                HandlerLocal handlerLocal5 = null;
                HandlerLocal handlerLocal6 = null;
                ButtonLocal buttonLocal3 = null;
                ExperimentHomeOverviewAssetRowALocal.Content.Text text3 = null;
                ExperimentHomeOverviewAssetRowALocal.Content content3 = null;
                while (!(!z)) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i2 = 2;
                            i5 = 7;
                            i6 = 6;
                        case 0:
                            content3 = (ExperimentHomeOverviewAssetRowALocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, addExtraInfo.onNavigationEvent, content3);
                            i10 |= 1;
                            text3 = text3;
                            i2 = 2;
                            i5 = 7;
                            i6 = 6;
                        case 1:
                            i10 |= 2;
                            text3 = (ExperimentHomeOverviewAssetRowALocal.Content.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAssetRowALocal$Content$Text$$serializer.INSTANCE, text3);
                            i2 = 2;
                            i5 = 7;
                        case 2:
                            leftImage2 = (ExperimentHomeOverviewAssetRowALocal.LeftImage) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, initParamAnnotation.onExtraCallbackWithResult, leftImage2);
                            i10 |= 4;
                        case 3:
                            image2 = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Image$.serializer.INSTANCE, image2);
                            i10 |= 8;
                        case 4:
                            buttonLocal3 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ButtonLocal$.serializer.INSTANCE, buttonLocal3);
                            i10 |= 16;
                        case 5:
                            handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                            i10 |= 32;
                        case 6:
                            handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                            i10 |= 64;
                        case 7:
                            paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                            i10 |= 128;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                serialDescriptor2 = serialDescriptor;
                i = i10;
                image = image2;
                leftImage = leftImage2;
                paddingLocal = paddingLocal3;
                handlerLocal2 = handlerLocal5;
                handlerLocal = handlerLocal6;
                buttonLocal = buttonLocal3;
                text = text3;
                content = content3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor2);
        return new ExperimentHomeOverviewAssetRowALocal(i, content, text, leftImage, image, buttonLocal, handlerLocal, handlerLocal2, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m364deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetRowALocal experimentHomeOverviewAssetRowALocalDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return experimentHomeOverviewAssetRowALocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal experimentHomeOverviewAssetRowALocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetRowALocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetRowALocal.onNavigationEvent(experimentHomeOverviewAssetRowALocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal) obj);
        int i4 = IAuthTabCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
