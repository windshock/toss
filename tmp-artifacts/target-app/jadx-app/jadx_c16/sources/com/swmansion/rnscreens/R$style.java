package com.swmansion.rnscreens;

import im.toss.rn.granite.android.R;
import java.lang.reflect.Field;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class R$style {
    public static int custom;

    static {
        try {
            for (Field field : R$style.class.getDeclaredFields()) {
                if (field.getType() == Integer.TYPE) {
                    try {
                        field.setInt(null, R.style.class.getField(field.getName()).getInt(null));
                    } catch (NoSuchFieldException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
