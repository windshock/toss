package org.bouncycastle.crypto.util;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class OpenSSHPrivateKeyUtil {
    private static int $10 = 0;
    private static int $11 = 1;
    static final byte[] AUTH_MAGIC;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static boolean onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onWarmupCompleted;

    static {
        IAuthTabCallback();
        AUTH_MAGIC = Strings.toByteArray("openssh-key-v1\u0000");
        int i = onExtraCallbackWithResult + 77;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private OpenSSHPrivateKeyUtil() {
    }

    private static boolean allIntegers(ASN1Sequence aSN1Sequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < aSN1Sequence.size(); i4++) {
            if (!(aSN1Sequence.getObjectAt(i4) instanceof ASN1Integer)) {
                int i5 = IAuthTabCallbackStub + 117;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r3 = r3 + 81;
        org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.IAuthTabCallbackStub = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(r12).parsePrivateKey().toASN1Primitive().getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if ((!(r12 instanceof org.bouncycastle.crypto.params.ECPrivateKeyParameters)) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r1 = r1 + 83;
        org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.asBinder = r1 % 128;
        r1 = r1 % 2;
        r12 = org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(r12).parsePrivateKey().toASN1Primitive().getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if ((r12 instanceof org.bouncycastle.crypto.params.DSAPrivateKeyParameters) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r12 = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) r12;
        r0 = r12.getParameters();
        r3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        r3.add(new org.bouncycastle.asn1.ASN1Integer(0));
        r3.add(new org.bouncycastle.asn1.ASN1Integer(r0.getP()));
        r3.add(new org.bouncycastle.asn1.ASN1Integer(r0.getQ()));
        r3.add(new org.bouncycastle.asn1.ASN1Integer(r0.getG()));
        r3.add(new org.bouncycastle.asn1.ASN1Integer(r0.getG().modPow(r12.getX(), r0.getP())));
        r3.add(new org.bouncycastle.asn1.ASN1Integer(r12.getX()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        return new org.bouncycastle.asn1.DERSequence(r3).getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
    
        throw new java.lang.IllegalStateException("unable to encode DSAPrivateKeyParameters " + r12.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        if ((r12 instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        r12 = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) r12;
        r0 = r12.generatePublicKey();
        r5 = new org.bouncycastle.crypto.util.SSHBuilder();
        r5.writeBytes(org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.AUTH_MAGIC);
        r10 = new java.lang.Object[1];
        a(null, null, new byte[]{net.sf.scuba.smartcards.ISOFileInfo.FILE_IDENTIFIER, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, -126, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2}, 127 - android.text.TextUtils.indexOf(net.sf.scuba.smartcards.BuildConfig.FLAVOR, net.sf.scuba.smartcards.BuildConfig.FLAVOR), r10);
        r5.writeString(((java.lang.String) r10[0]).intern());
        r2 = new java.lang.Object[1];
        a(null, null, new byte[]{net.sf.scuba.smartcards.ISOFileInfo.FILE_IDENTIFIER, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2, -126, net.sf.scuba.smartcards.ISOFileInfo.DATA_BYTES2}, 128 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r2);
        r5.writeString(((java.lang.String) r2[0]).intern());
        r5.writeString(net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r5.u32(1);
        r5.writeBlock(org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(r0));
        r1 = new org.bouncycastle.crypto.util.SSHBuilder();
        r2 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextInt();
        r1.u32(r2);
        r1.u32(r2);
        r1.writeString("ssh-ed25519");
        r0 = r0.getEncoded();
        r1.writeBlock(r0);
        r1.writeBlock(org.bouncycastle.util.Arrays.concatenate(r12.getEncoded(), r0));
        r1.writeString(net.sf.scuba.smartcards.BuildConfig.FLAVOR);
        r5.writeBlock(r1.getPaddedBytes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0172, code lost:
    
        return r5.getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0196, code lost:
    
        throw new java.lang.IllegalArgumentException("unable to convert " + r12.getClass().getName() + " to openssh private key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x019e, code lost:
    
        throw new java.lang.IllegalArgumentException("param is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r12 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r12 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r12 instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encodePrivateKey(AsymmetricKeyParameter asymmetricKeyParameter) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 47;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3 A[PHI: r0
      0x01c3: PHI (r0v28 java.lang.String) = (r0v20 java.lang.String), (r0v35 java.lang.String) binds: [B:51:0x019d, B:48:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AsymmetricKeyParameter parsePrivateKeyBlob(byte[] bArr) throws Throwable {
        String string;
        ECPrivateKeyParameters ed25519PrivateKeyParameters;
        ECPrivateKeyParameters dSAPrivateKeyParameters;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (bArr[0] == 48) {
            int i5 = i2 + 103;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
            if (i6 != 0 ? aSN1Sequence.size() != 6 : aSN1Sequence.size() != 27) {
                if (aSN1Sequence.size() == 9) {
                    if (allIntegers(aSN1Sequence) && aSN1Sequence.getObjectAt(0).getPositiveValue().equals(BigIntegers.ZERO)) {
                        RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(aSN1Sequence);
                        dSAPrivateKeyParameters = new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
                    }
                } else if (aSN1Sequence.size() == 4 && !(!(aSN1Sequence.getObjectAt(3) instanceof ASN1TaggedObject)) && (aSN1Sequence.getObjectAt(2) instanceof ASN1TaggedObject)) {
                    ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(aSN1Sequence);
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(eCPrivateKey.getParametersObject());
                    ed25519PrivateKeyParameters = new ECPrivateKeyParameters(eCPrivateKey.getKey(), new ECNamedDomainParameters(aSN1ObjectIdentifier, ECNamedCurveTable.getByOID(aSN1ObjectIdentifier)));
                }
            } else {
                int i7 = IAuthTabCallbackStub + 23;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    allIntegers(aSN1Sequence);
                    throw null;
                }
                dSAPrivateKeyParameters = (allIntegers(aSN1Sequence) && aSN1Sequence.getObjectAt(0).getPositiveValue().equals(BigIntegers.ZERO)) ? new DSAPrivateKeyParameters(aSN1Sequence.getObjectAt(5).getPositiveValue(), new DSAParameters(aSN1Sequence.getObjectAt(1).getPositiveValue(), aSN1Sequence.getObjectAt(2).getPositiveValue(), aSN1Sequence.getObjectAt(3).getPositiveValue())) : null;
            }
            if (dSAPrivateKeyParameters != null) {
                throw new IllegalArgumentException("unable to parse key");
            }
            int i8 = asBinder + 35;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                return dSAPrivateKeyParameters;
            }
            obj.hashCode();
            throw null;
        }
        SSHBuffer sSHBuffer = new SSHBuffer(AUTH_MAGIC, bArr);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.FILE_IDENTIFIER, ISOFileInfo.DATA_BYTES2, -126, ISOFileInfo.DATA_BYTES2}, 127 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr);
        if (!((String) objArr[0]).intern().equals(sSHBuffer.readString())) {
            throw new IllegalStateException("encrypted keys not supported");
        }
        sSHBuffer.skipBlock();
        sSHBuffer.skipBlock();
        if (sSHBuffer.readU32() != 1) {
            throw new IllegalStateException("multiple keys not supported");
        }
        int i9 = asBinder + 117;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        OpenSSHPublicKeyUtil.parsePublicKey(sSHBuffer.readBlock());
        byte[] paddedBlock = sSHBuffer.readPaddedBlock();
        if (sSHBuffer.hasRemaining()) {
            throw new IllegalArgumentException("decoded key has trailing data");
        }
        SSHBuffer sSHBuffer2 = new SSHBuffer(paddedBlock);
        if (sSHBuffer2.readU32() != sSHBuffer2.readU32()) {
            throw new IllegalStateException("private key check values are not the same");
        }
        int i11 = IAuthTabCallbackStub + 25;
        asBinder = i11 % 128;
        if (i11 % 2 != 0) {
            string = sSHBuffer2.readString();
            int i12 = 84 / 0;
            if ("ssh-ed25519".equals(string)) {
                int i13 = IAuthTabCallbackStub + 111;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                sSHBuffer2.readBlock();
                byte[] block = sSHBuffer2.readBlock();
                if (block.length != 64) {
                    throw new IllegalStateException("private key value of wrong length");
                }
                ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(block, 0);
            } else if (string.startsWith("ecdsa")) {
                int i15 = IAuthTabCallbackStub + 83;
                asBinder = i15 % 128;
                if (i15 % 2 != 0) {
                    SSHNamedCurves.getByName(Strings.fromByteArray(sSHBuffer2.readBlock()));
                    obj.hashCode();
                    throw null;
                }
                ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(Strings.fromByteArray(sSHBuffer2.readBlock()));
                if (byName == null) {
                    throw new IllegalStateException("OID not found for: " + string);
                }
                X9ECParameters byOID = NISTNamedCurves.getByOID(byName);
                if (byOID == null) {
                    throw new IllegalStateException("Curve not found for: " + byName);
                }
                sSHBuffer2.readBlock();
                ed25519PrivateKeyParameters = new ECPrivateKeyParameters(new BigInteger(1, sSHBuffer2.readBlock()), new ECNamedDomainParameters(byName, byOID));
            } else {
                ed25519PrivateKeyParameters = null;
            }
        } else {
            string = sSHBuffer2.readString();
            if ("ssh-ed25519".equals(string)) {
            }
        }
        sSHBuffer2.skipBlock();
        if (sSHBuffer2.hasRemaining()) {
            throw new IllegalArgumentException("private key block has trailing data");
        }
        dSAPrivateKeyParameters = ed25519PrivateKeyParameters;
        if (dSAPrivateKeyParameters != null) {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSizeAndState(0, 0, 0) + 77, View.resolveSizeAndState(0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $11 + 45;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 76 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 16037 - View.MeasureSpec.getMode(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (onExtraCallback) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), View.MeasureSpec.getSize(0) + 63, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i6 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $11 + 63;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 63 - ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{32404, 32395, 32413};
        onNavigationEvent = -1184334022;
        onWarmupCompleted = true;
        onExtraCallback = true;
    }
}
