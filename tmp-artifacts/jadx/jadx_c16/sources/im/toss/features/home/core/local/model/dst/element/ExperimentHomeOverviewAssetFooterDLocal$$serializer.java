package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterDLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal;
import im.toss.features.home.core.local.model.dst.property.VerticalPaddingLocal$$serializer;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetFooterDLocal$$serializer implements aeu2<ExperimentHomeOverviewAssetFooterDLocal> {
    private static int IAuthTabCallback = 0;
    public static final ExperimentHomeOverviewAssetFooterDLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetFooterDLocal$$serializer experimentHomeOverviewAssetFooterDLocal$$serializer = new ExperimentHomeOverviewAssetFooterDLocal$$serializer();
        INSTANCE = experimentHomeOverviewAssetFooterDLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterDLocal", experimentHomeOverviewAssetFooterDLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("content1", false);
        setanimationsloop.onWarmupCompleted("content2", false);
        setanimationsloop.onWarmupCompleted("verticalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAssetFooterDLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer experimentHomeOverviewAssetFooterDLocal$Content$$serializer = ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {experimentHomeOverviewAssetFooterDLocal$Content$$serializer, experimentHomeOverviewAssetFooterDLocal$Content$$serializer, VerticalPaddingLocal$$serializer.INSTANCE};
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewAssetFooterDLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        VerticalPaddingLocal verticalPaddingLocal;
        ExperimentHomeOverviewAssetFooterDLocal.Content content;
        int i;
        ExperimentHomeOverviewAssetFooterDLocal.Content content2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        ExperimentHomeOverviewAssetFooterDLocal.Content content3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            content3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer experimentHomeOverviewAssetFooterDLocal$Content$$serializer = ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer.INSTANCE;
            ExperimentHomeOverviewAssetFooterDLocal.Content content4 = (ExperimentHomeOverviewAssetFooterDLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, experimentHomeOverviewAssetFooterDLocal$Content$$serializer, (Object) null);
            ExperimentHomeOverviewAssetFooterDLocal.Content content5 = (ExperimentHomeOverviewAssetFooterDLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeOverviewAssetFooterDLocal$Content$$serializer, (Object) null);
            verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
            content = content5;
            i = 7;
            content2 = content4;
        } else {
            VerticalPaddingLocal verticalPaddingLocal2 = null;
            ExperimentHomeOverviewAssetFooterDLocal.Content content6 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallbackWithResult + 55;
                    int i8 = i7 % 128;
                    onNavigationEvent = i8;
                    int i9 = i7 % 2;
                    if (iOnNavigationEvent == 1) {
                        content3 = (ExperimentHomeOverviewAssetFooterDLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer.INSTANCE, content3);
                        i6 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = i8 + 61;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        VerticalPaddingLocal$$serializer verticalPaddingLocal$$serializer = VerticalPaddingLocal$$serializer.INSTANCE;
                        if (i11 == 0) {
                            verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, verticalPaddingLocal$$serializer, verticalPaddingLocal2);
                            i6 |= 3;
                        } else {
                            verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, verticalPaddingLocal$$serializer, verticalPaddingLocal2);
                            i6 |= 4;
                        }
                    }
                } else {
                    content6 = (ExperimentHomeOverviewAssetFooterDLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetFooterDLocal$Content$$serializer.INSTANCE, content6);
                    i6 |= 1;
                }
            }
            int i12 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            verticalPaddingLocal = verticalPaddingLocal2;
            content = content3;
            i = i6;
            content2 = content6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetFooterDLocal(i, content2, content, verticalPaddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m360deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetFooterDLocal experimentHomeOverviewAssetFooterDLocalDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return experimentHomeOverviewAssetFooterDLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetFooterDLocal experimentHomeOverviewAssetFooterDLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetFooterDLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAssetFooterDLocal.onExtraCallbackWithResult(experimentHomeOverviewAssetFooterDLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetFooterDLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewAssetFooterDLocal.onExtraCallbackWithResult(experimentHomeOverviewAssetFooterDLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetFooterDLocal) obj);
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
