package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.EngineConfig1;
import o.s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class getAppVersion {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAppVersion[] $VALUES;
    public static final getAppVersion ADDRESS;
    public static final getAppVersion ALPHA_BUILD;
    public static final getAppVersion APP_DIAGNOSTICS;
    public static final getAppVersion BANKING;
    public static final getAppVersion CERT_OCR;
    public static final getAppVersion COMMERCE;
    public static final getAppVersion DEVELOP_TEST;
    public static final getAppVersion DEV_TOOL_ACTION;
    private static int IAuthTabCallback = 1;
    public static final getAppVersion IDENTITY;
    public static final getAppVersion MARKETING;
    public static final getAppVersion MOBILE_ID;
    public static final getAppVersion NONE;
    public static final getAppVersion ONBOARDING;
    public static final getAppVersion PAYMENT;
    public static final getAppVersion REACT_NATIVE;
    public static final getAppVersion SCHEME;
    public static final getAppVersion TEENS_TRAFFIC;
    public static final getAppVersion TUBA;
    public static final getAppVersion UI_INSPECTION;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final String displayName;
    private final String emoji;
    private final String id;

    private static final /* synthetic */ getAppVersion[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        getAppVersion[] getappversionArr = {DEV_TOOL_ACTION, SCHEME, TUBA, MOBILE_ID, IDENTITY, CERT_OCR, PAYMENT, BANKING, ADDRESS, REACT_NATIVE, UI_INSPECTION, APP_DIAGNOSTICS, MARKETING, COMMERCE, ONBOARDING, TEENS_TRAFFIC, ALPHA_BUILD, DEVELOP_TEST, NONE};
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getappversionArr;
    }

    public static EnumEntries<getAppVersion> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<getAppVersion> enumEntries = $ENTRIES;
        int i5 = i3 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getAppVersion valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getAppVersion getappversion = (getAppVersion) Enum.valueOf(getAppVersion.class, str);
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getappversion;
        }
        throw null;
    }

    public static getAppVersion[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getAppVersion[] getappversionArr = $VALUES;
        if (i3 == 0) {
            return (getAppVersion[]) getappversionArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getAppVersion(String str, int i, String str2, String str3) {
        this.displayName = str2;
        this.emoji = str3;
        this.id = name();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ getAppVersion(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 97;
            onNavigationEvent = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        this(str, i, str2, str3);
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.displayName;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmoji() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.emoji;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 15, 92, 5}, false, new byte[]{1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0}, objArr);
        Object[] objArr2 = new Object[1];
        b(new char[]{7153, 56039, 39341, 22576, 7997, 56777, 40080, 21336, 4653, 31834, 12219}, 49464 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        DEV_TOOL_ACTION = new getAppVersion(((String) objArr[0]).intern(), 0, ((String) objArr2[0]).intern(), null, 2, null);
        Object[] objArr3 = new Object[1];
        a(new int[]{15, 6, 180, 1}, true, new byte[]{1, 0, 0, 0, 1, 1}, objArr3);
        Object[] objArr4 = new Object[1];
        b(new char[]{55569, 28430}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41999, objArr4);
        SCHEME = new getAppVersion(((String) objArr3[0]).intern(), 1, ((String) objArr4[0]).intern(), null, 2, null);
        Object[] objArr5 = new Object[1];
        a(new int[]{21, 4, 188, 0}, true, new byte[]{1, 1, 1, 1}, objArr5);
        Object[] objArr6 = new Object[1];
        a(new int[]{21, 4, 188, 0}, true, new byte[]{1, 1, 1, 1}, objArr6);
        TUBA = new getAppVersion(((String) objArr5[0]).intern(), 2, ((String) objArr6[0]).intern(), null, 2, null);
        Object[] objArr7 = new Object[1];
        a(new int[]{25, 9, 0, 7}, false, new byte[]{0, 1, 1, 1, 0, 0, 1, 1, 0}, objArr7);
        Object[] objArr8 = new Object[1];
        b(new char[]{41245, 25256, 22235, 21646, 52593, 32540, 19486}, 50442 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
        MOBILE_ID = new getAppVersion(((String) objArr7[0]).intern(), 3, ((String) objArr8[0]).intern(), null, 2, null);
        Object[] objArr9 = new Object[1];
        b(new char[]{7164, 1224, 9602, 18000, 26373, 34785, 41143, 49507}, 7993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
        Object[] objArr10 = new Object[1];
        a(new int[]{34, 8, 108, 3}, false, new byte[]{0, 1, 1, 1, 0, 0, 0, 1}, objArr10);
        String str = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IDENTITY = new getAppVersion(((String) objArr9[0]).intern(), 4, ((String) objArr10[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr11 = new Object[1];
        a(new int[]{42, 8, 0, 5}, false, new byte[]{0, 1, 0, 0, 1, 1, 0, 1}, objArr11);
        Object[] objArr12 = new Object[1];
        a(new int[]{50, 7, 159, 7}, false, new byte[]{1, 1, 1, 1, 0, 0, 1}, objArr12);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        CERT_OCR = new getAppVersion(((String) objArr11[0]).intern(), 5, ((String) objArr12[0]).intern(), null, 2, defaultConstructorMarker2);
        Object[] objArr13 = new Object[1];
        a(new int[]{57, 7, 0, 1}, true, new byte[]{0, 0, 0, 1, 0, 0, 0}, objArr13);
        Object[] objArr14 = new Object[1];
        b(new char[]{46853, 65366}, 11518 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr14);
        PAYMENT = new getAppVersion(((String) objArr13[0]).intern(), 6, ((String) objArr14[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr15 = new Object[1];
        b(new char[]{7159, 64679, 54621, 44551, 34480, 40804, 28672}, 59219 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr15);
        Object[] objArr16 = new Object[1];
        b(new char[]{55828, 5932, 24096, 20674, 22909}, 41617 - ExpandableListView.getPackedPositionGroup(0L), objArr16);
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        BANKING = new getAppVersion(((String) objArr15[0]).intern(), 7, ((String) objArr16[0]).intern(), defaultConstructorMarker2, i2, defaultConstructorMarker3);
        Object[] objArr17 = new Object[1];
        b(new char[]{7156, 16002, 20759, 27582, 36412, 41177, 64340}, KeyEvent.normalizeMetaState(0) + 9587, objArr17);
        Object[] objArr18 = new Object[1];
        a(new int[]{64, 2, 0, 1}, false, new byte[]{0, 0}, objArr18);
        ADDRESS = new getAppVersion(((String) objArr17[0]).intern(), 8, ((String) objArr18[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr19 = new Object[1];
        b(new char[]{7143, 55397, 40158, 20809, 5557, 51715, 36485, 17127, 1865, 64449, 47153, 31895}, TextUtils.indexOf("", "", 0) + 50069, objArr19);
        Object[] objArr20 = new Object[1];
        a(new int[]{66, 12, 159, 9}, true, null, objArr20);
        REACT_NATIVE = new getAppVersion(((String) objArr19[0]).intern(), 9, ((String) objArr20[0]).intern(), defaultConstructorMarker2, i2, defaultConstructorMarker3);
        Object[] objArr21 = new Object[1];
        a(new int[]{78, 13, 0, 7}, false, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1}, objArr21);
        Object[] objArr22 = new Object[1];
        a(new int[]{91, 10, 0, 0}, true, new byte[]{0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, objArr22);
        UI_INSPECTION = new getAppVersion(((String) objArr21[0]).intern(), 10, ((String) objArr22[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr23 = new Object[1];
        b(new char[]{7156, 26498, 58155, 28383, 60013, 30207, 61854, 32035, 63683, 17509, 51168, 17292, 53032, 19149, 54852}, TextUtils.lastIndexOf("", '0', 0, 0) + 31848, objArr23);
        Object[] objArr24 = new Object[1];
        a(new int[]{101, 7, 0, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1}, objArr24);
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        APP_DIAGNOSTICS = new getAppVersion(((String) objArr23[0]).intern(), 11, ((String) objArr24[0]).intern(), defaultConstructorMarker3, i3, defaultConstructorMarker4);
        Object[] objArr25 = new Object[1];
        a(new int[]{108, 9, 0, 1}, false, new byte[]{1, 0, 0, 1, 1, 0, 1, 1, 1}, objArr25);
        Object[] objArr26 = new Object[1];
        b(new char[]{41597, 53730, 49694, 2960, 48432, 50782}, View.combineMeasuredStates(0, 0) + 1367, objArr26);
        MARKETING = new getAppVersion(((String) objArr25[0]).intern(), 12, ((String) objArr26[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr27 = new Object[1];
        a(new int[]{117, 8, 177, 0}, false, new byte[]{0, 0, 0, 0, 0, 1, 1, 0}, objArr27);
        Object[] objArr28 = new Object[1];
        b(new char[]{54609, 58452, 21155}, 17880 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr28);
        COMMERCE = new getAppVersion(((String) objArr27[0]).intern(), 13, ((String) objArr28[0]).intern(), defaultConstructorMarker3, i3, defaultConstructorMarker4);
        Object[] objArr29 = new Object[1];
        b(new char[]{7162, 63020, 49241, 53887, 44200, 48852, 35067, 39709, 30019, 18301}, 60887 - TextUtils.indexOf("", "", 0), objArr29);
        Object[] objArr30 = new Object[1];
        a(new int[]{125, 8, 44, 0}, false, new byte[]{0, 0, 1, 0, 1, 0, 0, 0}, objArr30);
        ONBOARDING = new getAppVersion(((String) objArr29[0]).intern(), 14, ((String) objArr30[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr31 = new Object[1];
        a(new int[]{133, 13, 0, 0}, false, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}, objArr31);
        Object[] objArr32 = new Object[1];
        b(new char[]{51521, 50652, 13504, 61766, 38276}, 6114 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr32);
        TEENS_TRAFFIC = new getAppVersion(((String) objArr31[0]).intern(), 15, ((String) objArr32[0]).intern(), defaultConstructorMarker3, i3, defaultConstructorMarker4);
        Object[] objArr33 = new Object[1];
        a(new int[]{146, 11, 0, 10}, false, new byte[]{0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1}, objArr33);
        Object[] objArr34 = new Object[1];
        a(new int[]{157, 9, 190, 6}, false, new byte[]{0, 0, 1, 1, 0, 0, 0, 0, 0}, objArr34);
        ALPHA_BUILD = new getAppVersion(((String) objArr33[0]).intern(), 16, ((String) objArr34[0]).intern(), str, i, defaultConstructorMarker);
        Object[] objArr35 = new Object[1];
        b(new char[]{7153, 13397, 17577, 38175, 42349, 62915, 1595, 22121, 26313, 46909, 51092, 6134}, 12197 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr35);
        Object[] objArr36 = new Object[1];
        a(new int[]{166, 9, 0, 0}, true, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0}, objArr36);
        DEVELOP_TEST = new getAppVersion(((String) objArr35[0]).intern(), 17, ((String) objArr36[0]).intern(), defaultConstructorMarker3, i3, defaultConstructorMarker4);
        Object[] objArr37 = new Object[1];
        b(new char[]{7163, 7677, 6133, 2533}, Color.red(0) + 1543, objArr37);
        NONE = new getAppVersion(((String) objArr37[0]).intern(), 18, "", null, 2, null);
        getAppVersion[] getappversionArr$values = $values();
        $VALUES = getappversionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getappversionArr$values);
        int i4 = onExtraCallback + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 19;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        String str = new String(cArr2);
        int i5 = $11 + 19;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onWarmupCompleted;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i12 = $10 + 107;
                $11 = i12 % 128;
                int i13 = i12 % 2;
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
        onWarmupCompleted = new char[]{27137, 27369, 27364, 27366, 27364, 27371, 27374, 27367, 27384, 27387, 27363, 27365, 27367, 27391, 27362, 27341, 27470, 27315, 27315, 27316, 27319, 27184, 27315, 27465, 27486, 27247, 27147, 27140, 27142, 27164, 27162, 27144, 27142, 27136, 2492, 42268, 42268, 3587, 27376, 27380, 27303, 13581, 27236, 27159, 27161, 27143, 27140, 27140, 27146, 27141, 3653, 41831, 44981, 3014, 27500, 27302, 27303, 27238, 27164, 27167, 27143, 27143, 27165, 27139, 2696, 44810, 27485, 27470, 27299, 27377, 27485, 27468, 27470, 27466, 27327, 27466, 27483, 27462, 27238, 27140, 27146, 27141, 27136, 27138, 27136, 27167, 27137, 27162, 27162, 27141, 27166, 2584, 56536, 15390, 27258, 27137, 27336, 3675, 54768, 53256, 43802, 2282, 43856, 13467, 13185, 54296, 3772, 2182, 27245, 27140, 27145, 27143, 27136, 27142, 27138, 27136, 27141, 27188, 27316, 27313, 27312, 27316, 27314, 27317, 27323, 2404, 44020, 54132, 12626, 793, 44154, 56728, 56312, 27236, 27138, 27147, 27143, 27166, 27159, 27159, 27165, 27143, 27149, 27144, 27145, 27144, 27240, 27136, 27138, 27146, 27166, 27166, 27141, 27137, 27140, 27142, 27148, 13771, 53276, 54478, 3692, 14262, 56684, 54992, 42660, 26, 13172, 56362, 14196, 802, 41184, 41910, 760, 13392, 56914};
        onExtraCallbackWithResult = -7558433698008555902L;
    }
}
