package org.jmrtd.cert;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.data.Country;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.ejbca.cvc.AlgorithmUtil;
import org.ejbca.cvc.AuthorizationRoleEnum;
import org.ejbca.cvc.CAReferenceField;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.CVCertificateBody;
import org.ejbca.cvc.HolderReferenceField;
import org.ejbca.cvc.exception.ConstructionException;
import org.jmrtd.cert.CVCAuthorizationTemplate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CardVerifiableCertificate extends Certificate {
    private static short[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static final Logger LOGGER;
    private static int onExtraCallback = 0;
    private static byte[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 0;
    private static final long serialVersionUID = -3585440601605666288L;
    private CVCertificate cvCertificate;
    private transient KeyFactory rsaKeyFactory;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4;
        int i5 = (i2 * 4) + 115;
        byte[] bArr = $$a;
        int i6 = (s * 3) + 4;
        int i7 = (i * 2) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i5 = i7;
            int i8 = i6;
            i4 = 0;
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallback();
        LOGGER = Logger.getLogger("org.jmrtd");
        int i = onTransact + 57;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    protected CardVerifiableCertificate(CVCertificate cVCertificate) throws Throwable {
        super("CVC");
        try {
            Object[] objArr = new Object[1];
            a((short) ExpandableListView.getPackedPositionGroup(0L), (byte) Color.blue(0), Process.getGidForName(BuildConfig.FLAVOR) - 565246599, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 128477369, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) - 45, objArr);
            this.rsaKeyFactory = KeyFactory.getInstance(((String) objArr[0]).intern());
            int i = 2 % 2;
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
        }
        this.cvCertificate = cVCertificate;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public CardVerifiableCertificate(CVCPrincipal cVCPrincipal, CVCPrincipal cVCPrincipal2, PublicKey publicKey, String str, Date date, Date date2, CVCAuthorizationTemplate.Role role, CVCAuthorizationTemplate.Permission permission, byte[] bArr) {
        this(null);
        try {
            CAReferenceField cAReferenceField = new CAReferenceField(cVCPrincipal.getCountry().toAlpha2Code(), cVCPrincipal.getMnemonic(), cVCPrincipal.getSeqNumber());
            HolderReferenceField holderReferenceField = new HolderReferenceField(cVCPrincipal2.getCountry().toAlpha2Code(), cVCPrincipal2.getMnemonic(), cVCPrincipal2.getSeqNumber());
            AuthorizationRoleEnum authorizationRoleEnumFromRole = CVCAuthorizationTemplate.fromRole(role);
            CVCertificate cVCertificate = new CVCertificate(new CVCertificateBody(cAReferenceField, org.ejbca.cvc.KeyFactory.createInstance(publicKey, str, authorizationRoleEnumFromRole), holderReferenceField, authorizationRoleEnumFromRole, CVCAuthorizationTemplate.fromPermission(permission), date, date2));
            this.cvCertificate = cVCertificate;
            cVCertificate.setSignature(bArr);
            this.cvCertificate.getTBS();
        } catch (ConstructionException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getSigAlgName() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            String algorithmName = AlgorithmUtil.getAlgorithmName(this.cvCertificate.getCertificateBody().getPublicKey().getObjectIdentifier());
            int i4 = asBinder + 79;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return algorithmName;
            }
            obj.hashCode();
            throw null;
        } catch (NoSuchFieldException e) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e);
            return null;
        }
    }

    public String getSigAlgOID() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            String asText = this.cvCertificate.getCertificateBody().getPublicKey().getObjectIdentifier().getAsText();
            int i4 = asBinder + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return asText;
        } catch (NoSuchFieldException e) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e);
            return null;
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                byte[] dEREncoded = this.cvCertificate.getDEREncoded();
                int i3 = IAuthTabCallbackDefault + 109;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return dEREncoded;
            }
            this.cvCertificate.getDEREncoded();
            throw null;
        } catch (IOException e) {
            throw new CertificateEncodingException(e);
        }
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            PublicKey publicKey = this.cvCertificate.getCertificateBody().getPublicKey();
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (-565246600) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-128477368) + (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) - 45, objArr);
            if (((String) objArr[0]).intern().equals(publicKey.getAlgorithm())) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                try {
                    PublicKey publicKeyGeneratePublic = this.rsaKeyFactory.generatePublic(new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent()));
                    int i4 = IAuthTabCallbackDefault + 83;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        return publicKeyGeneratePublic;
                    }
                    throw null;
                } catch (GeneralSecurityException e) {
                    LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
                }
            }
            int i5 = asBinder + 63;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return publicKey;
        } catch (NoSuchFieldException e2) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e2);
            return null;
        }
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String string = this.cvCertificate.toString();
        int i4 = IAuthTabCallbackDefault + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a2 A[PHI: r0
      0x01a2: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:43:0x01a0, B:40:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4 A[PHI: r0
      0x01a4: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:43:0x01a0, B:40:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), 42 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i7 = $11 + 65;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char mode = (char) (12843 - View.MeasureSpec.getMode(0));
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 55;
                                int packedPositionType = 2167 - ExpandableListView.getPackedPositionType(j);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, deadChar, packedPositionType, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 43424), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    i4 = ((i * iIntValue) - 5) / ((int) (onNavigationEvent * (-4629411779493505016L)));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 86 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9568 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int i10 = $11 + 67;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    int i13 = $10 + 23;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i15 = $11 + 91;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z2) {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i17 = $10 + 7;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException, NoSuchProviderException {
        int i = 2 % 2;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = asBinder + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = asBinder + 99;
            IAuthTabCallbackDefault = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    this.cvCertificate.verify(publicKey, providers[i4].getName());
                    return;
                } else {
                    this.cvCertificate.verify(publicKey, providers[i4].getName());
                    int i6 = 11 / 0;
                    return;
                }
            } catch (NoSuchAlgorithmException e) {
                LOGGER.log(Level.FINE, "Trying next provider", (Throwable) e);
            }
        }
        throw new NoSuchAlgorithmException("Tried all security providers: None was able to provide this signature algorithm.");
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.cvCertificate.verify(publicKey, str);
            int i3 = 36 / 0;
        } else {
            this.cvCertificate.verify(publicKey, str);
        }
        int i4 = IAuthTabCallbackDefault + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public byte[] getCertBodyData() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                byte[] dEREncoded = this.cvCertificate.getCertificateBody().getDEREncoded();
                int i3 = IAuthTabCallbackDefault + 85;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return dEREncoded;
            }
            this.cvCertificate.getCertificateBody().getDEREncoded();
            throw null;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public Date getNotBefore() throws CertificateException {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date validFrom = this.cvCertificate.getCertificateBody().getValidFrom();
            int i4 = IAuthTabCallbackDefault + 77;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return validFrom;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public Date getNotAfter() throws CertificateException {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date validTo = this.cvCertificate.getCertificateBody().getValidTo();
            int i4 = asBinder + 49;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return validTo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public CVCPrincipal getAuthorityReference() throws CertificateException {
        int i = 2 % 2;
        try {
            CAReferenceField authorityReference = this.cvCertificate.getCertificateBody().getAuthorityReference();
            CVCPrincipal cVCPrincipal = new CVCPrincipal(Country.getInstance(authorityReference.getCountry().toUpperCase()), authorityReference.getMnemonic(), authorityReference.getSequence());
            int i2 = asBinder + 9;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return cVCPrincipal;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public CVCPrincipal getHolderReference() throws CertificateException {
        int i = 2 % 2;
        try {
            HolderReferenceField holderReference = this.cvCertificate.getCertificateBody().getHolderReference();
            CVCPrincipal cVCPrincipal = new CVCPrincipal(Country.getInstance(holderReference.getCountry().toUpperCase()), holderReference.getMnemonic(), holderReference.getSequence());
            int i2 = IAuthTabCallbackDefault + 107;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return cVCPrincipal;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public CVCAuthorizationTemplate getAuthorizationTemplate() throws CertificateException {
        int i = 2 % 2;
        try {
            CVCAuthorizationTemplate cVCAuthorizationTemplate = new CVCAuthorizationTemplate(this.cvCertificate.getCertificateBody().getAuthorizationTemplate());
            int i2 = asBinder + 117;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return cVCAuthorizationTemplate;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    public byte[] getSignature() throws CertificateException {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                byte[] signature = this.cvCertificate.getSignature();
                int i3 = asBinder + 59;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return signature;
                }
                throw null;
            }
            this.cvCertificate.getSignature();
            obj.hashCode();
            throw null;
        } catch (NoSuchFieldException e) {
            throw new CertificateException("No such field", e);
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = IAuthTabCallbackDefault + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this != obj) {
            if (getClass().equals(obj.getClass())) {
                return this.cvCertificate.equals(((CardVerifiableCertificate) obj).cvCertificate);
            }
            return false;
        }
        int i4 = asBinder + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.cvCertificate.hashCode() << 1) - 1030507011;
        int i4 = IAuthTabCallbackDefault + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    static void onExtraCallback() {
        onNavigationEvent = -2047401344;
        onWarmupCompleted = -1538795484;
        onExtraCallback = -1544572670;
        onExtraCallbackWithResult = new byte[]{-33, -26, 9};
    }
}
