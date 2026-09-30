package viva.republica.toss.network.model.electronicdocument.auth;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class EDocTokenResp$$serializer implements aeu2<EDocTokenResp> {
    private static int IAuthTabCallback = 1;
    public static final EDocTokenResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        EDocTokenResp$$serializer eDocTokenResp$$serializer = new EDocTokenResp$$serializer();
        INSTANCE = eDocTokenResp$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.auth.EDocTokenResp", eDocTokenResp$$serializer, 2);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted("failReason", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private EDocTokenResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, getWriggleLayout.onNavigationEvent};
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return m50deserialize(decoder);
        }
        m50deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocTokenResp m50deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 3;
        } else {
            String strAsInterface2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onWarmupCompleted + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 71;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i8 = i7 + 1;
                        int i9 = i8 % 128;
                        onWarmupCompleted = i9;
                        int i10 = i8 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i11 = i9 + 67;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i3 |= 2;
                    } else {
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i3 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            strAsInterface = strAsInterface2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocTokenResp(i, zOnExtraCallbackWithResult, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocTokenResp) obj);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocTokenResp eDocTokenResp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(eDocTokenResp, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EDocTokenResp.onNavigationEvent(eDocTokenResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
