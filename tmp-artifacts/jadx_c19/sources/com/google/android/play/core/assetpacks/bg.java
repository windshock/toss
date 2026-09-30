package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class bg {
    public static boolean a(@AssetPackStatus int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 9 || i2 == 3;
    }

    public static boolean b(@AssetPackStatus int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    static boolean c(@AssetPackStatus int i2, @AssetPackStatus int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6) {
            if (i3 != 6 && i3 != 5) {
                return true;
            }
            i2 = 6;
        }
        if (i2 == 4 && i3 != 4) {
            return true;
        }
        if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
            return true;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    public static boolean d(@AssetPackStatus int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }
}
