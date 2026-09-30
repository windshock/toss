package com.alibaba.ariver.engine.api.common.log;

import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.log.EventLog;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IgnoreLogUtils {
    public static final String TYPE_API = "api";
    public static final String TYPE_EVENT = "event";

    public static void handleIgnoreLog(String str, String str2, String str3, String str4, int i2, Map<String, LogCountInfo> map, String str5) {
        if (i2 != 0) {
            LogCountInfo logCountInfo = map.get(str2);
            if (logCountInfo == null) {
                logCountInfo = new LogCountInfo(0, str2 + "_" + System.currentTimeMillis());
                if (map.size() < 100) {
                    map.put(str2, logCountInfo);
                }
            } else if (logCountInfo.count > i2) {
                logCountInfo.groupId = str2 + "_" + System.currentTimeMillis();
                logCountInfo.count = 0;
            }
            logCountInfo.count++;
            if (str5.equals(TYPE_EVENT)) {
                AppLogger.log(((EventLog.Builder) ((EventLog.Builder) new EventLog.Builder().setParentId(str)).setGroupId(logCountInfo.groupId)).setData(str4 + " [" + str2 + "] ignored").build());
                return;
            }
            AppLogger.log(((ApiLog.Builder) ((ApiLog.Builder) ((ApiLog.Builder) new ApiLog.Builder().setParentId(str)).setGroupId(logCountInfo.groupId)).setState(str3)).setData(str4 + " [" + str2 + "] ignored").build());
        }
    }
}
