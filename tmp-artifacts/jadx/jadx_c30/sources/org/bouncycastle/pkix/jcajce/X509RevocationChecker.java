package org.bouncycastle.pkix.jcajce;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.ReasonFlags;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class X509RevocationChecker extends PKIXCertPathChecker {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int CHAIN_VALIDITY_MODEL = 1;
    private static int IAuthTabCallback = 1;
    private static Logger LOG = null;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private static final Map<GeneralName, WeakReference<X509CRL>> crlCache;
    protected static final String[] crlReasons;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean canSoftFail;
    private final List<CertStore> crlCertStores;
    private final List<Store<CRL>> crls;
    private Date currentDate;
    private final long failHardMaxTime;
    private final long failLogMaxTime;
    private final Map<X500Principal, Long> failures;
    private final JcaJceHelper helper;
    private final boolean isCheckEEOnly;
    private X509Certificate signingCert;
    private final Set<TrustAnchor> trustAnchors;
    private final int validityModel;
    private X500Principal workingIssuerName;
    private PublicKey workingPublicKey;

    public static class Builder {
        private boolean canSoftFail;
        private List<CertStore> crlCertStores;
        private List<Store<CRL>> crls;
        private long failHardMaxTime;
        private long failLogMaxTime;
        private boolean isCheckEEOnly;
        private Provider provider;
        private String providerName;
        private Set<TrustAnchor> trustAnchors;
        private int validityModel;

        public Builder(KeyStore keyStore) throws KeyStoreException {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.trustAnchors = new HashSet();
            Enumeration<String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                String strNextElement = enumerationAliases.nextElement();
                if (keyStore.isCertificateEntry(strNextElement)) {
                    this.trustAnchors.add(new TrustAnchor((X509Certificate) keyStore.getCertificate(strNextElement), null));
                }
            }
        }

        public Builder(TrustAnchor trustAnchor) {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.trustAnchors = Collections.singleton(trustAnchor);
        }

        public Builder(Set<TrustAnchor> set) {
            this.crlCertStores = new ArrayList();
            this.crls = new ArrayList();
            this.validityModel = 0;
            this.trustAnchors = new HashSet(set);
        }

        public Builder addCrls(CertStore certStore) {
            this.crlCertStores.add(certStore);
            return this;
        }

        public Builder addCrls(Store<CRL> store) {
            this.crls.add(store);
            return this;
        }

        public X509RevocationChecker build() {
            return new X509RevocationChecker(this);
        }

        public Builder setCheckEndEntityOnly(boolean z) {
            this.isCheckEEOnly = z;
            return this;
        }

        public Builder setSoftFail(boolean z, long j) {
            this.canSoftFail = z;
            this.failLogMaxTime = j;
            this.failHardMaxTime = -1L;
            return this;
        }

        public Builder setSoftFailHardLimit(boolean z, long j) {
            this.canSoftFail = z;
            this.failLogMaxTime = (3 * j) / 4;
            this.failHardMaxTime = j;
            return this;
        }

        public Builder setValidityModel(int i) {
            this.validityModel = i;
            return this;
        }

        public Builder usingProvider(String str) {
            this.providerName = str;
            return this;
        }

        public Builder usingProvider(Provider provider) {
            this.provider = provider;
            return this;
        }
    }

    class LocalCRLStore implements PKIXCRLStore<CRL>, Iterable<CRL> {
        private Collection<CRL> _local;

        public LocalCRLStore(Store<CRL> store) {
            this._local = new ArrayList(store.getMatches((Selector) null));
        }

        public Collection<CRL> getMatches(Selector<CRL> selector) {
            if (selector == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    static {
        onWarmupCompleted();
        LOG = Logger.getLogger(X509RevocationChecker.class.getName());
        crlCache = Collections.synchronizedMap(new WeakHashMap());
        Object[] objArr = new Object[1];
        a(new char[]{25751, 25828, 63019, 2898, 13132, 26393, 33030, 10314, 28845, 12034, 38235, 1027, 19554, 7149}, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{58951, 58930, 2169, 55229, 52485, 8530, 24050, 28170, 62048, 53588, 18879}, '0' - AndroidCharacter.getMirror('0'), objArr2);
        crlReasons = new String[]{"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", strIntern, "cessationOfOperation", "certificateHold", ((String) objArr2[0]).intern(), "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
        int i = onExtraCallback + 109;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    private X509RevocationChecker(Builder builder) {
        this.failures = new HashMap();
        this.crls = new ArrayList(builder.crls);
        this.crlCertStores = new ArrayList(builder.crlCertStores);
        this.isCheckEEOnly = builder.isCheckEEOnly;
        this.validityModel = builder.validityModel;
        this.trustAnchors = builder.trustAnchors;
        this.canSoftFail = builder.canSoftFail;
        this.failLogMaxTime = builder.failLogMaxTime;
        this.failHardMaxTime = builder.failHardMaxTime;
        if (builder.provider != null) {
            this.helper = new ProviderJcaJceHelper(builder.provider);
            return;
        }
        if (builder.providerName != null) {
            this.helper = new NamedJcaJceHelper(builder.providerName);
            int i = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            return;
        }
        this.helper = new DefaultJcaJceHelper();
        int i3 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private void addIssuers(final List<X500Principal> list, CertStore certStore) throws CertStoreException {
        int i = 2 % 2;
        certStore.getCRLs(new X509CRLSelector() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.1
            @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
            public boolean match(CRL crl) {
                if (!(crl instanceof X509CRL)) {
                    return false;
                }
                list.add(((X509CRL) crl).getIssuerX500Principal());
                return false;
            }
        });
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private void addIssuers(final List<X500Principal> list, Store<CRL> store) {
        int i = 2 % 2;
        store.getMatches(new Selector<CRL>() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.2
            public Object clone() {
                return this;
            }

            public boolean match(CRL crl) {
                if (!(crl instanceof X509CRL)) {
                    return false;
                }
                list.add(((X509CRL) crl).getIssuerX500Principal());
                return false;
            }
        });
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[PHI: r0
      0x004b: PHI (r0v12 org.bouncycastle.asn1.x509.DistributionPointName) = (r0v11 org.bouncycastle.asn1.x509.DistributionPointName), (r0v25 org.bouncycastle.asn1.x509.DistributionPointName) binds: [B:14:0x0049, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CRL downloadCRLs(X500Principal x500Principal, Date date, ASN1Primitive aSN1Primitive, JcaJceHelper jcaJceHelper) throws IOException {
        DistributionPoint[] distributionPoints;
        int i;
        DistributionPointName distributionPoint;
        URL url;
        X509CRL x509crl;
        Logger logger;
        Level level;
        StringBuilder sb;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            i = 1;
            distributionPoints = CRLDistPoint.getInstance(aSN1Primitive).getDistributionPoints();
        } else {
            distributionPoints = CRLDistPoint.getInstance(aSN1Primitive).getDistributionPoints();
            i = 0;
        }
        while (true) {
            Object obj = null;
            if (i == distributionPoints.length) {
                return null;
            }
            int i6 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                distributionPoint = distributionPoints[i].getDistributionPoint();
                int i7 = 28 / i5;
                if (distributionPoint == null) {
                    continue;
                } else if (distributionPoint.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint.getName()).getNames();
                    int i8 = i5;
                    while (i8 != names.length) {
                        GeneralName generalName = names[i8];
                        if (generalName.getTagNo() == 6) {
                            Map<GeneralName, WeakReference<X509CRL>> map = crlCache;
                            WeakReference<X509CRL> weakReference = map.get(generalName);
                            if (weakReference != null) {
                                X509CRL x509crl2 = weakReference.get();
                                if (x509crl2 != null) {
                                    int i9 = IAuthTabCallback + 125;
                                    onExtraCallbackWithResult = i9 % 128;
                                    if (i9 % i2 != 0) {
                                        date.before(x509crl2.getThisUpdate());
                                        obj.hashCode();
                                        throw null;
                                    }
                                    if (!date.before(x509crl2.getThisUpdate()) && !date.after(x509crl2.getNextUpdate())) {
                                        return x509crl2;
                                    }
                                }
                                map.remove(generalName);
                            }
                            try {
                                url = new URL(generalName.getName().toString());
                                try {
                                    CertificateFactory certificateFactoryCreateCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                                    InputStream inputStreamOpenStream = url.openStream();
                                    x509crl = (X509CRL) certificateFactoryCreateCertificateFactory.generateCRL(new BufferedInputStream(inputStreamOpenStream));
                                    inputStreamOpenStream.close();
                                    logger = LOG;
                                    level = Level.INFO;
                                    sb = new StringBuilder();
                                    sb.append("downloaded CRL from CrlDP ");
                                    sb.append(url);
                                    sb.append(" for issuer \"");
                                } catch (Exception e) {
                                    e = e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                url = null;
                            }
                            try {
                                sb.append(x500Principal);
                                sb.append("\"");
                                logger.log(level, sb.toString());
                                map.put(generalName, new WeakReference<>(x509crl));
                                return x509crl;
                            } catch (Exception e3) {
                                e = e3;
                                Logger logger2 = LOG;
                                Level level2 = Level.FINE;
                                if (logger2.isLoggable(level2)) {
                                    LOG.log(level2, "CrlDP " + url + " ignored: " + e.getMessage(), (Throwable) e);
                                } else {
                                    LOG.log(Level.INFO, "CrlDP " + url + " ignored: " + e.getMessage());
                                }
                                i8++;
                                i2 = 2;
                            }
                        }
                        i8++;
                        i2 = 2;
                    }
                } else {
                    continue;
                }
            } else {
                distributionPoint = distributionPoints[i].getDistributionPoint();
                if (distributionPoint == null) {
                    continue;
                }
            }
            i++;
            i2 = 2;
            i5 = 0;
        }
    }

    static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint cRLDistPoint, Map<GeneralName, PKIXCRLStore> map) throws AnnotatedException {
        int i = 2 % 2;
        if (cRLDistPoint == null) {
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return Collections.EMPTY_LIST;
        }
        try {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            ArrayList arrayList = new ArrayList();
            for (DistributionPoint distributionPoint : distributionPoints) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    int i4 = IAuthTabCallback + 7;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    for (int i6 = 0; i6 < names.length; i6++) {
                        int i7 = IAuthTabCallback + 61;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            map.get(names[i6]);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        PKIXCRLStore pKIXCRLStore = map.get(names[i6]);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new AnnotatedException("could not read distribution points could not be read", e);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) throws IOException, CertPathValidatorException {
        Logger logger;
        Level level;
        StringBuilder sb;
        int i = 2 % 2;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (this.isCheckEEOnly && x509Certificate.getBasicConstraints() != -1) {
            this.workingIssuerName = x509Certificate.getSubjectX500Principal();
            this.workingPublicKey = x509Certificate.getPublicKey();
            this.signingCert = x509Certificate;
            return;
        }
        if (this.workingIssuerName == null) {
            this.workingIssuerName = x509Certificate.getIssuerX500Principal();
            TrustAnchor trustAnchor = null;
            for (TrustAnchor trustAnchor2 : this.trustAnchors) {
                int i2 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!this.workingIssuerName.equals(trustAnchor2.getCA())) {
                    int i4 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (!this.workingIssuerName.equals(trustAnchor2.getTrustedCert().getSubjectX500Principal())) {
                    }
                }
                trustAnchor = trustAnchor2;
            }
            if (trustAnchor == null) {
                throw new CertPathValidatorException("no trust anchor found for " + this.workingIssuerName);
            }
            int i6 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            X509Certificate trustedCert = trustAnchor.getTrustedCert();
            this.signingCert = trustedCert;
            this.workingPublicKey = trustedCert.getPublicKey();
            int i8 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        ArrayList arrayList = new ArrayList();
        try {
            PKIXParameters pKIXParameters = new PKIXParameters(this.trustAnchors);
            pKIXParameters.setRevocationEnabled(false);
            pKIXParameters.setDate(this.currentDate);
            for (int i10 = 0; i10 != this.crlCertStores.size(); i10++) {
                if (LOG.isLoggable(Level.INFO)) {
                    int i11 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        addIssuers(arrayList, this.crlCertStores.get(i10));
                        int i12 = 66 / 0;
                    } else {
                        addIssuers(arrayList, this.crlCertStores.get(i10));
                    }
                }
                pKIXParameters.addCertStore(this.crlCertStores.get(i10));
            }
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXParameters);
            builder.setValidityModel(this.validityModel);
            for (int i13 = 0; i13 != this.crls.size(); i13++) {
                if (LOG.isLoggable(Level.INFO)) {
                    int i14 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    addIssuers(arrayList, this.crls.get(i13));
                    int i16 = onExtraCallbackWithResult + 105;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                }
                builder.addCRLStore(new LocalCRLStore(this.crls.get(i13)));
            }
            if (arrayList.isEmpty()) {
                LOG.log(Level.INFO, "configured with 0 pre-loaded CRLs");
            } else if (LOG.isLoggable(Level.FINE)) {
                for (int i18 = 0; i18 != arrayList.size(); i18++) {
                    LOG.log(Level.FINE, "configuring with CRL for issuer \"" + arrayList.get(i18) + "\"");
                }
            } else {
                LOG.log(Level.INFO, "configured with " + arrayList.size() + " pre-loaded CRLs");
            }
            PKIXExtendedParameters pKIXExtendedParametersBuild = builder.build();
            try {
                checkCRLs(pKIXExtendedParametersBuild, this.currentDate, RevocationUtilities.getValidityDate(pKIXExtendedParametersBuild, this.currentDate), x509Certificate, this.signingCert, this.workingPublicKey, new ArrayList(), this.helper);
            } catch (AnnotatedException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause());
            } catch (CRLNotFoundException e2) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.cRLDistributionPoints;
                if (x509Certificate.getExtensionValue(aSN1ObjectIdentifier.getId()) == null) {
                    throw e2;
                }
                try {
                    CRL crlDownloadCRLs = downloadCRLs(x509Certificate.getIssuerX500Principal(), this.currentDate, RevocationUtilities.getExtensionValue(x509Certificate, aSN1ObjectIdentifier), this.helper);
                    if (crlDownloadCRLs != null) {
                        try {
                            builder.addCRLStore(new LocalCRLStore(new CollectionStore(Collections.singleton(crlDownloadCRLs))));
                            PKIXExtendedParameters pKIXExtendedParametersBuild2 = builder.build();
                            checkCRLs(pKIXExtendedParametersBuild2, this.currentDate, RevocationUtilities.getValidityDate(pKIXExtendedParametersBuild2, this.currentDate), x509Certificate, this.signingCert, this.workingPublicKey, new ArrayList(), this.helper);
                        } catch (AnnotatedException e3) {
                            throw new CertPathValidatorException(e3.getMessage(), e3.getCause());
                        }
                    } else {
                        if (!this.canSoftFail) {
                            throw e2;
                        }
                        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                        Long l = this.failures.get(issuerX500Principal);
                        if (l != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                            long j = this.failHardMaxTime;
                            if (j != -1 && j < jCurrentTimeMillis) {
                                throw e2;
                            }
                            if (jCurrentTimeMillis < this.failLogMaxTime) {
                                logger = LOG;
                                level = Level.WARNING;
                                sb = new StringBuilder();
                            } else {
                                logger = LOG;
                                level = Level.SEVERE;
                                sb = new StringBuilder();
                            }
                            sb.append("soft failing for issuer: \"");
                            sb.append(issuerX500Principal);
                            sb.append("\"");
                            logger.log(level, sb.toString());
                        } else {
                            this.failures.put(issuerX500Principal, Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                } catch (AnnotatedException e4) {
                    throw new CertPathValidatorException(e4.getMessage(), e4.getCause());
                }
            }
            this.signingCert = x509Certificate;
            this.workingPublicKey = x509Certificate.getPublicKey();
            this.workingIssuerName = x509Certificate.getSubjectX500Principal();
        } catch (GeneralSecurityException e5) {
            throw new RuntimeException("error setting up baseParams: " + e5.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void checkCRLs(PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException, CertPathValidatorException {
        ReasonFlags reasonFlags;
        AnnotatedException e;
        boolean z;
        int i;
        int i2;
        PKIXExtendedParameters pKIXExtendedParameters2;
        DistributionPoint[] distributionPointArr;
        ReasonFlags reasonFlags2;
        int i3 = 2;
        int i4 = 2 % 2;
        try {
            CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(x509Certificate, Extension.cRLDistributionPoints));
            CertStatus certStatus = new CertStatus();
            ReasonsMask reasonsMask = new ReasonsMask();
            boolean z2 = true;
            int i5 = 11;
            ReasonFlags reasonFlags3 = null;
            if (cRLDistPoint != null) {
                int i6 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i6 % 128;
                try {
                    if (i6 % 2 != 0) {
                        cRLDistPoint.getDistributionPoints();
                        throw null;
                    }
                    DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                    if (distributionPoints != null) {
                        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
                        try {
                            Iterator<PKIXCRLStore> it = getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()).iterator();
                            while (it.hasNext()) {
                                builder.addCRLStore(it.next());
                            }
                            PKIXExtendedParameters pKIXExtendedParametersBuild = builder.build();
                            Date validityDate = RevocationUtilities.getValidityDate(pKIXExtendedParametersBuild, date);
                            e = null;
                            int i7 = 0;
                            z = false;
                            while (i7 < distributionPoints.length) {
                                int i8 = IAuthTabCallback + 33;
                                onExtraCallbackWithResult = i8 % 128;
                                if (i8 % i3 == 0) {
                                    if (certStatus.getCertStatus() != i5) {
                                        break;
                                    }
                                } else {
                                    if (certStatus.getCertStatus() != 103) {
                                        break;
                                    }
                                    if (reasonsMask.isAllReasons()) {
                                        break;
                                    }
                                    try {
                                        i2 = i7;
                                        pKIXExtendedParameters2 = pKIXExtendedParametersBuild;
                                        distributionPointArr = distributionPoints;
                                        reasonFlags2 = reasonFlags3;
                                        try {
                                            RFC3280CertPathUtilities.checkCRL(distributionPoints[i7], pKIXExtendedParametersBuild, date, validityDate, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                                            z = true;
                                        } catch (AnnotatedException e2) {
                                            e = e2;
                                        }
                                    } catch (AnnotatedException e3) {
                                        e = e3;
                                        i2 = i7;
                                        pKIXExtendedParameters2 = pKIXExtendedParametersBuild;
                                        distributionPointArr = distributionPoints;
                                        reasonFlags2 = reasonFlags3;
                                    }
                                    i7 = i2 + 1;
                                    reasonFlags3 = reasonFlags2;
                                    pKIXExtendedParametersBuild = pKIXExtendedParameters2;
                                    distributionPoints = distributionPointArr;
                                    i3 = 2;
                                    i5 = 11;
                                }
                            }
                            reasonFlags = reasonFlags3;
                        } catch (AnnotatedException e4) {
                            throw new AnnotatedException("no additional CRL locations could be decoded from CRL distribution point extension", e4);
                        }
                    } else {
                        reasonFlags = null;
                        e = null;
                        z = false;
                    }
                } catch (Exception e5) {
                    throw new AnnotatedException("cannot read distribution points", e5);
                }
            }
            if (certStatus.getCertStatus() != 11 || reasonsMask.isAllReasons()) {
                i = 11;
                z2 = z;
            } else {
                try {
                    DistributionPoint distributionPoint = new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded())))), reasonFlags, reasonFlags);
                    i = 11;
                    try {
                        RFC3280CertPathUtilities.checkCRL(distributionPoint, (PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                    } catch (AnnotatedException e6) {
                        e = e6;
                    }
                } catch (AnnotatedException e7) {
                    e = e7;
                }
            }
            if (!z2) {
                if (e == null) {
                    throw new CRLNotFoundException("no valid CRL found");
                }
                throw new CRLNotFoundException("no valid CRL found", e);
            }
            if (certStatus.getCertStatus() == i) {
                if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == i) {
                    int i9 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        certStatus.setCertStatus(10);
                    } else {
                        certStatus.setCertStatus(12);
                    }
                }
                if (certStatus.getCertStatus() == 12) {
                    throw new AnnotatedException("certificate status could not be determined");
                }
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            throw new AnnotatedException(("certificate [issuer=\"" + x509Certificate.getIssuerX500Principal() + "\",serialNumber=" + x509Certificate.getSerialNumber() + ",subject=\"" + x509Certificate.getSubjectX500Principal() + "\"] revoked after " + simpleDateFormat.format(certStatus.getRevocationDate())) + ", reason: " + crlReasons[certStatus.getCertStatus()]);
        } catch (Exception e8) {
            throw new AnnotatedException("cannot read CRL distribution point extension", e8);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Object clone() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        throw new java.lang.IllegalArgumentException("forward processing not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3.currentDate = new java.util.Date();
        r3.workingIssuerName = null;
        r1 = org.bouncycastle.pkix.jcajce.X509RevocationChecker.IAuthTabCallback + 5;
        org.bouncycastle.pkix.jcajce.X509RevocationChecker.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z) throws CertPathValidatorException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 27;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 84, 21234 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 14186), 19 - Color.argb(0, 0, 0, 0), 8808 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 4451660658311216670L;
    }
}
