package com.tmoney.logger;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface TmoneyLogger {
    void debug(String str, String str2);

    void error(String str, String str2, Throwable th);

    void warn(String str, String str2);
}
