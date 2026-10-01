package com.tmoney.utils;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.security.KeyPairGeneratorSpec;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class CryptoByKeyStore {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ALIAS = "TMONEY_KEY_STORE";
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    private static final String TAG = "CryptoByKeyStore";
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private static char[] onNavigationEvent = {64989, 64993, 65008, 65014, 65009, 65010, 64986, 64898, 64980, 64983, 64995, 65016, 64988, 64978, 64992, 64924};
    private static char IAuthTabCallback = 51245;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1
      0x0032: PHI (r1v5 java.security.KeyStore) = (r1v4 java.security.KeyStore), (r1v7 java.security.KeyStore) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static KeyStore.Entry create(Context context) throws Throwable {
        KeyStore keyStore;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
            keyStore.load(null);
            int i3 = 94 / 0;
            if (!keyStore.containsAlias(ALIAS)) {
                Object[] objArr = new Object[1];
                a(new char[]{2, '\r', 13886}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 99), (ViewConfiguration.getPressedStateDuration() >> 16) + 3, objArr);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(((String) objArr[0]).intern(), ANDROID_KEY_STORE);
                Locale locale = Locale.KOREAN;
                Calendar calendar = Calendar.getInstance(locale);
                Calendar calendar2 = Calendar.getInstance(locale);
                calendar2.add(1, 1);
                keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias(ALIAS).setSubject(new X500Principal("CN=TMONEY_KEY_STORE")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
                keyPairGenerator.generateKeyPair();
                int i4 = onWarmupCompleted + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
            keyStore.load(null);
            if (!keyStore.containsAlias(ALIAS)) {
            }
        }
        return keyStore.getEntry(ALIAS, null);
    }

    public static String decrypt(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry(ALIAS, null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                return "";
            }
            String str2 = new String(decryptUsingKey(((KeyStore.PrivateKeyEntry) entry).getPrivateKey(), Base64.decode(str.getBytes("UTF-8"), 0)));
            int i4 = onExtraCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        } catch (Exception e) {
            LogHelper.d(TAG, "decrypt::" + e.getMessage());
            return "";
        }
    }

    private static byte[] decryptUsingKey(PrivateKey privateKey, byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{2, '\r', 7, '\r', 0, 3, 7, '\f', 11, '\b', 6, 2, 6, 11, 1, '\r', '\n', 5, 4, '\f'}, (byte) (65 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(2, privateKey);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return bArrDoFinal;
    }

    public static String encrypt(Context context, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            KeyStore.Entry entryCreate = create(context);
            if (!(entryCreate instanceof KeyStore.PrivateKeyEntry)) {
                return "";
            }
            String str2 = new String(Base64.encode(encryptUsingKey(((KeyStore.PrivateKeyEntry) entryCreate).getCertificate().getPublicKey(), str.getBytes("UTF-8")), 0));
            int i4 = onWarmupCompleted + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            LogHelper.d(TAG, "encrypt::" + e.getMessage());
            return "";
        }
    }

    private static byte[] encryptUsingKey(PublicKey publicKey, byte[] bArr) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{2, '\r', 7, '\r', 0, 3, 7, '\f', 11, '\b', 6, 2, 6, 11, 1, '\r', '\n', 5, 4, '\f'}, (byte) (16 / (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1))), 101 >>> (ViewConfiguration.getLongPressTimeout() * 29), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{2, '\r', 7, '\r', 0, 3, 7, '\f', 11, '\b', 6, 2, 6, 11, 1, '\r', '\n', 5, 4, '\f'}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 64), 20 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            obj = objArr2[0];
        }
        Cipher cipher = Cipher.getInstance(((String) obj).intern());
        cipher.init(1, publicKey);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return bArrDoFinal;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onNavigationEvent;
        int i4 = 9;
        if (cArr3 != null) {
            int i5 = $10 + 45;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + i4;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), KeyEvent.normalizeMetaState(0) + 26, 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 9;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 26 - TextUtils.getOffsetBefore("", 0), 23139 - View.resolveSize(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i11 = $10 + 37;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i13 = $10 + 25;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 24776), 74 - View.combineMeasuredStates(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, 19488 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i17];
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i19];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
