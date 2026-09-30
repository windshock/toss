package im.toss.facepay.validation.model.init.config;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.service.AdvertiserConfig;
import im.toss.facepay.validation.model.init.config.service.AutoExposureConfig;
import im.toss.facepay.validation.model.init.config.service.AutoExposureConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.BleConfig;
import im.toss.facepay.validation.model.init.config.service.BleConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.CandidateFrameConfig;
import im.toss.facepay.validation.model.init.config.service.CandidateFrameConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.FailureImageConfig;
import im.toss.facepay.validation.model.init.config.service.OtaConfig;
import im.toss.facepay.validation.model.init.config.service.OtaConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.PostAuthConfig;
import im.toss.facepay.validation.model.init.config.service.PostAuthConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.ResultConfig;
import im.toss.facepay.validation.model.init.config.service.ResultConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.ScannerConfig;
import im.toss.facepay.validation.model.init.config.service.SuccessImageConfig;
import im.toss.facepay.validation.model.init.config.service.SystemConfig;
import im.toss.facepay.validation.model.init.config.service.SystemConfig$$serializer;
import im.toss.facepay.validation.model.init.config.service.WarmUpConfig;
import im.toss.facepay.validation.model.init.config.service.WarmUpConfig$$serializer;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.getDynamicHeight;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ServiceConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;
    private final long approveResultIntervalMs;
    private final long approveResultTimeoutMs;
    private final AutoExposureConfig autoExposure;
    private final BleConfig ble;
    private final CandidateFrameConfig candidateFrame;
    private final long defaultConnectionTimeoutMs;
    private final boolean enableAsyncCaptureSessionForDuo;
    private final Integer initHistoryTTLMinutes;
    private final int initialFrameSkipCount;
    private final OtaConfig ota;
    private final PostAuthConfig postAuth;
    private final ResultConfig result;
    private final SystemConfig system;
    private final WarmUpConfig warmUp;

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = IAuthTabCallback + 123;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 82 / 0;
        }
    }

    public ServiceConfig() {
        this((BleConfig) null, (ResultConfig) null, (SystemConfig) null, (WarmUpConfig) null, (AutoExposureConfig) null, false, (CandidateFrameConfig) null, (PostAuthConfig) null, (Integer) null, 0, (OtaConfig) null, 0L, 0L, 0L, 16383, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceConfig)) {
            int i2 = onExtraCallback;
            int i3 = i2 + 95;
            IAuthTabCallbackStub = i3 % 128;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }
        ServiceConfig serviceConfig = (ServiceConfig) obj;
        if (Intrinsics.areEqual(this.ble, serviceConfig.ble) && Intrinsics.areEqual(this.result, serviceConfig.result)) {
            if (!Intrinsics.areEqual(this.system, serviceConfig.system)) {
                int i5 = onExtraCallback + 9;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.warmUp, serviceConfig.warmUp)) {
                if (!Intrinsics.areEqual(this.autoExposure, serviceConfig.autoExposure)) {
                    int i7 = onExtraCallback + 37;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (this.enableAsyncCaptureSessionForDuo != serviceConfig.enableAsyncCaptureSessionForDuo || !Intrinsics.areEqual(this.candidateFrame, serviceConfig.candidateFrame) || !Intrinsics.areEqual(this.postAuth, serviceConfig.postAuth) || !Intrinsics.areEqual(this.initHistoryTTLMinutes, serviceConfig.initHistoryTTLMinutes) || this.initialFrameSkipCount != serviceConfig.initialFrameSkipCount || !Intrinsics.areEqual(this.ota, serviceConfig.ota)) {
                    return false;
                }
                if (this.defaultConnectionTimeoutMs != serviceConfig.defaultConnectionTimeoutMs) {
                    int i9 = IAuthTabCallbackStub + 97;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (this.approveResultTimeoutMs != serviceConfig.approveResultTimeoutMs) {
                    int i11 = IAuthTabCallbackStub + 71;
                    onExtraCallback = i11 % 128;
                    return i11 % 2 != 0;
                }
                if (this.approveResultIntervalMs == serviceConfig.approveResultIntervalMs) {
                    return true;
                }
                int i12 = IAuthTabCallbackStub + 45;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.ble.hashCode();
        int iHashCode4 = this.result.hashCode();
        int iHashCode5 = this.system.hashCode();
        int iHashCode6 = this.warmUp.hashCode();
        int iHashCode7 = this.autoExposure.hashCode();
        int iHashCode8 = Boolean.hashCode(this.enableAsyncCaptureSessionForDuo);
        CandidateFrameConfig candidateFrameConfig = this.candidateFrame;
        if (candidateFrameConfig == null) {
            int i2 = onExtraCallback + 71;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 5;
            }
            iHashCode = 0;
        } else {
            iHashCode = candidateFrameConfig.hashCode();
        }
        int iHashCode9 = this.postAuth.hashCode();
        Integer num = this.initHistoryTTLMinutes;
        if (num != null) {
            iHashCode2 = num.hashCode();
            int i4 = IAuthTabCallbackStub + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = 0;
        }
        int iHashCode10 = (((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + Integer.hashCode(this.initialFrameSkipCount)) * 31) + this.ota.hashCode()) * 31) + Long.hashCode(this.defaultConnectionTimeoutMs)) * 31) + Long.hashCode(this.approveResultTimeoutMs)) * 31) + Long.hashCode(this.approveResultIntervalMs);
        int i6 = IAuthTabCallbackStub + 63;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return iHashCode10;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        BleConfig bleConfig = this.ble;
        ResultConfig resultConfig = this.result;
        SystemConfig systemConfig = this.system;
        WarmUpConfig warmUpConfig = this.warmUp;
        AutoExposureConfig autoExposureConfig = this.autoExposure;
        boolean z = this.enableAsyncCaptureSessionForDuo;
        CandidateFrameConfig candidateFrameConfig = this.candidateFrame;
        PostAuthConfig postAuthConfig = this.postAuth;
        Integer num = this.initHistoryTTLMinutes;
        int i2 = this.initialFrameSkipCount;
        OtaConfig otaConfig = this.ota;
        long j = this.defaultConnectionTimeoutMs;
        long j2 = this.approveResultTimeoutMs;
        long j3 = this.approveResultIntervalMs;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{39543, 26152, 28134, 39460, 8820, 17413, 10500, 17626, 4926, 52515, 41011, 52687, 34904, 21198, 15184, 23301, 368, 56232, 45684, 8224, 48786, 8413}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(bleConfig);
        Object[] objArr2 = new Object[1];
        b(new char[]{60231, 37490, 6507, 32933, 4092, 46339, 15441, 48016, 8862}, 31032 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(resultConfig);
        Object[] objArr3 = new Object[1];
        a(new char[]{37120, 24397, 12133, 37164, 7909, 32037, 27526, 30788, 6227, 62545, 58032, 61808, 33661}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(systemConfig);
        Object[] objArr4 = new Object[1];
        a(new char[]{19837, 26793, 60454, 19793, 13955, 19137, 43201, 20538, 50223, 50092, 8643, 55563, 24320}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(warmUpConfig);
        Object[] objArr5 = new Object[1];
        b(new char[]{60231, 57084, 32868, 19003, 15811, 59287, 43364, 37650, 18083, 2155, 62014, 42435, 28557, 20805, 6996}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13751, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(autoExposureConfig);
        Object[] objArr6 = new Object[1];
        a(new char[]{9849, 25958, 58992, 9813, 8721, 18190, 41605, 17575, 44856, 52844, 11180, 52620, 13432, 20893, 45273, 23399, 48506, 55437, 14817, 8281, 653, 9179, 36626, 43308, 35722, 43755, 5171, 13850, 4304, 15361, 40270, 49103, 39414, 34620, 57924, 1244, 28438, 3603}, (-1) - ImageFormat.getBitsPerPixel(0), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(z);
        Object[] objArr7 = new Object[1];
        b(new char[]{60231, 58050, 63514, 63377, 52513, 50338, 53812, 43440, 42818, 48846, 46164, 33742, 39285, 37119, 28280, 25609, 29638}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2441, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(candidateFrameConfig);
        Object[] objArr8 = new Object[1];
        a(new char[]{14727, 16922, 50318, 14763, 62345, 24690, 32878, 38206, 45268, 59654, 2431, 7172, 11187, 30458, 37475}, ViewConfiguration.getScrollBarSize() >> 8, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(postAuthConfig);
        Object[] objArr9 = new Object[1];
        b(new char[]{60231, 28018, 59248, 31150, 62438, 29698, 52853, 16525, 56016, 21278, 54590, 12138, 41406, 15322, 48161, 13936, 34998, 715, 39687, 7461, 38763, 59811, 25598, 58441}, TextUtils.indexOf("", "", 0) + 34361, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(num);
        Object[] objArr10 = new Object[1];
        a(new char[]{14706, 15040, 32813, 14686, 7253, 6312, 50388, 31459, 45115, 37340, 19956, 62412, 11102, 3598, 54927, 25900, 41599, 34573, 24462, 7686, 7579, 31864, 59774, 38754, 38055, 62790, 29289, 2064}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(i2);
        Object[] objArr11 = new Object[1];
        a(new char[]{7992, 1965, 54116, 7956, 45434, 9669, 38811, 55254, 38521, 44280}, TextUtils.getOffsetAfter("", 0), objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(otaConfig);
        Object[] objArr12 = new Object[1];
        a(new char[]{28564, 14245, 47371, 28600, 24364, 5581, 65023, 14737, 59090, 40108, 29902, 45240, 32160, 878, 61364, 9818, 62618, 35432, 26264, 23904, 19325, 28930, 53365, 54304, 49757, 63520, 19294, 19259, 22817, 28377, 49686, 49863, 53321}, KeyEvent.keyCodeFromString(""), objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(j);
        Object[] objArr13 = new Object[1];
        a(new char[]{11554, 64797, 52736, 11534, 61403, 57205, 35569, 35187, 42098, 22023, 991, 'U', 16135, 51655, 39093, 38576, 46647, 16601, 4484, 60855, 2507, 48056, 42869, 25836, 33015, 12929, 15485, 64464, 7135}, ViewConfiguration.getTapTimeout() >> 16, objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(j2);
        Object[] objArr14 = new Object[1];
        a(new char[]{57239, 10651, 12049, 57275, 3423, 3059, 27616, 27639, 22215, 33409, 58062, 58065, 52658, 7489, 31140, 29748, 17538, 37983, 61589, 3886, 64377, 28455, 18020, 34421, 29249, 58898, 56653, 6506, 59684, 28846}, KeyEvent.keyCodeFromString(""), objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(j3);
        Object[] objArr15 = new Object[1];
        b(new char[]{60226}, 24247 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
        sb.append(((String) objArr15[0]).intern());
        String string = sb.toString();
        int i3 = IAuthTabCallbackStub + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ServiceConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ServiceConfig$$serializer serviceConfig$$serializer = ServiceConfig$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serviceConfig$$serializer;
        }
    }

    public /* synthetic */ ServiceConfig(int i, BleConfig bleConfig, ResultConfig resultConfig, SystemConfig systemConfig, WarmUpConfig warmUpConfig, AutoExposureConfig autoExposureConfig, boolean z, CandidateFrameConfig candidateFrameConfig, PostAuthConfig postAuthConfig, Integer num, int i2, OtaConfig otaConfig, long j, long j2, long j3, okycx okycxVar) {
        SystemConfig systemConfig2;
        AutoExposureConfig autoExposureConfig2;
        PostAuthConfig postAuthConfig2;
        OtaConfig otaConfig2;
        long j4;
        long j5;
        this.ble = (i & 1) == 0 ? new BleConfig((ScannerConfig) null, (AdvertiserConfig) null, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 2047, (DefaultConstructorMarker) null) : bleConfig;
        int i3 = i & 2;
        Object obj = null;
        this.result = i3 == 0 ? new ResultConfig((FailureImageConfig) null, (SuccessImageConfig) null, 3, (DefaultConstructorMarker) null) : resultConfig;
        int i4 = onExtraCallback;
        int i5 = i4 + 11;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0 ? (i & 4) != 0 : i3 != 0) {
            int i6 = i4 + 81;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            systemConfig2 = systemConfig;
        } else {
            systemConfig2 = new SystemConfig((String) null, 1, (DefaultConstructorMarker) null);
        }
        this.system = systemConfig2;
        if ((i & 8) == 0) {
            this.warmUp = new WarmUpConfig(0, 0L, 0, 7, (DefaultConstructorMarker) null);
            int i9 = 2 % 2;
        } else {
            this.warmUp = warmUpConfig;
        }
        if ((i & 16) == 0) {
            autoExposureConfig2 = new AutoExposureConfig(false, 1, (DefaultConstructorMarker) null);
        } else {
            int i10 = 2 % 2;
            autoExposureConfig2 = autoExposureConfig;
        }
        this.autoExposure = autoExposureConfig2;
        if ((i & 32) == 0) {
            this.enableAsyncCaptureSessionForDuo = false;
        } else {
            this.enableAsyncCaptureSessionForDuo = z;
        }
        if ((i & 64) == 0) {
            this.candidateFrame = null;
        } else {
            this.candidateFrame = candidateFrameConfig;
        }
        if ((i & 128) == 0) {
            postAuthConfig2 = new PostAuthConfig(false, 0L, 3, (DefaultConstructorMarker) null);
            int i11 = 2 % 2;
        } else {
            postAuthConfig2 = postAuthConfig;
        }
        this.postAuth = postAuthConfig2;
        if ((i & 256) == 0) {
            int i12 = onExtraCallback + 87;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
            this.initHistoryTTLMinutes = null;
            if (i13 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.initHistoryTTLMinutes = num;
        }
        if ((i & 512) == 0) {
            int i14 = IAuthTabCallbackStub + 107;
            onExtraCallback = i14 % 128;
            if (i14 % 2 != 0) {
                this.initialFrameSkipCount = 0;
            } else {
                this.initialFrameSkipCount = 1;
            }
        } else {
            this.initialFrameSkipCount = i2;
        }
        if ((i & 1024) == 0) {
            otaConfig2 = new OtaConfig((Map) null, 1, (DefaultConstructorMarker) null);
        } else {
            int i15 = IAuthTabCallbackStub + 93;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            otaConfig2 = otaConfig;
        }
        this.ota = otaConfig2;
        this.defaultConnectionTimeoutMs = (i & 2048) == 0 ? 60000L : j;
        if ((i & 4096) == 0) {
            int i18 = onExtraCallback + 19;
            IAuthTabCallbackStub = i18 % 128;
            int i19 = i18 % 2;
            j4 = 5000;
        } else {
            j4 = j2;
        }
        this.approveResultTimeoutMs = j4;
        int i20 = onExtraCallback;
        int i21 = i20 + 21;
        IAuthTabCallbackStub = i21 % 128;
        if (i21 % 2 != 0 ? (i & 8192) != 0 : (i & 14830) != 0) {
            j5 = j3;
        } else {
            int i22 = i20 + 91;
            IAuthTabCallbackStub = i22 % 128;
            if (i22 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            j5 = 500;
        }
        this.approveResultIntervalMs = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(ServiceConfig serviceConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(serviceConfig.ble, new BleConfig((ScannerConfig) null, (AdvertiserConfig) null, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 2047, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, BleConfig$$serializer.INSTANCE, serviceConfig.ble);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(serviceConfig.result, new ResultConfig((FailureImageConfig) null, (SuccessImageConfig) null, 3, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, ResultConfig$$serializer.INSTANCE, serviceConfig.result);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(serviceConfig.system, new SystemConfig((String) null, 1, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 2, SystemConfig$$serializer.INSTANCE, serviceConfig.system);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(serviceConfig.warmUp, new WarmUpConfig(0, 0L, 0, 7, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 3, WarmUpConfig$$serializer.INSTANCE, serviceConfig.warmUp);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(serviceConfig.autoExposure, new AutoExposureConfig(false, 1, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 4, AutoExposureConfig$$serializer.INSTANCE, serviceConfig.autoExposure);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || serviceConfig.enableAsyncCaptureSessionForDuo) {
            vylVar.onNavigationEvent(serialDescriptor, 5, serviceConfig.enableAsyncCaptureSessionForDuo);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || serviceConfig.candidateFrame != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, CandidateFrameConfig$$serializer.INSTANCE, serviceConfig.candidateFrame);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(serviceConfig.postAuth, new PostAuthConfig(false, 0L, 3, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 7, PostAuthConfig$$serializer.INSTANCE, serviceConfig.postAuth);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i2 = onExtraCallback + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (serviceConfig.initHistoryTTLMinutes != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getDynamicHeight.onWarmupCompleted, serviceConfig.initHistoryTTLMinutes);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 9)) || serviceConfig.initialFrameSkipCount != 1) {
            vylVar.onExtraCallback(serialDescriptor, 9, serviceConfig.initialFrameSkipCount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(serviceConfig.ota, new OtaConfig((Map) null, 1, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 10, OtaConfig$$serializer.INSTANCE, serviceConfig.ota);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
            int i4 = IAuthTabCallbackStub + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (serviceConfig.defaultConnectionTimeoutMs != 60000) {
                vylVar.onExtraCallback(serialDescriptor, 11, serviceConfig.defaultConnectionTimeoutMs);
                int i6 = IAuthTabCallbackStub + 47;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || serviceConfig.approveResultTimeoutMs != 5000) {
            vylVar.onExtraCallback(serialDescriptor, 12, serviceConfig.approveResultTimeoutMs);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 13) || serviceConfig.approveResultIntervalMs != 500) {
            vylVar.onExtraCallback(serialDescriptor, 13, serviceConfig.approveResultIntervalMs);
        }
    }

    public ServiceConfig(@NotNull BleConfig bleConfig, @NotNull ResultConfig resultConfig, @NotNull SystemConfig systemConfig, @NotNull WarmUpConfig warmUpConfig, @NotNull AutoExposureConfig autoExposureConfig, boolean z, @Nullable CandidateFrameConfig candidateFrameConfig, @NotNull PostAuthConfig postAuthConfig, @Nullable Integer num, int i, @NotNull OtaConfig otaConfig, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(bleConfig, "");
        Intrinsics.checkNotNullParameter(resultConfig, "");
        Intrinsics.checkNotNullParameter(systemConfig, "");
        Intrinsics.checkNotNullParameter(warmUpConfig, "");
        Intrinsics.checkNotNullParameter(autoExposureConfig, "");
        Intrinsics.checkNotNullParameter(postAuthConfig, "");
        Intrinsics.checkNotNullParameter(otaConfig, "");
        this.ble = bleConfig;
        this.result = resultConfig;
        this.system = systemConfig;
        this.warmUp = warmUpConfig;
        this.autoExposure = autoExposureConfig;
        this.enableAsyncCaptureSessionForDuo = z;
        this.candidateFrame = candidateFrameConfig;
        this.postAuth = postAuthConfig;
        this.initHistoryTTLMinutes = num;
        this.initialFrameSkipCount = i;
        this.ota = otaConfig;
        this.defaultConnectionTimeoutMs = j;
        this.approveResultTimeoutMs = j2;
        this.approveResultIntervalMs = j3;
    }

    public /* synthetic */ ServiceConfig(BleConfig bleConfig, ResultConfig resultConfig, SystemConfig systemConfig, WarmUpConfig warmUpConfig, AutoExposureConfig autoExposureConfig, boolean z, CandidateFrameConfig candidateFrameConfig, PostAuthConfig postAuthConfig, Integer num, int i, OtaConfig otaConfig, long j, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        ResultConfig resultConfig2;
        WarmUpConfig warmUpConfig2;
        boolean z2;
        CandidateFrameConfig candidateFrameConfig2;
        long j4;
        long j5;
        long j6;
        BleConfig bleConfig2 = (i2 & 1) != 0 ? new BleConfig((ScannerConfig) null, (AdvertiserConfig) null, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 2047, (DefaultConstructorMarker) null) : bleConfig;
        if ((i2 & 2) != 0) {
            resultConfig2 = new ResultConfig((FailureImageConfig) null, (SuccessImageConfig) null, 3, (DefaultConstructorMarker) null);
            int i3 = 2 % 2;
        } else {
            resultConfig2 = resultConfig;
        }
        SystemConfig systemConfig2 = (i2 & 4) != 0 ? new SystemConfig((String) null, 1, (DefaultConstructorMarker) null) : systemConfig;
        if ((i2 & 8) != 0) {
            warmUpConfig2 = new WarmUpConfig(0, 0L, 0, 7, (DefaultConstructorMarker) null);
            int i4 = IAuthTabCallbackStub + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            warmUpConfig2 = warmUpConfig;
        }
        AutoExposureConfig autoExposureConfig2 = (i2 & 16) != 0 ? new AutoExposureConfig(false, 1, (DefaultConstructorMarker) null) : autoExposureConfig;
        if ((i2 & 32) != 0) {
            int i7 = IAuthTabCallbackStub + 31;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 64) != 0) {
            int i9 = 2 % 2;
            candidateFrameConfig2 = null;
        } else {
            candidateFrameConfig2 = candidateFrameConfig;
        }
        PostAuthConfig postAuthConfig2 = (i2 & 128) != 0 ? new PostAuthConfig(false, 0L, 3, (DefaultConstructorMarker) null) : postAuthConfig;
        Integer num2 = (i2 & 256) != 0 ? null : num;
        int i10 = (i2 & 512) != 0 ? 1 : i;
        OtaConfig otaConfig2 = (i2 & 1024) != 0 ? new OtaConfig((Map) null, 1, (DefaultConstructorMarker) null) : otaConfig;
        if ((i2 & 2048) != 0) {
            int i11 = onExtraCallback + 29;
            IAuthTabCallbackStub = i11 % 128;
            j4 = 60000;
            if (i11 % 2 == 0) {
                int i12 = 37 / 0;
            }
        } else {
            j4 = j;
        }
        if ((i2 & 4096) != 0) {
            int i13 = IAuthTabCallbackStub + 105;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            j5 = 5000;
        } else {
            j5 = j2;
        }
        if ((i2 & 8192) != 0) {
            int i16 = onExtraCallback + 57;
            int i17 = i16 % 128;
            IAuthTabCallbackStub = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 101;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            j6 = 500;
        } else {
            j6 = j3;
        }
        this(bleConfig2, resultConfig2, systemConfig2, warmUpConfig2, autoExposureConfig2, z2, candidateFrameConfig2, postAuthConfig2, num2, i10, otaConfig2, j4, j5, j6);
    }

    public final ResultConfig onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ResultConfig resultConfig = this.result;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return resultConfig;
    }

    public final CandidateFrameConfig onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.candidateFrame;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 59;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 84 - KeyEvent.keyCodeFromString(""), 21234 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 14185), ImageFormat.getBitsPerPixel(0) + 20, ((byte) KeyEvent.getModifierMetaStateMask()) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 109;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19627 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myTid() >> 22) + 59, (-16770833) - Color.rgb(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 71;
                $10 = i3 % 128;
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", 0) + 59, 6383 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 3149712902531668292L;
        onExtraCallbackWithResult = -6552741247738286500L;
    }
}
