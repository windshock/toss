package im.toss.features.credit.data.response.membership;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TopSection$$serializer implements aeu2<TopSection> {
    public static final TopSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 22 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TopSection$$serializer topSection$$serializer = new TopSection$$serializer();
        INSTANCE = topSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.TopSection", topSection$$serializer, 3);
        setanimationsloop.onWarmupCompleted("creditScore", true);
        setanimationsloop.onWarmupCompleted("featureRow", true);
        setanimationsloop.onWarmupCompleted("sideButton", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    private TopSection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(FeatureRow$$serializer.INSTANCE), sp.IAuthTabCallback(Button$$serializer.INSTANCE)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(FeatureRow$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(Button$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[0] = kSerializerIAuthTabCallback2;
        kSerializerArr[4] = kSerializerIAuthTabCallback3;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TopSection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        FeatureRow featureRow;
        Button button;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onExtraCallbackWithResult = i3 % 128;
        FeatureRow featureRow2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            featureRow2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Integer num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            FeatureRow featureRow3 = (FeatureRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, FeatureRow$$serializer.INSTANCE, (Object) null);
            num = num2;
            button = (Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, Button$$serializer.INSTANCE, (Object) null);
            featureRow = featureRow3;
            i = 7;
        } else {
            Integer num3 = null;
            Button button2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 38 / 0;
                        if (iOnNavigationEvent == 0) {
                            num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num3);
                            i4 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            featureRow2 = (FeatureRow) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, FeatureRow$$serializer.INSTANCE, featureRow2);
                            i4 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            button2 = (Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, Button$$serializer.INSTANCE, button2);
                            i4 |= 4;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num3);
                        i4 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    int i7 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                }
            }
            num = num3;
            featureRow = featureRow2;
            button = button2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        TopSection topSection = new TopSection(i, num, featureRow, button, (okycx) null);
        int i9 = onExtraCallback + 11;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return topSection;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m228deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TopSection topSection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(topSection, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TopSection.onExtraCallbackWithResult(topSection, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(topSection, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TopSection.onExtraCallbackWithResult(topSection, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TopSection) obj);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
