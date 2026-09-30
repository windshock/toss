package im.toss.securities.widget.common.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;
import im.toss.securities.widget.common.R;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.ByteOrderedDataOutputStream;
import o.CipherSuiteCompanion;
import o.RequestBodyCompanion;
import o.access15300;
import o.authParams;
import o.getBacktraceNoteBytes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoteViewsThemeUtil {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final RemoteViewsThemeUtil onNavigationEvent = new RemoteViewsThemeUtil();
    private static int onWarmupCompleted;

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[DisplaySetting.values().length];
            try {
                iArr[DisplaySetting.LIGHT.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySetting.DARK.ordinal()] = 2;
                int i2 = IAuthTabCallback + 53;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySetting.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[SkeletonShape.values().length];
            try {
                iArr2[SkeletonShape.BAR_3.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SkeletonShape.BAR_5.ordinal()] = 2;
                int i4 = IAuthTabCallback + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SkeletonShape.BAR_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SkeletonShape.BAR_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SkeletonShape.BAR_10.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SkeletonShape.CIRCLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            onExtraCallback = iArr2;
        }
    }

    static {
        int i = onWarmupCompleted + 7;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private RemoteViewsThemeUtil() {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(RemoteViewsThemeUtil remoteViewsThemeUtil, RemoteViews remoteViews, Context context, int i, DisplaySetting displaySetting, float f, int i2, int i3, int i4, int i5, Object obj) throws NoWhenBranchMatchedException {
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 65;
        int i9 = i8 % 128;
        IAuthTabCallback = i9;
        if (i8 % 2 != 0 ? (i5 & 32) == 0 : (i5 & 94) == 0) {
            i6 = i2;
        } else {
            int i10 = i9 + 97;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = R.drawable.widget_background;
            int i13 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            i6 = i12;
        }
        remoteViewsThemeUtil.onNavigationEvent(remoteViews, context, i, displaySetting, f, i6, (i5 & 64) != 0 ? R.drawable.widget_background_light : i3, (i5 & 128) != 0 ? R.drawable.widget_background_dark : i4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onNavigationEvent(@NotNull RemoteViews remoteViews, @NotNull Context context, int i, @NotNull DisplaySetting displaySetting, float f, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        remoteViews.setInt(i, "setBackgroundResource", i2);
        if (Build.VERSION.SDK_INT >= 31) {
            int i8 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            remoteViews.setColorStateList(i, "setBackgroundTintList", ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(RequestBodyCompanion.onExtraCallbackWithResult(authParams.BackgroundDefault), context, displaySetting, Float.valueOf(f)))));
            return;
        }
        int i10 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
        if (i10 == 1) {
            i2 = i3;
        } else if (i10 == 2) {
            i2 = i4;
        } else if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        remoteViews.setInt(i, "setBackgroundResource", i2);
    }

    public final void onNavigationEvent(@NotNull RemoteViews remoteViews, @NotNull Context context, @NotNull DisplaySetting displaySetting, @NotNull CipherSuiteCompanion cipherSuiteCompanion, @NotNull int... iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(cipherSuiteCompanion, context, displaySetting, null, 4, null));
        int length = iArr.length;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = iArr[i4];
                remoteViews.setInt(i6, "setColorFilter", (-16777216) | iOnNavigationEvent);
                remoteViews.setInt(i6, "setImageAlpha", iOnNavigationEvent << 77);
                i4 += 33;
            } else {
                int i7 = iArr[i4];
                remoteViews.setInt(i7, "setColorFilter", (-16777216) | iOnNavigationEvent);
                remoteViews.setInt(i7, "setImageAlpha", iOnNavigationEvent >>> 24);
                i4++;
            }
        }
    }

    public final void IAuthTabCallback(@NotNull RemoteViews remoteViews, float f, int i, @NotNull List<? extends Pair<Float, ? extends List<Integer>>> list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteViews, "");
            Intrinsics.checkNotNullParameter(list, "");
            list.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i4 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Pair pair = (Pair) it.next();
            float fFloatValue = ((Number) pair.onExtraCallbackWithResult()).floatValue();
            Iterator it2 = ((List) pair.IAuthTabCallback()).iterator();
            int i6 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                remoteViews.setImageViewResource(iIntValue, i);
                remoteViews.setInt(iIntValue, "setImageAlpha", onNavigationEvent.onExtraCallback(fFloatValue * f));
            }
        }
        int i8 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onExtraCallbackWithResult(@NotNull RemoteViews remoteViews, int i, @NotNull DisplaySetting displaySetting, float f) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(remoteViews, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        int i4 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
        if (i4 != 1) {
            int i5 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 2) {
                i2 = R.drawable.widget_bottom_gradient_dark;
                int i6 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.drawable.widget_bottom_gradient;
            }
        } else {
            i2 = R.drawable.widget_bottom_gradient_light;
        }
        remoteViews.setImageViewResource(i, i2);
        remoteViews.setInt(i, "setImageAlpha", onExtraCallback(f));
    }

    private final int onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(RangesKt.coerceIn(f, 0.0f, 1.0f) * 255.0f);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SkeletonShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SkeletonShape[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final SkeletonShape BAR_3 = new SkeletonShape("BAR_3", 0);
        public static final SkeletonShape BAR_5 = new SkeletonShape("BAR_5", 1);
        public static final SkeletonShape BAR_6 = new SkeletonShape("BAR_6", 2);
        public static final SkeletonShape BAR_8 = new SkeletonShape("BAR_8", 3);
        public static final SkeletonShape BAR_10 = new SkeletonShape("BAR_10", 4);
        public static final SkeletonShape CIRCLE = new SkeletonShape("CIRCLE", 5);

        private static final /* synthetic */ SkeletonShape[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            SkeletonShape[] skeletonShapeArr = {BAR_3, BAR_5, BAR_6, BAR_8, BAR_10, CIRCLE};
            int i5 = i2 + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return skeletonShapeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<SkeletonShape> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<SkeletonShape> enumEntries = $ENTRIES;
            int i5 = i2 + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static SkeletonShape valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SkeletonShape skeletonShape = (SkeletonShape) Enum.valueOf(SkeletonShape.class, str);
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            int i5 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return skeletonShape;
        }

        public static SkeletonShape[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SkeletonShape[] skeletonShapeArr = (SkeletonShape[]) $VALUES.clone();
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return skeletonShapeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private SkeletonShape(String str, int i) {
        }

        static {
            SkeletonShape[] skeletonShapeArr$values = $values();
            $VALUES = skeletonShapeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(skeletonShapeArr$values);
            int i = IAuthTabCallback + 49;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int IAuthTabCallback(@NotNull SkeletonShape skeletonShape, @NotNull DisplaySetting displaySetting) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(skeletonShape, "");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            int i3 = WhenMappings.onExtraCallback[skeletonShape.ordinal()];
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(skeletonShape, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        switch (WhenMappings.onExtraCallback[skeletonShape.ordinal()]) {
            case 1:
                int i4 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i4 == 1) {
                    return R.drawable.skeleton_radius_3_light;
                }
                if (i4 == 2) {
                    return R.drawable.skeleton_radius_3_dark;
                }
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return R.drawable.skeleton_radius_3;
            case 2:
                int i7 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i7 == 1) {
                    return R.drawable.skeleton_radius_5_light;
                }
                if (i7 == 2) {
                    return R.drawable.skeleton_radius_5_dark;
                }
                if (i7 == 3) {
                    return R.drawable.skeleton_radius_5;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                int i8 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i8 == 1) {
                    return R.drawable.skeleton_radius_6_light;
                }
                int i9 = onExtraCallbackWithResult;
                int i10 = i9 + 93;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0 ? i8 == 2 : i8 == 3) {
                    return R.drawable.skeleton_radius_6_dark;
                }
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = i9 + 97;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return R.drawable.skeleton_radius_6;
                }
                int i12 = 86 / 0;
                return R.drawable.skeleton_radius_6;
            case 4:
                int i13 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i13 == 1) {
                    return R.drawable.skeleton_radius_8_light;
                }
                if (i13 == 2) {
                    return R.drawable.skeleton_radius_8_dark;
                }
                int i14 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 == 0 ? i13 != 3 : i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i15 = R.drawable.skeleton_radius_8;
                int i16 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 53 / 0;
                }
                return i15;
            case 5:
                int i18 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i18 == 1) {
                    return R.drawable.skeleton_radius_10_light;
                }
                if (i18 == 2) {
                    return R.drawable.skeleton_radius_10_dark;
                }
                int i19 = IAuthTabCallback;
                int i20 = i19 + 23;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i22 = i19 + 89;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return R.drawable.skeleton_radius_10;
            case 6:
                int i24 = WhenMappings.onNavigationEvent[displaySetting.ordinal()];
                if (i24 == 1) {
                    return R.drawable.skeleton_circle_light;
                }
                if (i24 == 2) {
                    return R.drawable.skeleton_circle_dark;
                }
                if (i24 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i25 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i25 % 128;
                if (i25 % 2 == 0) {
                    return R.drawable.skeleton_circle;
                }
                int i26 = R.drawable.skeleton_circle;
                obj.hashCode();
                throw null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
