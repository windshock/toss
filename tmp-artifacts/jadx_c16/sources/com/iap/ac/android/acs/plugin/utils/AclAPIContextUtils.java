package com.iap.ac.android.acs.plugin.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.model.acl.AclMiniProgramMetaData;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AclAPIContextUtils {
    public static final String AC_MERCHANT_ID = "merchantId";

    public static AclAPIContext createAclAPIContext(@NonNull IAPConnectPluginContext iAPConnectPluginContext) {
        String str = iAPConnectPluginContext.miniProgramAppID;
        JSONObject jSONObject = iAPConnectPluginContext.acParams;
        String strOptString = jSONObject != null ? jSONObject.optString(AC_MERCHANT_ID) : null;
        ACLog.d("IAPConnectPlugin", "ApiContextUtils#createAclApiContext, appId: " + str + ", merchantId: " + strOptString);
        return new AclAPIContext("AlipayConnect", new AclMiniProgramMetaData(str, strOptString), new HashMap());
    }
}
