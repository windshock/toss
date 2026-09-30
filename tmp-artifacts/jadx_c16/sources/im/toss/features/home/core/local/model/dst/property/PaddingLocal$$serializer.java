package im.toss.features.home.core.local.model.dst.property;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.dj3;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PaddingLocal$$serializer implements aeu2<PaddingLocal> {
    private static int IAuthTabCallback = 0;
    public static final PaddingLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        PaddingLocal$$serializer paddingLocal$$serializer = new PaddingLocal$$serializer();
        INSTANCE = paddingLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.PaddingLocal", paddingLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("paddingLeft", false);
        setanimationsloop.onWarmupCompleted("paddingRight", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 43;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PaddingLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        dj3 dj3Var = dj3.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {dj3Var, dj3Var, dj3Var, dj3Var};
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PaddingLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        float fOnWarmupCompleted2;
        float fOnWarmupCompleted3;
        float fOnWarmupCompleted4;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            fOnWarmupCompleted2 = 0.0f;
            fOnWarmupCompleted3 = 0.0f;
            fOnWarmupCompleted = 0.0f;
            fOnWarmupCompleted4 = 0.0f;
            i = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i |= 1;
                } else if (iOnNavigationEvent == 1) {
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                    i |= 2;
                } else if (iOnNavigationEvent == 2) {
                    fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                    i |= 4;
                    int i5 = IAuthTabCallback + 115;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                    i |= 8;
                }
            }
        } else {
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
            i = 15;
        }
        float f = fOnWarmupCompleted;
        int i7 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PaddingLocal(i7, f, fOnWarmupCompleted2, fOnWarmupCompleted3, fOnWarmupCompleted4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m463deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        PaddingLocal paddingLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = IAuthTabCallback + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return paddingLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PaddingLocal paddingLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(paddingLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PaddingLocal.onNavigationEvent(paddingLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paddingLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PaddingLocal.onNavigationEvent(paddingLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PaddingLocal) obj);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
