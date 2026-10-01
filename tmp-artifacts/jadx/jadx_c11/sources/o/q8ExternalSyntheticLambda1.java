package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q8ExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q8ExternalSyntheticLambda1[] $VALUES;
    public static final onExtraCallback Companion;
    public static final q8ExternalSyntheticLambda1 DOLLAR_INDEX;
    public static final q8ExternalSyntheticLambda1 DOWJONES;
    public static final q8ExternalSyntheticLambda1 EXCHANGE_RATE;
    public static final q8ExternalSyntheticLambda1 KOSDAQ;
    public static final q8ExternalSyntheticLambda1 KOSPI;
    public static final q8ExternalSyntheticLambda1 NASDAQ;
    public static final q8ExternalSyntheticLambda1 NASDAQ_100_FUTURE;
    public static final q8ExternalSyntheticLambda1 RFU_GCv1;
    public static final q8ExternalSyntheticLambda1 SP500;
    public static final q8ExternalSyntheticLambda1 VIX;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String code;
    private final String displayName;
    private final boolean hasTradingTrend;
    private final r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM nation;
    private final boolean onlyAccountHolder;

    private static final /* synthetic */ q8ExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        q8ExternalSyntheticLambda1[] q8externalsyntheticlambda1Arr = {KOSPI, KOSDAQ, NASDAQ, NASDAQ_100_FUTURE, SP500, DOWJONES, EXCHANGE_RATE, DOLLAR_INDEX, VIX, RFU_GCv1};
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return q8externalsyntheticlambda1Arr;
    }

    public static EnumEntries<q8ExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<q8ExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static q8ExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        q8ExternalSyntheticLambda1 q8externalsyntheticlambda1 = (q8ExternalSyntheticLambda1) Enum.valueOf(q8ExternalSyntheticLambda1.class, str);
        if (i3 == 0) {
            return q8externalsyntheticlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static q8ExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        q8ExternalSyntheticLambda1[] q8externalsyntheticlambda1Arr = (q8ExternalSyntheticLambda1[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return q8externalsyntheticlambda1Arr;
        }
        obj.hashCode();
        throw null;
    }

    private q8ExternalSyntheticLambda1(String str, int i, String str2, String str3, boolean z, boolean z2, r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm) {
        this.code = str2;
        this.displayName = str3;
        this.hasTradingTrend = z;
        this.onlyAccountHolder = z2;
        this.nation = r8lambdamazqeecwc_30vx1ypp8pkuv5zm;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ q8ExternalSyntheticLambda1(String str, int i, String str2, String str3, boolean z, boolean z2, r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4;
        if ((i2 & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 21;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 57;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 8) != 0) {
            int i8 = 2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        this(str, i, str2, str3, z3, z4, r8lambdamazqeecwc_30vx1ypp8pkuv5zm);
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayName;
        int i5 = i2 + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    public final boolean getHasTradingTrend() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hasTradingTrend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getOnlyAccountHolder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onlyAccountHolder;
        int i4 = i2 + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM getNation() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm = this.nation;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return r8lambdamazqeecwc_30vx1ypp8pkuv5zm;
    }

    static {
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm = r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM.KR;
        boolean z = true;
        boolean z2 = false;
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        KOSPI = new q8ExternalSyntheticLambda1("KOSPI", 0, "KGG01P", "코스피", z, z2, r8lambdamazqeecwc_30vx1ypp8pkuv5zm, i, defaultConstructorMarker);
        KOSDAQ = new q8ExternalSyntheticLambda1("KOSDAQ", 1, "QGG01P", "코스닥", z, z2, r8lambdamazqeecwc_30vx1ypp8pkuv5zm, i, defaultConstructorMarker);
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm2 = r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM.US;
        boolean z3 = false;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        NASDAQ = new q8ExternalSyntheticLambda1("NASDAQ", 2, "COMP.NAI", "나스닥", z3, false, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, 12, defaultConstructorMarker2);
        NASDAQ_100_FUTURE = new q8ExternalSyntheticLambda1("NASDAQ_100_FUTURE", 3, "RFU.NQc1", "나스닥 100 선물", z3, true, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, 4, defaultConstructorMarker2);
        SP500 = new q8ExternalSyntheticLambda1("SP500", 4, "SPX.CBI", "S&P 500", z3, false, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, 12, defaultConstructorMarker2);
        DOWJONES = new q8ExternalSyntheticLambda1("DOWJONES", 5, "DJI.DJI", "다우존스", z3, true, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, 4, defaultConstructorMarker2);
        boolean z4 = false;
        int i2 = 12;
        EXCHANGE_RATE = new q8ExternalSyntheticLambda1("EXCHANGE_RATE", 6, "EXCHANGE_RATE", "달러 환율", z3, z4, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, i2, defaultConstructorMarker2);
        DOLLAR_INDEX = new q8ExternalSyntheticLambda1("DOLLAR_INDEX", 7, "RGI..DXY", "달러 인덱스", z3, z4, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, i2, defaultConstructorMarker2);
        VIX = new q8ExternalSyntheticLambda1("VIX", 8, "RGI..VIX", "VIX", z3, z4, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, i2, defaultConstructorMarker2);
        RFU_GCv1 = new q8ExternalSyntheticLambda1("RFU_GCv1", 9, "RFU.GCv1", "금", z3, z4, r8lambdamazqeecwc_30vx1ypp8pkuv5zm2, i2, defaultConstructorMarker2);
        q8ExternalSyntheticLambda1[] q8externalsyntheticlambda1Arr$values = $values();
        $VALUES = q8externalsyntheticlambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(q8externalsyntheticlambda1Arr$values);
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Companion = new onExtraCallback(defaultConstructorMarker3);
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        defaultConstructorMarker3.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final List<q8ExternalSyntheticLambda1> onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            EnumEntries<q8ExternalSyntheticLambda1> entries = q8ExternalSyntheticLambda1.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entries) {
                if (!(true ^ ((q8ExternalSyntheticLambda1) obj).getOnlyAccountHolder())) {
                    int i2 = IAuthTabCallback + 45;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    if (z) {
                    }
                }
                int i4 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(obj);
            }
            return arrayList;
        }
    }
}
