package org.bouncycastle.pqc.jcajce.provider;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.onVideoError;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BouncyCastlePQCProvider extends Provider implements ConfigurableProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] ALGORITHMS;
    private static final String ALGORITHM_PACKAGE = "org.bouncycastle.pqc.jcajce.provider.";
    public static final ProviderConfiguration CONFIGURATION = null;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static String PROVIDER_NAME = "BCPQC";
    private static int asBinder = 1;
    private static String info;
    private static final Map keyInfoConverters;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{28098, 21746, 22802, 5143, 1455, 10691, 42192, 40099, 22043, 60096, 42802, 3694, 25914, 54438, 34651, 40394, 5827, 21745, 52837, 29846, 39361, 42081, 10826, 61871, 50622, 5510, 3924, 27270, 43811, 7328, 54488, 11943, 14288, 20132, 25914, 54438, 49473, 13284, 29625, 8916, 55057, 6852, 55933, 'w', 64175, 61698, 42378, 38789, 26452, 34323}, (Process.myPid() >> 22) + 49, objArr);
        info = ((String) objArr[0]).intern();
        keyInfoConverters = new HashMap();
        ALGORITHMS = new String[]{"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};
        int i = IAuthTabCallbackStub + 7;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.7d, info);
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.1
            @Override // java.security.PrivilegedAction
            public Object run() throws ClassNotFoundException {
                BouncyCastlePQCProvider.access$000(BouncyCastlePQCProvider.this);
                return null;
            }
        });
    }

    static /* synthetic */ void access$000(BouncyCastlePQCProvider bouncyCastlePQCProvider) throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        bouncyCastlePQCProvider.setup();
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 49;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = keyInfoConverters;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        int i = 2 % 2;
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            int i2 = asBinder + 45;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        PrivateKey privateKeyGeneratePrivate = asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
        int i3 = asBinder + 117;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return privateKeyGeneratePrivate;
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            obj.hashCode();
            throw null;
        }
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            int i3 = IAuthTabCallbackDefault + 1;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        PublicKey publicKeyGeneratePublic = asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
        int i5 = IAuthTabCallbackDefault + 5;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return publicKeyGeneratePublic;
        }
        obj.hashCode();
        throw null;
    }

    private void loadAlgorithms(String str, String[] strArr) throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i2 + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 2;
        }
        for (int i6 = i3 % 2 != 0 ? 1 : 0; i6 != strArr.length; i6++) {
            Class clsLoadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i6] + "$Mappings");
            if (clsLoadClass != null) {
                int i7 = IAuthTabCallbackDefault + 113;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        ((AlgorithmProvider) clsLoadClass.newInstance()).configure(this);
                        int i8 = 62 / 0;
                    } catch (Exception e) {
                        throw new InternalError("cannot create instance of " + str + strArr[i6] + "$Mappings : " + e);
                    }
                } else {
                    ((AlgorithmProvider) clsLoadClass.newInstance()).configure(this);
                }
            }
        }
    }

    static Class loadClass(Class cls, final String str) throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asBinder = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                cls.getClassLoader();
                obj.hashCode();
                throw null;
            }
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader == null) {
                return (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            return Class.forName(str);
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
            }
            int i3 = IAuthTabCallbackDefault + 119;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return classLoader.loadClass(str);
            }
            Class<?> clsLoadClass = classLoader.loadClass(str);
            int i4 = 31 / 0;
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private void setup() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
            throw null;
        }
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
        int i3 = IAuthTabCallbackDefault + 85;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void addAlgorithm(String str, String str2) {
        int i = 2 % 2;
        if (containsKey(str)) {
            throw new IllegalStateException("duplicate provider key (" + str + ") found");
        }
        int i2 = IAuthTabCallbackDefault + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        put(str, str2);
        int i4 = asBinder + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        int i = 2 % 2;
        if (!containsKey(str + onVideoError.onExtraCallbackWithResult + str2)) {
            throw new IllegalStateException("primary key (" + str + onVideoError.onExtraCallbackWithResult + str2 + ") not found");
        }
        addAlgorithm(str + onVideoError.onExtraCallbackWithResult + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + ".OID." + aSN1ObjectIdentifier, str2);
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public void addAttributes(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
            int i4 = IAuthTabCallbackDefault + 75;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) keyInfoConverters.get(aSN1ObjectIdentifier);
        if (i3 != 0) {
            return asymmetricKeyInfoConverter;
        }
        throw null;
    }

    public boolean hasAlgorithm(String str, String str2) {
        int i = 2 % 2;
        if (!containsKey(str + onVideoError.onExtraCallbackWithResult + str2)) {
            if (!containsKey("Alg.Alias." + str + onVideoError.onExtraCallbackWithResult + str2)) {
                int i2 = IAuthTabCallbackDefault + 65;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = IAuthTabCallbackDefault + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 41;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)));
                        int deadChar = 10 - KeyEvent.getDeadChar(i3, i3);
                        int scrollBarSize = 12434 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, deadChar, scrollBarSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, 12434 - KeyEvent.getDeadChar(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i12 = $10 + 29;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16013), View.resolveSize(0, 0) + 14, 19901 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 35155;
        onExtraCallback = (char) 53053;
        onWarmupCompleted = (char) 13475;
        IAuthTabCallback = (char) 44066;
    }
}
