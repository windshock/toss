package im.toss.features.home.core.local.model;

import im.toss.features.home.core.local.model.AssetOverviewLocal;
import im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.element.AttentionAmountTopLocal$$serializer;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOverviewLocal$Header$AttentionAmountTop$$serializer implements aeu2<AssetOverviewLocal.Header.AttentionAmountTop> {
    private static int IAuthTabCallback = 1;
    public static final AssetOverviewLocal$Header$AttentionAmountTop$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return serialDescriptor;
    }

    static {
        AssetOverviewLocal$Header$AttentionAmountTop$$serializer assetOverviewLocal$Header$AttentionAmountTop$$serializer = new AssetOverviewLocal$Header$AttentionAmountTop$$serializer();
        INSTANCE = assetOverviewLocal$Header$AttentionAmountTop$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.AssetOverviewLocal.Header.AttentionAmountTop", assetOverviewLocal$Header$AttentionAmountTop$$serializer, 3);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("attentionAmountTop", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 55;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AssetOverviewLocal$Header$AttentionAmountTop$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
            KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(AttentionAmountTopLocal$$serializer.INSTANCE);
            kSerializerArr = new KSerializer[3];
            kSerializerArr[1] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
            kSerializerArr[5] = kSerializerIAuthTabCallback3;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE), sp.IAuthTabCallback(AttentionAmountTopLocal$$serializer.INSTANCE)};
        }
        int i3 = onWarmupCompleted + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetOverviewLocal.Header.AttentionAmountTop deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        AttentionAmountTopLocal attentionAmountTopLocal;
        String str;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            attentionAmountTopLocal = (AttentionAmountTopLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AttentionAmountTopLocal$$serializer.INSTANCE, (Object) null);
            str = str2;
            impressionEventLogLocal = impressionEventLogLocal2;
            i = 7;
        } else {
            int i3 = 0;
            boolean z = true;
            AttentionAmountTopLocal attentionAmountTopLocal2 = null;
            String str3 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            while (z) {
                int i4 = IAuthTabCallback + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 47;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = i5 + 113;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        attentionAmountTopLocal2 = (AttentionAmountTopLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, AttentionAmountTopLocal$$serializer.INSTANCE, attentionAmountTopLocal2);
                        i3 |= 3;
                    } else {
                        attentionAmountTopLocal2 = (AttentionAmountTopLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, AttentionAmountTopLocal$$serializer.INSTANCE, attentionAmountTopLocal2);
                        i3 |= 4;
                    }
                } else {
                    impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                    i3 |= 2;
                }
            }
            attentionAmountTopLocal = attentionAmountTopLocal2;
            str = str3;
            impressionEventLogLocal = impressionEventLogLocal3;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOverviewLocal.Header.AttentionAmountTop(i, str, impressionEventLogLocal, attentionAmountTopLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m250deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOverviewLocal.Header.AttentionAmountTop attentionAmountTop) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(attentionAmountTop, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOverviewLocal.Header.AttentionAmountTop.onWarmupCompleted(attentionAmountTop, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOverviewLocal.Header.AttentionAmountTop) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
