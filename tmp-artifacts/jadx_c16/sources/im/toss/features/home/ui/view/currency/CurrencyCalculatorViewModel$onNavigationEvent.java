package im.toss.features.home.ui.view.currency;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CurrencyCalculatorViewModel$onNavigationEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyCalculatorViewModel$onNavigationEvent[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final CurrencyCalculatorViewModel$onNavigationEvent MAX_INTEGRAL_LENGTH_EXCEEDED = new CurrencyCalculatorViewModel$onNavigationEvent("MAX_INTEGRAL_LENGTH_EXCEEDED", 0);
    public static final CurrencyCalculatorViewModel$onNavigationEvent MAX_DECIMAL_LENGTH_EXCEEDED = new CurrencyCalculatorViewModel$onNavigationEvent("MAX_DECIMAL_LENGTH_EXCEEDED", 1);

    private static final /* synthetic */ CurrencyCalculatorViewModel$onNavigationEvent[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        CurrencyCalculatorViewModel$onNavigationEvent[] currencyCalculatorViewModel$onNavigationEventArr = {i2 % 2 == 0 ? MAX_INTEGRAL_LENGTH_EXCEEDED : MAX_INTEGRAL_LENGTH_EXCEEDED, MAX_DECIMAL_LENGTH_EXCEEDED};
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return currencyCalculatorViewModel$onNavigationEventArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<CurrencyCalculatorViewModel$onNavigationEvent> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static CurrencyCalculatorViewModel$onNavigationEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorViewModel$onNavigationEvent currencyCalculatorViewModel$onNavigationEvent = (CurrencyCalculatorViewModel$onNavigationEvent) Enum.valueOf(CurrencyCalculatorViewModel$onNavigationEvent.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return currencyCalculatorViewModel$onNavigationEvent;
    }

    public static CurrencyCalculatorViewModel$onNavigationEvent[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorViewModel$onNavigationEvent[] currencyCalculatorViewModel$onNavigationEventArr = $VALUES;
        if (i3 != 0) {
            return (CurrencyCalculatorViewModel$onNavigationEvent[]) currencyCalculatorViewModel$onNavigationEventArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CurrencyCalculatorViewModel$onNavigationEvent(String str, int i) {
    }

    static {
        CurrencyCalculatorViewModel$onNavigationEvent[] currencyCalculatorViewModel$onNavigationEventArr$values = $values();
        $VALUES = currencyCalculatorViewModel$onNavigationEventArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(currencyCalculatorViewModel$onNavigationEventArr$values);
        int i = onWarmupCompleted + 45;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
