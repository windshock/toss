package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q8ExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q8ExternalSyntheticLambda3[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final q8ExternalSyntheticLambda3 OverviewMedium;
    public static final q8ExternalSyntheticLambda3 OverviewSmall;
    public static final q8ExternalSyntheticLambda3 WatchlistMedium;
    public static final q8ExternalSyntheticLambda3 WatchlistSmall;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String dark;
    private final String light;

    private static final /* synthetic */ q8ExternalSyntheticLambda3[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        q8ExternalSyntheticLambda3[] q8externalsyntheticlambda3Arr = {OverviewSmall, OverviewMedium, WatchlistSmall, WatchlistMedium};
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return q8externalsyntheticlambda3Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<q8ExternalSyntheticLambda3> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<q8ExternalSyntheticLambda3> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return enumEntries;
    }

    public static q8ExternalSyntheticLambda3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = (q8ExternalSyntheticLambda3) Enum.valueOf(q8ExternalSyntheticLambda3.class, str);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return q8externalsyntheticlambda3;
    }

    public static q8ExternalSyntheticLambda3[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda3[] q8externalsyntheticlambda3Arr = $VALUES;
        if (i3 != 0) {
            return (q8ExternalSyntheticLambda3[]) q8externalsyntheticlambda3Arr.clone();
        }
        throw null;
    }

    private q8ExternalSyntheticLambda3(String str, int i, String str2, String str3) {
        this.light = str2;
        this.dark = str3;
    }

    public final String getLight() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.light;
        }
        throw null;
    }

    public final String getDark() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dark;
        int i4 = i3 + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 47, 58, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{47, 47, 0, 16}, false, new byte[]{0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr2);
        OverviewSmall = new q8ExternalSyntheticLambda3("OverviewSmall", 0, strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{94, 47, 0, 32}, false, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1}, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{141, 47, 0, 18}, true, new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr4);
        OverviewMedium = new q8ExternalSyntheticLambda3("OverviewMedium", 1, strIntern2, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new int[]{188, 47, 75, 0}, true, new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{235, 47, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1}, objArr6);
        WatchlistSmall = new q8ExternalSyntheticLambda3("WatchlistSmall", 2, strIntern3, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(new int[]{282, 47, 114, 29}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0}, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{329, 47, 156, 33}, false, new byte[]{0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}, objArr8);
        WatchlistMedium = new q8ExternalSyntheticLambda3("WatchlistMedium", 3, strIntern4, ((String) objArr8[0]).intern());
        q8ExternalSyntheticLambda3[] q8externalsyntheticlambda3Arr$values = $values();
        $VALUES = q8externalsyntheticlambda3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(q8externalsyntheticlambda3Arr$values);
        int i = IAuthTabCallback + 49;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String rememberUrl(@NotNull DisplaySetting displaySetting, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z2;
        boolean z3;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(displaySetting, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(483738907, i, -1, "im.toss.securities.widget.common.ui.PreviewUrl.rememberUrl (PreviewUrl.kt:31)");
        }
        if (((i & 14) ^ 6) > 4) {
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(displaySetting.ordinal())) {
                z2 = (i & 6) == 4;
            }
        }
        if (((i & 112) ^ 48) > 32) {
            int i5 = onWarmupCompleted + 41;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) {
                z3 = (i & 48) == 32;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z2 | z3)) {
            int i7 = onWarmupCompleted + 35;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i8 = onNavigationEvent.IAuthTabCallback[displaySetting.ordinal()];
                if (i8 != 1) {
                    int i9 = onExtraCallback;
                    int i10 = i9 + 33;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    if (i8 == 2) {
                        str = this.light;
                        int i12 = i9 + 13;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = !z ? this.light : this.dark;
                    }
                    objOnMinimized = str;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i14 = onWarmupCompleted + 1;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
        }
        String str2 = (String) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return str2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionGroup(j)), TextUtils.getCapsMode("", 0, 0) + 35, 14239 - (ViewConfiguration.getPressedStateDuration() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = $11 + 97;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 66, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - ImageFormat.getBitsPerPixel(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 69, 12487 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i11 = $10 + 7;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $11 + 117;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i16 = $10 + 31;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{27167, 27366, 27360, 27362, 27365, 27358, 27168, 27175, 27333, 27363, 27370, 27370, 27366, 27374, 27340, 27333, 27365, 27365, 27363, 27332, 27339, 27371, 27334, 27336, 27370, 27368, 27364, 27360, 27363, 27363, 27333, 27172, 27173, 27173, 27171, 27171, 27172, 27173, 27170, 27175, 27175, 27172, 27172, 27175, 27335, 27367, 27370, 27223, 27263, 27263, 27261, 27261, 27262, 27263, 27260, 27233, 27233, 27262, 27260, 27263, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27172, 27170, 27198, 27194, 27197, 27197, 27167, 27252, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27172, 27170, 27198, 27194, 27197, 27197, 27167, 27262, 27263, 27263, 27261, 27261, 27262, 27263, 27260, 27233, 27233, 27262, 27262, 27233, 27137, 27169, 27172, 27177, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27255, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27177, 27172, 27169, 27137, 27263, 27260, 27262, 27233, 27233, 27260, 27263, 27262, 27261, 27261, 27263, 27263, 27262, 27167, 27197, 27197, 27194, 27198, 27170, 27172, 27138, 27136, 27173, 27141, 27166, 27159, 27387, 27380, 27348, 27189, 27186, 27189, 27188, 27188, 27187, 27186, 27189, 27184, 27184, 27186, 27186, 27189, 27346, 27376, 27376, 27377, 27381, 27385, 27387, 27353, 27351, 27384, 27352, 27349, 27376, 27378, 27378, 27346, 27357, 27391, 27383, 27387, 27387, 27376, 27346, 27188, 27185, 27375, 27378, 27379, 27377, 27383, 27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27138, 27172, 27170, 27198, 27194, 27197, 27197, 27167, 27262, 27263, 27263, 27261, 27261, 27262, 27263, 27260, 27233, 27233, 27262, 27261, 27260, 27137, 27169, 27172, 27196, 27276, 27379, 27283, 27278, 27376, 27282, 27280, 27308, 27304, 27307, 27307, 27277, 27372, 27373, 27373, 27371, 27371, 27372, 27373, 27370, 27375, 27375, 27372, 27373, 27372, 27279, 27311, 27282, 27287, 27310, 27304, 27306, 27309, 27270, 27368, 27375, 27277, 27307, 27282, 27282, 27310, 27286, 27380, 27277, 27309, 27309, 27179, 27299, 27459, 27459, 27457, 27298, 27305, 27465, 27300, 27302, 27464, 27462, 27458, 27486, 27457, 27457, 27299, 27266, 27267, 27267, 27265, 27265, 27266, 27267, 27264, 27269, 27269, 27266, 27265, 27264, 27301, 27461, 27464, 27469, 27460, 27486, 27456, 27459, 27324, 27294, 27269, 27299, 27457, 27464, 27464, 27460, 27468};
    }
}
