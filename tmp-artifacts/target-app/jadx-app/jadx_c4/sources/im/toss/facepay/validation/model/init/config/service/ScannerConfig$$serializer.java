package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class ScannerConfig$$serializer implements aeu2<ScannerConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final ScannerConfig$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int[] onExtraCallbackWithResult = null;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    private ScannerConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        ScannerConfig$$serializer scannerConfig$$serializer = new ScannerConfig$$serializer();
        INSTANCE = scannerConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{5, 1, 20, 24, '\b', 2, 30, 20, 15, 21, '!', 1, '\f', 16, 18, 19, 3, 21, 28, '\n', '\t', '\f', 28, 2, 5, ' ', 24, 6, 0, '\b', 4, 21, 22, 0, '\"', 5, 24, 20, ' ', 1, '!', 11, 1, '\n', 20, 30, 5, 27, '\"', 3, '!', 1, 24, 0, '!', '\r', 13816, 13816, 5, 27, '\b', 4, '!', 11, 1, '\n'}, (byte) (Color.argb(0, 0, 0, 0) + 4), 66 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), scannerConfig$$serializer, 7);
        Object[] objArr2 = new Object[1];
        b(new int[]{-1539611731, -1955781903, 727762249, -1166865614, -1961958212, -764682167, -2076245957, -2103698269}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{27, 5, ' ', 1, 13824, 13824, 1, '!', 28, 2, 5, ' ', '#', 30, 27, 2, 27, '#', 16, 21, 26, '\"'}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(new char[]{' ', 1, 13855, 13855, 1, '!', 28, 2, 5, ' ', '\t', 16, ' ', 19, 4, 27, 5, '\"', 28, 27, 13866}, (byte) (42 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        b(new int[]{554537571, -758690890, 620844330, -51395074, -2110494644, -2000828121}, 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        a(new char[]{24, 28, 13907, 13907, 5, 27, '\b', 4, 29, '!', 13901}, (byte) (95 - (ViewConfiguration.getEdgeSlop() >> 16)), 11 - KeyEvent.keyCodeFromString(""), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        a(new char[]{'\t', 0, '\"', 3, '!', 1, 2, 4, 27, 24, 20, 17, 28, 24, 14, 27, 5, 3, '\"', 29, 5, '\"', 28, 27, 13926}, (byte) (103 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 25 - TextUtils.indexOf("", "", 0), objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        a(new char[]{20, 4, '!', '\r', 28, 16, '\r', '!', 21, 2, '\"', '\n', '!', 29, 27, 2}, (byte) (44 - Color.alpha(0)), 16 - KeyEvent.getDeadChar(0, 0), objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 91;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, getdynamicheight, getBgColor.IAuthTabCallback, getdynamicheight, getdynamicheight, getdynamicheight};
        int i4 = asInterface + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ScannerConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        int i2;
        int iOnTransact;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        char c;
        boolean z2;
        char c2;
        int i7 = 2 % 2;
        int i8 = asInterface + 9;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z3 = true;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            int iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            int iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            int iOnTransact5 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            int iOnTransact6 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
            i = iOnTransact4;
            i2 = iOnTransact2;
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 6);
            i3 = iOnTransact6;
            z = zOnExtraCallbackWithResult;
            i4 = iOnTransact5;
            i5 = iOnTransact3;
            i6 = 127;
        } else {
            int iOnTransact7 = 0;
            int iOnTransact8 = 0;
            int iOnTransact9 = 0;
            int iOnTransact10 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact11 = 0;
            int iOnTransact12 = 0;
            int i10 = 0;
            boolean z4 = true;
            while (z4 == z3) {
                int i11 = asInterface + 91;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z4 = false;
                        z3 = true;
                    case 0:
                        z2 = true;
                        c2 = 3;
                        i10 |= 1;
                        iOnTransact8 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        z3 = z2;
                    case 1:
                        z2 = true;
                        c2 = 3;
                        iOnTransact12 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i10 |= 2;
                        z3 = z2;
                    case 2:
                        c = 3;
                        iOnTransact7 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                        i10 |= 4;
                        z3 = true;
                    case 3:
                        c = 3;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i10 |= 8;
                        z3 = true;
                    case 4:
                        iOnTransact11 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i10 |= 16;
                        int i13 = asBinder + 105;
                        asInterface = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 4 / 4;
                        }
                        z3 = true;
                    case 5:
                        iOnTransact10 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
                        i10 |= 32;
                        z3 = true;
                    case 6:
                        iOnTransact9 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 6);
                        i10 |= 64;
                        z3 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = iOnTransact7;
            i2 = iOnTransact8;
            iOnTransact = iOnTransact9;
            i3 = iOnTransact10;
            z = zOnExtraCallbackWithResult2;
            i4 = iOnTransact11;
            i5 = iOnTransact12;
            i6 = i10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScannerConfig(i6, i2, i5, i, z, i4, i3, iOnTransact, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m335deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        ScannerConfig scannerConfigDeserialize = deserialize(decoder);
        int i3 = asInterface + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return scannerConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScannerConfig scannerConfig) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scannerConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ScannerConfig.onNavigationEvent(scannerConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScannerConfig) obj);
        int i4 = asBinder + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        long j = 0;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 71, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(i4) + 72, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i4;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        int i11 = $10 + 17;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 4 / 2;
        }
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - Process.getGidForName("")), 39 - Drawable.resolveOpacity(0, 0), 10301 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 4033), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 77, 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 19;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 26 - (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), 23138 - MotionEvent.axisFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i9 = $10 + 95;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i11 = $10 + 25;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i12 = $11 + 65;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - TextUtils.getCapsMode("", 0, 0)), 74 - TextUtils.getOffsetBefore("", 0), 8088 - TextUtils.getOffsetAfter("", 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i13 = $11 + 53;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777246, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i16 = $11 + 55;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                            } else {
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                int i23 = $10 + 97;
                $11 = i23 % 128;
                int i24 = i23 % 2;
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{64990, 64993, 64988, 64982, 64986, 64979, 64983, 64980, 65070, 64981, 65008, 65066, 65067, 65071, 65015, 64978, 65064, 64963, 64925, 65065, 64987, 65068, 64991, 64970, 65069, 64977, 64967, 64966, 65022, 64961, 64992, 64976, 64960, 64965, 65018, 64989};
        IAuthTabCallback = (char) 51247;
        onExtraCallbackWithResult = new int[]{172174666, -994509339, -1854214429, -1654403068, -228435389, 1741983415, -1890053059, 979856264, -1763584156, 216529389, 1584125498, -1894819018, -1650041801, -1306970490, -1986639086, 599219978, -1395361593, 229887359};
    }
}
