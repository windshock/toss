package com.initech.xsafe.cert;

import java.net.ProtocolException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class INIXSAFEProtocolException extends ProtocolException {
    public static final int CERT_EXPIRED = 5020;
    public static final int CERT_NOT_YET_VALID = 5021;
    public static final int FAIL_TO_CONVERT_TO_DER = 5023;
    public static final int FAIL_TO_CONVERT_TO_PEM = 5013;
    public static final int FAIL_TO_DEC_DATA = 5019;
    public static final int FAIL_TO_ENC_DATA = 5008;
    public static final int FAIL_TO_ENC_SESSION_KEY = 5007;
    public static final int FAIL_TO_ENC_TS = 5011;
    public static final int FAIL_TO_GEN_MARSTERSEC = 5005;
    public static final int FAIL_TO_GEN_RAND = 5016;
    public static final int FAIL_TO_GEN_SESSION_KEY = 5004;
    public static final int FAIL_TO_GET_SERVER_TIME = 5010;
    public static final int FAIL_TO_GET_SYS_TIME = 5009;
    public static final int FAIL_TO_LOAD_ALL_CA_CERTS = 5002;
    public static final int FAIL_TO_LOAD_A_CERT = 5001;
    public static final int FAIL_TO_LOAD_PRI_KEY = 5012;
    public static final int FAIL_TO_MAKE_HANDSHAKE_INIT = 5017;
    public static final int FAIL_TO_MAKE_SIG = 5014;
    public static final int FAIL_TO_MAKE_VD = 5015;
    public static final int FAIL_TO_NFILTER_DECRYPT = 6000;
    public static final int FAIL_TO_VERIFY_A_CERT = 5003;
    public static final int IO_EXCEPTION = 5000;
    public static final int NOT_SUPPORTED_ALGORITHM = 5006;
    public static final int NOT_SUPPORTED_URL_ENCODE = 5018;
    public static final int NO_MATCH_CA_CERTS = 5022;
    private static final long serialVersionUID = -6664577609242820618L;
    public int a;
    public String b;

    @Deprecated
    public INIXSAFEProtocolException() {
        this.a = 0;
    }

    public int getErrorCode() {
        return this.a;
    }

    @Deprecated
    public String getErrorMessage() {
        return this.b;
    }

    @Deprecated
    public void setErrorCode(int i) {
        this.a = i;
    }

    @Deprecated
    public void setErrorMessage(String str) {
        this.b = str;
    }

    public INIXSAFEProtocolException(String str) {
        super(str);
        this.a = 0;
    }

    public INIXSAFEProtocolException(String str, int i) {
        super(str);
        this.b = str;
        this.a = i;
    }
}
