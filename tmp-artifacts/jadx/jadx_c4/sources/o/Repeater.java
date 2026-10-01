package o;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class Repeater {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final boolean onExtraCallback;
    public final String onExtraCallbackWithResult;
    public final KeyStore onWarmupCompleted;

    protected abstract Cipher IAuthTabCallback() throws GeneralSecurityException, IOException;

    protected abstract Cipher onNavigationEvent() throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException;

    public Repeater(@NonNull Context context, @Nullable String str, boolean z) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (str == null) {
            this.onExtraCallbackWithResult = RoundedCorners.onWarmupCompleted(context) + ".rxfingerprint_default";
            int i = onNavigationEvent + 25;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        } else {
            this.onExtraCallbackWithResult = str;
            int i3 = IAuthTabCallback + 35;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
            }
            this.onExtraCallback = z;
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.onWarmupCompleted = keyStore;
            keyStore.load(null);
        }
        int i4 = 2 % 2;
        this.onExtraCallback = z;
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        this.onWarmupCompleted = keyStore2;
        keyStore2.load(null);
    }

    public void onNavigationEvent(Cipher cipher, int i, Key key) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(cipher, i, key, null);
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    void onExtraCallback(Cipher cipher, int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Provider provider = null;
        try {
            Provider provider2 = Security.getProvider("Initech");
            if (provider2 != null) {
                try {
                    Security.removeProvider(provider2.getName());
                } catch (Throwable th) {
                    th = th;
                    provider = provider2;
                    if (provider != null) {
                        int i5 = onNavigationEvent + 73;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            Security.addProvider(provider);
                            int i6 = 17 / 0;
                        } else {
                            Security.addProvider(provider);
                        }
                    }
                    throw th;
                }
            }
            cipher.init(i, key, algorithmParameterSpec);
            if (provider2 != null) {
                int i7 = onNavigationEvent + 89;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    Security.addProvider(provider2);
                } else {
                    Security.addProvider(provider2);
                    provider.hashCode();
                    throw null;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static KeyGenParameterSpec.Builder onWarmupCompleted(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(str2).setUserAuthenticationRequired(true).setEncryptionPaddings(str3);
        encryptionPaddings.setInvalidatedByBiometricEnrollment(z);
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return encryptionPaddings;
    }

    Cipher onWarmupCompleted() throws GeneralSecurityException, IOException {
        Cipher cipherIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                cipherIAuthTabCallback = IAuthTabCallback();
                int i3 = 81 / 0;
            } else {
                cipherIAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return cipherIAuthTabCallback;
        } catch (KeyPermanentlyInvalidatedException unused) {
            onNavigationEvent(this.onExtraCallbackWithResult);
            return IAuthTabCallback();
        }
    }

    Exception onExtraCallback(Exception exc) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallback || Build.VERSION.SDK_INT != 26) {
            return exc;
        }
        int i4 = onNavigationEvent;
        int i5 = i4 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (!(exc instanceof IllegalBlockSizeException)) {
            return exc;
        }
        int i7 = i4 + 125;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            onNavigationEvent(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(this.onExtraCallbackWithResult);
        KeyPermanentlyInvalidatedException keyPermanentlyInvalidatedException = new KeyPermanentlyInvalidatedException();
        int i8 = onNavigationEvent + 61;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return keyPermanentlyInvalidatedException;
    }

    private static void onNavigationEvent(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback(str)) {
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                keyStore.deleteEntry(str);
            } else {
                KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                keyStore2.load(null);
                keyStore2.deleteEntry(str);
                throw null;
            }
        }
    }

    static boolean IAuthTabCallback(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        int i = 2 % 2;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        Object obj = null;
        keyStore.load(null);
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 72 / 0;
                if (str.equals(enumerationAliases.nextElement())) {
                    int i4 = onNavigationEvent + 113;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            } else if (str.equals(enumerationAliases.nextElement())) {
                int i42 = onNavigationEvent + 113;
                IAuthTabCallback = i42 % 128;
                int i52 = i42 % 2;
                return true;
            }
        }
        int i6 = IAuthTabCallback + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }
}
