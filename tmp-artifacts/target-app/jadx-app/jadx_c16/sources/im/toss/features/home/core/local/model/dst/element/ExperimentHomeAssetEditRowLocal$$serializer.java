package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeAssetEditRowLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Image$;
import im.toss.features.home.core.local.model.dst.widget.SwitchLocal;
import im.toss.features.home.core.local.model.dst.widget.SwitchLocal$$serializer;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeAssetEditRowLocal$$serializer implements aeu2<ExperimentHomeAssetEditRowLocal> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentHomeAssetEditRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentHomeAssetEditRowLocal$$serializer experimentHomeAssetEditRowLocal$$serializer = new ExperimentHomeAssetEditRowLocal$$serializer();
        INSTANCE = experimentHomeAssetEditRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeAssetEditRowLocal", experimentHomeAssetEditRowLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2", false);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("badgeImage", false);
        setanimationsloop.onWarmupCompleted("rightSwitch", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 45;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    private ExperimentHomeAssetEditRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImageSourceLocal$Image$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(SwitchLocal$$serializer.INSTANCE);
        ExperimentHomeAssetEditRowLocal$Text$$serializer experimentHomeAssetEditRowLocal$Text$$serializer = ExperimentHomeAssetEditRowLocal$Text$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {experimentHomeAssetEditRowLocal$Text$$serializer, experimentHomeAssetEditRowLocal$Text$$serializer, removeNextStartHandler.onWarmupCompleted, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeAssetEditRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImageSourceLocal.Image image;
        SwitchLocal switchLocal;
        ImageSourceLocal imageSourceLocal;
        ExperimentHomeAssetEditRowLocal.Text text;
        ExperimentHomeAssetEditRowLocal.Text text2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        ImageSourceLocal.Image image2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ExperimentHomeAssetEditRowLocal$Text$$serializer experimentHomeAssetEditRowLocal$Text$$serializer = ExperimentHomeAssetEditRowLocal$Text$$serializer.INSTANCE;
            ExperimentHomeAssetEditRowLocal.Text text3 = (ExperimentHomeAssetEditRowLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, experimentHomeAssetEditRowLocal$Text$$serializer, (Object) null);
            ExperimentHomeAssetEditRowLocal.Text text4 = (ExperimentHomeAssetEditRowLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeAssetEditRowLocal$Text$$serializer, (Object) null);
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, (Object) null);
            ImageSourceLocal.Image image3 = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Image$.serializer.INSTANCE, (Object) null);
            SwitchLocal switchLocal2 = (SwitchLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SwitchLocal$$serializer.INSTANCE, (Object) null);
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 4;
            }
            i = 31;
            text = text4;
            image = image3;
            text2 = text3;
            imageSourceLocal = imageSourceLocal2;
            switchLocal = switchLocal2;
        } else {
            int i7 = 0;
            boolean z2 = true;
            SwitchLocal switchLocal3 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            ExperimentHomeAssetEditRowLocal.Text text5 = null;
            ExperimentHomeAssetEditRowLocal.Text text6 = null;
            while (z2) {
                int i8 = onExtraCallback + 117;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    int i10 = onExtraCallback;
                    int i11 = i10 + 83;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    if (iOnNavigationEvent == 1) {
                        text5 = (ExperimentHomeAssetEditRowLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeAssetEditRowLocal$Text$$serializer.INSTANCE, text5);
                        i7 |= 2;
                        int i13 = onExtraCallback + 109;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i15 = i10 + 69;
                        IAuthTabCallback = i15 % 128;
                        if (i15 % 2 == 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 3) {
                            image2 = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Image$.serializer.INSTANCE, image2);
                            i7 |= 8;
                        } else {
                            int i16 = i10 + 93;
                            int i17 = i16 % 128;
                            IAuthTabCallback = i17;
                            int i18 = i16 % 2;
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i19 = i17 + 49;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            switchLocal3 = (SwitchLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SwitchLocal$$serializer.INSTANCE, switchLocal3);
                            i7 |= 16;
                        }
                    } else {
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i7 |= 4;
                    }
                    z = false;
                } else {
                    text6 = (ExperimentHomeAssetEditRowLocal.Text) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeAssetEditRowLocal$Text$$serializer.INSTANCE, text6);
                    i7 |= 1;
                    z = false;
                }
            }
            i = i7;
            image = image2;
            switchLocal = switchLocal3;
            imageSourceLocal = imageSourceLocal3;
            text = text5;
            text2 = text6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeAssetEditRowLocal(i, text2, text, imageSourceLocal, image, switchLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m347deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeAssetEditRowLocal experimentHomeAssetEditRowLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = IAuthTabCallback + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return experimentHomeAssetEditRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeAssetEditRowLocal experimentHomeAssetEditRowLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(experimentHomeAssetEditRowLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeAssetEditRowLocal.onNavigationEvent(experimentHomeAssetEditRowLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeAssetEditRowLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeAssetEditRowLocal.onNavigationEvent(experimentHomeAssetEditRowLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeAssetEditRowLocal) obj);
        int i4 = IAuthTabCallback + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
