package org.opencv.android;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.ListenerSetExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.opencv.core.Core;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class StaticHelper {
    private static short[] IAuthTabCallbackStub = null;
    private static final String TAG = "OpenCV/StaticHelper";
    private static final byte[] IAuthTabCallbackDefault = {115, 102, 60, 8, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
    private static final int asBinder = 151;
    private static char[] onWarmupCompleted = {64983, 65023, 64998, 64925, 65013, 64967, 64980, 64987, 64966, 65009, 64988, 65018, 65065, 64977, 64991, 64924, 64989, 64995, 64982, 64970, 64907, 64985, 64965, 64986, 64976, 64961, 64926, 64993, 64999, 64963, 65064, 64990, 64992, 64978, 64960, 65010};
    private static char onExtraCallback = 51247;
    private static int IAuthTabCallback = 713137860;
    private static int onExtraCallbackWithResult = -1538795474;
    private static int onNavigationEvent = -1185223747;
    private static byte[] asInterface = {-22, -7, 3, -1, 19, -31, 5, -10, -20, -16, 12, -3, 14, -15, 43, -42, 7, -10, -19, 15, 25, -25, 24, -15, 21, -32, 11, -6, 11, -19, 31, -33, 27, 9, -2, 45, -35, 9, 26, -3, -21, -35, -15, 11, 11, 36, -64, 25, -1, -23, -4, 27, 25, -44, 7, -10, -22, 15, -10, 14, 33, -39, 7, -10, -24, 11, -6, 43, -43, 3};

    private static native String getLibraryList();

    StaticHelper() {
    }

    public static boolean initOpenCV(boolean z) {
        if (!loadLibrary("opencv_java4")) {
            return false;
        }
        for (String str : Core.getBuildInformation().split(System.getProperty("line.separator"))) {
        }
        return true;
    }

    private static boolean loadLibrary(String str) throws Exception {
        try {
            onWarmupCompleted(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) {
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int i4 = i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = asInterface;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-4629411779493505016L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (asInterface[((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
            } else {
                i4 = (short) (((short) (IAuthTabCallbackStub[((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
            }
        }
        if (i4 > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + i4) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i5;
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (i3 + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = asInterface;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < i4) {
                if (z) {
                    byte[] bArr5 = asInterface;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r9] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = IAuthTabCallbackStub;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r9] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        int i2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ (-8609172136126592983L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-8609172136126592983L) ^ onExtraCallback);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda0.onExtraCallback / c;
                    defaultGainProviderExternalSyntheticLambda0.onTransact = defaultGainProviderExternalSyntheticLambda0.onExtraCallback % c;
                    defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / c;
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % c;
                    if (defaultGainProviderExternalSyntheticLambda0.onTransact == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult = ((defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult + c) - 1) % c;
                        defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted = ((defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted + c) - 1) % c;
                        int i4 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i5 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i4];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i5];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + c) - 1) % c;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + c) - 1) % c;
                        int i6 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i6];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                    } else {
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(21:851|376|843|377|378|837|379|380|835|381|382|383|384|829|385|386|823|387|388|928|692)(1:415)|803|429|430|766|431|c34|443|929|692) */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0c9b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0c9c, code lost:
    
        r6 = 0;
        r14 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0bc7 A[Catch: Exception -> 0x0be5, NoSuchMethodException -> 0x0bf6, TryCatch #117 {NoSuchMethodException -> 0x0bf6, Exception -> 0x0be5, blocks: (B:399:0x0bc1, B:401:0x0bc7, B:402:0x0bc8, B:404:0x0bca, B:406:0x0bd5, B:407:0x0bd6, B:409:0x0bd8, B:411:0x0be3, B:412:0x0be4, B:377:0x0b13, B:376:0x0b08), top: B:843:0x0b13, inners: #76, #82 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0bc8 A[Catch: Exception -> 0x0be5, NoSuchMethodException -> 0x0bf6, TryCatch #117 {NoSuchMethodException -> 0x0bf6, Exception -> 0x0be5, blocks: (B:399:0x0bc1, B:401:0x0bc7, B:402:0x0bc8, B:404:0x0bca, B:406:0x0bd5, B:407:0x0bd6, B:409:0x0bd8, B:411:0x0be3, B:412:0x0be4, B:377:0x0b13, B:376:0x0b08), top: B:843:0x0b13, inners: #76, #82 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0c95 A[Catch: all -> 0x0c97, TryCatch #53 {, blocks: (B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96), top: B:800:0x0c7a, outer: #81 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0c96 A[Catch: all -> 0x0c97, TRY_LEAVE, TryCatch #53 {, blocks: (B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96), top: B:800:0x0c7a, outer: #81 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0cb3 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0cb4 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0cf8 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0cf9 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0d18 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0d19 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0d35 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0d36 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0d69 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0d6a A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d89 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0d8a A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0da5 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0da6 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0dcb A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0dcc A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0de8 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0de9 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0e05 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0e06 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0e25 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0e26 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0e44 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0e45 A[Catch: Exception -> 0x0e7a, TryCatch #81 {Exception -> 0x0e7a, blocks: (B:491:0x0cd9, B:493:0x0cdf, B:494:0x0ce0, B:461:0x0c99, B:462:0x0c9a, B:474:0x0cac, B:476:0x0cb3, B:477:0x0cb4, B:479:0x0cb6, B:481:0x0cbf, B:482:0x0cc0, B:485:0x0cc9, B:487:0x0ccf, B:488:0x0cd0, B:502:0x0cef, B:504:0x0cf8, B:505:0x0cf9, B:518:0x0d0f, B:520:0x0d18, B:521:0x0d19, B:532:0x0d2c, B:534:0x0d35, B:535:0x0d36, B:543:0x0d45, B:545:0x0d4e, B:546:0x0d4f, B:557:0x0d60, B:559:0x0d69, B:560:0x0d6a, B:573:0x0d80, B:575:0x0d89, B:576:0x0d8a, B:586:0x0d9c, B:588:0x0da5, B:589:0x0da6, B:605:0x0dc4, B:607:0x0dcb, B:608:0x0dcc, B:618:0x0ddf, B:620:0x0de8, B:621:0x0de9, B:632:0x0dfc, B:634:0x0e05, B:635:0x0e06, B:649:0x0e1c, B:651:0x0e25, B:652:0x0e26, B:663:0x0e3b, B:665:0x0e44, B:666:0x0e45, B:674:0x0e5d, B:676:0x0e66, B:677:0x0e67, B:679:0x0e69, B:681:0x0e78, B:682:0x0e79, B:13:0x00ea, B:442:0x0c7a, B:444:0x0c7d, B:445:0x0c82, B:455:0x0c8e, B:457:0x0c95, B:458:0x0c96, B:419:0x0bf6), top: B:753:0x00ea, inners: #29, #53, #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0c35 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0240 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:877:0x09a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:926:0x0e9d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:930:0x0e91 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v117 */
    /* JADX WARN: Type inference failed for: r14v14, types: [int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [char[]] */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v115 */
    /* JADX WARN: Type inference failed for: r6v116 */
    /* JADX WARN: Type inference failed for: r6v117 */
    /* JADX WARN: Type inference failed for: r6v119 */
    /* JADX WARN: Type inference failed for: r6v128 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r6v133 */
    /* JADX WARN: Type inference failed for: r6v134 */
    /* JADX WARN: Type inference failed for: r6v141, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v151 */
    /* JADX WARN: Type inference failed for: r6v189 */
    /* JADX WARN: Type inference failed for: r6v192 */
    /* JADX WARN: Type inference failed for: r6v193 */
    /* JADX WARN: Type inference failed for: r6v194 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Class[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onWarmupCompleted(String str) throws Exception {
        ?? r15;
        ?? jumpTapTimeout;
        String[] strArr;
        ?? declaredConstructor;
        Exception exc;
        int i;
        int i2;
        Object objNewInstance;
        Object[] objArr;
        int i3;
        Throwable cause;
        String str2;
        int i4;
        Throwable cause2;
        Throwable cause3;
        Throwable cause4;
        Throwable cause5;
        Throwable cause6;
        Throwable cause7;
        Throwable cause8;
        Throwable cause9;
        Object[] objArr2;
        Object[] objArr3;
        Throwable cause10;
        Object objInvoke;
        Class cls;
        Throwable cause11;
        Throwable th;
        Throwable th2;
        Object objInvoke2;
        Throwable cause12;
        Throwable cause13;
        Throwable cause14;
        Object objInvoke3;
        String str3 = str;
        int i5 = 0;
        long j = 0;
        int i6 = 1;
        Object[] objArr4 = new Object[1];
        a(new char[]{' ', '\n', 16, 31, 1, 29, 22, 17, 13826}, (byte) (4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        String str4 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        b((byte) Color.blue(0), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), 1899608379 + (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-40) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), (-488452942) + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        String str5 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        a(new char[]{4, 26, 2, 28, 13801}, (byte) (70 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, objArr6);
        try {
            Object[] objArr7 = {(String) objArr6[0]};
            Object[] objArr8 = new Object[1];
            a(new char[]{'\f', 24, 3, 11, 23, 1, 22, 30}, (byte) (108 - Color.argb(0, 0, 0, 0)), 8 - View.MeasureSpec.getMode(0), objArr8);
            String[] strArrOnExtraCallback = ListenerSetExternalSyntheticLambda1.onExtraCallback(ListenerSetExternalSyntheticLambda1.IAuthTabCallback((byte[]) String.class.getMethod((String) objArr8[0], String.class).invoke(str3, objArr7)));
            if (strArrOnExtraCallback == null) {
                strArrOnExtraCallback = new String[0];
            }
            int length = strArrOnExtraCallback.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArrOnExtraCallback, 0, strArr2, 0, length);
            strArr2[length] = str3;
            int i7 = 0;
            while (i7 <= length) {
                String str6 = strArr2[i7];
                try {
                    r15 = new char[]{'\f', 3, '#', 3, 3, 21, 3, 30, 3, '#', 16, 21, 18, 23, 3, '\t', 24, 19, 26, 11, 14, 15, 18, 29, 3, '\t', 4, 11, 13923, 13923};
                    byte packedPositionChild = (byte) (121 - ExpandableListView.getPackedPositionChild(j));
                    jumpTapTimeout = 30 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    try {
                        declaredConstructor = new Object[i6];
                        a(r15, packedPositionChild, jumpTapTimeout, declaredConstructor);
                        try {
                            try {
                                Object[] objArr9 = {(String) declaredConstructor[i5]};
                                ?? r7 = new Class[i6];
                                jumpTapTimeout = String.class;
                                r7[i5] = jumpTapTimeout;
                                declaredConstructor = File.class.getDeclaredConstructor(r7);
                                objNewInstance = declaredConstructor.newInstance(objArr9);
                                try {
                                    try {
                                        objArr = new Object[1];
                                        b((byte) (KeyEvent.getMaxKeyCode() >> 16), (short) ((-1) - ImageFormat.getBitsPerPixel(i5)), 1899608372 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, i5, i5), (-39) - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, i5), (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) - 488452945, objArr);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable th4 = th;
                                        Throwable cause15 = th4.getCause();
                                        if (cause15 == null) {
                                            throw th4;
                                        }
                                        throw cause15;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                Throwable cause16 = th6.getCause();
                                if (cause16 == null) {
                                    throw th6;
                                }
                                throw cause16;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        declaredConstructor = i5;
                        jumpTapTimeout = i6;
                        strArr = strArr2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    r15 = j;
                    jumpTapTimeout = i6;
                    strArr = strArr2;
                    declaredConstructor = i5;
                }
                if (((Boolean) File.class.getMethod((String) objArr[i5], null).invoke(objNewInstance, null)).booleanValue()) {
                    ClassLoader classLoader = StaticHelper.class.getClassLoader();
                    Object[] objArr10 = {i7 < length ? str3 : str6};
                    byte b = (byte) (IAuthTabCallbackDefault[4] + 1);
                    byte b2 = b;
                    strArr = strArr2;
                    Object[] objArr11 = new Object[1];
                    c(b, b2, b2, objArr11);
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr11[0], String.class);
                    declaredMethod.setAccessible(true);
                    str2 = (String) declaredMethod.invoke(classLoader, objArr10);
                    if (str2 != null) {
                    }
                    exc = e;
                    i4 = 0;
                    i = 1;
                    r15 = 0;
                    i2 = i4;
                    if (i7 >= length) {
                    }
                } else {
                    try {
                        Object[] objArr12 = new Object[1];
                        a(new char[]{27, 3, 21, '\"', 5, 21, '\t', 4, 1, '#', 24, 5, 19, 29}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 92), 14 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), objArr12);
                        String str7 = (String) objArr12[i5];
                        try {
                            Object[] objArr13 = {System.getProperty(str7, str7)};
                            Class[] clsArr = new Class[1];
                            clsArr[i5] = String.class;
                            objNewInstance = File.class.getDeclaredConstructor(clsArr).newInstance(objArr13);
                            try {
                                Object[] objArr14 = new Object[1];
                                b((byte) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (short) Color.blue(i5), 1899608372 - ((Process.getThreadPriority(i5) + 20) >> 6), (-39) - (ViewConfiguration.getJumpTapTimeout() >> 16), (-488452946) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr14);
                                if (!((Boolean) File.class.getMethod((String) objArr14[i5], null).invoke(objNewInstance, null)).booleanValue()) {
                                    objNewInstance = Environment.getExternalStorageDirectory();
                                }
                                try {
                                    ClassLoader classLoader2 = StaticHelper.class.getClassLoader();
                                    try {
                                        Object[] objArr102 = {i7 < length ? str3 : str6};
                                        byte b3 = (byte) (IAuthTabCallbackDefault[4] + 1);
                                        byte b22 = b3;
                                        strArr = strArr2;
                                        try {
                                            Object[] objArr112 = new Object[1];
                                            c(b3, b22, b22, objArr112);
                                            try {
                                                Method declaredMethod2 = ClassLoader.class.getDeclaredMethod((String) objArr112[0], String.class);
                                                declaredMethod2.setAccessible(true);
                                                try {
                                                    str2 = (String) declaredMethod2.invoke(classLoader2, objArr102);
                                                    if (str2 != null) {
                                                        try {
                                                            Object objInvoke4 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                            if (i7 >= length) {
                                                                str6 = str;
                                                            }
                                                            try {
                                                                Object[] objArr15 = new Object[1];
                                                                b((byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (short) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 1899608391, (-39) - Color.argb(0, 0, 0, 0), (-488452937) - (ViewConfiguration.getScrollBarSize() >> 8), objArr15);
                                                                Runtime.class.getMethod((String) objArr15[0], String.class).invoke(objInvoke4, str6);
                                                                return;
                                                            } catch (Throwable th7) {
                                                                Throwable cause17 = th7.getCause();
                                                                if (cause17 == null) {
                                                                    throw th7;
                                                                }
                                                                throw cause17;
                                                            }
                                                        } catch (Throwable th8) {
                                                            Throwable cause18 = th8.getCause();
                                                            if (cause18 == null) {
                                                                throw th8;
                                                            }
                                                            throw cause18;
                                                        }
                                                    }
                                                    try {
                                                        Object[] objArr16 = new Object[1];
                                                        try {
                                                            try {
                                                                objArr16[0] = 47;
                                                                try {
                                                                    Object[] objArr17 = new Object[1];
                                                                    b((byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), 1899608401 - (ViewConfiguration.getPressedStateDuration() >> 16), (-39) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-488452937) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr17);
                                                                    String str8 = (String) objArr17[0];
                                                                    try {
                                                                        Class[] clsArr2 = new Class[1];
                                                                        clsArr2[0] = Integer.TYPE;
                                                                        try {
                                                                            Object[] objArr18 = new Object[1];
                                                                            try {
                                                                                objArr18[0] = Integer.valueOf(((Integer) String.class.getMethod(str8, clsArr2).invoke(str2, objArr16)).intValue() + 1);
                                                                                Class[] clsArr3 = new Class[1];
                                                                                try {
                                                                                    clsArr3[0] = Integer.TYPE;
                                                                                    try {
                                                                                        try {
                                                                                            Object[] objArr19 = {objNewInstance, String.class.getMethod(str4, clsArr3).invoke(str2, objArr18)};
                                                                                            Class[] clsArr4 = new Class[2];
                                                                                            try {
                                                                                                clsArr4[0] = File.class;
                                                                                                try {
                                                                                                    clsArr4[1] = String.class;
                                                                                                    File file = (File) File.class.getDeclaredConstructor(clsArr4).newInstance(objArr19);
                                                                                                    try {
                                                                                                        ClassLoader classLoader3 = StaticHelper.class.getClassLoader();
                                                                                                        try {
                                                                                                            Object[] objArr20 = {str2};
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        Object[] objArr21 = new Object[1];
                                                                                                                        a(new char[]{'\f', 24, 3, 29, 22, 30, 11, '\t', 26, 25, 13905}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 82), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 11, objArr21);
                                                                                                                        try {
                                                                                                                            String str9 = (String) objArr21[0];
                                                                                                                            Class[] clsArr5 = new Class[1];
                                                                                                                            try {
                                                                                                                                clsArr5[0] = String.class;
                                                                                                                                Object objInvoke5 = ClassLoader.class.getMethod(str9, clsArr5).invoke(classLoader3, objArr20);
                                                                                                                                if (objInvoke5 == null) {
                                                                                                                                    try {
                                                                                                                                        Object[] objArr22 = new Object[1];
                                                                                                                                        a(new char[]{28, 6, 17, 4, '#', 21, 22, 4}, (byte) (77 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr22);
                                                                                                                                        if (((Boolean) String.class.getMethod((String) objArr22[0], CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                                                                                                            try {
                                                                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                                                                Object[] objArr23 = new Object[1];
                                                                                                                                                b((byte) Color.blue(0), (short) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 1899608413, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) - 38, (-488452939) - View.resolveSizeAndState(0, 0, 0), objArr23);
                                                                                                                                                sb.append((String) objArr23[0]);
                                                                                                                                                sb.append(str2);
                                                                                                                                                try {
                                                                                                                                                    Object objNewInstance2 = URL.class.getDeclaredConstructor(String.class).newInstance(sb.toString());
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr24 = new Object[1];
                                                                                                                                                        b((byte) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (short) ('0' - AndroidCharacter.getMirror('0')), 1899608421 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') - 'W', (-488452942) - (ViewConfiguration.getTapTimeout() >> 16), objArr24);
                                                                                                                                                        Object objInvoke6 = URL.class.getMethod((String) objArr24[0], null).invoke(objNewInstance2, null);
                                                                                                                                                        try {
                                                                                                                                                            Object[] objArr25 = new Object[1];
                                                                                                                                                            b((byte) Color.green(0), (short) (ViewConfiguration.getScrollBarSize() >> 8), View.getDefaultSize(0, 0) + 1899608401, (ViewConfiguration.getEdgeSlop() >> 16) - 39, (-488452937) - (Process.myPid() >> 22), objArr25);
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    Object objNewInstance3 = ZipFile.class.getDeclaredConstructor(String.class).newInstance(String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(objInvoke6, 5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr25[0], String.class).invoke(objInvoke6, "!/")).intValue())));
                                                                                                                                                                    try {
                                                                                                                                                                        Object[] objArr26 = new Object[1];
                                                                                                                                                                        b((byte) Drawable.resolveOpacity(0, 0), (short) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1899608401, Color.blue(0) - 39, ExpandableListView.getPackedPositionChild(0L) - 488452936, objArr26);
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    Object[] objArr27 = {String.class.getMethod(str4, Integer.TYPE).invoke(String.class.getMethod(str4, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod((String) objArr26[0], String.class).invoke(str2, "!/")).intValue())), 2)};
                                                                                                                                                                                    Object[] objArr28 = new Object[1];
                                                                                                                                                                                    b((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (short) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1899608427, (-39) - Drawable.resolveOpacity(0, 0), (-488452942) - ExpandableListView.getPackedPositionGroup(0L), objArr28);
                                                                                                                                                                                    try {
                                                                                                                                                                                        Object[] objArr29 = {ZipFile.class.getMethod((String) objArr28[0], String.class).invoke(objNewInstance3, objArr27)};
                                                                                                                                                                                        r15 = 1;
                                                                                                                                                                                        Object[] objArr30 = new Object[1];
                                                                                                                                                                                        a(new char[]{'\f', 24, 11, 17, 17, 28, 11, 2, '#', 2, 24, 19, '\"', ' '}, (byte) (Color.alpha(0) + 61), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr30);
                                                                                                                                                                                        objInvoke = ZipFile.class.getMethod((String) objArr30[0], ZipEntry.class).invoke(objNewInstance3, objArr29);
                                                                                                                                                                                        cls = ZipEntry.class;
                                                                                                                                                                                    } catch (Throwable th9) {
                                                                                                                                                                                        Throwable cause19 = th9.getCause();
                                                                                                                                                                                        if (cause19 == null) {
                                                                                                                                                                                            throw th9;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause19;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th10) {
                                                                                                                                                                                    Throwable cause20 = th10.getCause();
                                                                                                                                                                                    if (cause20 == null) {
                                                                                                                                                                                        throw th10;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw cause20;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th11) {
                                                                                                                                                                                Throwable cause21 = th11.getCause();
                                                                                                                                                                                if (cause21 == null) {
                                                                                                                                                                                    throw th11;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause21;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th12) {
                                                                                                                                                                            Throwable cause22 = th12.getCause();
                                                                                                                                                                            if (cause22 == null) {
                                                                                                                                                                                throw th12;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause22;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th13) {
                                                                                                                                                                        Throwable cause23 = th13.getCause();
                                                                                                                                                                        if (cause23 == null) {
                                                                                                                                                                            throw th13;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause23;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th14) {
                                                                                                                                                                    Throwable cause24 = th14.getCause();
                                                                                                                                                                    if (cause24 == null) {
                                                                                                                                                                        throw th14;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause24;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th15) {
                                                                                                                                                                Throwable cause25 = th15.getCause();
                                                                                                                                                                if (cause25 == null) {
                                                                                                                                                                    throw th15;
                                                                                                                                                                }
                                                                                                                                                                throw cause25;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th16) {
                                                                                                                                                            Throwable cause26 = th16.getCause();
                                                                                                                                                            if (cause26 == null) {
                                                                                                                                                                throw th16;
                                                                                                                                                            }
                                                                                                                                                            throw cause26;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th17) {
                                                                                                                                                        Throwable cause27 = th17.getCause();
                                                                                                                                                        if (cause27 == null) {
                                                                                                                                                            throw th17;
                                                                                                                                                        }
                                                                                                                                                        throw cause27;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th18) {
                                                                                                                                                    Throwable cause28 = th18.getCause();
                                                                                                                                                    if (cause28 == null) {
                                                                                                                                                        throw th18;
                                                                                                                                                    }
                                                                                                                                                    throw cause28;
                                                                                                                                                }
                                                                                                                                            } catch (Exception e3) {
                                                                                                                                                exc = e3;
                                                                                                                                                i4 = 0;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            try {
                                                                                                                                                objInvoke = FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                                                                                                                cls = CharSequence.class;
                                                                                                                                                r15 = objArr22;
                                                                                                                                            } catch (Throwable th19) {
                                                                                                                                                Throwable cause29 = th19.getCause();
                                                                                                                                                if (cause29 == null) {
                                                                                                                                                    throw th19;
                                                                                                                                                }
                                                                                                                                                throw cause29;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th20) {
                                                                                                                                        Throwable cause30 = th20.getCause();
                                                                                                                                        if (cause30 == null) {
                                                                                                                                            throw th20;
                                                                                                                                        }
                                                                                                                                        throw cause30;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr31 = new Object[1];
                                                                                                                                                    b((byte) KeyEvent.normalizeMetaState(0), (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1899608421 - (ViewConfiguration.getJumpTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 39, Color.green(0) - 488452942, objArr31);
                                                                                                                                                    Object objInvoke7 = URL.class.getMethod((String) objArr31[0], null).invoke(objInvoke5, null);
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr32 = {"!/".concat(String.valueOf(str2))};
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                Object[] objArr33 = new Object[1];
                                                                                                                                                                b((byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) View.resolveSize(0, 0), 1899608401 - View.resolveSizeAndState(0, 0, 0), (-39) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.normalizeMetaState(0) - 488452937, objArr33);
                                                                                                                                                                try {
                                                                                                                                                                    String str10 = (String) objArr33[0];
                                                                                                                                                                    try {
                                                                                                                                                                        Class[] clsArr6 = new Class[1];
                                                                                                                                                                        clsArr6[0] = String.class;
                                                                                                                                                                        try {
                                                                                                                                                                            Object[] objArr34 = new Object[2];
                                                                                                                                                                            try {
                                                                                                                                                                                objArr34[1] = Integer.valueOf(((Integer) String.class.getMethod(str10, clsArr6).invoke(objInvoke7, objArr32)).intValue());
                                                                                                                                                                                try {
                                                                                                                                                                                    objArr34[0] = 5;
                                                                                                                                                                                    Class[] clsArr7 = new Class[2];
                                                                                                                                                                                    clsArr7[0] = Integer.TYPE;
                                                                                                                                                                                    try {
                                                                                                                                                                                        clsArr7[1] = Integer.TYPE;
                                                                                                                                                                                        try {
                                                                                                                                                                                            Object[] objArr35 = {String.class.getMethod(str4, clsArr7).invoke(objInvoke7, objArr34)};
                                                                                                                                                                                            Class[] clsArr8 = new Class[1];
                                                                                                                                                                                            try {
                                                                                                                                                                                                clsArr8[0] = String.class;
                                                                                                                                                                                            } catch (Throwable th21) {
                                                                                                                                                                                                th = th21;
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                Object objNewInstance4 = ZipFile.class.getDeclaredConstructor(clsArr8).newInstance(objArr35);
                                                                                                                                                                                                try {
                                                                                                                                                                                                    objArr2 = new Object[]{str2};
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        objArr3 = new Object[1];
                                                                                                                                                                                                        b((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1899608428, (-39) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-488452942) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
                                                                                                                                                                                                    } catch (Throwable th22) {
                                                                                                                                                                                                        th = th22;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th23) {
                                                                                                                                                                                                    th = th23;
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    String str11 = (String) objArr3[0];
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        Class[] clsArr9 = new Class[1];
                                                                                                                                                                                                        clsArr9[0] = String.class;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            Object[] objArr36 = {ZipFile.class.getMethod(str11, clsArr9).invoke(objNewInstance4, objArr2)};
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                r15 = 1;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    Object[] objArr37 = new Object[1];
                                                                                                                                                                                                                    a(new char[]{'\f', 24, 11, 17, 17, 28, 11, 2, '#', 2, 24, 19, '\"', ' '}, (byte) (62 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 15, objArr37);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        String str12 = (String) objArr37[0];
                                                                                                                                                                                                                        Class[] clsArr10 = new Class[1];
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            clsArr10[0] = ZipEntry.class;
                                                                                                                                                                                                                            objInvoke = ZipFile.class.getMethod(str12, clsArr10).invoke(objNewInstance4, objArr36);
                                                                                                                                                                                                                            cls = ZipEntry.class;
                                                                                                                                                                                                                        } catch (Throwable th24) {
                                                                                                                                                                                                                            th = th24;
                                                                                                                                                                                                                            Throwable th25 = th;
                                                                                                                                                                                                                            cause10 = th25.getCause();
                                                                                                                                                                                                                            if (cause10 != null) {
                                                                                                                                                                                                                                throw th25;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw cause10;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (Throwable th26) {
                                                                                                                                                                                                                        th = th26;
                                                                                                                                                                                                                        Throwable th252 = th;
                                                                                                                                                                                                                        cause10 = th252.getCause();
                                                                                                                                                                                                                        if (cause10 != null) {
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } catch (Throwable th27) {
                                                                                                                                                                                                                    th = th27;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th28) {
                                                                                                                                                                                                                th = th28;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th29) {
                                                                                                                                                                                                            th = th29;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th30) {
                                                                                                                                                                                                        th = th30;
                                                                                                                                                                                                        Throwable th31 = th;
                                                                                                                                                                                                        cause9 = th31.getCause();
                                                                                                                                                                                                        if (cause9 != null) {
                                                                                                                                                                                                            throw th31;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw cause9;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th32) {
                                                                                                                                                                                                    th = th32;
                                                                                                                                                                                                    Throwable th312 = th;
                                                                                                                                                                                                    cause9 = th312.getCause();
                                                                                                                                                                                                    if (cause9 != null) {
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th33) {
                                                                                                                                                                                                th = th33;
                                                                                                                                                                                                Throwable th34 = th;
                                                                                                                                                                                                Throwable cause31 = th34.getCause();
                                                                                                                                                                                                if (cause31 == null) {
                                                                                                                                                                                                    throw th34;
                                                                                                                                                                                                }
                                                                                                                                                                                                throw cause31;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th35) {
                                                                                                                                                                                            th = th35;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th36) {
                                                                                                                                                                                        th = th36;
                                                                                                                                                                                        Throwable th37 = th;
                                                                                                                                                                                        cause8 = th37.getCause();
                                                                                                                                                                                        if (cause8 != null) {
                                                                                                                                                                                            throw th37;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause8;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th38) {
                                                                                                                                                                                    th = th38;
                                                                                                                                                                                    Throwable th372 = th;
                                                                                                                                                                                    cause8 = th372.getCause();
                                                                                                                                                                                    if (cause8 != null) {
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th39) {
                                                                                                                                                                                th = th39;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th40) {
                                                                                                                                                                            th = th40;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th41) {
                                                                                                                                                                        th = th41;
                                                                                                                                                                        Throwable th42 = th;
                                                                                                                                                                        cause7 = th42.getCause();
                                                                                                                                                                        if (cause7 != null) {
                                                                                                                                                                            throw th42;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause7;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th43) {
                                                                                                                                                                    th = th43;
                                                                                                                                                                    Throwable th422 = th;
                                                                                                                                                                    cause7 = th422.getCause();
                                                                                                                                                                    if (cause7 != null) {
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th44) {
                                                                                                                                                                th = th44;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th45) {
                                                                                                                                                            th = th45;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th46) {
                                                                                                                                                        th = th46;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th47) {
                                                                                                                                                    th = th47;
                                                                                                                                                    Throwable th48 = th;
                                                                                                                                                    cause6 = th48.getCause();
                                                                                                                                                    if (cause6 != null) {
                                                                                                                                                        throw th48;
                                                                                                                                                    }
                                                                                                                                                    throw cause6;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th49) {
                                                                                                                                                th = th49;
                                                                                                                                                Throwable th482 = th;
                                                                                                                                                cause6 = th482.getCause();
                                                                                                                                                if (cause6 != null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th50) {
                                                                                                                                            th = th50;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th51) {
                                                                                                                                        th = th51;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    Object[] objArr38 = {objInvoke};
                                                                                                                                    try {
                                                                                                                                        Class[] clsArr11 = new Class[1];
                                                                                                                                        try {
                                                                                                                                            clsArr11[0] = InputStream.class;
                                                                                                                                            InputStream inputStream = (InputStream) BufferedInputStream.class.getDeclaredConstructor(clsArr11).newInstance(objArr38);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr39 = {inputStream};
                                                                                                                                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(500370472);
                                                                                                                                                jumpTapTimeout = cls;
                                                                                                                                                if (objOnExtraCallback == null) {
                                                                                                                                                    try {
                                                                                                                                                        jumpTapTimeout = 0;
                                                                                                                                                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 6782), Color.argb(0, 0, 0, 0) + 59, 54 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 747893432, false, "onNavigationEvent", new Class[]{InputStream.class});
                                                                                                                                                    } catch (Throwable th52) {
                                                                                                                                                        th = th52;
                                                                                                                                                        Throwable cause32 = th.getCause();
                                                                                                                                                        if (cause32 == null) {
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                        throw cause32;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                InputStream inputStream2 = (InputStream) ((Method) objOnExtraCallback).invoke(null, objArr39);
                                                                                                                                                if (inputStream == inputStream2) {
                                                                                                                                                    inputStream2.close();
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                Object objInvoke8 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                try {
                                                                                                                                                                    Object[] objArr40 = {str2, StaticHelper.class.getClassLoader()};
                                                                                                                                                                    Object[] objArr41 = new Object[1];
                                                                                                                                                                    a(new char[]{16, '\b', 30, 3}, (byte) (115 - View.resolveSizeAndState(0, 0, 0)), View.getDefaultSize(0, 0) + 4, objArr41);
                                                                                                                                                                    Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr41[0], String.class, ClassLoader.class);
                                                                                                                                                                    declaredMethod3.setAccessible(true);
                                                                                                                                                                    declaredMethod3.invoke(objInvoke8, objArr40);
                                                                                                                                                                } catch (Throwable th53) {
                                                                                                                                                                    Throwable cause33 = th53.getCause();
                                                                                                                                                                    if (cause33 == null) {
                                                                                                                                                                        throw th53;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause33;
                                                                                                                                                                }
                                                                                                                                                            } catch (NoSuchMethodException unused) {
                                                                                                                                                                try {
                                                                                                                                                                    objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                    ClassLoader classLoader4 = StaticHelper.class.getClassLoader();
                                                                                                                                                                    synchronized (objInvoke3) {
                                                                                                                                                                        try {
                                                                                                                                                                            Object[] objArr42 = {str2, classLoader4};
                                                                                                                                                                            Object[] objArr43 = new Object[1];
                                                                                                                                                                            a(new char[]{15, '\"', 11, 29, 23, 19, 4, 7, 30, 3}, (byte) (View.resolveSize(0, 0) + 81), 10 - ExpandableListView.getPackedPositionType(0L), objArr43);
                                                                                                                                                                            Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr43[0], String.class, ClassLoader.class);
                                                                                                                                                                            declaredMethod4.setAccessible(true);
                                                                                                                                                                            String str13 = (String) declaredMethod4.invoke(objInvoke3, objArr42);
                                                                                                                                                                            if (str13 != null) {
                                                                                                                                                                                throw new UnsatisfiedLinkError(str13);
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th54) {
                                                                                                                                                                            Throwable cause34 = th54.getCause();
                                                                                                                                                                            if (cause34 == null) {
                                                                                                                                                                                throw th54;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause34;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    i2 = 0;
                                                                                                                                                                    i = 1;
                                                                                                                                                                    r15 = 0;
                                                                                                                                                                    i7++;
                                                                                                                                                                    str3 = str;
                                                                                                                                                                    i5 = i2;
                                                                                                                                                                    i6 = i;
                                                                                                                                                                    j = r15;
                                                                                                                                                                    strArr2 = strArr;
                                                                                                                                                                } catch (Throwable th55) {
                                                                                                                                                                    Throwable cause35 = th55.getCause();
                                                                                                                                                                    if (cause35 == null) {
                                                                                                                                                                        throw th55;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause35;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Exception unused2) {
                                                                                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                                                                                try {
                                                                                                                                                                    Object objInvoke9 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                    try {
                                                                                                                                                                        Object[] objArr44 = {str2, StaticHelper.class.getClassLoader()};
                                                                                                                                                                        Object[] objArr45 = new Object[1];
                                                                                                                                                                        b((byte) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (short) View.combineMeasuredStates(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1899608436, (-39) - (Process.myTid() >> 22), (-488452946) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), objArr45);
                                                                                                                                                                        Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr45[0], String.class, ClassLoader.class);
                                                                                                                                                                        declaredMethod5.setAccessible(true);
                                                                                                                                                                        declaredMethod5.invoke(objInvoke9, objArr44);
                                                                                                                                                                    } catch (Throwable th56) {
                                                                                                                                                                        Throwable cause36 = th56.getCause();
                                                                                                                                                                        if (cause36 == null) {
                                                                                                                                                                            throw th56;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause36;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th57) {
                                                                                                                                                                    Throwable cause37 = th57.getCause();
                                                                                                                                                                    if (cause37 == null) {
                                                                                                                                                                        throw th57;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause37;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                ClassLoader classLoader42 = StaticHelper.class.getClassLoader();
                                                                                                                                                                synchronized (objInvoke3) {
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th58) {
                                                                                                                                                        Throwable cause38 = th58.getCause();
                                                                                                                                                        if (cause38 == null) {
                                                                                                                                                            throw th58;
                                                                                                                                                        }
                                                                                                                                                        throw cause38;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr46 = {inputStream2, file};
                                                                                                                                                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1142972385);
                                                                                                                                                        declaredConstructor = inputStream2;
                                                                                                                                                        if (objOnExtraCallback2 == null) {
                                                                                                                                                            try {
                                                                                                                                                                Class[] clsArr12 = {InputStream.class, File.class};
                                                                                                                                                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 54, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1, 1969267057, false, "onNavigationEvent", clsArr12);
                                                                                                                                                                declaredConstructor = clsArr12;
                                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                                th2 = th59;
                                                                                                                                                                Throwable cause39 = th2.getCause();
                                                                                                                                                                if (cause39 == null) {
                                                                                                                                                                    throw th2;
                                                                                                                                                                }
                                                                                                                                                                throw cause39;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        Object objInvoke10 = ((Method) objOnExtraCallback2).invoke(null, objArr46);
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                Object objInvoke11 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                try {
                                                                                                                                                                    Object[] objArr47 = new Object[1];
                                                                                                                                                                    a(new char[]{'\f', 24, 11, 5, 16, 31, '\b', 16, 11, 2, 23, '\f', '#', 3, 13860}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50), (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, objArr47);
                                                                                                                                                                    declaredConstructor = 0;
                                                                                                                                                                    declaredConstructor = 0;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            Object[] objArr48 = {File.class.getMethod((String) objArr47[0], null).invoke(objInvoke10, null), StaticHelper.class.getClassLoader()};
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    Object[] objArr49 = new Object[1];
                                                                                                                                                                                    a(new char[]{16, '\b', 30, 3}, (byte) ((-16777101) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr49);
                                                                                                                                                                                    Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr49[0], String.class, ClassLoader.class);
                                                                                                                                                                                    declaredMethod6.setAccessible(true);
                                                                                                                                                                                    declaredMethod6.invoke(objInvoke11, objArr48);
                                                                                                                                                                                } catch (Throwable th60) {
                                                                                                                                                                                    th = th60;
                                                                                                                                                                                    Throwable th61 = th;
                                                                                                                                                                                    Throwable cause40 = th61.getCause();
                                                                                                                                                                                    if (cause40 == null) {
                                                                                                                                                                                        throw th61;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw cause40;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th62) {
                                                                                                                                                                                th = th62;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th63) {
                                                                                                                                                                            th = th63;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Exception unused3) {
                                                                                                                                                                        try {
                                                                                                                                                                        } catch (NoSuchMethodException unused4) {
                                                                                                                                                                        } catch (Exception e4) {
                                                                                                                                                                            e = e4;
                                                                                                                                                                            r15 = 0;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Object objInvoke12 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            jumpTapTimeout = 48;
                                                                                                                                                                                                            r15 = 1;
                                                                                                                                                                                                            r15 = 1;
                                                                                                                                                                                                            Object[] objArr50 = new Object[1];
                                                                                                                                                                                                            a(new char[]{'\f', 24, 11, 5, 16, 31, '\b', 16, 11, 2, 23, '\f', '#', 3, 13860}, (byte) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 50), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 16, objArr50);
                                                                                                                                                                                                            declaredConstructor = (String) objArr50[0];
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                Object[] objArr51 = {File.class.getMethod(declaredConstructor, null).invoke(objInvoke10, null), StaticHelper.class.getClassLoader()};
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    r15 = 0;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            Object[] objArr52 = new Object[1];
                                                                                                                                                                                                                            b((byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (short) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 1899608437 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) - 39, (ViewConfiguration.getTouchSlop() >> 8) - 488452945, objArr52);
                                                                                                                                                                                                                            Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr52[0], String.class, ClassLoader.class);
                                                                                                                                                                                                                            declaredMethod7.setAccessible(true);
                                                                                                                                                                                                                            declaredMethod7.invoke(objInvoke12, objArr51);
                                                                                                                                                                                                                            i2 = 0;
                                                                                                                                                                                                                            i = 1;
                                                                                                                                                                                                                        } catch (Throwable th64) {
                                                                                                                                                                                                                            th = th64;
                                                                                                                                                                                                                            Throwable th65 = th;
                                                                                                                                                                                                                            cause14 = th65.getCause();
                                                                                                                                                                                                                            if (cause14 != null) {
                                                                                                                                                                                                                                throw th65;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw cause14;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (Throwable th66) {
                                                                                                                                                                                                                        th = th66;
                                                                                                                                                                                                                        Throwable th652 = th;
                                                                                                                                                                                                                        cause14 = th652.getCause();
                                                                                                                                                                                                                        if (cause14 != null) {
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } catch (Throwable th67) {
                                                                                                                                                                                                                    th = th67;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th68) {
                                                                                                                                                                                                                th = th68;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th69) {
                                                                                                                                                                                                            Throwable cause41 = th69.getCause();
                                                                                                                                                                                                            if (cause41 == null) {
                                                                                                                                                                                                                throw th69;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw cause41;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (NoSuchMethodException unused5) {
                                                                                                                                                                                                        objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                                                        Object[] objArr53 = new Object[1];
                                                                                                                                                                                                        a(new char[]{'\f', 24, 11, 5, 16, 31, '\b', 16, 11, 2, 23, '\f', '#', 3, 13860}, (byte) (50 - Drawable.resolveOpacity(0, 0)), 14 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), objArr53);
                                                                                                                                                                                                        Object objInvoke13 = File.class.getMethod((String) objArr53[0], null).invoke(objInvoke10, null);
                                                                                                                                                                                                        ClassLoader classLoader5 = StaticHelper.class.getClassLoader();
                                                                                                                                                                                                        synchronized (objInvoke2) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Exception e5) {
                                                                                                                                                                                                        e = e5;
                                                                                                                                                                                                        exc = e;
                                                                                                                                                                                                        i2 = 0;
                                                                                                                                                                                                        i = 1;
                                                                                                                                                                                                        r15 = r15;
                                                                                                                                                                                                        if (i7 >= length) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i7++;
                                                                                                                                                                                                    str3 = str;
                                                                                                                                                                                                    i5 = i2;
                                                                                                                                                                                                    i6 = i;
                                                                                                                                                                                                    j = r15;
                                                                                                                                                                                                    strArr2 = strArr;
                                                                                                                                                                                                } catch (Throwable th70) {
                                                                                                                                                                                                    Throwable cause42 = th70.getCause();
                                                                                                                                                                                                    if (cause42 == null) {
                                                                                                                                                                                                        throw th70;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw cause42;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                r15 = 0;
                                                                                                                                                                                            }
                                                                                                                                                                                            Object objInvoke132 = File.class.getMethod((String) objArr53[0], null).invoke(objInvoke10, null);
                                                                                                                                                                                            ClassLoader classLoader52 = StaticHelper.class.getClassLoader();
                                                                                                                                                                                            synchronized (objInvoke2) {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Object[] objArr54 = {objInvoke132, classLoader52};
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        Object[] objArr55 = new Object[1];
                                                                                                                                                                                                        a(new char[]{15, '\"', 11, 29, 23, 19, 4, 7, 30, 3}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 80), 10 - (Process.myPid() >> 22), objArr55);
                                                                                                                                                                                                        declaredConstructor = 0;
                                                                                                                                                                                                        i2 = 0;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            String str14 = (String) objArr55[0];
                                                                                                                                                                                                            Class[] clsArr13 = new Class[2];
                                                                                                                                                                                                            clsArr13[0] = String.class;
                                                                                                                                                                                                            jumpTapTimeout = 1;
                                                                                                                                                                                                            i = 1;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                clsArr13[1] = ClassLoader.class;
                                                                                                                                                                                                                Method declaredMethod8 = Runtime.class.getDeclaredMethod(str14, clsArr13);
                                                                                                                                                                                                                declaredMethod8.setAccessible(true);
                                                                                                                                                                                                                String str15 = (String) declaredMethod8.invoke(objInvoke2, objArr54);
                                                                                                                                                                                                                if (str15 != null) {
                                                                                                                                                                                                                    throw new UnsatisfiedLinkError(str15);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th71) {
                                                                                                                                                                                                                th = th71;
                                                                                                                                                                                                                Throwable th72 = th;
                                                                                                                                                                                                                cause13 = th72.getCause();
                                                                                                                                                                                                                if (cause13 != null) {
                                                                                                                                                                                                                    throw th72;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw cause13;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th73) {
                                                                                                                                                                                                            th = th73;
                                                                                                                                                                                                            Throwable th722 = th;
                                                                                                                                                                                                            cause13 = th722.getCause();
                                                                                                                                                                                                            if (cause13 != null) {
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th74) {
                                                                                                                                                                                                        th = th74;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th75) {
                                                                                                                                                                                                    th = th75;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            i7++;
                                                                                                                                                                                            str3 = str;
                                                                                                                                                                                            i5 = i2;
                                                                                                                                                                                            i6 = i;
                                                                                                                                                                                            j = r15;
                                                                                                                                                                                            strArr2 = strArr;
                                                                                                                                                                                        } catch (Throwable th76) {
                                                                                                                                                                                            th = th76;
                                                                                                                                                                                            Throwable th77 = th;
                                                                                                                                                                                            cause12 = th77.getCause();
                                                                                                                                                                                            if (cause12 != null) {
                                                                                                                                                                                                throw th77;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw cause12;
                                                                                                                                                                                        }
                                                                                                                                                                                        Object[] objArr532 = new Object[1];
                                                                                                                                                                                        a(new char[]{'\f', 24, 11, 5, 16, 31, '\b', 16, 11, 2, 23, '\f', '#', 3, 13860}, (byte) (50 - Drawable.resolveOpacity(0, 0)), 14 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), objArr532);
                                                                                                                                                                                    } catch (Throwable th78) {
                                                                                                                                                                                        th = th78;
                                                                                                                                                                                        Throwable th772 = th;
                                                                                                                                                                                        cause12 = th772.getCause();
                                                                                                                                                                                        if (cause12 != null) {
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th79) {
                                                                                                                                                                                    th = th79;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th80) {
                                                                                                                                                                                th = th80;
                                                                                                                                                                            }
                                                                                                                                                                            objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                                        } catch (Throwable th81) {
                                                                                                                                                                            Throwable cause43 = th81.getCause();
                                                                                                                                                                            if (cause43 == null) {
                                                                                                                                                                                throw th81;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause43;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th82) {
                                                                                                                                                                    Throwable cause44 = th82.getCause();
                                                                                                                                                                    if (cause44 == null) {
                                                                                                                                                                        throw th82;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause44;
                                                                                                                                                                }
                                                                                                                                                            } catch (Exception unused6) {
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th83) {
                                                                                                                                                            Throwable cause45 = th83.getCause();
                                                                                                                                                            if (cause45 == null) {
                                                                                                                                                                throw th83;
                                                                                                                                                            }
                                                                                                                                                            throw cause45;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th84) {
                                                                                                                                                        th2 = th84;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i2 = 0;
                                                                                                                                                i = 1;
                                                                                                                                                r15 = 0;
                                                                                                                                            } catch (Throwable th85) {
                                                                                                                                                th = th85;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th86) {
                                                                                                                                            th = th86;
                                                                                                                                            Throwable th87 = th;
                                                                                                                                            cause11 = th87.getCause();
                                                                                                                                            if (cause11 != null) {
                                                                                                                                                throw th87;
                                                                                                                                            }
                                                                                                                                            throw cause11;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th88) {
                                                                                                                                        th = th88;
                                                                                                                                        Throwable th872 = th;
                                                                                                                                        cause11 = th872.getCause();
                                                                                                                                        if (cause11 != null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Throwable th89) {
                                                                                                                                    th = th89;
                                                                                                                                }
                                                                                                                            } catch (Throwable th90) {
                                                                                                                                th = th90;
                                                                                                                                Throwable th91 = th;
                                                                                                                                cause5 = th91.getCause();
                                                                                                                                if (cause5 == null) {
                                                                                                                                    throw th91;
                                                                                                                                }
                                                                                                                                throw cause5;
                                                                                                                            }
                                                                                                                        } catch (Throwable th92) {
                                                                                                                            th = th92;
                                                                                                                            Throwable th912 = th;
                                                                                                                            cause5 = th912.getCause();
                                                                                                                            if (cause5 == null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (Throwable th93) {
                                                                                                                        th = th93;
                                                                                                                    }
                                                                                                                } catch (Throwable th94) {
                                                                                                                    th = th94;
                                                                                                                }
                                                                                                            } catch (Throwable th95) {
                                                                                                                th = th95;
                                                                                                                Throwable th9122 = th;
                                                                                                                cause5 = th9122.getCause();
                                                                                                                if (cause5 == null) {
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th96) {
                                                                                                            th = th96;
                                                                                                        }
                                                                                                    } catch (Exception e6) {
                                                                                                        e = e6;
                                                                                                        i3 = 0;
                                                                                                        jumpTapTimeout = 1;
                                                                                                        declaredConstructor = i3;
                                                                                                        r15 = 0;
                                                                                                        exc = e;
                                                                                                        i2 = declaredConstructor;
                                                                                                        i = jumpTapTimeout;
                                                                                                        r15 = r15;
                                                                                                        if (i7 >= length) {
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th97) {
                                                                                                    th = th97;
                                                                                                    Throwable th98 = th;
                                                                                                    cause4 = th98.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                        throw th98;
                                                                                                    }
                                                                                                    throw cause4;
                                                                                                }
                                                                                            } catch (Throwable th99) {
                                                                                                th = th99;
                                                                                                Throwable th982 = th;
                                                                                                cause4 = th982.getCause();
                                                                                                if (cause4 != null) {
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th100) {
                                                                                            th = th100;
                                                                                        }
                                                                                    } catch (Throwable th101) {
                                                                                        th = th101;
                                                                                        Throwable th102 = th;
                                                                                        cause3 = th102.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw th102;
                                                                                        }
                                                                                        throw cause3;
                                                                                    }
                                                                                } catch (Throwable th103) {
                                                                                    th = th103;
                                                                                }
                                                                            } catch (Throwable th104) {
                                                                                th = th104;
                                                                                Throwable th1022 = th;
                                                                                cause3 = th1022.getCause();
                                                                                if (cause3 != null) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th105) {
                                                                            th = th105;
                                                                        }
                                                                    } catch (Throwable th106) {
                                                                        th = th106;
                                                                        Throwable th107 = th;
                                                                        cause2 = th107.getCause();
                                                                        if (cause2 == null) {
                                                                            throw th107;
                                                                        }
                                                                        throw cause2;
                                                                    }
                                                                } catch (Throwable th108) {
                                                                    th = th108;
                                                                    Throwable th1072 = th;
                                                                    cause2 = th1072.getCause();
                                                                    if (cause2 == null) {
                                                                    }
                                                                }
                                                            } catch (Throwable th109) {
                                                                th = th109;
                                                                Throwable th10722 = th;
                                                                cause2 = th10722.getCause();
                                                                if (cause2 == null) {
                                                                }
                                                            }
                                                        } catch (Throwable th110) {
                                                            th = th110;
                                                        }
                                                    } catch (Throwable th111) {
                                                        th = th111;
                                                    }
                                                    exc = e3;
                                                    i4 = 0;
                                                } catch (Throwable th112) {
                                                    th = th112;
                                                    Throwable th113 = th;
                                                    cause = th113.getCause();
                                                    if (cause != null) {
                                                        throw th113;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th114) {
                                                th = th114;
                                                Throwable th1132 = th;
                                                cause = th1132.getCause();
                                                if (cause != null) {
                                                }
                                            }
                                        } catch (Throwable th115) {
                                            th = th115;
                                        }
                                    } catch (Throwable th116) {
                                        th = th116;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    i3 = i5;
                                    strArr = strArr2;
                                }
                            } catch (Throwable th117) {
                                Throwable cause46 = th117.getCause();
                                if (cause46 == null) {
                                    throw th117;
                                }
                                throw cause46;
                            }
                        } catch (Throwable th118) {
                            Throwable cause47 = th118.getCause();
                            if (cause47 == null) {
                                throw th118;
                            }
                            throw cause47;
                        }
                    } catch (Exception e8) {
                        exc = e8;
                        i4 = i5;
                        strArr = strArr2;
                    }
                    i = 1;
                    r15 = 0;
                    i2 = i4;
                    if (i7 >= length) {
                        throw exc;
                    }
                }
                i7++;
                str3 = str;
                i5 = i2;
                i6 = i;
                j = r15;
                strArr2 = strArr;
            }
        } catch (Throwable th119) {
            Throwable cause48 = th119.getCause();
            if (cause48 == null) {
                throw th119;
            }
            throw cause48;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = IAuthTabCallbackDefault;
        int i4 = (s * 3) + 102;
        int i5 = 4 - (s2 * 3);
        byte[] bArr2 = new byte[11 - i3];
        int i6 = 10 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i4 = i5 + (-i4) + 2;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i5];
            int i9 = i5;
            i5 = i4;
            i4 = b;
            i8 = i2 + 1;
            i7 = i9;
            i4 = i5 + (-i4) + 2;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }
}
