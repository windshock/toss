package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterCLocal;
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
public final /* synthetic */ class ExperimentHomeOverviewAssetFooterCLocal$$serializer implements aeu2<ExperimentHomeOverviewAssetFooterCLocal> {
    public static final ExperimentHomeOverviewAssetFooterCLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetFooterCLocal$$serializer experimentHomeOverviewAssetFooterCLocal$$serializer = new ExperimentHomeOverviewAssetFooterCLocal$$serializer();
        INSTANCE = experimentHomeOverviewAssetFooterCLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetFooterCLocal", experimentHomeOverviewAssetFooterCLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("content1", false);
        setanimationsloop.onWarmupCompleted("content2", false);
        setanimationsloop.onWarmupCompleted("content3", false);
        setanimationsloop.onWarmupCompleted("content4", false);
        setanimationsloop.onWarmupCompleted("verticalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 83;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }

    private ExperimentHomeOverviewAssetFooterCLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer experimentHomeOverviewAssetFooterCLocal$Content$$serializer = ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {experimentHomeOverviewAssetFooterCLocal$Content$$serializer, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, VerticalPaddingLocal$$serializer.INSTANCE};
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[PHI: r0 r2
      0x0065: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r0 r2
      0x003b: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetFooterCLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int i;
        ExperimentHomeOverviewAssetFooterCLocal.Content content;
        ExperimentHomeOverviewAssetFooterCLocal.Content content2;
        ExperimentHomeOverviewAssetFooterCLocal.Content content3;
        VerticalPaddingLocal verticalPaddingLocal;
        ExperimentHomeOverviewAssetFooterCLocal.Content content4;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = 31;
        int i5 = 1;
        ExperimentHomeOverviewAssetFooterCLocal.Content content5 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i6 = 14 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer experimentHomeOverviewAssetFooterCLocal$Content$$serializer = ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE;
                ExperimentHomeOverviewAssetFooterCLocal.Content content6 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, (Object) null);
                ExperimentHomeOverviewAssetFooterCLocal.Content content7 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, (Object) null);
                ExperimentHomeOverviewAssetFooterCLocal.Content content8 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, (Object) null);
                i = 31;
                content = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, experimentHomeOverviewAssetFooterCLocal$Content$$serializer, (Object) null);
                content2 = content7;
                content3 = content6;
                verticalPaddingLocal = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, VerticalPaddingLocal$$serializer.INSTANCE, (Object) null);
                content4 = content8;
            } else {
                boolean z = true;
                i = 0;
                VerticalPaddingLocal verticalPaddingLocal2 = null;
                ExperimentHomeOverviewAssetFooterCLocal.Content content9 = null;
                ExperimentHomeOverviewAssetFooterCLocal.Content content10 = null;
                ExperimentHomeOverviewAssetFooterCLocal.Content content11 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i7 = onNavigationEvent + 93;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        i5 = i5;
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        int i9 = i5;
                        content11 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE, content11);
                        i |= 1;
                        int i10 = onNavigationEvent + 59;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        i5 = i9;
                    } else if (iOnNavigationEvent != i5) {
                        int i12 = onWarmupCompleted + 103;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 3) {
                            content9 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE, content9);
                            i |= 4;
                            int i13 = onNavigationEvent + i4;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                        } else if (iOnNavigationEvent == 3) {
                            content5 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE, content5);
                            i |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            verticalPaddingLocal2 = (VerticalPaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, VerticalPaddingLocal$$serializer.INSTANCE, verticalPaddingLocal2);
                            i |= 16;
                        }
                        i5 = 1;
                    } else {
                        content10 = (ExperimentHomeOverviewAssetFooterCLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ExperimentHomeOverviewAssetFooterCLocal$Content$$serializer.INSTANCE, content10);
                        i |= 2;
                        i5 = 1;
                    }
                    i4 = 31;
                }
                verticalPaddingLocal = verticalPaddingLocal2;
                content = content5;
                content4 = content9;
                content2 = content10;
                content3 = content11;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetFooterCLocal(i, content3, content2, content4, content, verticalPaddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m358deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetFooterCLocal experimentHomeOverviewAssetFooterCLocalDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return experimentHomeOverviewAssetFooterCLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetFooterCLocal experimentHomeOverviewAssetFooterCLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentHomeOverviewAssetFooterCLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ExperimentHomeOverviewAssetFooterCLocal.onExtraCallbackWithResult(experimentHomeOverviewAssetFooterCLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetFooterCLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
