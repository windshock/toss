package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setApTextSize;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer implements aeu2<ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph> {
    private static int IAuthTabCallback = 1;
    public static final ExperimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        ExperimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer experimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer = new ExperimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer();
        INSTANCE = experimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph", experimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer, 4);
        setanimationsloop.onWarmupCompleted("stringBase", false);
        setanimationsloop.onWarmupCompleted("stringComparison", false);
        setanimationsloop.onWarmupCompleted("overColor", false);
        setanimationsloop.onWarmupCompleted("underColor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 1;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ExperimentHomeOverviewAssetRowALocal$LeftImage$Graph$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph.onExtraCallbackWithResult(1590072295, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1590072294);
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {lazyArr[0].getValue(), lazyArr[1].getValue(), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(serializerVar)};
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a7 A[PHI: r0 r2 r3
      0x00a7: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r3v12 kotlin.Lazy[]) = (r3v3 kotlin.Lazy[]), (r3v15 kotlin.Lazy[]) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[PHI: r0 r2 r3
      0x0074: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r3v4 kotlin.Lazy[]) = (r3v3 kotlin.Lazy[]), (r3v15 kotlin.Lazy[]) binds: [B:8:0x0072, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArr;
        ColorAttributeLocal colorAttributeLocal;
        int i;
        ColorAttributeLocal colorAttributeLocal2;
        List list;
        List list2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArr = (Lazy[]) ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph.onExtraCallbackWithResult(1590072295, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1590072294);
            int i5 = 28 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), (Object) null);
                List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
                ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
                ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
                colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
                i = 15;
                colorAttributeLocal2 = colorAttributeLocal3;
                list = list4;
                list2 = list3;
            } else {
                int i6 = 1;
                ColorAttributeLocal colorAttributeLocal4 = null;
                colorAttributeLocal = null;
                List list5 = null;
                List list6 = null;
                i = 0;
                while (i6 != 0) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        i6 = i4;
                    } else if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i7 = IAuthTabCallback;
                            int i8 = i7 + 55;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent != 2) {
                                int i10 = i7 + 43;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i12 = i7 + 75;
                                onExtraCallbackWithResult = i12 % 128;
                                int i13 = i12 % 2;
                                colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal);
                                i |= 8;
                            } else {
                                colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal4);
                                i |= 4;
                            }
                        } else {
                            list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list5);
                            i |= 2;
                        }
                        i4 = 0;
                    } else {
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, (jp) lazyArr[i4].getValue(), list6);
                        i |= 1;
                    }
                }
                colorAttributeLocal2 = colorAttributeLocal4;
                list = list5;
                list2 = list6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArr = (Lazy[]) ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph.onExtraCallbackWithResult(1590072295, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[0], setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1590072294);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph(i, list2, list, colorAttributeLocal2, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m369deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph graphDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return graphDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph graph) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(graph, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph.onNavigationEvent(graph, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(graph, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph.onNavigationEvent(graph, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentHomeOverviewAssetRowALocal.LeftImage.Graph) obj);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
