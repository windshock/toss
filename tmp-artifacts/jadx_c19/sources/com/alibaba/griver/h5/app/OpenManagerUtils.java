package com.alibaba.griver.h5.app;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class OpenManagerUtils {
    public static final String ONLINE_SUFFIX = "_online";

    public static String appendOnlineSuffix(String str) {
        return str + ONLINE_SUFFIX;
    }

    public static String removeOnlineSuffix(String str) {
        return str.replace(ONLINE_SUFFIX, "");
    }
}
