package im.toss.uikit.widget.tooltip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.R;
import im.toss.uikit.widget.gl.TdsGLBlurView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.OkHttpClientCompanion;
import o._string;
import o.access15300;
import o.deprecated_directory;
import o.eExternalSyntheticLambda0;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.response;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsFullTooltipV1View extends ConstraintLayout {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private int IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private LinearLayout IAuthTabCallbackStub;
    private IAuthTabCallback IAuthTabCallbackStubProxy;
    private final float asBinder;
    private View asInterface;
    private BaseTextView getInterfaceDescriptor;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private onExtraCallback onNavigationEvent;
    private onExtraCallbackWithResult onTransact;
    private final float onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.CENTER.ordinal()] = 2;
                int i = onExtraCallback + 33;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[onExtraCallback.values().length];
            try {
                iArr2[onExtraCallback.LEFT.ordinal()] = 1;
                int i4 = onNavigationEvent + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[onExtraCallback.CENTER.ordinal()] = 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[onExtraCallback.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr2;
            int[] iArr3 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr3[onExtraCallbackWithResult.UP.ordinal()] = 1;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[onExtraCallbackWithResult.DOWN.ordinal()] = 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            onWarmupCompleted = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsFullTooltipV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsFullTooltipV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7;
        int i8 = ~i;
        int i9 = ~(i8 | i2);
        int i10 = ~i3;
        int i11 = ~i2;
        int i12 = i9 | (~(i10 | i11 | i));
        int i13 = (~(i2 | i10 | i)) | (~(i11 | i8));
        int i14 = ~(i8 | i10);
        int i15 = i3 + i + i5 + (563899752 * i4) + (667302295 * i6);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1426164010) - 416808960) + (1426164010 * i) + (i12 * 480671447) + (i13 * 480671447) + (480671447 * i14) + (1906835456 * i5) + ((-1270874112) * i4) + (1914175488 * i6) + ((-1995833344) * i16);
        int i18 = (i3 * (-901935710)) + 144807674 + (i * (-901935710)) + (i12 * 171) + (i13 * 171) + (i14 * 171) + (i5 * (-901935539)) + (i4 * 42244168) + (i6 * (-913566613)) + (i16 * (-1006501888));
        if (i17 + (i18 * i18 * (-1006239744)) != 1) {
            return IAuthTabCallback(objArr);
        }
        BaseTextView baseTextView = (BaseTextView) objArr[1];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[2];
        int i19 = 2 % 2;
        int i20 = access100 + 67;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = 3;
        if (i20 % 2 == 0) {
            i7 = onWarmupCompleted.IAuthTabCallback[iAuthTabCallback.ordinal()];
            if (i7 == 0) {
                i21 = 4;
            } else if (i7 != 2) {
                i21 = 17;
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i21 = 5;
            }
        } else {
            int i22 = onWarmupCompleted.IAuthTabCallback[iAuthTabCallback.ordinal()];
            if (i22 != 1) {
                i7 = i22;
                if (i7 != 2) {
                }
            }
        }
        baseTextView.setGravity(i21);
        int i23 = IAuthTabCallback_Parcel + 23;
        access100 = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsFullTooltipV1View tdsFullTooltipV1View) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsFullTooltipV1View);
        int i4 = IAuthTabCallback_Parcel + 3;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsFullTooltipV1View tdsFullTooltipV1View, Function0 function0) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(tdsFullTooltipV1View, function0);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsFullTooltipV1View, function0);
        int i3 = IAuthTabCallback_Parcel + 95;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9 A[PHI: r6
      0x00b9: PHI (r6v5 int) = (r6v4 int), (r6v19 int) binds: [B:12:0x00b7, B:9:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca A[PHI: r6
      0x00ca: PHI (r6v9 int) = (r6v4 int), (r6v19 int) binds: [B:12:0x00b7, B:9:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsFullTooltipV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int index;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onTransact = onExtraCallbackWithResult.UP;
        this.onNavigationEvent = onExtraCallback.LEFT;
        this.IAuthTabCallbackStubProxy = IAuthTabCallback.LEFT;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onExtraCallback = varyMatches.onNavigationEvent(12, r1);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onExtraCallbackWithResult = varyMatches.onNavigationEvent(2, r1);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.asBinder = varyMatches.onNavigationEvent(30, r1);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onWarmupCompleted = varyMatches.onNavigationEvent(12, r1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.IAuthTabCallbackDefault = paint;
        String str = null;
        int childCount = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsFullTooltipV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int i3 = IAuthTabCallback_Parcel + 7;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i2);
                    int i4 = 93 / 0;
                    if (index == R.styleable.TdsFullTooltipV1_fullTooltipDirection) {
                        this.onTransact = onExtraCallbackWithResult.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else {
                        if (index == R.styleable.TdsFullTooltipV1_fullTooltipArrowAlignment) {
                            this.onNavigationEvent = onExtraCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R.styleable.TdsFullTooltipV1_fullTooltipTitleAlignment) {
                            this.IAuthTabCallbackStubProxy = IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R.styleable.TdsFullTooltipV1_fullTooltipArrowOffset) {
                            this.IAuthTabCallback = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.IAuthTabCallback);
                        } else if (index == R.styleable.TdsFullTooltipV1_fullTooltipTitle) {
                            int i5 = IAuthTabCallback_Parcel + 53;
                            access100 = i5 % 128;
                            int i6 = i5 % 2;
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            if (string != null) {
                                str = string;
                            }
                        }
                        int i7 = 2 % 2;
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == R.styleable.TdsFullTooltipV1_fullTooltipDirection) {
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i8 = IAuthTabCallback_Parcel + 69;
            access100 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 2;
            } else {
                int i10 = 2 % 2;
            }
        }
        TdsGLBlurView tdsGLBlurView = new TdsGLBlurView(context, null, 0, 4, null);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        onextracallbackwithresult.IEngagementSignalsCallbackStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        tdsGLBlurView.setLayoutParams(onextracallbackwithresult);
        int radius = deprecated_directory.Medium.getRadius();
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        tdsGLBlurView.setBlurRadius(varyMatches.onNavigationEvent(Integer.valueOf(radius), r5));
        addView(tdsGLBlurView);
        this.asInterface = onExtraCallback(this.onNavigationEvent, this.IAuthTabCallback);
        this.getInterfaceDescriptor = onExtraCallback(this.IAuthTabCallbackStubProxy, str);
        LinearLayout linearLayout = new LinearLayout(context);
        this.IAuthTabCallbackStub = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(this.getInterfaceDescriptor);
        View view = this.asInterface;
        if (this.onTransact == onExtraCallbackWithResult.UP) {
            int i11 = access100 + 79;
            IAuthTabCallback_Parcel = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
        } else {
            childCount = linearLayout.getChildCount();
        }
        linearLayout.addView(view, childCount);
        addView(linearLayout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsFullTooltipV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel;
            int i4 = i3 + 97;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 57;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult UP = new onExtraCallbackWithResult("UP", 0);
        public static final onExtraCallbackWithResult DOWN = new onExtraCallbackWithResult("DOWN", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {UP, DOWN};
            int i5 = i2 + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = IAuthTabCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 41;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback LEFT = new onExtraCallback("LEFT", 0);
        public static final onExtraCallback RIGHT = new onExtraCallback("RIGHT", 1);
        public static final onExtraCallback CENTER = new onExtraCallback("CENTER", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return new onExtraCallback[]{LEFT, RIGHT, CENTER};
            }
            onExtraCallback onextracallback = LEFT;
            onExtraCallback onextracallback2 = RIGHT;
            onExtraCallback onextracallback3 = CENTER;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[2];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            onextracallbackArr[4] = onextracallback3;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            EnumEntries<onExtraCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 26 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 91;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback LEFT = new IAuthTabCallback("LEFT", 0);
        public static final IAuthTabCallback CENTER = new IAuthTabCallback("CENTER", 1);
        public static final IAuthTabCallback RIGHT = new IAuthTabCallback("RIGHT", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = LEFT;
            if (i3 == 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, CENTER, RIGHT};
            }
            IAuthTabCallback iAuthTabCallback2 = CENTER;
            IAuthTabCallback iAuthTabCallback3 = RIGHT;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[4];
            iAuthTabCallbackArr[1] = iAuthTabCallback;
            iAuthTabCallbackArr[0] = iAuthTabCallback2;
            iAuthTabCallbackArr[5] = iAuthTabCallback3;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            EnumEntries<IAuthTabCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 97 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 7 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 99;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public final float IAuthTabCallback() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 53;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.onExtraCallback;
            int i4 = 32 / 0;
        } else {
            f = this.onExtraCallback;
        }
        int i5 = i2 + 9;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            f = this.asBinder;
            int i4 = 10 / 0;
        } else {
            f = this.asBinder;
        }
        int i5 = i3 + 61;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final void setTitleView(@NotNull BaseTextView baseTextView) {
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            this.getInterfaceDescriptor = baseTextView;
        } else {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            this.getInterfaceDescriptor = baseTextView;
            throw null;
        }
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInterfaceDescriptor.setText(charSequence);
            throw null;
        }
        this.getInterfaceDescriptor.setText(charSequence);
        int i3 = IAuthTabCallback_Parcel + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setTitleAlignment(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallbackStubProxy = iAuthTabCallback;
        Object[] objArr = {this, this.getInterfaceDescriptor, iAuthTabCallback};
        onExtraCallback(-453065945, _string.onNavigationEvent.IAuthTabCallback(), 453065946, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback());
        int i4 = IAuthTabCallback_Parcel + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setDirection(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int childCount;
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (this.onTransact == onextracallbackwithresult) {
            return;
        }
        this.IAuthTabCallbackStub.removeView(this.asInterface);
        this.onTransact = onextracallbackwithresult;
        View viewOnExtraCallback = onExtraCallback(this.onNavigationEvent, this.IAuthTabCallback);
        this.asInterface = viewOnExtraCallback;
        LinearLayout linearLayout = this.IAuthTabCallbackStub;
        if (onextracallbackwithresult == onExtraCallbackWithResult.UP) {
            int i4 = access100 + 79;
            int i5 = i4 % 128;
            IAuthTabCallback_Parcel = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 63;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            childCount = 0;
        } else {
            childCount = linearLayout.getChildCount();
        }
        linearLayout.addView(viewOnExtraCallback, childCount);
        requestLayout();
    }

    public final void setArrowAlignment(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onNavigationEvent = onextracallback;
        onExtraCallbackWithResult(this.asInterface, onextracallback, this.IAuthTabCallback);
        int i4 = IAuthTabCallback_Parcel + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setArrowOffset(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 57;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallback = i;
            onExtraCallbackWithResult(this.asInterface, this.onNavigationEvent, i);
            int i4 = access100 + 33;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
                return;
            }
            return;
        }
        this.IAuthTabCallback = i;
        onExtraCallbackWithResult(this.asInterface, this.onNavigationEvent, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsFullTooltipV1View tdsFullTooltipV1View, Function0 function0, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = access100 + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            function0 = null;
        }
        if ((i2 & 2) != 0) {
            int i6 = access100 + 101;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            i = 2600;
        }
        Object[] objArr = {tdsFullTooltipV1View, function0, Integer.valueOf(i)};
        onExtraCallback(-619980179, _string.onNavigationEvent.IAuthTabCallback(), 619980179, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TdsFullTooltipV1View tdsFullTooltipV1View) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        tdsFullTooltipV1View.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 3;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final TdsFullTooltipV1View tdsFullTooltipV1View = (TdsFullTooltipV1View) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        Object[] objArr2 = {Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsFullTooltipV1View, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 200), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 2, getExtraParameters.Alternate, Integer.valueOf(((Number) objArr[2]).intValue()), null, null, null, 500, 0L, false, 1760, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.tooltip.TdsFullTooltipV1View$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnExtraCallback;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnExtraCallback = TdsFullTooltipV1View.onExtraCallback(this.f$0);
                    int i4 = 64 / 0;
                } else {
                    unitOnExtraCallback = TdsFullTooltipV1View.onExtraCallback(this.f$0);
                }
                int i5 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 1, (Object) null), null, new Function0() { // from class: im.toss.uikit.widget.tooltip.TdsFullTooltipV1View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = TdsFullTooltipV1View.onExtraCallback(this.f$0, function0);
                int i5 = onWarmupCompleted + 91;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr2, 2128644226), false, 1, (Object) null);
        int i2 = access100 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TdsFullTooltipV1View tdsFullTooltipV1View, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        tdsFullTooltipV1View.setVisibility(8);
        if (function0 != null) {
            int i4 = IAuthTabCallback_Parcel + 65;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BaseTextView onExtraCallback(IAuthTabCallback iAuthTabCallback, CharSequence charSequence) {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Typography6 typography6 = new Typography6(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        typography6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        DisplayMetrics displayMetrics = typography6.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
        DisplayMetrics displayMetrics2 = typography6.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(16.0f), displayMetrics2);
        typography6.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent2);
        typography6.setTextColor(OkHttpClientCompanion.onWarmupCompleted(typography6, eExternalSyntheticLambda0.TooltipFullText));
        typography6.onNavigationEvent(response.Bold);
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(-453065945, iIAuthTabCallback, 453065946, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, typography6, iAuthTabCallback}, _string.onNavigationEvent.IAuthTabCallback());
        typography6.setText(charSequence);
        int i2 = access100 + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return typography6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onExtraCallback(onExtraCallback onextracallback, int i) {
        int i2 = 2 % 2;
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams((int) ((this.onExtraCallback * 2.0f) + this.asBinder), (int) this.onWarmupCompleted));
        onExtraCallbackWithResult(view, onextracallback, i);
        int i3 = access100 + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        int iSaveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null);
        super.dispatchDraw(canvas);
        float f = this.asBinder;
        float f2 = this.onWarmupCompleted;
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = this.onExtraCallback;
        float f4 = f3 / fSqrt;
        float f5 = (fSqrt - this.onExtraCallbackWithResult) / fSqrt;
        float f6 = this.asBinder / 2.0f;
        float f7 = (f6 * f4) + f3;
        float f8 = this.onWarmupCompleted;
        float f9 = f4 * f8;
        float f10 = (f6 * f5) + f3;
        float f11 = f5 * f8;
        float f12 = f3 + f6;
        Path path = new Path();
        int i2 = onWarmupCompleted.onWarmupCompleted[this.onTransact.ordinal()];
        if (i2 != 1) {
            int i3 = access100;
            int i4 = i3 + 55;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i3 + 115;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            path.moveTo(0.0f, 0.0f);
            path.quadTo(this.onExtraCallback, 0.0f, f7, f9);
            path.lineTo(f10, f11);
            float f13 = (f12 - f10) + f12;
            path.quadTo(f12, this.onWarmupCompleted, f13, f11);
            path.lineTo(f13 + (f10 - f7), f9);
            float f14 = this.onExtraCallback;
            float f15 = this.asBinder + f14;
            path.quadTo(f15, 0.0f, f14 + f15, 0.0f);
            float f16 = this.onExtraCallback;
            path.lineTo(this.asBinder + f16 + f16, this.onWarmupCompleted);
            path.lineTo(0.0f, this.onWarmupCompleted);
            path.lineTo(0.0f, 0.0f);
        } else {
            path.moveTo(0.0f, this.onWarmupCompleted);
            float f17 = this.onExtraCallback;
            float f18 = this.onWarmupCompleted;
            path.quadTo(f17, f18, f7, f18 - f9);
            path.lineTo(f10, this.onWarmupCompleted - f11);
            float f19 = this.onWarmupCompleted;
            float f20 = (f12 - f10) + f12;
            path.quadTo(f12, f19 - f19, f20, f19 - f11);
            path.lineTo(f20 + (f10 - f7), this.onWarmupCompleted - f9);
            float f21 = this.onExtraCallback;
            float f22 = this.asBinder;
            float f23 = this.onWarmupCompleted;
            float f24 = f22 + f21;
            path.quadTo(f24, f23, f21 + f24, f23);
            float f25 = this.onExtraCallback;
            path.lineTo(this.asBinder + f25 + f25, 0.0f);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(0.0f, this.onWarmupCompleted);
        }
        path.close();
        path.offset(this.asInterface.getLeft(), this.asInterface.getTop());
        Path path2 = new Path();
        path2.moveTo(0.0f, 0.0f);
        path2.rLineTo(this.asInterface.getLeft(), 0.0f);
        path2.rLineTo(0.0f, this.asInterface.getMeasuredHeight());
        path2.rLineTo(-this.asInterface.getLeft(), 0.0f);
        path2.close();
        path2.offset(0.0f, this.asInterface.getTop());
        path.addPath(path2);
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.rLineTo(getMeasuredWidth() - this.asInterface.getRight(), 0.0f);
        path3.rLineTo(0.0f, this.asInterface.getMeasuredHeight());
        path3.rLineTo(-(getMeasuredWidth() - this.asInterface.getRight()), 0.0f);
        path3.close();
        path3.offset(this.asInterface.getRight(), this.asInterface.getTop());
        path.addPath(path3);
        canvas.drawPath(path, this.IAuthTabCallbackDefault);
        canvas.restoreToCount(iSaveLayer);
    }

    private final void onExtraCallbackWithResult(View view, onExtraCallback onextracallback, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 37;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int i5 = onWarmupCompleted.onExtraCallbackWithResult[onextracallback.ordinal()];
            int i6 = 3;
            if (i5 == 1) {
                layoutParams2.leftMargin = i;
                layoutParams2.rightMargin = 0;
            } else if (i5 == 2) {
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                i6 = 1;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = IAuthTabCallback_Parcel + 85;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = i;
                i6 = 5;
            }
            layoutParams2.gravity = i6;
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void onNavigationEvent(BaseTextView baseTextView, IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(-453065945, iIAuthTabCallback, 453065946, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, baseTextView, iAuthTabCallback}, _string.onNavigationEvent.IAuthTabCallback());
    }

    public final void onExtraCallbackWithResult(@Nullable Function0<Unit> function0, int i) {
        Object[] objArr = {this, function0, Integer.valueOf(i)};
        onExtraCallback(-619980179, _string.onNavigationEvent.IAuthTabCallback(), 619980179, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback());
    }
}
