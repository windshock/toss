package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AFg1qSDK extends AFe1bSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFh1uSDK copy;
    private Map<String, Object> copydefault;
    private final AFd1mSDK equals;
    private final AFc1jSDK hashCode;
    private String registerClient;
    private final AFc1kSDK toString;

    public final boolean AFAdRevenueData() {
        return false;
    }

    public final AppsFlyerRequestListener component1() {
        return null;
    }

    public final boolean copy() {
        return false;
    }

    public AFg1qSDK(@NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.equals, new AFe1lSDK[]{AFe1lSDK.getCurrencyIso4217Code}, aFd1zSDK, "GCD-FETCH");
        this.equals = aFd1zSDK.getRevenue();
        this.hashCode = aFd1zSDK.getMediationNetwork();
        this.copy = aFd1zSDK.component2();
        this.toString = aFd1zSDK.AFAdRevenueData();
        ((AFe1uSDK) this).getMediationNetwork.add(AFe1lSDK.getRevenue);
        ((AFe1uSDK) this).getMediationNetwork.add(AFe1lSDK.copy);
    }

    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        Map<String, Object> map = this.copydefault;
        String str = this.registerClient;
        if (map != null) {
            AFg1oSDK.getMonetizationNetwork(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1oSDK.AFAdRevenueData(str);
        } else {
            AFg1oSDK.AFAdRevenueData("Unknown error");
        }
    }

    public final AFd1fSDK<Map<String, Object>> getRevenue(@NonNull String str) {
        String strConcat;
        String str2 = (String) AFa1tSDK.getMonetizationNetwork(new Object[]{this.hashCode, this.toString.component1()}, -195097357, 195097363, (int) System.currentTimeMillis());
        if (str2 != null && !str2.trim().isEmpty()) {
            if (!component2.contains(str2.toLowerCase(Locale.getDefault()))) {
                strConcat = "-".concat(str2);
            } else {
                AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", str2));
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        AFd1fSDK<Map<String, Object>> revenue = this.equals.getRevenue(strConcat, str);
        StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
        sb.append(revenue.getMediationNetwork.AFAdRevenueData);
        AFLogger.afInfoLog(sb.toString());
        return revenue;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.appsflyer.internal.AFe1nSDK */
    public final AFe1rSDK getMediationNetwork() throws Exception {
        AFe1rSDK mediationNetwork;
        AFe1rSDK aFe1rSDK;
        if (((AFe1bSDK) this).component1.getRevenue()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.registerClient = "'isStopTracking' enabled";
            throw new AFe1nSDK();
        }
        AFe1rSDK aFe1rSDK2 = AFe1rSDK.getCurrencyIso4217Code;
        int i2 = 0;
        while (i2 <= 2) {
            boolean z = true;
            boolean z2 = i2 >= 2;
            this.copy.copydefault = System.currentTimeMillis();
            try {
                try {
                    mediationNetwork = super.getMediationNetwork();
                    AFe1ySDK aFe1ySDK = ((AFe1bSDK) this).component4;
                    if (aFe1ySDK != null) {
                        int statusCode = aFe1ySDK.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (aFe1ySDK.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) aFe1ySDK.getBody();
                            int statusCode2 = aFe1ySDK.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.hashCode.getRevenue("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey("af_channel")) {
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get("af_channel"));
                                    AFLogger.afDebugLog(sb.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.hashCode.getMediationNetwork("attributionId", new JSONObject(map).toString());
                            if (!this.hashCode.getRevenue("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.copydefault = map;
                            aFe1rSDK = AFe1rSDK.AFAdRevenueData;
                            return aFe1rSDK;
                        }
                        if (z2 || !z) {
                            this.registerClient = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1rSDK = AFe1rSDK.getCurrencyIso4217Code;
                            return aFe1rSDK;
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e, false, false);
                    mediationNetwork = AFe1rSDK.getCurrencyIso4217Code;
                    if (z2) {
                        this.registerClient = e.getMessage();
                        throw e;
                    }
                } catch (AFe1pSDK e2) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.registerClient = "AppsFlyer dev key is missing";
                    throw e2;
                }
                aFe1rSDK2 = mediationNetwork;
                this.copy.getRevenue(i2);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                i2++;
            } finally {
                this.copy.getRevenue(i2);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1rSDK2;
    }
}
