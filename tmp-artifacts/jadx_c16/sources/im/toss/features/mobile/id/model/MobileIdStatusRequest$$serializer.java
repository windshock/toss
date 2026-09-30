package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
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
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdStatusRequest$$serializer implements aeu2<MobileIdStatusRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final MobileIdStatusRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        MobileIdStatusRequest$$serializer mobileIdStatusRequest$$serializer = new MobileIdStatusRequest$$serializer();
        INSTANCE = mobileIdStatusRequest$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{-174637240, 189430961, -1254258585, 1873455233, -1455187451, 2014065252, 1840324474, -1364870056, -1170787810, -177424642, -944782422, -952281003, -706963060, 1429187756, -458228342, -2087768811, -514904967, 472805686, -1784773987, 721964454, 1955101316, -691991463, 1626217624, 867738519, -1314893590, 1724193151, 579767198, -1956678998}, Color.red(0) + 54, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), mobileIdStatusRequest$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(new int[]{-2113279802, -1597565205}, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new int[]{-1611071164, 2068023593, 89345727, -2091790423, -1335445189, 1970591610}, (ViewConfiguration.getEdgeSlop() >> 16) + 9, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new int[]{-627759699, 1645457501}, TextUtils.getCapsMode("", 0, 0) + 4, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a(new int[]{1599933166, 789603946, -1012793181, -677158081, -187321647, 331616548}, ExpandableListView.getPackedPositionGroup(0L) + 10, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private MobileIdStatusRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MobileIdStatusRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface3;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str2 = strAsInterface4;
            i = 15;
        } else {
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int i4 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult + 21;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent == 1) {
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i7 + 109;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i3 |= 110;
                        } else {
                            strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i3 |= 8;
                        }
                    }
                } else {
                    strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                }
            }
            strAsInterface = strAsInterface5;
            str = strAsInterface6;
            strAsInterface2 = strAsInterface7;
            str2 = strAsInterface8;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MobileIdStatusRequest(i, str, str2, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m667deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MobileIdStatusRequest mobileIdStatusRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(mobileIdStatusRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MobileIdStatusRequest.onExtraCallback(mobileIdStatusRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mobileIdStatusRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MobileIdStatusRequest.onExtraCallback(mobileIdStatusRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MobileIdStatusRequest) obj);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 31;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> i5), 72 - (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i5 = 16;
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
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 71 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i10++;
                i4 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i6;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 3;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22252), MotionEvent.axisFromString("") + 40, 10301 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4033), (ViewConfiguration.getPressedStateDuration() >> 16) + 78, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new int[]{-1879416993, -278634043, 1911511952, -1983472061, -591905624, -32792900, 1925661015, -888677107, -1662066816, -978340974, 1026594304, 1764997051, -107367656, 421458223, -884682022, 1425448892, 2008033501, -1294410594};
    }
}
