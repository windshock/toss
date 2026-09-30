package viva.republica.toss.network.model.shopping;

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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.shopping.ToastV2Data$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GlobalToastV2Response$$serializer implements aeu2<GlobalToastV2Response> {
    private static int IAuthTabCallback = 0;
    public static final GlobalToastV2Response$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        GlobalToastV2Response$$serializer globalToastV2Response$$serializer = new GlobalToastV2Response$$serializer();
        INSTANCE = globalToastV2Response$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.shopping.GlobalToastV2Response", globalToastV2Response$$serializer, 1);
        setanimationsloop.onWarmupCompleted("toast", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private GlobalToastV2Response$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(ToastV2Data$.serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        GlobalToastV2Response globalToastV2ResponseM78deserialize = m78deserialize(decoder);
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return globalToastV2ResponseM78deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final GlobalToastV2Response m78deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ToastV2Data toastV2Data;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            toastV2Data = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 97;
                    int i7 = i6 % 128;
                    onExtraCallbackWithResult = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i7 + 111;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    ToastV2Data$.serializer serializerVar = ToastV2Data$.serializer.INSTANCE;
                    toastV2Data = (ToastV2Data) (i10 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, toastV2Data) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, toastV2Data));
                    i3 = 1;
                } else {
                    z = false;
                }
            }
            i2 = i3;
        } else {
            toastV2Data = (ToastV2Data) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ToastV2Data$.serializer.INSTANCE, (Object) null);
            int i11 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GlobalToastV2Response(i2, toastV2Data, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (GlobalToastV2Response) obj);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GlobalToastV2Response globalToastV2Response) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(globalToastV2Response, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GlobalToastV2Response.onExtraCallback(globalToastV2Response, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
