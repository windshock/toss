package com.initech.pkix.cmp.client;

import com.initech.asn1.useful.EVID;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PKICMPInterface {
    Certificate getEncCACert();

    byte[] getUesrPrivateKey(String str, String str2) throws Exception;

    byte[] getUserCert(String str) throws Exception;

    void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, String str4, String str5) throws Exception;

    void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, Certificate certificate2, String str4) throws Exception;

    int requestGetCACert(String str, String str2, String str3) throws CMPException;

    void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException;

    void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i, PublicKey publicKey, EVID evid) throws CMPException;

    void requestKUR(String str, String str2, String str3, int i) throws CMPException;

    void requestKUR(String str, String str2, String str3, int i, PublicKey publicKey, EVID evid) throws CMPException;

    int requestPreKUR(String str, String str2) throws CMPException;
}
