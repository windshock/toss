package o;

import im.toss.uikit.R;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ParamImpl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParamImpl[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int resId;
    public static final ParamImpl EMPTY = new ParamImpl("EMPTY", 0, 0);
    public static final ParamImpl WON = new ParamImpl("WON", 1, R.string.money_suffix_won);
    public static final ParamImpl SPACE_WON = new ParamImpl("SPACE_WON", 2, R.string.money_suffix_space_won);
    public static final ParamImpl SYMBOL = new ParamImpl("SYMBOL", 3, R.string.money_prefix_symbol);
    public static final ParamImpl CODE = new ParamImpl("CODE", 4, R.string.money_won_code);

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[ParamImpl.values().length];
            try {
                iArr[ParamImpl.SYMBOL.ordinal()] = 1;
                int i = IAuthTabCallback + 65;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            onNavigationEvent = iArr;
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }
    }

    private static final /* synthetic */ ParamImpl[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ParamImpl[] paramImplArr = {EMPTY, WON, SPACE_WON, SYMBOL, CODE};
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return paramImplArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ParamImpl> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ParamImpl> enumEntries = $ENTRIES;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ParamImpl valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ParamImpl paramImpl = (ParamImpl) Enum.valueOf(ParamImpl.class, str);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return paramImpl;
    }

    public static ParamImpl[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ParamImpl[] paramImplArr = (ParamImpl[]) $VALUES.clone();
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return paramImplArr;
        }
        throw null;
    }

    private ParamImpl(String str, int i, int i2) {
        this.resId = i2;
    }

    public final int getResId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.resId;
        int i6 = i2 + 115;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        ParamImpl[] paramImplArr$values = $values();
        $VALUES = paramImplArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(paramImplArr$values);
        int i = onNavigationEvent + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnitText() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == EMPTY) {
            return "";
        }
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getLongName.onExtraCallbackWithResult(this.resId);
    }

    public final String toMoneyString(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = Cookies_flush.onWarmupCompleted(j);
        Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
        String moneyString = toMoneyString(strOnWarmupCompleted);
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return moneyString;
        }
        throw null;
    }

    public final String toMoneyString(@NotNull String str) {
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Locale localeOnExtraCallback = ReferrerDetails.onExtraCallback(ReferrerDetails.onExtraCallback, false, 1, (Object) null);
        if (localeOnExtraCallback == null) {
            localeOnExtraCallback = Locale.KOREA;
        }
        if (!Intrinsics.areEqual(localeOnExtraCallback, Locale.KOREA)) {
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!ArraysKt.contains(new ParamImpl[]{EMPTY, CODE}, this)) {
                StringBuilder sb = new StringBuilder();
                if (!StringsKt.startsWith$default(str, "-", false, 2, (Object) null)) {
                    int i4 = onExtraCallback + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    str2 = "-";
                }
                sb.append(str2);
                sb.append("₩");
                sb.append(StringsKt.replace$default(str, "-", "", false, 4, (Object) null));
                String string = sb.toString();
                Intrinsics.checkNotNull(string);
                return string;
            }
        }
        if (onWarmupCompleted.onNavigationEvent[ordinal()] == 1) {
            return getUnitText() + str;
        }
        String str3 = str + getUnitText();
        int i6 = onExtraCallback + 75;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 78 / 0;
        }
        return str3;
    }
}
