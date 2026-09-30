package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.PKCS12;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.r8lambdahyx9jcINTsok0QhKqPwRDX7N9k;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetRecommendRequest$$serializer implements aeu2<DepositTargetRecommendRequest> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final DepositTargetRecommendRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        DepositTargetRecommendRequest$$serializer depositTargetRecommendRequest$$serializer = new DepositTargetRecommendRequest$$serializer();
        INSTANCE = depositTargetRecommendRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetRecommendRequest", depositTargetRecommendRequest$$serializer, 5);
        setanimationsloop.onWarmupCompleted("context", false);
        setanimationsloop.onWarmupCompleted("withdrawAccount", false);
        setanimationsloop.onWarmupCompleted("refreshByUser", false);
        setanimationsloop.onWarmupCompleted("sessionKey", true);
        setanimationsloop.onWarmupCompleted(PKCS12.KEY_RESERVE_KEY, true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 89;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DepositTargetRecommendRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {DepositTargetRecommendRequest.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(TransferAccountDto$.serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetRecommendRequest depositTargetRecommendRequestM87deserialize = m87deserialize(decoder);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = onExtraCallbackWithResult + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return depositTargetRecommendRequestM87deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DepositTargetRecommendRequest m87deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
        TransferAccountDto transferAccountDto;
        boolean zOnExtraCallbackWithResult;
        String str;
        int i;
        String str2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = DepositTargetRecommendRequest.onNavigationEvent();
        int i4 = 1;
        String str3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            str = null;
            transferAccountDto = null;
            r8lambdahyx9jcintsok0qhkqpwrdx7n9k = null;
            i = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        r8lambdahyx9jcintsok0qhkqpwrdx7n9k = (r8lambdahyx9jcINTsok0QhKqPwRDX7N9k) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), r8lambdahyx9jcintsok0qhkqpwrdx7n9k);
                        i |= 1;
                    } else if (iOnNavigationEvent == i4) {
                        transferAccountDto = (TransferAccountDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TransferAccountDto$.serializer.INSTANCE, transferAccountDto);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i5 = onExtraCallbackWithResult + 125;
                        int i6 = i5 % 128;
                        onExtraCallback = i6;
                        int i7 = i5 % 2;
                        if (iOnNavigationEvent == 3) {
                            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                            i |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i8 = i6 + 121;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 != 0) {
                                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str3);
                                i2 = i | 112;
                            } else {
                                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str3);
                                i2 = i | 16;
                            }
                            str3 = str2;
                            i = i2;
                        }
                    } else {
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i |= 4;
                    }
                    i4 = 1;
                } else {
                    z = false;
                }
            }
        } else {
            r8lambdahyx9jcintsok0qhkqpwrdx7n9k = (r8lambdahyx9jcINTsok0QhKqPwRDX7N9k) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            transferAccountDto = (TransferAccountDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TransferAccountDto$.serializer.INSTANCE, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            int i9 = onExtraCallback + 107;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i = 31;
        }
        String str4 = str;
        String str5 = str3;
        TransferAccountDto transferAccountDto2 = transferAccountDto;
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k2 = r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
        int i11 = i;
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTargetRecommendRequest(i11, r8lambdahyx9jcintsok0qhkqpwrdx7n9k2, transferAccountDto2, z2, str4, str5, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetRecommendRequest) obj);
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetRecommendRequest depositTargetRecommendRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(depositTargetRecommendRequest, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DepositTargetRecommendRequest.onExtraCallback(depositTargetRecommendRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(depositTargetRecommendRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DepositTargetRecommendRequest.onExtraCallback(depositTargetRecommendRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
