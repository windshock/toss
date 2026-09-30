package org.bouncycastle.jce.provider;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JCERSAPublicKey implements RSAPublicKey {
    static final long serialVersionUID = 2675817738516720772L;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 177;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 478309099;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s2 * 3;
        byte[] bArr = $$a;
        int i4 = s + 4;
        int i5 = (i * 2) + 105;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            int i8 = 0;
            int i9 = i4 + (-i7);
            i2 = i8;
            int i10 = i6;
            i5 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i11];
            int i12 = i5;
            i6 = i11;
            i4 = i12;
            int i92 = i4 + (-i7);
            i2 = i8;
            int i102 = i6;
            i5 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    JCERSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    JCERSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    JCERSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            org.bouncycastle.asn1.pkcs.RSAPublicKey rSAPublicKey = org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            this.modulus = rSAPublicKey.getModulus();
            this.publicExponent = rSAPublicKey.getPublicExponent();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    JCERSAPublicKey(RSAKeyParameters rSAKeyParameters) {
        this.modulus = rSAKeyParameters.getModulus();
        this.publicExponent = rSAKeyParameters.getExponent();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            int i4 = i2 + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        if (getModulus().equals(rSAPublicKey.getModulus())) {
            int i6 = onExtraCallback + 69;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            boolean zEquals = getPublicExponent().equals(rSAPublicKey.getPublicExponent());
            if (i7 == 0) {
                int i8 = 47 / 0;
                if (zEquals) {
                    return true;
                }
            } else if (zEquals) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(3 - Drawable.resolveOpacity(0, 0), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{65525, 7, 6}, true, KeyEvent.getDeadChar(0, 0) + 270, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return strIntern;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i = 2 % 2;
        byte[] encodedSubjectPublicKeyInfo = KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), (ASN1Encodable) new org.bouncycastle.asn1.pkcs.RSAPublicKey(getModulus(), getPublicExponent()));
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return encodedSubjectPublicKeyInfo;
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        BigInteger bigInteger = this.modulus;
        int i4 = i2 + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return bigInteger;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.publicExponent;
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return bigInteger;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BigInteger modulus = getModulus();
        if (i3 != 0) {
            return modulus.hashCode() ^ getPublicExponent().hashCode();
        }
        modulus.hashCode();
        getPublicExponent().hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        String strLineSeparator = Strings.lineSeparator();
        Object[] objArr = new Object[1];
        a(13 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, new char[]{23, 20, 14, 65483, 65526, 16, '$', 65533, 65534, 65516, 65483, 65531, ' ', '\r'}, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 279, objArr);
        stringBuffer.append(((String) objArr[0]).intern());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        String string = stringBuffer.toString();
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 113;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getPressedStateDuration() >> 16)), 22 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12842), 54 - MotionEvent.axisFromString(BuildConfig.FLAVOR), ((Process.getThreadPriority(0) + 20) >> 6) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), 16779383 + Color.rgb(0, 0, 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
