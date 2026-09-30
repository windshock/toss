package o;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.Objects;
import o.AppBarKtExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda5 {
    public final boolean IAuthTabCallback;
    public final boolean IAuthTabCallbackDefault;
    public final String IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    public final boolean access100;
    public final String asBinder;
    public final boolean asInterface;
    public final String onExtraCallback;
    public final boolean onExtraCallbackWithResult;
    public final MediaCodecInfo.CodecCapabilities onNavigationEvent;
    public final boolean onTransact;
    public final boolean onWarmupCompleted;
    private float getInterfaceDescriptor = -3.4028235E38f;
    private int access000 = -1;
    private int IAuthTabCallback_Parcel = -1;

    private static boolean onNavigationEvent(String str) {
        return false;
    }

    public static AppBarKtExternalSyntheticLambda5 onNavigationEvent(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new AppBarKtExternalSyntheticLambda5(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !onWarmupCompleted(codecCapabilities) || onNavigationEvent(str)) ? false : true, codecCapabilities != null && IAuthTabCallback(codecCapabilities), z5 || (codecCapabilities != null && onNavigationEvent(codecCapabilities)), onExtraCallbackWithResult(codecCapabilities));
    }

    AppBarKtExternalSyntheticLambda5(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.IAuthTabCallbackStub = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(str);
        this.asBinder = str2;
        this.onExtraCallback = str3;
        this.onNavigationEvent = codecCapabilities;
        this.IAuthTabCallback = z;
        this.IAuthTabCallbackDefault = z2;
        this.access100 = z3;
        this.onWarmupCompleted = z4;
        this.onTransact = z5;
        this.asInterface = z6;
        this.onExtraCallbackWithResult = z7;
        this.IAuthTabCallbackStubProxy = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(str2);
    }

    public String toString() {
        return this.IAuthTabCallbackStub;
    }

    public MediaCodecInfo.CodecProfileLevel[] onNavigationEvent() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.onNavigationEvent;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws AppBarKtExternalSyntheticLambda9.onExtraCallback {
        int i2;
        int i3;
        if (!IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) || !IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, true) || !onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return false;
        }
        if (this.IAuthTabCallbackStubProxy) {
            int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls;
            if (i4 <= 0 || (i3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback) <= 0) {
                return true;
            }
            return onExtraCallback(i4, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject);
        }
        int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
        return (i5 == -1 || onExtraCallbackWithResult(i5)) && ((i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent) == -1 || onNavigationEvent(i2));
    }

    public boolean onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) && IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, false) && onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    private boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return this.asBinder.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) || this.asBinder.equals(AppBarKtExternalSyntheticLambda9.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z) {
        char c;
        Pair<Integer, Integer> pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (str != null && str.equals("video/mv-hevc")) {
            String str2 = (String) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -750012447, 750012450, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this.onExtraCallback});
            if (str2.equals("video/mv-hevc")) {
                return true;
            }
            if (str2.equals("video/hevc")) {
                pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            }
        }
        if (pairOnNavigationEvent == null) {
            return true;
        }
        int iIntValue = ((Integer) pairOnNavigationEvent.first).intValue();
        int iIntValue2 = ((Integer) pairOnNavigationEvent.second).intValue();
        if ("video/dolby-vision".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            String str3 = this.asBinder;
            int iHashCode = str3.hashCode();
            if (iHashCode == -1662735862) {
                if (str3.equals("video/av01")) {
                    c = 0;
                }
                if (c == 0) {
                }
            } else if (iHashCode != -1662541442) {
                c = (iHashCode == 1331836730 && str3.equals("video/avc")) ? (char) 2 : (char) 65535;
                if (c == 0 || c == 1) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                } else if (c == 2) {
                    iIntValue = 8;
                    iIntValue2 = 0;
                }
            } else {
                if (str3.equals("video/hevc")) {
                    c = 1;
                }
                if (c == 0) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
        }
        if (!this.IAuthTabCallbackStubProxy && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : onNavigationEvent()) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !onExtraCallbackWithResult(this.asBinder, iIntValue))) {
                return true;
            }
        }
        IAuthTabCallback("codec.profileLevel, " + basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub + ", " + this.onExtraCallback);
        return false;
    }

    private boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/flac") && basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized == 22 && Build.VERSION.SDK_INT < 34 && this.IAuthTabCallbackStub.equals("c2.android.flac.decoder")) ? false : true;
    }

    public boolean onExtraCallback() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.asBinder)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : onNavigationEvent()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (this.IAuthTabCallbackStubProxy) {
            return this.onWarmupCompleted;
        }
        Pair<Integer, Integer> pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        return pairOnNavigationEvent != null && ((Integer) pairOnNavigationEvent.first).intValue() == 42;
    }

    public TextStringSimpleNodeExternalSyntheticLambda0 onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        int i2;
        int i3 = !Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable) ? 8 : 0;
        if (this.IAuthTabCallbackStubProxy) {
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsService != basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsService) {
                i3 |= 1024;
            }
            boolean z = (basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls == basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetchWithMultipleUrls && basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback == basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback) ? false : true;
            if (!this.onWarmupCompleted && z) {
                i3 |= 512;
            }
            if ((!TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact) || !TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda42.onTransact)) && !Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact, basicTextContextMenuProviderKtExternalSyntheticLambda42.onTransact)) {
                i3 |= 2048;
            }
            if (onExtraCallback(this.IAuthTabCallbackStub) && !basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda42)) {
                i3 |= 2;
            }
            int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.getInterfaceDescriptor;
            if (i4 != -1 && (i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.access000) != -1 && i4 == basicTextContextMenuProviderKtExternalSyntheticLambda42.getInterfaceDescriptor && i2 == basicTextContextMenuProviderKtExternalSyntheticLambda42.access000 && z) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new TextStringSimpleNodeExternalSyntheticLambda0(this.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda42) ? 3 : 2, 0);
            }
        } else {
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent != basicTextContextMenuProviderKtExternalSyntheticLambda42.onNavigationEvent) {
                i3 |= 4096;
            }
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch != basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetch) {
                i3 |= 8192;
            }
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized != basicTextContextMenuProviderKtExternalSyntheticLambda42.onUnminimized) {
                i3 |= 16384;
            }
            if (i3 == 0 && "audio/mp4a-latm".equals(this.asBinder)) {
                Pair<Integer, Integer> pairOnNavigationEvent = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                Pair<Integer, Integer> pairOnNavigationEvent2 = AppBarKtExternalSyntheticLambda9.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda42);
                if (pairOnNavigationEvent != null && pairOnNavigationEvent2 != null) {
                    int iIntValue = ((Integer) pairOnNavigationEvent.first).intValue();
                    int iIntValue2 = ((Integer) pairOnNavigationEvent2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new TextStringSimpleNodeExternalSyntheticLambda0(this.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, 3, 0);
                    }
                }
            }
            if (!basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda42)) {
                i3 |= 32;
            }
            if (onExtraCallbackWithResult(this.asBinder)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new TextStringSimpleNodeExternalSyntheticLambda0(this.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, 1, 0);
            }
        }
        return new TextStringSimpleNodeExternalSyntheticLambda0(this.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda4, basicTextContextMenuProviderKtExternalSyntheticLambda42, 0, i3);
    }

    public boolean onExtraCallback(int i2, int i3, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.onNavigationEvent;
        if (codecCapabilities == null) {
            IAuthTabCallback("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            IAuthTabCallback("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iOnWarmupCompleted = AppBarKtExternalSyntheticLambda2.onWarmupCompleted(videoCapabilities, i2, i3, d);
            if (iOnWarmupCompleted == 2) {
                return true;
            }
            if (iOnWarmupCompleted == 1) {
                IAuthTabCallback("sizeAndRate.cover, " + i2 + "x" + i3 + "@" + d);
                return false;
            }
        }
        if (!onExtraCallbackWithResult(videoCapabilities, i2, i3, d)) {
            if (i2 >= i3 || !IAuthTabCallbackStub(this.IAuthTabCallbackStub) || !onExtraCallbackWithResult(videoCapabilities, i3, i2, d)) {
                IAuthTabCallback("sizeAndRate.support, " + i2 + "x" + i3 + "@" + d);
                return false;
            }
            onWarmupCompleted("sizeAndRate.rotated, " + i2 + "x" + i3 + "@" + d);
        }
        return true;
    }

    public float onNavigationEvent(int i2, int i3) {
        if (!this.IAuthTabCallbackStubProxy) {
            return -3.4028235E38f;
        }
        float f = this.getInterfaceDescriptor;
        if (f != -3.4028235E38f && this.access000 == i2 && this.IAuthTabCallback_Parcel == i3) {
            return f;
        }
        float fOnExtraCallback = onExtraCallback(i2, i3);
        this.getInterfaceDescriptor = fOnExtraCallback;
        this.access000 = i2;
        this.IAuthTabCallback_Parcel = i3;
        return fOnExtraCallback;
    }

    private float onExtraCallback(int i2, int i3) {
        float f = 1024.0f;
        if (onExtraCallback(i2, i3, 1024.0d)) {
            return 1024.0f;
        }
        float f2 = 0.0f;
        while (true) {
            float f3 = f - f2;
            if (Math.abs(f3) <= 5.0f) {
                return f2;
            }
            float f4 = (f3 / 2.0f) + f2;
            if (onExtraCallback(i2, i3, f4)) {
                f2 = f4;
            } else {
                f = f4;
            }
        }
    }

    public Point onExtraCallbackWithResult(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.onNavigationEvent;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return onNavigationEvent(videoCapabilities, i2, i3);
    }

    public boolean onExtraCallbackWithResult(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.onNavigationEvent;
        if (codecCapabilities == null) {
            IAuthTabCallback("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            IAuthTabCallback("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        IAuthTabCallback("sampleRate.support, " + i2);
        return false;
    }

    public boolean onNavigationEvent(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.onNavigationEvent;
        if (codecCapabilities == null) {
            IAuthTabCallback("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            IAuthTabCallback("channelCount.aCaps");
            return false;
        }
        if (onWarmupCompleted(this.IAuthTabCallbackStub, this.asBinder, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        IAuthTabCallback("channelCount.support, " + i2);
        return false;
    }

    private void IAuthTabCallback(String str) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onNavigationEvent("MediaCodecInfo", "NoSupport [" + str + "] [" + this.IAuthTabCallbackStub + ", " + this.asBinder + "] [" + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback + "]");
    }

    private void onWarmupCompleted(String str) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onNavigationEvent("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.IAuthTabCallbackStub + ", " + this.asBinder + "] [" + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback + "]");
    }

    private static int onWarmupCompleted(String str, String str2, int i2) {
        int i3;
        if (i2 > 1 || ((Build.VERSION.SDK_INT >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        if ("audio/ac3".equals(str2)) {
            i3 = 6;
        } else {
            i3 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    private static boolean onWarmupCompleted(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean IAuthTabCallback(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean onNavigationEvent(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean onExtraCallbackWithResult(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !IAuthTabCallback();
    }

    private static boolean onExtraCallbackWithResult(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point pointOnNavigationEvent = onNavigationEvent(videoCapabilities, i2, i3);
        int i4 = pointOnNavigationEvent.x;
        int i5 = pointOnNavigationEvent.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i4, i5);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i4, i5, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i4, i5);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point onNavigationEvent(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i2, widthAlignment) * widthAlignment, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i3, heightAlignment) * heightAlignment);
    }

    private static boolean onExtraCallback(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean onExtraCallbackWithResult(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean IAuthTabCallbackStub(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    private static boolean onExtraCallbackWithResult(String str, int i2) {
        if (!"video/hevc".equals(str) || 2 != i2) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean IAuthTabCallback() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }
}
