package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
final class TransactionDetailActivity$onExtraCallbackWithResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionDetailActivity$onExtraCallbackWithResult[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final float ratio;
    public static final TransactionDetailActivity$onExtraCallbackWithResult TOP = new TransactionDetailActivity$onExtraCallbackWithResult("TOP", 0, 0.0f);
    public static final TransactionDetailActivity$onExtraCallbackWithResult CENTER = new TransactionDetailActivity$onExtraCallbackWithResult("CENTER", 1, 0.5f);
    public static final TransactionDetailActivity$onExtraCallbackWithResult BOTTOM = new TransactionDetailActivity$onExtraCallbackWithResult("BOTTOM", 2, 1.0f);

    private static final /* synthetic */ TransactionDetailActivity$onExtraCallbackWithResult[] $values() {
        TransactionDetailActivity$onExtraCallbackWithResult[] transactionDetailActivity$onExtraCallbackWithResultArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            TransactionDetailActivity$onExtraCallbackWithResult transactionDetailActivity$onExtraCallbackWithResult = TOP;
            TransactionDetailActivity$onExtraCallbackWithResult transactionDetailActivity$onExtraCallbackWithResult2 = CENTER;
            TransactionDetailActivity$onExtraCallbackWithResult transactionDetailActivity$onExtraCallbackWithResult3 = BOTTOM;
            transactionDetailActivity$onExtraCallbackWithResultArr = new TransactionDetailActivity$onExtraCallbackWithResult[4];
            transactionDetailActivity$onExtraCallbackWithResultArr[1] = transactionDetailActivity$onExtraCallbackWithResult;
            transactionDetailActivity$onExtraCallbackWithResultArr[1] = transactionDetailActivity$onExtraCallbackWithResult2;
            transactionDetailActivity$onExtraCallbackWithResultArr[2] = transactionDetailActivity$onExtraCallbackWithResult3;
        } else {
            transactionDetailActivity$onExtraCallbackWithResultArr = new TransactionDetailActivity$onExtraCallbackWithResult[]{TOP, CENTER, BOTTOM};
        }
        int i4 = i2 + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionDetailActivity$onExtraCallbackWithResultArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<TransactionDetailActivity$onExtraCallbackWithResult> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<TransactionDetailActivity$onExtraCallbackWithResult> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static TransactionDetailActivity$onExtraCallbackWithResult valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity$onExtraCallbackWithResult transactionDetailActivity$onExtraCallbackWithResult = (TransactionDetailActivity$onExtraCallbackWithResult) Enum.valueOf(TransactionDetailActivity$onExtraCallbackWithResult.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return transactionDetailActivity$onExtraCallbackWithResult;
    }

    public static TransactionDetailActivity$onExtraCallbackWithResult[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity$onExtraCallbackWithResult[] transactionDetailActivity$onExtraCallbackWithResultArr = $VALUES;
        if (i3 != 0) {
            return (TransactionDetailActivity$onExtraCallbackWithResult[]) transactionDetailActivity$onExtraCallbackWithResultArr.clone();
        }
        int i4 = 1 / 0;
        return (TransactionDetailActivity$onExtraCallbackWithResult[]) transactionDetailActivity$onExtraCallbackWithResultArr.clone();
    }

    private TransactionDetailActivity$onExtraCallbackWithResult(String str, int i, float f) {
        this.ratio = f;
    }

    public final float getRatio() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        float f = this.ratio;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    static {
        TransactionDetailActivity$onExtraCallbackWithResult[] transactionDetailActivity$onExtraCallbackWithResultArr$values = $values();
        $VALUES = transactionDetailActivity$onExtraCallbackWithResultArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(transactionDetailActivity$onExtraCallbackWithResultArr$values);
        int i = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
