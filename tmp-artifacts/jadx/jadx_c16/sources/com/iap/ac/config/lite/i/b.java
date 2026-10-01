package com.iap.ac.config.lite.i;

import android.content.Context;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.IACMonitor;
import com.iap.ac.android.common.log.event.BaseLogEvent;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.PageLogEvent;
import com.iap.ac.android.loglite.api.AnalyticsConfig;
import com.iap.ac.android.loglite.api.CommonAnalyticsAgent;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.config.lite.d.e;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class b {
    private static final String b = e.b("LogService");
    private static boolean c = false;
    private CommonAnalyticsAgent a;

    class a implements IACMonitor {
        a() {
        }

        public void flush() {
            b.this.a.flushLogs();
        }

        public void logEvent(LogEvent logEvent) {
            if (logEvent == null) {
                ACLog.i(b.b, "sendBehavior log error, event is null");
                return;
            }
            ACLog.i(b.b, "logBehavior to lite log, bizCode:" + ((BaseLogEvent) logEvent).bizCode);
            b.this.a.sendBehaviorLog(logEvent.eventName, ((BaseLogEvent) logEvent).bizCode, ((BaseLogEvent) logEvent).params);
        }

        public void logPageEvent(PageLogEvent pageLogEvent) {
        }

        public void setGlobalParameters(Map<String, String> map) {
            AnalyticsContext.getInstance().setGlobalExtParam(map);
        }
    }

    protected b() {
    }

    public static b b() {
        return b.a();
    }

    public void a(Context context, String str, String str2) {
        synchronized (this) {
            if (c) {
                return;
            }
            if (e.a("com.iap.ac.android.loglite.api.AnalyticsConfig") && e.a("com.iap.ac.android.loglite.api.AnalyticsHelper")) {
                AnalyticsConfig.init(context, str, str2);
                AnalyticsConfig.addCrashWhiteList("com.iap.ac");
                AnalyticsConfig.registerBizTypeToUploadUrl("AMCS-LITE", str2);
                ACLog.i(b, "Log component initialize finish");
                this.a = new CommonAnalyticsAgent("amcslite_biz");
                ACMonitor.setACMonitorImpl(new a(), "amcslite_biz");
                c = true;
                return;
            }
            ACLog.e(b, "lite log init error, without dependent libraries");
        }
    }
}
