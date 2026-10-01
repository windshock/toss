package im.toss.tosssecurities.tracker.v2;

import im.toss.tosssecurities.tracker.v2.SecuritiesLogV2;
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
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;
import ua.naiksoftware.stomp.dto.StompHeader;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class SecuritiesLogV2$$serializer implements aeu2<SecuritiesLogV2> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final SecuritiesLogV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        SecuritiesLogV2$$serializer securitiesLogV2$$serializer = new SecuritiesLogV2$$serializer();
        INSTANCE = securitiesLogV2$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.tracker.v2.SecuritiesLogV2", securitiesLogV2$$serializer, 14);
        setanimationsloop.onWarmupCompleted("logType", false);
        setanimationsloop.onWarmupCompleted("logName", false);
        setanimationsloop.onWarmupCompleted("logNameConvert", false);
        setanimationsloop.onWarmupCompleted(StompHeader.PARAMS, false);
        setanimationsloop.onWarmupCompleted("logId", false);
        setanimationsloop.onWarmupCompleted("logTime", false);
        setanimationsloop.onWarmupCompleted("tossAppVer", false);
        setanimationsloop.onWarmupCompleted("sid", false);
        setanimationsloop.onWarmupCompleted("network", false);
        setanimationsloop.onWarmupCompleted("networkConnected", false);
        setanimationsloop.onWarmupCompleted("company", false);
        setanimationsloop.onWarmupCompleted("userContext", false);
        setanimationsloop.onWarmupCompleted("accountType", false);
        setanimationsloop.onWarmupCompleted("accountSeq", false);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private SecuritiesLogV2$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = SecuritiesLogV2.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[3].getValue()), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, SecuritiesLogV2$UserContext$$serializer.INSTANCE, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jp
    public final SecuritiesLogV2 deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        SecuritiesLogV2.UserContext userContext;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Map map;
        int i2;
        Map map2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = SecuritiesLogV2.onExtraCallback();
        int i6 = 9;
        int i7 = 7;
        boolean z = true;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i8 = IAuthTabCallback + 123;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, null);
            Map map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            SecuritiesLogV2.UserContext userContext2 = (SecuritiesLogV2.UserContext) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, SecuritiesLogV2$UserContext$$serializer.INSTANCE, null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, null);
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, null);
            map = map3;
            str9 = strAsInterface2;
            str2 = strAsInterface3;
            i = 16383;
            str10 = strAsInterface4;
            str7 = strAsInterface9;
            str3 = strAsInterface7;
            str12 = strAsInterface6;
            str11 = strAsInterface5;
            str6 = strAsInterface8;
            str8 = strAsInterface10;
            str5 = str14;
            userContext = userContext2;
            str = str13;
        } else {
            int i10 = 0;
            boolean z2 = true;
            String str15 = null;
            String strAsInterface11 = null;
            String str16 = null;
            SecuritiesLogV2.UserContext userContext3 = null;
            String str17 = null;
            String strAsInterface12 = null;
            String str18 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            Map map4 = null;
            while (z2 == z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i7 = i7;
                        i4 = 2;
                        z = true;
                        i6 = 9;
                    case 0:
                        i2 = i7;
                        map2 = map4;
                        z = true;
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i10 |= 1;
                        map4 = map2;
                        i7 = i2;
                        i4 = 2;
                        i6 = 9;
                    case 1:
                        i2 = i7;
                        map2 = map4;
                        z = true;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i10 |= 2;
                        map4 = map2;
                        i7 = i2;
                        i4 = 2;
                        i6 = 9;
                    case 2:
                        i2 = i7;
                        map2 = map4;
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str15);
                        i10 |= 4;
                        z = true;
                        map4 = map2;
                        i7 = i2;
                        i4 = 2;
                        i6 = 9;
                    case 3:
                        i3 = i7;
                        i10 |= 8;
                        map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), map4);
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 4:
                        i3 = i7;
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i10 |= 16;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 5:
                        i3 = i7;
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i10 |= 32;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 6:
                        i3 = i7;
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i10 |= 64;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 7:
                        int i11 = i7;
                        i10 |= 128;
                        i3 = i11;
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i11);
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 8:
                        i10 |= 256;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 9:
                        String strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        i10 |= Imgcodecs.IMWRITE_AVIF_QUALITY;
                        str18 = strAsInterface18;
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 10:
                        i10 |= 1024;
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 11:
                        i10 |= 2048;
                        userContext3 = (SecuritiesLogV2.UserContext) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, SecuritiesLogV2$UserContext$$serializer.INSTANCE, userContext3);
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 12:
                        String str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str17);
                        i10 |= 4096;
                        int i12 = onExtraCallback + 89;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % i4;
                        str17 = str19;
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    case 13:
                        String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str16);
                        i10 |= TTHistoryActivity2.SIZE;
                        str16 = str20;
                        i3 = 7;
                        i7 = i3;
                        z = true;
                        i6 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i10;
            str = str15;
            str2 = strAsInterface;
            str3 = strAsInterface11;
            str4 = str16;
            userContext = userContext3;
            str5 = str17;
            str6 = strAsInterface12;
            str7 = str18;
            str8 = strAsInterface13;
            str9 = strAsInterface14;
            str10 = strAsInterface15;
            str11 = strAsInterface16;
            str12 = strAsInterface17;
            map = map4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SecuritiesLogV2(i, str9, str2, str, map, str10, str11, str12, str3, str6, str7, str8, userContext, str5, str4, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SecuritiesLogV2 securitiesLogV2Deserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return securitiesLogV2Deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SecuritiesLogV2 securitiesLogV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(securitiesLogV2, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SecuritiesLogV2.onWarmupCompleted(securitiesLogV2, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(securitiesLogV2, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SecuritiesLogV2.onWarmupCompleted(securitiesLogV2, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SecuritiesLogV2) obj);
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
