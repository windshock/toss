package com.initech.cpv.manager.impl;

import com.initech.cpv.manager.CertStatusManagerParameters;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class VFSVRCertStatusManagerParameters implements CertStatusManagerParameters {
    public static String host = "127.0.0.1";
    public static int port = 4200;
    public static int version = 2;
    public String propertiesPath;

    public VFSVRCertStatusManagerParameters(String str) {
        this.propertiesPath = str;
    }
}
