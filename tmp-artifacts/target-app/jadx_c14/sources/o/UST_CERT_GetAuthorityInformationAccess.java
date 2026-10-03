package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetAuthorityInformationAccess {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UST_CERT_GetAuthorityInformationAccess[] $VALUES;
    public static final UST_CERT_GetAuthorityInformationAccess CARD_ID_MISMATCHED;
    public static final UST_CERT_GetAuthorityInformationAccess FAILED_TO_GENERATE;
    public static final UST_CERT_GetAuthorityInformationAccess FAILED_TO_GET_ENCRYPTED_DATA;
    public static final UST_CERT_GetAuthorityInformationAccess FAILED_TO_INITIALIZE;
    public static final UST_CERT_GetAuthorityInformationAccess FAILED_TO_READ_UID;
    private static int IAuthTabCallback = 0;
    public static final UST_CERT_GetAuthorityInformationAccess INVALID_HOST_RANDOM;
    public static final UST_CERT_GetAuthorityInformationAccess INVALID_REGISTER_DATA;
    public static final UST_CERT_GetAuthorityInformationAccess IO_ERROR;
    public static final UST_CERT_GetAuthorityInformationAccess MALFORMED_NFC_DATA;
    public static final UST_CERT_GetAuthorityInformationAccess NFC_DISABLED;
    public static final UST_CERT_GetAuthorityInformationAccess NFC_NOT_SUPPORTED;
    public static final UST_CERT_GetAuthorityInformationAccess NO_SAVED_DATA;
    public static final UST_CERT_GetAuthorityInformationAccess UNKNOWN_ERROR;
    public static final UST_CERT_GetAuthorityInformationAccess USER_CANCELED;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static long onWarmupCompleted;
    private final String code;

    private static final /* synthetic */ UST_CERT_GetAuthorityInformationAccess[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        UST_CERT_GetAuthorityInformationAccess[] uST_CERT_GetAuthorityInformationAccessArr = {NFC_NOT_SUPPORTED, NFC_DISABLED, FAILED_TO_READ_UID, INVALID_HOST_RANDOM, FAILED_TO_GET_ENCRYPTED_DATA, MALFORMED_NFC_DATA, INVALID_REGISTER_DATA, FAILED_TO_INITIALIZE, FAILED_TO_GENERATE, NO_SAVED_DATA, CARD_ID_MISMATCHED, USER_CANCELED, IO_ERROR, UNKNOWN_ERROR};
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return uST_CERT_GetAuthorityInformationAccessArr;
    }

    public static EnumEntries<UST_CERT_GetAuthorityInformationAccess> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<UST_CERT_GetAuthorityInformationAccess> enumEntries = $ENTRIES;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static UST_CERT_GetAuthorityInformationAccess valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_GetAuthorityInformationAccess uST_CERT_GetAuthorityInformationAccess = (UST_CERT_GetAuthorityInformationAccess) Enum.valueOf(UST_CERT_GetAuthorityInformationAccess.class, str);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return uST_CERT_GetAuthorityInformationAccess;
    }

    public static UST_CERT_GetAuthorityInformationAccess[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_GetAuthorityInformationAccess[] uST_CERT_GetAuthorityInformationAccessArr = $VALUES;
        if (i3 != 0) {
            return (UST_CERT_GetAuthorityInformationAccess[]) uST_CERT_GetAuthorityInformationAccessArr.clone();
        }
        throw null;
    }

    private UST_CERT_GetAuthorityInformationAccess(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        int i5 = i2 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{62847, 14288, 28732, 45723, 65507, 14397, 31375, 43007, 57434, 8891, 28647, 43084, 60074, 5912, 20551, 37565, 57093}, TextUtils.indexOf("", "") + 49831, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{62847, 14288, 28732, 45723, 65507, 14397, 31375, 43007, 57434, 8891, 28647, 43084, 60074, 5912, 20551, 37565, 57093}, TextUtils.getTrimmedLength("") + 49831, objArr2);
        NFC_NOT_SUPPORTED = new UST_CERT_GetAuthorityInformationAccess(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b(false, new byte[]{0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0}, new int[]{0, 12, 185, 10}, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(false, new byte[]{0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0}, new int[]{0, 12, 185, 10}, objArr4);
        NFC_DISABLED = new UST_CERT_GetAuthorityInformationAccess(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{12, 18, 0, 1}, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{12, 18, 0, 1}, objArr6);
        FAILED_TO_READ_UID = new UST_CERT_GetAuthorityInformationAccess(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(new char[]{62840, 26690, 53021, 8903, 33161, 59209, 23067, 47557, 7313, 29275, 53504, 13562, 43954, 2426, 27686, 50156, 9893, 33907, 64310}, 40254 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new char[]{62840, 26690, 53021, 8903, 33161, 59209, 23067, 47557, 7313, 29275, 53504, 13562, 43954, 2426, 27686, 50156, 9893, 33907, 64310}, 40253 - TextUtils.indexOf("", "", 0, 0), objArr8);
        INVALID_HOST_RANDOM = new UST_CERT_GetAuthorityInformationAccess(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{30, 28, 0, 0}, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{30, 28, 0, 0}, objArr10);
        FAILED_TO_GET_ENCRYPTED_DATA = new UST_CERT_GetAuthorityInformationAccess(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        b(false, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0}, new int[]{58, 18, 105, 17}, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(false, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0}, new int[]{58, 18, 105, 17}, objArr12);
        MALFORMED_NFC_DATA = new UST_CERT_GetAuthorityInformationAccess(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        b(true, new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{76, 21, 191, 0}, objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(true, new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1}, new int[]{76, 21, 191, 0}, objArr14);
        INVALID_REGISTER_DATA = new UST_CERT_GetAuthorityInformationAccess(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        b(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{97, 20, 159, 18}, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b(true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{97, 20, 159, 18}, objArr16);
        FAILED_TO_INITIALIZE = new UST_CERT_GetAuthorityInformationAccess(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        b(false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, new int[]{117, 18, 0, 0}, objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(false, new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, new int[]{117, 18, 0, 0}, objArr18);
        FAILED_TO_GENERATE = new UST_CERT_GetAuthorityInformationAccess(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(new char[]{62847, 9495, 21948, 33881, 46292, 59242, 5890, 18346, 30246, 42692, 53610, 486, 12700}, Drawable.resolveOpacity(0, 0) + 53353, objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a(new char[]{62847, 9495, 21948, 33881, 46292, 59242, 5890, 18346, 30246, 42692, 53610, 486, 12700}, TextUtils.lastIndexOf("", '0', 0) + 53354, objArr20);
        NO_SAVED_DATA = new UST_CERT_GetAuthorityInformationAccess(strIntern10, 9, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        a(new char[]{62834, 19705, 34417, 55790, 4938, 27349, 44099, 59345, 14644, 28841, 51768, 3487, 18204, 40592, 53260, 10878, 28132, 42860}, 47497 - (Process.myTid() >> 22), objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        a(new char[]{62834, 19705, 34417, 55790, 4938, 27349, 44099, 59345, 14644, 28841, 51768, 3487, 18204, 40592, 53260, 10878, 28132, 42860}, AndroidCharacter.getMirror('0') + 47449, objArr22);
        CARD_ID_MISMATCHED = new UST_CERT_GetAuthorityInformationAccess(strIntern11, 10, ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        a(new char[]{62820, 16263, 24766, 38348, 57082, 779, 13358, 31036, 41562, 55161, 6543, 17059, 30665}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51941, objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a(new char[]{62820, 16263, 24766, 38348, 57082, 779, 13358, 31036, 41562, 55161, 6543, 17059, 30665}, 51941 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr24);
        USER_CANCELED = new UST_CERT_GetAuthorityInformationAccess(strIntern12, 11, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        b(false, new byte[]{1, 0, 0, 0, 1, 0, 1, 1}, new int[]{135, 8, 0, 0}, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        b(false, new byte[]{1, 0, 0, 0, 1, 0, 1, 1}, new int[]{135, 8, 0, 0}, objArr26);
        IO_ERROR = new UST_CERT_GetAuthorityInformationAccess(strIntern13, 12, ((String) objArr26[0]).intern());
        Object[] objArr27 = new Object[1];
        a(new char[]{62820, 50778, 37680, 27664, 14826, 2783, 51105, 37741, 27740, 14638, 2577, 51177, 37087}, Color.blue(0) + 13093, objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a(new char[]{62820, 50778, 37680, 27664, 14826, 2783, 51105, 37741, 27740, 14638, 2577, 51177, 37087}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13093, objArr28);
        UNKNOWN_ERROR = new UST_CERT_GetAuthorityInformationAccess(strIntern14, 13, ((String) objArr28[0]).intern());
        UST_CERT_GetAuthorityInformationAccess[] uST_CERT_GetAuthorityInformationAccessArr$values = $values();
        $VALUES = uST_CERT_GetAuthorityInformationAccessArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(uST_CERT_GetAuthorityInformationAccessArr$values);
        int i = onExtraCallbackWithResult + 17;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetAuthorityInformationAccess.a(char[], int, java.lang.Object[]):void");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onNavigationEvent;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.combineMeasuredStates(0, 0)), 35 - TextUtils.getCapsMode("", 0, 0), 14238 - TextUtils.lastIndexOf("", '0', 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 117;
                $10 = i8 % 128;
                if (i8 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.keyCodeFromString("") + 29, 17657 - (Process.myTid() >> 22), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 10935), Color.rgb(0, 0, 0) + 16777281, Color.argb(0, 0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 71, 12486 - View.resolveSize(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = $11 + 103;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 << i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i12, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i12);
            }
            int i13 = $11 + 5;
            $10 = i13 % 128;
            int i14 = i13 % 2;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i15 = $10 + 79;
            $11 = i15 % 128;
            i = 2;
            int i16 = i15 % 2;
            cArr3 = cArr7;
        } else {
            i = 2;
        }
        if (i5 > 0) {
            int i17 = $11 + 79;
            $10 = i17 % 128;
            if (i17 % i != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7102797961116807174L;
        onNavigationEvent = new char[]{27184, 27460, 27460, 27313, 27465, 27469, 27316, 27470, 27471, 27315, 27468, 27469, 27245, 27147, 27144, 27137, 27156, 27167, 27148, 27149, 27141, 27158, 27161, 27167, 27159, 27167, 27146, 27142, 27140, 27147, 27246, 27140, 27140, 27148, 27167, 27167, 27146, 27138, 27164, 27162, 27163, 27140, 27142, 27143, 27164, 27159, 27138, 27144, 27165, 27161, 27167, 27159, 27167, 27146, 27142, 27140, 27147, 27149, 27163, 27361, 27388, 27389, 27383, 27382, 27388, 27363, 27380, 27377, 27389, 27363, 27380, 27380, 27365, 27389, 27389, 27390, 27342, 27463, 27463, 27471, 27486, 27481, 27460, 27461, 27484, 27459, 27465, 27467, 27460, 27481, 27486, 27467, 27463, 27467, 27460, 27487, 27460, 27194, 27303, 27307, 27306, 27299, 27299, 27300, 27300, 27325, 27320, 27326, 27318, 27326, 27309, 27305, 27303, 27306, 27308, 27306, 27296, 27245, 27149, 27147, 27140, 27142, 27146, 27167, 27159, 27167, 27161, 27165, 27144, 27143, 27143, 27141, 27143, 27140, 27138, 27242, 27138, 27161, 27164, 27141, 27164, 27166, 27166};
    }
}
