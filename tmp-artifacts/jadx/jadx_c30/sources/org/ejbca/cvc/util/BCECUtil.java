package org.ejbca.cvc.util;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SignatureException;
import java.util.Locale;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BCECUtil {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onNavigationEvent = {701036985, 567376426, -1401481956, 440762639, -364651937, -382268129, -757189840, -555180384, 1982233326, 695935820, -723195593, 429778880, -164876092, 1856040809, 857145563, 1541681470, -1455600635, 357360585};
    private static int onWarmupCompleted;

    private BCECUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        r6 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        r6 = new org.bouncycastle.asn1.ASN1InputStream(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        r7 = r6.readObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        r6.close();
        r6 = r7.getObjectAt(0).getValue();
        r7 = r7.getObjectAt(1).getValue();
        r6 = makeUnsigned(r6);
        r7 = makeUnsigned(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (r6.length <= r7.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r1 = new byte[r6.length << 1];
        r2 = org.ejbca.cvc.util.BCECUtil.onWarmupCompleted + 85;
        org.ejbca.cvc.util.BCECUtil.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        r1 = new byte[r7.length << 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, (r1.length / 2) - r6.length, r6.length);
        java.lang.System.arraycopy(r7, 0, r1, r1.length - r7.length, r7.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c9, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r6.contains(((java.lang.String) r3[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0064, code lost:
    
        if (r6.contains(((java.lang.String) r3[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        r6 = org.ejbca.cvc.util.BCECUtil.onWarmupCompleted + 71;
        org.ejbca.cvc.util.BCECUtil.IAuthTabCallback = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] convertX962SigToCVC(String str, byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            String upperCase = str.toUpperCase(Locale.getDefault());
            Object[] objArr = new Object[1];
            a(new int[]{-1314947169, 1496313508}, 4 >> (ViewConfiguration.getJumpTapTimeout() >> 42), objArr);
        } else {
            String upperCase2 = str.toUpperCase(Locale.getDefault());
            Object[] objArr2 = new Object[1];
            a(new int[]{-1314947169, 1496313508}, 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
        }
    }

    public static byte[] convertCVCSigToX962(String str, byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String upperCase = str.toUpperCase(Locale.getDefault());
        Object[] objArr = new Object[1];
        a(new int[]{-1314947169, 1496313508}, 2 - (Process.myTid() >> 22), objArr);
        if (!upperCase.contains(((String) objArr[0]).intern())) {
            return bArr;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length2);
        BigInteger bigInteger = new BigInteger(1, bArr2);
        BigInteger bigInteger2 = new BigInteger(1, bArr3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        aSN1EncodableVector.add(new ASN1Integer(bigInteger2));
        try {
            aSN1OutputStreamCreate.writeObject(new DERSequence(aSN1EncodableVector));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return byteArray;
        } catch (IOException e) {
            throw new SignatureException(e);
        }
    }

    private static byte[] makeUnsigned(BigInteger bigInteger) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int length = byteArray.length + 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 0, bArr, 0, length);
            return bArr;
        }
        int length2 = byteArray.length - 1;
        byte[] bArr2 = new byte[length2];
        System.arraycopy(byteArray, 1, bArr2, 0, length2);
        return bArr2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i5), Color.alpha(i5) + 72, (ViewConfiguration.getTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.resolveSizeAndState(0, 0, 0)), View.MeasureSpec.getSize(0) + 39, View.MeasureSpec.makeMeasureSpec(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4032), 78 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i15 = $11 + 97;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 4 % 3;
            }
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i17 = $11 + 85;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }
}
