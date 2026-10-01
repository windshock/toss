package com.iap.ac.android.acs.operation.utils;

import com.iap.ac.android.acs.operation.biz.region.config.RegionRPCConfigCenter;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RegionUtils {
    public static boolean isRegionMiniProgram(String str) {
        List regionMiniAppList = RegionRPCConfigCenter.INSTANCE.getRegionMiniAppList();
        return regionMiniAppList != null && regionMiniAppList.contains(str);
    }
}
