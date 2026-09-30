package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.core.impl.Quirks$;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class u {
    private static AccessibilityManager a;

    private static AccessibilityManager a(Context context) {
        if (a == null) {
            a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return a;
    }

    public static String b(Context context) {
        AccessibilityManager accessibilityManagerA;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerA = a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerA.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                String str = String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return Quirks$.ExternalSyntheticBackport0.onExtraCallbackWithResult(",", arrayList);
    }
}
