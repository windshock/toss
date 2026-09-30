package viva.republica.toss.network.model.common;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CheckVersionReq$$serializer implements aeu2<CheckVersionReq> {
    private static int IAuthTabCallback = 0;
    public static final CheckVersionReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return serialDescriptor;
    }

    static {
        CheckVersionReq$$serializer checkVersionReq$$serializer = new CheckVersionReq$$serializer();
        INSTANCE = checkVersionReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.common.CheckVersionReq", checkVersionReq$$serializer, 3);
        setanimationsloop.onWarmupCompleted("currentVersion", false);
        setanimationsloop.onWarmupCompleted("osVersion", false);
        setanimationsloop.onWarmupCompleted("deviceInfo", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    private CheckVersionReq$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            m44deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CheckVersionReq checkVersionReqM44deserialize = m44deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return checkVersionReqM44deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final CheckVersionReq m44deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface2;
            str2 = strAsInterface3;
            i = 7;
        } else {
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 1) {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    }
                } else {
                    strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            strAsInterface = strAsInterface4;
            str = strAsInterface5;
            str2 = strAsInterface6;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CheckVersionReq(i, str, str2, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CheckVersionReq) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CheckVersionReq checkVersionReq) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(checkVersionReq, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CheckVersionReq.onExtraCallback(checkVersionReq, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(checkVersionReq, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CheckVersionReq.onExtraCallback(checkVersionReq, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
