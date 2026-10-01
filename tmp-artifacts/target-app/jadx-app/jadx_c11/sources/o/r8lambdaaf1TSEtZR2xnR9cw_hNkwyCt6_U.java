package o;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U {
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U onExtraCallback = new r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U();
    private static final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onExtraCallbackWithResult = r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.AbstractC0060onExtraCallback.onExtraCallbackWithResult.onExtraCallback;
    private static final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent IAuthTabCallback = new onExtraCallback();

    private r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U() {
    }

    static {
        int i = onWarmupCompleted + 119;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback = onExtraCallbackWithResult;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public static final class onExtraCallback implements r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final Function1<Number, String> onWarmupCompleted = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Defaults$Formatter$1$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallback = r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onExtraCallback((Number) obj);
                int i4 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallback;
            }
        };
        private final Function1<String, Number> onExtraCallbackWithResult = new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2Defaults$Formatter$1$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                IAuthTabCallback = i2 % 128;
                String str = (String) obj;
                if (i2 % 2 == 0) {
                    return r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onExtraCallback(str);
                }
                r8lambdaaf1TSEtZR2xnR9cw_hNkwyCt6_U.onExtraCallback.onExtraCallback(str);
                throw null;
            }
        };

        public static /* synthetic */ Number onExtraCallback(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(str);
            }
            onExtraCallbackWithResult(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ String onExtraCallback(Number number) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted(number);
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallback() {
        }

        @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent
        public Function1<Number, String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1<Number, String> function1 = this.onWarmupCompleted;
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final String onWarmupCompleted(Number number) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (number == null) {
                return "";
            }
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(',');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setMinimumFractionDigits(0);
            decimalFormat.setMaximumFractionDigits(20);
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String str = decimalFormat.format(number);
            if (str == null) {
                return "";
            }
            int i3 = IAuthTabCallback + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
            }
            return str;
        }

        @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent
        public Function1<String, Number> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 71;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            Function1<String, Number> function1 = this.onExtraCallbackWithResult;
            int i4 = i2 + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return function1;
            }
            obj.hashCode();
            throw null;
        }

        private static final Number onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.isBlank(str)) {
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            Double doubleOrNull = StringsKt.toDoubleOrNull(new Regex(",").replace(new Regex("[?|？]").replace(str, "9"), ""));
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return doubleOrNull;
        }
    }

    public final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onNavigationEvent onnavigationevent = IAuthTabCallback;
        int i4 = i2 + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }
}
