package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AFd1iSDK$AFa1zSDK {
    private AFd1iSDK$AFa1zSDK() {
    }

    static String getCurrencyIso4217Code(String str, String str2, String str3) {
        return String.format(AFd1mSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()) + str + str3 + "?device_id=" + str2;
    }

    public static String getMediationNetwork(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
    }

    public /* synthetic */ AFd1iSDK$AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
