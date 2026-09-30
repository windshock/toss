package com.initech.cpv.crl.manager;

import com.initech.asn1.ASN1Exception;
import com.initech.asn1.useful.Name;
import com.initech.cpv.crl.CRLDPEntry;
import com.initech.cpv.util.Debug;
import com.initech.x509.CRLs;
import com.initech.x509.extensions.AuthorityKeyIdentifier;
import com.initech.x509.extensions.CRLDistPoints;
import com.initech.x509.extensions.CRLNumber;
import com.initech.x509.extensions.DeltaCRLIndicator;
import com.initech.x509.extensions.DistPoint;
import com.initech.x509.extensions.FreshestCRL;
import com.initech.x509.extensions.IssuingDistPoint;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Enumeration;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CRLManager {
    private static String a;
    private static CRLStoreManager b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.cpv.crl.manager.CRLManagerException */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean checkCRLMatch(X509CRL x509crl, X509CRL x509crl2) throws CRLManagerException {
        if (x509crl == null) {
            return false;
        }
        if (x509crl.getExtensionValue("2.5.29.27") != null) {
            throw new CRLManagerException("Complete CRL cannot have DeltaCRLIndicator extension.");
        }
        if (x509crl2 == null || !x509crl.getIssuerDN().equals(x509crl2.getIssuerDN())) {
            return false;
        }
        try {
            byte[] extensionValue = x509crl.getExtensionValue("2.5.29.35");
            byte[] extensionValue2 = x509crl2.getExtensionValue("2.5.29.35");
            if (extensionValue != null && extensionValue2 != null) {
                if (!Arrays.equals(new AuthorityKeyIdentifier(extensionValue).getExtValue(), new AuthorityKeyIdentifier(extensionValue2).getExtValue())) {
                    return false;
                }
                byte[] extensionValue3 = x509crl.getExtensionValue("2.5.29.28");
                byte[] extensionValue4 = x509crl2.getExtensionValue("2.5.29.28");
                if (extensionValue3 != null && extensionValue4 != null) {
                    try {
                        if (!Arrays.equals(new IssuingDistPoint(extensionValue3).getExtValue(), new IssuingDistPoint(extensionValue4).getExtValue())) {
                            return false;
                        }
                    } catch (ASN1Exception e) {
                        Debug.handleException(e);
                        throw new CRLManagerException(e);
                    }
                } else if (extensionValue3 == null) {
                }
                byte[] extensionValue5 = x509crl.getExtensionValue("2.5.29.20");
                byte[] extensionValue6 = x509crl2.getExtensionValue("2.5.29.20");
                byte[] extensionValue7 = x509crl2.getExtensionValue("2.5.29.27");
                try {
                    if (extensionValue5 == null) {
                        throw new CRLManagerException("Complete CRL's CRLNumber extension cannot be found.");
                    }
                    if (extensionValue6 == null) {
                        throw new CRLManagerException("Delta CRL's CRLNumber extension cannot be found.");
                    }
                    if (extensionValue7 == null) {
                        throw new CRLManagerException("Delta CRL's DeltaCRLIndicator extension cannot be found.");
                    }
                    CRLNumber cRLNumber = new CRLNumber(extensionValue5);
                    return cRLNumber.getCRLNumber().compareTo(new DeltaCRLIndicator(extensionValue7).getDeltaCRLIndicator()) >= 0 && cRLNumber.getCRLNumber().compareTo(new CRLNumber(extensionValue6).getCRLNumber()) < 0;
                } catch (ASN1Exception e2) {
                    Debug.handleException(e2);
                    throw new CRLManagerException(e2);
                }
            }
            return false;
        } catch (ASN1Exception e3) {
            Debug.handleException(e3);
            throw new CRLManagerException(e3);
        }
    }

    public static X509CRL getCRL(CRLDPEntry cRLDPEntry) throws CRLManagerException {
        if (b == null) {
            loadCRLStoreManager();
        }
        return b.loadCRL(cRLDPEntry);
    }

    public static X509CRL getCRLfromCache(X509CRL x509crl) throws CRLManagerException {
        if (b == null) {
            loadCRLStoreManager();
        }
        Enumeration enumerationElements = b.loadCachedCRLs(new Name(x509crl.getIssuerDN().toString())).elements();
        while (enumerationElements.hasMoreElements()) {
            X509CRL x509crl2 = (X509CRL) enumerationElements.nextElement();
            if (checkCRLMatch(x509crl2, x509crl)) {
                return x509crl2;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.cpv.crl.manager.CRLManagerException */
    public static CRLs getCompleteCRLs(X509Certificate x509Certificate) throws CRLManagerException {
        byte[] extensionValue = x509Certificate.getExtensionValue("2.5.29.31");
        CRLs cRLs = new CRLs();
        try {
            new Name(x509Certificate.getIssuerDN().toString());
            Enumeration enumerationElements = new CRLDistPoints(extensionValue).elements();
            while (enumerationElements.hasMoreElements()) {
                DistPoint distPoint = (DistPoint) enumerationElements.nextElement();
                try {
                    CRLDPEntry cRLDPEntry = new CRLDPEntry();
                    cRLDPEntry.setDp(distPoint);
                    cRLDPEntry.setIssuerName(new Name(x509Certificate.getIssuerDN().getName()));
                    cRLDPEntry.setForDeltaCRL(false);
                    cRLs.add(getCRL(cRLDPEntry));
                } catch (IllegalArgumentException e) {
                    Debug.handleException(e);
                    throw new CRLManagerException(e);
                } catch (CRLManagerException e2) {
                    Debug.handleException(e2);
                    throw new CRLManagerException(e2);
                }
            }
            return cRLs;
        } catch (ASN1Exception e3) {
            Debug.handleException(e3);
            throw new CRLManagerException(e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.cpv.crl.manager.CRLManagerException */
    public static CRLs getDeltaCRLs(X509Certificate x509Certificate) throws CRLManagerException {
        byte[] extensionValue = x509Certificate.getExtensionValue("2.5.29.46");
        if (extensionValue == null) {
            CRLs completeCRLs = getCompleteCRLs(x509Certificate);
            CRLs cRLs = new CRLs();
            Enumeration enumerationElements = completeCRLs.elements();
            while (enumerationElements.hasMoreElements()) {
                try {
                    Enumeration enumerationElements2 = new FreshestCRL(((X509CRL) enumerationElements.nextElement()).getExtensionValue("2.5.29.46")).elements();
                    while (enumerationElements2.hasMoreElements()) {
                        DistPoint distPoint = (DistPoint) enumerationElements2.nextElement();
                        try {
                            CRLDPEntry cRLDPEntry = new CRLDPEntry();
                            cRLDPEntry.setDp(distPoint);
                            cRLDPEntry.setIssuerName(new Name(x509Certificate.getIssuerDN().getName()));
                            cRLDPEntry.setForDeltaCRL(true);
                            cRLs.add(getCRL(cRLDPEntry));
                            break;
                        } catch (Exception e) {
                            Debug.handleException(e);
                        }
                    }
                } catch (Exception e2) {
                    Debug.handleException(e2);
                    throw new CRLManagerException(e2);
                }
            }
            return cRLs;
        }
        CRLs cRLs2 = new CRLs();
        try {
            new Name(x509Certificate.getIssuerDN().toString());
            Enumeration enumerationElements3 = new FreshestCRL(extensionValue).elements();
            while (enumerationElements3.hasMoreElements()) {
                DistPoint distPoint2 = (DistPoint) enumerationElements3.nextElement();
                try {
                    try {
                        CRLDPEntry cRLDPEntry2 = new CRLDPEntry();
                        cRLDPEntry2.setDp(distPoint2);
                        cRLDPEntry2.setIssuerName(new Name(x509Certificate.getIssuerDN().getName()));
                        cRLDPEntry2.setForDeltaCRL(true);
                        cRLs2.add(getCRL(cRLDPEntry2));
                    } catch (IllegalArgumentException e3) {
                        Debug.handleException(e3);
                        throw new CRLManagerException(e3);
                    }
                } catch (CRLManagerException e4) {
                    Debug.handleException(e4);
                    throw new CRLManagerException(e4);
                }
            }
            return cRLs2;
        } catch (ASN1Exception e5) {
            Debug.handleException(e5);
            throw new CRLManagerException(e5);
        }
    }

    public static void loadCRLStoreManager() {
        b = CRLStoreManager.getInstance(a);
    }

    public static void setStoreManagerConfigPath(String str) {
        a = str;
    }
}
