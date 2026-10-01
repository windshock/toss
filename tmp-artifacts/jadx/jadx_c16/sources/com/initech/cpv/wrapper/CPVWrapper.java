package com.initech.cpv.wrapper;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.initech.asn1.ASN1OID;
import com.initech.cpv.CertPathContext;
import com.initech.cpv.CertPathValidateResult;
import com.initech.cpv.CertPathValidator;
import com.initech.cpv.builder.CertPathBuilder;
import com.initech.cpv.builder.impl.DefaultCertPathBuilderParameters;
import com.initech.cpv.manager.CertStatusManager;
import com.initech.cpv.manager.TrustManager;
import com.initech.cpv.manager.impl.CRLCertStatusManagerParameters;
import com.initech.cpv.manager.impl.DefaultTrustManagerParameters;
import com.initech.cpv.util.CertUtil;
import com.initech.cpv.util.PropertyUtil;
import com.initech.x509.CRLs;
import com.initech.x509.X509CRLImpl;
import com.initech.x509.extensions.PolicyInfo;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CPVWrapper {
    private static CPVWrapperManager A;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private Properties a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3o;
    private boolean p;
    private ASN1OID[] q;
    private ArrayList r;
    private CRLs s;
    private CRLs t;
    private int u;
    private boolean v;
    private String w;
    private int[] x;
    private boolean y;
    private String z;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3;
        int i4 = (b * 3) + 1;
        int i5 = s + 4;
        byte[] bArr = $$a;
        ?? r9 = b2 + 109;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b3 = r9;
            i3 = 0;
            int i6 = i5;
            int i7 = i5 + b3;
            i = i3;
            int i8 = i6;
            i2 = i7;
            i5 = i8;
            int i9 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            b3 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i5 = i10;
            int i72 = i5 + b3;
            i = i3;
            int i82 = i6;
            i2 = i72;
            i5 = i82;
            int i92 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r9;
            int i922 = i5 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i4) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        IAuthTabCallback();
        A = CPVWrapperManager.getInstance();
        int i = IAuthTabCallback + 53;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public CPVWrapper(Properties properties, String str) throws Throwable {
        Object[] objArr = new Object[1];
        B((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 57561), 1402909120 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{1124}, new char[]{25424, 62044, 29247, 23868}, new char[]{49306, 40625, 55635, 16864}, objArr);
        this.z = ((String) objArr[0]).intern();
        this.b = str;
        this.a = properties;
        try {
            b();
        } catch (Exception unused) {
        }
    }

    private CertPathContext a(X509Certificate x509Certificate, Date date, TrustManager trustManager, CertStatusManager certStatusManager) throws InvalidAlgorithmParameterException {
        DefaultCertPathBuilderParameters defaultCertPathBuilderParameters;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CertPathBuilder certPathBuilder = null;
        if (this.f.equals("Default")) {
            defaultCertPathBuilderParameters = new DefaultCertPathBuilderParameters();
            ArrayList arrayList = new ArrayList();
            while (true) {
                arrayList.add(x509Certificate);
                X509Certificate x509CertificateFindIssuerCert = trustManager.findIssuerCert(x509Certificate);
                if (x509CertificateFindIssuerCert == null || !(!x509CertificateFindIssuerCert.equals(x509Certificate)) || (this.u > 0 && arrayList.size() >= this.u)) {
                    break;
                }
                x509Certificate = x509CertificateFindIssuerCert;
            }
            defaultCertPathBuilderParameters.setCertChainList(arrayList);
            defaultCertPathBuilderParameters.setTrustManager(trustManager);
            defaultCertPathBuilderParameters.setCertStatusChecker(certStatusManager);
            defaultCertPathBuilderParameters.setCheckCertStatus(this.n);
            defaultCertPathBuilderParameters.setVerifyCertSign(this.f3o);
            defaultCertPathBuilderParameters.setIgnoreUndeterminedCertStatus(this.p);
            defaultCertPathBuilderParameters.setInitialAnyPolicyInhibit(this.m);
            defaultCertPathBuilderParameters.setInitialExplicitPolicy(this.l);
            defaultCertPathBuilderParameters.setInitialPolicyMappingInhibit(this.k);
            defaultCertPathBuilderParameters.setCurrentTime(date);
            defaultCertPathBuilderParameters.addUserInitialPolicy(PolicyInfo.anyPolicy);
            defaultCertPathBuilderParameters.setHSMUseable(this.z);
            int i4 = IAuthTabCallbackDefault + 73;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            defaultCertPathBuilderParameters = null;
        }
        try {
            certPathBuilder = CertPathBuilder.getInstance(this.f);
        } catch (NoSuchAlgorithmException unused) {
        }
        return certPathBuilder.build(defaultCertPathBuilderParameters);
    }

    private void b() throws Exception {
        int i = 2 % 2;
        String str = this.b + ".";
        Properties properties = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        B((char) (58267 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0), new char[]{42346, 47958, 63447, 34636}, new char[]{25424, 62044, 29247, 23868}, new char[]{59553, 31725, 39639, 40419}, objArr);
        sb.append(((String) objArr[0]).intern());
        String string = sb.toString();
        Object obj = null;
        String string2 = PropertyUtil.getString(properties, string, (String) null);
        this.c = string2;
        if (string2 == null) {
            throw new IllegalArgumentException("Category " + this.b + " does not exist.");
        }
        Object[] objArr2 = new Object[1];
        B((char) (57562 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1402909119 - TextUtils.lastIndexOf("", '0', 0), new char[]{1124}, new char[]{25424, 62044, 29247, 23868}, new char[]{49306, 40625, 55635, 16864}, objArr2);
        this.z = PropertyUtil.getString(this.a, str + "HSMUseSelecte", ((String) objArr2[0]).intern());
        this.g = PropertyUtil.getBoolean(this.a, str + "verifyCrl", true);
        this.h = PropertyUtil.getBoolean(this.a, str + "useDeltaCRL", false);
        this.i = PropertyUtil.getBoolean(this.a, str + "ignoreOldVerCert", true);
        this.j = PropertyUtil.getBoolean(this.a, str + "ignoreCACert", true);
        this.k = PropertyUtil.getBoolean(this.a, str + "initialPolicyMappingInhibit", false);
        this.l = PropertyUtil.getBoolean(this.a, str + "initialExplicitPolicy", true);
        this.m = PropertyUtil.getBoolean(this.a, str + "initialAnyPolicyInhibit", false);
        this.n = PropertyUtil.getBoolean(this.a, str + "checkCertStatus", true);
        this.f3o = PropertyUtil.getBoolean(this.a, str + "verifyCertSign", true);
        this.p = PropertyUtil.getBoolean(this.a, str + "ignoreUndeterminedCertStatus", false);
        this.v = PropertyUtil.getBoolean(this.a, str + "lookUpCRLWithNoDP", false);
        this.u = PropertyUtil.getInt(this.a, str + "maxCertChainLength", 0);
        String[] stringArray = PropertyUtil.getStringArray(this.a, str + "userInitialPolicySet", new String[]{"anyPolicy"});
        this.q = new ASN1OID[stringArray.length];
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            this.q[i2] = new ASN1OID(stringArray[i2]);
        }
        String[] stringArray2 = PropertyUtil.getStringArray(this.a, str + "trust_certs", new String[0]);
        this.r = new ArrayList();
        for (int i3 = 0; i3 < stringArray2.length; i3++) {
            File file = new File(stringArray2[i3]);
            if (!file.exists()) {
                throw new Exception("Trust cert file path is wrong. Check please.");
            }
            if (file.isFile()) {
                this.r.add(CertUtil.loadCertificate(stringArray2[i3]));
            } else {
                String[] list = file.list();
                if (list != null) {
                    for (int i4 = 0; i4 < list.length; i4++) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file.getAbsolutePath());
                        String str2 = File.separator;
                        sb2.append(str2);
                        sb2.append(list[i4]);
                        String string3 = sb2.toString();
                        if (new File(string3).isFile() && (string3.toUpperCase().endsWith("PEM") || string3.toUpperCase().endsWith("CER") || string3.toUpperCase().endsWith("DER"))) {
                            this.r.add(CertUtil.loadCertificate(file.getAbsolutePath() + str2 + list[i4]));
                        }
                    }
                }
            }
        }
        String[] stringArray3 = PropertyUtil.getStringArray(this.a, str + "crls", new String[0]);
        this.s = new CRLs();
        for (int i5 = 0; i5 < stringArray3.length; i5++) {
            FileInputStream fileInputStream = new FileInputStream(stringArray3[i5]);
            this.s.add(new X509CRLImpl(fileInputStream));
            fileInputStream.close();
        }
        String[] stringArray4 = PropertyUtil.getStringArray(this.a, str + "delta_crls", new String[0]);
        this.t = new CRLs();
        int i6 = IAuthTabCallbackStub + 15;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < stringArray3.length; i8++) {
            FileInputStream fileInputStream2 = new FileInputStream(stringArray4[i8]);
            this.t.add(new X509CRLImpl(fileInputStream2));
            fileInputStream2.close();
        }
        this.d = PropertyUtil.getString(this.a, str + "trust_manager.alg", "Default");
        this.e = PropertyUtil.getString(this.a, str + "cert_status_manager.alg", "CRL");
        this.f = PropertyUtil.getString(this.a, str + "path_builder.alg", "Default");
        this.y = true;
        int i9 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static CPVWrapper getInstance(String str, String str2) throws Exception {
        CPVWrapper cPVWrapperA;
        synchronized (CPVWrapper.class) {
            cPVWrapperA = A.a(str, str2);
        }
        return cPVWrapperA;
    }

    final void a() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            b();
            int i4 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    public String getBuilderAlg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f;
        int i5 = i2 + 117;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public CRLs getCRLs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CRLs cRLs = this.s;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return cRLs;
    }

    public String getCategory() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.b;
        }
        throw null;
    }

    public String getCertStatusManagerAlg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.e;
        }
        throw null;
    }

    public int[] getConcernedReason() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int[] iArr = this.x;
        int i4 = i3 + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    public String getDefaultDirectoryServerUrl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.w;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public CRLs getDeltaCRLs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CRLs cRLs = this.t;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return cRLs;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.c;
        int i5 = i2 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ArrayList getTrustCerts() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.r;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTrustManagerAlg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.d;
        int i5 = i3 + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public ASN1OID[] getUserInitialPolicySet() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ASN1OID[] asn1oidArr = this.q;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return asn1oidArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isCheckCertStatus() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            z = this.n;
            int i4 = 45 / 0;
        } else {
            z = this.n;
        }
        int i5 = i3 + 25;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public boolean isIgnoreCACert() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 13;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.j;
        int i4 = i2 + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean isIgnoreOldVerCert() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.i;
        int i5 = i2 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public boolean isIgnoreUndeterminedCertStatus() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.p;
        int i5 = i2 + 125;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isInitialAnyPolicyInhibit() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.m;
            int i4 = 69 / 0;
        } else {
            z = this.m;
        }
        int i5 = i2 + 79;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isInitialExplicitPolicy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.l;
        }
        throw null;
    }

    public boolean isInitialPolicyMappingInhibit() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 27;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.k;
            int i4 = 77 / 0;
        } else {
            z = this.k;
        }
        int i5 = i2 + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public boolean isInitialized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.y;
        int i5 = i3 + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public boolean isLookUpCRLWithNoDP() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.v;
        int i5 = i3 + 37;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return z;
    }

    public boolean isUseDeltaCRL() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            z = this.h;
            int i4 = 53 / 0;
        } else {
            z = this.h;
        }
        int i5 = i3 + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public boolean isVerifyCRL() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.g;
        int i4 = i2 + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return z;
    }

    public boolean isVerifyCertSign() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        boolean z = this.f3o;
        int i5 = i3 + 35;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setBuilderAlg(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.f = str;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
    }

    public void setCRLs(CRLs cRLs) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.s = cRLs;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
    }

    public void setCategory(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.b = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setCertStatusManagerAlg(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.e = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setCheckCertStatus(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.n = z;
        int i5 = i2 + 123;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setConcernedReason(int[] iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.x = iArr;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDefaultDirectoryServerUrl(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.w = str;
        int i5 = i3 + 37;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDeltaCRLs(CRLs cRLs) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.t = cRLs;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 43;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setIgnoreCACert(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.j = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 119;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public void setIgnoreOldVerCert(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.i = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIgnoreUndeterminedCertStatus(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.p = z;
        int i5 = i3 + 67;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setInitialAnyPolicyInhibit(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.m = z;
        int i5 = i2 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInitialExplicitPolicy(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.l = z;
        int i5 = i2 + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setInitialPolicyMappingInhibit(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.k = z;
        int i5 = i3 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setLookUpCRLWithNoDP(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 49;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.v = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.c = str;
        int i5 = i2 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTrustCerts(ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.r = arrayList;
        int i5 = i3 + 105;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setTrustManagerAlg(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.d = str;
        int i5 = i2 + 105;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUseDeltaCRL(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.h = z;
        int i5 = i3 + 1;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setUserInitialPolicySet(ASN1OID[] asn1oidArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.q = asn1oidArr;
        int i5 = i2 + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setVerifyCRL(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.g = z;
        int i5 = i2 + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setVerifyCertSign(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.f3o = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 111;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.initech.cpv.exception.PathValidateException] */
    public CertPathValidateResult validate(X509Certificate x509Certificate) {
        int i = 2 % 2;
        CertPathValidateResult certPathValidateResultValidate = validate(x509Certificate, new Date());
        int i2 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return certPathValidateResultValidate;
    }

    public CertPathValidateResult validate(X509Certificate x509Certificate, String str) throws Exception {
        int i = 2 % 2;
        CertPathValidateResult certPathValidateResultValidate = validate(x509Certificate, str, new Date());
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return certPathValidateResultValidate;
    }

    public CertPathValidateResult validate(X509Certificate x509Certificate, String str, Date date) throws Exception {
        DefaultTrustManagerParameters defaultTrustManagerParameters;
        CRLCertStatusManagerParameters cRLCertStatusManagerParameters;
        int i = 2 % 2;
        if (!this.y) {
            throw new IllegalStateException("Wrapper instance not initialized.");
        }
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        DefaultCertPathBuilderParameters defaultCertPathBuilderParameters = null;
        if (i2 % 2 == 0) {
            this.d.equals("Default");
            defaultCertPathBuilderParameters.hashCode();
            throw null;
        }
        if (this.d.equals("Default")) {
            defaultTrustManagerParameters = new DefaultTrustManagerParameters();
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                defaultTrustManagerParameters.addTrustCert((X509Certificate) it.next());
            }
        } else {
            defaultTrustManagerParameters = null;
        }
        TrustManager trustManager = TrustManager.getInstance(this.d, defaultTrustManagerParameters);
        if (this.e.equals("CRL")) {
            cRLCertStatusManagerParameters = new CRLCertStatusManagerParameters();
            if (this.s.size() > 0) {
                int i3 = IAuthTabCallbackStub + 47;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                cRLCertStatusManagerParameters.setUseUserDefinedCRL(true);
                cRLCertStatusManagerParameters.setUserDefinedCompleteCRLs(this.s);
                cRLCertStatusManagerParameters.setUserDefinedDeltaCRLs(this.t);
            }
            cRLCertStatusManagerParameters.setUseDeltaCRL(this.h);
            cRLCertStatusManagerParameters.setIgnoreCACert(this.j);
            cRLCertStatusManagerParameters.setIgnoreOldVersionCert(this.i);
            cRLCertStatusManagerParameters.setVerifyCRL(this.g);
            cRLCertStatusManagerParameters.setCrlIssuerManager(trustManager);
        } else {
            int i5 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            cRLCertStatusManagerParameters = null;
        }
        CertStatusManager certStatusManager = CertStatusManager.getInstance(this.e, cRLCertStatusManagerParameters);
        if (this.f.equals("Default")) {
            defaultCertPathBuilderParameters = new DefaultCertPathBuilderParameters();
            ArrayList arrayList = new ArrayList();
            while (true) {
                arrayList.add(x509Certificate);
                X509Certificate x509CertificateFindIssuerCert = trustManager.findIssuerCert(x509Certificate);
                if (x509CertificateFindIssuerCert == null || x509CertificateFindIssuerCert.equals(x509Certificate)) {
                    break;
                }
                if (this.u > 0) {
                    if (arrayList.size() >= this.u) {
                        break;
                    }
                    int i7 = IAuthTabCallbackDefault + 105;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                }
                x509Certificate = x509CertificateFindIssuerCert;
            }
            defaultCertPathBuilderParameters.setCertChainList(arrayList);
            defaultCertPathBuilderParameters.setTrustManager(trustManager);
            defaultCertPathBuilderParameters.setCertStatusChecker(certStatusManager);
            defaultCertPathBuilderParameters.setCheckCertStatus(this.n);
            defaultCertPathBuilderParameters.setVerifyCertSign(this.f3o);
            defaultCertPathBuilderParameters.setIgnoreUndeterminedCertStatus(this.p);
            defaultCertPathBuilderParameters.setInitialAnyPolicyInhibit(this.m);
            defaultCertPathBuilderParameters.setInitialExplicitPolicy(this.l);
            defaultCertPathBuilderParameters.setInitialPolicyMappingInhibit(this.k);
            defaultCertPathBuilderParameters.setCurrentTime(date);
            defaultCertPathBuilderParameters.addUserInitialPolicy(PolicyInfo.anyPolicy);
            defaultCertPathBuilderParameters.setHSMUseable(str);
        }
        return new CertPathValidator(CertPathBuilder.getInstance(this.f).build(defaultCertPathBuilderParameters)).validate();
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.initech.cpv.exception.PathValidateException] */
    public CertPathValidateResult validate(X509Certificate x509Certificate, Date date) {
        DefaultTrustManagerParameters defaultTrustManagerParameters;
        CRLCertStatusManagerParameters cRLCertStatusManagerParameters;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i2 % 128;
        CertPathContext certPathContextA = null;
        if (i2 % 2 != 0) {
            certPathContextA.hashCode();
            throw null;
        }
        if (!this.y) {
            throw new IllegalStateException("Wrapper instance not initialized.");
        }
        if (this.d.equals("Default")) {
            defaultTrustManagerParameters = new DefaultTrustManagerParameters();
            Iterator it = this.r.iterator();
            int i3 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                defaultTrustManagerParameters.addTrustCert((X509Certificate) it.next());
            }
        } else {
            defaultTrustManagerParameters = null;
        }
        try {
            TrustManager trustManager = TrustManager.getInstance(this.d, defaultTrustManagerParameters);
            if (this.e.equals("CRL")) {
                cRLCertStatusManagerParameters = new CRLCertStatusManagerParameters();
                if (this.s.size() > 0) {
                    cRLCertStatusManagerParameters.setUseUserDefinedCRL(true);
                    cRLCertStatusManagerParameters.setUserDefinedCompleteCRLs(this.s);
                    cRLCertStatusManagerParameters.setUserDefinedDeltaCRLs(this.t);
                }
                cRLCertStatusManagerParameters.setUseDeltaCRL(this.h);
                cRLCertStatusManagerParameters.setIgnoreCACert(this.j);
                cRLCertStatusManagerParameters.setIgnoreOldVersionCert(this.i);
                cRLCertStatusManagerParameters.setVerifyCRL(this.g);
                cRLCertStatusManagerParameters.setCrlIssuerManager(trustManager);
            } else {
                cRLCertStatusManagerParameters = null;
            }
            certPathContextA = a(x509Certificate, date, trustManager, CertStatusManager.getInstance(this.e, cRLCertStatusManagerParameters));
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException unused) {
        }
        return new CertPathValidator(certPathContextA).validate();
    }

    private static void B(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 43;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1451;
                    byte b = $$a[i2];
                    byte b2 = (byte) (b + 1);
                    byte b3 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, touchSlop, longPressTimeout, 228868077, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char scrollBarSize = (char) (49123 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44;
                        int i7 = 1494 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = b4;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, i6, i7, 1533236389, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23972), 49 - TextUtils.lastIndexOf("", '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 29 - Color.green(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i8 = $10 + 83;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 3532649536524454059L;
        onExtraCallbackWithResult = -1776194565;
        onExtraCallback = (char) 27643;
    }
}
