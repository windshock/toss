package im.toss.uikit.gradient;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsRadialGradientView extends View {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private float IAuthTabCallback;
    private float IAuthTabCallbackStub;
    private final Paint asBinder;
    private float onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRadialGradientView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRadialGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsRadialGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.asBinder = paint;
        this.onExtraCallback = 0.5f;
        this.IAuthTabCallback = 0.5f;
        this.IAuthTabCallbackStub = 0.5f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.onNavigationEvent = new getUrlokhttp(new onNavigationEvent(configuration)).onActivityResized();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsRadialGradientView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsRadialGradientView_centerColor) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration2 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    this.onNavigationEvent = typedArrayObtainStyledAttributes.getColor(index, new getUrlokhttp(new IAuthTabCallback(configuration2)).onActivityResized());
                } else if (index == R.styleable.TdsRadialGradientView_edgeColor) {
                    this.onWarmupCompleted = typedArrayObtainStyledAttributes.getColor(index, 0);
                } else if (index == R.styleable.TdsRadialGradientView_centerXRatio) {
                    int i3 = onTransact + 75;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    this.onExtraCallback = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else {
                    if (index == R.styleable.TdsRadialGradientView_centerYRatio) {
                        int i5 = IAuthTabCallbackDefault + 113;
                        onTransact = i5 % 128;
                        int i6 = i5 % 2;
                        this.IAuthTabCallback = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                    } else if (index == R.styleable.TdsRadialGradientView_radiusRatio) {
                        int i7 = onTransact + 75;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        this.IAuthTabCallbackStub = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                    } else if (index == R.styleable.TdsRadialGradientView_isRectShape) {
                        this.onExtraCallbackWithResult = typedArrayObtainStyledAttributes.getBoolean(index, false);
                        int i9 = onTransact + 55;
                        IAuthTabCallbackDefault = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    int i11 = 2 % 2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i12 = 2 % 2;
        }
        int i13 = onTransact + 93;
        IAuthTabCallbackDefault = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsRadialGradientView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 125;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onTransact + 1;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static /* synthetic */ void setGradientColor$default(TdsRadialGradientView tdsRadialGradientView, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onTransact + 1;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        if ((i3 & 1) != 0) {
            i = tdsRadialGradientView.onNavigationEvent;
        }
        if ((i3 & 2) != 0) {
            i2 = tdsRadialGradientView.onWarmupCompleted;
        }
        tdsRadialGradientView.setGradientColor(i, i2);
        int i7 = IAuthTabCallbackDefault + 103;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setGradientColor(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            this.onNavigationEvent = i;
            this.onWarmupCompleted = i2;
            onNavigationEvent();
            invalidate();
            return;
        }
        this.onNavigationEvent = i;
        this.onWarmupCompleted = i2;
        onNavigationEvent();
        invalidate();
        throw null;
    }

    public static /* synthetic */ void setCenterRatio$default(TdsRadialGradientView tdsRadialGradientView, float f, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 87;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            f = tdsRadialGradientView.onExtraCallback;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 23;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                f2 = tdsRadialGradientView.IAuthTabCallback;
                int i9 = 74 / 0;
            } else {
                f2 = tdsRadialGradientView.IAuthTabCallback;
            }
        }
        tdsRadialGradientView.setCenterRatio(f, f2);
    }

    public final void setCenterRatio(float f, float f2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = f;
            this.IAuthTabCallback = f2;
            onNavigationEvent();
            invalidate();
            int i3 = 19 / 0;
            return;
        }
        this.onExtraCallback = f;
        this.IAuthTabCallback = f2;
        onNavigationEvent();
        invalidate();
    }

    public static /* synthetic */ void setRadiusRatio$default(TdsRadialGradientView tdsRadialGradientView, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            f = tdsRadialGradientView.IAuthTabCallbackStub;
        }
        tdsRadialGradientView.setRadiusRatio(f);
        int i5 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.gradient.TdsRadialGradientView.onNavigationEvent.onWarmupCompleted + 19;
            im.toss.uikit.gradient.TdsRadialGradientView.onNavigationEvent.onExtraCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
        }
    }

    public final void setRadiusRatio(float f) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = f;
        onNavigationEvent();
        invalidate();
        int i4 = onTransact + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setRectShape$default(TdsRadialGradientView tdsRadialGradientView, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 29;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = tdsRadialGradientView.onExtraCallbackWithResult;
        }
        tdsRadialGradientView.setRectShape(z);
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRectShape(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = z;
        invalidate();
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 5;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            super.onSizeChanged(i, i2, i3, i4);
            onNavigationEvent();
            int i7 = 83 / 0;
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            onNavigationEvent();
        }
        int i8 = IAuthTabCallbackDefault + 107;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            getWidth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getWidth() > 0 && getHeight() > 0) {
            this.asBinder.setShader(new RadialGradient(getWidth() * this.onExtraCallback, getHeight() * this.IAuthTabCallback, Math.max(getWidth(), getHeight()) * this.IAuthTabCallbackStub, this.onNavigationEvent, this.onWarmupCompleted, Shader.TileMode.CLAMP));
        }
        int i3 = onTransact + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            int i2 = onTransact + 81;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        float width = getWidth() * this.onExtraCallback;
        float height = getHeight() * this.IAuthTabCallback;
        float fMax = Math.max(getWidth(), getHeight());
        float width2 = getWidth() / fMax;
        float height2 = getHeight() / fMax;
        float f = this.IAuthTabCallbackStub;
        if (this.onExtraCallbackWithResult) {
            int i4 = onTransact + 25;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.asBinder);
            return;
        }
        int iSave = canvas.save();
        canvas.scale(width2, height2, width, height);
        try {
            canvas.drawCircle(width, height, fMax * f, this.asBinder);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
