package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.text.TextUtils;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdidManager {
    public static final AdidManager INSTANCE = new AdidManager();

    public final AdvertisingIdInfo getAdvertisingIdThread() {
        return AdvertisingIdService.INSTANCE.getAdvertisingIdInfo(getApplicationContext());
    }

    public final Context getApplicationContext() {
        return TnkCore.INSTANCE.getAppResource().getApplicationContext();
    }

    public final String getAdvertisingIdThread(@NotNull SessionInfo sessionInfo) {
        Intrinsics.checkNotNullParameter(sessionInfo, "");
        try {
            AdvertisingIdInfo advertisingIdInfo = AdvertisingIdService.INSTANCE.getAdvertisingIdInfo(getApplicationContext());
            String id = advertisingIdInfo.getId();
            if (id != null) {
                String strReplace = new Regex("-").replace(id, "");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = strReplace.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                sessionInfo.setAdid(lowerCase);
                Logger.d("* adid : " + sessionInfo.getAdid());
                if (!TextUtils.isEmpty(sessionInfo.getAdid())) {
                    Settings settings = Settings.INSTANCE;
                    Context applicationContext = getApplicationContext();
                    String adid = sessionInfo.getAdid();
                    Intrinsics.checkNotNull(adid);
                    settings.setAdid(applicationContext, adid);
                }
            } else {
                sessionInfo.setAdid("00000000000000000000000000000000");
            }
            sessionInfo.setAdidLimited(advertisingIdInfo.isLimited());
        } catch (Exception e) {
            Logger.e("GAID " + getApplicationContext().getPackageName() + ": " + e.getMessage());
            sessionInfo.setErrorMessage(e.getMessage());
            sessionInfo.setAdid(Settings.INSTANCE.getAdid(getApplicationContext()));
        }
        Logger.d("advertsing id = " + sessionInfo.getAdid());
        String adid2 = sessionInfo.getAdid();
        Intrinsics.checkNotNull(adid2);
        return adid2;
    }
}
