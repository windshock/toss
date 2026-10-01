package im.toss.features.home.core.remote.request.hideamount;

import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import im.toss.features.home.core.remote.request.hideamount.HideAmountRequest;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HideAmountRequest$Account$$serializer implements aeu2<HideAmountRequest.Account> {
    private static int IAuthTabCallback = 0;
    public static final HideAmountRequest$Account$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HideAmountRequest$Account$$serializer hideAmountRequest$Account$$serializer = new HideAmountRequest$Account$$serializer();
        INSTANCE = hideAmountRequest$Account$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.hideamount.HideAmountRequest.Account", hideAmountRequest$Account$$serializer, 7);
        setanimationsloop.onWarmupCompleted(BizSceneNavigateManager.KEY_ALL, false);
        setanimationsloop.onWarmupCompleted("investing", false);
        setanimationsloop.onWarmupCompleted("saving", false);
        setanimationsloop.onWarmupCompleted("loan", false);
        setanimationsloop.onWarmupCompleted("point", false);
        setanimationsloop.onWarmupCompleted("pension", false);
        setanimationsloop.onWarmupCompleted("etc", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    private HideAmountRequest$Account$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            return new KSerializer[]{getbgcolor, getbgcolor, getbgcolor, getbgcolor, getbgcolor, getbgcolor, getbgcolor};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[82];
        getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
        kSerializerArr[0] = getbgcolor2;
        kSerializerArr[0] = getbgcolor2;
        kSerializerArr[5] = getbgcolor2;
        kSerializerArr[3] = getbgcolor2;
        kSerializerArr[5] = getbgcolor2;
        kSerializerArr[4] = getbgcolor2;
        kSerializerArr[115] = getbgcolor2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HideAmountRequest.Account deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        boolean zOnExtraCallbackWithResult3;
        boolean zOnExtraCallbackWithResult4;
        boolean zOnExtraCallbackWithResult5;
        boolean zOnExtraCallbackWithResult6;
        boolean zOnExtraCallbackWithResult7;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 6;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onNavigationEvent + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            boolean z = true;
            i = 0;
            zOnExtraCallbackWithResult2 = false;
            zOnExtraCallbackWithResult3 = false;
            zOnExtraCallbackWithResult = false;
            zOnExtraCallbackWithResult5 = false;
            zOnExtraCallbackWithResult4 = false;
            zOnExtraCallbackWithResult6 = false;
            zOnExtraCallbackWithResult7 = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i |= 8;
                        int i8 = onExtraCallback + 105;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        break;
                    case 4:
                        zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i |= 16;
                        continue;
                    case 5:
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i |= 32;
                        continue;
                    case 6:
                        zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5);
                        i |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i5 = 6;
            }
        } else {
            int i10 = onNavigationEvent + 3;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            i = 127;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HideAmountRequest.Account account = new HideAmountRequest.Account(i, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, zOnExtraCallbackWithResult3, zOnExtraCallbackWithResult4, zOnExtraCallbackWithResult5, zOnExtraCallbackWithResult6, zOnExtraCallbackWithResult7, (okycx) null);
        int i12 = onExtraCallback + 97;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            return account;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m620deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HideAmountRequest.Account accountDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = onNavigationEvent + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return accountDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HideAmountRequest.Account account) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(account, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HideAmountRequest.Account.onExtraCallbackWithResult(account, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(account, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HideAmountRequest.Account.onExtraCallbackWithResult(account, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 14 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HideAmountRequest.Account) obj);
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
