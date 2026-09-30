package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.HorizontalScrollableElementLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.widget.RoundButtonAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.RoundButtonAttributeLocal$$serializer;
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
public final /* synthetic */ class HorizontalScrollableElementLocal$Element$RoundButton$$serializer implements aeu2<HorizontalScrollableElementLocal.Element.RoundButton> {
    private static int IAuthTabCallback = 1;
    public static final HorizontalScrollableElementLocal$Element$RoundButton$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HorizontalScrollableElementLocal$Element$RoundButton$$serializer horizontalScrollableElementLocal$Element$RoundButton$$serializer = new HorizontalScrollableElementLocal$Element$RoundButton$$serializer();
        INSTANCE = horizontalScrollableElementLocal$Element$RoundButton$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HorizontalScrollableElementLocal.Element.RoundButton", horizontalScrollableElementLocal$Element$RoundButton$$serializer, 3);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("roundButton", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private HorizontalScrollableElementLocal$Element$RoundButton$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE), RoundButtonAttributeLocal$$serializer.INSTANCE};
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HorizontalScrollableElementLocal.Element.RoundButton deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        ImpressionEventLogLocal impressionEventLogLocal;
        RoundButtonAttributeLocal roundButtonAttributeLocal;
        int i;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
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
            int i4 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ImpressionEventLogLocal impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            roundButtonAttributeLocal = (RoundButtonAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, RoundButtonAttributeLocal$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            i = 7;
            impressionEventLogLocal = impressionEventLogLocal3;
        } else {
            String strAsInterface2 = null;
            RoundButtonAttributeLocal roundButtonAttributeLocal2 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int i7 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 96 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i9 = onWarmupCompleted + 19;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        roundButtonAttributeLocal2 = (RoundButtonAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, RoundButtonAttributeLocal$$serializer.INSTANCE, roundButtonAttributeLocal2);
                        i6 |= 4;
                    } else {
                        impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal2);
                        i6 |= 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            str = strAsInterface2;
            impressionEventLogLocal = impressionEventLogLocal2;
            roundButtonAttributeLocal = roundButtonAttributeLocal2;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HorizontalScrollableElementLocal.Element.RoundButton(i, str, impressionEventLogLocal, roundButtonAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m396deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        HorizontalScrollableElementLocal.Element.RoundButton roundButtonDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return roundButtonDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HorizontalScrollableElementLocal.Element.RoundButton roundButton) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(roundButton, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HorizontalScrollableElementLocal.Element.RoundButton.onExtraCallbackWithResult(roundButton, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HorizontalScrollableElementLocal.Element.RoundButton) obj);
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
