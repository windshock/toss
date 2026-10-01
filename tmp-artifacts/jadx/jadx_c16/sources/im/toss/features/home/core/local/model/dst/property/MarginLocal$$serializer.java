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
public final /* synthetic */ class MarginLocal$$serializer implements aeu2<MarginLocal> {
    private static int IAuthTabCallback = 1;
    public static final MarginLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return serialDescriptor;
    }

    static {
        MarginLocal$$serializer marginLocal$$serializer = new MarginLocal$$serializer();
        INSTANCE = marginLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.property.MarginLocal", marginLocal$$serializer, 4);
        setanimationsloop.onWarmupCompleted("marginLeft", false);
        setanimationsloop.onWarmupCompleted("marginRight", false);
        setanimationsloop.onWarmupCompleted("marginTop", false);
        setanimationsloop.onWarmupCompleted("marginBottom", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private MarginLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            dj3 dj3Var = dj3.onWarmupCompleted;
            return new KSerializer[]{dj3Var, dj3Var, dj3Var, dj3Var};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        dj3 dj3Var2 = dj3.onWarmupCompleted;
        kSerializerArr[1] = dj3Var2;
        kSerializerArr[1] = dj3Var2;
        kSerializerArr[3] = dj3Var2;
        kSerializerArr[4] = dj3Var2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MarginLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            float fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            float fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
            int i3 = onWarmupCompleted + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 15;
            f = fOnWarmupCompleted;
            f2 = fOnWarmupCompleted4;
            f3 = fOnWarmupCompleted2;
            f4 = fOnWarmupCompleted3;
        } else {
            float fOnWarmupCompleted5 = 0.0f;
            float fOnWarmupCompleted6 = 0.0f;
            float fOnWarmupCompleted7 = 0.0f;
            float fOnWarmupCompleted8 = 0.0f;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    fOnWarmupCompleted5 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = onWarmupCompleted + 31;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 4) {
                            int i8 = i7 + 119;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent == 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i7 + 123;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0) {
                                fOnWarmupCompleted6 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                                i5 |= 64;
                            } else {
                                fOnWarmupCompleted6 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                                i5 |= 8;
                            }
                        } else {
                            fOnWarmupCompleted8 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                            i5 |= 4;
                        }
                    } else if (iOnNavigationEvent != 2) {
                        int i82 = i7 + 119;
                        onWarmupCompleted = i82 % 128;
                        int i92 = i82 % 2;
                        if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        fOnWarmupCompleted8 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                        i5 |= 4;
                    }
                } else {
                    fOnWarmupCompleted7 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                    i5 |= 2;
                }
            }
            i = i5;
            f = fOnWarmupCompleted5;
            f2 = fOnWarmupCompleted6;
            f3 = fOnWarmupCompleted7;
            f4 = fOnWarmupCompleted8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MarginLocal(i, f, f3, f4, f2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m461deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MarginLocal marginLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return marginLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MarginLocal marginLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(marginLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MarginLocal.onExtraCallback(marginLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 41;
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
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MarginLocal) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
