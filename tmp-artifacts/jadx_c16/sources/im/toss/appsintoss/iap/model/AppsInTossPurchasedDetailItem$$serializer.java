package im.toss.appsintoss.iap.model;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppsInTossPurchasedDetailItem$$serializer implements aeu2<AppsInTossPurchasedDetailItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AppsInTossPurchasedDetailItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        AppsInTossPurchasedDetailItem$$serializer appsInTossPurchasedDetailItem$$serializer = new AppsInTossPurchasedDetailItem$$serializer();
        INSTANCE = appsInTossPurchasedDetailItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem", appsInTossPurchasedDetailItem$$serializer, 19);
        Object[] objArr = new Object[1];
        a(new char[]{59304, 59356, 49890, 19010, 47962, 43672, 61728, 27598}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("displayOrderId", false);
        setanimationsloop.onWarmupCompleted("orderId", false);
        setanimationsloop.onWarmupCompleted("miniAppTitle", false);
        setanimationsloop.onWarmupCompleted("status", false);
        setanimationsloop.onWarmupCompleted("productName", false);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("purchasedTxDate", false);
        setanimationsloop.onWarmupCompleted("refundedTxDate", false);
        setanimationsloop.onWarmupCompleted("refundRejectReason", false);
        setanimationsloop.onWarmupCompleted("contactEmail", true);
        setanimationsloop.onWarmupCompleted("subscriptionFee", true);
        setanimationsloop.onWarmupCompleted("subscriptionPeriodStart", true);
        setanimationsloop.onWarmupCompleted("subscriptionPeriodEnd", true);
        setanimationsloop.onWarmupCompleted("nextPaymentDate", true);
        setanimationsloop.onWarmupCompleted("appName", true);
        setanimationsloop.onWarmupCompleted("deploymentId", true);
        setanimationsloop.onWarmupCompleted("sku", true);
        setanimationsloop.onWarmupCompleted("expiresAt", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 91;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    private AppsInTossPurchasedDetailItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossPurchasedDetailItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
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
        String str15;
        int i;
        String str16;
        String str17;
        String str18;
        String str19;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i7 = 11;
        int i8 = 10;
        String str20 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str21 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            String str23 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            String str24 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            String str25 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            String str26 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getwrigglelayout, (Object) null);
            String str27 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, (Object) null);
            String str28 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getwrigglelayout, (Object) null);
            String str29 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getwrigglelayout, (Object) null);
            String str30 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getwrigglelayout, (Object) null);
            String str31 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getwrigglelayout, (Object) null);
            int i9 = onWarmupCompleted + 73;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            str17 = str31;
            str5 = str22;
            str6 = str24;
            strAsInterface = strAsInterface9;
            str16 = str23;
            str3 = str30;
            str2 = str29;
            str = str28;
            str4 = str27;
            str8 = str26;
            str7 = str25;
            str13 = strAsInterface3;
            str12 = strAsInterface5;
            str14 = strAsInterface4;
            str15 = strAsInterface2;
            str10 = strAsInterface8;
            str9 = strAsInterface7;
            str11 = strAsInterface6;
            i = 524287;
            str18 = str21;
        } else {
            int i11 = IAuthTabCallback + 91;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 % 3;
            }
            int i13 = 0;
            boolean z = true;
            String strAsInterface10 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            strAsInterface = null;
            String str40 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String str41 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i7 = 11;
                        i8 = 10;
                    case 0:
                        str41 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str41);
                        i13 |= 1;
                        strAsInterface10 = strAsInterface10;
                        i7 = 11;
                        i8 = 10;
                    case 1:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i13 |= 2;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 2:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i13 |= 4;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 3:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i13 |= 8;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 4:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i13 |= 16;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 5:
                        i13 |= 32;
                        i8 = i8;
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i7 = 11;
                    case 6:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i13 |= 64;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 7:
                        str19 = strAsInterface10;
                        i2 = i8;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i13 |= 128;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 8:
                        i2 = i8;
                        str19 = strAsInterface10;
                        str40 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str40);
                        i13 |= 256;
                        i8 = i2;
                        strAsInterface10 = str19;
                        i7 = 11;
                    case 9:
                        str33 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, str33);
                        i13 |= 512;
                        i7 = 11;
                        i8 = i8;
                    case 10:
                        int i14 = i8;
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i14);
                        i13 |= 1024;
                        i8 = i14;
                    case 11:
                        str37 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, getWriggleLayout.onNavigationEvent, str37);
                        i13 |= 2048;
                        i8 = 10;
                    case 12:
                        str38 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str38);
                        i13 |= 4096;
                        i8 = 10;
                    case 13:
                        str39 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, getWriggleLayout.onNavigationEvent, str39);
                        i13 |= 8192;
                        i8 = 10;
                    case 14:
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str20);
                        i13 |= 16384;
                        i8 = 10;
                    case 15:
                        str32 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, str32);
                        i3 = 32768;
                        i13 |= i3;
                        i8 = 10;
                    case 16:
                        str34 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, getWriggleLayout.onNavigationEvent, str34);
                        i3 = 65536;
                        i13 |= i3;
                        i8 = 10;
                    case 17:
                        str36 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 17, getWriggleLayout.onNavigationEvent, str36);
                        i3 = 131072;
                        i13 |= i3;
                        i8 = 10;
                    case 18:
                        str35 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 18, getWriggleLayout.onNavigationEvent, str35);
                        i3 = 262144;
                        i13 |= i3;
                        i8 = 10;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str32;
            str2 = str34;
            str3 = str36;
            str4 = str20;
            str5 = str40;
            str6 = str37;
            str7 = str38;
            str8 = str39;
            str9 = strAsInterface11;
            str10 = strAsInterface12;
            str11 = strAsInterface10;
            str12 = strAsInterface13;
            str13 = strAsInterface14;
            str14 = strAsInterface15;
            str15 = strAsInterface16;
            i = i13;
            str16 = str33;
            str17 = str35;
            str18 = str41;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossPurchasedDetailItem(i, str18, str15, str13, str14, str12, str11, str9, str10, str5, str16, strAsInterface, str6, str7, str8, str4, str, str2, str3, str17, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m49deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItemDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return appsInTossPurchasedDetailItemDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appsInTossPurchasedDetailItem, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(iOnExtraCallback, C40Encoder.onExtraCallback(), 1101380678, iOnExtraCallback2, new Object[]{appsInTossPurchasedDetailItem, vylVarOnExtraCallback, serialDescriptor}, -1101380675, C40Encoder.onExtraCallback());
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossPurchasedDetailItem, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(iOnExtraCallback3, C40Encoder.onExtraCallback(), 1101380678, iOnExtraCallback4, new Object[]{appsInTossPurchasedDetailItem, vylVarOnExtraCallback2, serialDescriptor2}, -1101380675, C40Encoder.onExtraCallback());
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppsInTossPurchasedDetailItem) obj);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = IAuthTabCallback + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 59;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45812), Color.argb(0, 0, 0, 0) + 84, 21234 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Gravity.getAbsoluteGravity(0, 0)), 19 - Color.argb(0, 0, 0, 0), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 81;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallback = -5678592426400287787L;
    }
}
