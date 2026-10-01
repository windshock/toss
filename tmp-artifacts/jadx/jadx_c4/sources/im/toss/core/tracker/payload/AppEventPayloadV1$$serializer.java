package im.toss.core.tracker.payload;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.appInfo;
import o.getWriggleLayout;
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
public final /* synthetic */ class AppEventPayloadV1$$serializer implements aeu2<AppEventPayloadV1> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final AppEventPayloadV1$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        AppEventPayloadV1$$serializer appEventPayloadV1$$serializer = new AppEventPayloadV1$$serializer();
        INSTANCE = appEventPayloadV1$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("v1", appEventPayloadV1$$serializer, 21);
        Object[] objArr = new Object[1];
        a(new int[]{877902536, -447551831, 1029756260, -243798594}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, objArr);
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
        a(new int[]{2118523041, -2077491474, -1807355711, 876680205}, 8 - KeyEvent.getDeadChar(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("locale", true);
        Object[] objArr3 = new Object[1];
        a(new int[]{-1628889044, 525116161, -239921136, -401504994}, 4 - TextUtils.lastIndexOf("", '0'), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted(new appInfo("_type") { // from class: im.toss.core.tracker.payload.AppEventPayloadV1$$serializer.onNavigationEvent
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final /* synthetic */ String IAuthTabCallback;

            {
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
            }

            public final /* synthetic */ String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 45;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
                return str;
            }

            public final /* synthetic */ Class annotationType() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 5;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return appInfo.class;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (!(obj instanceof appInfo)) {
                    return false;
                }
                if (Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                    int i2 = onWarmupCompleted + 111;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = onNavigationEvent + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return 707790692 ^ this.IAuthTabCallback.hashCode();
                }
                int i3 = 3 / 0;
                return 707790692 ^ this.IAuthTabCallback.hashCode();
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.IAuthTabCallback + ")";
                int i2 = onWarmupCompleted + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        });
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 15;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AppEventPayloadV1$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = AppEventPayloadV1.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[3].getValue()), kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(oty1.onExtraCallback), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(Referrer$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppEventPayloadV1 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        String str;
        int i;
        Map map;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Referrer referrer;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2;
        int i3;
        String str19;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = AppEventPayloadV1.onExtraCallbackWithResult();
        int i6 = 10;
        int i7 = 7;
        int i8 = 8;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            Map map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            String strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
            String strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
            String strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, oty1.onExtraCallback, (Object) null);
            String strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getwrigglelayout, (Object) null);
            Referrer referrer2 = (Referrer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, Referrer$$serializer.INSTANCE, (Object) null);
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getwrigglelayout, (Object) null);
            referrer = referrer2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, getwrigglelayout, (Object) null);
            str16 = str21;
            str2 = strAsInterface8;
            str15 = str20;
            str12 = strAsInterface3;
            i = 2097151;
            str3 = strAsInterface9;
            str7 = strAsInterface13;
            map = map2;
            str17 = strAsInterface4;
            str6 = strAsInterface14;
            str18 = strAsInterface;
            str8 = strAsInterface12;
            str5 = strAsInterface15;
            str9 = strAsInterface7;
            l = l2;
            str13 = strAsInterface2;
            str4 = strAsInterface10;
            str11 = strAsInterface11;
            str14 = strAsInterface6;
            str10 = strAsInterface5;
        } else {
            Referrer referrer3 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
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
            String strAsInterface29 = null;
            Map map3 = null;
            String strAsInterface30 = null;
            boolean z = true;
            int i9 = 0;
            Long l3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i8 = 8;
                        i6 = 10;
                    case 0:
                        strAsInterface29 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i9 |= 1;
                        i8 = 8;
                        i6 = 10;
                    case 1:
                        strAsInterface28 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i9 |= 2;
                        i8 = 8;
                        i6 = 10;
                    case 2:
                        strAsInterface27 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i9 |= 4;
                        i8 = 8;
                        i6 = 10;
                    case 3:
                        map3 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallbackWithResult[3].getValue(), map3);
                        i9 |= 8;
                        i8 = 8;
                        i6 = 10;
                    case 4:
                        strAsInterface25 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i9 |= 16;
                        i8 = 8;
                    case 5:
                        strAsInterface24 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i9 |= 32;
                        i8 = 8;
                    case 6:
                        strAsInterface30 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i9 |= 64;
                    case 7:
                        strAsInterface23 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                        i9 |= 128;
                    case 8:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i8);
                        i9 |= 256;
                        i7 = 7;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
                        i9 |= 512;
                        i7 = 7;
                    case 10:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        i9 |= 1024;
                        i7 = 7;
                    case 11:
                        strAsInterface26 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
                        i9 |= 2048;
                        i2 = onExtraCallback + 81;
                        IAuthTabCallback = i2 % 128;
                        int i10 = i2 % 2;
                        i7 = 7;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        strAsInterface22 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 12);
                        i9 |= 4096;
                        i7 = 7;
                    case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                        strAsInterface21 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 13);
                        i9 |= 8192;
                        i7 = 7;
                    case 14:
                        strAsInterface20 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 14);
                        i9 |= 16384;
                        i7 = 7;
                    case 15:
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, oty1.onExtraCallback, l3);
                        String str25 = str23;
                        i3 = 32768;
                        str19 = str25;
                        i9 |= i3;
                        int i11 = IAuthTabCallback + 1;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        str23 = str19;
                        i7 = 7;
                    case 16:
                        strAsInterface19 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 16);
                        i9 |= 65536;
                        i2 = IAuthTabCallback + 43;
                        onExtraCallback = i2 % 128;
                        int i102 = i2 % 2;
                        i7 = 7;
                    case 17:
                        i4 = 131072;
                        str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, str22);
                        str19 = str23;
                        i3 = i4;
                        i9 |= i3;
                        int i112 = IAuthTabCallback + 1;
                        onExtraCallback = i112 % 128;
                        int i122 = i112 % 2;
                        str23 = str19;
                        i7 = 7;
                    case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                        i4 = 262144;
                        referrer3 = (Referrer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, Referrer$$serializer.INSTANCE, referrer3);
                        str19 = str23;
                        i3 = i4;
                        i9 |= i3;
                        int i1122 = IAuthTabCallback + 1;
                        onExtraCallback = i1122 % 128;
                        int i1222 = i1122 % 2;
                        str23 = str19;
                        i7 = 7;
                    case 19:
                        i4 = 524288;
                        str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 19, getWriggleLayout.onNavigationEvent, str24);
                        str19 = str23;
                        i3 = i4;
                        i9 |= i3;
                        int i11222 = IAuthTabCallback + 1;
                        onExtraCallback = i11222 % 128;
                        int i12222 = i11222 % 2;
                        str23 = str19;
                        i7 = 7;
                    case 20:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 20, getWriggleLayout.onNavigationEvent, str23);
                        i3 = 1048576;
                        i9 |= i3;
                        int i112222 = IAuthTabCallback + 1;
                        onExtraCallback = i112222 % 128;
                        int i122222 = i112222 % 2;
                        str23 = str19;
                        i7 = 7;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            l = l3;
            str = str23;
            i = i9;
            map = map3;
            str2 = strAsInterface16;
            str3 = strAsInterface17;
            str4 = strAsInterface18;
            str5 = strAsInterface19;
            str6 = strAsInterface20;
            str7 = strAsInterface21;
            str8 = strAsInterface22;
            str9 = strAsInterface23;
            str10 = strAsInterface24;
            str11 = strAsInterface26;
            str12 = strAsInterface27;
            str13 = strAsInterface28;
            str14 = strAsInterface30;
            referrer = referrer3;
            str15 = str22;
            str16 = str24;
            str17 = strAsInterface25;
            str18 = strAsInterface29;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppEventPayloadV1(i, str18, str13, str12, map, str17, str10, str14, str9, str2, str3, str4, str11, str8, str7, str6, l, str5, str15, referrer, str16, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m85deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppEventPayloadV1 appEventPayloadV1Deserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appEventPayloadV1Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppEventPayloadV1 appEventPayloadV1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appEventPayloadV1, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppEventPayloadV1.onExtraCallback(appEventPayloadV1, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appEventPayloadV1, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AppEventPayloadV1.onExtraCallback(appEventPayloadV1, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppEventPayloadV1) obj);
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        long j = 0;
        int i3 = -1469660336;
        char c = '0';
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 72 - TextUtils.indexOf("", ""), AndroidCharacter.getMirror(c) + 8800, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $11 + 35;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i6]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 72 - Color.red(i4), 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i6++;
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i9 = i4;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i9] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 11;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22253), 39 - (ViewConfiguration.getScrollBarSize() >> 8), 10302 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 4033), 78 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7397 - TextUtils.lastIndexOf("", '0', 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i17 = $10 + 51;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new int[]{1570725035, 1599244602, 1296652060, 1033653502, 411987563, -1150121195, 1175983423, -326413864, 16266139, -1350419160, -2010217993, -1583371517, 961191857, -541850317, 1586542077, -282889451, -90805790, -160803889};
    }
}
