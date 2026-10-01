package o;

import com.bytedance.adsdk.ycx.jw$;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AttributeExtension {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final AttributeExtension onWarmupCompleted = new AttributeExtension();

    static {
        int i = IAuthTabCallback + 105;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AttributeExtension() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onExtraCallback Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String centSymbol;
        private final String symbol;
        public static final onNavigationEvent AUD = new onNavigationEvent("AUD", 0, "$", "¢");
        public static final onNavigationEvent EUR = new onNavigationEvent("EUR", 1, "€", "c");

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return new onNavigationEvent[]{AUD, EUR};
            }
            onNavigationEvent onnavigationevent = AUD;
            onNavigationEvent onnavigationevent2 = EUR;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[2];
            onnavigationeventArr[0] = onnavigationevent;
            onnavigationeventArr[0] = onnavigationevent2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i, String str2, String str3) {
            this.symbol = str2;
            this.centSymbol = str3;
        }

        public final String getSymbol() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.symbol;
            int i4 = i3 + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return str;
        }

        public final String getCentSymbol() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.centSymbol;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new onExtraCallback(null);
            int i = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public static final class onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final onNavigationEvent onExtraCallbackWithResult(@NotNull String str) {
                Object next;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Iterator it = onNavigationEvent.getEntries().iterator();
                int i2 = onNavigationEvent + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i4 = onNavigationEvent + 85;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    next = it.next();
                    if (StringsKt.equals(((onNavigationEvent) next).name(), str, true)) {
                        break;
                    }
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) next;
                if (onnavigationevent == null) {
                    int i6 = IAuthTabCallback + 45;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return onNavigationEvent.AUD;
                }
                int i8 = onNavigationEvent + 119;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return onnavigationevent;
            }
        }
    }

    public static /* synthetic */ String onNavigationEvent(AttributeExtension attributeExtension, long j, onNavigationEvent onnavigationevent, Locale locale, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 2) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            int i4 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
        }
        return attributeExtension.onWarmupCompleted(j, onnavigationevent, locale);
    }

    public final String onWarmupCompleted(long j, @NotNull onNavigationEvent onnavigationevent, @NotNull Locale locale) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String strOnNavigationEvent = onNavigationEvent(j, onnavigationevent, locale);
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String plainString = jw$.ExternalSyntheticBackportWithForwarding0.IAuthTabCallback(BigDecimal.valueOf(j, 4)).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return plainString;
    }

    private final String onNavigationEvent(long j, onNavigationEvent onnavigationevent, Locale locale) {
        int i = 2 % 2;
        BigDecimal bigDecimalMovePointLeft = BigDecimal.valueOf(j).movePointLeft(4);
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMinimumFractionDigits(0);
        numberInstance.setMaximumFractionDigits(1);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        String str = numberInstance.format(bigDecimalMovePointLeft) + onnavigationevent.getCentSymbol();
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
