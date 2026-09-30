package com.tnkfactory.ad.off.data;

import android.text.TextUtils;
import com.tnkfactory.ad.rwd.Utils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdJoinInfoVoKt {
    public static final String getPpiMarketUrlInternal(@NotNull AdJoinInfoVo adJoinInfoVo) {
        Intrinsics.checkNotNullParameter(adJoinInfoVo, "");
        String mkt_app_id = adJoinInfoVo.getMkt_app_id();
        if (TextUtils.isEmpty(adJoinInfoVo.getMkt_app_id()) || Utils.isNull(adJoinInfoVo.getApk_key())) {
            return mkt_app_id;
        }
        if (StringsKt.contains$default(mkt_app_id, "?", false, 2, (Object) null)) {
            return mkt_app_id + "&adkey=" + adJoinInfoVo.getApk_key();
        }
        return mkt_app_id + "?adkey=" + adJoinInfoVo.getApk_key();
    }
}
