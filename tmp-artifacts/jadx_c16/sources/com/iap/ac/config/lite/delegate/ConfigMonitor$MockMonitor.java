package com.iap.ac.config.lite.delegate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.d.e;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ConfigMonitor$MockMonitor extends ConfigMonitor {
    private static final String b = e.b("MockMonitor");

    public void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map) {
        ACLog.d(b, String.format("behavior: event = %s, bizType = %s, extParams = %s", str, str2, String.valueOf(map)));
    }
}
