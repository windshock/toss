package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r_ {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r_[] $VALUES;
    public static final r_ Big100;
    public static final r_ Big110;
    public static final r_ Big120;
    public static final r_ Big135;
    public static final r_ Big160;
    public static final r_ Big190;
    public static final r_ Big235;
    public static final r_ Big275;
    public static final r_ Big310;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    public static final r_ Small100;
    public static final r_ Small110;
    public static final r_ Small120;
    public static final r_ Small135;
    public static final r_ Small160;
    public static final r_ Small190;
    public static final r_ Small235;
    public static final r_ Small275;
    public static final r_ Small310;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final float containerRadius;
    private final DeviceQuirksExternalSyntheticLambda0 togglePaddings;
    private final float toggleRadius;
    private final accessgetTlsVersionsAsStringp typography;

    private static final /* synthetic */ r_[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        r_[] r_VarArr = {Small100, Small110, Small120, Small135, Small160, Small190, Small235, Small275, Small310, Big100, Big110, Big120, Big135, Big160, Big190, Big235, Big275, Big310};
        int i5 = i2 + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return r_VarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<r_> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static r_ valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r_ r_Var = (r_) Enum.valueOf(r_.class, str);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r_Var;
    }

    public static r_[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r_[] r_VarArr = $VALUES;
        if (i3 == 0) {
            return (r_[]) r_VarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r_(String str, int i, float f, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        this.containerRadius = f;
        this.typography = accessgettlsversionsasstringp;
        this.togglePaddings = deviceQuirksExternalSyntheticLambda0;
        this.toggleRadius = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
    }

    /* renamed from: getContainerRadius-D9Ej5fM, reason: not valid java name */
    public final float m157getContainerRadiusD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.containerRadius;
        int i4 = i2 + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return f;
    }

    public final accessgetTlsVersionsAsStringp getTypography() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.typography;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DeviceQuirksExternalSyntheticLambda0 getTogglePaddings() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = this.togglePaddings;
        int i5 = i3 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return deviceQuirksExternalSyntheticLambda0;
    }

    /* renamed from: getToggleRadius-D9Ej5fM, reason: not valid java name */
    public final float m158getToggleRadiusD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.toggleRadius;
        int i4 = i3 + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final r_ onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            r_ r_Var;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 8 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1763699480, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecCustomToggleStyle.Companion.small (TossSecCustomTdsToggle.kt:122)");
                }
            } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
            if (RangesKt__RangesKt.rangeUntil(0.0f, 1.1f).contains(Float.valueOf(fOnNavigationEvent))) {
                r_Var = r_.Small100;
                int i5 = IAuthTabCallback + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else if (!(!RangesKt__RangesKt.rangeUntil(1.1f, 1.2f).contains(Float.valueOf(fOnNavigationEvent)))) {
                r_Var = r_.Small110;
            } else if (RangesKt__RangesKt.rangeUntil(1.2f, 1.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                r_Var = r_.Small120;
            } else if (RangesKt__RangesKt.rangeUntil(1.35f, 1.6f).contains(Float.valueOf(fOnNavigationEvent))) {
                int i7 = IAuthTabCallback + 69;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                r_Var = r_.Small135;
            } else if (RangesKt__RangesKt.rangeUntil(1.6f, 1.9f).contains(Float.valueOf(fOnNavigationEvent))) {
                r_Var = r_.Small160;
            } else if (RangesKt__RangesKt.rangeUntil(1.9f, 2.35f).contains(Float.valueOf(fOnNavigationEvent))) {
                int i9 = IAuthTabCallback + 125;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                r_Var = r_.Small190;
            } else if (RangesKt__RangesKt.rangeUntil(2.35f, 2.75f).contains(Float.valueOf(fOnNavigationEvent))) {
                r_Var = r_.Small235;
            } else if (RangesKt__RangesKt.rangeUntil(2.75f, 3.1f).contains(Float.valueOf(fOnNavigationEvent))) {
                r_Var = r_.Small275;
                int i11 = IAuthTabCallback + 11;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            } else {
                r_Var = r_.Small310;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return r_Var;
        }
    }

    static {
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography7;
        Small100 = new r_("Small100", 0, fIAuthTabCallback, accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)));
        Small110 = new r_("Small110", 1, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.25f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)));
        Small120 = new r_("Small120", 2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.5f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small135 = new r_("Small135", 3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.75f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small160 = new r_("Small160", 4, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small190 = new r_("Small190", 5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.25f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small235 = new r_("Small235", 6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.5f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small275 = new r_("Small275", 7, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.75f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        Small310 = new r_("Small310", 8, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), accessgettlsversionsasstringp, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 0.0f, 2, (Object) null));
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography6;
        Big100 = new r_("Big100", 9, fIAuthTabCallback2, accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big110 = new r_("Big110", 10, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.25f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big120 = new r_("Big120", 11, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.5f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big135 = new r_("Big135", 12, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.75f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big160 = new r_("Big160", 13, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big190 = new r_("Big190", 14, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.25f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big235 = new r_("Big235", 15, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.5f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big275 = new r_("Big275", 16, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.75f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        Big310 = new r_("Big310", 17, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.75f), accessgettlsversionsasstringp2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
        r_[] r_VarArr$values = $values();
        $VALUES = r_VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r_VarArr$values);
        Companion = new onWarmupCompleted(null);
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
