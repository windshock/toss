package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.DoubleHomeListRowLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal$$serializer;
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
public final /* synthetic */ class DoubleHomeListRowLocal$Container$$serializer implements aeu2<DoubleHomeListRowLocal.Container> {
    public static final DoubleHomeListRowLocal$Container$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        DoubleHomeListRowLocal$Container$$serializer doubleHomeListRowLocal$Container$$serializer = new DoubleHomeListRowLocal$Container$$serializer();
        INSTANCE = doubleHomeListRowLocal$Container$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DoubleHomeListRowLocal.Container", doubleHomeListRowLocal$Container$$serializer, 3);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("homeListRow", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private DoubleHomeListRowLocal$Container$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE), HomeListRowAttributeLocal$$serializer.INSTANCE};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[2] = HomeListRowAttributeLocal$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DoubleHomeListRowLocal.Container deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ImpressionEventLogLocal impressionEventLogLocal;
        String str;
        HomeListRowAttributeLocal homeListRowAttributeLocal;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i3 % 128;
        ImpressionEventLogLocal impressionEventLogLocal2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            impressionEventLogLocal2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ImpressionEventLogLocal impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            HomeListRowAttributeLocal homeListRowAttributeLocal2 = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeListRowAttributeLocal$$serializer.INSTANCE, (Object) null);
            int i4 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i = 7;
            impressionEventLogLocal = impressionEventLogLocal3;
            str = strAsInterface;
            homeListRowAttributeLocal = homeListRowAttributeLocal2;
        } else {
            boolean z = true;
            String strAsInterface2 = null;
            HomeListRowAttributeLocal homeListRowAttributeLocal3 = null;
            int i6 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallbackWithResult + 91;
                    int i8 = i7 % 128;
                    onNavigationEvent = i8;
                    if (i7 % 2 == 0) {
                        if (iOnNavigationEvent == 1) {
                            impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal2);
                            i6 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i8 + 103;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            homeListRowAttributeLocal3 = (HomeListRowAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeListRowAttributeLocal$$serializer.INSTANCE, homeListRowAttributeLocal3);
                            i6 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal2);
                        i6 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i6 |= 1;
                }
            }
            i = i6;
            impressionEventLogLocal = impressionEventLogLocal2;
            str = strAsInterface2;
            homeListRowAttributeLocal = homeListRowAttributeLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DoubleHomeListRowLocal.Container(i, str, impressionEventLogLocal, homeListRowAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m339deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DoubleHomeListRowLocal.Container containerDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return containerDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DoubleHomeListRowLocal.Container container) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(container, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DoubleHomeListRowLocal.Container.onExtraCallbackWithResult(container, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(container, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DoubleHomeListRowLocal.Container.onExtraCallbackWithResult(container, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DoubleHomeListRowLocal.Container) obj);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
