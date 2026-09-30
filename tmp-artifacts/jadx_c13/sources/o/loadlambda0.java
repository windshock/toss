package o;

import android.content.Context;
import im.toss.uikit.R;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class loadlambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ loadlambda0[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final int prefixResId;
    public static final loadlambda0 NONE = new loadlambda0("NONE", 0, R.string.uikit_terms_prefix_empty);
    public static final loadlambda0 OPTIONAL = new loadlambda0("OPTIONAL", 1, R.string.uikit_terms_prefix_optional);
    public static final loadlambda0 MANDATORY = new loadlambda0("MANDATORY", 2, R.string.uikit_terms_prefix_required);

    private static final /* synthetic */ loadlambda0[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        loadlambda0[] loadlambda0VarArr = {NONE, OPTIONAL, MANDATORY};
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return loadlambda0VarArr;
        }
        throw null;
    }

    public static EnumEntries<loadlambda0> getEntries() {
        EnumEntries<loadlambda0> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 45 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static loadlambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loadlambda0 loadlambda0Var = (loadlambda0) Enum.valueOf(loadlambda0.class, str);
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return loadlambda0Var;
    }

    public static loadlambda0[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loadlambda0[] loadlambda0VarArr = $VALUES;
        if (i3 != 0) {
            return (loadlambda0[]) loadlambda0VarArr.clone();
        }
        int i4 = 54 / 0;
        return (loadlambda0[]) loadlambda0VarArr.clone();
    }

    private loadlambda0(String str, int i, int i2) {
        this.prefixResId = i2;
    }

    public final int getPrefixResId() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.prefixResId;
        }
        throw null;
    }

    static {
        loadlambda0[] loadlambda0VarArr$values = $values();
        $VALUES = loadlambda0VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loadlambda0VarArr$values);
        int i = onWarmupCompleted + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPrefix(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (this == NONE) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str = String.format("[%s] ", Arrays.copyOf(new Object[]{context.getString(this.prefixResId)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }
}
