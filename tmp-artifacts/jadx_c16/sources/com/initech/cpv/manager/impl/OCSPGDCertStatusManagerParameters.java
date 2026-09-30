package com.initech.cpv.manager.impl;

import com.initech.cpv.manager.CertStatusManagerParameters;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class OCSPGDCertStatusManagerParameters implements CertStatusManagerParameters {
    public static String certRegURL = null;
    public static boolean dbQuery = false;
    public static String ipAddr = null;
    public static String[] issuers = null;
    public static int port = 0;
    public static String raCode = null;
    public static int version = -1;
    public String propertiesPath;

    public OCSPGDCertStatusManagerParameters(String str) {
        this.propertiesPath = str;
    }
}
