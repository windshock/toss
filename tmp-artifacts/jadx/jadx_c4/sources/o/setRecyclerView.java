package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.TossApplication;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.security.auth.x500.X500Principal;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setRecyclerView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 57131;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 49354;
    private static char onNavigationEvent = 42691;
    private static char onWarmupCompleted = 12525;

    public static String IAuthTabCallback(Context context, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strEncodeToString = Base64.encodeToString(onWarmupCompleted(context, str, 1, str3).doFinal(str2.getBytes()), 2);
            int i4 = asInterface + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strEncodeToString;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i6 | i)) | i4;
        int i8 = (~((~i) | i6)) | i4;
        int i9 = (~i4) | i6;
        int i10 = i4 + i6 + i3 + (440753341 * i5) + ((-634449194) * i2);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i4) + 1075183616 + ((-1421434046) * i6) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i3) + (780402688 * i5) + ((-180879360) * i2) + (353763328 * i11);
        int i13 = (i4 * 892202253) + 1676176333 + (i6 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i3 * 892200819) + (i5 * (-770690073)) + (i2 * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    protected static SecretKey onExtraCallback(Context context, String str) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{58447, 6170, 33792, 30442}, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        int i2 = asInterface + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return secretKeyGenerateKey;
        }
        throw null;
    }

    public static void onExtraCallback(Context context, String str, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                ((Boolean) onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{context, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1217161195, TossApplication.onSessionEnded.onExtraCallback(), -1217161194)).booleanValue();
                throw null;
            }
            if (((Boolean) onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{context, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1217161195, TossApplication.onSessionEnded.onExtraCallback(), -1217161194)).booleanValue()) {
                return;
            }
            if (i != 1) {
                int i4 = asInterface + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i != 2) {
                    onExtraCallback(context, str);
                    return;
                }
            }
            onWarmupCompleted(context, str);
        } catch (Exception unused) {
        }
    }

    public static String onExtraCallbackWithResult(Context context, String str, String str2, String str3) {
        int i = 2 % 2;
        try {
            String str4 = new String(onWarmupCompleted(context, str, 2, str3).doFinal(Base64.decode(str2, 2)));
            int i2 = onExtraCallback + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str4;
        } catch (Exception unused) {
            return "";
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!(!keyStore.isKeyEntry(str))) {
                String algorithm = keyStore.getKey(str, null).getAlgorithm();
                Object[] objArr2 = new Object[1];
                a(new char[]{27815, 9196, 38856, 59411}, TextUtils.lastIndexOf("", '0', 0, 0) + 4, objArr2);
                if (algorithm.equalsIgnoreCase(((String) objArr2[0]).intern())) {
                    int i4 = onExtraCallback + 37;
                    asInterface = i4 % 128;
                    return Boolean.valueOf(i4 % 2 != 0);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String onNavigationEvent(Context context, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.isKeyEntry(str)) {
                return "";
            }
            int i4 = asInterface + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                keyStore.getCertificate(str).getPublicKey();
                throw null;
            }
            PublicKey publicKey = keyStore.getCertificate(str).getPublicKey();
            if (publicKey == null) {
                return "";
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArrOnWarmupCompleted = onWarmupCompleted(rSAPublicKey.getModulus());
            byte[] bArrOnWarmupCompleted2 = onWarmupCompleted(rSAPublicKey.getPublicExponent());
            byteArrayOutputStream.write(new byte[]{48, -126, 1, 10, 2, -126, 1, 1, 0});
            byteArrayOutputStream.write(bArrOnWarmupCompleted);
            byteArrayOutputStream.write(bArrOnWarmupCompleted2, 0, bArrOnWarmupCompleted2.length - 3);
            byteArrayOutputStream.write(new byte[]{2, 3, 1, 0, 1});
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: Exception -> 0x00bb, TryCatch #0 {Exception -> 0x00bb, blocks: (B:3:0x0005, B:9:0x002d, B:16:0x0042, B:21:0x0058, B:17:0x0049, B:20:0x0052, B:12:0x0033, B:23:0x0085), top: B:27:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String onNavigationEvent(String str, String str2, int i) throws Throwable {
        KeyStore.Entry entry;
        PrivateKey privateKey;
        int i2 = 2 % 2;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.isKeyEntry(str)) {
                int i3 = asInterface + 81;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                if (i != 1) {
                    PublicKey publicKey = keyStore.getCertificate(str).getPublicKey();
                    Object[] objArr = new Object[1];
                    a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21, objArr);
                    Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
                    cipher.init(1, publicKey);
                    return Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2);
                }
                int i6 = i4 + 57;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        int i7 = onExtraCallback + 119;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        privateKey = (PrivateKey) keyStore.getKey(str, null);
                    } else {
                        entry = keyStore.getEntry(str, null);
                        if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                        }
                    }
                    Object[] objArr2 = new Object[1];
                    a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                    Cipher cipher2 = Cipher.getInstance(((String) objArr2[0]).intern());
                    cipher2.init(1, privateKey);
                    return Base64.encodeToString(cipher2.doFinal(str2.getBytes()), 2);
                }
                if (Build.VERSION.SDK_INT >= 4) {
                    int i72 = onExtraCallback + 119;
                    asInterface = i72 % 128;
                    int i82 = i72 % 2;
                    privateKey = (PrivateKey) keyStore.getKey(str, null);
                    Object[] objArr22 = new Object[1];
                    a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr22);
                    Cipher cipher22 = Cipher.getInstance(((String) objArr22[0]).intern());
                    cipher22.init(1, privateKey);
                    return Base64.encodeToString(cipher22.doFinal(str2.getBytes()), 2);
                }
                entry = keyStore.getEntry(str, null);
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    privateKey = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                    Object[] objArr222 = new Object[1];
                    a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr222);
                    Cipher cipher222 = Cipher.getInstance(((String) objArr222[0]).intern());
                    cipher222.init(1, privateKey);
                    return Base64.encodeToString(cipher222.doFinal(str2.getBytes()), 2);
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: Exception -> 0x00dd, TryCatch #0 {Exception -> 0x00dd, blocks: (B:4:0x0025, B:10:0x0041, B:15:0x004e, B:20:0x0065, B:16:0x0055, B:19:0x005f, B:13:0x0048, B:22:0x0096, B:24:0x00cf), top: B:30:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        KeyStore.Entry entry;
        PrivateKey privateKey;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.isKeyEntry(str);
            obj.hashCode();
            throw null;
        }
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        if (keyStore2.isKeyEntry(str)) {
            if (iIntValue != 1) {
                PublicKey publicKey = keyStore2.getCertificate(str).getPublicKey();
                Object[] objArr2 = new Object[1];
                a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, 20 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                Cipher cipher = Cipher.getInstance(((String) objArr2[0]).intern());
                cipher.init(2, publicKey);
                return new String(cipher.doFinal(Base64.decode(str2, 2)), "UTF-8");
            }
            int i3 = onExtraCallback + 47;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                if (Build.VERSION.SDK_INT >= 28) {
                    privateKey = (PrivateKey) keyStore2.getKey(str, null);
                } else {
                    entry = keyStore2.getEntry(str, null);
                    if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    }
                }
                Object[] objArr3 = new Object[1];
                a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, TextUtils.lastIndexOf("", '0', 0, 0) + 21, objArr3);
                Cipher cipher2 = Cipher.getInstance(((String) objArr3[0]).intern());
                cipher2.init(2, privateKey);
                return new String(cipher2.doFinal(Base64.decode(str2, 2)), "UTF-8");
            }
            if (Build.VERSION.SDK_INT >= 54) {
                privateKey = (PrivateKey) keyStore2.getKey(str, null);
                Object[] objArr32 = new Object[1];
                a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, TextUtils.lastIndexOf("", '0', 0, 0) + 21, objArr32);
                Cipher cipher22 = Cipher.getInstance(((String) objArr32[0]).intern());
                cipher22.init(2, privateKey);
                return new String(cipher22.doFinal(Base64.decode(str2, 2)), "UTF-8");
            }
            entry = keyStore2.getEntry(str, null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                privateKey = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                Object[] objArr322 = new Object[1];
                a(new char[]{27815, 9196, 1839, 37421, 28058, 17833, 1618, 39334, 40633, 51063, 11572, 26155, 17488, 16482, 3093, 53896, 36054, 17155, 51230, 60460}, TextUtils.lastIndexOf("", '0', 0, 0) + 21, objArr322);
                Cipher cipher222 = Cipher.getInstance(((String) objArr322[0]).intern());
                cipher222.init(2, privateKey);
                return new String(cipher222.doFinal(Base64.decode(str2, 2)), "UTF-8");
            }
        }
        int i4 = onExtraCallback + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    public static String onWarmupCompleted(Context context, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (((Boolean) onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{context, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1217161195, TossApplication.onSessionEnded.onExtraCallback(), -1217161194)).booleanValue()) {
                int i4 = onExtraCallback + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return onNavigationEvent(context, str);
            }
            Object[] objArr = new Object[1];
            a(new char[]{27815, 9196, 38856, 59411}, Color.rgb(0, 0, 0) + 16777219, objArr);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 3);
            keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal(String.format("CN=%s, OU=%s", "SSenStone_OTAC", str))).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            if (keyPairGenerateKeyPair == null) {
                return "";
            }
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArrOnWarmupCompleted = onWarmupCompleted(rSAPublicKey.getModulus());
            byte[] bArrOnWarmupCompleted2 = onWarmupCompleted(rSAPublicKey.getPublicExponent());
            byteArrayOutputStream.write(new byte[]{48, -126, 1, 10, 2, -126, 1, 1, 0});
            byteArrayOutputStream.write(bArrOnWarmupCompleted);
            byteArrayOutputStream.write(bArrOnWarmupCompleted2, 0, bArrOnWarmupCompleted2.length - 3);
            byteArrayOutputStream.write(new byte[]{2, 3, 1, 0, 1});
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            int i6 = asInterface + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return strEncodeToString;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return "";
        }
    }

    protected static Cipher onWarmupCompleted(Context context, String str, int i, String str2) throws Throwable {
        KeyStore keyStore;
        int i2 = 2 % 2;
        int i3 = asInterface + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Cipher cipher = null;
        try {
            keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
        } catch (Exception unused) {
        }
        if (i != 1) {
            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
            Object[] objArr = new Object[1];
            a(new char[]{58447, 6170, 14987, 45590, 8980, 27357, 37081, 6682, 40633, 51063, 11572, 26155, 48889, 41333, 3093, 53896, 36054, 17155, 51230, 60460}, 19 - Process.getGidForName(""), objArr);
            cipher = Cipher.getInstance(((String) objArr[0]).intern());
            cipher.init(2, secretKey, new IvParameterSpec(Base64.decode(str2, 2)));
            int i5 = asInterface + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return cipher;
        }
        SecretKey secretKey2 = (SecretKey) keyStore.getKey(str, null);
        Object[] objArr2 = new Object[1];
        a(new char[]{58447, 6170, 14987, 45590, 8980, 27357, 37081, 6682, 40633, 51063, 11572, 26155, 48889, 41333, 3093, 53896, 36054, 17155, 51230, 60460}, (ViewConfiguration.getPressedStateDuration() >> 16) + 20, objArr2);
        Cipher cipher2 = Cipher.getInstance(((String) objArr2[0]).intern());
        cipher2.init(1, secretKey2);
        shouldMeasureChild.onNavigationEvent(context, str + "_iv", Base64.encodeToString(cipher2.getIV(), 2));
        return cipher2;
    }

    protected static byte[] onWarmupCompleted(BigInteger bigInteger) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        byte[] byteArray = bigInteger.toByteArray();
        if (i3 != 0 ? byteArray[0] == 0 : byteArray[1] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        int i4 = onExtraCallback + 53;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return byteArray;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (true) {
            Object obj = null;
            if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i3 = $11 + 25;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i9 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 10 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionType(0L) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, 19900 - ImageFormat.getBitsPerPixel(0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 119;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static String onExtraCallback(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        return (String) onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 832425670, TossApplication.onSessionEnded.onExtraCallback(), -832425670);
    }

    protected static boolean onExtraCallbackWithResult(Context context, String str) {
        return ((Boolean) onExtraCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{context, str}, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1217161195, TossApplication.onSessionEnded.onExtraCallback(), -1217161194)).booleanValue();
    }
}
