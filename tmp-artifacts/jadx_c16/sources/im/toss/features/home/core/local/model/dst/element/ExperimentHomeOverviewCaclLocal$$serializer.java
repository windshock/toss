package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewCaclLocal;
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
public final /* synthetic */ class ExperimentHomeOverviewCaclLocal$$serializer implements aeu2<ExperimentHomeOverviewCaclLocal> {
    public static final ExperimentHomeOverviewCaclLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewCaclLocal$$serializer experimentHomeOverviewCaclLocal$$serializer = new ExperimentHomeOverviewCaclLocal$$serializer();
        INSTANCE = experimentHomeOverviewCaclLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewCaclLocal", experimentHomeOverviewCaclLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("content1", false);
        setanimationsloop.onWarmupCompleted("content2", false);
        setanimationsloop.onWarmupCompleted("content3", false);
        setanimationsloop.onWarmupCompleted("content4", false);
        setanimationsloop.onWarmupCompleted("verticalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 125;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 40 / 0;
        }
    }

    private ExperimentHomeOverviewCaclLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewCaclLocal$Content$$serializer experimentHomeOverviewCaclLocal$Content$$serializer = ExperimentHomeOverviewCaclLocal$Content$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer.INSTANCE, experimentHomeOverviewCaclLocal$Content$$serializer, experimentHomeOverviewCaclLocal$Content$$serializer, experimentHomeOverviewCaclLocal$Content$$serializer, VerticalPaddingLocal$$serializer.INSTANCE};
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentHomeOverviewCaclLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ExperimentHomeOverviewCaclLocal.Content content;
        VerticalPaddingLocal verticalPaddingLocal;
        ExperimentHomeOverviewCaclLocal.Content content2;
        ExperimentHomeOverviewCaclLocal.PrimaryContent primaryContent;
        ExperimentHomeOverviewCaclLocal.Content content3;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        char c2 = 4;
        boolean z = false;
        ExperimentHomeOverviewCaclLocal.Content content4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ExperimentHomeOverviewCaclLocal.PrimaryContent primaryContent2 = (ExperimentHomeOverviewCaclLocal.PrimaryContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer.INSTANCE, (Object) null);
            ExperimentHomeOverviewCaclLocal$Content$$serializer experimentHomeOverviewCaclLocal$Content$$serializer = ExperimentHomeOverviewCaclLocal$Content$$serializer.INSTANCE;
            ExperimentHomeOverviewCaclLocal.Content content5 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeOverviewCaclLocal$Content$$serializer, (Object) null);
            ExperimentHomeOverviewCaclLocal.Content content6 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, experimentHomeOverviewCaclLocal$Content$$serializer, (Object) null);
            ExperimentHomeOverviewCaclLocal.Content content7 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, experimentHomeOverviewCaclLocal$Content$$serializer, (Object) null);
            VerticalPaddingLocal verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
            int i3 = onWarmupCompleted + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 31;
            primaryContent = primaryContent2;
            content = content7;
            verticalPaddingLocal = verticalPaddingLocal2;
            content3 = content5;
            content2 = content6;
        } else {
            int i5 = 0;
            boolean z2 = true;
            VerticalPaddingLocal verticalPaddingLocal3 = null;
            ExperimentHomeOverviewCaclLocal.Content content8 = null;
            ExperimentHomeOverviewCaclLocal.PrimaryContent primaryContent3 = null;
            ExperimentHomeOverviewCaclLocal.Content content9 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 7;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i9 = i7 + 83;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            c = 4;
                            content9 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewCaclLocal$Content$$serializer.INSTANCE, content9);
                            i5 |= 2;
                            int i10 = onExtraCallback + 27;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                        } else if (iOnNavigationEvent == 2) {
                            c = 4;
                            content8 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentHomeOverviewCaclLocal$Content$$serializer.INSTANCE, content8);
                            i5 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                            c = 4;
                            content4 = (ExperimentHomeOverviewCaclLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ExperimentHomeOverviewCaclLocal$Content$$serializer.INSTANCE, content4);
                            i5 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i7 + 63;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            VerticalPaddingLocal$$serializer verticalPaddingLocal$$serializer = VerticalPaddingLocal$$serializer.INSTANCE;
                            if (i13 != 0) {
                                i5 |= 102;
                                verticalPaddingLocal3 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, verticalPaddingLocal$$serializer, verticalPaddingLocal3);
                                c = 4;
                            } else {
                                c = 4;
                                i5 |= 16;
                                verticalPaddingLocal3 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, verticalPaddingLocal$$serializer, verticalPaddingLocal3);
                            }
                            int i14 = onExtraCallback + 83;
                            onWarmupCompleted = i14 % 128;
                            int i15 = i14 % 2;
                        }
                        c2 = c;
                        z = false;
                    } else {
                        primaryContent3 = (ExperimentHomeOverviewCaclLocal.PrimaryContent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewCaclLocal$PrimaryContent$$serializer.INSTANCE, primaryContent3);
                        i5 |= 1;
                        c2 = c2;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            i = i5;
            content = content4;
            verticalPaddingLocal = verticalPaddingLocal3;
            content2 = content8;
            primaryContent = primaryContent3;
            content3 = content9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewCaclLocal(i, primaryContent, content3, content2, content, verticalPaddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m371deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExperimentHomeOverviewCaclLocal experimentHomeOverviewCaclLocalDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return experimentHomeOverviewCaclLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewCaclLocal experimentHomeOverviewCaclLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewCaclLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewCaclLocal.IAuthTabCallback(experimentHomeOverviewCaclLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (ExperimentHomeOverviewCaclLocal) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
