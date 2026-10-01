package org.bouncycastle.openssl.jcajce;

import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.openssl.PEMEncryptor;
import org.bouncycastle.openssl.PEMException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcePEMEncryptorBuilder {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = -656399258747650411L;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String algorithm;
    private JcaJceHelper helper = new DefaultJcaJceHelper();
    private SecureRandom random;

    public JcePEMEncryptorBuilder(String str) {
        this.algorithm = str;
    }

    static /* synthetic */ String access$000(JcePEMEncryptorBuilder jcePEMEncryptorBuilder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = jcePEMEncryptorBuilder.algorithm;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ JcaJceHelper access$100(JcePEMEncryptorBuilder jcePEMEncryptorBuilder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        JcaJceHelper jcaJceHelper = jcePEMEncryptorBuilder.helper;
        if (i3 != 0) {
            return jcaJceHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PEMEncryptor build(final char[] cArr) throws Throwable {
        int i = 2 % 2;
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        String str = this.algorithm;
        int i2 = 8;
        a(new char[]{46971, 46906, 21584, 4492, 14861, 45420, 9217, 62695}, 1 - View.getDefaultSize(0, 0), new Object[1]);
        if (!(!str.startsWith(((String) r7[0]).intern()))) {
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i2 = 16;
        }
        final byte[] bArr = new byte[i2];
        this.random.nextBytes(bArr);
        PEMEncryptor pEMEncryptor = new PEMEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.1
            @Override // org.bouncycastle.openssl.PEMEncryptor
            public byte[] encrypt(byte[] bArr2) throws PEMException {
                return PEMUtilities.crypt(true, JcePEMEncryptorBuilder.access$100(JcePEMEncryptorBuilder.this), bArr2, cArr, JcePEMEncryptorBuilder.access$000(JcePEMEncryptorBuilder.this), bArr);
            }

            @Override // org.bouncycastle.openssl.PEMEncryptor
            public String getAlgorithm() {
                return JcePEMEncryptorBuilder.access$000(JcePEMEncryptorBuilder.this);
            }

            @Override // org.bouncycastle.openssl.PEMEncryptor
            public byte[] getIV() {
                return bArr;
            }
        };
        int i5 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return pEMEncryptor;
    }

    public JcePEMEncryptorBuilder setProvider(String str) {
        int i = 2 % 2;
        this.helper = new NamedJcaJceHelper(str);
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return this;
    }

    public JcePEMEncryptorBuilder setProvider(Provider provider) {
        int i = 2 % 2;
        this.helper = new ProviderJcaJceHelper(provider);
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public JcePEMEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.random = secureRandom;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 111;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 45764), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 84, 21233 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getTapTimeout() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, View.combineMeasuredStates(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 55;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
