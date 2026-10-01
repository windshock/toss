package im.toss.features.loan.calculator;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanInterestCalculatorActivity$asInterface {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoanInterestCalculatorActivity$asInterface[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final LoanInterestCalculatorActivity$asInterface INPUT_AMOUNT = new LoanInterestCalculatorActivity$asInterface("INPUT_AMOUNT", 0);
    public static final LoanInterestCalculatorActivity$asInterface INPUT_INTEREST = new LoanInterestCalculatorActivity$asInterface("INPUT_INTEREST", 1);
    public static final LoanInterestCalculatorActivity$asInterface INPUT_MONTH = new LoanInterestCalculatorActivity$asInterface("INPUT_MONTH", 2);
    public static final LoanInterestCalculatorActivity$asInterface SELECT_TYPE = new LoanInterestCalculatorActivity$asInterface("SELECT_TYPE", 3);
    public static final LoanInterestCalculatorActivity$asInterface DIVIDER = new LoanInterestCalculatorActivity$asInterface("DIVIDER", 4);
    public static final LoanInterestCalculatorActivity$asInterface DIVIDER_2 = new LoanInterestCalculatorActivity$asInterface("DIVIDER_2", 5);
    public static final LoanInterestCalculatorActivity$asInterface RESULT_SUMMARY = new LoanInterestCalculatorActivity$asInterface("RESULT_SUMMARY", 6);
    public static final LoanInterestCalculatorActivity$asInterface LOAN_BANNER = new LoanInterestCalculatorActivity$asInterface("LOAN_BANNER", 7);
    public static final LoanInterestCalculatorActivity$asInterface RESULT_HEADER = new LoanInterestCalculatorActivity$asInterface("RESULT_HEADER", 8);
    public static final LoanInterestCalculatorActivity$asInterface RESULT_ITEM = new LoanInterestCalculatorActivity$asInterface("RESULT_ITEM", 9);
    public static final LoanInterestCalculatorActivity$asInterface BOTTOM_PADDING_AREA = new LoanInterestCalculatorActivity$asInterface("BOTTOM_PADDING_AREA", 10);

    private static final /* synthetic */ LoanInterestCalculatorActivity$asInterface[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        LoanInterestCalculatorActivity$asInterface[] loanInterestCalculatorActivity$asInterfaceArr = {INPUT_AMOUNT, INPUT_INTEREST, INPUT_MONTH, SELECT_TYPE, DIVIDER, DIVIDER_2, RESULT_SUMMARY, LOAN_BANNER, RESULT_HEADER, RESULT_ITEM, BOTTOM_PADDING_AREA};
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return loanInterestCalculatorActivity$asInterfaceArr;
    }

    public static EnumEntries<LoanInterestCalculatorActivity$asInterface> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<LoanInterestCalculatorActivity$asInterface> enumEntries = $ENTRIES;
        int i4 = i3 + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static LoanInterestCalculatorActivity$asInterface valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanInterestCalculatorActivity$asInterface loanInterestCalculatorActivity$asInterface = (LoanInterestCalculatorActivity$asInterface) Enum.valueOf(LoanInterestCalculatorActivity$asInterface.class, str);
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return loanInterestCalculatorActivity$asInterface;
    }

    public static LoanInterestCalculatorActivity$asInterface[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanInterestCalculatorActivity$asInterface[] loanInterestCalculatorActivity$asInterfaceArr = $VALUES;
        if (i3 != 0) {
            return (LoanInterestCalculatorActivity$asInterface[]) loanInterestCalculatorActivity$asInterfaceArr.clone();
        }
        throw null;
    }

    private LoanInterestCalculatorActivity$asInterface(String str, int i) {
    }

    static {
        LoanInterestCalculatorActivity$asInterface[] loanInterestCalculatorActivity$asInterfaceArr$values = $values();
        $VALUES = loanInterestCalculatorActivity$asInterfaceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loanInterestCalculatorActivity$asInterfaceArr$values);
        int i = onNavigationEvent + 21;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
