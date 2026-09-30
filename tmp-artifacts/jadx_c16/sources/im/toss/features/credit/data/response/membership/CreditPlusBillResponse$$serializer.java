package im.toss.features.credit.data.response.membership;

import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusBillResponse$$serializer implements aeu2<CreditPlusBillResponse> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusBillResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusBillResponse$$serializer creditPlusBillResponse$$serializer = new CreditPlusBillResponse$$serializer();
        INSTANCE = creditPlusBillResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusBillResponse", creditPlusBillResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 93;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditPlusBillResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            kSerializerArr = new KSerializer[4];
            kSerializerArr[1] = getBgColor.IAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        int i3 = IAuthTabCallback + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusBillResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        boolean zOnExtraCallbackWithResult;
        String str;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            int i4 = IAuthTabCallback + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
        } else {
            int i6 = IAuthTabCallback + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            String str2 = null;
            int i8 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z = true;
            while (z) {
                int i9 = onWarmupCompleted + 35;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i11 = onWarmupCompleted + 95;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i8 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i8 |= 2;
                    }
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i8 |= 1;
                    int i12 = IAuthTabCallback + 93;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            i = i8;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            str = str2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusBillResponse(i, zOnExtraCallbackWithResult, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m200deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusBillResponse creditPlusBillResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return creditPlusBillResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusBillResponse creditPlusBillResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditPlusBillResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusBillResponse.onExtraCallback(creditPlusBillResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusBillResponse) obj);
        int i4 = onWarmupCompleted + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
