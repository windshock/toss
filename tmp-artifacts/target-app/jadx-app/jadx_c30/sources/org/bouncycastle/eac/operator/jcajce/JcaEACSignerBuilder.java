package org.bouncycastle.eac.operator.jcajce;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Hashtable;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.eac.operator.EACSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcaEACSignerBuilder {
    private static int IAuthTabCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private static final Hashtable sigNames;
    private EACHelper helper = new DefaultEACHelper();
    private static final byte[] $$a = {ISO7816.INS_DECREASE, 86, 58, 71};
    private static final int $$b = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;

    class SignatureOutputStream extends OutputStream {
        private Signature sig;

        SignatureOutputStream(Signature signature) {
            this.sig = signature;
        }

        byte[] getSignature() throws SignatureException {
            return this.sig.sign();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws SignatureException, IOException {
            try {
                this.sig.update((byte) i);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws SignatureException, IOException {
            try {
                this.sig.update(bArr);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws SignatureException, IOException {
            try {
                this.sig.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3 = 4 - (b * 2);
        byte[] bArr = $$a;
        int i4 = b2 + 109;
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            int i10 = i8 + 1;
            i2 = i7;
            i4 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i4;
            i8 = i3;
            i3 = bArr[i3];
            i7 = i2 + 1;
            i6 = i11;
            int i92 = (-i3) + i6;
            int i102 = i8 + 1;
            i2 = i7;
            i4 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        IAuthTabCallback();
        Hashtable hashtable = new Hashtable();
        sigNames = hashtable;
        hashtable.put("SHA1withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1);
        hashtable.put("SHA256withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256);
        hashtable.put("SHA1withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1);
        hashtable.put("SHA256withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256);
        hashtable.put("SHA512withRSA", EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512);
        hashtable.put("SHA512withRSAandMGF1", EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512);
        hashtable.put("SHA1withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        hashtable.put("SHA224withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        Object[] objArr = new Object[1];
        a((char) (12870 - (Process.myTid() >> 22)), 694184544 + (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{20334, 48421, 14129, 46673, 65269, 55723, 46316, 55325, 36134, 31188, 3307, 17661, 5547, 50442, 62676}, new char[]{0, 0, 0, 0}, new char[]{24754, 24682, 17961, 28210}, objArr);
        hashtable.put(((String) objArr[0]).intern(), EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        hashtable.put("SHA384withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        hashtable.put("SHA512withECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
        int i = onExtraCallback + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ byte[] access$000(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            reencode(bArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte[] bArrReencode = reencode(bArr);
        int i3 = onTransact + 39;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return bArrReencode;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void copyUnsignedInt(byte[] bArr, byte[] bArr2, int i) {
        int length;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 23;
        onTransact = i4 % 128;
        int i5 = 1;
        if (i4 % 2 != 0) {
            length = bArr.length;
            if (bArr[1] == 0) {
                int i6 = i3 + 61;
                int i7 = i6 % 128;
                onTransact = i7;
                int i8 = i6 % 2;
                length--;
                int i9 = i7 + 13;
                asBinder = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 % 5;
                }
            }
        } else {
            length = bArr.length;
            if (bArr[0] != 0) {
                i5 = 0;
            }
        }
        System.arraycopy(bArr, i5, bArr2, i, length);
    }

    public static int max(int i, int i2) {
        int i3 = 2 % 2;
        if (i <= i2) {
            return i2;
        }
        int i4 = onTransact;
        int i5 = i4 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 119;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return i;
    }

    private static byte[] reencode(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        BigInteger value = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        BigInteger value2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        byte[] byteArray = value.toByteArray();
        byte[] byteArray2 = value2.toByteArray();
        int iUnsignedIntLength = unsignedIntLength(byteArray);
        int iUnsignedIntLength2 = unsignedIntLength(byteArray2);
        int iMax = max(iUnsignedIntLength, iUnsignedIntLength2);
        int i4 = iMax << 1;
        byte[] bArr2 = new byte[i4];
        Arrays.fill(bArr2, (byte) 0);
        copyUnsignedInt(byteArray, bArr2, iMax - iUnsignedIntLength);
        copyUnsignedInt(byteArray2, bArr2, i4 - iUnsignedIntLength2);
        int i5 = onTransact + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return bArr2;
    }

    private static int unsignedIntLength(byte[] bArr) {
        int i = 2 % 2;
        int length = bArr.length;
        if (bArr[0] == 0) {
            int i2 = onTransact + 57;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            length--;
        }
        int i4 = asBinder + 85;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return length;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public EACSigner build(String str, PrivateKey privateKey) throws OperatorCreationException, InvalidKeyException {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        EACSigner eACSignerBuild = build((ASN1ObjectIdentifier) sigNames.get(str), privateKey);
        int i4 = onTransact + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return eACSignerBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
    public EACSigner build(final ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey) throws OperatorCreationException, InvalidKeyException {
        int i = 2 % 2;
        try {
            Signature signature = this.helper.getSignature(aSN1ObjectIdentifier);
            signature.initSign(privateKey);
            final SignatureOutputStream signatureOutputStream = new SignatureOutputStream(signature);
            EACSigner eACSigner = new EACSigner() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSigner
                public OutputStream getOutputStream() {
                    return signatureOutputStream;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.RuntimeOperatorException */
                @Override // org.bouncycastle.eac.operator.EACSigner
                public byte[] getSignature() throws RuntimeOperatorException {
                    try {
                        byte[] signature2 = signatureOutputStream.getSignature();
                        return aSN1ObjectIdentifier.on(EACObjectIdentifiers.id_TA_ECDSA) ? JcaEACSignerBuilder.access$000(signature2) : signature2;
                    } catch (SignatureException e) {
                        throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
                    }
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }
            };
            int i2 = onTransact + 33;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return eACSigner;
            }
            throw null;
        } catch (InvalidKeyException e) {
            throw new OperatorCreationException("invalid key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new OperatorCreationException("unable to find algorithm: " + e2.getMessage(), e2);
        } catch (NoSuchProviderException e3) {
            throw new OperatorCreationException("unable to find provider: " + e3.getMessage(), e3);
        }
    }

    public JcaEACSignerBuilder setProvider(String str) {
        int i = 2 % 2;
        this.helper = new NamedEACHelper(str);
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public JcaEACSignerBuilder setProvider(Provider provider) {
        int i = 2 % 2;
        this.helper = new ProviderEACHelper(provider);
        int i2 = asBinder + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 19;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iIndexOf = 42 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iIndexOf, keyRepeatTimeout, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), (Process.myTid() >> 22) + 44, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i3) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23972), 49 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 22939 - ExpandableListView.getPackedPositionType(0L), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), (Process.myPid() >> 22) + 29, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 13;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = 7798559133331975163L;
        onWarmupCompleted = -1776194565;
        onExtraCallbackWithResult = (char) 17636;
    }
}
