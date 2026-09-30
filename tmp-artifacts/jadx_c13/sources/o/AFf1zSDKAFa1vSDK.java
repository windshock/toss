package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1zSDKAFa1vSDK {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFf1zSDKAFa1vSDK[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final float backgroundRadius;
    private final float iconSize;
    private final float togglePadding;
    private final float toggleRadius;
    public static final AFf1zSDKAFa1vSDK Small100 = new AFf1zSDKAFa1vSDK("Small100", 0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.4f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
    public static final AFf1zSDKAFa1vSDK Small110 = new AFf1zSDKAFa1vSDK("Small110", 1, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.25f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.4f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
    public static final AFf1zSDKAFa1vSDK Small120 = new AFf1zSDKAFa1vSDK("Small120", 2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
    public static final AFf1zSDKAFa1vSDK Small135 = new AFf1zSDKAFa1vSDK("Small135", 3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.75f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(23.0f));
    public static final AFf1zSDKAFa1vSDK Small160 = new AFf1zSDKAFa1vSDK("Small160", 4, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(26.0f));
    public static final AFf1zSDKAFa1vSDK Small190 = new AFf1zSDKAFa1vSDK("Small190", 5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.25f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f));
    public static final AFf1zSDKAFa1vSDK Small235 = new AFf1zSDKAFa1vSDK("Small235", 6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(37.0f));
    public static final AFf1zSDKAFa1vSDK Small275 = new AFf1zSDKAFa1vSDK("Small275", 7, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.75f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(42.0f));
    public static final AFf1zSDKAFa1vSDK Small310 = new AFf1zSDKAFa1vSDK("Small310", 8, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f));
    public static final AFf1zSDKAFa1vSDK Big100 = new AFf1zSDKAFa1vSDK("Big100", 9, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
    public static final AFf1zSDKAFa1vSDK Big110 = new AFf1zSDKAFa1vSDK("Big110", 10, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.25f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(23.0f));
    public static final AFf1zSDKAFa1vSDK Big120 = new AFf1zSDKAFa1vSDK("Big120", 11, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
    public static final AFf1zSDKAFa1vSDK Big135 = new AFf1zSDKAFa1vSDK("Big135", 12, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.75f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
    public static final AFf1zSDKAFa1vSDK Big160 = new AFf1zSDKAFa1vSDK("Big160", 13, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
    public static final AFf1zSDKAFa1vSDK Big190 = new AFf1zSDKAFa1vSDK("Big190", 14, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.25f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f));
    public static final AFf1zSDKAFa1vSDK Big235 = new AFf1zSDKAFa1vSDK("Big235", 15, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f));
    public static final AFf1zSDKAFa1vSDK Big275 = new AFf1zSDKAFa1vSDK("Big275", 16, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.75f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(46.0f));
    public static final AFf1zSDKAFa1vSDK Big310 = new AFf1zSDKAFa1vSDK("Big310", 17, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.75f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(46.0f));

    private static final /* synthetic */ AFf1zSDKAFa1vSDK[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AFf1zSDKAFa1vSDK[] aFf1zSDKAFa1vSDKArr = {Small100, Small110, Small120, Small135, Small160, Small190, Small235, Small275, Small310, Big100, Big110, Big120, Big135, Big160, Big190, Big235, Big275, Big310};
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return aFf1zSDKAFa1vSDKArr;
    }

    public static EnumEntries<AFf1zSDKAFa1vSDK> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<AFf1zSDKAFa1vSDK> enumEntries = $ENTRIES;
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AFf1zSDKAFa1vSDK valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK = (AFf1zSDKAFa1vSDK) Enum.valueOf(AFf1zSDKAFa1vSDK.class, str);
        if (i3 != 0) {
            return aFf1zSDKAFa1vSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AFf1zSDKAFa1vSDK[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AFf1zSDKAFa1vSDK[] aFf1zSDKAFa1vSDKArr = (AFf1zSDKAFa1vSDK[]) $VALUES.clone();
        int i3 = onExtraCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return aFf1zSDKAFa1vSDKArr;
        }
        throw null;
    }

    private AFf1zSDKAFa1vSDK(String str, int i, float f, float f2, float f3) {
        this.backgroundRadius = f;
        this.togglePadding = f2;
        this.iconSize = f3;
        this.toggleRadius = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
    }

    /* renamed from: getBackgroundRadius-D9Ej5fM, reason: not valid java name */
    public final float m151getBackgroundRadiusD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.backgroundRadius;
        int i4 = i2 + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return f;
    }

    /* renamed from: getTogglePadding-D9Ej5fM, reason: not valid java name */
    public final float m153getTogglePaddingD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.togglePadding;
        }
        throw null;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m152getIconSizeD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.iconSize;
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    /* renamed from: getToggleRadius-D9Ej5fM, reason: not valid java name */
    public final float m154getToggleRadiusD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.toggleRadius;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final AFf1zSDKAFa1vSDK onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK;
            int i2 = 2 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1277786443, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleStyle.Companion.small (TossSecCurrencyToggle.kt:116)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1277786443, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleStyle.Companion.small (TossSecCurrencyToggle.kt:116)");
            }
            float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
            if (RangesKt__RangesKt.rangeUntil(0.0f, 1.1f).contains(Float.valueOf(fOnNavigationEvent))) {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small100;
            } else if (RangesKt__RangesKt.rangeUntil(1.1f, 1.2f).contains(Float.valueOf(fOnNavigationEvent))) {
                int i4 = onNavigationEvent + 99;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK2 = AFf1zSDKAFa1vSDK.Small110;
                    obj.hashCode();
                    throw null;
                }
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small110;
            } else if (RangesKt__RangesKt.rangeUntil(1.2f, 1.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small120;
            } else if (RangesKt__RangesKt.rangeUntil(1.35f, 1.6f).contains(Float.valueOf(fOnNavigationEvent))) {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small135;
            } else if (RangesKt__RangesKt.rangeUntil(1.6f, 1.9f).contains(Float.valueOf(fOnNavigationEvent))) {
                int i5 = onExtraCallback + 87;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small160;
            } else if (RangesKt__RangesKt.rangeUntil(1.9f, 2.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small190;
            } else if (RangesKt__RangesKt.rangeUntil(2.35f, 2.75f).contains(Float.valueOf(fOnNavigationEvent))) {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small235;
            } else if (RangesKt__RangesKt.rangeUntil(2.75f, 3.1f).contains(Float.valueOf(fOnNavigationEvent))) {
                int i7 = onNavigationEvent + 75;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small275;
            } else {
                aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Small310;
                int i9 = onExtraCallback + 91;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return aFf1zSDKAFa1vSDK;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AFf1zSDKAFa1vSDK onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            AFf1zSDKAFa1vSDK aFf1zSDKAFa1vSDK;
            int i2;
            int i3 = 2 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1617709500, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCurrencyToggleStyle.Companion.big (TossSecCurrencyToggle.kt:134)");
            }
            float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
            if (!RangesKt__RangesKt.rangeUntil(0.0f, 1.1f).contains(Float.valueOf(fOnNavigationEvent))) {
                if (RangesKt__RangesKt.rangeUntil(1.1f, 1.2f).contains(Float.valueOf(fOnNavigationEvent))) {
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big110;
                } else if (RangesKt__RangesKt.rangeUntil(1.2f, 1.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big120;
                } else if (RangesKt__RangesKt.rangeUntil(1.35f, 1.6f).contains(Float.valueOf(fOnNavigationEvent))) {
                    int i4 = onNavigationEvent + 109;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big135;
                } else if (RangesKt__RangesKt.rangeUntil(1.6f, 1.9f).contains(Float.valueOf(fOnNavigationEvent))) {
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big160;
                    i2 = onExtraCallback + 37;
                } else if (RangesKt__RangesKt.rangeUntil(1.9f, 2.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                    int i6 = onExtraCallback + 77;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big190;
                } else if (RangesKt__RangesKt.rangeUntil(2.35f, 2.75f).contains(Float.valueOf(fOnNavigationEvent))) {
                    int i8 = onNavigationEvent + 75;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big235;
                } else {
                    aFf1zSDKAFa1vSDK = RangesKt__RangesKt.rangeUntil(2.75f, 3.1f).contains(Float.valueOf(fOnNavigationEvent)) ? AFf1zSDKAFa1vSDK.Big275 : AFf1zSDKAFa1vSDK.Big310;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return aFf1zSDKAFa1vSDK;
            }
            int i10 = onNavigationEvent + 61;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            aFf1zSDKAFa1vSDK = AFf1zSDKAFa1vSDK.Big100;
            i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i12 = i2 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return aFf1zSDKAFa1vSDK;
        }
    }

    static {
        AFf1zSDKAFa1vSDK[] aFf1zSDKAFa1vSDKArr$values = $values();
        $VALUES = aFf1zSDKAFa1vSDKArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFf1zSDKAFa1vSDKArr$values);
        Companion = new onWarmupCompleted(null);
        int i = onNavigationEvent + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
