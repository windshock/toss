package o;

import android.content.Context;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.LongBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class DatabaseIOException {
    private static final byte[] $$a;
    public static long IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    public static long IAuthTabCallbackStub;
    private static char[] IAuthTabCallbackStubProxy;
    private static char IAuthTabCallback_Parcel;
    private static char access000;
    private static char access100;
    private static int asBinder;
    public static Object[] asInterface;
    private static char extraCallbackWithResult;
    private static char[] getInterfaceDescriptor;
    public static long onExtraCallback;
    public static Object[] onExtraCallbackWithResult;
    private static int onMinimized;
    public static Object[] onNavigationEvent;
    public static List<Object[]> onTransact;
    public static long onWarmupCompleted;
    private static char readTypedObject;
    private static char writeTypedObject;
    private static final int $$b = 54;
    private static int onMessageChannelReady = 0;
    private static int onPostMessage = 1;
    private static int onActivityResized = 0;
    private static int extraCallback = 0;
    private static int ICustomTabsCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 38
            int r7 = 111 - r7
            byte[] r0 = o.DatabaseIOException.$$a
            int r6 = r6 * 46
            int r6 = r6 + 4
            int r5 = r5 * 31
            int r1 = 47 - r5
            byte[] r1 = new byte[r1]
            int r5 = 46 - r5
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatabaseIOException.a(int, byte, short, java.lang.Object[]):void");
    }

    public static native long read(int i, byte[][] bArr, int i2, int i3, String[][] strArr);

    private static void onExtraCallbackWithResult(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = new AssetDataSourceAssetDataSourceException();
        char[] cArr = new char[charArray.length];
        assetDataSourceAssetDataSourceException.onExtraCallback = 0;
        char[] cArr2 = new char[2];
        while (assetDataSourceAssetDataSourceException.onExtraCallback < charArray.length) {
            cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
            cArr2[1] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (writeTypedObject - 3974139103868117988L)))) ^ ((c2 >>> 5) + ((char) (extraCallbackWithResult - 3974139103868117988L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (readTypedObject - 3974139103868117988L))) ^ ((c3 + i2) ^ ((c3 << 4) + ((char) (access000 - 3974139103868117988L))))));
                i2 -= 40503;
            }
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback] = cArr2[0];
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback + 1] = cArr2[1];
            assetDataSourceAssetDataSourceException.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }

    static {
        byte[] bArr = {51, -39, 98, -44, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onMinimized = 1;
        IAuthTabCallback();
        onNavigationEvent();
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (bArr[28] - 1);
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            onExtraCallback = -1L;
            IAuthTabCallback = 0L;
            onNavigationEvent = null;
            onExtraCallbackWithResult = null;
            onWarmupCompleted = -1L;
            IAuthTabCallbackStub = 0L;
            asInterface = null;
            onTransact = null;
            int i = onActivityResized + 15;
            onMinimized = i % 128;
            if (i % 2 == 0) {
                throw new ArithmeticException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void onNavigationEvent(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i2 = 2 % 2;
        if (str3 == null) {
            charArray = str3;
        } else {
            int i3 = onMessageChannelReady + 31;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            charArray = str3.toCharArray();
            int i5 = onPostMessage + 1;
            onMessageChannelReady = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
        }
        char[] cArr = charArray;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
            int i7 = onMessageChannelReady + 85;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        int i9 = onMessageChannelReady + 105;
        onPostMessage = i9 % 128;
        int i10 = i9 % 2;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i11 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i12 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr4[i11]) % 65535);
            cArr4[i12] = (char) (((cArr3[i12] * 32718) + cArr4[i11]) / 65535);
            cArr3[i12] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr5[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr3[i12] ^ charArray3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (IAuthTabCallbackDefault ^ 5161337353776785399L)) ^ ((int) (asBinder ^ 5161337353776785399L))) ^ ((char) (IAuthTabCallback_Parcel ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr5);
    }

    private static void onNavigationEvent(String str, byte b, int i, Object[] objArr) {
        int i2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue();
        char[] cArr2 = IAuthTabCallbackStubProxy;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ 6292690160322140727L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (6292690160322140727L ^ access100);
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

    private static void IAuthTabCallback(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda02;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda03;
        String str2 = str;
        int i = 2;
        int i2 = 2 % 2;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda04 = new UtilExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = onMessageChannelReady + 75;
                onPostMessage = i8 % 128;
                if (i8 % i != 0) {
                    utilExternalSyntheticLambda03 = utilExternalSyntheticLambda04;
                    cArr2[i7] = (char) (cArr[i7] - 4301814714517170301L);
                    i7++;
                } else {
                    utilExternalSyntheticLambda03 = utilExternalSyntheticLambda04;
                    cArr2[i7] = (char) (cArr[i7] & 4301814714517170301L);
                    i7 >>= 1;
                }
                utilExternalSyntheticLambda04 = utilExternalSyntheticLambda03;
                i = 2;
            }
            utilExternalSyntheticLambda0 = utilExternalSyntheticLambda04;
            cArr = cArr2;
        } else {
            utilExternalSyntheticLambda0 = utilExternalSyntheticLambda04;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr == null) {
            utilExternalSyntheticLambda02 = utilExternalSyntheticLambda0;
        } else {
            char[] cArr4 = new char[i4];
            utilExternalSyntheticLambda02 = utilExternalSyntheticLambda0;
            utilExternalSyntheticLambda02.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda02.onNavigationEvent < i4) {
                if (bArr[utilExternalSyntheticLambda02.onNavigationEvent] != 1) {
                    cArr4[utilExternalSyntheticLambda02.onNavigationEvent] = (char) ((cArr3[utilExternalSyntheticLambda02.onNavigationEvent] << 1) - c);
                } else {
                    int i9 = onMessageChannelReady + 59;
                    onPostMessage = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[utilExternalSyntheticLambda02.onNavigationEvent] = (char) (((cArr3[utilExternalSyntheticLambda02.onNavigationEvent] << 1) + 1) - c);
                }
                c = cArr4[utilExternalSyntheticLambda02.onNavigationEvent];
                utilExternalSyntheticLambda02.onNavigationEvent++;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = onPostMessage + 19;
            onMessageChannelReady = i11 % 128;
            if (i11 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 + i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 % i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i12, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i12);
            }
            int i13 = onPostMessage + 49;
            onMessageChannelReady = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 2;
            }
        }
        if (!(!z)) {
            int i15 = onMessageChannelReady + 91;
            onPostMessage = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr7 = new char[i4];
            utilExternalSyntheticLambda02.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda02.onNavigationEvent < i4) {
                cArr7[utilExternalSyntheticLambda02.onNavigationEvent] = cArr3[(i4 - utilExternalSyntheticLambda02.onNavigationEvent) - 1];
                utilExternalSyntheticLambda02.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i17 = onMessageChannelReady + 107;
            onPostMessage = i17 % 128;
            if (i17 % 2 != 0) {
                utilExternalSyntheticLambda02.onNavigationEvent = 0;
            } else {
                utilExternalSyntheticLambda02.onNavigationEvent = 1;
            }
            while (utilExternalSyntheticLambda02.onNavigationEvent < i4) {
                cArr3[utilExternalSyntheticLambda02.onNavigationEvent] = (char) (cArr3[utilExternalSyntheticLambda02.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda02.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static int onNavigationEvent(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 49;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((int[]) onExtraCallback(context, new String[]{str}, i, 0, 15)[3])[0];
        int i6 = extraCallback + 1;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw new NullPointerException();
    }

    public static Object[] onExtraCallback(Context context, String[] strArr, int i, int i2, int i3) throws Throwable {
        char c;
        int i4;
        int i5;
        LongBuffer[] longBufferArr;
        int i6;
        int i7 = 2 % 2;
        int i8 = extraCallback + 33;
        ICustomTabsCallback = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 1;
        int i11 = 0;
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, null, new int[]{i}, new int[]{i}};
            int i12 = i3 + 409049146 + (((~(i | 138998192)) | (-352226627)) * (-668)) + ((138998192 | (~((-352226627) | i))) * 1336) + ((i | (-347475011)) * 668);
            int i13 = i12 ^ (i12 << 13);
            int i14 = i13 ^ (i13 >>> 17);
            return objArr;
        }
        int i15 = 16;
        if (strArr.length == 0) {
            Object[] objArr2 = {new int[1], null, new int[]{i}, new int[]{i ^ 4}};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i16 = ~(476745405 | iFreeMemory);
            int i17 = i3 + 565675583 + ((9728000 | i16) * (-814)) + ((i16 | (~((~iFreeMemory) | (-14479414))) | 471993992) * 407) + (((~(iFreeMemory | 14479413)) | (~((-476745406) | iFreeMemory)) | 471993992) * 407) + 16;
            int i18 = i17 ^ (i17 << 13);
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
            int i20 = extraCallback + 57;
            ICustomTabsCallback = i20 % 128;
            int i21 = i20 % 2;
            return objArr2;
        }
        int length = strArr.length;
        Object[] objArr3 = new Object[1];
        onNavigationEvent("*\u001f* *\u0005)+.\f*\u0006\r\"\u0013\u001e\"\u001e㘪", (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 67), (ViewConfiguration.getTouchSlop() >> 8) + 19, objArr3);
        LongBuffer[] longBufferArr2 = (LongBuffer[]) Array.newInstance(Class.forName((String) objArr3[0]), length);
        int i22 = 0;
        while (i22 < strArr.length) {
            String lowerCase = strArr[i22].toLowerCase();
            Object[] objArr4 = new Object[i10];
            onNavigationEvent("㿸", (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i11) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i11) == 0.0d ? 0 : -1)) + 23195), "㕞ᘓ鮚ꅚ", (-1709829324) - TextUtils.lastIndexOf("", '0', i11, i11), "\u0000\u0000\u0000\u0000", objArr4);
            String strReplaceAll = lowerCase.replaceAll((String) objArr4[i11], "");
            long jLongValue = new BigInteger(strReplaceAll.substring(i15, 32), i15).longValue();
            int i23 = i22;
            long jLongValue2 = new BigInteger(strReplaceAll.substring(i11, i15), i15).longValue();
            int length2 = strReplaceAll.length();
            if (length2 == 32) {
                longBufferArr = longBufferArr2;
                i6 = 16;
                longBufferArr[i23] = LongBuffer.allocate(2).put(jLongValue2).put(jLongValue);
            } else {
                if (length2 != 64) {
                    Object[] objArr5 = new Object[4];
                    objArr5[i11] = new int[i10];
                    int[] iArr = new int[i10];
                    objArr5[2] = iArr;
                    int[] iArr2 = new int[i10];
                    objArr5[3] = iArr2;
                    iArr[i11] = i;
                    iArr2[i11] = i ^ 3;
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i24 = ~elapsedCpuTime;
                    int i25 = i3 + 2246450 + (((~(i24 | 457146097)) | 34078721) * 220) + (((~(i24 | 168633409)) | 322591409) * (-440)) + ((elapsedCpuTime | 457146097) * 220) + 16;
                    int i26 = i25 ^ (i25 << 13);
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr5[i11])[i11] = i27 ^ (i27 << 5);
                    objArr5[i10] = null;
                    return objArr5;
                }
                i6 = 16;
                longBufferArr = longBufferArr2;
                longBufferArr[i23] = LongBuffer.allocate(4).put(jLongValue2).put(jLongValue).put(new BigInteger(strReplaceAll.substring(32, 48), 16).longValue()).put(new BigInteger(strReplaceAll.substring(48), 16).longValue());
            }
            i22 = i23 + 1;
            i15 = i6;
            longBufferArr2 = longBufferArr;
            i10 = 1;
            i11 = 0;
        }
        int i28 = i15;
        Object[] objArrOnWarmupCompleted = onWarmupCompleted(context, longBufferArr2, i, i2, i3);
        Object obj = objArrOnWarmupCompleted[0];
        int i29 = ((int[]) obj)[0];
        if (i != ((int[]) obj)[0]) {
            int i30 = ICustomTabsCallback + 63;
            extraCallback = i30 % 128;
            c = 2;
            int i31 = i30 % 2;
            i5 = i28;
            i4 = 1;
        } else {
            c = 2;
            i4 = 1;
            i5 = 0;
        }
        String[] strArr2 = (String[]) objArrOnWarmupCompleted[i4];
        Object[] objArr6 = new Object[4];
        objArr6[0] = new int[i4];
        int[] iArr3 = new int[i4];
        objArr6[c] = iArr3;
        int[] iArr4 = new int[i4];
        objArr6[3] = iArr4;
        iArr3[0] = i;
        iArr4[0] = i29;
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i32 = 1720699886 + ((481328266 | elapsedCpuTime2) * 614);
        int i33 = ~elapsedCpuTime2;
        int i34 = i3 + i32 + (((~((-75234623) | i33)) | 70286346 | (~(415990196 | i33))) * (-1228)) + (((~(i33 | 486276542)) | (~((-4948277) | i33))) * 614) + i5;
        int i35 = i34 ^ (i34 << 13);
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr6[0])[0] = i36 ^ (i36 << 5);
        objArr6[1] = strArr2;
        return objArr6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0689 A[Catch: Exception -> 0x07a0, TryCatch #31 {Exception -> 0x07a0, blocks: (B:172:0x0683, B:174:0x0689, B:177:0x0691, B:179:0x0699, B:181:0x06cc, B:184:0x0718, B:185:0x071e, B:187:0x0724, B:189:0x0738, B:191:0x0752, B:193:0x0757, B:194:0x075c, B:195:0x0774, B:197:0x077a, B:199:0x078a, B:158:0x0633, B:171:0x067c, B:201:0x078f, B:203:0x079a, B:204:0x079b, B:15:0x00c1), top: B:510:0x00b4, inners: #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07a0 A[PHI: r28 r33
      0x07a0: PHI (r28v3 ??) = (r28v2 ??), (r28v5 ??), (r28v20 ??), (r28v20 ??), (r28v20 ??) binds: [B:205:0x079c, B:460:0x07a0, B:173:0x0687, B:554:0x07a0, B:176:0x068f] A[DONT_GENERATE, DONT_INLINE]
      0x07a0: PHI (r33v6 java.lang.String) = (r33v5 java.lang.String), (r33v38 java.lang.String), (r33v38 java.lang.String), (r33v38 java.lang.String) binds: [B:205:0x079c, B:173:0x0687, B:554:0x07a0, B:176:0x068f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0ac1 A[Catch: all -> 0x1328, TryCatch #3 {all -> 0x1328, blocks: (B:276:0x0ab2, B:278:0x0ac1, B:280:0x0ac9, B:285:0x0b1c, B:287:0x0b4d, B:289:0x0b55, B:290:0x0b5d, B:297:0x0b73, B:292:0x0b68, B:294:0x0b6f, B:295:0x0b70, B:299:0x0b7a, B:301:0x0b81, B:302:0x0b82, B:304:0x0b85, B:306:0x0c5a, B:308:0x0c5f, B:310:0x0c65, B:312:0x0c75, B:314:0x0c7b, B:316:0x0c7f, B:320:0x0c95, B:323:0x0ca9, B:327:0x0cbf, B:335:0x0cde, B:337:0x0ce4, B:339:0x0d85, B:341:0x0dc8, B:357:0x0eb7, B:359:0x0ec2, B:363:0x0f14, B:365:0x0f67, B:367:0x0fb3, B:377:0x1137, B:382:0x11ee, B:384:0x11ff, B:386:0x1206, B:387:0x1207, B:389:0x1209, B:391:0x1210, B:392:0x1211, B:400:0x122d, B:402:0x123a, B:404:0x124c, B:395:0x1219, B:397:0x1220, B:398:0x1221, B:406:0x125f, B:408:0x1266, B:409:0x1267, B:411:0x1269, B:413:0x1270, B:414:0x1271, B:416:0x1273, B:418:0x127a, B:419:0x127b, B:421:0x127d, B:423:0x1284, B:424:0x1285, B:426:0x1287, B:428:0x128e, B:429:0x128f, B:430:0x1290, B:364:0x0f3f, B:432:0x12a2, B:434:0x12a9, B:435:0x12aa, B:436:0x12ab, B:437:0x12ed, B:439:0x12f3, B:440:0x12ff, B:343:0x0dd2, B:345:0x0dd9, B:346:0x0dda, B:348:0x0ddc, B:350:0x0de3, B:351:0x0de4, B:443:0x130b, B:445:0x1312, B:446:0x1313, B:448:0x1315, B:450:0x131c, B:451:0x131d, B:453:0x131f, B:455:0x1326, B:456:0x1327, B:333:0x0cd9, B:360:0x0ec4, B:340:0x0d90, B:329:0x0cd1, B:330:0x0cd6, B:338:0x0d4f, B:372:0x10b2, B:286:0x0b20, B:371:0x1088, B:370:0x103f, B:281:0x0acb, B:369:0x0ff2, B:381:0x1196, B:368:0x0fb5, B:379:0x1140, B:356:0x0e53, B:354:0x0e1f, B:375:0x10e2, B:353:0x0de9), top: B:473:0x0aaf, inners: #0, #14, #16, #19, #21, #24, #26, #34, #37, #41, #42, #45, #46, #48, #52, #54, #55 }] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v16, types: [int] */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v5, types: [int] */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.nio.LongBuffer[]] */
    /* JADX WARN: Type inference failed for: r2v154, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v170, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v32 */
    /* JADX WARN: Type inference failed for: r33v33, types: [int] */
    /* JADX WARN: Type inference failed for: r33v35 */
    /* JADX WARN: Type inference failed for: r33v37 */
    /* JADX WARN: Type inference failed for: r4v103, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v108, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v114, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v121, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v123, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v133, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v88, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r4v95, types: [java.lang.Object, java.security.KeyStore] */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r5v144, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v118, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v130, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v98, types: [java.nio.LongBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object[] onWarmupCompleted(android.content.Context r40, java.nio.LongBuffer[] r41, int r42, int r43, int r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatabaseIOException.onWarmupCompleted(android.content.Context, java.nio.LongBuffer[], int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0144 A[Catch: Exception -> 0x0205, TRY_ENTER, TryCatch #5 {Exception -> 0x0205, blocks: (B:3:0x000c, B:5:0x0039, B:7:0x0093, B:9:0x00aa, B:14:0x00bd, B:16:0x00d7, B:27:0x00f9, B:30:0x0144, B:31:0x0152, B:36:0x019a, B:38:0x01a0, B:39:0x01a1, B:41:0x01a3, B:43:0x01a9, B:44:0x01aa, B:45:0x01ab, B:46:0x01d2, B:48:0x01d8, B:49:0x01e4, B:52:0x01f4, B:54:0x01fa, B:55:0x01fb, B:57:0x01fd, B:59:0x0203, B:60:0x0204, B:28:0x0101, B:6:0x003e, B:33:0x0161, B:4:0x0011), top: B:82:0x000c, inners: #0, #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object[] onWarmupCompleted(java.lang.Throwable r17, int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatabaseIOException.onWarmupCompleted(java.lang.Throwable, int):java.lang.Object[]");
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = 5161337353776785399L;
        asBinder = -1330893134;
        IAuthTabCallback_Parcel = (char) 59383;
        getInterfaceDescriptor = new char[]{10415, 10472, 10477, 10473, 10467, 10452, 10453, 10476, 10467, 10464, 10478, 10477, 10472, 10448, 10452, 10469, 10567, 10567, 10553, 10553, 10558, 10558, 10574, 10571, 10569, 10565, 10543, 10547, 10574, 10552, 10540, 10557, 10562, 10563, 10559, 10398, 10433, 10439, 10522, 10529, 10528, 10521, 10519, 10527, 10504, 10502, 10526, 10524, 10520, 10516, 10512, 10520, 10524, 10522, 10524, 10432, 10487, 10483, 10492, 10467, 10461, 10486, 10496, 10471, 10466, 10491, 10370, 10423, 10493, 10501, 10506, 10512, 10502, 10496, 10503, 10504, 10496, 10462, 10462, 10503, 10510, 10508, 10508, 10469, 10463, 10497, 10504, 10503, 10497, 10500, 10503, 10502, 10463, 10469, 10511, 10502, 10494, 10499, 10465, 10470, 10511, 10501, 10494, 10496, 10462, 10464, 10503, 10502, 10502, 10508, 10507, 10499, 10502, 10506, 10504, 10506, 10480, 10441, 10432};
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStubProxy = new char[]{61379, 61385, 60464, 61405, 61433, 61408, 61386, 61406, 61434, 61396, 60466, 61409, 61381, 61391, 61376, 61413, 61400, 61417, 61412, 60470, 60467, 61437, 61390, 61418, 61420, 60465, 61438, 61423, 61388, 61384, 61382, 60471, 61419, 61387, 61422, 61389, 61380, 60469, 61377, 61397, 60468, 61402, 61407, 61416, 61401, 61383, 61403, 61315, 61378};
        access100 = (char) 55856;
        access000 = (char) 56408;
        readTypedObject = (char) 916;
        writeTypedObject = (char) 2744;
        extraCallbackWithResult = (char) 39992;
    }
}
