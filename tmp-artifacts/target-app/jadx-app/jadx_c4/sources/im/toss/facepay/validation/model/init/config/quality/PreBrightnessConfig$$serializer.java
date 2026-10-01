package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class PreBrightnessConfig$$serializer implements aeu2<PreBrightnessConfig> {
    public static final PreBrightnessConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        byte[] bArr = $$a;
        int i2 = 105 - (s * 2);
        int i3 = 4 - (b * 3);
        int i4 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i3;
            i2 = i4;
            i = 0;
            i3++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i3];
            i3++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        }
    }

    private PreBrightnessConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback = 0;
        onWarmupCompleted();
        PreBrightnessConfig$$serializer preBrightnessConfig$$serializer = new PreBrightnessConfig$$serializer();
        INSTANCE = preBrightnessConfig$$serializer;
        Object[] objArr = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 72, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, new char[]{65534, '\t', 6, 17, 22, 65483, 65517, 15, 2, 65503, 15, 6, 4, 5, 17, 11, 2, 16, 16, 65504, '\f', 11, 3, 6, 4, 6, '\n', 65483, 17, '\f', 16, 16, 65483, 3, 65534, 0, 2, '\r', 65534, 22, 65483, 19, 65534, '\t', 6, 1, 65534, 17, 6, '\f', 11, 65483, '\n', '\f', 1, 2, '\t', 65483, 6, 11, 6, 17, 65483, 0, '\f', 11, 3, 6, 4, 65483, 14, 18}, false, ((byte) KeyEvent.getModifierMetaStateMask()) + 217, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), preBrightnessConfig$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 6 - TextUtils.indexOf("", ""), new char[]{'\n', 65529, 65500, 7, 7, '\f', 65532, 4, 7, 0, 11, 65533, '\n', 0, 65516, 3}, true, TextUtils.lastIndexOf("", '0', 0) + 222, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 15 - View.resolveSizeAndState(0, 0, 0), new char[]{65498, '\n', 1, 65535, 0, '\f', 65516, 0, '\n', 65533, 11, 0, 7, 4, 65532, '\f', 7, 7}, false, TextUtils.getOffsetBefore("", 0) + 221, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, new char[]{65534, 3, 15, '\r', 65516, 65531, 14, 3, '\t', 65531, '\f', 65535, 65531, 65516, 65531}, false, 219 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, 2 - TextUtils.getOffsetAfter("", 0), new char[]{15, 5, 0, 1, '\b', 65534, 65533, '\n', 65505}, true, 217 - View.getDefaultSize(0, 0), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 117;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[4];
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            kSerializerArr[1] = setvideolistener;
            kSerializerArr[0] = setvideolistener;
            kSerializerArr[5] = setvideolistener;
            kSerializerArr[3] = getBgColor.IAuthTabCallback;
        } else {
            setVideoListener setvideolistener2 = setVideoListener.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{setvideolistener2, setvideolistener2, setvideolistener2, getBgColor.IAuthTabCallback};
        }
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PreBrightnessConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        double d;
        double d2;
        double d3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = IAuthTabCallback + 33;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            d = dIAuthTabCallback2;
            d2 = dIAuthTabCallback;
            d3 = dIAuthTabCallback3;
            i = 15;
        } else {
            double dIAuthTabCallback4 = 0.0d;
            boolean zOnExtraCallbackWithResult2 = false;
            int i8 = 0;
            boolean z = true;
            double dIAuthTabCallback5 = 0.0d;
            double dIAuthTabCallback6 = 0.0d;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                        i8 |= 1;
                        int i9 = onNavigationEvent + 15;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                    } else if (iOnNavigationEvent != i5) {
                        int i11 = IAuthTabCallback + 79;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 4) {
                            dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                            i8 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                            i8 |= 8;
                        }
                    } else {
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i5);
                        i8 |= 2;
                    }
                    i5 = 1;
                } else {
                    z = false;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            d = dIAuthTabCallback4;
            d2 = dIAuthTabCallback5;
            d3 = dIAuthTabCallback6;
            i = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PreBrightnessConfig(i, d2, d, d3, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m323deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PreBrightnessConfig preBrightnessConfigDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return preBrightnessConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PreBrightnessConfig preBrightnessConfig) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(preBrightnessConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PreBrightnessConfig.onExtraCallback(preBrightnessConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PreBrightnessConfig) obj);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 24, 10278 - TextUtils.indexOf("", "", 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getSize(0) + 55, 2166 - ImageFormat.getBitsPerPixel(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $10 + 49;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i9 = $10 + 105;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 29;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i / simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12843), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2167 - View.resolveSize(0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), 55 - (Process.myTid() >> 22), 2166 - MotionEvent.axisFromString(""), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            int i12 = $10 + 83;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i14 = $10 + 61;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i15 = 42 / 0;
            objArr[0] = str;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 478308956;
    }
}
