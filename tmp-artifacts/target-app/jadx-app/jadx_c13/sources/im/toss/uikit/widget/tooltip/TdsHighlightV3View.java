package im.toss.uikit.widget.tooltip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import o.generateAppWithState;
import o.getInstallerPackageName;
import o.hasVaryAll;
import o.setTagsokhttp;
import o.varyFields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsHighlightV3View extends ConstraintLayout {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private final AttributeSet onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private generateAppWithState onNavigationEvent;
    private final int onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.RECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.CIRCLE.ordinal()] = 2;
                int i = onWarmupCompleted + 23;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.BLANK.ordinal()] = 3;
                int i4 = onWarmupCompleted + 9;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        int i = IAuthTabCallbackStub + 71;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsHighlightV3View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsHighlightV3View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsHighlightV3View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = attributeSet;
        this.onWarmupCompleted = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsHighlightV3View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackDefault + 99;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onExtraCallback(TdsHighlightV3View tdsHighlightV3View, generateAppWithState generateappwithstate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Object obj = null;
        tdsHighlightV3View.onNavigationEvent = generateappwithstate;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 115;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ generateAppWithState onExtraCallbackWithResult(TdsHighlightV3View tdsHighlightV3View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        generateAppWithState generateappwithstate = tdsHighlightV3View.onNavigationEvent;
        int i5 = i3 + 97;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return generateappwithstate;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult() {
        View decorView;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.onExtraCallbackWithResult);
        Object obj = null;
        if (activityIAuthTabCallback != null) {
            int i4 = asBinder + 69;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            Window window = activityIAuthTabCallback.getWindow();
            if (window != null) {
                int i6 = asBinder + 41;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                decorView = window.getDecorView();
            } else {
                decorView = null;
            }
        }
        if (decorView instanceof ViewGroup) {
            int i8 = asBinder + 87;
            IAuthTabCallbackDefault = i8 % 128;
            viewGroup = (ViewGroup) decorView;
            if (i8 % 2 == 0) {
                throw null;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i9 = IAuthTabCallbackDefault + 1;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            viewGroup.removeView(this);
            if (i10 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTargetView$default(TdsHighlightV3View tdsHighlightV3View, onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult, View view, Rect rect, ViewGroup viewGroup, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, Integer num, int i, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, int i2, Object obj) {
        generateAppWithState.onExtraCallback onextracallback2;
        generateAppWithState.onNavigationEvent onnavigationevent2;
        Integer num3;
        int iOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str2 = (i2 & 16) != 0 ? null : str;
        generateAppWithState.onWarmupCompleted onwarmupcompleted2 = (i2 & 32) != 0 ? generateAppWithState.onWarmupCompleted.BOTTOM : onwarmupcompleted;
        if ((i2 & 64) != 0) {
            int i6 = IAuthTabCallbackDefault + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            onextracallback2 = generateAppWithState.onExtraCallback.CENTER;
        } else {
            onextracallback2 = onextracallback;
        }
        if ((i2 & 128) != 0) {
            int i8 = IAuthTabCallbackDefault + 15;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            onnavigationevent2 = generateAppWithState.onNavigationEvent.WEAK;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        boolean z2 = (i2 & 256) != 0 ? false : z;
        if ((i2 & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i10 = asBinder + 19;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 1024) != 0) {
            int i12 = asBinder + 25;
            IAuthTabCallbackDefault = i12 % 128;
            iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(tdsHighlightV3View, Integer.valueOf(i12 % 2 == 0 ? 120 : 8));
        } else {
            iOnExtraCallbackWithResult = i;
        }
        tdsHighlightV3View.setTargetView(enumC0010onExtraCallbackWithResult, view, rect, viewGroup, str2, onwarmupcompleted2, onextracallback2, onnavigationevent2, z2, num3, iOnExtraCallbackWithResult, (i2 & 2048) != 0 ? null : num2, (i2 & 4096) != 0 ? null : onextracallbackwithresult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View, im.toss.uikit.widget.tooltip.CircleHighlightV3, o.generateAppWithState] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View, im.toss.uikit.widget.tooltip.BlankHighlightV3, o.generateAppWithState] */
    public final void setTargetView(@NotNull onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult, @Nullable View view, @Nullable Rect rect, @NotNull ViewGroup viewGroup, @Nullable String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, boolean z, @Nullable Integer num, int i, @Nullable Integer num2, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(enumC0010onExtraCallbackWithResult, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i5 = IAuthTabCallback.IAuthTabCallback[enumC0010onExtraCallbackWithResult.ordinal()];
        if (i5 == 1) {
            RectHighlightV3 rectHighlightV3 = (RectHighlightV3) getInstallerPackageName.onExtraCallback.onWarmupCompleted.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, this.onWarmupCompleted);
            this.onNavigationEvent = rectHighlightV3;
            if (view == null) {
                if (rect != null) {
                    rectHighlightV3.setTargetRect(rect, viewGroup, this, num, str, onwarmupcompleted, onextracallback, onnavigationevent, z, num2, onextracallbackwithresult, 100L);
                    return;
                }
                return;
            } else {
                rectHighlightV3.setTargetView(view, viewGroup, this, num, str, onwarmupcompleted, onextracallback, onnavigationevent, z, num2, onextracallbackwithresult, 100L);
                int i6 = IAuthTabCallbackDefault + 27;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 19 / 0;
                    return;
                }
                return;
            }
        }
        if (i5 == 2) {
            ?? r0 = (CircleHighlightV3) getInstallerPackageName.IAuthTabCallback.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, this.onWarmupCompleted);
            this.onNavigationEvent = r0;
            addView(r0);
            if (view != null) {
                r0.setTargetView(view, viewGroup, this, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num2, onextracallbackwithresult, 100L);
                return;
            }
            if (rect != null) {
                int i8 = IAuthTabCallbackDefault + 93;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    r0.setTargetRect(rect, viewGroup, this, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num2, onextracallbackwithresult, 100L);
                    return;
                } else {
                    r0.setTargetRect(rect, viewGroup, this, str, onwarmupcompleted, onextracallback, onnavigationevent, i, z, num2, onextracallbackwithresult, 100L);
                    throw null;
                }
            }
            return;
        }
        if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ?? r02 = (BlankHighlightV3) getInstallerPackageName.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, this.onWarmupCompleted);
        this.onNavigationEvent = r02;
        addView(r02);
        if (view != null) {
            int i9 = asBinder + 45;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            BlankHighlightV3.setTargetView$default(r02, view, viewGroup, this, null, num2, onextracallbackwithresult, 100L, 8, null);
            return;
        }
        if (rect != null) {
            int i11 = IAuthTabCallbackDefault + 65;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            BlankHighlightV3.setTargetRect$default(r02, rect, viewGroup, this, null, num2, onextracallbackwithresult, 100L, 8, null);
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i6;
            int i9 = ~(i7 | i8);
            int i10 = ~(i4 | i6);
            int i11 = i9 | i10 | (~(i4 | i3));
            int i12 = i8 | i4;
            int i13 = (~((~i3) | i4)) | i10;
            int i14 = i4 + i6 + i5 + (111814883 * i) + (1975835455 * i2);
            int i15 = i14 * i14;
            int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i6) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i5) + ((-648806400) * i) + (1432616960 * i2) + (442957824 * i15);
            int i17 = ((i4 * 961080817) - 60187382) + (i6 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i5 * 961079685) + (i * 1618335983) + (i2 * 193609403) + (i15 * 1988296704);
            return i16 + ((i17 * i17) * 176226304) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: im.toss.uikit.widget.tooltip.TdsHighlightV3View$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class EnumC0010onExtraCallbackWithResult {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC0010onExtraCallbackWithResult[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final EnumC0010onExtraCallbackWithResult RECT = new EnumC0010onExtraCallbackWithResult("RECT", 0);
            public static final EnumC0010onExtraCallbackWithResult CIRCLE = new EnumC0010onExtraCallbackWithResult("CIRCLE", 1);
            public static final EnumC0010onExtraCallbackWithResult BLANK = new EnumC0010onExtraCallbackWithResult("BLANK", 2);

            private static final /* synthetic */ EnumC0010onExtraCallbackWithResult[] $values() {
                EnumC0010onExtraCallbackWithResult[] enumC0010onExtraCallbackWithResultArr;
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 91;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult = RECT;
                    EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult2 = CIRCLE;
                    EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult3 = BLANK;
                    enumC0010onExtraCallbackWithResultArr = new EnumC0010onExtraCallbackWithResult[3];
                    enumC0010onExtraCallbackWithResultArr[1] = enumC0010onExtraCallbackWithResult;
                    enumC0010onExtraCallbackWithResultArr[1] = enumC0010onExtraCallbackWithResult2;
                    enumC0010onExtraCallbackWithResultArr[2] = enumC0010onExtraCallbackWithResult3;
                } else {
                    enumC0010onExtraCallbackWithResultArr = new EnumC0010onExtraCallbackWithResult[]{RECT, CIRCLE, BLANK};
                }
                int i4 = i2 + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return enumC0010onExtraCallbackWithResultArr;
            }

            public static EnumEntries<EnumC0010onExtraCallbackWithResult> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 63;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                EnumEntries<EnumC0010onExtraCallbackWithResult> enumEntries = $ENTRIES;
                int i5 = i3 + 49;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static EnumC0010onExtraCallbackWithResult valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult = (EnumC0010onExtraCallbackWithResult) Enum.valueOf(EnumC0010onExtraCallbackWithResult.class, str);
                int i4 = onExtraCallback + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 74 / 0;
                }
                return enumC0010onExtraCallbackWithResult;
            }

            public static EnumC0010onExtraCallbackWithResult[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                EnumC0010onExtraCallbackWithResult[] enumC0010onExtraCallbackWithResultArr = (EnumC0010onExtraCallbackWithResult[]) $VALUES.clone();
                int i4 = onNavigationEvent + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return enumC0010onExtraCallbackWithResultArr;
            }

            private EnumC0010onExtraCallbackWithResult(String str, int i) {
            }

            static {
                EnumC0010onExtraCallbackWithResult[] enumC0010onExtraCallbackWithResultArr$values = $values();
                $VALUES = enumC0010onExtraCallbackWithResultArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(enumC0010onExtraCallbackWithResultArr$values);
                int i = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 29 / 0;
                }
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final void onWarmupCompleted(@NotNull Context context) {
            ViewGroup viewGroup;
            Window window;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                hasVaryAll.IAuthTabCallback(context);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            View decorView = (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) ? null : window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
                int i3 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i5 = 0;
                while (i5 < childCount) {
                    Object childAt = viewGroup.getChildAt(i5);
                    if (childAt instanceof TdsHighlightV3View) {
                        int i6 = onExtraCallbackWithResult + 79;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        TdsHighlightV3View tdsHighlightV3View = (TdsHighlightV3View) childAt;
                        tdsHighlightV3View.onExtraCallbackWithResult();
                        TdsHighlightV3View.onExtraCallback(tdsHighlightV3View, null);
                        return;
                    }
                    i5++;
                    int i8 = onWarmupCompleted + 3;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            int i10 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            View decorView;
            Window window;
            int i = 0;
            Context context = (Context) objArr[1];
            Rect rect = (Rect) objArr[2];
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rect, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) {
                decorView = null;
            } else {
                int i3 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                decorView = window.getDecorView();
                int i5 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
            }
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    int i7 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Object childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TdsHighlightV3View) {
                        generateAppWithState generateappwithstateOnExtraCallbackWithResult = TdsHighlightV3View.onExtraCallbackWithResult((TdsHighlightV3View) childAt);
                        if (generateappwithstateOnExtraCallbackWithResult != null) {
                            generateappwithstateOnExtraCallbackWithResult.onExtraCallbackWithResult(rect);
                            return null;
                        }
                    } else {
                        i++;
                    }
                }
            }
            return null;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Context context, Rect rect, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult2, int i, Object obj) {
            generateAppWithState.onWarmupCompleted onwarmupcompleted2;
            boolean z2;
            Integer num3;
            int i2 = 2 % 2;
            if ((i & 4) != 0) {
                int i3 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted2 = generateAppWithState.onWarmupCompleted.BOTTOM;
            } else {
                onwarmupcompleted2 = onwarmupcompleted;
            }
            generateAppWithState.onExtraCallback onextracallback2 = (i & 8) != 0 ? generateAppWithState.onExtraCallback.CENTER : onextracallback;
            generateAppWithState.onNavigationEvent onnavigationevent2 = (i & 16) != 0 ? generateAppWithState.onNavigationEvent.WEAK : onnavigationevent;
            if ((i & 32) != 0) {
                int i5 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                z2 = false;
            } else {
                z2 = z;
            }
            Object obj2 = null;
            if ((i & 64) != 0) {
                int i7 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                num3 = null;
            } else {
                num3 = num;
            }
            return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{onextracallbackwithresult, context, rect, str, onwarmupcompleted2, onextracallback2, onnavigationevent2, Boolean.valueOf(z2), num3, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : onextracallbackwithresult2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -866706066, OverseasRrnInputTextField.IAuthTabCallback(), 866706067)).booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV3View] */
        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Window window;
            Context context = (Context) objArr[1];
            Rect rect = (Rect) objArr[2];
            String str = (String) objArr[3];
            generateAppWithState.onWarmupCompleted onwarmupcompleted = (generateAppWithState.onWarmupCompleted) objArr[4];
            generateAppWithState.onExtraCallback onextracallback = (generateAppWithState.onExtraCallback) objArr[5];
            generateAppWithState.onNavigationEvent onnavigationevent = (generateAppWithState.onNavigationEvent) objArr[6];
            boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
            Integer num = (Integer) objArr[8];
            Integer num2 = (Integer) objArr[9];
            generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult = (generateAppWithState.onExtraCallbackWithResult) objArr[10];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if (!(!varyFields.onWarmupCompleted(context))) {
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                return Boolean.valueOf(i2 % 2 != 0);
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            ViewGroup viewGroup = 0;
            View decorView = (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) ? null : window.getDecorView();
            if (decorView instanceof ViewGroup) {
                int i3 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    (false ? 1 : 0).hashCode();
                    throw null;
                }
                viewGroup = (ViewGroup) decorView;
            }
            if (viewGroup == 0) {
                int i4 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 != 0;
            }
            ?? tdsHighlightV3View = new TdsHighlightV3View(context, null, 0, 6, null);
            TdsHighlightV3View.setTargetView$default(tdsHighlightV3View, EnumC0010onExtraCallbackWithResult.RECT, null, rect, viewGroup, str, onwarmupcompleted, onextracallback, onnavigationevent, zBooleanValue, num2, 0, num, onextracallbackwithresult, 1024, null);
            viewGroup.addView(tdsHighlightV3View);
            return true;
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, View view, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, boolean z, Integer num, Integer num2, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult2, int i, Object obj) {
            generateAppWithState.onExtraCallback onextracallback2;
            Integer num3;
            Integer num4;
            int i2 = 2 % 2;
            generateAppWithState.onWarmupCompleted onwarmupcompleted2 = (i & 2) != 0 ? generateAppWithState.onWarmupCompleted.BOTTOM : onwarmupcompleted;
            if ((i & 4) != 0) {
                int i3 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                onextracallback2 = generateAppWithState.onExtraCallback.CENTER;
            } else {
                onextracallback2 = onextracallback;
            }
            generateAppWithState.onNavigationEvent onnavigationevent2 = (i & 8) != 0 ? generateAppWithState.onNavigationEvent.WEAK : onnavigationevent;
            boolean z2 = (i & 16) != 0 ? false : z;
            Object obj2 = null;
            if ((i & 32) != 0) {
                int i5 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                num3 = null;
            } else {
                num3 = num;
            }
            if ((i & 64) != 0) {
                int i6 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 96 / 0;
                }
                num4 = null;
            } else {
                num4 = num2;
            }
            onextracallbackwithresult.onWarmupCompleted(view, str, onwarmupcompleted2, onextracallback2, onnavigationevent2, z2, num3, num4, (i & 128) != 0 ? null : onextracallbackwithresult2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV3View] */
        public final void onWarmupCompleted(@NotNull View view, @NotNull String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
            Window window;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            View decorView = (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            ?? tdsHighlightV3View = new TdsHighlightV3View(context2, null, 0, 6, null);
            TdsHighlightV3View.setTargetView$default(tdsHighlightV3View, EnumC0010onExtraCallbackWithResult.RECT, view, null, viewGroup, str, onwarmupcompleted, onextracallback, onnavigationevent, z, num2, 0, num, onextracallbackwithresult, 1024, null);
            viewGroup.addView(tdsHighlightV3View);
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, View view, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult2, boolean z, int i, int i2, Object obj) {
            generateAppWithState.onWarmupCompleted onwarmupcompleted2;
            generateAppWithState.onExtraCallback onextracallback2;
            generateAppWithState.onWarmupCompleted onwarmupcompleted3;
            int i3 = 2 % 2;
            if ((i2 & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    onwarmupcompleted3 = generateAppWithState.onWarmupCompleted.BOTTOM;
                    int i5 = 83 / 0;
                } else {
                    onwarmupcompleted3 = generateAppWithState.onWarmupCompleted.BOTTOM;
                }
                onwarmupcompleted2 = onwarmupcompleted3;
            } else {
                onwarmupcompleted2 = onwarmupcompleted;
            }
            if ((i2 & 4) != 0) {
                generateAppWithState.onExtraCallback onextracallback3 = generateAppWithState.onExtraCallback.CENTER;
                int i6 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 2;
                }
                onextracallback2 = onextracallback3;
            } else {
                onextracallback2 = onextracallback;
            }
            onextracallbackwithresult.onExtraCallback(view, str, onwarmupcompleted2, onextracallback2, (i2 & 8) != 0 ? generateAppWithState.onNavigationEvent.WEAK : onnavigationevent, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : onextracallbackwithresult2, (i2 & 64) != 0 ? false : z, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[PHI: r3
          0x0051: PHI (r3v11 android.view.Window) = (r3v10 android.view.Window), (r3v13 android.view.Window) binds: [B:10:0x004f, B:7:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV3View] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(@NotNull View view, @NotNull String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, @Nullable Integer num, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, boolean z, int i) {
            View decorView;
            Window window;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            ViewGroup viewGroup = null;
            if (activityIAuthTabCallback != null) {
                int i5 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    window = activityIAuthTabCallback.getWindow();
                    int i6 = 14 / 0;
                    decorView = window != null ? window.getDecorView() : null;
                } else {
                    window = activityIAuthTabCallback.getWindow();
                    if (window != null) {
                    }
                }
            }
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
                int i7 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 == 0) {
                return;
            }
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            ?? tdsHighlightV3View = new TdsHighlightV3View(context2, null, 0, 6, null);
            TdsHighlightV3View.setTargetView$default(tdsHighlightV3View, EnumC0010onExtraCallbackWithResult.CIRCLE, view, null, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, null, i, num, onextracallbackwithresult, Imgcodecs.IMWRITE_AVIF_QUALITY, null);
            viewGroup2.addView(tdsHighlightV3View);
            int i9 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 29 / 0;
            }
        }

        public static /* synthetic */ boolean onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, Context context, Rect rect, String str, generateAppWithState.onWarmupCompleted onwarmupcompleted, generateAppWithState.onExtraCallback onextracallback, generateAppWithState.onNavigationEvent onnavigationevent, Integer num, generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult2, boolean z, int i, int i2, Object obj) {
            generateAppWithState.onNavigationEvent onnavigationevent2;
            boolean z2;
            int i3 = 2 % 2;
            generateAppWithState.onWarmupCompleted onwarmupcompleted2 = (i2 & 4) != 0 ? generateAppWithState.onWarmupCompleted.BOTTOM : onwarmupcompleted;
            generateAppWithState.onExtraCallback onextracallback2 = (i2 & 8) != 0 ? generateAppWithState.onExtraCallback.CENTER : onextracallback;
            if ((i2 & 16) != 0) {
                int i4 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onnavigationevent2 = generateAppWithState.onNavigationEvent.WEAK;
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            Integer num2 = (i2 & 32) != 0 ? null : num;
            generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult3 = (i2 & 64) != 0 ? null : onextracallbackwithresult2;
            if ((i2 & 128) != 0) {
                int i6 = onExtraCallbackWithResult;
                int i7 = i6 + 47;
                onWarmupCompleted = i7 % 128;
                boolean z3 = i7 % 2 != 0;
                int i8 = i6 + 43;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                z2 = z3;
            } else {
                z2 = z;
            }
            return onextracallbackwithresult.IAuthTabCallback(context, rect, str, onwarmupcompleted2, onextracallback2, onnavigationevent2, num2, onextracallbackwithresult3, z2, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV3View] */
        public final boolean IAuthTabCallback(@NotNull Context context, @NotNull Rect rect, @NotNull String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, @Nullable Integer num, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult, boolean z, int i) {
            Window window;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if (varyFields.onWarmupCompleted(context)) {
                return false;
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            ViewGroup viewGroup = null;
            View decorView = (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) ? null : window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
                int i3 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 5;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != 0) {
                ?? tdsHighlightV3View = new TdsHighlightV3View(context, null, 0, 6, null);
                TdsHighlightV3View.setTargetView$default(tdsHighlightV3View, EnumC0010onExtraCallbackWithResult.CIRCLE, null, rect, viewGroup2, str, onwarmupcompleted, onextracallback, onnavigationevent, z, null, i, num, onextracallbackwithresult, Imgcodecs.IMWRITE_AVIF_QUALITY, null);
                viewGroup2.addView(tdsHighlightV3View);
                return true;
            }
            int i5 = onWarmupCompleted;
            int i6 = i5 + 63;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 5;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, im.toss.uikit.widget.tooltip.TdsHighlightV3View] */
        public final boolean onExtraCallback(@NotNull Context context, @NotNull Rect rect, @Nullable Integer num, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
            Window window;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            ViewGroup viewGroup = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(rect, "");
                varyFields.onWarmupCompleted(context);
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rect, "");
            if (varyFields.onWarmupCompleted(context)) {
                return false;
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            KeyEvent.Callback decorView = (activityIAuthTabCallback == null || (window = activityIAuthTabCallback.getWindow()) == null) ? null : window.getDecorView();
            if (decorView instanceof ViewGroup) {
                int i3 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                viewGroup = (ViewGroup) decorView;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 == 0) {
                int i5 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            ?? tdsHighlightV3View = new TdsHighlightV3View(context, null, 0, 6, null);
            TdsHighlightV3View.setTargetView$default(tdsHighlightV3View, EnumC0010onExtraCallbackWithResult.BLANK, null, rect, viewGroup2, null, null, null, null, false, null, 0, num, onextracallbackwithresult, 2032, null);
            viewGroup2.addView(tdsHighlightV3View);
            int i7 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 64 / 0;
            }
            return true;
        }

        public final boolean IAuthTabCallback(@NotNull Context context, @NotNull Rect rect, @NotNull String str, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onNavigationEvent onnavigationevent, boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable generateAppWithState.onExtraCallbackWithResult onextracallbackwithresult) {
            return ((Boolean) IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, context, rect, str, onwarmupcompleted, onextracallback, onnavigationevent, Boolean.valueOf(z), num, num2, onextracallbackwithresult}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -866706066, OverseasRrnInputTextField.IAuthTabCallback(), 866706067)).booleanValue();
        }

        public final void IAuthTabCallback(@NotNull Context context, @NotNull Rect rect) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, context, rect}, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, 1851700979, iIAuthTabCallback2, -1851700979);
        }
    }
}
