package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes.dex */
public class AudioBecomingNoisyManagerExternalSyntheticLambda0 {
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char onWarmupCompleted;

    public static String onExtraCallback(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b = bArr[i2];
            if (!(!onWarmupCompleted(b))) {
                int i3 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iMin = Math.min(IAuthTabCallback(b) + 1, bArr.length - i2);
                byte[] bArr2 = new byte[iMin];
                System.arraycopy(bArr, i2, bArr2, 0, iMin);
                try {
                    Object[] objArr = new Object[1];
                    onNavigationEvent(new int[]{1228007669, -240616311, -1151270505, 277734052}, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                    CharsetDecoder charsetDecoderNewDecoder = Charset.forName((String) objArr[0]).newDecoder();
                    int i5 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        onNavigationEvent("\f\u0007\u0000\u0006\u0001\r\u0004\u0003\u0001\t\u000e\u0002\t\u0004\u0000\r\u0000\f㙁", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 90), ExpandableListView.getPackedPositionType(0L) + 19, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        Object[] objArr3 = new Object[1];
                        onNavigationEvent("\u0002\u0007\u0007\b", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 40), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr3);
                        sb.append((CharSequence) charsetDecoderNewDecoder.decode((ByteBuffer) cls.getMethod((String) objArr3[0], byte[].class).invoke(null, bArr2)));
                        i2 += iMin;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (CharacterCodingException unused) {
                    sb.append(onExtraCallbackWithResult(bArr2[0]));
                    int i7 = 1;
                    for (int i8 = 1; i8 < iMin; i8++) {
                        int i9 = onExtraCallbackWithResult + 43;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        byte b2 = bArr2[i8];
                        if (onWarmupCompleted(b2)) {
                            break;
                        }
                        sb.append(onExtraCallbackWithResult(b2));
                        i7++;
                    }
                    i2 += i7;
                }
            } else {
                sb.append(onExtraCallbackWithResult(b));
                i2++;
                int i11 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 2;
                }
            }
        }
        return sb.toString();
    }

    private static int IAuthTabCallback(byte b) {
        int i = 2 % 2;
        if (onWarmupCompleted(b, 7) == 0) {
            return 0;
        }
        if (onWarmupCompleted(b, 7) == 1) {
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (onWarmupCompleted(b, 6) == 1) {
                int i4 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0 ? onWarmupCompleted(b, 5) == 0 : onWarmupCompleted(b, 3) == 0) {
                    return 1;
                }
            }
        }
        if (onWarmupCompleted(b, 7) == 1 && onWarmupCompleted(b, 6) == 1 && onWarmupCompleted(b, 5) == 1 && onWarmupCompleted(b, 4) == 0) {
            return 2;
        }
        if (onWarmupCompleted(b, 7) != 1) {
            return -1;
        }
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            if (onWarmupCompleted(b, 89) != 0) {
                return -1;
            }
        } else if (onWarmupCompleted(b, 6) != 1) {
            return -1;
        }
        int i6 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            if (onWarmupCompleted(b, 4) != 0) {
                return -1;
            }
        } else if (onWarmupCompleted(b, 5) != 1) {
            return -1;
        }
        return (onWarmupCompleted(b, 4) == 1 && onWarmupCompleted(b, 3) == 0) ? 3 : -1;
    }

    private static boolean onWarmupCompleted(byte b) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(b);
            throw new ArithmeticException();
        }
        if (IAuthTabCallback(b) != -1) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static int onWarmupCompleted(byte b, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (b >> i) & 1;
        int i7 = i3 + 7;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static String onExtraCallbackWithResult(byte b) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        onNavigationEvent(new int[]{-744098760, 361064847}, 2 - View.combineMeasuredStates(0, 0), objArr);
        sb.append((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        onNavigationEvent(new int[]{2002098769, 233236541}, Drawable.resolveOpacity(0, 0) + 4, objArr2);
        sb.append(String.format((String) objArr2[0], Byte.valueOf(b)));
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void onNavigationEvent(int[] iArr, int i, Object[] objArr) {
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3;
        int i2 = 2 % 2;
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda32 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = onExtraCallback;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr3[i3] = (int) (iArr2[i3] ^ (-2238453702121083934L));
                i3++;
                int i4 = asInterface + 87;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 == null) {
            utilExternalSyntheticLambda3 = utilExternalSyntheticLambda32;
        } else {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                iArr6[i6] = (int) (iArr5[i6] ^ (-2238453702121083934L));
                i6++;
                utilExternalSyntheticLambda32 = utilExternalSyntheticLambda32;
            }
            utilExternalSyntheticLambda3 = utilExternalSyntheticLambda32;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda33 = utilExternalSyntheticLambda3;
        utilExternalSyntheticLambda33.onExtraCallback = 0;
        while (utilExternalSyntheticLambda33.onExtraCallback < iArr.length) {
            cArr[0] = (char) (iArr[utilExternalSyntheticLambda33.onExtraCallback] >> 16);
            cArr[1] = (char) iArr[utilExternalSyntheticLambda33.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda33.onExtraCallback + 1] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda33.onExtraCallback + 1];
            utilExternalSyntheticLambda33.IAuthTabCallback = (cArr[0] << 16) + cArr[1];
            utilExternalSyntheticLambda33.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            int i7 = asInterface + 125;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = asInterface + 101;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                utilExternalSyntheticLambda33.IAuthTabCallback ^= iArr4[i9];
                utilExternalSyntheticLambda33.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda33.IAuthTabCallback) ^ utilExternalSyntheticLambda33.onNavigationEvent;
                int i12 = utilExternalSyntheticLambda33.IAuthTabCallback;
                utilExternalSyntheticLambda33.IAuthTabCallback = utilExternalSyntheticLambda33.onNavigationEvent;
                utilExternalSyntheticLambda33.onNavigationEvent = i12;
            }
            int i13 = utilExternalSyntheticLambda33.IAuthTabCallback;
            utilExternalSyntheticLambda33.IAuthTabCallback = utilExternalSyntheticLambda33.onNavigationEvent;
            utilExternalSyntheticLambda33.onNavigationEvent = i13;
            utilExternalSyntheticLambda33.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda33.IAuthTabCallback ^= iArr4[17];
            int i14 = utilExternalSyntheticLambda33.IAuthTabCallback;
            int i15 = utilExternalSyntheticLambda33.onNavigationEvent;
            cArr[0] = (char) (utilExternalSyntheticLambda33.IAuthTabCallback >>> 16);
            cArr[1] = (char) utilExternalSyntheticLambda33.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda33.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda33.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda33.onExtraCallback << 1] = cArr[0];
            cArr2[(utilExternalSyntheticLambda33.onExtraCallback << 1) + 1] = cArr[1];
            cArr2[(utilExternalSyntheticLambda33.onExtraCallback << 1) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda33.onExtraCallback << 1) + 3] = cArr[3];
            utilExternalSyntheticLambda33.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void onNavigationEvent(String str, byte b, int i, Object[] objArr) {
        int i2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ 6292690160322140727L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (6292690160322140727L ^ onWarmupCompleted);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            reorderingBufferQueue.onNavigationEvent = 0;
            while (reorderingBufferQueue.onNavigationEvent < i2) {
                reorderingBufferQueue.onExtraCallbackWithResult = cArr[reorderingBufferQueue.onNavigationEvent];
                reorderingBufferQueue.IAuthTabCallback = cArr[reorderingBufferQueue.onNavigationEvent + 1];
                if (reorderingBufferQueue.onExtraCallbackWithResult == reorderingBufferQueue.IAuthTabCallback) {
                    cArr4[reorderingBufferQueue.onNavigationEvent] = (char) (reorderingBufferQueue.onExtraCallbackWithResult - b);
                    cArr4[reorderingBufferQueue.onNavigationEvent + 1] = (char) (reorderingBufferQueue.IAuthTabCallback - b);
                } else {
                    reorderingBufferQueue.onWarmupCompleted = reorderingBufferQueue.onExtraCallbackWithResult / c;
                    reorderingBufferQueue.asBinder = reorderingBufferQueue.onExtraCallbackWithResult % c;
                    reorderingBufferQueue.onExtraCallback = reorderingBufferQueue.IAuthTabCallback / c;
                    reorderingBufferQueue.onTransact = reorderingBufferQueue.IAuthTabCallback % c;
                    if (reorderingBufferQueue.asBinder == reorderingBufferQueue.onTransact) {
                        reorderingBufferQueue.onWarmupCompleted = ((reorderingBufferQueue.onWarmupCompleted + c) - 1) % c;
                        reorderingBufferQueue.onExtraCallback = ((reorderingBufferQueue.onExtraCallback + c) - 1) % c;
                        int i4 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i5 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i4];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i5];
                    } else if (reorderingBufferQueue.onWarmupCompleted == reorderingBufferQueue.onExtraCallback) {
                        reorderingBufferQueue.asBinder = ((reorderingBufferQueue.asBinder + c) - 1) % c;
                        reorderingBufferQueue.onTransact = ((reorderingBufferQueue.onTransact + c) - 1) % c;
                        int i6 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i7 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i6];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i7];
                    } else {
                        int i8 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.onTransact;
                        int i9 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.asBinder;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i8];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i9];
                    }
                }
                reorderingBufferQueue.onNavigationEvent += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        onNavigationEvent();
        onExtraCallback = new int[]{1440632145, -1838066207, -1011459331, -866313386, 1241542296, -2005488517, 233319249, -1160074377, -1541269551, -1748397123, 1327746674, -1738440669, 402420300, 1987369857, -108280642, 1193018052, -401089333, 765724212};
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{61378, 61400, 61403, 61402, 61388, 61423, 61407, 61380, 61384, 61379, 61396, 61405, 61387, 61315, 61401, 61383};
        onWarmupCompleted = (char) 55859;
    }
}
