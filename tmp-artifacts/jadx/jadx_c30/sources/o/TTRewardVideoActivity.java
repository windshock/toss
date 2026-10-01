package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.sf.scuba.smartcards.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AES256SHA256' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTRewardVideoActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ TTRewardVideoActivity[] $VALUES;
    public static final TTRewardVideoActivity AES256SHA256;
    public static final TTRewardVideoActivity BCJ_ARM_FILTER;
    public static final TTRewardVideoActivity BCJ_ARM_THUMB_FILTER;
    public static final TTRewardVideoActivity BCJ_IA64_FILTER;
    public static final TTRewardVideoActivity BCJ_PPC_FILTER;
    public static final TTRewardVideoActivity BCJ_SPARC_FILTER;
    public static final TTRewardVideoActivity BCJ_X86_FILTER;
    public static final TTRewardVideoActivity BZIP2;
    public static final TTRewardVideoActivity COPY;
    public static final TTRewardVideoActivity DEFLATE;
    public static final TTRewardVideoActivity DEFLATE64;
    public static final TTRewardVideoActivity DELTA_FILTER;
    private static int IAuthTabCallback = 1;
    public static final TTRewardVideoActivity LZMA;
    public static final TTRewardVideoActivity LZMA2;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final byte[] id;

    public static TTRewardVideoActivity valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TTRewardVideoActivity tTRewardVideoActivity = (TTRewardVideoActivity) Enum.valueOf(TTRewardVideoActivity.class, str);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return tTRewardVideoActivity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TTRewardVideoActivity[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        TTRewardVideoActivity[] tTRewardVideoActivityArr = (TTRewardVideoActivity[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return tTRewardVideoActivityArr;
    }

    static {
        onExtraCallback();
        TTRewardVideoActivity tTRewardVideoActivity = new TTRewardVideoActivity("COPY", 0, new byte[]{0});
        COPY = tTRewardVideoActivity;
        TTRewardVideoActivity tTRewardVideoActivity2 = new TTRewardVideoActivity("LZMA", 1, new byte[]{3, 1, 1});
        LZMA = tTRewardVideoActivity2;
        TTRewardVideoActivity tTRewardVideoActivity3 = new TTRewardVideoActivity("LZMA2", 2, new byte[]{33});
        LZMA2 = tTRewardVideoActivity3;
        TTRewardVideoActivity tTRewardVideoActivity4 = new TTRewardVideoActivity("DEFLATE", 3, new byte[]{4, 1, 8});
        DEFLATE = tTRewardVideoActivity4;
        TTRewardVideoActivity tTRewardVideoActivity5 = new TTRewardVideoActivity("DEFLATE64", 4, new byte[]{4, 1, 9});
        DEFLATE64 = tTRewardVideoActivity5;
        TTRewardVideoActivity tTRewardVideoActivity6 = new TTRewardVideoActivity("BZIP2", 5, new byte[]{4, 2, 2});
        BZIP2 = tTRewardVideoActivity6;
        Object[] objArr = new Object[1];
        a(new int[]{0, 12, 130, 5}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, objArr);
        TTRewardVideoActivity tTRewardVideoActivity7 = new TTRewardVideoActivity(((String) objArr[0]).intern(), 6, new byte[]{6, -15, 7, 1});
        AES256SHA256 = tTRewardVideoActivity7;
        TTRewardVideoActivity tTRewardVideoActivity8 = new TTRewardVideoActivity("BCJ_X86_FILTER", 7, new byte[]{3, 3, 1, 3});
        BCJ_X86_FILTER = tTRewardVideoActivity8;
        TTRewardVideoActivity tTRewardVideoActivity9 = new TTRewardVideoActivity("BCJ_PPC_FILTER", 8, new byte[]{3, 3, 2, 5});
        BCJ_PPC_FILTER = tTRewardVideoActivity9;
        TTRewardVideoActivity tTRewardVideoActivity10 = new TTRewardVideoActivity("BCJ_IA64_FILTER", 9, new byte[]{3, 3, 4, 1});
        BCJ_IA64_FILTER = tTRewardVideoActivity10;
        TTRewardVideoActivity tTRewardVideoActivity11 = new TTRewardVideoActivity("BCJ_ARM_FILTER", 10, new byte[]{3, 3, 5, 1});
        BCJ_ARM_FILTER = tTRewardVideoActivity11;
        TTRewardVideoActivity tTRewardVideoActivity12 = new TTRewardVideoActivity("BCJ_ARM_THUMB_FILTER", 11, new byte[]{3, 3, 7, 1});
        BCJ_ARM_THUMB_FILTER = tTRewardVideoActivity12;
        TTRewardVideoActivity tTRewardVideoActivity13 = new TTRewardVideoActivity("BCJ_SPARC_FILTER", 12, new byte[]{3, 3, 8, 5});
        BCJ_SPARC_FILTER = tTRewardVideoActivity13;
        TTRewardVideoActivity tTRewardVideoActivity14 = new TTRewardVideoActivity("DELTA_FILTER", 13, new byte[]{3});
        DELTA_FILTER = tTRewardVideoActivity14;
        $VALUES = new TTRewardVideoActivity[]{tTRewardVideoActivity, tTRewardVideoActivity2, tTRewardVideoActivity3, tTRewardVideoActivity4, tTRewardVideoActivity5, tTRewardVideoActivity6, tTRewardVideoActivity7, tTRewardVideoActivity8, tTRewardVideoActivity9, tTRewardVideoActivity10, tTRewardVideoActivity11, tTRewardVideoActivity12, tTRewardVideoActivity13, tTRewardVideoActivity14};
        int i = onExtraCallback + 55;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static TTRewardVideoActivity byId(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TTRewardVideoActivity[] tTRewardVideoActivityArr = (TTRewardVideoActivity[]) TTRewardVideoActivity.class.getEnumConstants();
        int length = tTRewardVideoActivityArr.length;
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            Object obj = null;
            if (i6 >= length) {
                return null;
            }
            TTRewardVideoActivity tTRewardVideoActivity = tTRewardVideoActivityArr[i6];
            if (Arrays.equals(tTRewardVideoActivity.id, bArr)) {
                int i7 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return tTRewardVideoActivity;
                }
                obj.hashCode();
                throw null;
            }
            i6++;
        }
    }

    private TTRewardVideoActivity(String str, int i, byte[] bArr) {
        this.id = bArr;
    }

    byte[] getId() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr = this.id;
            Arrays.copyOf(bArr, bArr.length);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte[] bArr2 = this.id;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return bArrCopyOf;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onNavigationEvent;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), 35 - (ViewConfiguration.getTapTimeout() >> 16), 14238 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $10 + 63;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    f = 0.0f;
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
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = $10 + 5;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 65, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 65, 16718 - (ViewConfiguration.getPressedStateDuration() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49467), 70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $10 + 83;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $11 + 81;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[5]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
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
        onNavigationEvent = new char[]{27179, 27272, 27381, 27387, 27385, 27379, 27275, 27264, 27274, 27387, 27385, 27272};
    }
}
