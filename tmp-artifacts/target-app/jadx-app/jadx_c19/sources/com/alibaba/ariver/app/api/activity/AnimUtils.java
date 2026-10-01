package com.alibaba.ariver.app.api.activity;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AnimUtils {
    public static int getAnimResId(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "anim", context.getPackageName());
        if (identifier <= 0) {
            return 0;
        }
        return identifier;
    }
}
