package im.toss.core.biometric;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tmoney.LiveCheckConstants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.Repeater;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RsaCipherProvider extends Repeater {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private static char[] IAuthTabCallback = {64978, 64995, 64993, 65016, 65014, 64992, 64989, 64898, 65010, 64924, 65009, 64986, 64981, 64980, 64983, 65008};
    private static char onNavigationEvent = 51245;

    public RsaCipherProvider(@NonNull Context context, @Nullable String str) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        this(context, str, true);
    }

    public RsaCipherProvider(@NonNull Context context, @Nullable String str, boolean z) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        super(context, str, z);
    }

    @Override // o.Repeater
    public Cipher IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{1, 6, 13839}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 52), 3 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(((String) objArr[0]).intern(), "AndroidKeyStore");
        keyPairGenerator.initialize(Repeater.onWarmupCompleted(this.onExtraCallbackWithResult, "ECB", "PKCS1Padding", this.onExtraCallback).build());
        keyPairGenerator.generateKeyPair();
        Object[] objArr2 = new Object[1];
        a(new char[]{1, 6, 13839}, (byte) (Drawable.resolveOpacity(0, 0) + 52), 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        KeyFactory keyFactory = KeyFactory.getInstance(((String) objArr2[0]).intern());
        Cipher cipherOnNavigationEvent = onNavigationEvent();
        onNavigationEvent(cipherOnNavigationEvent, 1, IAuthTabCallback(keyFactory, this.onWarmupCompleted));
        int i4 = asInterface + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cipherOnNavigationEvent;
    }

    public Cipher onExtraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Cipher cipherOnNavigationEvent = onNavigationEvent();
            onNavigationEvent(cipherOnNavigationEvent, 4, onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallbackWithResult));
            return cipherOnNavigationEvent;
        }
        Cipher cipherOnNavigationEvent2 = onNavigationEvent();
        onNavigationEvent(cipherOnNavigationEvent2, 2, onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallbackWithResult));
        return cipherOnNavigationEvent2;
    }

    private PrivateKey onWarmupCompleted(KeyStore keyStore, String str) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PrivateKey privateKey = (PrivateKey) keyStore.getKey(str, null);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return privateKey;
    }

    private PublicKey IAuthTabCallback(KeyFactory keyFactory, KeyStore keyStore) throws GeneralSecurityException {
        int i = 2 % 2;
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(keyStore.getCertificate(this.onExtraCallbackWithResult).getPublicKey().getEncoded()));
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return publicKeyGeneratePublic;
    }

    @Override // o.Repeater
    public Cipher onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{1, 6, '\t', '\n', 7, '\f', 11, '\n', 2, 0, '\r', 7, 5, 3, 2, '\f', 15, '\n', 5, 14}, (byte) (4 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackDefault + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cipher;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        int i4 = -1310771303;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (Process.myPid() >> 22) + 26, ExpandableListView.getPackedPositionGroup(0L) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $11 + 25;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 4 % 4;
                    }
                    i4 = -1310771303;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 26, (Process.myPid() >> 22) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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
                        int i10 = $10 + 109;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24872 - AndroidCharacter.getMirror('0')), 74 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 30 - Color.argb(0, 0, 0, 0), 19488 - View.MeasureSpec.getSize(0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
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
