package o;

import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RememberLottieCompositionKtloadImagesFromAssets2 extends Repeater {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int[] onNavigationEvent = {-1593382086, 1382206371, -930556239, 1719431737, -1557291650, -1786091551, 1688887306, 821051243, 1094848613, 2089413324, 717226760, 2017037366, -230800816, 1997963181, 609623161, 591022345, -1521486946, 281436258};

    RememberLottieCompositionKtloadImagesFromAssets2(@NonNull Context context, @Nullable String str) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        this(context, str, true);
    }

    RememberLottieCompositionKtloadImagesFromAssets2(@NonNull Context context, @Nullable String str, boolean z) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        super(context, str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r0 = 24 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return onExtraCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r4 = onNavigationEvent(r4, r3.onExtraCallback);
        r1 = o.RememberLottieCompositionKtloadImagesFromAssets2.IAuthTabCallback + 7;
        o.RememberLottieCompositionKtloadImagesFromAssets2.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (o.Repeater.IAuthTabCallback(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (o.Repeater.IAuthTabCallback(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = o.RememberLottieCompositionKtloadImagesFromAssets2.IAuthTabCallback + 15;
        o.RememberLottieCompositionKtloadImagesFromAssets2.asInterface = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SecretKey onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    private SecretKey onExtraCallback(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SecretKey secretKey = (SecretKey) this.onWarmupCompleted.getKey(str, null);
        int i4 = asInterface + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return secretKey;
    }

    private static SecretKey onNavigationEvent(String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{-177995052, 1291209260}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
        keyGenerator.init(Repeater.onWarmupCompleted(str, "CBC", "PKCS7Padding", z).setKeySize(256).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        int i4 = IAuthTabCallback + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return secretKeyGenerateKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.Repeater
    protected Cipher IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Cipher cipherOnNavigationEvent = onNavigationEvent();
        onNavigationEvent(cipherOnNavigationEvent, 1, onNavigationEvent(this.onExtraCallbackWithResult));
        int i4 = asInterface + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cipherOnNavigationEvent;
    }

    Cipher IAuthTabCallback(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        Cipher cipherOnNavigationEvent = onNavigationEvent();
        onExtraCallback(cipherOnNavigationEvent, 2, onExtraCallback(this.onExtraCallbackWithResult), new IvParameterSpec(bArr));
        int i2 = asInterface + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return cipherOnNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.Repeater
    protected Cipher onNavigationEvent() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-137841818, 1532461763, 2099765083, -2069922274, 745807573, -1860069998, 1413994532, 2110024396, -1390736401, 1363525728}, 22 / TextUtils.indexOf("", "", 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-137841818, 1532461763, 2099765083, -2069922274, 745807573, -1860069998, 1413994532, 2110024396, -1390736401, 1363525728}, TextUtils.indexOf("", "", 0) + 20, objArr2);
            obj = objArr2[0];
        }
        return Cipher.getInstance(((String) obj).intern());
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 47;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 72, View.combineMeasuredStates(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i2 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 72 - TextUtils.indexOf("", "", 0, 0), TextUtils.getCapsMode("", 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i2++;
                }
                i3 = 2;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 19;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i6] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.lastIndexOf("", '0') + 73, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i9++;
                }
                i5 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i6;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        int i12 = $11 + 93;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $11 + 29;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22251), 38 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77, (ViewConfiguration.getTapTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
