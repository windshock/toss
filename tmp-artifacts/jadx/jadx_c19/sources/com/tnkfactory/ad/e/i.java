package com.tnkfactory.ad.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.tnkfactory.ad.rwd.Settings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract /* synthetic */ class i {
    public static SharedPreferences.Editor a(Context context, String str, Settings settings, Context context2) {
        Intrinsics.checkNotNullParameter(context, str);
        return settings.getPreference(context2).edit();
    }
}
