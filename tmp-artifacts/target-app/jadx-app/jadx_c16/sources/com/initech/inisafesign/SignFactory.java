package com.initech.inisafesign;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class SignFactory {
    private INISAFESign a;
    private CertManager b;
    private PKCS7Manager c;

    private SignFactory() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public SignFactory(INISAFESign iNISAFESign) {
        this.b = null;
        this.c = null;
        this.a = iNISAFESign;
    }

    public SignFactory getInstance() {
        return new SignFactory();
    }

    public SignFactory getInstance(INISAFESign iNISAFESign) {
        this.a = iNISAFESign;
        return getInstance();
    }

    public CertManager getCertManager() {
        return new CertManager(this.a);
    }

    public PKCS7Manager getPKCS7Manager() {
        return new PKCS7Manager();
    }
}
