package im.toss.uikit.drawable;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OkHttpClientBuilderaddNetworkInterceptor2;
import o.access15300;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RoundRectCropTransformation extends OkHttpClientBuilderaddNetworkInterceptor2 {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onNavigationEvent + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundRectCropTransformation(Context context, int i, int i2, int i3, boolean z, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        int iOnNavigationEvent;
        int i5;
        Integer numValueOf;
        if ((i4 & 2) != 0) {
            int i6 = onExtraCallback + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(10.0f), displayMetrics);
        } else {
            iOnNavigationEvent = i;
        }
        boolean z2 = false;
        int i8 = (i4 & 4) != 0 ? 0 : i2;
        if ((i4 & 8) != 0) {
            int i9 = onExtraCallbackWithResult + 51;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i5 = 15;
        } else {
            i5 = i3;
        }
        if ((i4 & 16) != 0) {
            int i11 = onExtraCallback + 71;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            z2 = z;
        }
        if ((i4 & 32) != 0) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            final Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            numValueOf = Integer.valueOf(new getDEFAULT_CONNECTION_SPECSokhttp(new getAdService() { // from class: im.toss.uikit.drawable.RoundRectCropTransformation$special$$inlined$getColorScheme$1
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final getSpecialFeatureOptInStatus onExtraCallback() {
                    int i14 = 2 % 2;
                    if (!readIntokhttp.onExtraCallback(configuration)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    int i15 = IAuthTabCallback + 57;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i17 = onNavigationEvent + 99;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        return getspecialfeatureoptinstatus;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }).onWarmupCompleted());
            int i14 = 2 % 2;
        } else {
            numValueOf = num;
        }
        this(context, iOnNavigationEvent, i8, i5, z2, numValueOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundRectCropTransformation(@NotNull Context context, int i, int i2, int i3, boolean z, @Nullable Integer num) {
        super(new im.toss.tds.view.component.graphics.transform.RoundRectCropTransformation(context, i, i2, i3, z, num));
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundRectCropTransformation(@NotNull Context context, int i, int i2, @NotNull CornerType cornerType, boolean z) {
        this(context, i, i2, Companion.IAuthTabCallback(Companion, cornerType), z, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cornerType, "");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CornerType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CornerType[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;
        public static final CornerType ALL = new CornerType("ALL", 0);
        public static final CornerType TOP_LEFT = new CornerType("TOP_LEFT", 1);
        public static final CornerType TOP_RIGHT = new CornerType("TOP_RIGHT", 2);
        public static final CornerType BOTTOM_LEFT = new CornerType("BOTTOM_LEFT", 3);
        public static final CornerType BOTTOM_RIGHT = new CornerType("BOTTOM_RIGHT", 4);
        public static final CornerType TOP = new CornerType("TOP", 5);
        public static final CornerType BOTTOM = new CornerType("BOTTOM", 6);
        public static final CornerType LEFT = new CornerType("LEFT", 7);
        public static final CornerType RIGHT = new CornerType("RIGHT", 8);

        private static final /* synthetic */ CornerType[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            CornerType[] cornerTypeArr = {ALL, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, TOP, BOTTOM, LEFT, RIGHT};
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return cornerTypeArr;
        }

        public static EnumEntries<CornerType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<CornerType> enumEntries = $ENTRIES;
            int i4 = i3 + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static CornerType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CornerType cornerType = (CornerType) Enum.valueOf(CornerType.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return cornerType;
        }

        public static CornerType[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CornerType[] cornerTypeArr = (CornerType[]) $VALUES.clone();
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return cornerTypeArr;
        }

        private CornerType(String str, int i) {
        }

        static {
            CornerType[] cornerTypeArr$values = $values();
            $VALUES = cornerTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(cornerTypeArr$values);
            int i = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] IAuthTabCallback;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[CornerType.values().length];
                try {
                    iArr[CornerType.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CornerType.TOP.ordinal()] = 2;
                    int i = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CornerType.TOP_LEFT.ordinal()] = 3;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CornerType.TOP_RIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CornerType.BOTTOM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CornerType.BOTTOM_LEFT.ordinal()] = 6;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CornerType.BOTTOM_RIGHT.ordinal()] = 7;
                    int i5 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CornerType.LEFT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[CornerType.RIGHT.ordinal()] = 9;
                    int i8 = onExtraCallbackWithResult + 59;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 / 2;
                    } else {
                        int i10 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused9) {
                }
                IAuthTabCallback = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ int IAuthTabCallback(Companion companion, CornerType cornerType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = companion.onExtraCallbackWithResult(cornerType);
            int i4 = onWarmupCompleted + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnExtraCallbackWithResult;
        }

        private final int onExtraCallbackWithResult(CornerType cornerType) {
            int i = 2 % 2;
            switch (WhenMappings.IAuthTabCallback[cornerType.ordinal()]) {
                case 1:
                    return 15;
                case 2:
                    int i2 = onWarmupCompleted + 77;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return 3;
                case 3:
                    int i4 = onWarmupCompleted + 55;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return 1;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                case 4:
                    return 2;
                case 5:
                    return 12;
                case 6:
                    int i5 = onWarmupCompleted + 53;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return 4;
                case 7:
                    return 8;
                case 8:
                    return 5;
                case 9:
                    return 10;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
