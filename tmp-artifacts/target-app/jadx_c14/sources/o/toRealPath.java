package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class toRealPath extends enableInteropViewManagerClassLookUpOptimizationIOS {
    private final onNavigationEvent onWarmupCompleted;

    public toRealPath(@NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onWarmupCompleted = onnavigationevent;
    }

    public final onNavigationEvent onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent DIVIDER;
        public static final onNavigationEvent EMPTY_MESSAGE;
        public static final onNavigationEvent END_OF_TRANSACTIONS;
        public static final onNavigationEvent FILTER;
        public static final onNavigationEvent HEADER;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        public static final onNavigationEvent INVENTORY_SDK;
        public static final onNavigationEvent LOADING;
        public static final onNavigationEvent SAVING_BOX;
        public static final onNavigationEvent TEENS_HENEM_BOX;
        public static final onNavigationEvent TEENS_SAVING_BOX;
        public static final onNavigationEvent TOSS_MONEY_BANNER;
        public static final onNavigationEvent TOSS_MONEY_GUIDE;
        public static final onNavigationEvent TOSS_MONEY_LIMIT_BANNER;
        public static final onNavigationEvent TOSS_MONEY_LIMIT_WARNING_BANNER;
        public static final onNavigationEvent TOSS_MONEY_NOTICE_BANNER;
        public static final onNavigationEvent TRANSACTION_TITLE;
        public static final onNavigationEvent TRANSACTION_V2_DATE;
        public static final onNavigationEvent TRANSACTION_V2_ITEM;
        public static final onNavigationEvent TRANSACTION_V2_YEAR;
        public static final onNavigationEvent UNKNOWN;
        public static final onNavigationEvent YEAR_STICKY_HEADER;
        private static char onExtraCallback;
        private static char onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static int onTransact;
        private static char onWarmupCompleted;
        private final int layoutResId;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {UNKNOWN, HEADER, SAVING_BOX, TEENS_SAVING_BOX, TEENS_HENEM_BOX, LOADING, EMPTY_MESSAGE, YEAR_STICKY_HEADER, TRANSACTION_TITLE, DIVIDER, END_OF_TRANSACTIONS, TOSS_MONEY_BANNER, TOSS_MONEY_LIMIT_BANNER, TOSS_MONEY_LIMIT_WARNING_BANNER, TOSS_MONEY_NOTICE_BANNER, FILTER, TOSS_MONEY_GUIDE, TRANSACTION_V2_YEAR, TRANSACTION_V2_DATE, TRANSACTION_V2_ITEM, INVENTORY_SDK};
            int i5 = i3 + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i3 + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            int i5 = IAuthTabCallbackStub + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 83;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, int i2) {
            this.layoutResId = i2;
        }

        public final int getLayoutResId() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 77;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.layoutResId;
            int i6 = i3 + 7;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(new char[]{13344, 1021, 50948, 59108, 218, 49667, 21397, 54451}, 7 - TextUtils.getOffsetBefore("", 0), objArr);
            UNKNOWN = new onNavigationEvent(((String) objArr[0]).intern(), 0, R.layout.row_dashboard_item_unknown);
            HEADER = new onNavigationEvent("HEADER", 1, R.layout.view_toss_account_history_header);
            SAVING_BOX = new onNavigationEvent("SAVING_BOX", 2, R.layout.view_toss_account_history_saving_box);
            TEENS_SAVING_BOX = new onNavigationEvent("TEENS_SAVING_BOX", 3, R.layout.view_toss_account_history_teens_saving_box);
            TEENS_HENEM_BOX = new onNavigationEvent("TEENS_HENEM_BOX", 4, R.layout.item_henem_box_transaction_detail_header);
            LOADING = new onNavigationEvent("LOADING", 5, R.layout.row_account_history_item_loading);
            EMPTY_MESSAGE = new onNavigationEvent("EMPTY_MESSAGE", 6, R.layout.row_account_history_item_empty_message);
            YEAR_STICKY_HEADER = new onNavigationEvent("YEAR_STICKY_HEADER", 7, R.layout.row_account_history_item_year);
            TRANSACTION_TITLE = new onNavigationEvent("TRANSACTION_TITLE", 8, R.layout.row_transaction_title);
            DIVIDER = new onNavigationEvent("DIVIDER", 9, R.layout.row_account_history_item_divider);
            END_OF_TRANSACTIONS = new onNavigationEvent("END_OF_TRANSACTIONS", 10, R.layout.row_account_history_item_end);
            TOSS_MONEY_BANNER = new onNavigationEvent("TOSS_MONEY_BANNER", 11, R.layout.view_account_history_header_tossmoney_banner);
            TOSS_MONEY_LIMIT_BANNER = new onNavigationEvent("TOSS_MONEY_LIMIT_BANNER", 12, R.layout.view_account_history_tossmoney_limit_guide_banner);
            TOSS_MONEY_LIMIT_WARNING_BANNER = new onNavigationEvent("TOSS_MONEY_LIMIT_WARNING_BANNER", 13, R.layout.view_account_history_tossmoney_limit_warning_banner);
            TOSS_MONEY_NOTICE_BANNER = new onNavigationEvent("TOSS_MONEY_NOTICE_BANNER", 14, R.layout.view_account_history_tossmoney_notice_banner);
            FILTER = new onNavigationEvent("FILTER", 15, R.layout.view_account_history_header_filter);
            TOSS_MONEY_GUIDE = new onNavigationEvent("TOSS_MONEY_GUIDE", 16, R.layout.view_toss_money_upgrade_guide);
            TRANSACTION_V2_YEAR = new onNavigationEvent("TRANSACTION_V2_YEAR", 17, R.layout.row_transaction_year);
            TRANSACTION_V2_DATE = new onNavigationEvent("TRANSACTION_V2_DATE", 18, R.layout.row_transaction_date);
            TRANSACTION_V2_ITEM = new onNavigationEvent("TRANSACTION_V2_ITEM", 19, R.layout.row_transaction_item);
            INVENTORY_SDK = new onNavigationEvent("INVENTORY_SDK", 20, R.layout.view_account_history_inventory_sdk);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onTransact + 1;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = 58224;
                int i5 = i3;
                while (i5 < 16) {
                    int i6 = $10 + 45;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 11;
                            int keyRepeatTimeout = 12434 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iIndexOf, keyRepeatTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf("", '0', 0)), 14 - KeyEvent.normalizeMetaState(0), 19902 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = $10 + 53;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void onWarmupCompleted() {
            onWarmupCompleted = (char) 19214;
            onExtraCallback = (char) 16445;
            onExtraCallbackWithResult = (char) 59035;
            onNavigationEvent = (char) 3262;
        }
    }
}
