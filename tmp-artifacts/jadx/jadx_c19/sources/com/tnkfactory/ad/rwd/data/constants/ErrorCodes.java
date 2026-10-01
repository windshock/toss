package com.tnkfactory.ad.rwd.data.constants;

import com.tnkfactory.ad.rwd.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ErrorCodes {
    public static final int ALEADY_PAYED = 4;
    public static final ErrorCodes INSTANCE = new ErrorCodes();
    public static final int INVALIDATE_PLACEMENT_ID = 17;
    public static final int INVALID_DEVICE = 6;
    public static final int INVALID_STATE = 3;
    public static final int LIMIT_DAY_COUNT = 12;
    public static final int NOT_YET_ATTEND_TIME = 11;
    public static final int NO_ADV = 2;
    public static final int NO_APP = 9;
    public static final int NO_ERROR = 0;
    public static final int NO_HISTORY = 5;
    public static final int NO_PAY_COND = 10;
    public static final int NO_PUB = 1;
    public static final int SYS_ERROR = 99;

    private ErrorCodes() {
    }

    public final String getErrorMessage(int i2) {
        if (i2 == 17) {
            String str = Resources.getResources().invalidate_placement_id;
            Intrinsics.checkNotNull(str);
            return str;
        }
        switch (i2) {
            case 0:
                return "";
            case 1:
                String str2 = Resources.getResources().error_no_pub;
                Intrinsics.checkNotNull(str2);
                return str2;
            case 2:
                String str3 = Resources.getResources().error_no_adv;
                Intrinsics.checkNotNull(str3);
                return str3;
            case 3:
                String str4 = Resources.getResources().error_inconsistent;
                Intrinsics.checkNotNull(str4);
                return str4;
            case 4:
                String str5 = Resources.getResources().error_already_paid;
                Intrinsics.checkNotNull(str5);
                return str5;
            case 5:
                String str6 = Resources.getResources().error_no_history;
                Intrinsics.checkNotNull(str6);
                return str6;
            case 6:
                String str7 = Resources.getResources().error_invalid_device;
                Intrinsics.checkNotNull(str7);
                return str7;
            default:
                switch (i2) {
                    case 9:
                        String str8 = Resources.getResources().error_no_adv;
                        Intrinsics.checkNotNull(str8);
                        return str8;
                    case 10:
                        String str9 = Resources.getResources().error_no_pay_condition;
                        Intrinsics.checkNotNull(str9);
                        return str9;
                    case 11:
                        String str10 = Resources.getResources().error_not_yet_attend_time;
                        Intrinsics.checkNotNull(str10);
                        return str10;
                    case 12:
                        String str11 = Resources.getResources().error_limit_day_count;
                        Intrinsics.checkNotNull(str11);
                        return str11;
                    default:
                        String str12 = Resources.getResources().error_system;
                        Intrinsics.checkNotNull(str12);
                        return str12;
                }
        }
    }
}
