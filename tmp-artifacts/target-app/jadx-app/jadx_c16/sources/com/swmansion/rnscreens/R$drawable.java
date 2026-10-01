package com.swmansion.rnscreens;

import im.toss.rn.granite.android.R;
import java.lang.reflect.Field;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class R$drawable {
    public static int rns_rounder_top_corners_shape;

    static {
        try {
            for (Field field : R$drawable.class.getDeclaredFields()) {
                if (field.getType() == Integer.TYPE) {
                    try {
                        field.setInt(null, R.drawable.class.getField(field.getName()).getInt(null));
                    } catch (NoSuchFieldException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
