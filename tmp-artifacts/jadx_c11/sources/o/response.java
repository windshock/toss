package o;

import android.content.Context;
import android.graphics.Typeface;
import im.toss.tds.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class response {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ response[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final int resId;
    private final int weight;
    public static final response Light = new response("Light", 0, R.font.toss_product_sans_lg, 300);
    public static final response Regular = new response("Regular", 1, R.font.toss_product_sans_rg, 400);
    public static final response Medium = new response("Medium", 2, R.font.toss_product_sans_md, 500);
    public static final response SemiBold = new response("SemiBold", 3, R.font.toss_product_sans_sb, 600);
    public static final response Bold = new response("Bold", 4, R.font.toss_product_sans_bd, 700);
    public static final response ExtraBold = new response("ExtraBold", 5, R.font.toss_product_sans_eb, 800);
    public static final response Heavy = new response("Heavy", 6, R.font.toss_product_sans_hv, 900);
    public static final response Black = new response("Black", 7, R.font.toss_product_sans_bl, 950);

    private static final /* synthetic */ response[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        response[] responseVarArr = {Light, Regular, Medium, SemiBold, Bold, ExtraBold, Heavy, Black};
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return responseVarArr;
    }

    public static EnumEntries<response> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<response> enumEntries = $ENTRIES;
        int i5 = i3 + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return enumEntries;
    }

    public static response valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        response responseVar = (response) Enum.valueOf(response.class, str);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return responseVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static response[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        response[] responseVarArr = (response[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return responseVarArr;
        }
        obj.hashCode();
        throw null;
    }

    private response(String str, int i, int i2, int i3) {
        this.resId = i2;
        this.weight = i3;
    }

    public final int getResId() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.resId;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final int getWeight() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.weight;
        int i6 = i3 + 21;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        response[] responseVarArr$values = $values();
        $VALUES = responseVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(responseVarArr$values);
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallback + 91;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Typeface toTypeface$default(response responseVar, Context context, setDone setdone, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toTypeface");
        }
        if ((i & 2) != 0) {
            setdone = getTcfVendorConsentStatus.Companion.getInterfaceDescriptor();
        }
        Typeface typeface = responseVar.toTypeface(context, setdone);
        int i5 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return typeface;
    }

    public final Typeface toTypeface(@NotNull Context context, @NotNull setDone setdone) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setdone, "");
        Typeface typefaceOnWarmupCompleted = setdone.onWarmupCompleted(context, this);
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return typefaceOnWarmupCompleted;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        /* renamed from: o.response$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final /* synthetic */ class C0063onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[CacheEntry.values().length];
                try {
                    iArr[CacheEntry.Light.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CacheEntry.Regular.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CacheEntry.Medium.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CacheEntry.SemiBold.ordinal()] = 4;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CacheEntry.Bold.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CacheEntry.ExtraBold.ordinal()] = 6;
                    int i2 = onWarmupCompleted + 99;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CacheEntry.Heavy.ordinal()] = 7;
                    int i5 = onWarmupCompleted + 101;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CacheEntry.Black.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                onExtraCallbackWithResult = iArr;
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final response onNavigationEvent(@NotNull CacheEntry cacheEntry) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cacheEntry, "");
                int i3 = C0063onWarmupCompleted.onExtraCallbackWithResult[cacheEntry.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(cacheEntry, "");
            switch (C0063onWarmupCompleted.onExtraCallbackWithResult[cacheEntry.ordinal()]) {
                case 1:
                    return response.Light;
                case 2:
                    return response.Regular;
                case 3:
                    return response.Medium;
                case 4:
                    return response.SemiBold;
                case 5:
                    return response.Bold;
                case 6:
                    response responseVar = response.ExtraBold;
                    int i4 = onExtraCallback + 107;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 8 / 0;
                    }
                    return responseVar;
                case 7:
                    return response.Heavy;
                case 8:
                    return response.Black;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final response IAuthTabCallback(int i) throws IllegalArgumentException {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CacheEntry cacheEntryIAuthTabCallback = CacheEntry.Companion.IAuthTabCallback(i);
            if (i4 == 0) {
                return onNavigationEvent(cacheEntryIAuthTabCallback);
            }
            int i5 = 91 / 0;
            return onNavigationEvent(cacheEntryIAuthTabCallback);
        }

        public final response onExtraCallback(int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            response responseVarOnNavigationEvent = onNavigationEvent(CacheEntry.Companion.onExtraCallback(i));
            int i5 = onWarmupCompleted + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return responseVarOnNavigationEvent;
        }
    }
}
