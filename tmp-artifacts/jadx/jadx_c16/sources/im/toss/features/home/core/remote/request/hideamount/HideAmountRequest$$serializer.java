package im.toss.features.home.core.remote.request.hideamount;

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
public final /* synthetic */ class HideAmountRequest$$serializer implements aeu2<HideAmountRequest> {
    private static int IAuthTabCallback = 0;
    public static final HideAmountRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        HideAmountRequest$$serializer hideAmountRequest$$serializer = new HideAmountRequest$$serializer();
        INSTANCE = hideAmountRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.hideamount.HideAmountRequest", hideAmountRequest$$serializer, 5);
        setanimationsloop.onWarmupCompleted("account", false);
        setanimationsloop.onWarmupCompleted("consumption", false);
        setanimationsloop.onWarmupCompleted("investmentPortfolio", false);
        setanimationsloop.onWarmupCompleted("groupSaving", false);
        setanimationsloop.onWarmupCompleted("store", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 121;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HideAmountRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {HideAmountRequest$Account$$serializer.INSTANCE, getbgcolor, getbgcolor, getbgcolor, getbgcolor};
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HideAmountRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        boolean z;
        HideAmountRequest.Account account;
        boolean zOnExtraCallbackWithResult2;
        boolean zOnExtraCallbackWithResult3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        boolean z2 = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            HideAmountRequest.Account account2 = (HideAmountRequest.Account) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, HideAmountRequest$Account$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            account = account2;
            z = zOnExtraCallbackWithResult4;
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 31;
        } else {
            HideAmountRequest.Account account3 = null;
            boolean z3 = true;
            boolean zOnExtraCallbackWithResult5 = false;
            boolean zOnExtraCallbackWithResult6 = false;
            boolean zOnExtraCallbackWithResult7 = false;
            boolean zOnExtraCallbackWithResult8 = false;
            int i5 = 0;
            while (z3) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z3 = z2;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != i4) {
                        if (iOnNavigationEvent != 2) {
                            int i6 = onExtraCallbackWithResult;
                            int i7 = i6 + 65;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            if (iOnNavigationEvent == 3) {
                                zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                                i5 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i9 = i6 + 111;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                zOnExtraCallbackWithResult8 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                                i5 |= 16;
                            }
                        } else {
                            zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i5 |= 4;
                        }
                        i4 = 1;
                    } else {
                        zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i5 |= 2;
                    }
                    z2 = false;
                } else {
                    account3 = (HideAmountRequest.Account) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, HideAmountRequest$Account$$serializer.INSTANCE, account3);
                    i5 |= 1;
                    z2 = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult5;
            z = zOnExtraCallbackWithResult6;
            account = account3;
            zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult7;
            zOnExtraCallbackWithResult3 = zOnExtraCallbackWithResult8;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HideAmountRequest(i, account, z, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, zOnExtraCallbackWithResult3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m619deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HideAmountRequest hideAmountRequestDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return hideAmountRequestDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HideAmountRequest hideAmountRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(hideAmountRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HideAmountRequest.onNavigationEvent(hideAmountRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 96 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(hideAmountRequest, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            HideAmountRequest.onNavigationEvent(hideAmountRequest, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HideAmountRequest) obj);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
