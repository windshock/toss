package okhttp3.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTFullScreenVideoActivity1;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.setExecute;
import okhttp3.internal.url._UrlKt;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final TTFullScreenVideoActivity1 UNICODE_BOMS;
    public static final String USER_AGENT = "okhttp/5.3.2";
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {15, -57, -42, 5};
    private static final int $$b = Imgproc.COLOR_BGR2YUV_YV12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = 1 - (b2 * 4);
        int i4 = 105 - (b * 3);
        int i5 = 4 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i4 += -i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static final int and(byte b, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = b & i;
        int i6 = i4 + 37;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final int and(short s, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallback = i3 % 128;
        int i4 = s & i;
        if (i3 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return i4;
    }

    public static final long and(int i, long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        long j2 = i & j;
        int i6 = i4 + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return j2;
    }

    public static final int parseHexDigit(char c) {
        int i = 2 % 2;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c) {
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0 ? c < 'g' : c < 'y') {
                return c - 'W';
            }
        }
        if ('A' <= c) {
            int i3 = IAuthTabCallback + 17;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (c < 'G') {
                int i6 = i4 + 99;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return c - '7';
            }
        }
        int i8 = onExtraCallback + 101;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return -1;
    }

    static {
        onExtraCallbackWithResult = 0;
        onNavigationEvent();
        EMPTY_BYTE_ARRAY = new byte[0];
        TTFullScreenVideoActivity1.onExtraCallback onextracallback = TTFullScreenVideoActivity1.Companion;
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        UNICODE_BOMS = onextracallback.onWarmupCompleted(iAuthTabCallback.onExtraCallbackWithResult("efbbbf"), iAuthTabCallback.onExtraCallbackWithResult("feff"), iAuthTabCallback.onExtraCallbackWithResult("fffe0000"), iAuthTabCallback.onExtraCallbackWithResult("fffe"), iAuthTabCallback.onExtraCallbackWithResult("0000feff"));
        int i = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final TTFullScreenVideoActivity1 getUNICODE_BOMS() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TTFullScreenVideoActivity1 tTFullScreenVideoActivity1 = UNICODE_BOMS;
        int i4 = i2 + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return tTFullScreenVideoActivity1;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (strArr.length != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (strArr2 != null) {
                int i5 = i2 + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (strArr2.length != 0) {
                    for (String str : strArr) {
                        int length = strArr2.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            int i8 = IAuthTabCallback + 123;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                comparator.compare(str, strArr2[i7]);
                                throw null;
                            }
                            if (comparator.compare(str, strArr2[i7]) == 0) {
                                int i9 = onExtraCallback + 93;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                comparator.compare(strArr[i2], str);
                throw null;
            }
            if (comparator.compare(strArr[i2], str) == 0) {
                int i4 = IAuthTabCallback + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return i2;
                }
                obj.hashCode();
                throw null;
            }
            i2++;
            int i5 = onExtraCallback + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return -1;
    }

    public static final String[] concat(@NotNull String[] strArr, @NotNull String str) {
        String[] strArr2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length % 0);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            strArr2 = (String[]) objArrCopyOf;
            strArr2[ArraysKt___ArraysKt.getLastIndex(strArr2)] = str;
        } else {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArrCopyOf2 = Arrays.copyOf(strArr, strArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
            strArr2 = (String[]) objArrCopyOf2;
            strArr2[ArraysKt___ArraysKt.getLastIndex(strArr2)] = str;
        }
        int i3 = onExtraCallback + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strArr2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            int i5 = IAuthTabCallback + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i2 = str.length();
        }
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        int i7 = IAuthTabCallback + 27;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return iIndexOfFirstNonAsciiWhitespace;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r1
      0x002f: PHI (r1v9 char) = (r1v8 char), (r1v10 char) binds: [B:10:0x002d, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        char cCharAt;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int i6 = IAuthTabCallback + 47;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                cCharAt = str.charAt(i);
                if (cCharAt == 'q') {
                    continue;
                } else if (cCharAt != '\n' && cCharAt != '\f') {
                    int i7 = onExtraCallback + 15;
                    int i8 = i7 % 128;
                    IAuthTabCallback = i8;
                    int i9 = i7 % 2;
                    if (cCharAt != '\r') {
                        int i10 = i8 + 17;
                        int i11 = i10 % 128;
                        onExtraCallback = i11;
                        int i12 = i10 % 2;
                        if (cCharAt != ' ') {
                            int i13 = i11 + 11;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return i;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                cCharAt = str.charAt(i);
                if (cCharAt == '\t') {
                    continue;
                }
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback;
        int i6 = i5 + 85;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 1) != 0) {
            int i8 = i5 + 21;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        if ((i3 & 2) != 0) {
            int i10 = IAuthTabCallback + 7;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[PHI: r7
      PHI (r7v2 int) = (r7v1 int), (r7v8 int) binds: [B:8:0x001d, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            i3 = i2 + 4;
            if (i <= i3) {
                while (true) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r') {
                        int i6 = IAuthTabCallback + 33;
                        int i7 = i6 % 128;
                        onExtraCallback = i7;
                        int i8 = i6 % 2;
                        if (cCharAt != ' ') {
                            int i9 = i7 + 9;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return i3 + 1;
                        }
                    }
                    if (i3 == i) {
                        break;
                    }
                    int i11 = IAuthTabCallback + 55;
                    onExtraCallback = i11 % 128;
                    i3 = i11 % 2 != 0 ? i3 + 99 : i3 - 1;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            i3 = i2 - 1;
            if (i <= i3) {
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 103;
        $11 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 23, (ViewConfiguration.getLongPressTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 12844), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 55, 2167 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i6 = $11 + 107;
                $10 = i6 % 128;
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
        if (i2 > 0) {
            int i11 = $11 + 99;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 55 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $11 + 83;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 5;
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = IAuthTabCallback + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        String strTrimSubstring = trimSubstring(str, i, i2);
        int i7 = onExtraCallback + 23;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return strTrimSubstring;
    }

    public static final String trimSubstring(@NotNull String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i6 = onExtraCallback + 43;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return strSubstring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 95;
        int i6 = i5 % 128;
        onExtraCallback = i6;
        int i7 = i5 % 2;
        if ((i3 & 2) != 0) {
            int i8 = i6 + 93;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        if ((i3 & 4) != 0) {
            int i10 = i6 + 53;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i2 = str.length();
            int i12 = onExtraCallback + 53;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String str2, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 3;
        }
        while (i < i2) {
            int i6 = IAuthTabCallback + 53;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 3, (Object) null)) {
                    return i;
                }
                i++;
            } else {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        int iDelimiterOffset = delimiterOffset(str, c, i, i2);
        int i7 = IAuthTabCallback + 11;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return iDelimiterOffset;
    }

    public static final int delimiterOffset(@NotNull String str, char c, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i5 = 88 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
        while (i < i2) {
            if (str.charAt(i) == c) {
                int i6 = onExtraCallback + 11;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return i;
            }
            i++;
        }
        int i8 = IAuthTabCallback + 55;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return i2;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt, 31) > 0) {
                int i3 = IAuthTabCallback + 83;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    if (Intrinsics.compare((int) cCharAt, 80) < 0) {
                    }
                } else if (Intrinsics.compare((int) cCharAt, 127) < 0) {
                }
            }
            return i2;
        }
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return -1;
    }

    public static final boolean isSensitiveHeader(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt__StringsJVMKt.equals(str, "Authorization", true)) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 7, 4 - View.MeasureSpec.getMode(0), new char[]{7, 11, 11, 65503, 1, 5}, true, Drawable.resolveOpacity(0, 0) + 219, objArr);
            if (!StringsKt__StringsJVMKt.equals(str, ((String) objArr[0]).intern(), true) && !StringsKt__StringsJVMKt.equals(str, "Proxy-Authorization", true) && !StringsKt__StringsJVMKt.equals(str, "Set-Cookie", true)) {
                return false;
            }
        }
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return true;
    }

    public static final void writeMedium(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        tTAppOpenAdActivity9.onExtraCallbackWithResult((i >>> 16) & 255);
        tTAppOpenAdActivity9.onExtraCallbackWithResult((i >>> 8) & 255);
        tTAppOpenAdActivity9.onExtraCallbackWithResult(i & 255);
        int i5 = onExtraCallback + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final int readMedium(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        int iAnd = and(tTAppOpenAdTransActivity.ICustomTabsCallback(), 255) | (and(tTAppOpenAdTransActivity.ICustomTabsCallback(), 255) << 16) | (and(tTAppOpenAdTransActivity.ICustomTabsCallback(), 255) << 8);
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iAnd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void ignoreIoExceptions(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function0, "");
                function0.invoke();
                throw null;
            }
            Intrinsics.checkNotNullParameter(function0, "");
            function0.invoke();
            int i3 = IAuthTabCallback + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } catch (IOException unused) {
        }
    }

    public static final int skipAll(@NotNull TTBaseActivity tTBaseActivity, byte b) throws EOFException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            i = 0;
        }
        while ((!tTBaseActivity.IAuthTabCallback_Parcel()) && tTBaseActivity.onExtraCallbackWithResult(0L) == b) {
            i++;
            tTBaseActivity.ICustomTabsCallback();
        }
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            i = 0;
        }
        int iIndexOfNonWhitespace = indexOfNonWhitespace(str, i);
        int i5 = IAuthTabCallback + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iIndexOfNonWhitespace;
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        while (i < length) {
            int i3 = onExtraCallback + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                int i5 = IAuthTabCallback;
                int i6 = i5 + 19;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 65;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 75 / 0;
                }
                return i;
            }
            i++;
        }
        int length2 = str.length();
        int i10 = onExtraCallback + 91;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return length2;
    }

    public static final long toLongOrDefault(@NotNull String str, long j) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            long j2 = Long.parseLong(str);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return j2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    int i5 = onExtraCallback + 89;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return IntCompanionObject.MAX_VALUE;
                    }
                    throw null;
                }
                if (j >= 0) {
                    return (int) j;
                }
                int i6 = onExtraCallback + 101;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return 0;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final void closeQuietly(@NotNull Closeable closeable) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(closeable, "");
                closeable.close();
            } else {
                Intrinsics.checkNotNullParameter(closeable, "");
                closeable.close();
                throw null;
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void deleteIfExists(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(fileSystem, "");
                Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
                fileSystem.delete(tTFullScreenVideoActivity3);
            } else {
                Intrinsics.checkNotNullParameter(fileSystem, "");
                Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
                fileSystem.delete(tTFullScreenVideoActivity3);
                throw null;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void deleteContents(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        try {
            Iterator<TTFullScreenVideoActivity3> it = fileSystem.list(tTFullScreenVideoActivity3).iterator();
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IOException iOException = null;
            while (it.hasNext()) {
                int i4 = onExtraCallback + 69;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    fileSystem.metadata(it.next()).onNavigationEvent();
                    throw null;
                }
                TTFullScreenVideoActivity3 next = it.next();
                try {
                    if (fileSystem.metadata(next).onNavigationEvent()) {
                        int i5 = onExtraCallback + 31;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        deleteContents(fileSystem, next);
                        int i7 = onExtraCallback + 33;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    fileSystem.delete(next);
                } catch (IOException e) {
                    if (iOException != null) {
                    }
                }
                if (iOException != null) {
                    iOException = e;
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.contains(e)) {
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            list.add(e);
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = onExtraCallback + 49;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 5;
            }
        }
        int i8 = IAuthTabCallback + 51;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 11 / 0;
        }
    }

    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(list, "");
            list.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<? extends Exception> it = list.iterator();
        while (!(!it.hasNext())) {
            int i3 = onExtraCallback + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                setExecute.onNavigationEvent(exc, it.next());
                throw null;
            }
            setExecute.onNavigationEvent(exc, it.next());
        }
        return exc;
    }

    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iterable, "");
            Intrinsics.checkNotNullParameter(function1, "");
            CollectionsKt__CollectionsKt.emptyList();
            iterable.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        List<T> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                Intrinsics.checkNotNull(listEmptyList, "");
                TypeIntrinsics.asMutableList(listEmptyList).add(t);
            }
        }
        return listEmptyList;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        int i = 2 % 2;
        if ((j2 | j3) >= 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (j2 <= j) {
                int i5 = i2 + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (j - j2 >= j3) {
                    return;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
    }

    public static final <T> List<T> interleave(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        while (true) {
            if (!it.hasNext()) {
                int i2 = IAuthTabCallback + 65;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    it2.hasNext();
                    throw null;
                }
                if (!it2.hasNext()) {
                    return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
                }
            }
            if (it.hasNext()) {
                listCreateListBuilder.add(it.next());
            }
            if (it2.hasNext()) {
                int i3 = IAuthTabCallback + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                listCreateListBuilder.add(it2.next());
            }
        }
    }

    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallback + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = strArr[i2];
            int length2 = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    int i6 = IAuthTabCallback + 85;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (comparator.compare(str, strArr2[i5]) == 0) {
                        arrayList.add(str);
                        int i8 = IAuthTabCallback + 23;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        break;
                    }
                    i5++;
                }
            }
            i2++;
            int i10 = onExtraCallback + 45;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isCivilized(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTHistoryActivity41 tTHistoryActivity41Sink = fileSystem.sink(tTFullScreenVideoActivity3);
        try {
            try {
                fileSystem.delete(tTFullScreenVideoActivity3);
                if (tTHistoryActivity41Sink == null) {
                    return true;
                }
                int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                try {
                    tTHistoryActivity41Sink.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            } catch (IOException unused2) {
                Unit unit = Unit.INSTANCE;
                if (tTHistoryActivity41Sink != null) {
                    try {
                        tTHistoryActivity41Sink.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        fileSystem.delete(tTFullScreenVideoActivity3);
                        return false;
                    }
                } else {
                    th = null;
                }
                if (th != null) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tTHistoryActivity41Sink != null) {
                try {
                    tTHistoryActivity41Sink.close();
                } catch (Throwable th3) {
                    setExecute.onNavigationEvent(th, th3);
                }
            }
            if (th != null) {
            }
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = 478308958;
    }
}
