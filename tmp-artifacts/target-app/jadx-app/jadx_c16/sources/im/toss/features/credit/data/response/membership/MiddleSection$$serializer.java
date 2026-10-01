package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.Feature$;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MiddleSection$$serializer implements aeu2<MiddleSection> {
    public static final MiddleSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        MiddleSection$$serializer middleSection$$serializer = new MiddleSection$$serializer();
        INSTANCE = middleSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.MiddleSection", middleSection$$serializer, 1);
        setanimationsloop.onWarmupCompleted("feature", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private MiddleSection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(Feature$.serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MiddleSection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Feature feature;
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = onWarmupCompleted + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            feature = (Feature) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, Feature$.serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            Feature feature2 = null;
            int i7 = 0;
            while (z) {
                int i8 = onExtraCallback + 103;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i9 = 45 / 0;
                    if (iOnNavigationEvent == -1) {
                        int i10 = onWarmupCompleted + 27;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        z = false;
                    } else {
                        if (iOnNavigationEvent == 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        feature2 = (Feature) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, Feature$.serializer.INSTANCE, feature2);
                        i7 = 1;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i102 = onWarmupCompleted + 27;
                        onExtraCallback = i102 % 128;
                        int i112 = i102 % 2;
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                    }
                }
            }
            feature = feature2;
            i4 = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MiddleSection(i4, feature, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m225deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MiddleSection middleSectionDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return middleSectionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MiddleSection middleSection) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(middleSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MiddleSection.IAuthTabCallback(middleSection, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MiddleSection) obj);
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
