package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UssBenefitTapPointResponse$$serializer implements aeu2<UssBenefitTapPointResponse> {
    private static int IAuthTabCallback = 0;
    public static final UssBenefitTapPointResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        UssBenefitTapPointResponse$$serializer ussBenefitTapPointResponse$$serializer = new UssBenefitTapPointResponse$$serializer();
        INSTANCE = ussBenefitTapPointResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.UssBenefitTapPointResponse", ussBenefitTapPointResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("balance", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 9;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private UssBenefitTapPointResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{oty1.onExtraCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        kSerializerArr[1] = oty1.onExtraCallback;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UssBenefitTapPointResponse ussBenefitTapPointResponseM84deserialize = m84deserialize(decoder);
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return ussBenefitTapPointResponseM84deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final UssBenefitTapPointResponse m84deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            boolean z = true;
            loop0: while (true) {
                int i3 = 0;
                while (z) {
                    int i4 = IAuthTabCallback + 109;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i5 = IAuthTabCallback + 101;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            break;
                        }
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i3 = 1;
                    }
                }
                jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
                i2 = i3;
                jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new UssBenefitTapPointResponse(i2, jIAuthTabCallbackDefault, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (UssBenefitTapPointResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull UssBenefitTapPointResponse ussBenefitTapPointResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(ussBenefitTapPointResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        UssBenefitTapPointResponse.onExtraCallbackWithResult(ussBenefitTapPointResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
