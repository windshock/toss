package org.bouncycastle.crypto.kems;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RSAKeyEncapsulation implements KeyEncapsulation {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static final BigInteger ONE;
    private static final BigInteger ZERO;
    private static int asBinder = 1;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static char[] onWarmupCompleted;
    private DerivationFunction kdf;
    private RSAKeyParameters key;
    private SecureRandom rnd;

    static {
        onNavigationEvent();
        ZERO = BigInteger.valueOf(0L);
        ONE = BigInteger.valueOf(1L);
        int i = IAuthTabCallback + 51;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    public RSAKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
    }

    public CipherParameters decrypt(byte[] bArr, int i) throws DataLengthException, IllegalArgumentException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        asBinder = i3 % 128;
        CipherParameters cipherParametersDecrypt = decrypt(bArr, i3 % 2 == 0 ? 1 : 0, bArr.length, i);
        int i4 = asBinder + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cipherParametersDecrypt;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i, int i2, int i3) throws DataLengthException, IllegalArgumentException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 105;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            this.key.isPrivate();
            throw null;
        }
        if (!this.key.isPrivate()) {
            throw new IllegalArgumentException("Private key required for decryption");
        }
        BigInteger modulus = this.key.getModulus();
        BigInteger exponent = this.key.getExponent();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        KeyParameter keyParameterGenerateKey = generateKey(modulus, new BigInteger(1, bArr2).modPow(exponent, modulus), i3);
        int i6 = asBinder + 125;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return keyParameterGenerateKey;
        }
        throw null;
    }

    public CipherParameters encrypt(byte[] bArr, int i) throws DataLengthException, IllegalArgumentException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        CipherParameters cipherParametersEncrypt = encrypt(bArr, 0, i);
        int i5 = IAuthTabCallbackStub + 87;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return cipherParametersEncrypt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = 2 % 2;
        if (this.key.isPrivate()) {
            throw new IllegalArgumentException("Public key required for encryption");
        }
        int i4 = asBinder + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        BigInteger modulus = this.key.getModulus();
        BigInteger exponent = this.key.getExponent();
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(ZERO, modulus.subtract(ONE), this.rnd);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((modulus.bitLength() + 7) / 8, bigIntegerCreateRandomInRange.modPow(exponent, modulus));
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, i, bArrAsUnsignedByteArray.length);
        KeyParameter keyParameterGenerateKey = generateKey(modulus, bigIntegerCreateRandomInRange, i2);
        int i6 = asBinder + 45;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return keyParameterGenerateKey;
    }

    protected KeyParameter generateKey(BigInteger bigInteger, BigInteger bigInteger2, int i) throws DataLengthException, IllegalArgumentException {
        int i2 = 2 % 2;
        Object obj = null;
        this.kdf.init(new KDFParameters(BigIntegers.asUnsignedByteArray((bigInteger.bitLength() + 7) / 8, bigInteger2), null));
        byte[] bArr = new byte[i];
        this.kdf.generateBytes(bArr, 0, i);
        KeyParameter keyParameter = new KeyParameter(bArr);
        int i3 = IAuthTabCallbackStub + 49;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return keyParameter;
        }
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = cipherParameters instanceof RSAKeyParameters;
            obj.hashCode();
            throw null;
        }
        if (!(cipherParameters instanceof RSAKeyParameters)) {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.SECURITY_ATTR_COMPACT, -122, -120, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -122, -120, -124, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i4 = i3 + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.key = (RSAKeyParameters) cipherParameters;
        if (i5 != 0) {
            int i6 = 91 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 77, 20952 - ExpandableListView.getPackedPositionType(j), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 75, 16038 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (!onExtraCallback) {
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 16777279 + Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i5 = $11 + 1;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 63, 12214 - ((Process.getThreadPriority(0) + 20) >> 6), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i4 = 1052772399;
        }
        String str = new String(cArr2);
        int i8 = $11 + 87;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 57 / 0;
            objArr[0] = str;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32451, 32450, 32476, 32445, 32490, 32496, 32484, 32483, 32492, 32480, 32500, 32497};
        onExtraCallbackWithResult = -1184334179;
        onNavigationEvent = true;
        onExtraCallback = true;
    }
}
