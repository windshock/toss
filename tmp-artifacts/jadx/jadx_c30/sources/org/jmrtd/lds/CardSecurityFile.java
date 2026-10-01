package org.jmrtd.lds;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CardSecurityFile implements Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String CONTENT_TYPE_OID = "0.4.0.127.0.7.3.2.1";
    private static int IAuthTabCallback = 1;
    private static final Logger LOGGER;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final long serialVersionUID = -3535507558193769952L;
    private X509Certificate certificate;
    private String digestAlgorithm;
    private String digestEncryptionAlgorithm;
    private byte[] encryptedDigest;
    private Set<SecurityInfo> securityInfos;

    static {
        onExtraCallbackWithResult();
        LOGGER = Logger.getLogger("org.jmrtd");
        int i = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 55 / 0;
        }
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, collection, privateKey, x509Certificate, null);
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, collection, (byte[]) null, x509Certificate);
        this.encryptedDigest = SignedDataUtil.signData(str, str2, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, collection), privateKey, str3);
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, byte[] bArr, X509Certificate x509Certificate) {
        if (collection == null) {
            throw new IllegalArgumentException("Null securityInfos");
        }
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Null certificate");
        }
        this.digestAlgorithm = str;
        this.digestEncryptionAlgorithm = str2;
        this.securityInfos = new HashSet(collection);
        this.encryptedDigest = bArr;
        this.certificate = x509Certificate;
        int i = onNavigationEvent + 71;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public CardSecurityFile(InputStream inputStream) throws IOException {
        readContent(inputStream);
    }

    public String getDigestAlgorithm() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.digestAlgorithm;
        int i5 = i3 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getDigestEncryptionAlgorithm() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.digestEncryptionAlgorithm;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public byte[] getEncryptedDigest() {
        int i = 2 % 2;
        byte[] bArr = this.encryptedDigest;
        if (bArr == null) {
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void readContent(InputStream inputStream) throws IOException {
        X509Certificate x509Certificate;
        int i = 2 % 2;
        SignedData signedData = SignedDataUtil.readSignedData(inputStream);
        this.digestAlgorithm = SignedDataUtil.getSignerInfoDigestAlgorithm(signedData);
        this.digestEncryptionAlgorithm = SignedDataUtil.getDigestEncryptionAlgorithm(signedData);
        List certificates = SignedDataUtil.getCertificates(signedData);
        if (certificates != null) {
            int i2 = onNavigationEvent + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 92 / 0;
                if (certificates.isEmpty()) {
                    x509Certificate = null;
                } else {
                    int i4 = onWarmupCompleted + 97;
                    onNavigationEvent = i4 % 128;
                    x509Certificate = i4 % 2 != 0 ? (X509Certificate) certificates.get(certificates.size()) : (X509Certificate) certificates.get(certificates.size() - 1);
                }
            } else if (!certificates.isEmpty()) {
            }
        }
        this.certificate = x509Certificate;
        this.securityInfos = getSecurityInfos(signedData);
        this.encryptedDigest = SignedDataUtil.getEncryptedDigest(signedData);
    }

    protected void writeContent(OutputStream outputStream) throws IOException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                SignedDataUtil.writeData(SignedDataUtil.createSignedData(this.digestAlgorithm, this.digestEncryptionAlgorithm, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, this.securityInfos), this.encryptedDigest, this.certificate), outputStream);
            } else {
                SignedDataUtil.writeData(SignedDataUtil.createSignedData(this.digestAlgorithm, this.digestEncryptionAlgorithm, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, this.securityInfos), this.encryptedDigest, this.certificate), outputStream);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("Unsupported algorithm", e);
        } catch (CertificateException e2) {
            throw new IOException("Certificate exception during SignedData creation", e2);
        } catch (GeneralSecurityException e3) {
            throw new IOException("General security exception", e3);
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), KeyEvent.normalizeMetaState(0) + 35, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $10 + 93;
                $11 = i8 % 128;
                if (i8 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 29, (ViewConfiguration.getTouchSlop() >> 8) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.makeMeasureSpec(0, 0)), 64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollBarSize() >> 8)), 70 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.rgb(0, 0, 0) + 16789702, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i11, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i11);
        }
        if (z) {
            int i12 = $11 + 59;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i13 = $11 + 93;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 51;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[5]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        String str = new String(cArr4);
        int i16 = $10 + 91;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    public byte[] getEncoded() throws IOException {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                writeContent(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (IOException unused) {
                    LOGGER.log(Level.FINE, "Error closing stream");
                    return byteArray;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    int i2 = onNavigationEvent + 117;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                } catch (IOException unused2) {
                    LOGGER.log(Level.FINE, "Error closing stream");
                }
                throw th;
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Exception while encoding", (Throwable) e);
            try {
                byteArrayOutputStream.close();
                return null;
            } catch (IOException unused3) {
                LOGGER.log(Level.FINE, "Error closing stream");
                return null;
            }
        }
    }

    public Collection<SecurityInfo> getSecurityInfos() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Set<SecurityInfo> set = this.securityInfos;
        if (i3 == 0) {
            return Collections.unmodifiableCollection(set);
        }
        Collections.unmodifiableCollection(set);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public Collection<PACEInfo> getPACEInfos() {
        SecurityInfo next;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        Iterator<SecurityInfo> it = this.securityInfos.iterator();
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 % 3;
        }
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                next = it.next();
                int i5 = 28 / 0;
                if (next instanceof PACEInfo) {
                    int i6 = onWarmupCompleted + 81;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add((PACEInfo) next);
                }
            } else {
                next = it.next();
                if (next instanceof PACEInfo) {
                    int i62 = onWarmupCompleted + 81;
                    onNavigationEvent = i62 % 128;
                    int i72 = i62 % 2;
                    arrayList.add((PACEInfo) next);
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public Collection<ChipAuthenticationInfo> getChipAuthenticationInfos() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        Iterator<SecurityInfo> it = this.securityInfos.iterator();
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            ChipAuthenticationInfo chipAuthenticationInfo = (SecurityInfo) it.next();
            if (chipAuthenticationInfo instanceof ChipAuthenticationInfo) {
                int i4 = onNavigationEvent + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(chipAuthenticationInfo);
                if (i5 == 0) {
                    throw null;
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public Collection<ChipAuthenticationPublicKeyInfo> getChipAuthenticationPublicKeyInfos() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        Iterator<SecurityInfo> it = this.securityInfos.iterator();
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ChipAuthenticationPublicKeyInfo chipAuthenticationPublicKeyInfo = (SecurityInfo) it.next();
            if (chipAuthenticationPublicKeyInfo instanceof ChipAuthenticationPublicKeyInfo) {
                arrayList.add(chipAuthenticationPublicKeyInfo);
            }
        }
        return arrayList;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 18, 0, 8}, false, new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(this.securityInfos.toString());
        sb.append("]");
        String string = sb.toString();
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj != null) {
            if (!obj.getClass().equals(getClass())) {
                return false;
            }
            CardSecurityFile cardSecurityFile = (CardSecurityFile) obj;
            Set<SecurityInfo> set = this.securityInfos;
            if (set != null) {
                Set<SecurityInfo> set2 = cardSecurityFile.securityInfos;
                if (set2 == null) {
                    return set == null;
                }
                return set.equals(set2);
            }
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return cardSecurityFile.securityInfos == null;
            }
            Set<SecurityInfo> set3 = cardSecurityFile.securityInfos;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = onWarmupCompleted + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.securityInfos.hashCode() * 4) - 3 : (this.securityInfos.hashCode() * 3) + 63;
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return iHashCode;
    }

    private static ContentInfo toContentInfo(String str, Collection<SecurityInfo> collection) {
        int i = 2 % 2;
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Iterator<SecurityInfo> it = collection.iterator();
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = onWarmupCompleted + 49;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    aSN1EncodableVector.add(it.next().getDERObject());
                    int i5 = 88 / 0;
                } else {
                    aSN1EncodableVector.add(it.next().getDERObject());
                }
            }
            return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString(new DLSet(aSN1EncodableVector)));
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Error creating signedData", (Throwable) e);
            throw new IllegalArgumentException("Error DER encoding the security infos");
        }
    }

    private static Set<SecurityInfo> getSecurityInfos(SignedData signedData) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ASN1Set content = SignedDataUtil.getContent(signedData);
        if (!(content instanceof ASN1Set)) {
            throw new IOException("Was expecting an ASN1Set, found " + content.getClass());
        }
        ASN1Set aSN1Set = content;
        HashSet hashSet = new HashSet();
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < aSN1Set.size(); i6++) {
            try {
                SecurityInfo securityInfo = SecurityInfo.getInstance(aSN1Set.getObjectAt(i6).toASN1Primitive());
                if (securityInfo == null) {
                    LOGGER.log(Level.WARNING, "Could not parse, skipping security info");
                } else {
                    hashSet.add(securityInfo);
                    int i7 = onNavigationEvent + 57;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Exception while parsing, skipping security info", (Throwable) e);
            }
        }
        return hashSet;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27252, 27192, 27153, 27161, 27172, 27174, 27148, 27251, 27137, 27164, 27175, 27173, 27157, 27154, 27178, 27170, 27197, 27171};
    }
}
