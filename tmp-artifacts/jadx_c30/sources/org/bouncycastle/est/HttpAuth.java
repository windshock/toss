package org.bouncycastle.est;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class HttpAuth implements ESTAuth {
    private static int IAuthTabCallback;
    private static final DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder;
    private static int onExtraCallback;
    private static final Set<String> validParts;
    private final DigestCalculatorProvider digestCalculatorProvider;
    private final SecureRandom nonceGenerator;
    private final char[] password;
    private final String realm;
    private final String username;
    private static final byte[] $$a = {ISO7816.INS_VERIFY, 13, ISO7816.INS_GET_DATA, -47};
    private static final int $$b = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 105 - (i * 3);
        int i5 = s * 3;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i9 = i6 + 1;
            i8 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i9;
            i6 = bArr[i9];
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i92 = i6 + 1;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i922 = i6 + 1;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        IAuthTabCallback = 1;
        onExtraCallback();
        digestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        HashSet hashSet = new HashSet();
        hashSet.add("realm");
        Object[] objArr = new Object[1];
        a(6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{5, 4, 65529, 65531, 4}, false, 300 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr);
        hashSet.add(((String) objArr[0]).intern());
        hashSet.add("opaque");
        hashSet.add("algorithm");
        hashSet.add("qop");
        validParts = Collections.unmodifiableSet(hashSet);
        int i = onNavigationEvent + 39;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    public HttpAuth(String str, String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    public HttpAuth(String str, String str2, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this.realm = str;
        this.username = str2;
        this.password = cArr;
        this.nonceGenerator = secureRandom;
        this.digestCalculatorProvider = digestCalculatorProvider;
    }

    public HttpAuth(String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public HttpAuth(String str, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this(null, str, cArr, secureRandom, digestCalculatorProvider);
    }

    static /* synthetic */ ESTResponse access$000(HttpAuth httpAuth, ESTResponse eSTResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ESTResponse eSTResponseDoDigestFunction = httpAuth.doDigestFunction(eSTResponse);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return eSTResponseDoDigestFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String access$100(HttpAuth httpAuth) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = httpAuth.realm;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ String access$200(HttpAuth httpAuth) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = httpAuth.username;
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        int i6 = i2 + 121;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static /* synthetic */ char[] access$300(HttpAuth httpAuth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = httpAuth.password;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return cArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x012d, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0134, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013a, code lost:
    
        if (r2.length() == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        r2 = org.bouncycastle.util.Strings.toLowerCase(r2).split(",");
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0147, code lost:
    
        r21 = r13;
        r22 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
    
        if (r11 == r2.length) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
    
        r15 = org.bouncycastle.est.HttpAuth.onExtraCallbackWithResult + 11;
        r23 = r12;
        org.bouncycastle.est.HttpAuth.onWarmupCompleted = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015e, code lost:
    
        if ((r15 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0160, code lost:
    
        r15 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016c, code lost:
    
        if (r2[r11].equals(o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0177, code lost:
    
        if ((!r2[r11].equals(o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH)) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        if (r2[r11].equals("auth-int") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019b, code lost:
    
        throw new org.bouncycastle.est.ESTException("QoP value unknown: '" + r11 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        r13 = r2[r11].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a6, code lost:
    
        if (r10.contains(r13) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a8, code lost:
    
        r10.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
    
        r11 = r11 + 1;
        r13 = r21;
        r14 = r22;
        r12 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b4, code lost:
    
        r23 = r12;
        r2 = lookupDigest(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ba, code lost:
    
        if (r2 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
    
        if (r2.getAlgorithm() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r8 = getDigestCalculator(r0, r2);
        r11 = r8.getOutputStream();
        r12 = makeNonce(10);
        update(r11, r30.username);
        update(r11, ":");
        update(r11, r9);
        update(r11, ":");
        update(r11, r30.password);
        r11.close();
        r7 = r8.getDigest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f5, code lost:
    
        if (r0.endsWith("-SESS") == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f8, code lost:
    
        r8 = getDigestCalculator(r0, r2);
        r11 = r8.getOutputStream();
        update(r11, org.bouncycastle.util.encoders.Hex.toHexString(r7));
        update(r11, ":");
        update(r11, r4);
        update(r11, ":");
        update(r11, r12);
        r11.close();
        r7 = r8.getDigest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021a, code lost:
    
        r7 = org.bouncycastle.util.encoders.Hex.toHexString(r7);
        r8 = getDigestCalculator(r0, r2);
        r11 = r8.getOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0239, code lost:
    
        if ((!((java.lang.String) r10.get(0)).equals("auth-int")) == true) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023b, code lost:
    
        r9 = getDigestCalculator(r0, r2);
        r13 = r9.getOutputStream();
        r5.writeData(r13);
        r13.close();
        r9 = r9.getDigest();
        update(r11, r6);
        update(r11, ":");
        update(r11, r3);
        update(r11, ":");
        update(r11, org.bouncycastle.util.encoders.Hex.toHexString(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026c, code lost:
    
        if (((java.lang.String) r10.get(0)).equals(o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026e, code lost:
    
        update(r11, r6);
        update(r11, ":");
        update(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0277, code lost:
    
        r11.close();
        r6 = org.bouncycastle.util.encoders.Hex.toHexString(r8.getDigest());
        r2 = getDigestCalculator(r0, r2);
        r8 = r2.getOutputStream();
        r9 = r10.contains("missing");
        update(r8, r7);
        update(r8, ":");
        update(r8, r4);
        update(r8, ":");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029e, code lost:
    
        if (r9 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a0, code lost:
    
        r9 = "auth-int";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a3, code lost:
    
        update(r8, "00000001");
        update(r8, ":");
        update(r8, r12);
        update(r8, ":");
        r9 = "auth-int";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02bc, code lost:
    
        if (((java.lang.String) r10.get(0)).equals(r9) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02be, code lost:
    
        update(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02c2, code lost:
    
        update(r8, o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c5, code lost:
    
        update(r8, ":");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02c8, code lost:
    
        update(r8, r6);
        r8.close();
        r2 = org.bouncycastle.util.encoders.Hex.toHexString(r2.getDigest());
        r6 = new java.util.HashMap();
        r6.put("username", r30.username);
        r6.put("realm", r9);
        r15 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4, new char[]{5, 4, 65529, 65531, 4}, false, 300 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r15);
        r6.put(((java.lang.String) r15[0]).intern(), r4);
        r13 = new java.lang.Object[1];
        a(3 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), -((byte) android.view.KeyEvent.getModifierMetaStateMask()), new char[]{5, 65529, 2}, true, android.text.TextUtils.indexOf(net.sf.scuba.smartcards.BuildConfig.FLAVOR, net.sf.scuba.smartcards.BuildConfig.FLAVOR) + 306, r13);
        r6.put(((java.lang.String) r13[0]).intern(), r3);
        r6.put("response", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x036f, code lost:
    
        if (((java.lang.String) r10.get(0)).equals(r9) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0371, code lost:
    
        r6.put(r23, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0383, code lost:
    
        if (((java.lang.String) r10.get(0)).equals(o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0385, code lost:
    
        r6.put(r23, o.verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_AUTH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0388, code lost:
    
        r6.put("nc", "00000001");
        r6.put("cnonce", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0392, code lost:
    
        r6.put(r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0397, code lost:
    
        if (r21 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x039d, code lost:
    
        if (r21.length() != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x039f, code lost:
    
        r6.put("opaque", makeNonce(20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03aa, code lost:
    
        r0 = new org.bouncycastle.est.ESTRequestBuilder(r5).withHijacker(null);
        r0.setHeader("Authorization", org.bouncycastle.est.HttpUtil.mergeCSL("Digest", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03cb, code lost:
    
        return r5.getClient().doRequest(r0.build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03e2, code lost:
    
        throw new java.io.IOException("auth digest algorithm unknown: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03ea, code lost:
    
        throw new org.bouncycastle.est.ESTException("QoP value is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03f2, code lost:
    
        throw new org.bouncycastle.est.ESTException("Qop is not defined in WWW-Authenticate header.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ESTResponse doDigestFunction(ESTResponse eSTResponse) throws Throwable {
        String upperCase;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        eSTResponse.close();
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        try {
            Map<String, String> mapSplitCSL = HttpUtil.splitCSL("Digest", eSTResponse.getHeader("WWW-Authenticate"));
            try {
                String path = originalRequest.getURL().toURI().getPath();
                for (String str : mapSplitCSL.keySet()) {
                    if (!validParts.contains(str)) {
                        throw new ESTException("Unrecognised entry in WWW-Authenticate header: '" + ((Object) str) + "'");
                    }
                }
                String method = originalRequest.getMethod();
                String str2 = mapSplitCSL.get("realm");
                Object[] objArr = new Object[1];
                a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, 4 - Color.red(0), new char[]{5, 4, 65529, 65531, 4}, false, 299 - ExpandableListView.getPackedPositionChild(0L), objArr);
                String str3 = mapSplitCSL.get(((String) objArr[0]).intern());
                String str4 = mapSplitCSL.get("opaque");
                String str5 = "algorithm";
                String str6 = mapSplitCSL.get("algorithm");
                String str7 = "qop";
                String str8 = mapSplitCSL.get("qop");
                ArrayList arrayList = new ArrayList();
                String str9 = this.realm;
                if (str9 != null && !str9.equals(str2)) {
                    throw new ESTException("Supplied realm '" + this.realm + "' does not match server realm '" + str2 + "'", null, 401, null);
                }
                if (str6 == null) {
                    int i4 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    str6 = "MD5";
                    if (i4 % 2 != 0) {
                        int i5 = 77 / 0;
                    }
                }
                if (str6.length() == 0) {
                    throw new ESTException("WWW-Authenticate no algorithm defined.");
                }
                int i6 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    upperCase = Strings.toUpperCase(str6);
                    int i7 = 91 / 0;
                } else {
                    upperCase = Strings.toUpperCase(str6);
                }
            } catch (Exception e) {
                throw new IOException("unable to process URL in request: " + e.getMessage());
            }
        } catch (Throwable th) {
            throw new ESTException("Parsing WWW-Authentication header: " + th.getMessage(), th, eSTResponse.getStatusCode(), new ByteArrayInputStream(eSTResponse.getHeader("WWW-Authenticate").getBytes()));
        }
    }

    private DigestCalculator getDigestCalculator(String str, AlgorithmIdentifier algorithmIdentifier) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return this.digestCalculatorProvider.get(algorithmIdentifier);
            }
            this.digestCalculatorProvider.get(algorithmIdentifier);
            throw null;
        } catch (OperatorCreationException e) {
            throw new IOException("cannot create digest calculator for " + str + ": " + e.getMessage());
        }
    }

    private AlgorithmIdentifier lookupDigest(String str) {
        int i = 2 % 2;
        if (str.endsWith("-SESS")) {
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            str = str.substring(0, str.length() - 5);
            int i4 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        if (str.equals("SHA-512-256")) {
            return digestAlgorithmIdentifierFinder.find(NISTObjectIdentifiers.id_sha512_256);
        }
        AlgorithmIdentifier algorithmIdentifierFind = digestAlgorithmIdentifierFinder.find(str);
        int i6 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return algorithmIdentifierFind;
    }

    private String makeNonce(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[i];
        this.nonceGenerator.nextBytes(bArr);
        String hexString = Hex.toHexString(bArr);
        int i5 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return hexString;
        }
        throw null;
    }

    private void update(OutputStream outputStream, String str) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str);
        if (i3 == 0) {
            outputStream.write(uTF8ByteArray);
        } else {
            outputStream.write(uTF8ByteArray);
            throw null;
        }
    }

    private void update(OutputStream outputStream, char[] cArr) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        if (i3 != 0) {
            outputStream.write(uTF8ByteArray);
        } else {
            outputStream.write(uTF8ByteArray);
            int i4 = 7 / 0;
        }
    }

    @Override // org.bouncycastle.est.ESTAuth
    public void applyAuth(ESTRequestBuilder eSTRequestBuilder) {
        int i = 2 % 2;
        eSTRequestBuilder.withHijacker(new ESTHijacker() { // from class: org.bouncycastle.est.HttpAuth.1
            @Override // org.bouncycastle.est.ESTHijacker
            public ESTResponse hijack(ESTRequest eSTRequest, Source source) throws IOException {
                ESTResponse eSTResponse = new ESTResponse(eSTRequest, source);
                if (eSTResponse.getStatusCode() != 401) {
                    return eSTResponse;
                }
                String header = eSTResponse.getHeader("WWW-Authenticate");
                if (header == null) {
                    throw new ESTException("Status of 401 but no WWW-Authenticate header");
                }
                String lowerCase = Strings.toLowerCase(header);
                if (lowerCase.startsWith("digest")) {
                    return HttpAuth.access$000(HttpAuth.this, eSTResponse);
                }
                if (!lowerCase.startsWith("basic")) {
                    throw new ESTException("Unknown auth mode: " + lowerCase);
                }
                eSTResponse.close();
                Map<String, String> mapSplitCSL = HttpUtil.splitCSL("Basic", eSTResponse.getHeader("WWW-Authenticate"));
                if (HttpAuth.access$100(HttpAuth.this) != null && !HttpAuth.access$100(HttpAuth.this).equals(mapSplitCSL.get("realm"))) {
                    throw new ESTException("Supplied realm '" + HttpAuth.access$100(HttpAuth.this) + "' does not match server realm '" + mapSplitCSL.get("realm") + "'", null, 401, null);
                }
                ESTRequestBuilder eSTRequestBuilderWithHijacker = new ESTRequestBuilder(eSTRequest).withHijacker(null);
                if (HttpAuth.access$100(HttpAuth.this) != null && HttpAuth.access$100(HttpAuth.this).length() > 0) {
                    eSTRequestBuilderWithHijacker.setHeader("WWW-Authenticate", "Basic realm=\"" + HttpAuth.access$100(HttpAuth.this) + "\"");
                }
                if (HttpAuth.access$200(HttpAuth.this).contains(":")) {
                    throw new IllegalArgumentException("User must not contain a ':'");
                }
                char[] cArr = new char[HttpAuth.access$200(HttpAuth.this).length() + 1 + HttpAuth.access$300(HttpAuth.this).length];
                System.arraycopy(HttpAuth.access$200(HttpAuth.this).toCharArray(), 0, cArr, 0, HttpAuth.access$200(HttpAuth.this).length());
                cArr[HttpAuth.access$200(HttpAuth.this).length()] = ':';
                System.arraycopy(HttpAuth.access$300(HttpAuth.this), 0, cArr, HttpAuth.access$200(HttpAuth.this).length() + 1, HttpAuth.access$300(HttpAuth.this).length);
                eSTRequestBuilderWithHijacker.setHeader("Authorization", "Basic " + Base64.toBase64String(Strings.toByteArray(cArr)));
                ESTResponse eSTResponseDoRequest = eSTRequest.getClient().doRequest(eSTRequestBuilderWithHijacker.build());
                Arrays.fill(cArr, (char) 0);
                return eSTResponseDoRequest;
            }
        });
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Object obj;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35124), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, 10278 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), 54 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $11 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf(BuildConfig.FLAVOR, c)), 55 - View.MeasureSpec.getMode(0), 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    c = '0';
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i9 = $11 + 69;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = 478309099;
    }
}
