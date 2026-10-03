package o;

import com.google.gson.annotations.SerializedName;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactInstanceManager3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactInstanceManager3[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("PAY_STANDBY")
    public static final ReactInstanceManager3 PAY_STANDBY = new ReactInstanceManager3("PAY_STANDBY", 0);

    @SerializedName("PAY_APPROVED")
    public static final ReactInstanceManager3 PAY_APPROVED = new ReactInstanceManager3("PAY_APPROVED", 1);

    @SerializedName("PAY_CANCEL")
    public static final ReactInstanceManager3 PAY_CANCEL = new ReactInstanceManager3("PAY_CANCEL", 2);

    @SerializedName("PAY_PROGRESS")
    public static final ReactInstanceManager3 PAY_PROGRESS = new ReactInstanceManager3("PAY_PROGRESS", 3);

    @SerializedName("PAY_COMPLETE")
    public static final ReactInstanceManager3 PAY_COMPLETE = new ReactInstanceManager3("PAY_COMPLETE", 4);

    @SerializedName("REFUND_PROGRESS")
    public static final ReactInstanceManager3 REFUND_PROGRESS = new ReactInstanceManager3("REFUND_PROGRESS", 5);

    @SerializedName("REFUND_SUCCESS")
    public static final ReactInstanceManager3 REFUND_SUCCESS = new ReactInstanceManager3("REFUND_SUCCESS", 6);

    @SerializedName("SETTLEMENT_COMPLETE")
    public static final ReactInstanceManager3 SETTLEMENT_COMPLETE = new ReactInstanceManager3("SETTLEMENT_COMPLETE", 7);

    @SerializedName("SETTLEMENT_REFUND_COMPLETE")
    public static final ReactInstanceManager3 SETTLEMENT_REFUND_COMPLETE = new ReactInstanceManager3("SETTLEMENT_REFUND_COMPLETE", 8);

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[ReactInstanceManager3.values().length];
            try {
                iArr[ReactInstanceManager3.PAY_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactInstanceManager3.REFUND_PROGRESS.ordinal()] = 2;
                int i = onNavigationEvent + 5;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactInstanceManager3.REFUND_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReactInstanceManager3.SETTLEMENT_REFUND_COMPLETE.ordinal()] = 4;
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReactInstanceManager3.PAY_STANDBY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReactInstanceManager3.PAY_APPROVED.ordinal()] = 6;
                int i7 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ReactInstanceManager3.PAY_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ReactInstanceManager3.PAY_COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ReactInstanceManager3.SETTLEMENT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ReactInstanceManager3[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ReactInstanceManager3[] reactInstanceManager3Arr = {PAY_STANDBY, PAY_APPROVED, PAY_CANCEL, PAY_PROGRESS, PAY_COMPLETE, REFUND_PROGRESS, REFUND_SUCCESS, SETTLEMENT_COMPLETE, SETTLEMENT_REFUND_COMPLETE};
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return reactInstanceManager3Arr;
    }

    public static EnumEntries<ReactInstanceManager3> getEntries() {
        EnumEntries<ReactInstanceManager3> enumEntries;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 80 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ReactInstanceManager3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactInstanceManager3 reactInstanceManager3 = (ReactInstanceManager3) Enum.valueOf(ReactInstanceManager3.class, str);
        if (i3 == 0) {
            return reactInstanceManager3;
        }
        throw null;
    }

    public static ReactInstanceManager3[] values() {
        ReactInstanceManager3[] reactInstanceManager3Arr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            reactInstanceManager3Arr = (ReactInstanceManager3[]) $VALUES.clone();
            int i3 = 47 / 0;
        } else {
            reactInstanceManager3Arr = (ReactInstanceManager3[]) $VALUES.clone();
        }
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return reactInstanceManager3Arr;
    }

    private ReactInstanceManager3(String str, int i) {
    }

    static {
        ReactInstanceManager3[] reactInstanceManager3Arr$values = $values();
        $VALUES = reactInstanceManager3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactInstanceManager3Arr$values);
        int i = onExtraCallback + 9;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean isRefundStatus() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = onNavigationEvent.$EnumSwitchMapping$0[ordinal()];
            throw null;
        }
        switch (onNavigationEvent.$EnumSwitchMapping$0[ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
            case 2:
            case 3:
            case 4:
                int i4 = onNavigationEvent + 63;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                int i5 = onWarmupCompleted + 47;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 21 / 0;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
