package org.bouncycastle.x509.util;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class LDAPStoreHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static String LDAP_PROVIDER = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String REFERRALS_IGNORE = "ignore";
    private static final String SEARCH_SECURITY_LEVEL = "none";
    private static final String URL_CONTEXT_PREFIX = "com.sun.jndi.url";
    private static int cacheSize = 32;
    private static long lifeTime = 60000;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private Map cacheMap = new HashMap(cacheSize);
    private X509LDAPCertStoreParameters params;

    static {
        onWarmupCompleted();
        int i = onWarmupCompleted + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.params = x509LDAPCertStoreParameters;
    }

    private void addToCache(String str, List list) {
        synchronized (this) {
            Date date = new Date(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(date);
            arrayList.add(list);
            if (!this.cacheMap.containsKey(str) && this.cacheMap.size() >= cacheSize) {
                long time = date.getTime();
                Object key = null;
                for (Map.Entry entry : this.cacheMap.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        key = entry.getKey();
                        time = time2;
                    }
                }
                this.cacheMap.remove(key);
            }
            this.cacheMap.put(str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List attrCertSubjectSerialSearch(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        Principal[] entityNames;
        String name;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Object obj = null;
        if (x509AttributeCertStoreSelector.getHolder() != null) {
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                x509AttributeCertStoreSelector.getHolder().getSerialNumber();
                obj.hashCode();
                throw null;
            }
            if (x509AttributeCertStoreSelector.getHolder().getSerialNumber() != null) {
                hashSet.add(x509AttributeCertStoreSelector.getHolder().getSerialNumber().toString());
            }
            entityNames = x509AttributeCertStoreSelector.getHolder().getEntityNames() != null ? x509AttributeCertStoreSelector.getHolder().getEntityNames() : null;
        }
        if (x509AttributeCertStoreSelector.getAttributeCert() != null) {
            if (x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames() != null) {
                entityNames = x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames();
            }
            hashSet.add(x509AttributeCertStoreSelector.getAttributeCert().getSerialNumber().toString());
        }
        if (entityNames != null) {
            int i3 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Principal principal = entityNames[0];
            name = principal instanceof X500Principal ? ((X500Principal) principal).getName("RFC1779") : principal.getName();
        } else {
            name = null;
        }
        if (x509AttributeCertStoreSelector.getSerialNumber() != null) {
            hashSet.add(x509AttributeCertStoreSelector.getSerialNumber().toString());
        }
        if (name != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, "*" + parseDN(name, str) + "*", strArr));
            }
        }
        if (hashSet.size() > 0 && this.params.getSearchForSerialNumberIn() != null) {
            int i5 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                hashSet.iterator();
                throw null;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.addAll(search(splitString(this.params.getSearchForSerialNumberIn()), (String) it.next(), strArr));
            }
        }
        if (hashSet.size() == 0) {
            int i6 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (name == null) {
                arrayList.addAll(search(strArr2, "*", strArr));
            }
        }
        int i8 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return arrayList;
    }

    private List cRLIssuerSearch(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(getCertificateIssuer(x509CRLStoreSelector.getCertificateChecking()));
        }
        String name = null;
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            Principal[] principals = x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals();
            for (int i2 = 0; i2 < principals.length; i2++) {
                int i3 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean z = principals[i2] instanceof X500Principal;
                    name.hashCode();
                    throw null;
                }
                Principal principal = principals[i2];
                if (principal instanceof X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            name = ((X500Principal) it.next()).getName("RFC1779");
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, "*" + parseDN(name, str) + "*", strArr));
            }
        }
        if (name == null) {
            int i6 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                arrayList.addAll(search(strArr2, "*", strArr));
                int i7 = 84 / 0;
            } else {
                arrayList.addAll(search(strArr2, "*", strArr));
            }
        }
        return arrayList;
    }

    private List certSubjectSerialSearch(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws IOException, StoreException {
        String string;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String subjectAsString = getSubjectAsString(x509CertStoreSelector);
        Object obj = null;
        if (x509CertStoreSelector.getSerialNumber() != null) {
            string = x509CertStoreSelector.getSerialNumber().toString();
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 3;
            }
        } else {
            int i4 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
            string = null;
        }
        if (x509CertStoreSelector.getCertificate() != null) {
            int i6 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                x509CertStoreSelector.getCertificate().getSerialNumber().toString();
                obj.hashCode();
                throw null;
            }
            subjectAsString = x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
            string = x509CertStoreSelector.getCertificate().getSerialNumber().toString();
        }
        if (subjectAsString != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, "*" + parseDN(subjectAsString, str) + "*", strArr));
            }
        }
        if (string != null) {
            int i7 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                this.params.getSearchForSerialNumberIn();
                throw null;
            }
            if (this.params.getSearchForSerialNumberIn() != null) {
                arrayList.addAll(search(splitString(this.params.getSearchForSerialNumberIn()), string, strArr));
            }
        }
        if (string == null) {
            int i8 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (subjectAsString == null) {
                arrayList.addAll(search(strArr2, "*", strArr));
            }
        }
        return arrayList;
    }

    private DirContext connectLDAP() throws Throwable {
        int i = 2 % 2;
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", LDAP_PROVIDER);
        Object[] objArr = new Object[1];
        a(new int[]{0, 1, 194, 0}, false, new byte[]{0}, objArr);
        properties.setProperty("java.naming.batchsize", ((String) objArr[0]).intern());
        properties.setProperty("java.naming.provider.url", this.params.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", URL_CONTEXT_PREFIX);
        properties.setProperty("java.naming.referral", REFERRALS_IGNORE);
        Object[] objArr2 = new Object[1];
        a(new int[]{1, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
        properties.setProperty("java.naming.security.authentication", ((String) objArr2[0]).intern());
        InitialDirContext initialDirContext = new InitialDirContext(properties);
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return initialDirContext;
    }

    private Set createAttributeCertificates(List list, X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    int i2 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    hashSet.add(x509AttributeCertificate);
                    int i4 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 % 3;
                    }
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set createCRLs(List list, X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((Object) x509crl)) {
                    int i2 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        hashSet.add(x509crl);
                        int i3 = 82 / 0;
                    } else {
                        hashSet.add(x509crl);
                    }
                } else {
                    continue;
                }
            } catch (StreamParsingException unused) {
            }
        }
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return hashSet;
    }

    private Set createCerts(List list, X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match(x509Certificate)) {
                    int i2 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        hashSet.add(x509Certificate);
                        int i3 = 71 / 0;
                    } else {
                        hashSet.add(x509Certificate);
                    }
                } else {
                    continue;
                }
            } catch (Exception unused) {
            }
        }
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return hashSet;
    }

    private Set createCrossCertificatePairs(List list, X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        X509CertificatePair x509CertificatePair;
        int i = 2 % 2;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i2)));
                    x509CertificatePair = (X509CertificatePair) x509CertPairParser.engineRead();
                } catch (StreamParsingException unused) {
                    int i3 = i2 + 1;
                    x509CertificatePair = new X509CertificatePair(new CertificatePair(Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i2)).readObject()), Certificate.getInstance(new ASN1InputStream((byte[]) list.get(i3)).readObject())));
                    i2 = i3;
                }
                if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                    int i4 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    hashSet.add(x509CertificatePair);
                    int i6 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
            } catch (IOException | CertificateParsingException unused2) {
            }
            i2++;
        }
        return hashSet;
    }

    private List crossCertificatePairSubjectSearch(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws IOException, StoreException {
        String name;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (x509CertPairStoreSelector.getForwardSelector() != null) {
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            name = getSubjectAsString(x509CertPairStoreSelector.getForwardSelector());
            int i4 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            name = null;
        }
        if (x509CertPairStoreSelector.getCertPair() != null) {
            int i6 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (x509CertPairStoreSelector.getCertPair().getForward() != null) {
                name = x509CertPairStoreSelector.getCertPair().getForward().getSubjectX500Principal().getName("RFC1779");
            }
        }
        if (name != null) {
            for (String str : strArr3) {
                arrayList.addAll(search(strArr2, "*" + parseDN(name, str) + "*", strArr));
            }
        }
        if (name == null) {
            arrayList.addAll(search(strArr2, "*", strArr));
            int i8 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        return arrayList;
    }

    private X500Principal getCertificateIssuer(X509Certificate x509Certificate) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            x509Certificate.getIssuerX500Principal();
            throw null;
        }
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        int i3 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return issuerX500Principal;
        }
        throw null;
    }

    private List getFromCache(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) this.cacheMap.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (list == null) {
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0 ? ((Date) list.get(0)).getTime() >= jCurrentTimeMillis - lifeTime : ((Date) list.get(1)).getTime() >= (jCurrentTimeMillis & lifeTime)) {
            return (List) list.get(1);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.StoreException */
    private String getSubjectAsString(X509CertStoreSelector x509CertStoreSelector) throws IOException, StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                x509CertStoreSelector.getSubjectAsBytes();
                throw null;
            }
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes == null) {
                return null;
            }
            String name = new X500Principal(subjectAsBytes).getName("RFC1779");
            int i3 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return name;
            }
            obj.hashCode();
            throw null;
        } catch (IOException e) {
            throw new StoreException("exception processing name: " + e.getMessage(), e);
        }
    }

    private String parseDN(String str, String str2) {
        int length;
        int i = 2 % 2;
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase() + "=");
        if (iIndexOf == -1) {
            return BuildConfig.FLAVOR;
        }
        String strSubstring = str.substring(iIndexOf + str2.length());
        if (strSubstring.indexOf(44) != -1) {
            length = strSubstring.length();
            while (strSubstring.charAt(length - 1) == '\\') {
                length = strSubstring.indexOf(44, length + 1);
                if (length == -1) {
                }
            }
            String strSubstring2 = strSubstring.substring(0, length);
            String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
            if (strSubstring3.charAt(0) == ' ') {
                strSubstring3 = strSubstring3.substring(1);
            }
            if (strSubstring3.startsWith("\"")) {
                int i2 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                strSubstring3 = strSubstring3.substring(1);
                int i4 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            return strSubstring3.endsWith("\"") ? strSubstring3.substring(0, strSubstring3.length() - 1) : strSubstring3;
        }
        length = strSubstring.length();
    }

    private List search(String[] strArr, String str, String[] strArr2) throws Throwable {
        String str2;
        DirContext dirContextConnectLDAP;
        NamingEnumeration all;
        int i = 2 % 2;
        String str3 = BuildConfig.FLAVOR;
        DirContext dirContext = null;
        if (strArr == null) {
            str2 = null;
        } else {
            if (!(!str.equals("**"))) {
                str = "*";
            }
            String str4 = BuildConfig.FLAVOR;
            for (String str5 : strArr) {
                str4 = str4 + "(" + str5 + "=" + str + ")";
            }
            str2 = "(|" + str4 + ")";
        }
        for (String str6 : strArr2) {
            str3 = str3 + "(" + str6 + "=*)";
        }
        String str7 = "(|" + str3 + ")";
        String str8 = "(&" + str2 + str7 + ")";
        if (str2 == null) {
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str7 = str8;
        }
        List fromCache = getFromCache(str7);
        if (fromCache != null) {
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return fromCache;
            }
            dirContext.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                dirContextConnectLDAP = connectLDAP();
            } catch (Exception unused) {
                return arrayList;
            }
            try {
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                searchControls.setReturningAttributes(strArr2);
                NamingEnumeration namingEnumerationSearch = dirContextConnectLDAP.search(this.params.getBaseDN(), str7, searchControls);
                while (namingEnumerationSearch.hasMoreElements()) {
                    int i5 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                        int i6 = 90 / 0;
                    } else {
                        all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                    }
                    while (!(!all.hasMore())) {
                        arrayList.add(all.next());
                    }
                }
                addToCache(str7, arrayList);
                dirContextConnectLDAP.close();
                int i7 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    return arrayList;
                }
                throw null;
            } catch (NamingException unused2) {
                dirContext = dirContextConnectLDAP;
                if (dirContext != null) {
                    dirContext.close();
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                dirContext = dirContextConnectLDAP;
                if (dirContext != null) {
                    try {
                        dirContext.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (NamingException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String[] splitString(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplit = str.split("\\s+");
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return strArrSplit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getAACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAACertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
        }
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return setCreateAttributeCertificates;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getAttributeAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateCRLs;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        int i = 2 % 2;
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateAttributeAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateAttributeAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateAttributeSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return setCreateAttributeCertificates;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getAttributeCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
        }
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return setCreateCRLs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getAttributeDescriptorCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAttributeDescriptorCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAttributeDescriptorCertificateSubjectAttributeName());
        Set setCreateAttributeCertificates = createAttributeCertificates(attrCertSubjectSerialSearch(x509AttributeCertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector);
        if (setCreateAttributeCertificates.size() == 0) {
            setCreateAttributeCertificates.addAll(createAttributeCertificates(attrCertSubjectSerialSearch(new X509AttributeCertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509AttributeCertStoreSelector));
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateAttributeCertificates;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getAuthorityRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapAuthorityRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getAuthorityRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
            int i4 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateCRLs;
    }

    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        int i = 2 % 2;
        String[] strArrSplitString = splitString(this.params.getCACertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCACertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCACertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return setCreateCerts;
        }
        throw null;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getCertificateRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCertificateRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCertificateRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
            int i4 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateCRLs;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getCrossCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapCrossCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getCrossCertificateSubjectAttributeName());
        Set setCreateCrossCertificatePairs = createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector);
        if (setCreateCrossCertificatePairs.size() == 0) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509CertPairStoreSelector2 = new X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            setCreateCrossCertificatePairs.addAll(createCrossCertificatePairs(crossCertificatePairSubjectSearch(x509CertPairStoreSelector2, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertPairStoreSelector));
        }
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setCreateCrossCertificatePairs;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getDeltaRevocationListAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapDeltaRevocationListAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getDeltaRevocationListIssuerAttributeName());
        Set setCreateCRLs = createCRLs(cRLIssuerSearch(x509CRLStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector);
        if (setCreateCRLs.size() == 0) {
            setCreateCRLs.addAll(createCRLs(cRLIssuerSearch(new X509CRLStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CRLStoreSelector));
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateCRLs;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplitString = splitString(this.params.getUserCertificateAttribute());
        String[] strArrSplitString2 = splitString(this.params.getLdapUserCertificateAttributeName());
        String[] strArrSplitString3 = splitString(this.params.getUserCertificateSubjectAttributeName());
        Set setCreateCerts = createCerts(certSubjectSerialSearch(x509CertStoreSelector, strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector);
        if (setCreateCerts.size() == 0) {
            setCreateCerts.addAll(createCerts(certSubjectSerialSearch(new X509CertStoreSelector(), strArrSplitString, strArrSplitString2, strArrSplitString3), x509CertStoreSelector));
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return setCreateCerts;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 35, 14239 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 10935), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64, 16718 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 29 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49467), 70 - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i12 = $10 + 109;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{27191, 27257, 27168, 27168, 27175};
    }
}
