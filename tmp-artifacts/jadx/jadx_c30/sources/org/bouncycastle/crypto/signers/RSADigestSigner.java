package org.bouncycastle.crypto.signers;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RSADigestSigner implements Signer {
    private static char[] IAuthTabCallback;
    private static final Hashtable oidMap;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private final AlgorithmIdentifier algId;
    private final Digest digest;
    private boolean forSigning;
    private final AsymmetricBlockCipher rsaEngine;
    private static final byte[] $$a = {120, 65, 99, 57};
    private static final int $$b = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 97 - (i * 2);
        int i6 = i3 * 4;
        int i7 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i7;
            int i10 = 0;
            i5 = (-i5) + i7;
            i7 = i9 + 1;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i7];
            int i11 = i7;
            i7 = i5;
            i5 = b;
            i9 = i11;
            i5 = (-i5) + i7;
            i7 = i9 + 1;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        onNavigationEvent();
        Hashtable hashtable = new Hashtable();
        oidMap = hashtable;
        hashtable.put("RIPEMD128", TeleTrusTObjectIdentifiers.ripemd128);
        hashtable.put("RIPEMD160", TeleTrusTObjectIdentifiers.ripemd160);
        hashtable.put("RIPEMD256", TeleTrusTObjectIdentifiers.ripemd256);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, X509ObjectIdentifiers.id_SHA1);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, NISTObjectIdentifiers.id_sha224);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA256, NISTObjectIdentifiers.id_sha256);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, NISTObjectIdentifiers.id_sha384);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA512, NISTObjectIdentifiers.id_sha512);
        hashtable.put("SHA-512/224", NISTObjectIdentifiers.id_sha512_224);
        hashtable.put("SHA-512/256", NISTObjectIdentifiers.id_sha512_256);
        hashtable.put("SHA3-224", NISTObjectIdentifiers.id_sha3_224);
        hashtable.put(SPHINCS256KeyGenParameterSpec.SHA3_256, NISTObjectIdentifiers.id_sha3_256);
        hashtable.put("SHA3-384", NISTObjectIdentifiers.id_sha3_384);
        hashtable.put("SHA3-512", NISTObjectIdentifiers.id_sha3_512);
        hashtable.put("MD2", PKCSObjectIdentifiers.md2);
        hashtable.put("MD4", PKCSObjectIdentifiers.md4);
        hashtable.put("MD5", PKCSObjectIdentifiers.md5);
        int i = onExtraCallbackWithResult + 101;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public RSADigestSigner(Digest digest) {
        this(digest, (ASN1ObjectIdentifier) oidMap.get(digest.getAlgorithmName()));
    }

    public RSADigestSigner(Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AlgorithmIdentifier algorithmIdentifier;
        this.rsaEngine = new PKCS1Encoding(new RSABlindedEngine());
        this.digest = digest;
        if (aSN1ObjectIdentifier != null) {
            algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
            int i = onExtraCallback + 49;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            int i3 = onExtraCallback + 21;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            algorithmIdentifier = null;
        }
        this.algId = algorithmIdentifier;
    }

    private byte[] derEncode(byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AlgorithmIdentifier algorithmIdentifier = this.algId;
        if (algorithmIdentifier != null) {
            byte[] encoded = new DigestInfo(algorithmIdentifier, bArr).getEncoded(ASN1Encoding.DER);
            int i4 = IAuthTabCallbackStub + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return encoded;
        }
        try {
            DigestInfo.getInstance(bArr);
            int i6 = onExtraCallback + 85;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new IOException("malformed DigestInfo for NONEwithRSA hash: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws Throwable {
        byte[] bArrProcessBlock;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!this.forSigning) {
            Object[] objArr = new Object[1];
            a(Process.myTid() >> 22, 58 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (10702 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i5 = i2 + 101;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        int digestSize = this.digest.getDigestSize();
        try {
            if (i6 == 0) {
                byte[] bArr = new byte[digestSize];
                this.digest.doFinal(bArr, 1);
                byte[] bArrDerEncode = derEncode(bArr);
                bArrProcessBlock = this.rsaEngine.processBlock(bArrDerEncode, 0, bArrDerEncode.length);
            } else {
                byte[] bArr2 = new byte[digestSize];
                this.digest.doFinal(bArr2, 0);
                byte[] bArrDerEncode2 = derEncode(bArr2);
                bArrProcessBlock = this.rsaEngine.processBlock(bArrDerEncode2, 0, bArrDerEncode2.length);
            }
            return bArrProcessBlock;
        } catch (IOException e) {
            throw new CryptoException("unable to encode signature: " + e.getMessage(), e);
        }
    }

    public String getAlgorithmName() {
        int i = 2 % 2;
        String str = this.digest.getAlgorithmName() + "withRSA";
        int i2 = onExtraCallback + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        AsymmetricKeyParameter parameters;
        int i = 2 % 2;
        this.forSigning = z;
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            parameters = (AsymmetricKeyParameter) cipherParameters;
            int i2 = IAuthTabCallbackStub + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            parameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (z) {
            int i4 = IAuthTabCallbackStub + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!parameters.isPrivate()) {
                throw new IllegalArgumentException("signing requires private key");
            }
        }
        if (!z && parameters.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        reset();
        this.rsaEngine.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.digest.reset();
        int i4 = onExtraCallback + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.digest.update(b);
            int i3 = 14 / 0;
        } else {
            this.digest.update(b);
        }
        int i4 = onExtraCallback + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            this.digest.update(bArr, i, i2);
            throw null;
        }
        this.digest.update(bArr, i, i2);
        int i5 = onExtraCallback + 37;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) throws Throwable {
        byte[] bArrProcessBlock;
        byte[] bArrDerEncode;
        int i = 2 % 2;
        if (this.forSigning) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 57, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, (char) (32117 - (Process.myPid() >> 22)), objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i2 = onExtraCallback + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        try {
            bArrProcessBlock = this.rsaEngine.processBlock(bArr, 0, bArr.length);
            bArrDerEncode = derEncode(bArr2);
        } catch (Exception unused) {
        }
        if (bArrProcessBlock.length == bArrDerEncode.length) {
            return Arrays.constantTimeAreEqual(bArrProcessBlock, bArrDerEncode);
        }
        if (bArrProcessBlock.length != bArrDerEncode.length - 2) {
            Arrays.constantTimeAreEqual(bArrDerEncode, bArrDerEncode);
            return false;
        }
        int length = (bArrProcessBlock.length - digestSize) - 2;
        int length2 = bArrDerEncode.length;
        bArrDerEncode[1] = (byte) (bArrDerEncode[1] - 2);
        bArrDerEncode[3] = (byte) (bArrDerEncode[3] - 2);
        int i4 = 0;
        for (int i5 = 0; i5 < digestSize; i5++) {
            i4 |= bArrProcessBlock[length + i5] ^ bArrDerEncode[((length2 - digestSize) - 2) + i5];
        }
        int i6 = IAuthTabCallbackStub + 27;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = IAuthTabCallbackStub + 53;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i4 |= bArrProcessBlock[i8] ^ bArrDerEncode[i8];
        }
        if (i4 != 0) {
            return false;
        }
        int i11 = IAuthTabCallbackStub + 37;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 95;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 59697), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, ExpandableListView.getPackedPositionGroup(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49123), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1494 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), Gravity.getAbsoluteGravity(0, 0) + 44, 1494 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{50248, 13437, 9267, 5314, 1187, 30073, 25927, 21765, 17870, 46493, 42619, 38465, 34308, 63195, 59056, 55094, 50996, 14081, 10182, 6118, 'c', 28720, 24587, 20674, 16531, 45423, 41278, 37135, 33241, 61851, 57958, 53878, 49916, 12993, 8832, 4902, 825, 29687, 25541, 21400, 19547, 48186, 44263, 40148, 35983, 64798, 60709, 56819, 52660, 15755, 11840, 7719, 3838, 32439, 28301, 24408, 20308, 37107, 24774, 28808, 16505, 20504, 8642, 12796, 446, 4469, 57638, 62144, 49914, 53951, 41568, 45579, 33677, 37775, 25530, 29565, 17245, 21720, 9355, 13488, 1145, 5160, 58836, 62853, 50612, 54626, 42272, 46813, 34509, 38471, 26234, 30267, 18333, 22407, 10048, 14187, 1828, 6375, 59548, 63562, 51324, 55333, 43500, 47510, 35139};
        onWarmupCompleted = -3260825235307422240L;
    }
}
