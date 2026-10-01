package com.initech.cpv.manager;

import com.initech.cpv.manager.impl.CRLCertStatusManager;
import com.initech.cpv.manager.impl.EnhancedCRLCertStatusManager;
import com.initech.cpv.manager.impl.OCSPGDCertStatusManager;
import com.initech.cpv.manager.impl.OPPRACertStatusManager;
import com.initech.cpv.manager.impl.VFSVRCertStatusManager;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Properties;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CertStatusManager {
    private CertStatusManagerSpi a;

    public CertStatusManager(CertStatusManagerSpi certStatusManagerSpi) {
        this.a = certStatusManagerSpi;
    }

    public static CertStatusManager getInstance(String str, CertStatusManagerParameters certStatusManagerParameters) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (str == null || str.equals("CRL")) {
            return new CertStatusManager(new CRLCertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("EnhancedCRL")) {
            return new CertStatusManager(new EnhancedCRLCertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("VFSVR")) {
            return new CertStatusManager(new VFSVRCertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("OPPRA")) {
            return new CertStatusManager(new OPPRACertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("OCSPGD")) {
            return new CertStatusManager(new OCSPGDCertStatusManager(certStatusManagerParameters));
        }
        throw new NoSuchAlgorithmException("TrustManager '" + str + "' provider does not exist.");
    }

    public static CertStatusManager getInstance(String str, CertStatusManagerParameters certStatusManagerParameters, Properties properties) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (str == null || str.equals("CRL")) {
            return new CertStatusManager(new CRLCertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("EnhancedCRL")) {
            return new CertStatusManager(new EnhancedCRLCertStatusManager(certStatusManagerParameters));
        }
        if (str.equals("VFSVR")) {
            return new CertStatusManager(new VFSVRCertStatusManager(certStatusManagerParameters, properties));
        }
        if (str.equals("OPPRA")) {
            return new CertStatusManager(new OPPRACertStatusManager(certStatusManagerParameters, properties));
        }
        if (str.equals("OCSPGD")) {
            return new CertStatusManager(new OCSPGDCertStatusManager(certStatusManagerParameters, properties));
        }
        throw new NoSuchAlgorithmException("TrustManager '" + str + "' provider does not exist.");
    }

    public static CertStatusManager getInstance(String str, String str2, CertStatusManagerParameters certStatusManagerParameters) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (str.equals("OPPRA")) {
            return new CertStatusManager(new OPPRACertStatusManager(certStatusManagerParameters, str2));
        }
        throw new NoSuchAlgorithmException("TrustManager '" + str + "' provider does not exist.");
    }

    public static CertStatusManager getInstance(String str, String str2, CertStatusManagerParameters certStatusManagerParameters, Properties properties) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        if (str.equals("OPPRA")) {
            return new CertStatusManager(new OPPRACertStatusManager(certStatusManagerParameters, str2, properties));
        }
        throw new NoSuchAlgorithmException("TrustManager '" + str + "' provider does not exist.");
    }

    public String getErrorMessage() {
        return this.a.getErrorMessage();
    }

    public HashMap getResultInfo() {
        return this.a.getResultInfo();
    }

    public boolean isInefficacy() {
        return this.a.engineIsInefficacy();
    }

    public boolean isUsable() {
        return this.a.engineIsUsable();
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.initech.cpv.exception.UndeterminedCertStatusException] */
    public boolean isValid() {
        return this.a.engineIsValid();
    }

    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.initech.cpv.exception.UndeterminedCertStatusException] */
    public boolean isValid(X509Certificate x509Certificate) {
        return this.a.engineIsValid(x509Certificate);
    }

    public void setCertificate(X509Certificate x509Certificate) {
        this.a.engineSetCertificate(x509Certificate);
    }

    public void setClientInfo(String str, String str2) {
        CertStatusManagerSpi certStatusManagerSpi = this.a;
        certStatusManagerSpi.clientInfo = str;
        certStatusManagerSpi.req_URI = str2;
    }
}
