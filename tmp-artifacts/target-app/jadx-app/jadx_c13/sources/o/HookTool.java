package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import j$.time.Instant;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;
import org.xbill.DNS.DNSSEC$;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HookTool {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final onNavigationEvent onExtraCallback;
    private static final onNavigationEvent onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static final onNavigationEvent onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i3 + i6 + i2 + ((-112346298) * i) + (505796074 * i5);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i3) - 1525940224) + (1734765094 * i6) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i2) + (859308032 * i) + (310902784 * i5) + (417529856 * i13);
        int i15 = (i3 * (-1233303660)) + 1670658458 + (i6 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i2 * (-1233302909)) + (i * 1075253458) + (i5 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        int i17 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i18 = 2 % 2;
        int i19 = asBinder + 5;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        if (bArr[0] < 0) {
            return Integer.valueOf(iIntValue + 1);
        }
        int i21 = iIntValue;
        while (i17 < iIntValue - 1 && bArr[i17] == 0) {
            int i22 = asBinder + 97;
            asInterface = i22 % 128;
            if (i22 % 2 != 0) {
                i17++;
                if (bArr[i17] < 0) {
                    break;
                }
                i21--;
            } else {
                i17 += 67;
                if (bArr[i17] < 0) {
                    break;
                }
                i21--;
            }
        }
        return Integer.valueOf(i21);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 123;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = i5;
                int i9 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i11 = 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        int absoluteGravity = Gravity.getAbsoluteGravity(i3, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, i11, absoluteGravity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myTid() >> 22) + 10, 12434 - View.MeasureSpec.getMode(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i8 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 16014), (ViewConfiguration.getTapTimeout() >> 16) + 14, 19902 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 113;
        $10 = i12 % 128;
        if (i12 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class onExtraCallback {
        private static int IAuthTabCallback;
        private static int asInterface;
        private static byte[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static short[] onTransact;
        private static final sz1 onWarmupCompleted;
        private static final byte[] $$a = {80, 83, -21, -55};
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;

        private static String $$c(short s, short s2, byte b) {
            int i = s2 * 2;
            int i2 = (b * 3) + 4;
            int i3 = 115 - (s * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i];
            int i4 = 0 - i;
            int i5 = -1;
            if (bArr == null) {
                i3 = i4 + i3;
                i2++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i2];
                i2++;
            }
        }

        static {
            asInterface = 1;
            onExtraCallbackWithResult();
            sz1 sz1Var = new sz1("DNSSEC algorithm", 2);
            onWarmupCompleted = sz1Var;
            sz1Var.onNavigationEvent(255);
            sz1Var.onWarmupCompleted(true);
            sz1Var.IAuthTabCallback(0, "DELETE");
            Object[] objArr = new Object[1];
            a((short) (Drawable.resolveOpacity(0, 0) - 32), (byte) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), (-5271149) + Drawable.resolveOpacity(0, 0), (-1789001951) + ImageFormat.getBitsPerPixel(0), (-59) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            sz1Var.IAuthTabCallback(1, ((String) objArr[0]).intern());
            sz1Var.IAuthTabCallback(2, "DH");
            sz1Var.IAuthTabCallback(3, "DSA");
            Object[] objArr2 = new Object[1];
            a((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 68), (byte) View.MeasureSpec.getSize(0), (-5271145) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) - 1789001952, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) - 59, objArr2);
            sz1Var.IAuthTabCallback(5, ((String) objArr2[0]).intern());
            sz1Var.IAuthTabCallback(6, "DSA-NSEC3-SHA1");
            Object[] objArr3 = new Object[1];
            a((short) ((-64) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) Color.green(0), (-5271138) - (ViewConfiguration.getPressedStateDuration() >> 16), (-1789001952) - ExpandableListView.getPackedPositionGroup(0L), (-48) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
            sz1Var.IAuthTabCallback(7, ((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a((short) (81 - Drawable.resolveOpacity(0, 0)), (byte) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') - 5271120, (-1789001953) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 57, objArr4);
            sz1Var.IAuthTabCallback(8, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a((short) ((Process.myTid() >> 22) + 65), (byte) (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) - 5271112, (-1789001952) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 57, objArr5);
            sz1Var.IAuthTabCallback(10, ((String) objArr5[0]).intern());
            sz1Var.IAuthTabCallback(12, "ECC-GOST");
            sz1Var.IAuthTabCallback(13, "ECDSAP256SHA256");
            sz1Var.IAuthTabCallback(14, "ECDSAP384SHA384");
            sz1Var.IAuthTabCallback(15, "ED25519");
            sz1Var.IAuthTabCallback(16, "ED448");
            sz1Var.IAuthTabCallback(17, "SM2SM3");
            sz1Var.IAuthTabCallback(23, "ECC-GOST12");
            sz1Var.IAuthTabCallback(252, "INDIRECT");
            sz1Var.IAuthTabCallback(253, "PRIVATEDNS");
            sz1Var.IAuthTabCallback(254, "PRIVATEOID");
            int i = asBinder + 9;
            asInterface = i % 128;
            if (i % 2 == 0) {
                int i2 = 32 / 0;
            }
        }

        public static String IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 71;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                onWarmupCompleted.IAuthTabCallback(i);
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallback = onWarmupCompleted.IAuthTabCallback(i);
            int i4 = IAuthTabCallbackDefault + 1;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return strIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43424), 42 - KeyEvent.getDeadChar(0, 0), 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    i4 = 1;
                } else {
                    int i7 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 0;
                }
                long j = 0;
                float f = 0.0f;
                if ((i4 ^ 1) != 1) {
                    int i9 = $11;
                    int i10 = i9 + 67;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr = onExtraCallback;
                    if (bArr != null) {
                        int i12 = i9 + 73;
                        int i13 = i12 % 128;
                        $10 = i13;
                        int i14 = i12 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i15 = i13 + 53;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = 0;
                        while (i17 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i17])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char c = (char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 12843);
                                int packedPositionChild = 54 - ExpandableListView.getPackedPositionChild(j);
                                int iAxisFromString = 2166 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET);
                                byte b2 = (byte) $$b;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, packedPositionChild, iAxisFromString, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i17] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i17++;
                            j = 0;
                            f = 0.0f;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i18 = $10 + 93;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), 41 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), KeyEvent.getDeadChar(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onTransact[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 86, 9566 - ExpandableListView.getPackedPositionChild(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i20 = 0; i20 < length2; i20++) {
                            bArr5[i20] = (byte) (bArr4[i20] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i21 = $10 + 1;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i23 = $11;
                        int i24 = i23 + 43;
                        $10 = i24 % 128;
                        int i25 = i24 % 2;
                        if (z) {
                            int i26 = i23 + Imgproc.COLOR_YUV2RGBA_YVYU;
                            $10 = i26 % 128;
                            if (i26 % 2 != 0) {
                                byte[] bArr6 = onExtraCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr6[r8] & (-4629411779493505016L))) - s)) ^ b);
                            } else {
                                byte[] bArr7 = onExtraCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                        } else {
                            short[] sArr = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static void onExtraCallbackWithResult() {
            IAuthTabCallback = -1541949851;
            onNavigationEvent = -1538795446;
            onExtraCallbackWithResult = -823797446;
            onExtraCallback = new byte[]{25, 31, 36, 6, 41, -93, -68, -72, -59, -95, -76, 56, 49, 61, 110, 50, 56, 54, 58, 77, 105, 52, 56, 49, 61, 90, 38, 73, -72, -70, -88, -96, -84, -55, -107, -72, -56, -77, -69, -80, -68, -39, -91, -56, 8, 8, 8, 8, 8};
        }
    }

    public static class IAuthTabCallback {
        private static final sz1 onExtraCallbackWithResult;
        private static final Map<Integer, Integer> onNavigationEvent;

        static {
            sz1 sz1Var = new sz1("DNSSEC Digest Algorithm", 2);
            onExtraCallbackWithResult = sz1Var;
            HashMap map = new HashMap(4);
            onNavigationEvent = map;
            sz1Var.onNavigationEvent(255);
            sz1Var.onWarmupCompleted(true);
            sz1Var.IAuthTabCallback(1, "SHA-1");
            map.put(1, 20);
            sz1Var.IAuthTabCallback(2, "SHA-256");
            map.put(2, 32);
            sz1Var.IAuthTabCallback(3, "GOST R 34.11-94");
            map.put(3, 32);
            sz1Var.IAuthTabCallback(4, "SHA-384");
            map.put(4, 48);
            sz1Var.IAuthTabCallback(5, "GOST12");
            map.put(5, 64);
            sz1Var.IAuthTabCallback(6, "SM3");
            map.put(6, 32);
        }

        public static String onNavigationEvent(int i) {
            return onExtraCallbackWithResult.IAuthTabCallback(i);
        }

        public static int onExtraCallback(int i) {
            Integer num = onNavigationEvent.get(Integer.valueOf(i));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        deactivate deactivateVar = (deactivate) objArr[0];
        lt22 lt22Var = (lt22) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        deactivateVar.IAuthTabCallback(lt22Var.access100());
        deactivateVar.onNavigationEvent(lt22Var.onExtraCallbackWithResult());
        deactivateVar.onNavigationEvent(lt22Var.IAuthTabCallbackDefault());
        deactivateVar.onWarmupCompleted(lt22Var.onTransact());
        deactivateVar.onWarmupCompleted(lt22Var.onExtraCallback().getEpochSecond());
        deactivateVar.onWarmupCompleted(lt22Var.IAuthTabCallbackStubProxy().getEpochSecond());
        deactivateVar.IAuthTabCallback(lt22Var.onNavigationEvent());
        lt22Var.asBinder().IAuthTabCallback(deactivateVar);
        int i4 = asInterface + 69;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(deactivate deactivateVar, deactivate deactivateVar2, Record record) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        deactivateVar.onNavigationEvent(deactivateVar2.IAuthTabCallback());
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        deactivateVar.IAuthTabCallback(0);
        record.onExtraCallbackWithResult(deactivateVar, (ryzb) null, true);
        int iOnNavigationEvent2 = deactivateVar.onNavigationEvent();
        deactivateVar.onExtraCallback();
        deactivateVar.onExtraCallbackWithResult(iOnNavigationEvent);
        deactivateVar.IAuthTabCallback((iOnNavigationEvent2 - iOnNavigationEvent) - 2);
        deactivateVar.onExtraCallbackWithResult();
        int i4 = asInterface + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        yzp2 yzp2VarOnExtraCallback;
        RRSIGRecord rRSIGRecord = (RRSIGRecord) objArr[0];
        RRset rRset = (RRset) objArr[1];
        int i = 2 % 2;
        deactivate deactivateVar = new deactivate();
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{deactivateVar, rRSIGRecord}, MaxNativeAdListener.onExtraCallbackWithResult(), 6537785, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), -6537782);
        yzp2 yzp2VarAsInterface = rRset.asInterface();
        int iIAuthTabCallbackDefault = rRSIGRecord.IAuthTabCallbackDefault() + 1;
        if (yzp2VarAsInterface.IAuthTabCallback() > iIAuthTabCallbackDefault) {
            int i2 = asInterface + 31;
            asBinder = i2 % 128;
            yzp2VarOnExtraCallback = yzp2VarAsInterface.onExtraCallback(i2 % 2 != 0 ? yzp2VarAsInterface.IAuthTabCallback() >>> iIAuthTabCallbackDefault : yzp2VarAsInterface.IAuthTabCallback() - iIAuthTabCallbackDefault);
        } else {
            yzp2VarOnExtraCallback = null;
        }
        deactivate deactivateVar2 = new deactivate();
        if (yzp2VarOnExtraCallback != null) {
            yzp2VarOnExtraCallback.IAuthTabCallback(deactivateVar2);
        } else {
            yzp2VarAsInterface.IAuthTabCallback(deactivateVar2);
            int i3 = asBinder + 57;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        deactivateVar2.IAuthTabCallback(rRset.onExtraCallback());
        deactivateVar2.IAuthTabCallback(rRset.onTransact());
        deactivateVar2.onWarmupCompleted(rRSIGRecord.onTransact());
        rRset.onWarmupCompleted(false).stream().sorted().forEachOrdered(new DNSSEC$.ExternalSyntheticLambda0(deactivateVar, deactivateVar2));
        return deactivateVar.IAuthTabCallback();
    }

    private static BigInteger onWarmupCompleted(getBlob getblob, int i) throws IOException {
        int i2 = 2 % 2;
        BigInteger bigInteger = new BigInteger(1, getblob.IAuthTabCallback(i));
        int i3 = asBinder + 97;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    private static BigInteger onExtraCallback(getBlob getblob) {
        int i = 2 % 2;
        BigInteger bigInteger = new BigInteger(1, getblob.onExtraCallback());
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    private static void IAuthTabCallback(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < bArr.length / 2; i3++) {
            int length = (bArr.length - i3) - 1;
            byte b = bArr[i3];
            bArr[i3] = bArr[length];
            bArr[length] = b;
        }
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static BigInteger onNavigationEvent(getBlob getblob, int i) throws IOException {
        int i2 = 2 % 2;
        byte[] bArrIAuthTabCallback = getblob.IAuthTabCallback(i);
        IAuthTabCallback(bArrIAuthTabCallback);
        BigInteger bigInteger = new BigInteger(1, bArrIAuthTabCallback);
        int i3 = asInterface + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return bigInteger;
    }

    private static PublicKey onExtraCallback(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        getBlob getblob = new getBlob(bArr);
        int iAsInterface = getblob.asInterface();
        if (iAsInterface == 0) {
            int i2 = asInterface + 63;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                iAsInterface = getblob.onExtraCallbackWithResult();
            } else {
                getblob.onExtraCallbackWithResult();
                throw null;
            }
        }
        BigInteger bigIntegerOnWarmupCompleted = onWarmupCompleted(getblob, iAsInterface);
        BigInteger bigIntegerOnExtraCallback = onExtraCallback(getblob);
        Object[] objArr = new Object[1];
        a(new char[]{62751, 438, 38439, 58404}, (ViewConfiguration.getTapTimeout() >> 16) + 3, objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new RSAPublicKeySpec(bigIntegerOnExtraCallback, bigIntegerOnWarmupCompleted));
        int i3 = asInterface + 81;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return publicKeyGeneratePublic;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$onTransact */
    private static PublicKey onWarmupCompleted(byte[] bArr) throws GeneralSecurityException, IOException, onTransact {
        int i = 2 % 2;
        getBlob getblob = new getBlob(bArr);
        int iAsInterface = getblob.asInterface();
        if (iAsInterface > 8) {
            throw new onTransact("t is too large");
        }
        BigInteger bigIntegerOnWarmupCompleted = onWarmupCompleted(getblob, 20);
        int i2 = (iAsInterface << 3) + 64;
        BigInteger bigIntegerOnWarmupCompleted2 = onWarmupCompleted(getblob, i2);
        BigInteger bigIntegerOnWarmupCompleted3 = onWarmupCompleted(getblob, i2);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(onWarmupCompleted(getblob, i2), bigIntegerOnWarmupCompleted2, bigIntegerOnWarmupCompleted, bigIntegerOnWarmupCompleted3));
        int i3 = asInterface + 89;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return publicKeyGeneratePublic;
        }
        throw null;
    }

    static class onNavigationEvent {
        EllipticCurve onExtraCallbackWithResult;
        int onNavigationEvent;
        ECParameterSpec onWarmupCompleted;

        onNavigationEvent(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.onNavigationEvent = i;
            BigInteger bigInteger = new BigInteger(str, 16);
            BigInteger bigInteger2 = new BigInteger(str2, 16);
            BigInteger bigInteger3 = new BigInteger(str3, 16);
            BigInteger bigInteger4 = new BigInteger(str4, 16);
            BigInteger bigInteger5 = new BigInteger(str5, 16);
            BigInteger bigInteger6 = new BigInteger(str6, 16);
            this.onExtraCallbackWithResult = new EllipticCurve(new ECFieldFp(bigInteger), bigInteger2, bigInteger3);
            this.onWarmupCompleted = new ECParameterSpec(this.onExtraCallbackWithResult, new ECPoint(bigInteger4, bigInteger5), bigInteger6, 1);
        }
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{5740, 50384}, -TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr);
        onWarmupCompleted = new onNavigationEvent(32, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", "A6", ((String) objArr[0]).intern(), "8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
        onExtraCallbackWithResult = new onNavigationEvent(32, "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
        onExtraCallback = new onNavigationEvent(48, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
        int i = IAuthTabCallbackStubProxy + 93;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static PublicKey IAuthTabCallback(byte[] bArr, onNavigationEvent onnavigationevent) throws GeneralSecurityException, IOException {
        int i = 2 % 2;
        getBlob getblob = new getBlob(bArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("ECGOST3410").generatePublic(new ECPublicKeySpec(new ECPoint(onNavigationEvent(getblob, onnavigationevent.onNavigationEvent), onNavigationEvent(getblob, onnavigationevent.onNavigationEvent)), onnavigationevent.onWarmupCompleted));
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return publicKeyGeneratePublic;
    }

    private static PublicKey onNavigationEvent(byte[] bArr, onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        getBlob getblob = new getBlob(bArr);
        ECPoint eCPoint = new ECPoint(onWarmupCompleted(getblob, onnavigationevent.onNavigationEvent), onWarmupCompleted(getblob, onnavigationevent.onNavigationEvent));
        Object[] objArr = new Object[1];
        a(new char[]{32249, 4031}, 2 - ExpandableListView.getPackedPositionType(0L), objArr);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new ECPublicKeySpec(eCPoint, onnavigationevent.onWarmupCompleted));
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return publicKeyGeneratePublic;
    }

    private static PublicKey onWarmupCompleted(byte[] bArr, byte b) throws GeneralSecurityException {
        int i = 2 % 2;
        byte[] bArr2 = new byte[bArr.length + 12];
        bArr2[0] = 48;
        bArr2[1] = (byte) (bArr.length + 10);
        bArr2[2] = 48;
        bArr2[3] = 5;
        bArr2[4] = 6;
        bArr2[5] = 3;
        bArr2[6] = 43;
        bArr2[7] = 101;
        bArr2[8] = b;
        bArr2[9] = 3;
        bArr2[10] = (byte) (bArr.length + 1);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EdDSA").generatePublic(new X509EncodedKeySpec(bArr2));
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return publicKeyGeneratePublic;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static PublicKey onExtraCallbackWithResult(DeviceUtilszb deviceUtilszb) throws onWarmupCompleted {
        int i = 2 % 2;
        int i2 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKeyIAuthTabCallback = IAuthTabCallback(deviceUtilszb.onExtraCallback(), deviceUtilszb.onWarmupCompleted(), deviceUtilszb);
        int i4 = asInterface + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return publicKeyIAuthTabCallback;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$getInterfaceDescriptor */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$onTransact */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$onWarmupCompleted */
    static PublicKey IAuthTabCallback(int i, byte[] bArr, Record record) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        try {
            switch (i) {
                case 1:
                case 5:
                case 7:
                case 8:
                case 10:
                    return onExtraCallback(bArr);
                case 2:
                case 4:
                case 9:
                case 11:
                default:
                    throw new getInterfaceDescriptor(i);
                case 3:
                case 6:
                    PublicKey publicKeyOnWarmupCompleted = onWarmupCompleted(bArr);
                    int i5 = asBinder + 15;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 36 / 0;
                    }
                    return publicKeyOnWarmupCompleted;
                case 12:
                    return IAuthTabCallback(bArr, onWarmupCompleted);
                case 13:
                    return onNavigationEvent(bArr, onExtraCallbackWithResult);
                case 14:
                    PublicKey publicKeyOnNavigationEvent = onNavigationEvent(bArr, onExtraCallback);
                    int i7 = asBinder + 83;
                    asInterface = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 30 / 0;
                    }
                    return publicKeyOnNavigationEvent;
                case 15:
                    return onWarmupCompleted(bArr, (byte) 112);
                case 16:
                    return onWarmupCompleted(bArr, (byte) 113);
            }
        } catch (IOException e) {
            throw new onTransact(record, e);
        } catch (GeneralSecurityException e2) {
            throw new onWarmupCompleted(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$getInterfaceDescriptor */
    public static String onExtraCallbackWithResult(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 99;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        switch (i) {
            case 1:
                return "MD5withRSA";
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new getInterfaceDescriptor(i);
            case 3:
            case 6:
                return "SHA1withDSA";
            case 5:
            case 7:
                return "SHA1withRSA";
            case 8:
                return "SHA256withRSA";
            case 10:
                return "SHA512withRSA";
            case 12:
                return "GOST3411withECGOST3410";
            case 13:
                Object[] objArr = new Object[1];
                a(new char[]{16196, 12475, 49570, 21417, 60772, 57979, 11311, 31206, 46850, 3008, 32249, 4031, 64930, 8788, 38439, 58404}, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                return ((String) objArr[0]).intern();
            case 14:
                int i5 = i3 + 9;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return "SHA384withECDSA";
                }
                obj.hashCode();
                throw null;
            case 15:
                return "Ed25519";
            case 16:
                return "Ed448";
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$asInterface */
    private static byte[] IAuthTabCallback(byte[] bArr, int i, boolean z) throws onWarmupCompleted, IOException, asInterface {
        int i2 = 2 % 2;
        int i3 = asInterface + 47;
        asBinder = i3 % 128;
        if (i3 % 2 == 0 ? bArr.length != (i << 1) + (z ? 1 : 0) : bArr.length != (i % 1) % (z ? 1 : 0)) {
            throw new asInterface("input has unexpected length " + bArr.length);
        }
        getBlob getblob = new getBlob(bArr);
        deactivate deactivateVar = new deactivate();
        if (z) {
            int i4 = asInterface + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            getblob.asInterface();
        }
        byte[] bArrIAuthTabCallback = getblob.IAuthTabCallback(i);
        int iIntValue = ((Integer) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{bArrIAuthTabCallback, Integer.valueOf(i)}, MaxNativeAdListener.onExtraCallbackWithResult(), 1235858233, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), -1235858231)).intValue();
        byte[] bArrIAuthTabCallback2 = getblob.IAuthTabCallback(i);
        int iIntValue2 = ((Integer) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{bArrIAuthTabCallback2, Integer.valueOf(i)}, MaxNativeAdListener.onExtraCallbackWithResult(), 1235858233, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), -1235858231)).intValue();
        deactivateVar.onNavigationEvent(48);
        deactivateVar.onNavigationEvent(iIntValue + iIntValue2 + 4);
        onExtraCallbackWithResult(i, deactivateVar, bArrIAuthTabCallback, iIntValue);
        onExtraCallbackWithResult(i, deactivateVar, bArrIAuthTabCallback2, iIntValue2);
        return deactivateVar.IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallbackWithResult(int i, deactivate deactivateVar, byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            deactivateVar.onNavigationEvent(3);
            deactivateVar.onNavigationEvent(i2);
            if (i2 > i) {
                deactivateVar.onNavigationEvent(0);
            }
        } else {
            deactivateVar.onNavigationEvent(2);
            deactivateVar.onNavigationEvent(i2);
            if (i2 > i) {
            }
        }
        if (i2 < i) {
            deactivateVar.onExtraCallback(bArr, i - i2, i2);
            return;
        }
        int i5 = asInterface + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        deactivateVar.onNavigationEvent(bArr);
        int i7 = asBinder + 11;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$asInterface */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$getInterfaceDescriptor */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$onWarmupCompleted */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: IOException -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ad, blocks: (B:22:0x006a, B:24:0x007c, B:25:0x0085, B:28:0x008f, B:29:0x00a6, B:30:0x00a7, B:31:0x00ac), top: B:47:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[Catch: IOException -> 0x00ad, TRY_ENTER, TryCatch #1 {IOException -> 0x00ad, blocks: (B:22:0x006a, B:24:0x007c, B:25:0x0085, B:28:0x008f, B:29:0x00a6, B:30:0x00a7, B:31:0x00ac), top: B:47:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: IOException -> 0x00ad, TryCatch #1 {IOException -> 0x00ad, blocks: (B:22:0x006a, B:24:0x007c, B:25:0x0085, B:28:0x008f, B:29:0x00a6, B:30:0x00a7, B:31:0x00ac), top: B:47:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[Catch: IOException -> 0x00ad, TryCatch #1 {IOException -> 0x00ad, blocks: (B:22:0x006a, B:24:0x007c, B:25:0x0085, B:28:0x008f, B:29:0x00a6, B:30:0x00a7, B:31:0x00ac), top: B:47:0x005d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws onWarmupCompleted, getInterfaceDescriptor, NoSuchAlgorithmException, SignatureException, InvalidKeyException, asInterface {
        DeviceUtilszb deviceUtilszb = (DeviceUtilszb) objArr[0];
        lt22 lt22Var = (lt22) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        PublicKey publicKeyIAuthTabCallbackDefault = deviceUtilszb.IAuthTabCallbackDefault();
        int iOnExtraCallbackWithResult = lt22Var.onExtraCallbackWithResult();
        byte[] bArrIAuthTabCallbackStub = lt22Var.IAuthTabCallbackStub();
        if (publicKeyIAuthTabCallbackDefault instanceof DSAPublicKey) {
            int i2 = asBinder + 115;
            asInterface = i2 % 128;
            try {
                bArrIAuthTabCallbackStub = i2 % 2 == 0 ? IAuthTabCallback(bArrIAuthTabCallbackStub, 29, true) : IAuthTabCallback(bArrIAuthTabCallbackStub, 20, true);
            } catch (IOException e) {
                throw new asInterface(e);
            }
        } else if (!(!(publicKeyIAuthTabCallbackDefault instanceof ECPublicKey))) {
            int i3 = asInterface + 69;
            asBinder = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    int i4 = 32 / 0;
                    switch (iOnExtraCallbackWithResult) {
                        case 12:
                            if (bArrIAuthTabCallbackStub.length != (onWarmupCompleted.onNavigationEvent << 1)) {
                                throw new asInterface("input has unexpected length " + bArrIAuthTabCallbackStub.length);
                            }
                            break;
                        case 13:
                            bArrIAuthTabCallbackStub = IAuthTabCallback(bArrIAuthTabCallbackStub, onExtraCallbackWithResult.onNavigationEvent, false);
                            break;
                        case 14:
                            bArrIAuthTabCallbackStub = IAuthTabCallback(bArrIAuthTabCallbackStub, onExtraCallback.onNavigationEvent, false);
                            int i5 = asBinder + 109;
                            asInterface = i5 % 128;
                            int i6 = i5 % 2;
                            break;
                        default:
                            throw new getInterfaceDescriptor(iOnExtraCallbackWithResult);
                    }
                } else {
                    switch (iOnExtraCallbackWithResult) {
                    }
                }
            } catch (IOException e2) {
                throw new asInterface(e2);
            }
        }
        try {
            Signature signature = Signature.getInstance(onExtraCallbackWithResult(iOnExtraCallbackWithResult));
            signature.initVerify(publicKeyIAuthTabCallbackDefault);
            signature.update(bArr);
            if (signature.verify(bArrIAuthTabCallbackStub)) {
                return null;
            }
            throw new asInterface("Key " + deviceUtilszb.access000() + " (alg=" + deviceUtilszb.onExtraCallback() + ",id=" + deviceUtilszb.onExtraCallbackWithResult() + ") doesn't validate <" + lt22Var.access000() + "/" + ryzbycx.onWarmupCompleted(lt22Var.getInterfaceDescriptor()) + "/" + lt54.onNavigationEvent(iIntValue) + "> (alg=" + lt22Var.onExtraCallbackWithResult() + ",id=" + lt22Var.onNavigationEvent() + ")");
        } catch (GeneralSecurityException e3) {
            throw new onWarmupCompleted(e3);
        }
    }

    private static boolean onWarmupCompleted(lt22 lt22Var, DeviceUtilszb deviceUtilszb) {
        int i = 2 % 2;
        if (deviceUtilszb.onExtraCallback() == lt22Var.onExtraCallbackWithResult()) {
            int i2 = asBinder + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (deviceUtilszb.onExtraCallbackWithResult() == lt22Var.onNavigationEvent()) {
                int i4 = asInterface + 119;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (deviceUtilszb.access000().equals(lt22Var.asBinder())) {
                    int i6 = asBinder + 45;
                    asInterface = i6 % 128;
                    return i6 % 2 != 0;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$onExtraCallbackWithResult */
    public static void IAuthTabCallback(RRset rRset, RRSIGRecord rRSIGRecord, copyStringToBuffer copystringtobuffer, Instant instant) throws IAuthTabCallbackDefault, asBinder, onExtraCallbackWithResult, onWarmupCompleted, IAuthTabCallbackStub {
        int i = 2 % 2;
        if ((copystringtobuffer.onNavigationEvent() & 256) != 256) {
            throw new onExtraCallbackWithResult(copystringtobuffer, "zone key flag is not set", 11);
        }
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0 ? copystringtobuffer.IAuthTabCallbackStub() != 3 : copystringtobuffer.IAuthTabCallbackStub() != 4) {
            throw new onExtraCallbackWithResult(copystringtobuffer, "invalid protocol", 6);
        }
        IAuthTabCallback(rRSIGRecord, copystringtobuffer, instant);
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{copystringtobuffer, rRSIGRecord, (byte[]) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{rRSIGRecord, rRset}, MaxNativeAdListener.onExtraCallbackWithResult(), -444960418, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), 444960419), Integer.valueOf(rRset.onExtraCallback())}, MaxNativeAdListener.onExtraCallbackWithResult(), 1292011704, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), -1292011704);
        int i3 = asBinder + 35;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$IAuthTabCallbackDefault */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$IAuthTabCallbackStub */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.HookTool$asBinder */
    private static void IAuthTabCallback(lt22 lt22Var, DeviceUtilszb deviceUtilszb, Instant instant) throws IAuthTabCallbackDefault, asBinder, onWarmupCompleted, IAuthTabCallbackStub {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!onWarmupCompleted(lt22Var, deviceUtilszb)) {
            throw new IAuthTabCallbackStub(deviceUtilszb, lt22Var);
        }
        int i4 = asInterface + 27;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            instant.compareTo(lt22Var.onExtraCallback());
            throw null;
        }
        if (instant.compareTo(lt22Var.onExtraCallback()) > 0) {
            throw new asBinder(lt22Var.onExtraCallback(), instant);
        }
        if (instant.compareTo(lt22Var.IAuthTabCallbackStubProxy()) < 0) {
            throw new IAuthTabCallbackDefault(lt22Var.IAuthTabCallbackStubProxy(), instant);
        }
        int i5 = asBinder + 79;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static byte[] IAuthTabCallback(copyStringToBuffer copystringtobuffer, int i) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        try {
            if (i == 1) {
                messageDigest = MessageDigest.getInstance("sha-1");
            } else if (i == 2) {
                messageDigest = MessageDigest.getInstance("sha-256");
            } else if (i != 3) {
                int i6 = i4 + 23;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                if (i != 4) {
                    throw new IllegalArgumentException("unknown DS digest type " + i);
                }
                int i8 = i4 + 57;
                asInterface = i8 % 128;
                if (i8 % 2 == 0) {
                    MessageDigest.getInstance("sha-384");
                    throw null;
                }
                messageDigest = MessageDigest.getInstance("sha-384");
            } else {
                messageDigest = MessageDigest.getInstance("GOST3411");
                int i9 = asBinder + 73;
                asInterface = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 / 5;
                }
            }
            messageDigest.update(copystringtobuffer.access000().onExtraCallback());
            messageDigest.update(copystringtobuffer.extraCallbackWithResult());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("no message digest support");
        }
    }

    public static byte[] onWarmupCompleted(RRSIGRecord rRSIGRecord, RRset rRset) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (byte[]) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{rRSIGRecord, rRset}, iOnExtraCallbackWithResult2, -444960418, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), 444960419);
    }

    private static void onExtraCallback(deactivate deactivateVar, lt22 lt22Var) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{deactivateVar, lt22Var}, iOnExtraCallbackWithResult2, 6537785, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), -6537782);
    }

    private static int onExtraCallbackWithResult(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), objArr, MaxNativeAdListener.onExtraCallbackWithResult(), 1235858233, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), -1235858231)).intValue();
    }

    private static void onWarmupCompleted(DeviceUtilszb deviceUtilszb, lt22 lt22Var, byte[] bArr, int i) throws onWarmupCompleted {
        Object[] objArr = {deviceUtilszb, lt22Var, bArr, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), objArr, MaxNativeAdListener.onExtraCallbackWithResult(), 1292011704, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), -1292011704);
    }

    static void onNavigationEvent() {
        onNavigationEvent = (char) 30722;
        IAuthTabCallback = (char) 26693;
        IAuthTabCallbackStub = (char) 55614;
        IAuthTabCallbackDefault = (char) 10723;
    }
}
