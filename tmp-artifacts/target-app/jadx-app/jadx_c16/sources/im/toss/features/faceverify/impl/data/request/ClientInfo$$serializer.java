package im.toss.features.faceverify.impl.data.request;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ClientInfo$$serializer implements aeu2<ClientInfo> {
    public static final int $stable;
    public static final ClientInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ClientInfo$$serializer clientInfo$$serializer = new ClientInfo$$serializer();
        INSTANCE = clientInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.request.ClientInfo", clientInfo$$serializer, 7);
        setanimationsloop.onWarmupCompleted("deviceManufacturer", false);
        setanimationsloop.onWarmupCompleted("deviceModelName", false);
        setanimationsloop.onWarmupCompleted("deviceIdentifier", false);
        setanimationsloop.onWarmupCompleted("os", false);
        setanimationsloop.onWarmupCompleted("osVersion", false);
        setanimationsloop.onWarmupCompleted("sdkVersion", false);
        setanimationsloop.onWarmupCompleted("appVersion", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 83;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ClientInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[65];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[2] = getwrigglelayout;
            kSerializerArr[5] = getwrigglelayout;
            kSerializerArr[4] = getwrigglelayout;
            kSerializerArr[3] = getwrigglelayout;
            kSerializerArr[41] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onNavigationEvent + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ClientInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String strAsInterface;
        String str6;
        int iOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            str6 = strAsInterface7;
            str4 = strAsInterface5;
            str5 = strAsInterface6;
            i = 127;
            str = strAsInterface4;
            str2 = strAsInterface2;
            str3 = strAsInterface3;
        } else {
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            boolean z = true;
            int i6 = 0;
            while (z) {
                int i7 = onWarmupCompleted + 15;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i8 = 84 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            break;
                        case 1:
                            i2 = 1;
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 2;
                            break;
                        case 2:
                            strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        case 6:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                            i6 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i6 |= 1;
                            break;
                        case 1:
                            i2 = 1;
                            strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i6 |= 2;
                            break;
                        case 2:
                            strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                            break;
                        case 3:
                            strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                            break;
                        case 4:
                            strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                            i6 |= 16;
                            break;
                        case 5:
                            strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i6 |= 32;
                            break;
                        case 6:
                            strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                            i6 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            str = strAsInterface8;
            str2 = strAsInterface9;
            str3 = strAsInterface10;
            str4 = strAsInterface13;
            str5 = strAsInterface14;
            i = i6;
            String str7 = strAsInterface12;
            strAsInterface = strAsInterface11;
            str6 = str7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ClientInfo(i, str2, str3, str, str4, str5, str6, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m232deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ClientInfo clientInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(clientInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ClientInfo.onExtraCallback(clientInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ClientInfo) obj);
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
