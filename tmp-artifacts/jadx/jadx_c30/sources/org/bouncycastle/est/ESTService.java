package org.bouncycastle.est;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.SimplePKIResponse;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ESTService {
    protected static final String CACERTS = "/cacerts";
    protected static final String CSRATTRS = "/csrattrs";
    protected static final String FULLCMC = "/fullcmc";
    private static int IAuthTabCallback = 0;
    protected static final String SERVERGEN = "/serverkeygen";
    protected static final String SIMPLE_ENROLL = "/simpleenroll";
    protected static final String SIMPLE_REENROLL = "/simplereenroll";
    protected static final Set<String> illegalParts;
    private static char[] onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final Pattern pathInValid;
    private final ESTClientProvider clientProvider;
    private final String server;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = s * 2;
        int i6 = 97 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i4;
            int i7 = i5;
            int i8 = 0;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i3];
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i6;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        onWarmupCompleted();
        HashSet hashSet = new HashSet();
        illegalParts = hashSet;
        hashSet.add("cacerts");
        hashSet.add("simpleenroll");
        hashSet.add("simplereenroll");
        hashSet.add("fullcmc");
        hashSet.add("serverkeygen");
        hashSet.add("csrattrs");
        pathInValid = Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;:=]+");
        int i = onExtraCallback + 113;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    ESTService(String str, String str2, ESTClientProvider eSTClientProvider) throws Throwable {
        String string;
        String strVerifyServer = verifyServer(str);
        if (str2 != null) {
            String strVerifyLabel = verifyLabel(str2);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(Process.myPid() >> 22, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 8, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strVerifyServer);
            sb.append("/.well-known/est/");
            sb.append(strVerifyLabel);
            string = sb.toString();
            int i = onTransact + 49;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(View.MeasureSpec.getMode(0), View.MeasureSpec.getMode(0) + 8, (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(strVerifyServer);
            sb2.append("/.well-known/est");
            string = sb2.toString();
        }
        this.server = string;
        int i4 = onTransact + 7;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 == 0) {
            int i6 = 2 % 2;
        }
        this.clientProvider = eSTClientProvider;
        int i7 = i5 + 109;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    static /* synthetic */ String access$000(ESTService eSTService, byte[] bArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strAnnotateRequest = eSTService.annotateRequest(bArr);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return strAnnotateRequest;
    }

    private String annotateRequest(byte[] bArr) {
        int i = 2 % 2;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        int length = 0;
        do {
            int i2 = length + 48;
            if (i2 < bArr.length) {
                printWriter.print(Base64.toBase64String(bArr, length, 48));
                int i3 = onNavigationEvent + 29;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                length = i2;
            } else {
                printWriter.print(Base64.toBase64String(bArr, length, bArr.length - length));
                length = bArr.length;
            }
            printWriter.print('\n');
        } while (length < bArr.length);
        int i5 = onNavigationEvent + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        printWriter.flush();
        if (i6 != 0) {
            return stringWriter.toString();
        }
        stringWriter.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        X509CertificateHolder[] x509CertificateHolderArrStoreToArray = storeToArray(store, null);
        int i4 = onTransact + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return x509CertificateHolderArrStoreToArray;
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store, Selector<X509CertificateHolder> selector) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Collection matches = store.getMatches(selector);
        int size = matches.size();
        if (i3 == 0) {
            return (X509CertificateHolder[]) matches.toArray(new X509CertificateHolder[size]);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (org.bouncycastle.est.ESTService.illegalParts.contains(r7) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (org.bouncycastle.est.ESTService.illegalParts.contains(r7) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r1 = org.bouncycastle.est.ESTService.onTransact + 71;
        org.bouncycastle.est.ESTService.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Label " + r7 + " is a reserved path segment.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String verifyLabel(String str) {
        int i = 2 % 2;
        while (str.endsWith("/")) {
            int i2 = onTransact + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() <= 0) {
                break;
            }
            int i4 = onNavigationEvent + 7;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str = str.substring(0, str.length() - 1);
        }
        while (str.startsWith("/") && str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Label set but after trimming '/' is not zero length string.");
        }
        int i6 = onNavigationEvent + 13;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        if (!pathInValid.matcher(str).matches()) {
            throw new IllegalArgumentException("Server path " + str + " contains invalid characters");
        }
        int i8 = onTransact + 45;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 45 / 0;
        }
    }

    private String verifyServer(String str) throws Throwable {
        int i = 2 % 2;
        while (str.endsWith("/") && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
                int i2 = onTransact + 103;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 2;
                }
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    int i4 = onTransact + 37;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    throw ((IllegalArgumentException) e);
                }
                throw new IllegalArgumentException("Scheme and host is invalid: " + e.getMessage(), e);
            }
        }
        if (str.contains("://")) {
            throw new IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily.");
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1, 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) View.resolveSizeAndState(0, 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        URL url = new URL(sb.toString());
        if (url.getPath().length() != 0 && !url.getPath().equals("/")) {
            throw new IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:68|4|5|(2:7|(2:9|(3:(1:24)(1:25)|26|27)(3:72|13|(1:19)(7:17|18|34|66|35|36|(2:39|(2:41|(1:43)(1:44))(2:45|46))(1:47))))(3:28|29|30))(2:31|(2:48|49))|33|34|66|35|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016e, code lost:
    
        r5 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CACertsResponse getCACerts() throws ESTException {
        Store<X509CertificateHolder> certificates;
        Store<X509CRLHolder> cRLs;
        String str;
        int i = 2 % 2;
        ESTResponse eSTResponse = null;
        try {
            URL url = new URL(this.server + CACERTS);
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            Object[] objArr = new Object[1];
            a(7 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 52208), objArr);
            ESTRequest eSTRequestBuild = new ESTRequestBuilder(((String) objArr[0]).intern(), url).withClient(eSTClientMakeClient).build();
            ESTResponse eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuild);
            try {
                if (eSTResponseDoRequest.getStatusCode() == 200) {
                    int i2 = onNavigationEvent + 93;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        eSTResponseDoRequest.getHeaders().getFirstValue("Content-Type");
                        eSTResponse.hashCode();
                        throw null;
                    }
                    String firstValue = eSTResponseDoRequest.getHeaders().getFirstValue("Content-Type");
                    if (firstValue == null || !firstValue.startsWith("application/pkcs7-mime")) {
                        if (firstValue == null) {
                            int i3 = onNavigationEvent + 3;
                            onTransact = i3 % 128;
                            int i4 = i3 % 2;
                            str = " but was not present.";
                        } else {
                            str = " got " + firstValue;
                        }
                        throw new ESTException("Response : " + url.toString() + "Expecting application/pkcs7-mime " + str, null, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                    try {
                        if (eSTResponseDoRequest.getContentLength() != null && eSTResponseDoRequest.getContentLength().longValue() > 0) {
                            SimplePKIResponse simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance(new ASN1InputStream(eSTResponseDoRequest.getInputStream()).readObject()));
                            certificates = simplePKIResponse.getCertificates();
                            cRLs = simplePKIResponse.getCRLs();
                            CACertsResponse cACertsResponse = new CACertsResponse(certificates, cRLs, eSTRequestBuild, eSTResponseDoRequest.getSource(), this.clientProvider.isTrusted());
                            eSTResponseDoRequest.close();
                            e = null;
                            if (e != null) {
                                return cACertsResponse;
                            }
                            if (!(e instanceof ESTException)) {
                                throw new ESTException("Get CACerts: " + url.toString(), e, eSTResponseDoRequest.getStatusCode(), null);
                            }
                            int i5 = onTransact + 73;
                            onNavigationEvent = i5 % 128;
                            ESTException eSTException = (ESTException) e;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            throw eSTException;
                        }
                        int i6 = onTransact + 5;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        throw new ESTException("Decoding CACerts: " + url.toString() + " " + th.getMessage(), th, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                } else if (eSTResponseDoRequest.getStatusCode() != 204) {
                    throw new ESTException("Get CACerts: " + url.toString(), null, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                }
                certificates = null;
                cRLs = null;
                CACertsResponse cACertsResponse2 = new CACertsResponse(certificates, cRLs, eSTRequestBuild, eSTResponseDoRequest.getSource(), this.clientProvider.isTrusted());
                eSTResponseDoRequest.close();
                e = null;
                if (e != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                eSTResponse = eSTResponseDoRequest;
                try {
                    if (th instanceof ESTException) {
                        throw th;
                    }
                    throw new ESTException(th.getMessage(), th);
                } catch (Throwable th3) {
                    if (eSTResponse != null) {
                        try {
                            eSTResponse.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = new java.net.URL(r10.server + org.bouncycastle.est.ESTService.CSRATTRS);
        r4 = r10.clientProvider.makeClient();
        r9 = new java.lang.Object[1];
        a(8 - android.view.View.resolveSize(0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52208), r9);
        r5 = new org.bouncycastle.est.ESTRequestBuilder(((java.lang.String) r9[0]).intern(), r3).withClient(r4).build();
        r4 = r4.doRequest(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        r6 = r4.getStatusCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (r6 == 200) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        r3 = org.bouncycastle.est.ESTService.onNavigationEvent + 97;
        org.bouncycastle.est.ESTService.onTransact = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if ((r3 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r6 == 26027) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (r6 == 204) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r6 != 404) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        throw new org.bouncycastle.est.ESTException("CSR Attribute request: " + r5.getURL().toString(), null, r4.getStatusCode(), r4.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if (r4.getContentLength() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r5 = org.bouncycastle.est.ESTService.onNavigationEvent + 123;
        org.bouncycastle.est.ESTService.onTransact = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if ((r5 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r4.getContentLength().longValue() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        if (r4.getContentLength().longValue() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        r6 = new org.bouncycastle.est.CSRAttributesResponse(org.bouncycastle.asn1.est.CsrAttrs.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(r4.getInputStream()).readObject())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
    
        if (r0 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
    
        if (r0 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        throw ((org.bouncycastle.est.ESTException) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        throw new org.bouncycastle.est.ESTException(r3.getMessage(), r3, r4.getStatusCode(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0140, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016f, code lost:
    
        throw new org.bouncycastle.est.ESTException("Decoding CACerts: " + r3.toString() + " " + r1.getMessage(), r1, r4.getStatusCode(), r4.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0172, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r10.clientProvider.isTrusted() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        r4 = null;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0178, code lost:
    
        if ((r1 instanceof org.bouncycastle.est.ESTException) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        throw new org.bouncycastle.est.ESTException(r1.getMessage(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0187, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        if (r4 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        r2 = org.bouncycastle.est.ESTService.onNavigationEvent + 89;
        org.bouncycastle.est.ESTService.onTransact = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0196, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019e, code lost:
    
        throw new java.lang.IllegalStateException("No trust anchors.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r10.clientProvider.isTrusted() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CSRRequestResponse getCSRAttributes() throws ESTException {
        ESTResponse eSTResponseDoRequest;
        CSRAttributesResponse cSRAttributesResponse;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        if (e == null) {
            return new CSRRequestResponse(cSRAttributesResponse, eSTResponseDoRequest.getSource());
        }
        int i4 = onNavigationEvent + 77;
        onTransact = i4 % 128;
        boolean z = e instanceof ESTException;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = r12.getHeader("Retry-After");
        r3 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r1 = r12.getHeader("Retry-After");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        r3 = org.bouncycastle.est.ESTService.onTransact + 101;
        org.bouncycastle.est.ESTService.onNavigationEvent = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r7 = java.lang.System.currentTimeMillis() + (java.lang.Long.parseLong(r1) * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r0 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        r0.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("GMT"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r7 = r0.parse(r1).getTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw new org.bouncycastle.est.ESTException("Unable to parse Retry-After header:" + r9.getURL().toString() + " " + r0.getMessage(), null, r12.getStatusCode(), r12.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        throw new org.bouncycastle.est.ESTException("Got Status 202 but not Retry-After header from: " + r9.getURL().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        if (r12.getStatusCode() != 200) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        return new org.bouncycastle.est.EnrollmentResponse(new org.bouncycastle.cmc.SimplePKIResponse(org.bouncycastle.asn1.cms.ContentInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(r12.getInputStream()).readObject())).getCertificates(), -1, null, r12.getSource());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        throw new org.bouncycastle.est.ESTException(r12.getMessage(), r12.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013d, code lost:
    
        throw new org.bouncycastle.est.ESTException("Simple Enroll: " + r1.getURL().toString(), null, r12.getStatusCode(), r12.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r12.getStatusCode() == 10341) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r12.getStatusCode() == 202) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r9 = r1;
        r1 = org.bouncycastle.est.ESTService.onNavigationEvent + 103;
        org.bouncycastle.est.ESTService.onTransact = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected EnrollmentResponse handleEnrollResponse(ESTResponse eSTResponse) throws IOException {
        ESTRequest originalRequest;
        ESTRequest eSTRequest;
        long time;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            originalRequest = eSTResponse.getOriginalRequest();
        } else {
            originalRequest = eSTResponse.getOriginalRequest();
        }
        return new EnrollmentResponse(null, time, eSTRequest, eSTResponse.getSource());
    }

    public EnrollmentResponse simpleEnroll(EnrollmentResponse enrollmentResponse) throws Exception {
        ESTResponse eSTResponseDoRequest;
        int i = 2 % 2;
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        Object obj = null;
        try {
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            eSTResponseDoRequest = eSTClientMakeClient.doRequest(new ESTRequestBuilder(enrollmentResponse.getRequestToRetry()).withClient(eSTClientMakeClient).build());
            try {
                EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
                if (eSTResponseDoRequest != null) {
                    int i2 = onTransact + 87;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    eSTResponseDoRequest.close();
                }
                int i4 = onNavigationEvent + 125;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return enrollmentResponseHandleEnrollResponse;
            } catch (Throwable th) {
                th = th;
                try {
                    if (th instanceof ESTException) {
                        throw th;
                    }
                    throw new ESTException(th.getMessage(), th);
                } catch (Throwable th2) {
                    if (eSTResponseDoRequest != null) {
                        int i6 = onTransact + 105;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        eSTResponseDoRequest.close();
                        if (i7 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            eSTResponseDoRequest = null;
        }
    }

    public EnrollmentResponse simpleEnroll(boolean z, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onTransact = i2 % 128;
        ESTResponse eSTResponseDoRequest = null;
        if (i2 % 2 == 0) {
            this.clientProvider.isTrusted();
            throw null;
        }
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        try {
            byte[] bytes = annotateRequest(pKCS10CertificationRequest.getEncoded()).getBytes();
            StringBuilder sb = new StringBuilder();
            sb.append(this.server);
            if (z) {
                str = SIMPLE_REENROLL;
            } else {
                int i3 = onNavigationEvent + 25;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                str = SIMPLE_ENROLL;
            }
            sb.append(str);
            URL url = new URL(sb.toString());
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionType(0L) + 11, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            ESTRequestBuilder eSTRequestBuilderWithClient = new ESTRequestBuilder(((String) objArr[0]).intern(), url).withData(bytes).withClient(eSTClientMakeClient);
            eSTRequestBuilderWithClient.addHeader("Content-Type", "application/pkcs10");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bytes.length);
            eSTRequestBuilderWithClient.addHeader("Content-Length", sb2.toString());
            eSTRequestBuilderWithClient.addHeader("Content-Transfer-Encoding", "base64");
            if (eSTAuth != null) {
                eSTAuth.applyAuth(eSTRequestBuilderWithClient);
            }
            eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuilderWithClient.build());
            EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
            if (eSTResponseDoRequest != null) {
                int i5 = onTransact + 5;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                eSTResponseDoRequest.close();
            }
            return enrollmentResponseHandleEnrollResponse;
        } catch (Throwable th) {
            try {
                if (!(th instanceof ESTException)) {
                    throw new ESTException(th.getMessage(), th);
                }
                int i7 = onTransact + 105;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    throw th;
                }
                int i8 = 10 / 0;
                throw th;
            } catch (Throwable th2) {
                if (eSTResponseDoRequest != null) {
                    int i9 = onTransact + 103;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    eSTResponseDoRequest.close();
                }
                throw th2;
            }
        }
    }

    public EnrollmentResponse simpleEnrollPoP(boolean z, final PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, final ContentSigner contentSigner, ESTAuth eSTAuth) throws IOException {
        ESTResponse eSTResponse;
        String str;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            this.clientProvider.isTrusted();
            throw null;
        }
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.server);
            if (z) {
                str = SIMPLE_REENROLL;
                i = onTransact + 43;
                i2 = i % 128;
            } else {
                str = SIMPLE_ENROLL;
                i = onTransact + 49;
                i2 = i % 128;
            }
            onNavigationEvent = i2;
            int i5 = i % 2;
            sb.append(str);
            URL url = new URL(sb.toString());
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            Object[] objArr = new Object[1];
            a(11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 4, (char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), objArr);
            ESTRequestBuilder eSTRequestBuilderWithConnectionListener = new ESTRequestBuilder(((String) objArr[0]).intern(), url).withClient(eSTClientMakeClient).withConnectionListener(new ESTSourceConnectionListener() { // from class: org.bouncycastle.est.ESTService.1
                @Override // org.bouncycastle.est.ESTSourceConnectionListener
                public ESTRequest onConnection(Source source, ESTRequest eSTRequest) throws IOException {
                    if (source instanceof TLSUniqueProvider) {
                        TLSUniqueProvider tLSUniqueProvider = (TLSUniqueProvider) source;
                        if (tLSUniqueProvider.isTLSUniqueAvailable()) {
                            PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder2 = new PKCS10CertificationRequestBuilder(pKCS10CertificationRequestBuilder);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            pKCS10CertificationRequestBuilder2.setAttribute(PKCSObjectIdentifiers.pkcs_9_at_challengePassword, new DERPrintableString(Base64.toBase64String(tLSUniqueProvider.getTLSUnique())));
                            byteArrayOutputStream.write(ESTService.access$000(ESTService.this, pKCS10CertificationRequestBuilder2.build(contentSigner).getEncoded()).getBytes());
                            byteArrayOutputStream.flush();
                            ESTRequestBuilder eSTRequestBuilderWithData = new ESTRequestBuilder(eSTRequest).withData(byteArrayOutputStream.toByteArray());
                            eSTRequestBuilderWithData.setHeader("Content-Type", "application/pkcs10");
                            eSTRequestBuilderWithData.setHeader("Content-Transfer-Encoding", "base64");
                            eSTRequestBuilderWithData.setHeader("Content-Length", Long.toString(byteArrayOutputStream.size()));
                            return eSTRequestBuilderWithData.build();
                        }
                    }
                    throw new IOException("Source does not supply TLS unique.");
                }
            });
            if (eSTAuth != null) {
                eSTAuth.applyAuth(eSTRequestBuilderWithConnectionListener);
                int i6 = onNavigationEvent + 29;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
            ESTResponse eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuilderWithConnectionListener.build());
            try {
                EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
                if (eSTResponseDoRequest != null) {
                    int i8 = onNavigationEvent + 83;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    eSTResponseDoRequest.close();
                    int i10 = onTransact + 27;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                }
                return enrollmentResponseHandleEnrollResponse;
            } catch (Throwable th) {
                eSTResponse = eSTResponseDoRequest;
                th = th;
                try {
                    if (!(th instanceof ESTException)) {
                        throw new ESTException(th.getMessage(), th);
                    }
                    int i12 = onNavigationEvent + 35;
                    onTransact = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw th;
                    }
                    ESTException eSTException = th;
                    throw null;
                } catch (Throwable th2) {
                    if (eSTResponse != null) {
                        int i13 = onTransact + 25;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        eSTResponse.close();
                        if (i14 != 0) {
                            int i15 = 31 / 0;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            eSTResponse = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = $11 + 125;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59697), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 17, ((byte) KeyEvent.getModifierMetaStateMask()) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ((byte) KeyEvent.getModifierMetaStateMask())), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 44, 1494 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $10 + 81;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myPid() >> 22)), 44 - Drawable.resolveOpacity(0, 0), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{60860, 26926, 58556, 24590, 65439, 31528, 63151, 29209, 9827, 41711, 12140, 60804, 26901, 58523, 24618};
        onWarmupCompleted = 9143876675798264154L;
    }
}
