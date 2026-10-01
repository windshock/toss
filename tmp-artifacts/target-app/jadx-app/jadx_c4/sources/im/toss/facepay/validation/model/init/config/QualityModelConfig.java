package im.toss.facepay.validation.model.init.config;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class QualityModelConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int[] IAuthTabCallback = null;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private final BlurConfig blurConfig;
    private final BrightnessConfig brightnessConfig;
    private final DetectionConfig detectionConfig;
    private final GeometricConfig geometricConfig;
    private final PreBrightnessConfig preBrightnessConfig;
    private final StabilityConfig stabilityConfig;
    private final StereoImageCompareConfig stereoImageCompareConfig;
    private final QcV2Config v2;

    static {
        asBinder();
        Companion = new Companion(null);
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public QualityModelConfig() {
        this((PreBrightnessConfig) null, (BlurConfig) null, (GeometricConfig) null, (DetectionConfig) null, (BrightnessConfig) null, (StabilityConfig) null, (StereoImageCompareConfig) null, (QcV2Config) null, 255, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityModelConfig)) {
            return false;
        }
        QualityModelConfig qualityModelConfig = (QualityModelConfig) obj;
        if (!Intrinsics.areEqual(this.preBrightnessConfig, qualityModelConfig.preBrightnessConfig)) {
            int i2 = asInterface + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.blurConfig, qualityModelConfig.blurConfig)) {
            int i4 = onWarmupCompleted + 57;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.geometricConfig, qualityModelConfig.geometricConfig)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.detectionConfig, qualityModelConfig.detectionConfig)) {
            int i6 = asInterface + 37;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.brightnessConfig, qualityModelConfig.brightnessConfig)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.stabilityConfig, qualityModelConfig.stabilityConfig)) {
            int i8 = asInterface + 39;
            onWarmupCompleted = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.stereoImageCompareConfig, qualityModelConfig.stereoImageCompareConfig)) {
            int i9 = asInterface + 27;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.v2, qualityModelConfig.v2)) {
            return true;
        }
        int i11 = onWarmupCompleted + 81;
        int i12 = i11 % 128;
        asInterface = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 117;
        onWarmupCompleted = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 98 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.preBrightnessConfig.hashCode();
        int iHashCode3 = this.blurConfig.hashCode();
        int iHashCode4 = this.geometricConfig.hashCode();
        int iHashCode5 = this.detectionConfig.hashCode();
        int iHashCode6 = this.brightnessConfig.hashCode();
        StabilityConfig stabilityConfig = this.stabilityConfig;
        int iHashCode7 = 0;
        if (stabilityConfig == null) {
            int i2 = onWarmupCompleted + 35;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = stabilityConfig.hashCode();
        }
        StereoImageCompareConfig stereoImageCompareConfig = this.stereoImageCompareConfig;
        if (stereoImageCompareConfig != null) {
            int i4 = asInterface + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                stereoImageCompareConfig.hashCode();
                throw null;
            }
            iHashCode7 = stereoImageCompareConfig.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + this.v2.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        PreBrightnessConfig preBrightnessConfig = this.preBrightnessConfig;
        BlurConfig blurConfig = this.blurConfig;
        GeometricConfig geometricConfig = this.geometricConfig;
        DetectionConfig detectionConfig = this.detectionConfig;
        BrightnessConfig brightnessConfig = this.brightnessConfig;
        StabilityConfig stabilityConfig = this.stabilityConfig;
        StereoImageCompareConfig stereoImageCompareConfig = this.stereoImageCompareConfig;
        QcV2Config qcV2Config = this.v2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{359120433, -1184029800, -571361644, -598513205, -1380305715, -1088105618, 33767234, -478702210, -1572372984, 1632509303, 54518586, 527913867, 1706372901, 1324424666, -1489405220, -1416677644, 33767234, -478702210, 1644978756, -886480321}, (KeyEvent.getMaxKeyCode() >> 16) + 39, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(preBrightnessConfig);
        Object[] objArr2 = new Object[1];
        a(new int[]{-1589103132, -175635386, -1950387211, -1187799468, -2104031244, -141834408, 349936958, 2132846165}, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(blurConfig);
        Object[] objArr3 = new Object[1];
        b(new char[]{36011, 44668, 51542, 58483, 1924, 8877, 24000, 32526, 39469, 46429, 53354, 62381, 11948, 18934, 27419, 34363, 41296, 56369}, ExpandableListView.getPackedPositionChild(0L) + 8924, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(geometricConfig);
        Object[] objArr4 = new Object[1];
        a(new int[]{1077638653, -1921936858, -1639612324, -886852304, 2047096731, -1370902579, 2093294030, 34786330, 1558186475, 2106874555}, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(detectionConfig);
        Object[] objArr5 = new Object[1];
        b(new char[]{36011, 43988, 49667, 64172, 4386, 18911, 24669, 39126, 46961, 61417, 1674, 15621, 21920, 35903, 42147, 50012, 64478, 4675, 19116}, 10098 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(brightnessConfig);
        Object[] objArr6 = new Object[1];
        a(new int[]{1040524400, -2002383010, -2044797949, -914653938, 1886245234, -464108956, 2093294030, 34786330, 1558186475, 2106874555}, 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(stabilityConfig);
        Object[] objArr7 = new Object[1];
        a(new int[]{1040524400, -2002383010, -651700747, -333206486, 1744725963, -453602260, -1471663549, -453643217, 1799793105, 725951711, 33767234, -478702210, 1644978756, -886480321}, 27 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(stereoImageCompareConfig);
        Object[] objArr8 = new Object[1];
        a(new int[]{-1668468009, 475073490, 349936958, 2132846165}, 5 - TextUtils.getCapsMode("", 0, 0), objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(qcV2Config);
        Object[] objArr9 = new Object[1];
        b(new char[]{36014}, TextUtils.getOffsetAfter("", 0) + 59, objArr9);
        sb.append(((String) objArr9[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QualityModelConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                QualityModelConfig$$serializer qualityModelConfig$$serializer = QualityModelConfig$$serializer.INSTANCE;
                throw null;
            }
            QualityModelConfig$$serializer qualityModelConfig$$serializer2 = QualityModelConfig$$serializer.INSTANCE;
            int i3 = onExtraCallback + 21;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return qualityModelConfig$$serializer2;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ QualityModelConfig(int i, PreBrightnessConfig preBrightnessConfig, BlurConfig blurConfig, GeometricConfig geometricConfig, DetectionConfig detectionConfig, BrightnessConfig brightnessConfig, StabilityConfig stabilityConfig, StereoImageCompareConfig stereoImageCompareConfig, QcV2Config qcV2Config, okycx okycxVar) {
        this.preBrightnessConfig = (i & 1) == 0 ? new PreBrightnessConfig(0.0d, 0.0d, 0.0d, false, 15, (DefaultConstructorMarker) null) : preBrightnessConfig;
        if ((i & 2) != 0) {
            this.blurConfig = blurConfig;
            int i2 = asInterface + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
            }
            if ((i & 4) != 0) {
                this.geometricConfig = new GeometricConfig(0.0d, 0.0d, 0.0f, (String) null, 15, (DefaultConstructorMarker) null);
                int i3 = 2 % 2;
            } else {
                this.geometricConfig = geometricConfig;
            }
            this.detectionConfig = (i & 8) != 0 ? new DetectionConfig(0, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null) : detectionConfig;
            if ((i & 16) != 0) {
                this.brightnessConfig = new BrightnessConfig(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
                int i4 = asInterface + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } else {
                this.brightnessConfig = brightnessConfig;
            }
            if ((i & 32) != 0) {
                this.stabilityConfig = new StabilityConfig((Double) null, (Double) null, (Double) null, 0.0d, 0, 31, (DefaultConstructorMarker) null);
            } else {
                this.stabilityConfig = stabilityConfig;
                int i7 = 2 % 2;
            }
            this.stereoImageCompareConfig = (i & 64) != 0 ? new StereoImageCompareConfig((Double) null, 0.0d, 3, (DefaultConstructorMarker) null) : stereoImageCompareConfig;
            int i8 = onWarmupCompleted + 97;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            if ((i & 128) != 0) {
                this.v2 = new QcV2Config(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0f, 511, (DefaultConstructorMarker) null);
                return;
            } else {
                this.v2 = qcV2Config;
                return;
            }
        }
        this.blurConfig = new BlurConfig(0, 0.0d, 3, (DefaultConstructorMarker) null);
        int i10 = 2 % 2;
        if ((i & 4) != 0) {
        }
        this.detectionConfig = (i & 8) != 0 ? new DetectionConfig(0, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null) : detectionConfig;
        if ((i & 16) != 0) {
        }
        if ((i & 32) != 0) {
        }
        this.stereoImageCompareConfig = (i & 64) != 0 ? new StereoImageCompareConfig((Double) null, 0.0d, 3, (DefaultConstructorMarker) null) : stereoImageCompareConfig;
        int i82 = onWarmupCompleted + 97;
        asInterface = i82 % 128;
        int i92 = i82 % 2;
        if ((i & 128) != 0) {
        }
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(QualityModelConfig qualityModelConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(qualityModelConfig.preBrightnessConfig, new PreBrightnessConfig(0.0d, 0.0d, 0.0d, false, 15, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, PreBrightnessConfig$$serializer.INSTANCE, qualityModelConfig.preBrightnessConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(qualityModelConfig.blurConfig, new BlurConfig(0, 0.0d, 3, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, BlurConfig$$serializer.INSTANCE, qualityModelConfig.blurConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(qualityModelConfig.geometricConfig, new GeometricConfig(0.0d, 0.0d, 0.0f, (String) null, 15, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, GeometricConfig$$serializer.INSTANCE, qualityModelConfig.geometricConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || (!Intrinsics.areEqual(qualityModelConfig.detectionConfig, new DetectionConfig(0, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null)))) {
            vylVar.onNavigationEvent(serialDescriptor, 3, DetectionConfig$$serializer.INSTANCE, qualityModelConfig.detectionConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(qualityModelConfig.brightnessConfig, new BrightnessConfig(0.0d, 0.0d, 3, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 4, BrightnessConfig$$serializer.INSTANCE, qualityModelConfig.brightnessConfig);
            int i2 = onWarmupCompleted + 53;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(qualityModelConfig.stabilityConfig, new StabilityConfig((Double) null, (Double) null, (Double) null, 0.0d, 0, 31, (DefaultConstructorMarker) null))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, StabilityConfig$$serializer.INSTANCE, qualityModelConfig.stabilityConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(qualityModelConfig.stereoImageCompareConfig, new StereoImageCompareConfig((Double) null, 0.0d, 3, (DefaultConstructorMarker) null))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, StereoImageCompareConfig$$serializer.INSTANCE, qualityModelConfig.stereoImageCompareConfig);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(qualityModelConfig.v2, new QcV2Config(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0f, 511, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 7, QcV2Config$$serializer.INSTANCE, qualityModelConfig.v2);
        }
        int i4 = asInterface + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public QualityModelConfig(@NotNull PreBrightnessConfig preBrightnessConfig, @NotNull BlurConfig blurConfig, @NotNull GeometricConfig geometricConfig, @NotNull DetectionConfig detectionConfig, @NotNull BrightnessConfig brightnessConfig, @Nullable StabilityConfig stabilityConfig, @Nullable StereoImageCompareConfig stereoImageCompareConfig, @NotNull QcV2Config qcV2Config) {
        Intrinsics.checkNotNullParameter(preBrightnessConfig, "");
        Intrinsics.checkNotNullParameter(blurConfig, "");
        Intrinsics.checkNotNullParameter(geometricConfig, "");
        Intrinsics.checkNotNullParameter(detectionConfig, "");
        Intrinsics.checkNotNullParameter(brightnessConfig, "");
        Intrinsics.checkNotNullParameter(qcV2Config, "");
        this.preBrightnessConfig = preBrightnessConfig;
        this.blurConfig = blurConfig;
        this.geometricConfig = geometricConfig;
        this.detectionConfig = detectionConfig;
        this.brightnessConfig = brightnessConfig;
        this.stabilityConfig = stabilityConfig;
        this.stereoImageCompareConfig = stereoImageCompareConfig;
        this.v2 = qcV2Config;
    }

    public /* synthetic */ QualityModelConfig(PreBrightnessConfig preBrightnessConfig, BlurConfig blurConfig, GeometricConfig geometricConfig, DetectionConfig detectionConfig, BrightnessConfig brightnessConfig, StabilityConfig stabilityConfig, StereoImageCompareConfig stereoImageCompareConfig, QcV2Config qcV2Config, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PreBrightnessConfig preBrightnessConfig2;
        BlurConfig blurConfig2;
        StabilityConfig stabilityConfig2;
        QcV2Config qcV2Config2;
        if ((i & 1) != 0) {
            preBrightnessConfig2 = new PreBrightnessConfig(0.0d, 0.0d, 0.0d, false, 15, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        } else {
            preBrightnessConfig2 = preBrightnessConfig;
        }
        if ((i & 2) != 0) {
            blurConfig2 = new BlurConfig(0, 0.0d, 3, (DefaultConstructorMarker) null);
            int i3 = asInterface + 77;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            blurConfig2 = blurConfig;
        }
        GeometricConfig geometricConfig2 = (i & 4) != 0 ? new GeometricConfig(0.0d, 0.0d, 0.0f, (String) null, 15, (DefaultConstructorMarker) null) : geometricConfig;
        DetectionConfig detectionConfig2 = (i & 8) != 0 ? new DetectionConfig(0, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null) : detectionConfig;
        BrightnessConfig brightnessConfig2 = (i & 16) != 0 ? new BrightnessConfig(0.0d, 0.0d, 3, (DefaultConstructorMarker) null) : brightnessConfig;
        if ((i & 32) != 0) {
            stabilityConfig2 = new StabilityConfig((Double) null, (Double) null, (Double) null, 0.0d, 0, 31, (DefaultConstructorMarker) null);
            int i5 = asInterface + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            stabilityConfig2 = stabilityConfig;
        }
        StereoImageCompareConfig stereoImageCompareConfig2 = (i & 64) != 0 ? new StereoImageCompareConfig((Double) null, 0.0d, 3, (DefaultConstructorMarker) null) : stereoImageCompareConfig;
        if ((i & 128) != 0) {
            qcV2Config2 = new QcV2Config(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0f, 511, (DefaultConstructorMarker) null);
            int i7 = 2 % 2;
        } else {
            qcV2Config2 = qcV2Config;
        }
        this(preBrightnessConfig2, blurConfig2, geometricConfig2, detectionConfig2, brightnessConfig2, stabilityConfig2, stereoImageCompareConfig2, qcV2Config2);
    }

    public final PreBrightnessConfig onExtraCallback() {
        PreBrightnessConfig preBrightnessConfig;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            preBrightnessConfig = this.preBrightnessConfig;
            int i4 = 75 / 0;
        } else {
            preBrightnessConfig = this.preBrightnessConfig;
        }
        int i5 = i2 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return preBrightnessConfig;
    }

    public final BlurConfig IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        BlurConfig blurConfig = this.blurConfig;
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return blurConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GeometricConfig onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.geometricConfig;
        }
        throw null;
    }

    public final DetectionConfig onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        DetectionConfig detectionConfig = this.detectionConfig;
        int i5 = i2 + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return detectionConfig;
        }
        throw null;
    }

    public final BrightnessConfig onNavigationEvent() {
        BrightnessConfig brightnessConfig;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            brightnessConfig = this.brightnessConfig;
            int i4 = 84 / 0;
        } else {
            brightnessConfig = this.brightnessConfig;
        }
        int i5 = i2 + 121;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return brightnessConfig;
        }
        throw null;
    }

    public final StabilityConfig onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        StabilityConfig stabilityConfig = this.stabilityConfig;
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return stabilityConfig;
    }

    public final QcV2Config IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        QcV2Config qcV2Config = this.v2;
        int i5 = i3 + 19;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return qcV2Config;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 71;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 121;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 25, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (onNavigationEvent & 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6383 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                    try {
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $11 + 75;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), Color.blue(0) + 59, KeyEvent.getDeadChar(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 60, 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        long j = 0;
        int i3 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 72 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), View.getDefaultSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i4++;
                    j = 0;
                    i3 = -1469660336;
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                int i6 = $10 + 21;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i5] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i5])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), Color.argb(0, 0, 0, 0) + 72, 8848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i5] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i5++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i7];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.blue(0)), 39 - View.resolveSize(0, 0), 10301 - KeyEvent.normalizeMetaState(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i7++;
            }
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i9;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 78, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i12 = $10 + 39;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void asBinder() {
        IAuthTabCallback = new int[]{-1978214170, -1492726034, -1110069975, -1023889023, -1855632498, 497526105, 705094669, 1851247664, 1176094174, 1628277775, 1452146066, -1247764965, 772233178, 1489172508, 838415572, 129168837, -196509087, -1763580144};
        onNavigationEvent = -6360449975144740432L;
    }
}
