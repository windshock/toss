package org.bouncycastle.mime.smime;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedDataStreamGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeWriter;
import org.bouncycastle.mime.encoding.Base64OutputStream;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SMIMESignedWriter extends MimeWriter {
    public static final Map RFC3851_MICALGS;
    public static final Map RFC5751_MICALGS;
    public static final Map STANDARD_MICALGS;
    private final String boundary;
    private final String contentTransferEncoding;
    private final OutputStream mimeOut;
    private final CMSSignedDataStreamGenerator sigGen;

    class ContentOutputStream extends OutputStream {
        private final OutputStream backing;
        private final OutputStream main;
        private final OutputStream sigBase;
        private final ByteArrayOutputStream sigStream;

        ContentOutputStream(OutputStream outputStream, OutputStream outputStream2, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream3) {
            this.main = outputStream;
            this.backing = outputStream2;
            this.sigStream = byteArrayOutputStream;
            this.sigBase = outputStream3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (SMIMESignedWriter.this.boundary != null) {
                this.main.close();
                this.backing.write(Strings.toByteArray("\r\n--"));
                this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
                this.backing.write(Strings.toByteArray("\r\n"));
                this.backing.write(Strings.toByteArray("Content-Type: application/pkcs7-signature; name=\"smime.p7s\"\r\n"));
                this.backing.write(Strings.toByteArray("Content-Transfer-Encoding: base64\r\n"));
                this.backing.write(Strings.toByteArray("Content-Disposition: attachment; filename=\"smime.p7s\"\r\n"));
                this.backing.write(Strings.toByteArray("\r\n"));
                OutputStream outputStream = this.sigBase;
                if (outputStream != null) {
                    outputStream.close();
                }
                this.backing.write(this.sigStream.toByteArray());
                this.backing.write(Strings.toByteArray("\r\n--"));
                this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
                this.backing.write(Strings.toByteArray("--\r\n"));
            }
            OutputStream outputStream2 = this.backing;
            if (outputStream2 != null) {
                outputStream2.close();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.main.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.main.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.main.write(bArr, i, i2);
        }
    }

    static {
        HashMap map = new HashMap();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.MD5;
        map.put(aSN1ObjectIdentifier, "md5");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.SHA1;
        map.put(aSN1ObjectIdentifier2, "sha-1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.SHA224;
        map.put(aSN1ObjectIdentifier3, "sha-224");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.SHA256;
        map.put(aSN1ObjectIdentifier4, "sha-256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.SHA384;
        map.put(aSN1ObjectIdentifier5, "sha-384");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.SHA512;
        map.put(aSN1ObjectIdentifier6, "sha-512");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = CMSAlgorithm.GOST3411;
        map.put(aSN1ObjectIdentifier7, "gostr3411-94");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = CMSAlgorithm.GOST3411_2012_256;
        map.put(aSN1ObjectIdentifier8, "gostr3411-2012-256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = CMSAlgorithm.GOST3411_2012_512;
        map.put(aSN1ObjectIdentifier9, "gostr3411-2012-512");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        RFC5751_MICALGS = mapUnmodifiableMap;
        HashMap map2 = new HashMap();
        map2.put(aSN1ObjectIdentifier, "md5");
        map2.put(aSN1ObjectIdentifier2, "sha1");
        map2.put(aSN1ObjectIdentifier3, "sha224");
        map2.put(aSN1ObjectIdentifier4, "sha256");
        map2.put(aSN1ObjectIdentifier5, "sha384");
        map2.put(aSN1ObjectIdentifier6, "sha512");
        map2.put(aSN1ObjectIdentifier7, "gostr3411-94");
        map2.put(aSN1ObjectIdentifier8, "gostr3411-2012-256");
        map2.put(aSN1ObjectIdentifier9, "gostr3411-2012-512");
        RFC3851_MICALGS = Collections.unmodifiableMap(map2);
        STANDARD_MICALGS = mapUnmodifiableMap;
    }

    private SMIMESignedWriter(Builder builder, Map<String, String> map, String str, OutputStream outputStream) {
        super(new Headers(MimeWriter.mapToLines(map), builder.contentTransferEncoding));
        this.sigGen = Builder.access$100(builder);
        this.contentTransferEncoding = builder.contentTransferEncoding;
        this.boundary = str;
        this.mimeOut = outputStream;
    }

    @Override // org.bouncycastle.mime.MimeWriter
    public OutputStream getContentStream() throws IOException {
        this.headers.dumpHeaders(this.mimeOut);
        this.mimeOut.write(Strings.toByteArray("\r\n"));
        if (this.boundary == null) {
            return null;
        }
        this.mimeOut.write(Strings.toByteArray("This is an S/MIME signed message\r\n"));
        this.mimeOut.write(Strings.toByteArray("\r\n--"));
        this.mimeOut.write(Strings.toByteArray(this.boundary));
        this.mimeOut.write(Strings.toByteArray("\r\n"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream);
        return new ContentOutputStream(this.sigGen.open((OutputStream) base64OutputStream, false, SMimeUtils.createUnclosable(this.mimeOut)), this.mimeOut, byteArrayOutputStream, base64OutputStream);
    }

    public static class Builder {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 0;
        private static final String[] detHeaders;
        private static final String[] detValues;
        private static final String[] encHeaders;
        private static final String[] encValues;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        String contentTransferEncoding;
        private final boolean encapsulated;
        private final Map<String, String> extraHeaders;
        private final Map micAlgs;
        private final CMSSignedDataStreamGenerator sigGen;

        static {
            onNavigationEvent();
            detHeaders = new String[]{"Content-Type"};
            detValues = new String[]{"multipart/signed; protocol=\"application/pkcs7-signature\""};
            encHeaders = new String[]{"Content-Type", "Content-Disposition", "Content-Transfer-Encoding", "Content-Description"};
            encValues = new String[]{"application/pkcs7-mime; name=\"smime.p7m\"; smime-type=enveloped-data", "attachment; filename=\"smime.p7m\"", "base64", "S/MIME Signed Message"};
            int i = onWarmupCompleted + 87;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 47 / 0;
            }
        }

        public Builder() {
            this(false);
        }

        public Builder(boolean z) {
            this.sigGen = new CMSSignedDataStreamGenerator();
            this.extraHeaders = new LinkedHashMap();
            this.micAlgs = SMIMESignedWriter.STANDARD_MICALGS;
            this.contentTransferEncoding = "base64";
            this.encapsulated = z;
        }

        static /* synthetic */ CMSSignedDataStreamGenerator access$100(Builder builder) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            CMSSignedDataStreamGenerator cMSSignedDataStreamGenerator = builder.sigGen;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return cMSSignedDataStreamGenerator;
        }

        private void addBoundary(StringBuffer stringBuffer, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            stringBuffer.append(";\r\n\tboundary=\"");
            stringBuffer.append(str);
            stringBuffer.append("\"");
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void addHashHeader(StringBuffer stringBuffer, List list) throws Throwable {
            int i;
            Object obj;
            int i2 = 2 % 2;
            Iterator it = list.iterator();
            TreeSet<String> treeSet = new TreeSet();
            int i3 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 4;
            }
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String strIntern = (String) this.micAlgs.get(((AlgorithmIdentifier) it.next()).getAlgorithm());
                if (strIntern == null) {
                    int i5 = onExtraCallbackWithResult + 7;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{60599, 18700, 60610, 31870, 39265, 62258, 57880, 32034, 14504, 16631, 52724}, ExpandableListView.getPackedPositionGroup(1L), objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{60599, 18700, 60610, 31870, 39265, 62258, 57880, 32034, 14504, 16631, 52724}, ExpandableListView.getPackedPositionGroup(0L), objArr2);
                        obj = objArr2[0];
                    }
                    strIntern = ((String) obj).intern();
                }
                treeSet.add(strIntern);
            }
            int i6 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            for (String str : treeSet) {
                if (i == 0) {
                    stringBuffer.append(treeSet.size() != 1 ? "; micalg=\"" : "; micalg=");
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(str);
                i++;
            }
            if (i == 0 || treeSet.size() == 1) {
                return;
            }
            stringBuffer.append('\"');
        }

        private String generateBoundary() {
            int i = 2 % 2;
            String str = "==" + new BigInteger(180, new SecureRandom()).setBit(179).toString(16) + "=";
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public Builder addCertificate(X509CertificateHolder x509CertificateHolder) throws CMSException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.sigGen.addCertificate(x509CertificateHolder);
            int i4 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public Builder addCertificates(Store store) throws CMSException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.sigGen.addCertificates(store);
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public Builder addSignerInfoGenerator(SignerInfoGenerator signerInfoGenerator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.sigGen.addSignerInfoGenerator(signerInfoGenerator);
                int i3 = 45 / 0;
            } else {
                this.sigGen.addSignerInfoGenerator(signerInfoGenerator);
            }
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public SMIMESignedWriter build(OutputStream outputStream) throws Throwable {
            String strGenerateBoundary;
            int i = 2 % 2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            int i3 = 1;
            if (!this.encapsulated) {
                strGenerateBoundary = generateBoundary();
                StringBuffer stringBuffer = new StringBuffer(detValues[0]);
                addHashHeader(stringBuffer, this.sigGen.getDigestAlgorithms());
                addBoundary(stringBuffer, strGenerateBoundary);
                linkedHashMap.put(detHeaders[0], stringBuffer.toString());
                while (true) {
                    String[] strArr = detHeaders;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    linkedHashMap.put(strArr[i3], detValues[i3]);
                    i3++;
                }
            } else {
                while (true) {
                    String[] strArr2 = encHeaders;
                    if (i2 == strArr2.length) {
                        break;
                    }
                    linkedHashMap.put(strArr2[i2], encValues[i2]);
                    i2++;
                    int i4 = onNavigationEvent + 91;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
                strGenerateBoundary = null;
            }
            String str = strGenerateBoundary;
            for (Map.Entry<String, String> entry : this.extraHeaders.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            SMIMESignedWriter sMIMESignedWriter = new SMIMESignedWriter(this, linkedHashMap, str, SMimeUtils.autoBuffer(outputStream));
            int i6 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return sMIMESignedWriter;
        }

        public Builder withHeader(String str, String str2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.extraHeaders.put(str, str2);
            if (i3 == 0) {
                return this;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 15;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45812), 84 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 21233 - (Process.myTid() >> 22), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 14186), 18 - ExpandableListView.getPackedPositionChild(0L), Drawable.resolveOpacity(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + 37;
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

        static void onNavigationEvent() {
            IAuthTabCallback = 4247170708080578064L;
        }
    }
}
