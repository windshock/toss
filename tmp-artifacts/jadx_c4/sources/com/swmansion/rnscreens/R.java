package com.swmansion.rnscreens;

import im.toss.rn.granite.android.R;
import java.lang.reflect.Field;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class R {

    public static final class anim {
        public static int rns_default_enter_in;
        public static int rns_default_enter_out;
        public static int rns_default_exit_in;
        public static int rns_default_exit_out;
        public static int rns_fade_from_bottom;
        public static int rns_fade_in;
        public static int rns_fade_out;
        public static int rns_fade_to_bottom;
        public static int rns_ios_from_left_background_close;
        public static int rns_ios_from_left_background_open;
        public static int rns_ios_from_left_foreground_close;
        public static int rns_ios_from_left_foreground_open;
        public static int rns_ios_from_right_background_close;
        public static int rns_ios_from_right_background_open;
        public static int rns_ios_from_right_foreground_close;
        public static int rns_ios_from_right_foreground_open;
        public static int rns_no_animation_20;
        public static int rns_no_animation_250;
        public static int rns_no_animation_350;
        public static int rns_no_animation_medium;
        public static int rns_slide_in_from_bottom;
        public static int rns_slide_in_from_left;
        public static int rns_slide_in_from_right;
        public static int rns_slide_out_to_bottom;
        public static int rns_slide_out_to_left;
        public static int rns_slide_out_to_right;
        public static int rns_standard_accelerate_interpolator;

        static {
            try {
                for (Field field : anim.class.getDeclaredFields()) {
                    if (field.getType() == Integer.TYPE) {
                        try {
                            field.setInt(null, R.anim.class.getField(field.getName()).getInt(null));
                        } catch (NoSuchFieldException unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
