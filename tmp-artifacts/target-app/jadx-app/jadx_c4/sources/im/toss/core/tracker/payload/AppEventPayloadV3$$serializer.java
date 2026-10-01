package im.toss.core.tracker.payload;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.Referrer$$serializer;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.appInfo;
import o.getWriggleLayout;
import o.handleRemoveKey;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class AppEventPayloadV3$$serializer implements aeu2<AppEventPayloadV3> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final AppEventPayloadV3$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        AppEventPayloadV3$$serializer appEventPayloadV3$$serializer = new AppEventPayloadV3$$serializer();
        INSTANCE = appEventPayloadV3$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("v3", appEventPayloadV3$$serializer, 22);
        setanimationsloop.onWarmupCompleted("schema_id", true);
        Object[] objArr = new Object[1];
        a(new char[]{18179, 59615, 11269, 56809, 26599, 55003, 11013, 11674}, 7 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("log_type", false);
        setanimationsloop.onWarmupCompleted("service", false);
        setanimationsloop.onWarmupCompleted("params", false);
        setanimationsloop.onWarmupCompleted("log_id", true);
        setanimationsloop.onWarmupCompleted("log_time", true);
        setanimationsloop.onWarmupCompleted("device_id", true);
        setanimationsloop.onWarmupCompleted("client_version", true);
        setanimationsloop.onWarmupCompleted("sid", true);
        setanimationsloop.onWarmupCompleted("network", true);
        setanimationsloop.onWarmupCompleted("network_connected", true);
        setanimationsloop.onWarmupCompleted("os_version", true);
        setanimationsloop.onWarmupCompleted("company", true);
        setanimationsloop.onWarmupCompleted("user_no", true);
        setanimationsloop.onWarmupCompleted("ga_no", true);
        setanimationsloop.onWarmupCompleted("install_id", true);
        setanimationsloop.onWarmupCompleted("log_version", true);
        setanimationsloop.onWarmupCompleted("bank_device_session", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{39945, 8326, 13373, 61852, 2387, 45920, 147, 62240}, 7 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("locale", true);
        Object[] objArr3 = new Object[1];
        a(new char[]{63348, 2787, 3200, 10377, 18627, 56629}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted(new appInfo("_type") { // from class: im.toss.core.tracker.payload.AppEventPayloadV3$$serializer.IAuthTabCallback
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final /* synthetic */ String onWarmupCompleted;

            {
                Intrinsics.checkNotNullParameter(str, "");
                this.onWarmupCompleted = str;
            }

            public final /* synthetic */ String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onWarmupCompleted;
                }
                throw null;
            }

            public final /* synthetic */ Class annotationType() {
                Class<appInfo> cls;
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    cls = appInfo.class;
                    int i4 = 38 / 0;
                } else {
                    cls = appInfo.class;
                }
                int i5 = i3 + 21;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return cls;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 91;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean z = obj instanceof appInfo;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!(obj instanceof appInfo)) {
                    int i4 = i2 + 101;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                    return true;
                }
                int i6 = onExtraCallbackWithResult + 49;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onWarmupCompleted.hashCode() ^ 707790692;
                int i4 = onExtraCallback + 31;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallback + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        });
        descriptor = setanimationsloop;
        int i = asBinder + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AppEventPayloadV3$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = AppEventPayloadV3.onNavigationEvent();
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(oty1Var);
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[4].getValue()), kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(oty1Var), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(Referrer$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallbackDefault + 95;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppEventPayloadV3 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        Map map;
        String str2;
        String str3;
        Long l;
        Long l2;
        Referrer referrer;
        String str4;
        String str5;
        String strAsInterface2;
        String str6;
        String strAsInterface3;
        String str7;
        String str8;
        String str9;
        String strAsInterface4;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        char c;
        int i2;
        String str15;
        int i3;
        int i4 = 2 % 2;
        int i5 = asInterface + 105;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            AppEventPayloadV3.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = AppEventPayloadV3.onNavigationEvent();
        int i6 = 10;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            oty1 oty1Var = oty1.onExtraCallback;
            l2 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, oty1Var, (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
            String strAsInterface6 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            String strAsInterface7 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
            Map map2 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            String strAsInterface8 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 5);
            String strAsInterface9 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 6);
            strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 7);
            String strAsInterface10 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 8);
            String strAsInterface11 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 9);
            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 10);
            String strAsInterface12 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 11);
            String strAsInterface13 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 12);
            String strAsInterface14 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 13);
            String strAsInterface15 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 14);
            strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 15);
            Long l3 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 16, oty1Var, (Object) null);
            String strAsInterface16 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 17);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str16 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 18, getwrigglelayout, (Object) null);
            Referrer referrer2 = (Referrer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 19, Referrer$$serializer.INSTANCE, (Object) null);
            String str17 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 20, getwrigglelayout, (Object) null);
            referrer = referrer2;
            String str18 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 21, getwrigglelayout, (Object) null);
            int i7 = asInterface + 55;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            }
            i = 4194303;
            str2 = str18;
            str5 = strAsInterface5;
            str11 = strAsInterface10;
            map = map2;
            str8 = strAsInterface15;
            str9 = strAsInterface16;
            str3 = str16;
            str10 = str17;
            str7 = strAsInterface6;
            str13 = strAsInterface9;
            str12 = strAsInterface7;
            strAsInterface = strAsInterface13;
            str4 = strAsInterface12;
            str14 = strAsInterface8;
            str6 = strAsInterface11;
            l = l3;
            str = strAsInterface14;
        } else {
            int i9 = 0;
            boolean z = true;
            String strAsInterface17 = null;
            Map map3 = null;
            String str19 = null;
            String strAsInterface18 = null;
            String strAsInterface19 = null;
            String str20 = null;
            String str21 = null;
            Long l4 = null;
            Referrer referrer3 = null;
            String strAsInterface20 = null;
            strAsInterface = null;
            Long l5 = null;
            String strAsInterface21 = null;
            String strAsInterface22 = null;
            String strAsInterface23 = null;
            String strAsInterface24 = null;
            String strAsInterface25 = null;
            String strAsInterface26 = null;
            String strAsInterface27 = null;
            String strAsInterface28 = null;
            String strAsInterface29 = null;
            String strAsInterface30 = null;
            while (z) {
                int i10 = IAuthTabCallbackDefault + 107;
                asInterface = i10 % 128;
                if (i10 % 2 != 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = '\b';
                        z = false;
                        i6 = 10;
                    case 0:
                        c = '\b';
                        i9 |= 1;
                        l5 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l5);
                        i6 = 10;
                    case 1:
                        c = '\b';
                        strAsInterface21 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
                        i9 |= 2;
                        i6 = 10;
                    case 2:
                        c = '\b';
                        strAsInterface26 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                        i9 |= 4;
                        i6 = 10;
                    case 3:
                        c = '\b';
                        strAsInterface27 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
                        i9 |= 8;
                        i6 = 10;
                    case 4:
                        c = '\b';
                        map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), map3);
                        i9 |= 16;
                        i6 = 10;
                    case 5:
                        c = '\b';
                        strAsInterface22 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 5);
                        i9 |= 32;
                        i6 = 10;
                    case 6:
                        i9 |= 64;
                        strAsInterface18 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 6);
                        i6 = 10;
                    case 7:
                        c = '\b';
                        strAsInterface25 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 7);
                        i9 |= 128;
                        i6 = 10;
                    case 8:
                        i9 |= 256;
                        strAsInterface19 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 8);
                        i6 = 10;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        strAsInterface24 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 9);
                        i9 |= 512;
                        i6 = 10;
                    case 10:
                        strAsInterface23 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i6);
                        i9 |= 1024;
                    case 11:
                        strAsInterface20 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 11);
                        i9 |= 2048;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 12);
                        i9 |= 4096;
                    case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                        i9 |= 8192;
                        strAsInterface17 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 13);
                    case 14:
                        strAsInterface28 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 14);
                        i9 |= 16384;
                    case 15:
                        strAsInterface30 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 15);
                        i9 |= 32768;
                    case 16:
                        i2 = 65536;
                        l4 = (Long) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 16, oty1.onExtraCallback, l4);
                        str15 = str20;
                        i3 = i2;
                        i9 |= i3;
                        str20 = str15;
                    case 17:
                        strAsInterface29 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 17);
                        i9 |= 131072;
                    case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                        i2 = 262144;
                        str21 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 18, getWriggleLayout.onNavigationEvent, str21);
                        str15 = str20;
                        i3 = i2;
                        i9 |= i3;
                        str20 = str15;
                    case 19:
                        referrer3 = (Referrer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 19, Referrer$$serializer.INSTANCE, referrer3);
                        str15 = str20;
                        i3 = 524288;
                        i9 |= i3;
                        str20 = str15;
                    case 20:
                        str19 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, str19);
                        String str22 = str20;
                        i3 = 1048576;
                        str15 = str22;
                        i9 |= i3;
                        str20 = str15;
                    case 21:
                        str15 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 21, getWriggleLayout.onNavigationEvent, str20);
                        i3 = 2097152;
                        i9 |= i3;
                        str20 = str15;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface17;
            i = i9;
            map = map3;
            str2 = str20;
            str3 = str21;
            l = l4;
            l2 = l5;
            referrer = referrer3;
            str4 = strAsInterface20;
            str5 = strAsInterface21;
            strAsInterface2 = strAsInterface23;
            str6 = strAsInterface24;
            strAsInterface3 = strAsInterface25;
            str7 = strAsInterface26;
            str8 = strAsInterface28;
            str9 = strAsInterface29;
            strAsInterface4 = strAsInterface30;
            str10 = str19;
            str11 = strAsInterface19;
            str12 = strAsInterface27;
            str13 = strAsInterface18;
            str14 = strAsInterface22;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new AppEventPayloadV3(i, l2, str5, str7, str12, map, str14, str13, strAsInterface3, str11, str6, strAsInterface2, str4, strAsInterface, str, str8, strAsInterface4, l, str9, str3, referrer, str10, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m87deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AppEventPayloadV3 appEventPayloadV3Deserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return appEventPayloadV3Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppEventPayloadV3 appEventPayloadV3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appEventPayloadV3, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        AppEventPayloadV3.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), -767472166, new Object[]{appEventPayloadV3, vylVarOnExtraCallback, serialDescriptor}, iOnExtraCallbackWithResult, 767472169, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppEventPayloadV3) obj);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cAlpha = (char) Color.alpha(i3);
                        int i10 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, i10, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12434 - (ViewConfiguration.getTapTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16013), 14 - Color.green(0), 19901 - (ViewConfiguration.getTouchSlop() >> 8), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 13;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 3;
            }
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallback = (char) 15869;
        onExtraCallbackWithResult = (char) 64906;
        IAuthTabCallback = (char) 60713;
        onWarmupCompleted = (char) 43565;
    }
}
