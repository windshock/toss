package com.tmoney;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TmoneyConstants {
    public static final int TMONEY_MAX_BALANCE = 500000;

    public enum MonthlyHistoryType {
        All,
        Trans,
        Shoping,
        Gift,
        Load
    }

    public enum PayMethodType {
        Nothing,
        CreditCard,
        PhoneBill
    }

    public enum TelecomType {
        SktSeio,
        Kt,
        Lgu,
        Other,
        Unknown
    }

    public enum TmoneySdkDebugType {
        None,
        Debug
    }

    public enum TmoneyServerType {
        Alpha,
        Beta,
        Release
    }

    public enum TmoneyTagType {
        Purchase,
        Load,
        Refund,
        Others
    }
}
