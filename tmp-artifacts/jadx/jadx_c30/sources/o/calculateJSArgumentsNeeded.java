package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import net.sf.scuba.smartcards.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class calculateJSArgumentsNeeded {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ calculateJSArgumentsNeeded[] $VALUES;

    @SerializedName("9")
    public static final calculateJSArgumentsNeeded CORPORATE;

    @SerializedName("C")
    public static final calculateJSArgumentsNeeded CORPORATE_EMAIL;

    @SerializedName(setGlobalLegacyVisibilityHandlingEnabled.CERTIFY_FRONT_PASSWORD)
    public static final calculateJSArgumentsNeeded EMAIL;

    @SerializedName("X")
    public static final calculateJSArgumentsNeeded FAMILY_EMAIL;

    @SerializedName("H")
    public static final calculateJSArgumentsNeeded HANA_EMAIL;
    private static char[] IAuthTabCallback = null;

    @SerializedName("K")
    public static final calculateJSArgumentsNeeded KAKAO_EMAIL;

    @SerializedName("7")
    public static final calculateJSArgumentsNeeded KIB;

    @SerializedName("5")
    public static final calculateJSArgumentsNeeded KIB_EMAIL;

    @SerializedName(setGlobalLegacyVisibilityHandlingEnabled.CERTIFY_ALL)
    public static final calculateJSArgumentsNeeded LETTER;

    @SerializedName("3")
    public static final calculateJSArgumentsNeeded LETTER_EMAIL;

    @SerializedName("L")
    public static final calculateJSArgumentsNeeded LMS;

    @SerializedName("B")
    public static final calculateJSArgumentsNeeded MMS;

    @SerializedName("4")
    public static final calculateJSArgumentsNeeded MMS_EMAIL;

    @SerializedName("D")
    public static final calculateJSArgumentsNeeded MOBILE;

    @SerializedName("S")
    public static final calculateJSArgumentsNeeded MOBILE_EMAIL;

    @SerializedName(setGlobalLegacyVisibilityHandlingEnabled.CERTIFY_CVC)
    public static final calculateJSArgumentsNeeded NO_ADDRESS;

    @SerializedName("8")
    public static final calculateJSArgumentsNeeded POST;

    @SerializedName("A")
    public static final calculateJSArgumentsNeeded POST_EMAIL;

    @SerializedName("T")
    public static final calculateJSArgumentsNeeded SMART_EMAIL;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String displayName;

    private static final /* synthetic */ calculateJSArgumentsNeeded[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        calculateJSArgumentsNeeded[] calculatejsargumentsneededArr = {NO_ADDRESS, LETTER, EMAIL, LETTER_EMAIL, MMS_EMAIL, KIB_EMAIL, KIB, POST, CORPORATE, POST_EMAIL, MMS, CORPORATE_EMAIL, MOBILE, HANA_EMAIL, KAKAO_EMAIL, LMS, MOBILE_EMAIL, SMART_EMAIL, FAMILY_EMAIL};
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return calculatejsargumentsneededArr;
    }

    public static EnumEntries<calculateJSArgumentsNeeded> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static calculateJSArgumentsNeeded valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        calculateJSArgumentsNeeded calculatejsargumentsneeded = (calculateJSArgumentsNeeded) Enum.valueOf(calculateJSArgumentsNeeded.class, str);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return calculatejsargumentsneeded;
    }

    public static calculateJSArgumentsNeeded[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        calculateJSArgumentsNeeded[] calculatejsargumentsneededArr = (calculateJSArgumentsNeeded[]) $VALUES.clone();
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return calculatejsargumentsneededArr;
    }

    private calculateJSArgumentsNeeded(String str, int i, String str2) {
        this.displayName = str2;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.displayName;
        int i4 = i2 + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        NO_ADDRESS = new calculateJSArgumentsNeeded("NO_ADDRESS", 0, "수령하지 않음");
        LETTER = new calculateJSArgumentsNeeded("LETTER", 1, "우편");
        EMAIL = new calculateJSArgumentsNeeded("EMAIL", 2, "이메일");
        LETTER_EMAIL = new calculateJSArgumentsNeeded("LETTER_EMAIL", 3, "우편 ・ 이메일");
        MMS_EMAIL = new calculateJSArgumentsNeeded("MMS_EMAIL", 4, "MMS ・ 이메일");
        KIB_EMAIL = new calculateJSArgumentsNeeded("KIB_EMAIL", 5, "BC KIB ・ 이메일");
        KIB = new calculateJSArgumentsNeeded("KIB", 6, "BC KIB");
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 111, 0}, false, new byte[]{1, 1, 0, 1}, objArr);
        POST = new calculateJSArgumentsNeeded(((String) objArr[0]).intern(), 7, "등기");
        CORPORATE = new calculateJSArgumentsNeeded("CORPORATE", 8, "법인팀앞배송");
        POST_EMAIL = new calculateJSArgumentsNeeded("POST_EMAIL", 9, "등기 ・ 이메일");
        MMS = new calculateJSArgumentsNeeded("MMS", 10, "MMS");
        CORPORATE_EMAIL = new calculateJSArgumentsNeeded("CORPORATE_EMAIL", 11, "법인팀앞배송 ・ 이메일");
        MOBILE = new calculateJSArgumentsNeeded("MOBILE", 12, "모바일 앱 알림");
        HANA_EMAIL = new calculateJSArgumentsNeeded("HANA_EMAIL", 13, "하나멤버스 ・ 이메일");
        KAKAO_EMAIL = new calculateJSArgumentsNeeded("KAKAO_EMAIL", 14, "카카오명세서 ・ 이메일");
        LMS = new calculateJSArgumentsNeeded("LMS", 15, "문자메시지");
        MOBILE_EMAIL = new calculateJSArgumentsNeeded("MOBILE_EMAIL", 16, "모바일 앱 알림 ・ 이메일");
        SMART_EMAIL = new calculateJSArgumentsNeeded("SMART_EMAIL", 17, "스마트청구서 ・ 이메일");
        FAMILY_EMAIL = new calculateJSArgumentsNeeded("FAMILY_EMAIL", 18, "가족이메일");
        calculateJSArgumentsNeeded[] calculatejsargumentsneededArr$values = $values();
        $VALUES = calculatejsargumentsneededArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(calculatejsargumentsneededArr$values);
        int i = onExtraCallbackWithResult + 33;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getEdgeSlop() >> 16) + 35, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                int i7 = $11 + 105;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10935), (Process.myPid() >> 22) + 65, 16718 - View.resolveSize(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 29 - View.getDefaultSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49466), 70 - View.resolveSize(0, 0), 12487 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
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
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i12 = $10 + 99;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{27153, 27376, 27278, 27276};
    }
}
