package com.initech.cpv.manager.impl;

import com.initech.cpv.manager.CertStatusManagerParameters;
import com.initech.cpv.manager.TrustManager;
import com.initech.x509.CRLs;
import java.security.cert.X509CRL;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CRLCertStatusManagerParameters implements CertStatusManagerParameters {
    private boolean b;
    private boolean c;
    private TrustManager f;
    private boolean a = false;
    private boolean g = true;
    private boolean h = true;
    private CRLs d = new CRLs();
    private CRLs e = new CRLs();

    public void addUserDefinedCompleteCRL(X509CRL x509crl) {
        this.d.add(x509crl);
    }

    public void addUserDefinedDeltaCRLs(X509CRL x509crl) {
        this.e.add(x509crl);
    }

    public TrustManager getCrlIssuerManager() {
        return this.f;
    }

    public CRLs getUserDefinedCompleteCRLs() {
        return this.d;
    }

    public CRLs getUserDefinedDeltaCRLs() {
        return this.e;
    }

    public boolean isIgnoreCACert() {
        return this.h;
    }

    public boolean isIgnoreOldVersionCert() {
        return this.g;
    }

    public boolean isUseDeltaCRL() {
        return this.b;
    }

    public boolean isUseUserDefinedCRL() {
        return this.c;
    }

    public boolean isVerifyCRL() {
        return this.a;
    }

    public void setCrlIssuerManager(TrustManager trustManager) {
        this.f = trustManager;
    }

    public void setIgnoreCACert(boolean z) {
        this.h = z;
    }

    public void setIgnoreOldVersionCert(boolean z) {
        this.g = z;
    }

    public void setUseDeltaCRL(boolean z) {
        this.b = z;
    }

    public void setUseUserDefinedCRL(boolean z) {
        this.c = z;
    }

    public void setUserDefinedCompleteCRLs(CRLs cRLs) {
        this.d = cRLs;
    }

    public void setUserDefinedDeltaCRLs(CRLs cRLs) {
        this.e = cRLs;
    }

    public void setVerifyCRL(boolean z) {
        this.a = z;
    }
}
