package im.toss.features.home.core.local.model;

import im.toss.features.home.core.local.model.AssetOverviewLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal;
import im.toss.features.home.core.local.model.dst.widget.NumericContentLocal$;
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
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewLocal$Header$Default$$serializer implements aeu2<AssetOverviewLocal.Header.Default> {
    public static final AssetOverviewLocal$Header$Default$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AssetOverviewLocal$Header$Default$$serializer assetOverviewLocal$Header$Default$$serializer = new AssetOverviewLocal$Header$Default$$serializer();
        INSTANCE = assetOverviewLocal$Header$Default$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.AssetOverviewLocal.Header.Default", assetOverviewLocal$Header$Default$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 99;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    private AssetOverviewLocal$Header$Default$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(NumericContentLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewLocal.Header.Default deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HandlerLocal handlerLocal;
        NumericContentLocal numericContentLocal;
        String str;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        HandlerLocal handlerLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            NumericContentLocal numericContentLocal2 = (NumericContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, (Object) null);
            str = str2;
            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            numericContentLocal = numericContentLocal2;
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            NumericContentLocal numericContentLocal3 = null;
            String str3 = null;
            ImpressionEventLogLocal impressionEventLogLocal2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 37;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent == 1) {
                        numericContentLocal3 = (NumericContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, NumericContentLocal$.serializer.INSTANCE, numericContentLocal3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i5 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i6 + 119;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        ImpressionEventLogLocal$.serializer serializerVar = ImpressionEventLogLocal$.serializer.INSTANCE;
                        if (i10 != 0) {
                            impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, serializerVar, impressionEventLogLocal2);
                            i5 |= 19;
                        } else {
                            impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, impressionEventLogLocal2);
                            i5 |= 8;
                        }
                    }
                } else {
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                    i5 |= 1;
                }
            }
            i = i5;
            handlerLocal = handlerLocal2;
            numericContentLocal = numericContentLocal3;
            str = str3;
            impressionEventLogLocal = impressionEventLogLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewLocal.Header.Default(i, str, numericContentLocal, handlerLocal, impressionEventLogLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m251deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetOverviewLocal.Header.Default defaultDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return defaultDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewLocal.Header.Default r6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(r6, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewLocal.Header.Default.onExtraCallbackWithResult(r6, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewLocal.Header.Default) obj);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
