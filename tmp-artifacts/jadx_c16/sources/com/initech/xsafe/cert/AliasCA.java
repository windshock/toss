package com.initech.xsafe.cert;

import com.initech.asn1.useful.Name;
import com.initech.xsafe.util.mlog.IniSafeLog;
import java.security.cert.X509Certificate;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AliasCA {
    protected final String ALIAS_CROSSCERT = "crosscert";
    protected final String ALIAS_TRADESIGNT = "tradesignt";
    protected final String ANOTHER_CN_CROSSCERT = "CrossCert Certificate Authority";
    protected final String ANOTHER_CN_TRADESIGNT = "TradeSignCA2009";
    protected final Hashtable<String, String> caHt;

    public AliasCA() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        this.caHt = hashtable;
        hashtable.put("yessign", "yessignCA");
        hashtable.put("yessignt", "yessignCA-Test");
        hashtable.put("signkorea", "SignKorea CA");
        hashtable.put("signkoreat", "SignKorea Test CA");
        hashtable.put("signgate", "signGATE CA");
        hashtable.put("signgatet", "signGATE FTCA");
        hashtable.put("crosscert", "CrossCertCA");
        hashtable.put("crosscertt", "CrossCertTestCA");
        hashtable.put("tradesign", "TradeSignCA");
        hashtable.put("tradesignt", "TestTradeSignCA");
    }

    public String getCN(String str) {
        return this.caHt.get(str.toLowerCase());
    }

    public boolean isMatchedCert(X509Certificate x509Certificate, String str) {
        IniSafeLog.debug("<-- [isMatchedCert method]");
        String string = x509Certificate.getIssuerDN().toString();
        String cn = getCN(str);
        boolean z = false;
        if (cn != null ? string.contains(cn) || ((str.equalsIgnoreCase("crosscert") && string.contains("CrossCert Certificate Authority")) || (str.equalsIgnoreCase("tradesignt") && string.contains("TradeSignCA2009"))) : string.contains(str)) {
            z = true;
        }
        IniSafeLog.debug("--> [isMatchedCert method]");
        return z;
    }

    public boolean isMatchedCertByFilter(X509Certificate x509Certificate, String str) {
        IniSafeLog.debug("<-- [isMatchedCertByFilter method]");
        if (str == null || str.trim().equals("")) {
            return true;
        }
        if (str.equalsIgnoreCase("real")) {
            str = "yessign|signkorea|signgate|crosscert|tradesign|nca|inipass";
        }
        if (str.equalsIgnoreCase("test")) {
            str = "yessignt|signkoreat|signgatet|crosscertt|tradesignt|ncat|inipasst";
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        while (stringTokenizer.hasMoreTokens()) {
            if (isMatchedCert(x509Certificate, stringTokenizer.nextToken())) {
                return true;
            }
        }
        IniSafeLog.debug("--> [isMatchedCertByFilter method]");
        return false;
    }

    public boolean isMatchedFullCertByFilter(X509Certificate x509Certificate, String str) {
        IniSafeLog.debug("<-- [isMatchedFullCertByFilter method]");
        if (str == null || str.trim().equals("")) {
            return true;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        while (stringTokenizer.hasMoreTokens()) {
            if (new Name(x509Certificate.getIssuerDN().toString()).equals(new Name(stringTokenizer.nextToken()))) {
                return true;
            }
        }
        IniSafeLog.debug("--> [isMatchedFullCertByFilter method]");
        return false;
    }
}
