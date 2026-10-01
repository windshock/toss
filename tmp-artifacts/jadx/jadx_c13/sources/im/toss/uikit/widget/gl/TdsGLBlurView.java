package im.toss.uikit.widget.gl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.uikit.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFj1rSDK;
import o.ByteOrderedDataOutputStream;
import o.access15300;
import o.deprecated_directory;
import o.deprecated_secure;
import o.getCurrentBacktraceOrBuilderList;
import o.getMaxAdCount;
import o.getokhttp;
import o.isInclusiveVersion;
import o.leaveBreadcrumb;
import o.readIntokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsGLBlurView extends FrameLayout implements isInclusiveVersion {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private deprecated_secure IAuthTabCallback;
    private Function0<Unit> IAuthTabCallbackDefault;
    private TdsGLBlurTextureView IAuthTabCallbackStub;
    private boolean access000;
    private leaveBreadcrumb asBinder;
    private RenderEffectBlurView asInterface;
    private LegacyColorDimView onExtraCallback;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private Integer onTransact;
    private onWarmupCompleted onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.RENDER_EFFECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.OPEN_GL.ordinal()] = 2;
                int i = onExtraCallback + 53;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 % 4;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.LEGACY_DIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onExtraCallbackWithResult.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr;
            int i4 = onExtraCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i2)) | i8;
        int i10 = ~i6;
        int i11 = ~i2;
        int i12 = i9 | (~(i10 | i11 | i3));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i3;
        int i15 = (~(i2 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i3 + i6 + i + ((-327997910) * i4) + ((-604038433) * i5);
        int i18 = i17 * i17;
        int i19 = ((i3 * 234895570) - 128974848) + (234895570 * i6) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i) + (36700160 * i4) + ((-297271296) * i5) + (1302134784 * i18);
        int i20 = (i3 * (-238133666)) + 182491156 + (i6 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i * (-238134313)) + (i4 * (-1022231738)) + (i5 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        if (i21 == 1) {
            return onExtraCallback(objArr);
        }
        if (i21 != 2) {
            return IAuthTabCallback(objArr);
        }
        int iIntValue = 0;
        TdsGLBlurView tdsGLBlurView = (TdsGLBlurView) objArr[0];
        int i22 = 2 % 2;
        int i23 = getInterfaceDescriptor;
        int i24 = i23 + 1;
        int i25 = i24 % 128;
        access100 = i25;
        int i26 = i24 % 2;
        Integer num = tdsGLBlurView.onTransact;
        if (num != null) {
            int i27 = i23 + 73;
            access100 = i27 % 128;
            int i28 = i27 % 2;
            iIntValue = num.intValue();
        } else {
            int i29 = i25 + 3;
            getInterfaceDescriptor = i29 % 128;
            int i30 = i29 % 2;
        }
        tdsGLBlurView.setBackgroundColor(iIntValue);
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(tdsGLBlurView);
        }
        IAuthTabCallback(tdsGLBlurView);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tdsGLBlurView);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return unitOnTransact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        deprecated_secure deprecated_secureVarAsInterface;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.NONE;
        this.onWarmupCompleted = onWarmupCompleted.IAuthTabCallback.onExtraCallback;
        this.IAuthTabCallback = deprecated_secure.Companion.IAuthTabCallback();
        this.access000 = AFj1rSDK.onExtraCallback.onExtraCallback().onNavigationEvent();
        this.onNavigationEvent = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsGLBlurView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsGLBlurView_blurStyle) {
                    int i4 = access100 + 19;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0 ? (i2 = typedArrayObtainStyledAttributes.getInt(index, 0)) == 0 : (i2 = typedArrayObtainStyledAttributes.getInt(index, 0)) == 0) {
                        deprecated_secureVarAsInterface = deprecated_secure.Companion.onExtraCallbackWithResult();
                    } else if (i2 != 1) {
                        int i5 = access100;
                        int i6 = i5 + 61;
                        getInterfaceDescriptor = i6 % 128;
                        if (i6 % 2 != 0 ? i2 == 2 : i2 == 5) {
                            deprecated_secureVarAsInterface = deprecated_secure.Companion.onNavigationEvent();
                        } else if (i2 != 3) {
                            int i7 = i5 + 29;
                            getInterfaceDescriptor = i7 % 128;
                            int i8 = i7 % 2;
                            if (i2 != 4) {
                                deprecated_secureVarAsInterface = deprecated_secure.Companion.IAuthTabCallback();
                                int i9 = getInterfaceDescriptor + 105;
                                access100 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i10 = 2 % 2;
                                }
                            } else {
                                deprecated_secureVarAsInterface = deprecated_secure.Companion.onExtraCallback();
                            }
                        } else {
                            deprecated_secureVarAsInterface = deprecated_secure.Companion.onWarmupCompleted();
                        }
                    } else {
                        deprecated_secureVarAsInterface = deprecated_secure.Companion.asInterface();
                    }
                    setBlurStyle(deprecated_secureVarAsInterface);
                } else if (index == R.styleable.TdsGLBlurView_overlayColor) {
                    setOverlayColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0)));
                } else if (index == R.styleable.TdsGLBlurView_useOpenGLFallback) {
                    setUseOpenGLFallback(typedArrayObtainStyledAttributes.getBoolean(index, AFj1rSDK.onExtraCallback.onExtraCallback().onNavigationEvent()));
                    int i11 = getInterfaceDescriptor + 115;
                    access100 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 2 % 2;
                }
                i3++;
                int i14 = getInterfaceDescriptor + 87;
                access100 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 % 2;
                } else {
                    int i16 = 2 % 2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i17 = 2 % 2;
        }
        setTag("TDS_BLUR_VIEW_TAG");
        if (isAttachedToWindow()) {
            int i18 = getInterfaceDescriptor + 105;
            access100 = i18 % 128;
            if (i18 % 2 != 0) {
                onExtraCallbackWithResult(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult(this);
        } else {
            addOnAttachStateChangeListener(new onNavigationEvent(this, this));
            int i19 = access100 + 27;
            getInterfaceDescriptor = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 2 % 2;
            }
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: im.toss.uikit.widget.gl.TdsGLBlurView.2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                int i21 = 2 % 2;
                int i22 = onNavigationEvent + 23;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                if (i23 == 0) {
                    int i24 = 21 / 0;
                }
                int i25 = onExtraCallback + 9;
                onNavigationEvent = i25 % 128;
                int i26 = i25 % 2;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                int i21 = 2 % 2;
                int i22 = onExtraCallback + 81;
                onNavigationEvent = i22 % 128;
                if (i22 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(view, "");
                    TdsGLBlurView.onWarmupCompleted(TdsGLBlurView.this);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(view, "");
                TdsGLBlurView.onWarmupCompleted(TdsGLBlurView.this);
                int i23 = onExtraCallback + 113;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsGLBlurView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 59;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 46 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = getInterfaceDescriptor + 111;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        tdsGLBlurView.IAuthTabCallback();
        int i4 = access100 + 115;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        tdsGLBlurView.IAuthTabCallbackDefault();
        int i4 = getInterfaceDescriptor + 69;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult RENDER_EFFECT = new onExtraCallbackWithResult("RENDER_EFFECT", 0);
        public static final onExtraCallbackWithResult OPEN_GL = new onExtraCallbackWithResult("OPEN_GL", 1);
        public static final onExtraCallbackWithResult LEGACY_DIM = new onExtraCallbackWithResult("LEGACY_DIM", 2);
        public static final onExtraCallbackWithResult NONE = new onExtraCallbackWithResult("NONE", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = RENDER_EFFECT;
            if (i3 == 0) {
                return new onExtraCallbackWithResult[]{onextracallbackwithresult, OPEN_GL, LEGACY_DIM, NONE};
            }
            onExtraCallbackWithResult onextracallbackwithresult2 = OPEN_GL;
            onExtraCallbackWithResult onextracallbackwithresult3 = LEGACY_DIM;
            onExtraCallbackWithResult onextracallbackwithresult4 = NONE;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[4];
            onextracallbackwithresultArr[0] = onextracallbackwithresult;
            onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            onextracallbackwithresultArr[4] = onextracallbackwithresult3;
            onextracallbackwithresultArr[5] = onextracallbackwithresult4;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            int i4 = 49 / 0;
            return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 39;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    interface onWarmupCompleted {

        public static final class IAuthTabCallback implements onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 37;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (this != obj) {
                    return obj instanceof IAuthTabCallback;
                }
                int i4 = i3 + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return 1917419311;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return "None";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onNavigationEvent implements onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private final float onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    if (Float.compare(this.onNavigationEvent, ((onNavigationEvent) obj).onNavigationEvent) == 0) {
                        return true;
                    }
                    int i2 = onExtraCallbackWithResult + 91;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = IAuthTabCallback;
                int i5 = i4 + 29;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 9;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onNavigationEvent;
                if (i3 != 0) {
                    return Float.hashCode(f);
                }
                Float.hashCode(f);
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "RoundRect(cornerRadius=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public onNavigationEvent(float f) {
                this.onNavigationEvent = f;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallbackWithResult implements onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            private final float onExtraCallback;
            private final float onExtraCallbackWithResult;
            private final float onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 5;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                if (Float.compare(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) != 0) {
                    return false;
                }
                if (Float.compare(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) == 0) {
                    return Float.compare(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) == 0;
                }
                int i4 = onWarmupCompleted + 83;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
                int i4 = IAuthTabCallback + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Circle(centerX=" + this.onExtraCallback + ", centerY=" + this.onNavigationEvent + ", radius=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public onExtraCallbackWithResult(float f, float f2, float f3) {
                this.onExtraCallback = f;
                this.onNavigationEvent = f2;
                this.onExtraCallbackWithResult = f3;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                float f = this.onExtraCallback;
                int i5 = i3 + 19;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 5;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                float f = this.onExtraCallbackWithResult;
                int i5 = i3 + 17;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }
        }
    }

    public final void setOnFirstFrame(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = function0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 39;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r1 == 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r1 = r4.onExtraCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r2 = im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor + 71;
        im.toss.uikit.widget.gl.TdsGLBlurView.access100 = r2 % 128;
        r2 = r2 % 2;
        r1.setBlurRadius(r5.onTransact());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r0 = r4.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r0.setBlurStyle(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r1 = im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor + 17;
        im.toss.uikit.widget.gl.TdsGLBlurView.access100 = r1 % 128;
        r1 = r1 % 2;
        r0 = r4.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r0.setBlurStyle(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r1 == 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBlurStyle(@NotNull deprecated_secure deprecated_secureVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 59;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.IAuthTabCallback = deprecated_secureVar;
            i = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.IAuthTabCallback = deprecated_secureVar;
            i = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        }
    }

    public final void setOverlayColor(@Nullable Integer num) {
        int i = 2 % 2;
        this.onTransact = num;
        int i2 = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        if (i2 == 1) {
            if (Build.VERSION.SDK_INT >= 31) {
                int i3 = getInterfaceDescriptor + 77;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                RenderEffectBlurView renderEffectBlurView = this.asInterface;
                if (renderEffectBlurView != null) {
                    renderEffectBlurView.setOverlayColor(this.onTransact);
                    int i5 = access100 + 87;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 2) {
            TdsGLBlurTextureView tdsGLBlurTextureView = this.IAuthTabCallbackStub;
            if (tdsGLBlurTextureView != null) {
                tdsGLBlurTextureView.setOverlayColor(num);
                return;
            }
            return;
        }
        if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 852102313, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -852102311);
        int i7 = access100 + 3;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TdsGLBlurView onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent(View view, TdsGLBlurView tdsGLBlurView) {
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult = tdsGLBlurView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            TdsGLBlurView.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setProgressiveBlurSpec(@Nullable leaveBreadcrumb leavebreadcrumb) {
        RenderEffectBlurView renderEffectBlurView;
        int i = 2 % 2;
        leaveBreadcrumb leavebreadcrumb2 = this.asBinder;
        boolean z = false;
        if (leavebreadcrumb2 == null) {
            int i2 = access100 + 115;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
                if (leavebreadcrumb == null) {
                    if (leavebreadcrumb2 != null && leavebreadcrumb == null) {
                        z = true;
                    }
                }
            } else if (leavebreadcrumb == null) {
            }
        }
        this.asBinder = leavebreadcrumb;
        if (z && isAttachedToWindow()) {
            IAuthTabCallback();
            return;
        }
        int i4 = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                int i5 = access100 + 101;
                int i6 = i5 % 128;
                getInterfaceDescriptor = i6;
                int i7 = i5 % 2;
                if (i4 != 3) {
                    int i8 = i6 + 93;
                    access100 = i8 % 128;
                    if (i8 % 2 == 0 ? i4 != 4 : i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                TdsGLBlurTextureView tdsGLBlurTextureView = this.IAuthTabCallbackStub;
                if (tdsGLBlurTextureView != null) {
                    int i9 = access100 + 53;
                    getInterfaceDescriptor = i9 % 128;
                    if (i9 % 2 != 0) {
                        tdsGLBlurTextureView.setProgressiveBlurSpec(leavebreadcrumb);
                        return;
                    } else {
                        tdsGLBlurTextureView.setProgressiveBlurSpec(leavebreadcrumb);
                        throw null;
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 31 && (renderEffectBlurView = this.asInterface) != null) {
            renderEffectBlurView.setProgressiveBlurSpec(leavebreadcrumb);
        }
        int i10 = getInterfaceDescriptor + 111;
        access100 = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void setUseOpenGLFallback(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.access000 != z) {
            int i5 = i3 + 83;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            this.access000 = z;
            if (isAttachedToWindow()) {
                IAuthTabCallback();
                int i7 = access100 + Imgproc.COLOR_YUV2RGB_YVYU;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    public final void setDimmedColor(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 113;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        LegacyColorDimView legacyColorDimView = this.onExtraCallback;
        if (legacyColorDimView != null) {
            int i6 = i4 + Imgproc.COLOR_YUV2RGB_YVYU;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            legacyColorDimView.setBgColor(i);
            if (i7 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i8 = getInterfaceDescriptor + 61;
        access100 = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ void setLinearProgressiveBlur$default(TdsGLBlurView tdsGLBlurView, float f, float f2, float f3, float f4, Float f5, Interpolator interpolator, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 16) != 0) {
            int i3 = access100;
            int i4 = i3 + 31;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 115;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            f5 = null;
        }
        Float f6 = f5;
        if ((i & 32) != 0) {
            interpolator = new LinearInterpolator();
        }
        tdsGLBlurView.setLinearProgressiveBlur(f, f2, f3, f4, f6, interpolator);
    }

    public final void setLinearProgressiveBlur(float f, float f2, float f3, float f4, @Nullable Float f5, @NotNull Interpolator interpolator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        setProgressiveBlurSpec(new leaveBreadcrumb.onExtraCallback(interpolator, f, f2, f3, f4, f5));
        int i2 = access100 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void setRadialProgressiveBlur$default(TdsGLBlurView tdsGLBlurView, float f, float f2, float f3, Interpolator interpolator, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 101;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 8) != 0) {
            interpolator = new LinearInterpolator();
            int i5 = access100 + 53;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        tdsGLBlurView.setRadialProgressiveBlur(f, f2, f3, interpolator);
    }

    public final void setRadialProgressiveBlur(float f, float f2, float f3, @NotNull Interpolator interpolator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        setProgressiveBlurSpec(new leaveBreadcrumb.onWarmupCompleted(interpolator, f, f2, f3));
        int i2 = access100 + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (getWidth() != 0 && getHeight() != 0) {
            int i2 = getInterfaceDescriptor + 59;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            super.dispatchDraw(canvas);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = access100 + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setBlurToken(@NotNull deprecated_directory deprecated_directoryVar) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_directoryVar, "");
        setBlurRadius(setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(deprecated_directoryVar.getRadius())));
        int i4 = getInterfaceDescriptor + 51;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setColorToken(@NotNull getokhttp getokhttpVar) {
        deprecated_secure deprecated_secureVarOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getokhttpVar, "");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            int i2 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            deprecated_secureVarOnWarmupCompleted = deprecated_secure.onWarmupCompleted(this.IAuthTabCallback, 0, 0.0f, getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallback(getokhttpVar.getColor().onExtraCallbackWithResult()), 0.3f), 0.0f, 0.0f, 0.0f, false, 123, (Object) null);
        } else {
            deprecated_secureVarOnWarmupCompleted = deprecated_secure.onWarmupCompleted(this.IAuthTabCallback, 0, 0.0f, getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallback(getokhttpVar.getColor().IAuthTabCallback()), 0.3f), 0.0f, 0.0f, 0.0f, false, 123, (Object) null);
        }
        setBlurStyle(deprecated_secureVarOnWarmupCompleted);
        int i4 = access100 + 37;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBlurRadius(float f) {
        int i = 2 % 2;
        if (f <= 0.0f) {
            int i2 = getInterfaceDescriptor + 7;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            setBlurStyle(deprecated_secure.onWarmupCompleted(this.IAuthTabCallback, 0, 0.0f, 0L, 0.0f, 0.0f, 0.0f, false, 92, (Object) null));
            if (this.onExtraCallbackWithResult == onExtraCallbackWithResult.LEGACY_DIM) {
                int i4 = access100 + 77;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                LegacyColorDimView legacyColorDimView = this.onExtraCallback;
                if (legacyColorDimView != null) {
                    legacyColorDimView.setBlurRadius(0.0f);
                    return;
                }
                return;
            }
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        double dOnExtraCallback = varyMatches.onExtraCallback(Float.valueOf(f), context);
        setBlurStyle(deprecated_secure.onWarmupCompleted(this.IAuthTabCallback, RangesKt___RangesKt.coerceIn(getCurrentBacktraceOrBuilderList.onNavigationEvent((float) Math.pow(dOnExtraCallback, 0.38d)), 1, 7), ((float) Math.pow(dOnExtraCallback, 0.61d)) / this.onNavigationEvent, 0L, 0.0f, 0.0f, f, false, 92, (Object) null));
        if (this.onExtraCallbackWithResult == onExtraCallbackWithResult.LEGACY_DIM) {
            int i5 = getInterfaceDescriptor + 39;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            LegacyColorDimView legacyColorDimView2 = this.onExtraCallback;
            if (legacyColorDimView2 != null) {
                legacyColorDimView2.setBlurRadius(f);
            }
        }
    }

    public final void setOverlayColor(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 55;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        setOverlayColor(Integer.valueOf(i));
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaskRoundRect(float f) {
        int i = 2 % 2;
        this.onWarmupCompleted = new onWarmupCompleted.onNavigationEvent(f);
        onWarmupCompleted();
        int i2 = access100 + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setMaskCircle(float f, float f2, float f3) {
        int i = 2 % 2;
        this.onWarmupCompleted = new onWarmupCompleted.onExtraCallbackWithResult(f, f2, f3);
        onWarmupCompleted();
        int i2 = access100 + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault();
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 2003641781, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2003641781);
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        int i4 = onExtraCallback.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            asBinder();
        } else {
            int i5 = access100 + 71;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? i4 == 2 : i4 == 2) {
                IAuthTabCallbackStub();
            } else if (i4 == 3) {
                onTransact();
            } else if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        onExtraCallback();
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        if (i4 == 1) {
            IAuthTabCallbackStubProxy();
        } else {
            int i5 = access100 + 21;
            int i6 = i5 % 128;
            getInterfaceDescriptor = i6;
            int i7 = i5 % 2;
            if (i4 == 2) {
                access100();
            } else if (i4 != 3) {
                int i8 = i6 + 55;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1482957224, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1482957223);
            }
        }
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.NONE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsGLBlurView tdsGLBlurView = (TdsGLBlurView) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 31) {
            if (tdsGLBlurView.access000) {
                int i4 = getInterfaceDescriptor + 15;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    return onExtraCallbackWithResult.OPEN_GL;
                }
                int i5 = 56 / 0;
                return onExtraCallbackWithResult.OPEN_GL;
            }
            return onExtraCallbackWithResult.LEGACY_DIM;
        }
        int i6 = access100 + 37;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return onExtraCallbackWithResult.RENDER_EFFECT;
        }
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.RENDER_EFFECT;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        if (i2 == 1) {
            onExtraCallbackWithResult();
            if (Build.VERSION.SDK_INT >= 31) {
                RenderEffectBlurView renderEffectBlurView = this.asInterface;
                Object obj = null;
                if (renderEffectBlurView != null) {
                    int i3 = getInterfaceDescriptor + 61;
                    access100 = i3 % 128;
                    if (i3 % 2 != 0) {
                        renderEffectBlurView.setBlurStyle(this.IAuthTabCallback);
                        throw null;
                    }
                    renderEffectBlurView.setBlurStyle(this.IAuthTabCallback);
                }
                RenderEffectBlurView renderEffectBlurView2 = this.asInterface;
                if (renderEffectBlurView2 != null) {
                    int i4 = getInterfaceDescriptor + 63;
                    access100 = i4 % 128;
                    if (i4 % 2 != 0) {
                        renderEffectBlurView2.setOverlayColor(this.onTransact);
                        int i5 = 45 / 0;
                    } else {
                        renderEffectBlurView2.setOverlayColor(this.onTransact);
                    }
                }
                RenderEffectBlurView renderEffectBlurView3 = this.asInterface;
                if (renderEffectBlurView3 != null) {
                    int i6 = access100 + 21;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                    renderEffectBlurView3.setProgressiveBlurSpec(this.asBinder);
                    if (i7 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        } else if (i2 == 2) {
            onExtraCallbackWithResult();
            TdsGLBlurTextureView tdsGLBlurTextureView = this.IAuthTabCallbackStub;
            if (tdsGLBlurTextureView != null) {
                tdsGLBlurTextureView.setBlurStyle(this.IAuthTabCallback);
            }
            TdsGLBlurTextureView tdsGLBlurTextureView2 = this.IAuthTabCallbackStub;
            if (tdsGLBlurTextureView2 != null) {
                tdsGLBlurTextureView2.setOverlayColor(this.onTransact);
            }
            TdsGLBlurTextureView tdsGLBlurTextureView3 = this.IAuthTabCallbackStub;
            if (tdsGLBlurTextureView3 != null) {
                int i8 = access100 + 81;
                getInterfaceDescriptor = i8 % 128;
                if (i8 % 2 == 0) {
                    tdsGLBlurTextureView3.setProgressiveBlurSpec(this.asBinder);
                    int i9 = 67 / 0;
                } else {
                    tdsGLBlurTextureView3.setProgressiveBlurSpec(this.asBinder);
                }
            }
        } else if (i2 != 3) {
            int i10 = getInterfaceDescriptor + 101;
            access100 = i10 % 128;
            if (i10 % 2 == 0 ? i2 != 4 : i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 852102313, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -852102311);
        } else {
            onExtraCallbackWithResult();
            LegacyColorDimView legacyColorDimView = this.onExtraCallback;
            if (legacyColorDimView != null) {
                int i11 = getInterfaceDescriptor + 111;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                legacyColorDimView.setBlurRadius(this.IAuthTabCallback.onTransact());
            }
            Integer num = this.onTransact;
            if (num != null) {
                int i13 = access100 + 99;
                getInterfaceDescriptor = i13 % 128;
                if (i13 % 2 == 0) {
                    setBackgroundColor(num.intValue());
                    int i14 = 78 / 0;
                } else {
                    setBackgroundColor(num.intValue());
                }
            }
        }
        onWarmupCompleted();
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundColor(0);
        int i4 = getInterfaceDescriptor + 39;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r1 == 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r1 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1 = r5.onWarmupCompleted;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.IAuthTabCallback.onExtraCallback) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r1 = im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor + 105;
        im.toss.uikit.widget.gl.TdsGLBlurView.access100 = r1 % 128;
        r1 = r1 % 2;
        r0 = r5.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r0.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if ((r1 instanceof im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onNavigationEvent) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r2 = im.toss.uikit.widget.gl.TdsGLBlurView.access100 + 93;
        im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor = r2 % 128;
        r2 = r2 % 2;
        r0 = r5.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r0.setMaskRoundRect(((im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onNavigationEvent) r1).onExtraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if ((r1 instanceof im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onExtraCallbackWithResult) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r0 = r5.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r1 = (im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onExtraCallbackWithResult) r1;
        r0.setMaskCircle(r1.onExtraCallback(), r1.IAuthTabCallback(), r1.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r1 = im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor + 125;
        im.toss.uikit.widget.gl.TdsGLBlurView.access100 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if ((r1 % 2) != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r1 = r5.onWarmupCompleted;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.IAuthTabCallback.onExtraCallback) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        r1 = im.toss.uikit.widget.gl.TdsGLBlurView.access100 + 93;
        im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if ((r1 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        r1 = r5.asInterface;
        r2 = 91 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        r1 = r5.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        r1.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        if ((r1 instanceof im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onNavigationEvent) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        r2 = r5.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
    
        r3 = im.toss.uikit.widget.gl.TdsGLBlurView.access100 + 25;
        im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor = r3 % 128;
        r3 = r3 % 2;
        r2.setRoundRectMask(((im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onNavigationEvent) r1).onExtraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        if ((r1 instanceof im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onExtraCallbackWithResult) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
    
        r2 = r5.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        r1 = (im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.onExtraCallbackWithResult) r1;
        r2.setCircleMask(r1.onExtraCallback(), r1.IAuthTabCallback(), r1.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0100, code lost:
    
        kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, im.toss.uikit.widget.gl.TdsGLBlurView.onWarmupCompleted.IAuthTabCallback.onExtraCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r1 = r5.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
    
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        r2 = im.toss.uikit.widget.gl.TdsGLBlurView.access100 + 13;
        im.toss.uikit.widget.gl.TdsGLBlurView.getInterfaceDescriptor = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        if ((r2 % 2) != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        r1.invalidate();
        r0 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
    
        r1.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1 == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 47;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            i = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        } else {
            i = onExtraCallback.onWarmupCompleted[this.onExtraCallbackWithResult.ordinal()];
        }
    }

    private static final Unit onTransact(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        Function0<Unit> function0 = tdsGLBlurView.IAuthTabCallbackDefault;
        if (function0 != null) {
            int i2 = access100 + 57;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = access100 + 9;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            RenderEffectBlurView renderEffectBlurView = new RenderEffectBlurView(context);
            renderEffectBlurView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            renderEffectBlurView.setOnFirstFrameRenderedListener(new Function0() { // from class: im.toss.uikit.widget.gl.TdsGLBlurView$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 119;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = TdsGLBlurView.onNavigationEvent(this.f$0);
                    int i7 = onWarmupCompleted + 57;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnNavigationEvent;
                }
            });
            this.asInterface = renderEffectBlurView;
            addView(renderEffectBlurView, 0);
            return;
        }
        int i4 = access100 + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        RenderEffectBlurView renderEffectBlurView = this.asInterface;
        if (renderEffectBlurView != null) {
            int i4 = i3 + 47;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (renderEffectBlurView.getParent() == this) {
                int i6 = access100 + 113;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                removeView(renderEffectBlurView);
            }
        }
        this.asInterface = null;
    }

    private static final Unit IAuthTabCallback(TdsGLBlurView tdsGLBlurView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = tdsGLBlurView.IAuthTabCallbackDefault;
        if (function0 != null) {
            int i5 = i3 + 45;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            if (i6 == 0) {
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsGLBlurTextureView tdsGLBlurTextureView = new TdsGLBlurTextureView(context, null, 0, 6, null);
        tdsGLBlurTextureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tdsGLBlurTextureView.setOnFirstFrame(new Function0() { // from class: im.toss.uikit.widget.gl.TdsGLBlurView$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = TdsGLBlurView.onExtraCallback(this.f$0);
                int i5 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackStub = tdsGLBlurTextureView;
        addView(tdsGLBlurTextureView, 0);
        int i2 = getInterfaceDescriptor + 87;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void access100() {
        int i = 2 % 2;
        int i2 = access100 + 31;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            TdsGLBlurTextureView tdsGLBlurTextureView = this.IAuthTabCallbackStub;
            if (tdsGLBlurTextureView != null) {
                int i4 = i3 + 13;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                    if (tdsGLBlurTextureView.getParent() == this) {
                        removeView(tdsGLBlurTextureView);
                    }
                } else if (tdsGLBlurTextureView.getParent() == this) {
                }
            }
            this.IAuthTabCallbackStub = null;
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LegacyColorDimView legacyColorDimView = new LegacyColorDimView(context);
        legacyColorDimView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.onExtraCallback = legacyColorDimView;
        addView(legacyColorDimView, 0);
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsGLBlurView tdsGLBlurView = (TdsGLBlurView) objArr[0];
        int i = 2 % 2;
        LegacyColorDimView legacyColorDimView = tdsGLBlurView.onExtraCallback;
        Object obj = null;
        if (legacyColorDimView != null) {
            int i2 = getInterfaceDescriptor + 109;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                legacyColorDimView.getParent();
                obj.hashCode();
                throw null;
            }
            if (legacyColorDimView.getParent() == tdsGLBlurView) {
                tdsGLBlurView.removeView(legacyColorDimView);
                int i3 = access100 + 67;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        tdsGLBlurView.onExtraCallback = null;
        int i5 = access100 + 31;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final void onNavigationEvent() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 852102313, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -852102311);
    }

    private final onExtraCallbackWithResult asInterface() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (onExtraCallbackWithResult) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 2003641781, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2003641781);
    }

    private final void IAuthTabCallback_Parcel() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1482957224, new Object[]{this}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1482957223);
    }
}
