package im.toss.facepay.validation.model.init.config;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.quality.BlurConfig;
import im.toss.facepay.validation.model.init.config.quality.BlurConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.BrightnessConfig;
import im.toss.facepay.validation.model.init.config.quality.BrightnessConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.DetectionConfig;
import im.toss.facepay.validation.model.init.config.quality.DetectionConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.GeometricConfig;
import im.toss.facepay.validation.model.init.config.quality.GeometricConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig;
import im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.QcV2Config;
import im.toss.facepay.validation.model.init.config.quality.QcV2Config$$serializer;
import im.toss.facepay.validation.model.init.config.quality.StabilityConfig;
import im.toss.facepay.validation.model.init.config.quality.StabilityConfig$$serializer;
import im.toss.facepay.validation.model.init.config.quality.StereoImageCompareConfig;
import im.toss.facepay.validation.model.init.config.quality.StereoImageCompareConfig$$serializer;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class QualityModelConfig$$serializer implements aeu2<QualityModelConfig> {
    public static final QualityModelConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback = 1;

    private static String $$c(short s, byte b, int i) {
        int i2 = 105 - (s * 2);
        int i3 = (b * 2) + 4;
        byte[] bArr = $$a;
        int i4 = i * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i3 + i4;
            i3++;
            i2 = i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i3 = i7 + 1;
            i2 += bArr[i3];
        }
    }

    private QualityModelConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent = 0;
        onExtraCallback();
        QualityModelConfig$$serializer qualityModelConfig$$serializer = new QualityModelConfig$$serializer();
        INSTANCE = qualityModelConfig$$serializer;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "") + 63, 38 - TextUtils.getOffsetBefore("", 0), new char[]{65484, 18, 7, '\f', 7, 65484, '\n', 3, 2, '\r', 11, 65484, '\f', '\r', 7, 18, 65535, 2, 7, '\n', 65535, 20, 65484, 23, 65535, 14, 3, 1, 65535, 4, 65484, 17, 17, '\r', 18, 65484, 11, 7, 5, 7, 4, '\f', '\r', 65505, '\n', 3, 2, '\r', 65515, 23, 18, 7, '\n', 65535, 19, 65519, 65484, 5, 7, 4, '\f', '\r', 1}, true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 263, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), qualityModelConfig$$serializer, 8);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, new char[]{65499, 65534, 11, '\t', 0, 2, 65535, 7, '\b', 65500, '\f', '\f', 65534, 7, '\r', 1, 0, 2, 11}, true, 267 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 2, new char[]{2, 0, 65531, 5, 14, 11, 65500, '\b', 7, 65535}, false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 266, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        b(true, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, new int[]{0, 15, 0, 0}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(15 - Color.argb(0, 0, 0, 0), MotionEvent.axisFromString("") + 13, new char[]{65534, 65532, '\r', 2, '\b', 7, 65500, '\b', 7, 65535, 2, 0, 65533, 65534, '\r'}, false, 266 - MotionEvent.axisFromString(""), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        a(16 - TextUtils.indexOf("", ""), 7 - View.MeasureSpec.getMode(0), new char[]{11, 65499, 7, 6, 65534, 1, 65535, 65530, '\n', 1, 65535, 0, '\f', 6, 65533, 11}, false, 268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        b(false, new byte[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1}, new int[]{15, 15, 0, 10}, objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        a(24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 8, new char[]{7, 65507, '\t', 65535, '\f', 65535, 14, '\r', 1, 3, 0, '\b', '\t', 65501, 65535, '\f', 65531, '\n', 7, '\t', 65501, 65535, 1, 65531}, true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 266, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), true);
        Object[] objArr9 = new Object[1];
        a(2 - TextUtils.getOffsetBefore("", 0), 1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{'\"', 65502}, false, 248 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 53;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {PreBrightnessConfig$$serializer.INSTANCE, BlurConfig$$serializer.INSTANCE, GeometricConfig$$serializer.INSTANCE, DetectionConfig$$serializer.INSTANCE, BrightnessConfig$$serializer.INSTANCE, sp.IAuthTabCallback(StabilityConfig$$serializer.INSTANCE), sp.IAuthTabCallback(StereoImageCompareConfig$$serializer.INSTANCE), QcV2Config$$serializer.INSTANCE};
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final QualityModelConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        GeometricConfig geometricConfig;
        BrightnessConfig brightnessConfig;
        int i;
        DetectionConfig detectionConfig;
        StabilityConfig stabilityConfig;
        PreBrightnessConfig preBrightnessConfig;
        BlurConfig blurConfig;
        QcV2Config qcV2Config;
        StereoImageCompareConfig stereoImageCompareConfig;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 7;
        StabilityConfig stabilityConfig2 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = onWarmupCompleted + 37;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            PreBrightnessConfig preBrightnessConfig2 = (PreBrightnessConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, PreBrightnessConfig$$serializer.INSTANCE, (Object) null);
            BlurConfig blurConfig2 = (BlurConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BlurConfig$$serializer.INSTANCE, (Object) null);
            GeometricConfig geometricConfig2 = (GeometricConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, GeometricConfig$$serializer.INSTANCE, (Object) null);
            DetectionConfig detectionConfig2 = (DetectionConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, DetectionConfig$$serializer.INSTANCE, (Object) null);
            BrightnessConfig brightnessConfig2 = (BrightnessConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, BrightnessConfig$$serializer.INSTANCE, (Object) null);
            StabilityConfig stabilityConfig3 = (StabilityConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, StabilityConfig$$serializer.INSTANCE, (Object) null);
            StereoImageCompareConfig stereoImageCompareConfig2 = (StereoImageCompareConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, StereoImageCompareConfig$$serializer.INSTANCE, (Object) null);
            geometricConfig = geometricConfig2;
            preBrightnessConfig = preBrightnessConfig2;
            blurConfig = blurConfig2;
            qcV2Config = (QcV2Config) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 7, QcV2Config$$serializer.INSTANCE, (Object) null);
            stereoImageCompareConfig = stereoImageCompareConfig2;
            stabilityConfig = stabilityConfig3;
            detectionConfig = detectionConfig2;
            brightnessConfig = brightnessConfig2;
            i = 255;
        } else {
            boolean z = true;
            int i7 = 0;
            GeometricConfig geometricConfig3 = null;
            BrightnessConfig brightnessConfig3 = null;
            DetectionConfig detectionConfig3 = null;
            PreBrightnessConfig preBrightnessConfig3 = null;
            BlurConfig blurConfig3 = null;
            QcV2Config qcV2Config2 = null;
            StereoImageCompareConfig stereoImageCompareConfig3 = null;
            while (!(!z)) {
                int i8 = IAuthTabCallbackDefault + 91;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        preBrightnessConfig3 = (PreBrightnessConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, PreBrightnessConfig$$serializer.INSTANCE, preBrightnessConfig3);
                        i7 |= 1;
                        i2 = IAuthTabCallbackDefault + 15;
                        onWarmupCompleted = i2 % 128;
                        int i9 = i2 % 2;
                        i4 = 7;
                    case 1:
                        blurConfig3 = (BlurConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BlurConfig$$serializer.INSTANCE, blurConfig3);
                        i7 |= 2;
                        i4 = 7;
                    case 2:
                        geometricConfig3 = (GeometricConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, GeometricConfig$$serializer.INSTANCE, geometricConfig3);
                        i7 |= 4;
                        i4 = 7;
                    case 3:
                        detectionConfig3 = (DetectionConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, DetectionConfig$$serializer.INSTANCE, detectionConfig3);
                        i7 |= 8;
                        i4 = 7;
                    case 4:
                        brightnessConfig3 = (BrightnessConfig) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, BrightnessConfig$$serializer.INSTANCE, brightnessConfig3);
                        i7 |= 16;
                        i4 = 7;
                    case 5:
                        stabilityConfig2 = (StabilityConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, StabilityConfig$$serializer.INSTANCE, stabilityConfig2);
                        i7 |= 32;
                        i2 = onWarmupCompleted + 111;
                        IAuthTabCallbackDefault = i2 % 128;
                        int i92 = i2 % 2;
                        i4 = 7;
                    case 6:
                        stereoImageCompareConfig3 = (StereoImageCompareConfig) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, StereoImageCompareConfig$$serializer.INSTANCE, stereoImageCompareConfig3);
                        i7 |= 64;
                    case 7:
                        qcV2Config2 = (QcV2Config) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, QcV2Config$$serializer.INSTANCE, qcV2Config2);
                        i7 |= 128;
                        int i10 = IAuthTabCallbackDefault + 39;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            geometricConfig = geometricConfig3;
            brightnessConfig = brightnessConfig3;
            i = i7;
            detectionConfig = detectionConfig3;
            stabilityConfig = stabilityConfig2;
            preBrightnessConfig = preBrightnessConfig3;
            blurConfig = blurConfig3;
            qcV2Config = qcV2Config2;
            stereoImageCompareConfig = stereoImageCompareConfig3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new QualityModelConfig(i, preBrightnessConfig, blurConfig, geometricConfig, detectionConfig, brightnessConfig, stabilityConfig, stereoImageCompareConfig, qcV2Config, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m317deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        QualityModelConfig qualityModelConfigDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return qualityModelConfigDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull QualityModelConfig qualityModelConfig) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(qualityModelConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        QualityModelConfig.onWarmupCompleted(qualityModelConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (QualityModelConfig) obj);
        int i4 = IAuthTabCallbackDefault + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 35126), ImageFormat.getBitsPerPixel(0) + 24, 10278 - (ViewConfiguration.getWindowTouchSlop() >> 8), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 12844), 55 - TextUtils.indexOf("", "", 0, 0), 2166 - TextUtils.indexOf((CharSequence) "", '0'), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 65;
            $10 = i7 % 128;
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
            int i9 = $10 + 11;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) / 0];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 55 - View.MeasureSpec.getSize(0), 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, 2167 - View.getDefaultSize(0, 0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onExtraCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = $10 + 31;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 35283), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, ((Process.getThreadPriority(0) + 20) >> 6) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 35283), 35 - Color.blue(0), 14238 - ((byte) KeyEvent.getModifierMetaStateMask()), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i10 = $10 + 21;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 29 - Color.red(0), Color.rgb(0, 0, 0) + 16794873, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 65 - Drawable.resolveOpacity(0, 0), 16717 - ImageFormat.getBitsPerPixel(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.MeasureSpec.getSize(0)), 69 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i13 = $11 + 107;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i16 = $10 + 15;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[i17] = cArr3[0];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i19 = $11 + 81;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 478309005;
        onExtraCallback = new char[]{27261, 27174, 27177, 27172, 27168, 27159, 27165, 27176, 27171, 27197, 27170, 27175, 27168, 27172, 27176, 27256, 27172, 27168, 27192, 27152, 27159, 27168, 27172, 27177, 27174, 27171, 27197, 27172, 27183, 27179};
    }
}
