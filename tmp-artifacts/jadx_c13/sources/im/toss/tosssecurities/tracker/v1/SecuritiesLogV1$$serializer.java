package im.toss.tosssecurities.tracker.v1;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.TTHistoryActivity2;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class SecuritiesLogV1$$serializer implements aeu2<SecuritiesLogV1> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final SecuritiesLogV1$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        SecuritiesLogV1$$serializer securitiesLogV1$$serializer = new SecuritiesLogV1$$serializer();
        INSTANCE = securitiesLogV1$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.tracker.v1.SecuritiesLogV1", securitiesLogV1$$serializer, 17);
        setanimationsloop.onWarmupCompleted("logType", false);
        setanimationsloop.onWarmupCompleted("logName", false);
        setanimationsloop.onWarmupCompleted(StompHeader.PARAMS, false);
        setanimationsloop.onWarmupCompleted("logId", false);
        setanimationsloop.onWarmupCompleted("logTime", false);
        setanimationsloop.onWarmupCompleted("deviceId", false);
        setanimationsloop.onWarmupCompleted("tossAppVer", false);
        setanimationsloop.onWarmupCompleted("sid", false);
        setanimationsloop.onWarmupCompleted("network", false);
        setanimationsloop.onWarmupCompleted("networkConnected", false);
        setanimationsloop.onWarmupCompleted("osVersion", false);
        setanimationsloop.onWarmupCompleted("os", false);
        setanimationsloop.onWarmupCompleted("company", false);
        setanimationsloop.onWarmupCompleted("gaNo", false);
        setanimationsloop.onWarmupCompleted("userNo", false);
        setanimationsloop.onWarmupCompleted("securitiesDeviceSession", false);
        setanimationsloop.onWarmupCompleted("deviceModel", false);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onNavigationEvent + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    private SecuritiesLogV1$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = SecuritiesLogV1.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[2].getValue()), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout, getwrigglelayout};
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jp
    public final SecuritiesLogV1 deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        Map map;
        String strAsInterface;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strAsInterface2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        char c;
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SecuritiesLogV1.onNavigationEvent();
        int i4 = 8;
        int i5 = 0;
        boolean z2 = true;
        String str15 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallback + 103;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            Map map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            String strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
            str4 = strAsInterface3;
            str5 = strAsInterface10;
            str6 = strAsInterface6;
            str7 = strAsInterface4;
            str8 = strAsInterface7;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
            str9 = strAsInterface8;
            str10 = strAsInterface11;
            str11 = strAsInterface9;
            str12 = strAsInterface12;
            str13 = strAsInterface13;
            str14 = strAsInterface14;
            i = 131071;
            str2 = str16;
            map = map2;
            str3 = strAsInterface5;
        } else {
            boolean z3 = true;
            String str17 = null;
            Map map3 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            String strAsInterface18 = null;
            String strAsInterface19 = null;
            String strAsInterface20 = null;
            String strAsInterface21 = null;
            String strAsInterface22 = null;
            String strAsInterface23 = null;
            String strAsInterface24 = null;
            String strAsInterface25 = null;
            String strAsInterface26 = null;
            String strAsInterface27 = null;
            String strAsInterface28 = null;
            while (z3 == z2) {
                int i8 = onExtraCallbackWithResult + 87;
                onExtraCallback = i8 % 128;
                if (i8 % i2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z3 = false;
                        i2 = 2;
                        z2 = true;
                    case 0:
                        z = true;
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 2;
                        z2 = z;
                        i4 = 8;
                    case 1:
                        z = true;
                        strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                        z2 = z;
                        i4 = 8;
                    case 2:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArrOnNavigationEvent[i2].getValue(), map3);
                        i5 |= 4;
                        i4 = 8;
                        z2 = true;
                    case 3:
                        c = 4;
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i5 |= 8;
                        z2 = true;
                    case 4:
                        c = 4;
                        strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i5 |= 16;
                        z2 = true;
                    case 5:
                        strAsInterface21 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i5 |= 32;
                        z2 = true;
                    case 6:
                        strAsInterface23 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i5 |= 64;
                        z2 = true;
                    case 7:
                        strAsInterface25 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i5 |= 128;
                        z2 = true;
                    case 8:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i5 |= 256;
                        z2 = true;
                    case 9:
                        strAsInterface24 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i5 |= Imgcodecs.IMWRITE_AVIF_QUALITY;
                        z2 = true;
                    case 10:
                        strAsInterface26 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        i5 |= 1024;
                        int i9 = onExtraCallback + 81;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % i2;
                        z2 = true;
                    case 11:
                        strAsInterface27 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
                        i5 |= 2048;
                        z2 = true;
                    case 12:
                        strAsInterface28 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        i5 |= 4096;
                        z2 = true;
                    case 13:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str15);
                        i5 |= TTHistoryActivity2.SIZE;
                        z2 = true;
                    case 14:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str17);
                        i5 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        z2 = true;
                    case 15:
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 15);
                        i5 |= 32768;
                        z2 = true;
                    case 16:
                        strAsInterface22 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
                        i5 |= Imgproc.FLOODFILL_FIXED_RANGE;
                        z2 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str17;
            i = i5;
            str2 = str15;
            map = map3;
            strAsInterface = strAsInterface15;
            str3 = strAsInterface16;
            str4 = strAsInterface17;
            str5 = strAsInterface18;
            str6 = strAsInterface19;
            str7 = strAsInterface20;
            str8 = strAsInterface21;
            strAsInterface2 = strAsInterface22;
            str9 = strAsInterface23;
            str10 = strAsInterface24;
            str11 = strAsInterface25;
            str12 = strAsInterface26;
            str13 = strAsInterface27;
            str14 = strAsInterface28;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SecuritiesLogV1(i, str4, str7, map, str3, str6, str8, str9, str11, str5, str10, str12, str13, str14, str2, str, strAsInterface, strAsInterface2, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SecuritiesLogV1 securitiesLogV1Deserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = onExtraCallbackWithResult + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return securitiesLogV1Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SecuritiesLogV1 securitiesLogV1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(securitiesLogV1, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SecuritiesLogV1.onExtraCallbackWithResult(securitiesLogV1, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 31 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(securitiesLogV1, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            SecuritiesLogV1.onExtraCallbackWithResult(securitiesLogV1, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SecuritiesLogV1) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
