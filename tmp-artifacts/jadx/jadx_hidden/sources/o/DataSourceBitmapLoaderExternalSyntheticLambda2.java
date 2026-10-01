package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Set;

/* loaded from: classes.dex */
public class DataSourceBitmapLoaderExternalSyntheticLambda2 {
    public static Object[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    public static Object[] IAuthTabCallbackStub = null;
    private static int[] IAuthTabCallbackStubProxy = null;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static long access000 = 0;
    private static int access100 = 1;
    public static long asBinder = 0;
    public static long asInterface = 0;
    private static int extraCallback = 1;
    private static int[] getInterfaceDescriptor;
    public static long onExtraCallback;
    public static long onExtraCallbackWithResult;
    public static long onNavigationEvent;
    public static Object[] onTransact;
    public static long onWarmupCompleted;
    private static int readTypedObject;
    private static int writeTypedObject;

    private static void onExtraCallback(String str, int i, Object[] objArr) {
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda4 utilExternalSyntheticLambda4 = new UtilExternalSyntheticLambda4();
        utilExternalSyntheticLambda4.onExtraCallbackWithResult = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            jArr[utilExternalSyntheticLambda4.IAuthTabCallback] = (cArr[utilExternalSyntheticLambda4.IAuthTabCallback] ^ (utilExternalSyntheticLambda4.IAuthTabCallback * utilExternalSyntheticLambda4.onExtraCallbackWithResult)) ^ (access000 - (-916733648318839497L));
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        char[] cArr2 = new char[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            cArr2[utilExternalSyntheticLambda4.IAuthTabCallback] = (char) jArr[utilExternalSyntheticLambda4.IAuthTabCallback];
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        IAuthTabCallback();
        onWarmupCompleted();
        onExtraCallbackWithResult = -1L;
        onExtraCallback = 0L;
        IAuthTabCallback = null;
        onNavigationEvent = -1L;
        onWarmupCompleted = 0L;
        onTransact = null;
        asBinder = -1L;
        asInterface = 0L;
        IAuthTabCallbackStub = null;
        int i = writeTypedObject + 111;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            throw new NullPointerException();
        }
    }

    private static void IAuthTabCallback(int[] iArr, int i, Object[] objArr) {
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = IAuthTabCallbackStubProxy;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-2238453702121083934L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStubProxy;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-2238453702121083934L));
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        utilExternalSyntheticLambda3.onExtraCallback = 0;
        while (utilExternalSyntheticLambda3.onExtraCallback < iArr.length) {
            cArr[0] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback] >> 16);
            cArr[1] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback + 1] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback + 1];
            utilExternalSyntheticLambda3.IAuthTabCallback = (cArr[0] << 16) + cArr[1];
            utilExternalSyntheticLambda3.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[i4];
                utilExternalSyntheticLambda3.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda3.IAuthTabCallback) ^ utilExternalSyntheticLambda3.onNavigationEvent;
                int i5 = utilExternalSyntheticLambda3.IAuthTabCallback;
                utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                utilExternalSyntheticLambda3.onNavigationEvent = i5;
            }
            int i6 = utilExternalSyntheticLambda3.IAuthTabCallback;
            utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
            utilExternalSyntheticLambda3.onNavigationEvent = i6;
            utilExternalSyntheticLambda3.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[17];
            int i7 = utilExternalSyntheticLambda3.IAuthTabCallback;
            int i8 = utilExternalSyntheticLambda3.onNavigationEvent;
            cArr[0] = (char) (utilExternalSyntheticLambda3.IAuthTabCallback >>> 16);
            cArr[1] = (char) utilExternalSyntheticLambda3.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda3.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda3.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda3.onExtraCallback << 1] = cArr[0];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 1] = cArr[1];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 3] = cArr[3];
            utilExternalSyntheticLambda3.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void IAuthTabCallback(int i, String str, int i2, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        char[] charArray = str;
        if (str != null) {
            int i5 = readTypedObject + 91;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda2 utilExternalSyntheticLambda2 = new UtilExternalSyntheticLambda2();
        char[] cArr2 = new char[i3];
        utilExternalSyntheticLambda2.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
            int i7 = ICustomTabsCallback + 1;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            utilExternalSyntheticLambda2.onNavigationEvent = cArr[utilExternalSyntheticLambda2.IAuthTabCallback];
            cArr2[utilExternalSyntheticLambda2.IAuthTabCallback] = (char) (utilExternalSyntheticLambda2.onNavigationEvent + i);
            int i9 = utilExternalSyntheticLambda2.IAuthTabCallback;
            cArr2[i9] = (char) (cArr2[i9] - ((int) (IAuthTabCallbackDefault - 8081524258474968927L)));
            utilExternalSyntheticLambda2.IAuthTabCallback++;
        }
        if (i2 > 0) {
            int i10 = readTypedObject + 37;
            ICustomTabsCallback = i10 % 128;
            int i11 = i10 % 2;
            utilExternalSyntheticLambda2.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult, utilExternalSyntheticLambda2.onExtraCallbackWithResult);
            System.arraycopy(cArr3, utilExternalSyntheticLambda2.onExtraCallbackWithResult, cArr2, 0, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult);
        }
        if (z) {
            int i12 = ICustomTabsCallback + 3;
            readTypedObject = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i3];
            utilExternalSyntheticLambda2.IAuthTabCallback = 0;
            while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
                cArr4[utilExternalSyntheticLambda2.IAuthTabCallback] = cArr2[(i3 - utilExternalSyntheticLambda2.IAuthTabCallback) - 1];
                utilExternalSyntheticLambda2.IAuthTabCallback++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void onExtraCallback(int[] iArr, int i, Object[] objArr) {
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3;
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda32;
        int i2 = 2;
        int i3 = 2 % 2;
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda33 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = getInterfaceDescriptor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr3[i4] = (int) (iArr2[i4] ^ (-2238453702121083934L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                int i6 = readTypedObject + 3;
                ICustomTabsCallback = i6 % 128;
                if (i6 % i2 != 0) {
                    utilExternalSyntheticLambda32 = utilExternalSyntheticLambda33;
                    iArr6[i5] = (int) (iArr5[i5] ^ (-2238453702121083934L));
                    i5++;
                } else {
                    utilExternalSyntheticLambda32 = utilExternalSyntheticLambda33;
                    iArr6[i5] = (int) (iArr5[i5] ^ (-2238453702121083934L));
                    i5 <<= 1;
                }
                utilExternalSyntheticLambda33 = utilExternalSyntheticLambda32;
                i2 = 2;
            }
            utilExternalSyntheticLambda3 = utilExternalSyntheticLambda33;
            iArr5 = iArr6;
        } else {
            utilExternalSyntheticLambda3 = utilExternalSyntheticLambda33;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda34 = utilExternalSyntheticLambda3;
        utilExternalSyntheticLambda34.onExtraCallback = 0;
        while (utilExternalSyntheticLambda34.onExtraCallback < iArr.length) {
            int i7 = readTypedObject + 1;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            cArr[0] = (char) (iArr[utilExternalSyntheticLambda34.onExtraCallback] >> 16);
            cArr[1] = (char) iArr[utilExternalSyntheticLambda34.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda34.onExtraCallback + 1] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda34.onExtraCallback + 1];
            utilExternalSyntheticLambda34.IAuthTabCallback = (cArr[0] << 16) + cArr[1];
            utilExternalSyntheticLambda34.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            int i9 = 0;
            while (i9 < 16) {
                utilExternalSyntheticLambda34.IAuthTabCallback ^= iArr4[i9];
                utilExternalSyntheticLambda34.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda34.IAuthTabCallback) ^ utilExternalSyntheticLambda34.onNavigationEvent;
                int i10 = utilExternalSyntheticLambda34.IAuthTabCallback;
                utilExternalSyntheticLambda34.IAuthTabCallback = utilExternalSyntheticLambda34.onNavigationEvent;
                utilExternalSyntheticLambda34.onNavigationEvent = i10;
                i9++;
                int i11 = readTypedObject + 53;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = utilExternalSyntheticLambda34.IAuthTabCallback;
            utilExternalSyntheticLambda34.IAuthTabCallback = utilExternalSyntheticLambda34.onNavigationEvent;
            utilExternalSyntheticLambda34.onNavigationEvent = i13;
            utilExternalSyntheticLambda34.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda34.IAuthTabCallback ^= iArr4[17];
            int i14 = utilExternalSyntheticLambda34.IAuthTabCallback;
            int i15 = utilExternalSyntheticLambda34.onNavigationEvent;
            cArr[0] = (char) (utilExternalSyntheticLambda34.IAuthTabCallback >>> 16);
            cArr[1] = (char) utilExternalSyntheticLambda34.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda34.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda34.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda34.onExtraCallback << 1] = cArr[0];
            cArr2[(utilExternalSyntheticLambda34.onExtraCallback << 1) + 1] = cArr[1];
            cArr2[(utilExternalSyntheticLambda34.onExtraCallback << 1) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda34.onExtraCallback << 1) + 3] = cArr[3];
            utilExternalSyntheticLambda34.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static Object[] onExtraCallbackWithResult(Context context, int i, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int iOnExtraCallback = onExtraCallback(context, i, i2);
        Object[] objArr = {new int[]{i ^ (i << 5)}, null, new int[]{i}, new int[]{iOnExtraCallback}};
        int i5 = i ^ iOnExtraCallback;
        int i6 = ~i;
        int i7 = i3 + 652246680 + ((954937974 | i6) * (-757)) + ((~(954972150 | i)) * 1514) + (((~(i6 | 952272848)) | 2699302 | (~(i | (-34177)))) * 757) + (((i5 | (-i5)) >> 31) & 16);
        int i8 = (i7 << 13) ^ i7;
        int i9 = i8 ^ (i8 >>> 17);
        int i10 = IAuthTabCallback_Parcel + 3;
        access100 = i10 % 128;
        if (i10 % 2 != 0) {
            return objArr;
        }
        throw new ArithmeticException();
    }

    private static int onExtraCallback(Context context, int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5 = 2 % 2;
        if (context != null) {
            int i6 = IAuthTabCallback_Parcel;
            int i7 = i6 + 83;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 91;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr = new Object[1];
                onExtraCallback("Ꭶ䣐ꕑǞ繌\udaf3㝵鎦졬ⓩ脓ﶀ娎뚌ጭ俾ꐔ¡紫\uda48㛖鍒쿕", 23417 - View.getDefaultSize(0, 0), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                IAuthTabCallback(new int[]{109717233, -580204921, 123545389, 675608937, -1709306235, 2017005298, 1989630562, -279331774, -797550404, 1945135753}, AndroidCharacter.getMirror('0') - 30, objArr2);
                Object objInvoke = cls.getMethod((String) objArr2[0], null).invoke(context, null);
                Object[] objArr3 = new Object[1];
                onExtraCallback("Ꭶ榎\ue7ed緀הּ煭콉䓸슜壷혯Ⱎꩶ⁒붑㮠뇇༽蕗ͣ颻ᚄ泱\uea2f怌﹩瑅\uf1b3俬엂䌜\ud910坁겯", KeyEvent.getDeadChar(0, 0) + 31271, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                onExtraCallback("Ꭱ\ufde2켴\ud97bꪐ", Color.red(0) + 61001, objArr4);
                int i11 = cls2.getField((String) objArr4[0]).getInt(objInvoke) & 2;
                int i12 = (i11 | (-i11)) >> 31;
                i3 = (i12 & (i ^ 1)) | ((~i12) & i);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i3 = i;
        }
        Set<BigInteger> setOnExtraCallbackWithResult = AudioBecomingNoisyManagerExternalSyntheticLambda1.onExtraCallbackWithResult();
        if ((setOnExtraCallbackWithResult.contains(AudioBecomingNoisyManagerExternalSyntheticLambda1.IAuthTabCallback) || setOnExtraCallbackWithResult.contains(AudioBecomingNoisyManagerExternalSyntheticLambda1.onWarmupCompleted)) && Build.VERSION.SDK_INT == 30) {
            i4 = i;
        } else {
            int iAsInterface = asInterface();
            int i13 = (iAsInterface | (-iAsInterface)) >> 31;
            int i14 = i2 & 32;
            int i15 = (i14 | (-i14)) >> 31;
            i4 = (i15 & i) | (((i13 & (i ^ 10)) | ((~i13) & i)) & (~i15));
        }
        int i16 = i ^ i3;
        int i17 = (i16 | (-i16)) >> 31;
        int i18 = (i3 & i17) | (i4 & (~i17));
        int i19 = access100 + 91;
        IAuthTabCallback_Parcel = i19 % 128;
        int i20 = i19 % 2;
        return i18;
    }

    public static int onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 11;
        IAuthTabCallback_Parcel = i3 % 128;
        return i3 % 2 != 0 ? ((int[]) onExtraCallbackWithResult(i, 0)[3])[0] : ((int[]) onExtraCallbackWithResult(i, 0)[3])[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] onExtraCallbackWithResult(int r9, int r10) throws java.lang.ClassNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DataSourceBitmapLoaderExternalSyntheticLambda2.onExtraCallbackWithResult(int, int):java.lang.Object[]");
    }

    private static int onNavigationEvent(int i) throws ClassNotFoundException {
        int i2 = 2 % 2;
        int i3 = access100 + 81;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            IAuthTabCallback(243 - View.MeasureSpec.getSize(0), "\u0001\u0001\u000f￼\uffff\uffde\r\u0003\ufffe\uffff\u000e�\uffff\b\b\t\uffdd\f\uffff", 7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 19 - View.MeasureSpec.getMode(0), true, objArr);
            Object[] objArr2 = new Object[1];
            onExtraCallback(new int[]{56591938, -1007102412, 801109994, 1944633587, -1248206271, -1720272091, 1285441496, 1553195591, 850079645, 420603205}, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            String[] strArr = {(String) objArr[0], (String) objArr2[0]};
            int i5 = IAuthTabCallback_Parcel + 63;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 < 2; i7++) {
                String str = strArr[i7];
                Object[] objArr3 = new Object[1];
                onExtraCallback("Ꭶ꿨次❶\ue2ac뻫稥㘮\uf1a0跽䥣Ո삮鳨堼ᑯ", 48193 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i8 = access100 + 67;
                    IAuthTabCallback_Parcel = i8 % 128;
                    return i8 % 2 != 0 ? i : i ^ 1;
                }
            }
            return i;
        } catch (Exception unused) {
            return i ^ 2;
        }
    }

    private static int onExtraCallback(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = access100 + 33;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent + 111;
            ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            long j = ExoPlayerBuilderExternalSyntheticLambda1.read();
            long j2 = 797195559;
            long jMyUid = Process.myUid();
            long j3 = -1;
            long j4 = j ^ j3;
            long j5 = 676;
            long j6 = jMyUid ^ j3;
            long j7 = (((((677 * j2) + ((-675) * j)) + ((-676) * ((j2 | jMyUid) | j4))) + ((((j4 | j2) ^ j3) | ((j6 | j2) ^ j3)) * j5)) + (j5 * (((jMyUid | (j | j2)) ^ j3) | ((((j2 ^ j3) | j4) ^ j3) | ((j4 | j6) ^ j3))))) - 1568024921;
            int i8 = ((int) (j7 >> 32)) & (((((~((-914410717) | i)) | (-1943330169)) * 56) - 1942297286) + (((-914410717) | (~((-1943330169) | (~i)))) * 56));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i9 = ~iElapsedRealtime;
            int i10 = i8 | (((int) j7) & (881545819 + (((~(1229900468 | i9)) | 536876289) * (-108)) + (((~(i9 | 1627840417)) | (~((-1627840418) | iElapsedRealtime)) | 138936340) * 54) + ((iElapsedRealtime | 138936340) * 54)));
            int i11 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent;
            int i12 = ((i11 | 51) << 1) - (i11 ^ 51);
            ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                throw new NullPointerException();
            }
            i2 = i ^ 10;
            int i13 = i10 ^ 1;
            i3 = (i13 | (-i13)) >> 31;
        } else {
            int i14 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent + 111;
            ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            long j8 = ExoPlayerBuilderExternalSyntheticLambda1.read();
            long j9 = 782312356;
            long j10 = i;
            long j11 = -1;
            long j12 = j8 ^ j11;
            long j13 = 676;
            long j14 = j10 ^ j11;
            long j15 = (((((677 * j9) + ((-675) * j8)) + ((-676) * ((j9 | j10) | j12))) + ((((j12 | j9) ^ j11) | ((j14 | j9) ^ j11)) * j13)) + (j13 * ((((j8 | j9) | j10) ^ j11) | ((((j9 ^ j11) | j12) ^ j11) | ((j12 | j14) ^ j11))))) - 1553141718;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i16 = ((int) (j15 >> 32)) & (635053320 + (((-293863945) | elapsedCpuTime) * (-627)) + (((~((-1143193058) | elapsedCpuTime)) | 294033353) * (-627)) + (((~(elapsedCpuTime | 294033353)) | (~((~elapsedCpuTime) | 1143193057))) * 627));
            int i17 = 435447295 + (((~(518002870 | i)) | 537535553 | (~((-919223540) | i))) * (-754));
            int i18 = ~((-537535554) | i);
            int i19 = ~i;
            int i20 = i16 | (((int) j15) & (i17 + ((i18 | (~((-381687987) | i19))) * (-754)) + ((518002870 | i19) * 754)));
            int i21 = ExoPlayerBuilderExternalSyntheticLambda1.onNavigationEvent;
            int i22 = ((i21 | 51) << 1) - (i21 ^ 51);
            ExoPlayerBuilderExternalSyntheticLambda1.onWarmupCompleted = i22 % 128;
            if (i22 % 2 != 0) {
                throw new NullPointerException();
            }
            i2 = i ^ 62;
            int i23 = i20 ^ 1;
            i3 = (i23 | (-i23)) + 121;
        }
        return (i & i3) | (i2 & (~i3));
    }

    private static boolean onExtraCallbackWithResult() throws IOException {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            IAuthTabCallback(239 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0003\u0010\f\u0003\nￍ\u0004\u0012\u0010\uffff\u0001\u0003�\u0003\f\uffff\u0000\n\u0003\u0002ￍ\u000e\u0010\r\u0001ￍ\u0011\u0017\u0011ￍ\t", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21, 31 - (ViewConfiguration.getTouchSlop() >> 8), false, objArr);
            File file = new File((String) objArr[0]);
            if (!(!file.canRead())) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    String line = bufferedReader.readLine();
                    Object[] objArr2 = new Object[1];
                    IAuthTabCallback((KeyEvent.getMaxKeyCode() >> 16) + 190, "\u0000", 1 - ExpandableListView.getPackedPositionGroup(0L), 1 - KeyEvent.keyCodeFromString(""), true, objArr2);
                    boolean zEquals = line.equals((String) objArr2[0]);
                    int i2 = access100 + 115;
                    IAuthTabCallback_Parcel = i2 % 128;
                    int i3 = i2 % 2;
                    return zEquals;
                } finally {
                    fileReader.close();
                    bufferedReader.close();
                }
            }
            int i4 = IAuthTabCallback_Parcel + 45;
            access100 = i4 % 128;
            return i4 % 2 == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean onExtraCallback() throws IOException {
        File file;
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            IAuthTabCallback(239 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0003\u0002ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\f\r�\u0005\f\u0007\u0001\uffff\u0010\u0012ￍ\u0005\f\u0007\u0001\uffff\u0010\u0012ￍ\u0005\u0013", (ViewConfiguration.getTapTimeout() >> 16) + 15, TextUtils.getTrimmedLength("") + 36, true, objArr);
            file = new File((String) objArr[0]);
        } catch (Exception unused) {
        }
        if (file.canRead()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                String line = bufferedReader.readLine();
                Object[] objArr2 = new Object[1];
                IAuthTabCallback((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 190, "\u0000", 1 - View.getDefaultSize(0, 0), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), true, objArr2);
                return line.equals((String) objArr2[0]);
            } finally {
                fileReader.close();
                bufferedReader.close();
            }
        }
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        return i2 % 2 != 0;
    }

    private static String onNavigationEvent() throws IOException {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            IAuthTabCallback(240 - TextUtils.getOffsetBefore("", 0), "\u000f\ufffe\u0000\u0006\u000b\u0004ￌ\u0000\u0012\u000f\u000f\u0002\u000b\u0011￼\u0011\u000f\ufffe\u0000\u0002\u000fￌ\u0010\u0016\u0010ￌ\b\u0002\u000f\u000b\u0002\tￌ\u0001\u0002\uffff\u0012\u0004ￌ\u0011", AndroidCharacter.getMirror('0') - 27, 41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, objArr);
            File file = new File((String) objArr[0]);
            if (!(!file.canRead())) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    String line = bufferedReader.readLine();
                    Object[] objArr2 = new Object[1];
                    onExtraCallback(new int[]{-1632868586, -1739692275}, KeyEvent.keyCodeFromString("") + 3, objArr2);
                    if (line.equals((String) objArr2[0])) {
                        fileReader.close();
                        bufferedReader.close();
                    } else {
                        int i2 = IAuthTabCallback_Parcel + 11;
                        access100 = i2 % 128;
                        if (i2 % 2 != 0) {
                            return line;
                        }
                        throw new NullPointerException();
                    }
                } finally {
                    fileReader.close();
                    bufferedReader.close();
                }
            } else {
                int i3 = IAuthTabCallback_Parcel + 11;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static int asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (Build.VERSION.SDK_INT > 33) {
                Object[] objArr = new Object[1];
                IAuthTabCallback(((Process.getThreadPriority(0) + 20) >> 6) + 235, "\u0003\u0004\u000e\u0007\uffd0\u0014\u0005\uffd1\u0007\u0016\u0005\uffd1\u000b\u0010\u000b\u0016\uffd1\u000e\u000e\r\u0006ￏ\u0006\u0007\u0004\u0017\t\t", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, Color.rgb(0, 0, 0) + 16777244, false, objArr);
                String str = (String) objArr[0];
                int i4 = 2 % 2;
                int i5 = onAudioFocusChange.onNavigationEvent;
                int i6 = (i5 ^ 41) + ((i5 & 41) << 1);
                onAudioFocusChange.onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                long j = onAudioFocusChange.read(str);
                long j2 = 290806082;
                long j3 = -574;
                long j4 = -1;
                long j5 = j2 ^ j4;
                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                long j6 = startUptimeMillis ^ j4;
                long j7 = ((j ^ j4) | startUptimeMillis) ^ j4;
                long j8 = (j3 * j2) + (j3 * j) + (1150 * (((j5 | j6) ^ j4) | j7)) + ((-575) * (j7 | ((j | j6) ^ j4))) + (575 * (((startUptimeMillis | j5) ^ j4) | ((j2 | j6) ^ j4))) + 271242822;
                int i8 = (int) (j8 >> 32);
                try {
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i9 = i8 & (992173881 + (((~((-598026131) | iElapsedRealtime)) | 2035252541) * 191) + (((~((~iElapsedRealtime) | (-598026131))) | 553985296) * 191));
                    int iMyPid = Process.myPid();
                    int i10 = ~iMyPid;
                    int i11 = i9 | (((int) j8) & ((-1871736089) + (((~(1742740515 | i10)) | (~((-305514106) | iMyPid))) * 1900) + (((~(i10 | 305514105)) | (~((-1742740516) | iMyPid))) * (-950)) + (((~(iMyPid | 305514105)) | (~(i10 | (-1742740516)))) * 950)));
                    int i12 = onAudioFocusChange.onNavigationEvent;
                    int i13 = (i12 & 109) + (i12 | 109);
                    onAudioFocusChange.onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = access100 + 51;
                    IAuthTabCallback_Parcel = i15 % 128;
                    int i16 = i15 % 2;
                    return i11;
                } catch (Exception unused) {
                    return 0;
                }
            }
            Object[] objArr2 = new Object[1];
            IAuthTabCallback(TextUtils.getCapsMode("", 0, 0) + 190, "\u0000", -((byte) KeyEvent.getModifierMetaStateMask()), 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, objArr2);
            String str2 = (String) objArr2[0];
            onExtraCallback(new int[]{-1073338682, -138034259, 212894113, 978481243, -717516414, -926467628, -72680493, -280177763}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, new Object[1]);
            if (!str2.equals(ResolvingDataSource.run((String) r6[0]))) {
                return 0;
            }
            int i17 = IAuthTabCallback_Parcel;
            int i18 = i17 + 97;
            access100 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i17 + 15;
            access100 = i20 % 128;
            int i21 = i20 % 2;
            return 1;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static Object[] onExtraCallbackWithResult(Context context, int i, int i2) {
        if (context != null) {
            try {
                Object[] objArr = new Object[1];
                IAuthTabCallback(226 - TextUtils.getOffsetBefore("", 0), "\u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r ", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, false, objArr);
                try {
                    Object[] objArr2 = {(String) objArr[0]};
                    Object[] objArr3 = new Object[1];
                    onExtraCallback("Ꭽ㘧墳挥薻ꡬ\uf2b2ᔥ㾬䈻撿輥톿\uf433ủ℩䮢渢낽\udb7aﶫg⫡䵠韱먆\udce8\ue76c৫Ⰺ皫餱ꎉ옅\ue88c㌔喂砎", View.MeasureSpec.getMode(0) + 9601, objArr3);
                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                    char c = '0';
                    Object[] objArr4 = new Object[1];
                    IAuthTabCallback((ViewConfiguration.getScrollDefaultDelay() >> 16) + 226, "\ufffeￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000", 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 32, false, objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        Object[] objArr6 = new Object[1];
                        onExtraCallback("Ꭽ㘧墳挥薻ꡬ\uf2b2ᔥ㾬䈻撿輥톿\uf433ủ℩䮢渢낽\udb7aﶫg⫡䵠韱먆\udce8\ue76c৫Ⰺ皫餱ꎉ옅\ue88c㌔喂砎", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9600, objArr6);
                        Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                        try {
                            Object[] objArr7 = new Object[1];
                            onExtraCallback("Ꭶ䣐ꕑǞ繌\udaf3㝵鎦졬ⓩ脓ﶀ娎뚌ጭ俾ꐔ¡紫\uda48㛖鍒쿕", (ViewConfiguration.getFadingEdgeLength() >> 16) + 23417, objArr7);
                            Class<?> cls = Class.forName((String) objArr7[0]);
                            Object[] objArr8 = new Object[1];
                            IAuthTabCallback(new int[]{201282039, -179539788, 1192147130, -1646412985, -2064758259, 44928037, 135138917, -594846300, 2140503898, -604835576}, TextUtils.indexOf("", "") + 17, objArr8);
                            Object objInvoke = cls.getMethod((String) objArr8[0], null).invoke(context, null);
                            try {
                                Object[] objArr9 = new Object[1];
                                onExtraCallback("Ꭶ䣐ꕑǞ繌\udaf3㝵鎦졬ⓩ脓ﶀ娎뚌ጭ俾ꐔ¡紫\uda48㛖鍒쿕", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23417, objArr9);
                                Class<?> cls2 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                IAuthTabCallback(new int[]{201282039, -179539788, 1192147130, -1646412985, 1808408039, 2003520127, -2081984825, -2098894944}, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, objArr10);
                                try {
                                    Object[] objArr11 = {cls2.getMethod((String) objArr10[0], null).invoke(context, null), 64};
                                    Object[] objArr12 = new Object[1];
                                    onExtraCallback("Ꭶｚ쩅핬ꁤ댑鸑楌琼䜣勗㷂ࣆ᯾\ue6f9\uf1d4\udc87꾉뫿薞酚籋低婳╨〙̤\uee07綠쐡ퟚꋏ跕", 60659 - View.resolveSize(0, 0), objArr12);
                                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                                    Object[] objArr13 = new Object[1];
                                    onExtraCallback("Ꭰዝᅍ\u17eaᙚᓟ᭖᧟ᡘổᵸϜɕÛ", 383 - ExpandableListView.getPackedPositionGroup(0L), objArr13);
                                    Object objInvoke2 = cls3.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                    Object[] objArr14 = new Object[1];
                                    onExtraCallback("Ꭶ㥒䙕鍄롄앉ቁ㼴䑼酻빧쭺ၦ㴖䨉靜밇줁ᙏ⌶䠺锳ꈾ켫ᐨ℡仰鯐ꃕ췇", View.MeasureSpec.getMode(0) + 11003, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    int i3 = 6;
                                    Object[] objArr15 = new Object[1];
                                    IAuthTabCallback(new int[]{1365948043, 1727258921, 1349878002, -910488095, -703180682, -795310207}, 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
                                    Object[] objArr16 = (Object[]) cls4.getField((String) objArr15[0]).get(objInvoke2);
                                    int length = objArr16.length;
                                    int i4 = 0;
                                    while (i4 < length) {
                                        Object obj = objArr16[i4];
                                        Object[] objArr17 = new Object[1];
                                        onExtraCallback(new int[]{-2085244315, -1466496814, 1602366927, -250313947}, TextUtils.lastIndexOf("", c, 0, 0) + i3, objArr17);
                                        try {
                                            Object[] objArr18 = {((String) objArr17[0]).intern()};
                                            Object[] objArr19 = new Object[1];
                                            IAuthTabCallback(new int[]{-2044850713, -274551704, -979032640, 1564115214, -1773495479, -1087144340, -1601955658, -1638719076, 2070714573, 1907838205, 2118424839, 22132966, -761180248, -2388901, -155327781, 1130956431, 212574362, 1824415535, -1627393042, -1857119140}, 37 - ((Process.getThreadPriority(0) + 20) >> i3), objArr19);
                                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                                            int[] iArr = new int[i3];
                                            // fill-array-data instruction
                                            iArr[0] = -1085425459;
                                            iArr[1] = 358076337;
                                            iArr[2] = 703292608;
                                            iArr[3] = 1929227640;
                                            iArr[4] = 1876330781;
                                            iArr[5] = 2007830435;
                                            Object[] objArr20 = new Object[1];
                                            IAuthTabCallback(iArr, KeyEvent.normalizeMetaState(0) + 11, objArr20);
                                            Object objInvoke3 = cls5.getMethod((String) objArr20[0], String.class).invoke(null, objArr18);
                                            try {
                                                Object[] objArr21 = new Object[1];
                                                onExtraCallback("Ꭶഠ⺱䠮榌謃꒕왖\ue7ecŹ⋳屐緎齜룍\ud9eeﬧᒳ㙋垿焚銝豯귩콫\ue8d3\u0a5f⯑", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7817, objArr21);
                                                Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                int[] iArr2 = new int[i3];
                                                // fill-array-data instruction
                                                iArr2[0] = -1664217023;
                                                iArr2[1] = -1159336334;
                                                iArr2[2] = -1872622293;
                                                iArr2[3] = -542171917;
                                                iArr2[4] = 630557208;
                                                iArr2[5] = -477116253;
                                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> i3) + 11;
                                                Object[] objArr22 = new Object[1];
                                                IAuthTabCallback(iArr2, threadPriority, objArr22);
                                                try {
                                                    Object[] objArr23 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr22[0], null).invoke(obj, null))};
                                                    Object[] objArr24 = new Object[1];
                                                    IAuthTabCallback(new int[]{-2044850713, -274551704, -979032640, 1564115214, -1773495479, -1087144340, -1601955658, -1638719076, 2070714573, 1907838205, 2118424839, 22132966, -761180248, -2388901, -155327781, 1130956431, 212574362, 1824415535, -1627393042, -1857119140}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, objArr24);
                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                    Object[] objArr25 = new Object[1];
                                                    IAuthTabCallback(new int[]{-486772774, 525515585, -873015705, 277653697, 2042857343, -263388281, -338247016, 1645121761, -1006617361, -1626861410}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, objArr25);
                                                    Object objInvoke4 = cls7.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke3, objArr23);
                                                    try {
                                                        Object[] objArr26 = new Object[1];
                                                        onExtraCallback("Ꭽ\ue3e5\uf337썯틥ꋻ눰艱醪懮焰䅒傚₎『Oច\ue7c0\uf75f읦훎Ꚉ똼薁闪放畽䒿哵\u2439㑾\u0bbbᯓ\ueb01", ((Process.getThreadPriority(0) + 20) >> 6) + 61507, objArr26);
                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                        Object[] objArr27 = new Object[1];
                                                        onExtraCallback("Ꭰ\u098d⟭崙笎酎躷ꓫ시\uf814ᙉ㏷⧃䞔紅魴녞꺶쓪\ue2d3\u181b㙽厡", 6703 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr27);
                                                        if (!objNewInstance.equals(cls8.getMethod((String) objArr27[0], null).invoke(objInvoke4, null))) {
                                                            try {
                                                                Object[] objArr28 = new Object[1];
                                                                onExtraCallback("Ꭽ\ue3e5\uf337썯틥ꋻ눰艱醪懮焰䅒傚₎『Oច\ue7c0\uf75f읦훎Ꚉ똼薁闪放畽䒿哵\u2439㑾\u0bbbᯓ\ueb01", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 61508, objArr28);
                                                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                Object[] objArr29 = new Object[1];
                                                                onExtraCallback("Ꭰ\u098d⟭崙笎酎躷ꓫ시\uf814ᙉ㏷⧃䞔紅魴녞꺶쓪\ue2d3\u181b㙽厡", 6703 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
                                                                if (!objNewInstance2.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke4, null))) {
                                                                    i4++;
                                                                    i3 = 6;
                                                                    c = '0';
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        Object[] objArr30 = {new int[]{i ^ (i << 5)}, null, new int[]{i}, new int[]{i ^ 1}};
                                                        int i5 = i2 + 651964235 + (((~((-770263734) | i)) | 738279441) * (-140)) + ((~((-31984293) | i)) * 70) + (((~(772928859 | i)) | (-66633711)) * 70) + 16;
                                                        int i6 = i5 ^ (i5 << 13);
                                                        int i7 = i6 ^ (i6 >>> 17);
                                                        return objArr30;
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        Object[] objArr31 = {new int[]{i ^ (i << 5)}, null, new int[]{i}, new int[]{i}};
        int i8 = i2 + 2145838566 + (((~((~i) | (-3145739))) | 480612) * (-591)) + ((i | (-3145739)) * 591);
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >>> 17);
        return objArr31;
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = -837138452;
        getInterfaceDescriptor = new int[]{-55853791, 1524909377, 1771721724, 1283290066, 1580830057, 403979745, -999808549, 242034962, 790351949, -410150433, -446310005, -1911967328, 1120149157, -1912533645, -1758866965, -226396600, 1223493237, 1763493694};
    }

    static void IAuthTabCallback() {
        access000 = -750967166205503234L;
        IAuthTabCallbackStubProxy = new int[]{438103068, -1229059580, 307435159, -796251796, 616083376, 1489238956, 1190685772, 335587572, 1376904066, 1005704058, 986432183, 1614841948, 269071729, -1879928323, 4141493, 1640303430, -51020184, 132476308};
    }
}
