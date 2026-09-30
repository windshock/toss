package im.toss.appsintoss.iap.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class AppsInTossPurchasedHistoryItem$$serializer implements aeu2<AppsInTossPurchasedHistoryItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AppsInTossPurchasedHistoryItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        AppsInTossPurchasedHistoryItem$$serializer appsInTossPurchasedHistoryItem$$serializer = new AppsInTossPurchasedHistoryItem$$serializer();
        INSTANCE = appsInTossPurchasedHistoryItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem", appsInTossPurchasedHistoryItem$$serializer, 8);
        setanimationsloop.onWarmupCompleted("orderId", false);
        setanimationsloop.onWarmupCompleted("miniAppIconUrl", false);
        setanimationsloop.onWarmupCompleted("itemName", false);
        setanimationsloop.onWarmupCompleted("productId", false);
        setanimationsloop.onWarmupCompleted("appName", false);
        setanimationsloop.onWarmupCompleted("price", false);
        Object[] objArr = new Object[1];
        a(new int[]{2079492995, -614058254}, 4 - TextUtils.getCapsMode("", 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("txDate", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 29;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AppsInTossPurchasedHistoryItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer};
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossPurchasedHistoryItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String strAsInterface;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 7;
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            str7 = strAsInterface4;
            str2 = strAsInterface3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            str4 = strAsInterface8;
            str5 = strAsInterface7;
            str6 = strAsInterface5;
            str = strAsInterface6;
            str3 = str8;
            i = 255;
        } else {
            int i6 = 0;
            boolean z = true;
            String strAsInterface9 = null;
            String str9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i5 = 7;
                    case 0:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 7;
                    case 1:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                        i6 |= 2;
                        int i7 = IAuthTabCallback + 1;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        i5 = 7;
                    case 2:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 7;
                    case 3:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 7;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                        int i9 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 7;
                    case 5:
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i6 |= 32;
                    case 6:
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i6 |= 64;
                    case 7:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i6 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i11 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i = i6;
            str = strAsInterface2;
            str2 = strAsInterface9;
            str3 = str9;
            strAsInterface = strAsInterface10;
            str4 = strAsInterface11;
            str5 = strAsInterface12;
            str6 = strAsInterface13;
            str7 = strAsInterface14;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossPurchasedHistoryItem(i, str2, str3, str7, str6, str, str5, str4, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m68deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItemDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return appsInTossPurchasedHistoryItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossPurchasedHistoryItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppsInTossPurchasedHistoryItem.onExtraCallbackWithResult(appsInTossPurchasedHistoryItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppsInTossPurchasedHistoryItem) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i6 = -1469660336;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 37;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i9 = $10 + 17;
                $11 = i9 % 128;
                if (i9 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getTouchSlop() >> 8) + 72, 8847 - TextUtils.lastIndexOf("", '0', 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i3 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 72, 8848 - View.MeasureSpec.getMode(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i3++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 2;
                i6 = -1469660336;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        long j = 0;
        if (iArr5 != null) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i7] = Integer.valueOf(iArr5[i12]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 73 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i12++;
                j = 0;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            while (i13 < 16) {
                int i14 = $10 + 101;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 22253), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, Process.getGidForName("") + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i13 += 127;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 22253), TextUtils.getOffsetBefore("", 0) + 39, TextUtils.indexOf("", "", 0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i13++;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4033), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77, TextUtils.getOffsetBefore("", 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i18 = $11 + 89;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new int[]{-2058889178, 1315580141, 1667323503, 329174456, 1073874620, 767518781, -1140977146, -1656474123, -2032888989, 218030765, -2030672695, 1695869514, 1582371760, -113741811, -1148764858, -1081752012, -1921968446, -507415154};
    }
}
