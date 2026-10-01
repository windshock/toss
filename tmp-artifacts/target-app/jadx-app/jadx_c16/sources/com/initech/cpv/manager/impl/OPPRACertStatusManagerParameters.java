package com.initech.cpv.manager.impl;

import com.initech.cpv.manager.CertStatusManagerParameters;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class OPPRACertStatusManagerParameters implements CertStatusManagerParameters {
    public static String[] advanced;
    public static String[] ipAddrs;
    public static String[] issuers;
    public static int[] ports;
    public static String raCode;
    public static String[] subjects;
    public static int[] versions;
    public String propertiesPath;

    public OPPRACertStatusManagerParameters(String str) {
        this.propertiesPath = str;
    }
}
