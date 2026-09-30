package im.toss.uikit.widget.gl;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.bytedance.sdk.component.adexpress.dj.ycx$;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.ByteOrderedDataOutputStream;
import o.access6900;
import o.deprecated_directory;
import o.deprecated_secure;
import o.getCurrentBacktraceOrBuilderList;
import o.getSslSocketFactoryOrNullokhttp;
import o.isObject;
import o.leaveBreadcrumb;
import o.setByteOrder;
import o.setSubtitleTextColor;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RenderEffectBlurView extends View {
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static int onRelationshipValidationResult = 1;
    private static int onUnminimized;
    private final int[] IAuthTabCallback;
    private final Path IAuthTabCallbackDefault;
    private final RectF IAuthTabCallbackStub;
    private RenderEffect IAuthTabCallbackStubProxy;
    private final RenderNode IAuthTabCallback_Parcel;
    private final Path ICustomTabsCallback;
    private final ArrayList<RenderNode> access000;
    private boolean access100;
    private float asBinder;
    private setByteOrder asInterface;
    private Function0<Unit> extraCallback;
    private Integer extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private final HashMap<Integer, RenderEffect> onActivityLayout;
    private leaveBreadcrumb onActivityResized;
    private final int[] onExtraCallback;
    private final int[] onExtraCallbackWithResult;
    private final access6900<Pair<View, View>> onMessageChannelReady;
    private final Path onMinimized;
    private final int onNavigationEvent;
    private final RenderNode onPostMessage;
    private final Rect onTransact;
    private MaskShape readTypedObject;
    private final ArrayList<LayerPlan> writeTypedObject;
    private static final Companion Companion = new Companion(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = onRelationshipValidationResult + 65;
        ICustomTabsCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final float onExtraCallback(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 87;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            f7 = (f / f3) / f5;
            f8 = (f2 / f4) / f6;
        } else {
            f7 = (f - f3) * f5;
            f8 = (f2 - f4) * f6;
        }
        float f9 = f7 + f8;
        int i4 = i2 + 55;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return f9;
    }

    private final float onNavigationEvent(float f, int i) {
        int i2 = 2 % 2;
        if (i <= 0) {
            int i3 = onUnminimized;
            int i4 = i3 + 77;
            ICustomTabsCallbackDefault = i4 % 128;
            float f2 = i4 % 2 == 0 ? 2.0f : 0.0f;
            int i5 = i3 + 79;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return f2;
        }
        if (-1.0f > f) {
            return f;
        }
        int i7 = ICustomTabsCallbackDefault + 29;
        int i8 = i7 % 128;
        onUnminimized = i8;
        int i9 = i7 % 2;
        if (f > 1.0f) {
            return f;
        }
        int i10 = i8 + 59;
        ICustomTabsCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        return f * i;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9;
        int i11 = (~((~i) | i7 | i6)) | (~(i8 | i3));
        int i12 = i3 + i6 + i4 + (531708263 * i2) + ((-608630064) * i5);
        int i13 = i12 * i12;
        int i14 = (i3 * (-228234701)) + 730857472 + ((-228234701) * i6) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i4) + ((-45088768) * i2) + ((-419430400) * i5) + ((-1471938560) * i13);
        int i15 = ((i3 * (-1679524527)) - 150938974) + (i6 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i4 * (-1679524245)) + (i2 * (-166744051)) + (i5 * 2062148848) + (i13 * (-865337344));
        int i16 = i14 + (i15 * i15 * (-1617166336));
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderEffectBlurView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onPostMessage = setSubtitleTextColor.et_("TDS_RENDER_EFFECT_BLUR_SOURCE");
        this.IAuthTabCallback_Parcel = setSubtitleTextColor.et_("TDS_RENDER_EFFECT_BLUR_COMPOSITE");
        this.access000 = new ArrayList<>(28);
        this.writeTypedObject = new ArrayList<>(28);
        this.onActivityLayout = new HashMap<>();
        this.IAuthTabCallback = new int[2];
        this.onExtraCallback = new int[2];
        this.onExtraCallbackWithResult = new int[2];
        this.onMessageChannelReady = new access6900<>(8);
        this.onTransact = new Rect();
        this.IAuthTabCallbackDefault = new Path();
        this.IAuthTabCallbackStub = new RectF();
        this.ICustomTabsCallback = new Path();
        this.onMinimized = new Path();
        this.onNavigationEvent = onNavigationEvent();
        this.asBinder = deprecated_directory.Medium.getRadius();
        this.readTypedObject = MaskShape.None.onWarmupCompleted;
        this.access100 = true;
    }

    interface MaskShape {

        public static final class None implements MaskShape {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final None onWarmupCompleted = new None();

            static {
                int i = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this != obj) {
                    return obj instanceof None;
                }
                int i5 = i2 + 25;
                onExtraCallback = i5 % 128;
                return i5 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return 440807352;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "None";
            }

            private None() {
            }
        }

        public static final class RoundRect implements MaskShape {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private final float onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RoundRect) {
                    return Float.compare(this.onWarmupCompleted, ((RoundRect) obj).onWarmupCompleted) == 0;
                }
                int i5 = i2 + 115;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onWarmupCompleted;
                if (i3 == 0) {
                    return Float.hashCode(f);
                }
                Float.hashCode(f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "RoundRect(radius=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public RoundRect(float f) {
                this.onWarmupCompleted = f;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                float f = this.onWarmupCompleted;
                if (i3 == 0) {
                    int i4 = 67 / 0;
                }
                return f;
            }
        }

        public static final class Circle implements MaskShape {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            private final float onExtraCallback;
            private final float onExtraCallbackWithResult;
            private final float onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 55;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof Circle)) {
                    return false;
                }
                Circle circle = (Circle) obj;
                if (Float.compare(this.onExtraCallback, circle.onExtraCallback) != 0) {
                    int i4 = IAuthTabCallback + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Float.compare(this.onNavigationEvent, circle.onNavigationEvent) != 0) {
                    int i6 = onWarmupCompleted + 81;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Float.compare(this.onExtraCallbackWithResult, circle.onExtraCallbackWithResult) == 0) {
                    return true;
                }
                int i8 = onWarmupCompleted + 101;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
                int i4 = IAuthTabCallback + 13;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Circle(centerX=" + this.onExtraCallback + ", centerY=" + this.onNavigationEvent + ", radius=" + this.onExtraCallbackWithResult + ")";
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public Circle(float f, float f2, float f3) {
                this.onExtraCallback = f;
                this.onNavigationEvent = f2;
                this.onExtraCallbackWithResult = f3;
            }

            public final float onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onExtraCallback;
                int i5 = i2 + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }

            public final float onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onExtraCallbackWithResult;
                int i5 = i2 + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return f;
            }
        }
    }

    public final void setBlurStyle(@NotNull deprecated_secure deprecated_secureVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.asBinder = deprecated_secureVar.onTransact();
            this.asInterface = setByteOrder.onNavigationEvent(deprecated_secureVar.IAuthTabCallbackDefault());
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.asBinder = deprecated_secureVar.onTransact();
            this.asInterface = setByteOrder.onNavigationEvent(deprecated_secureVar.IAuthTabCallbackDefault());
            z = true;
        }
        this.access100 = z;
        invalidate();
    }

    public final void setOverlayColor(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onUnminimized + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallbackWithResult = num;
            invalidate();
            int i3 = ICustomTabsCallbackDefault + 61;
            onUnminimized = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.extraCallbackWithResult = num;
        invalidate();
        throw null;
    }

    public final void setProgressiveBlurSpec(@Nullable leaveBreadcrumb leavebreadcrumb) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        this.onActivityResized = leavebreadcrumb;
        this.access100 = true;
        invalidate();
        int i4 = onUnminimized + 13;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRoundRectMask(float f) {
        int i = 2 % 2;
        this.readTypedObject = new MaskShape.RoundRect(f);
        invalidate();
        int i2 = onUnminimized + 5;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void setCircleMask(float f, float f2, float f3) {
        int i = 2 % 2;
        this.readTypedObject = new MaskShape.Circle(f, f2, f3);
        invalidate();
        int i2 = onUnminimized + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            this.readTypedObject = MaskShape.None.onWarmupCompleted;
            invalidate();
            int i3 = 14 / 0;
        } else {
            this.readTypedObject = MaskShape.None.onWarmupCompleted;
            invalidate();
        }
    }

    public final void setOnFirstFrameRenderedListener(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = function0;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8 A[PHI: r0
      0x01f8: PHI (r0v11 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r0v10 kotlin.jvm.functions.Function0<kotlin.Unit>), (r0v12 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:48:0x01f6, B:45:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = onUnminimized + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            int i4 = ICustomTabsCallbackDefault + 13;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            Object parent = getParent();
            Object obj = null;
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                int i6 = onUnminimized + 99;
                ICustomTabsCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    boolean z = view.getParent() instanceof ViewGroup;
                    throw null;
                }
                ViewParent parent2 = view.getParent();
                ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.getLocationInWindow(this.IAuthTabCallback);
                    view.getLocationInWindow(this.onExtraCallbackWithResult);
                    int[] iArr = this.onExtraCallbackWithResult;
                    int i7 = iArr[0];
                    int[] iArr2 = this.IAuthTabCallback;
                    int i8 = i7 - iArr2[0];
                    int i9 = iArr[1] - iArr2[1];
                    this.onPostMessage.setPosition(0, 0, getWidth(), getHeight());
                    RecordingCanvas recordingCanvasBeginRecording = this.onPostMessage.beginRecording(getWidth(), getHeight());
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "");
                    recordingCanvasBeginRecording.translate(-i8, -i9);
                    this.onTransact.set(i8, i9, view.getWidth() + i8, view.getHeight() + i9);
                    recordingCanvasBeginRecording.clipRect(this.onTransact);
                    onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1148705193, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, recordingCanvasBeginRecording, viewGroup, view}, 1148705193);
                    this.onPostMessage.endRecording();
                    onExtraCallback();
                    this.IAuthTabCallback_Parcel.setPosition(0, 0, getWidth(), getHeight());
                    RecordingCanvas recordingCanvasBeginRecording2 = this.IAuthTabCallback_Parcel.beginRecording(getWidth(), getHeight());
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording2, "");
                    int size = this.writeTypedObject.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        int i11 = ICustomTabsCallbackDefault + 95;
                        onUnminimized = i11 % 128;
                        int i12 = i11 % 2;
                        LayerPlan layerPlan = this.writeTypedObject.get(i10);
                        Intrinsics.checkNotNullExpressionValue(layerPlan, "");
                        LayerPlan layerPlan2 = layerPlan;
                        RenderNode renderNode = this.access000.get(i10);
                        Intrinsics.checkNotNullExpressionValue(renderNode, "");
                        RenderNode renderNodeRs_ = getSslSocketFactoryOrNullokhttp.rs_(renderNode);
                        renderNodeRs_.setPosition(0, 0, getWidth(), getHeight());
                        renderNodeRs_.setRenderEffect((RenderEffect) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1233862267, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, Float.valueOf(layerPlan2.IAuthTabCallback())}, -1233862266));
                        RecordingCanvas recordingCanvasBeginRecording3 = renderNodeRs_.beginRecording(getWidth(), getHeight());
                        Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording3, "");
                        recordingCanvasBeginRecording3.drawRenderNode(this.onPostMessage);
                        renderNodeRs_.endRecording();
                        int iSave = recordingCanvasBeginRecording2.save();
                        try {
                            onNavigationEvent(recordingCanvasBeginRecording2, layerPlan2.onNavigationEvent());
                            recordingCanvasBeginRecording2.drawRenderNode(renderNodeRs_);
                            recordingCanvasBeginRecording2.restoreToCount(iSave);
                        } catch (Throwable th) {
                            recordingCanvasBeginRecording2.restoreToCount(iSave);
                            throw th;
                        }
                    }
                    setByteOrder setbyteorder = this.asInterface;
                    if (setbyteorder != null) {
                        int i13 = onUnminimized + 31;
                        ICustomTabsCallbackDefault = i13 % 128;
                        if (i13 % 2 == 0) {
                            recordingCanvasBeginRecording2.drawColor(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorder.access100()));
                            obj.hashCode();
                            throw null;
                        }
                        recordingCanvasBeginRecording2.drawColor(ByteOrderedDataOutputStream.onNavigationEvent(setbyteorder.access100()));
                    }
                    Integer num = this.extraCallbackWithResult;
                    if (num != null) {
                        recordingCanvasBeginRecording2.drawColor(num.intValue());
                    }
                    this.IAuthTabCallback_Parcel.endRecording();
                    if (this.writeTypedObject.size() > 1) {
                        this.IAuthTabCallback_Parcel.setRenderEffect(rI_());
                    } else {
                        this.IAuthTabCallback_Parcel.setRenderEffect(null);
                    }
                    int iSave2 = canvas.save();
                    onNavigationEvent(canvas);
                    canvas.drawRenderNode(this.IAuthTabCallback_Parcel);
                    canvas.restoreToCount(iSave2);
                    if (!this.getInterfaceDescriptor) {
                        int i14 = ICustomTabsCallbackDefault + 79;
                        onUnminimized = i14 % 128;
                        if (i14 % 2 != 0) {
                            this.getInterfaceDescriptor = true;
                            function0 = this.extraCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            this.getInterfaceDescriptor = true;
                            function0 = this.extraCallback;
                            if (function0 != null) {
                            }
                        }
                    }
                }
            }
        }
        int i15 = onUnminimized + 49;
        ICustomTabsCallbackDefault = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onUnminimized + 119;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            super.onSizeChanged(i, i2, i3, i4);
            int i7 = 39 / 0;
            if (i == i3) {
                if (i2 == i4) {
                    int i8 = ICustomTabsCallbackDefault + 107;
                    onUnminimized = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 56 / 0;
                        return;
                    }
                    return;
                }
            }
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            if (i == i3) {
            }
        }
        this.access100 = true;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (this.access100) {
            this.access100 = false;
            this.writeTypedObject.clear();
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.asBinder, 0.0f);
            leaveBreadcrumb leavebreadcrumb = this.onActivityResized;
            if (fCoerceAtLeast <= 0.0f || leavebreadcrumb == null) {
                this.writeTypedObject.add(new LayerPlan(LayerClip.None.IAuthTabCallback, fCoerceAtLeast));
                onExtraCallbackWithResult(this.writeTypedObject.size());
                return;
            }
            int i4 = onUnminimized + 47;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int iCoerceIn = RangesKt___RangesKt.coerceIn(this.onNavigationEvent + RangesKt___RangesKt.coerceIn(getCurrentBacktraceOrBuilderList.onNavigationEvent(fCoerceAtLeast / 6.0f), 0, 8), 12, 28);
            if (leavebreadcrumb instanceof leaveBreadcrumb.onExtraCallback) {
                Object[] objArr = {this, (leaveBreadcrumb.onExtraCallback) leavebreadcrumb, Float.valueOf(fCoerceAtLeast), Integer.valueOf(iCoerceIn)};
                onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1943704721, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 1943704723);
            } else {
                if (!(leavebreadcrumb instanceof leaveBreadcrumb.onWarmupCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = ICustomTabsCallbackDefault + 87;
                onUnminimized = i6 % 128;
                if (i6 % 2 != 0) {
                    IAuthTabCallback((leaveBreadcrumb.onWarmupCompleted) leavebreadcrumb, fCoerceAtLeast, iCoerceIn);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IAuthTabCallback((leaveBreadcrumb.onWarmupCompleted) leavebreadcrumb, fCoerceAtLeast, iCoerceIn);
            }
            if (this.writeTypedObject.isEmpty()) {
                this.writeTypedObject.add(new LayerPlan(LayerClip.None.IAuthTabCallback, fCoerceAtLeast));
            }
            onExtraCallbackWithResult(this.writeTypedObject.size());
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 0;
        RenderEffectBlurView renderEffectBlurView = (RenderEffectBlurView) objArr[0];
        leaveBreadcrumb.onExtraCallback onextracallback = (leaveBreadcrumb.onExtraCallback) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        float fOnNavigationEvent = renderEffectBlurView.onNavigationEvent(onextracallback.onExtraCallback(), renderEffectBlurView.getWidth());
        float fOnNavigationEvent2 = renderEffectBlurView.onNavigationEvent(onextracallback.onNavigationEvent(), renderEffectBlurView.getHeight());
        float fOnNavigationEvent3 = renderEffectBlurView.onNavigationEvent(onextracallback.onWarmupCompleted(), renderEffectBlurView.getWidth()) - fOnNavigationEvent;
        float fOnNavigationEvent4 = renderEffectBlurView.onNavigationEvent(onextracallback.onExtraCallbackWithResult(), renderEffectBlurView.getHeight()) - fOnNavigationEvent2;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((float) Math.hypot(fOnNavigationEvent3, fOnNavigationEvent4), 1.0f);
        float f = fOnNavigationEvent3 / fCoerceAtLeast;
        float f2 = fOnNavigationEvent4 / fCoerceAtLeast;
        float[] fArr = {renderEffectBlurView.onExtraCallback(0.0f, 0.0f, fOnNavigationEvent, fOnNavigationEvent2, f, f2), renderEffectBlurView.onExtraCallback(renderEffectBlurView.getWidth(), 0.0f, fOnNavigationEvent, fOnNavigationEvent2, f, f2), renderEffectBlurView.onExtraCallback(renderEffectBlurView.getWidth(), renderEffectBlurView.getHeight(), fOnNavigationEvent, fOnNavigationEvent2, f, f2), renderEffectBlurView.onExtraCallback(0.0f, renderEffectBlurView.getHeight(), fOnNavigationEvent, fOnNavigationEvent2, f, f2)};
        float fMin = fArr[0];
        float fMax = fMin;
        int i3 = 1;
        while (i3 < 4) {
            int i4 = ICustomTabsCallbackDefault + 107;
            onUnminimized = i4 % 128;
            if (i4 % 2 != 0) {
                fMin = Math.min(fMin, fArr[i3]);
                fMax = Math.max(fMax, fArr[i3]);
                i3 += 64;
            } else {
                fMin = Math.min(fMin, fArr[i3]);
                fMax = Math.max(fMax, fArr[i3]);
                i3++;
            }
        }
        if (fCoerceAtLeast <= 0.0f) {
            renderEffectBlurView.writeTypedObject.add(new LayerPlan(LayerClip.None.IAuthTabCallback, fFloatValue));
            return null;
        }
        float fCoerceIn = RangesKt___RangesKt.coerceIn(onextracallback.IAuthTabCallback().getInterpolation(0.0f), 0.0f, 1.0f);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(onextracallback.IAuthTabCallback().getInterpolation(1.0f), 0.0f, 1.0f) * fFloatValue;
        if (fMin < 0.0f) {
            renderEffectBlurView.writeTypedObject.add(new LayerPlan(new LayerClip.LinearBand(fOnNavigationEvent, fOnNavigationEvent2, f, f2, fMin, 0.0f), fCoerceIn * fFloatValue));
        }
        float[] fArrIAuthTabCallback = renderEffectBlurView.IAuthTabCallback(onextracallback.IAuthTabCallback());
        float f3 = fArrIAuthTabCallback[0];
        int length = fArrIAuthTabCallback.length;
        float f4 = f3;
        for (int i5 = 1; i5 < length; i5++) {
            float f5 = fArrIAuthTabCallback[i5];
            if (f5 < f4) {
                int i6 = onUnminimized + 65;
                ICustomTabsCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                f4 = f5;
            }
            if (f5 > f3) {
                int i8 = ICustomTabsCallbackDefault + 97;
                onUnminimized = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 30 / 0;
                }
                f3 = f5;
            }
        }
        float f6 = f3 - f4;
        if (f6 < 1.0E-4f) {
            renderEffectBlurView.writeTypedObject.add(new LayerPlan(new LayerClip.LinearBand(fOnNavigationEvent, fOnNavigationEvent2, f, f2, 0.0f, fCoerceAtLeast), fFloatValue * f4));
        } else {
            while (i < iIntValue) {
                float f7 = iIntValue;
                float f8 = i / f7;
                int i10 = i + 1;
                float f9 = i10 / f7;
                float f10 = fCoerceIn2;
                float f11 = fFloatValue;
                float fPow = (((float) Math.pow(f8, 1.0d)) * f6) + f4;
                float f12 = fMax;
                float fPow2 = f4 + (((float) Math.pow(f9, 1.0d)) * f6);
                float fIAuthTabCallback = renderEffectBlurView.IAuthTabCallback(fArrIAuthTabCallback, fPow) * fCoerceAtLeast;
                float fIAuthTabCallback2 = renderEffectBlurView.IAuthTabCallback(fArrIAuthTabCallback, fPow2) * fCoerceAtLeast;
                float fMin2 = Math.min(fIAuthTabCallback, fIAuthTabCallback2);
                float fMax2 = Math.max(fIAuthTabCallback, fIAuthTabCallback2);
                if (fMax2 - fMin2 >= 0.5f) {
                    if (i > 0) {
                        fMin2 -= 3.0f;
                    }
                    float f13 = fMin2;
                    if (i < iIntValue - 1) {
                        int i11 = ICustomTabsCallbackDefault + 3;
                        onUnminimized = i11 % 128;
                        fMax2 = i11 % 2 != 0 ? fMax2 * 3.0f : fMax2 + 3.0f;
                    }
                    renderEffectBlurView.writeTypedObject.add(new LayerPlan(new LayerClip.LinearBand(fOnNavigationEvent, fOnNavigationEvent2, f, f2, f13, fMax2), (f11 * (fPow + fPow2)) / 2.0f));
                }
                fMax = f12;
                fCoerceIn2 = f10;
                i = i10;
                fFloatValue = f11;
            }
        }
        float f14 = fCoerceIn2;
        float f15 = fMax;
        int i12 = ICustomTabsCallbackDefault + 41;
        onUnminimized = i12 % 128;
        int i13 = i12 % 2;
        if (f15 <= fCoerceAtLeast) {
            return null;
        }
        renderEffectBlurView.writeTypedObject.add(new LayerPlan(new LayerClip.LinearBand(fOnNavigationEvent, fOnNavigationEvent2, f, f2, fCoerceAtLeast, f15), f14));
        return null;
    }

    private final void IAuthTabCallback(leaveBreadcrumb.onWarmupCompleted onwarmupcompleted, float f, int i) {
        char c;
        int i2 = 2 % 2;
        float fOnNavigationEvent = onNavigationEvent(onwarmupcompleted.onExtraCallback(), getWidth());
        float fOnNavigationEvent2 = onNavigationEvent(onwarmupcompleted.onWarmupCompleted(), getHeight());
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(onExtraCallback(onwarmupcompleted.onNavigationEvent()), 1.0f);
        float[] fArrIAuthTabCallback = IAuthTabCallback(onwarmupcompleted.IAuthTabCallback());
        int i3 = 0;
        float f2 = fArrIAuthTabCallback[0];
        int length = fArrIAuthTabCallback.length;
        float f3 = f2;
        for (int i4 = 1; i4 < length; i4++) {
            float f4 = fArrIAuthTabCallback[i4];
            if (f4 < f3) {
                f3 = f4;
            }
            if (f4 > f2) {
                f2 = f4;
            }
        }
        float f5 = f2 - f3;
        if (f5 < 1.0E-4f) {
            this.writeTypedObject.add(new LayerPlan(new LayerClip.RadialBand(fOnNavigationEvent, fOnNavigationEvent2, 0.0f, fCoerceAtLeast), f * f3));
            int i5 = ICustomTabsCallbackDefault + 123;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        while (i3 < i) {
            float f6 = i;
            float f7 = i3 / f6;
            int i7 = i3 + 1;
            float f8 = i7 / f6;
            float f9 = fOnNavigationEvent;
            float fPow = (((float) Math.pow(f7, 1.0d)) * f5) + f3;
            float fPow2 = (((float) Math.pow(f8, 1.0d)) * f5) + f3;
            fArrIAuthTabCallback = fArrIAuthTabCallback;
            float fIAuthTabCallback = (1.0f - IAuthTabCallback(fArrIAuthTabCallback, fPow)) * fCoerceAtLeast;
            float fIAuthTabCallback2 = (1.0f - IAuthTabCallback(fArrIAuthTabCallback, fPow2)) * fCoerceAtLeast;
            float fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(Math.min(fIAuthTabCallback, fIAuthTabCallback2), 0.0f);
            float fMax = Math.max(fIAuthTabCallback, fIAuthTabCallback2);
            if (fMax - fCoerceAtLeast2 >= 0.5f) {
                int i8 = ICustomTabsCallbackDefault + 55;
                onUnminimized = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                if (i3 > 0) {
                    fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fCoerceAtLeast2 - 3.0f, 0.0f);
                }
                if (i3 < i - 1) {
                    int i9 = onUnminimized + 91;
                    ICustomTabsCallbackDefault = i9 % 128;
                    c = 2;
                    int i10 = i9 % 2;
                    fMax += 3.0f;
                } else {
                    c = 2;
                }
                this.writeTypedObject.add(new LayerPlan(new LayerClip.RadialBand(f9, fOnNavigationEvent2, fCoerceAtLeast2, fMax), ((fPow + fPow2) * f) / 2.0f));
            } else {
                c = 2;
            }
            fOnNavigationEvent = f9;
            i3 = i7;
        }
    }

    private final void onNavigationEvent(Canvas canvas, LayerClip layerClip) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(layerClip, LayerClip.None.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(layerClip, LayerClip.None.IAuthTabCallback)) {
            return;
        }
        if (!(layerClip instanceof LayerClip.LinearBand)) {
            if (!(layerClip instanceof LayerClip.RadialBand)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = ICustomTabsCallbackDefault + 31;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            this.onMinimized.reset();
            LayerClip.RadialBand radialBand = (LayerClip.RadialBand) layerClip;
            this.onMinimized.addCircle(radialBand.onWarmupCompleted(), radialBand.onExtraCallbackWithResult(), RangesKt___RangesKt.coerceAtLeast(radialBand.IAuthTabCallback(), 0.0f), Path.Direction.CW);
            if (radialBand.onNavigationEvent() > 0.0f) {
                this.onMinimized.addCircle(radialBand.onWarmupCompleted(), radialBand.onExtraCallbackWithResult(), radialBand.onNavigationEvent(), Path.Direction.CCW);
            }
            canvas.clipPath(this.onMinimized);
            return;
        }
        int i5 = ICustomTabsCallbackDefault + 23;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        float fHypot = (((float) Math.hypot(getWidth(), getHeight())) * 2.0f) + 1.0f;
        LayerClip.LinearBand linearBand = (LayerClip.LinearBand) layerClip;
        float fOnWarmupCompleted = linearBand.onWarmupCompleted() + (linearBand.IAuthTabCallback() * linearBand.onNavigationEvent());
        float fOnExtraCallback = linearBand.onExtraCallback() + (linearBand.onExtraCallbackWithResult() * linearBand.onNavigationEvent());
        float fOnWarmupCompleted2 = linearBand.onWarmupCompleted() + (linearBand.IAuthTabCallback() * linearBand.IAuthTabCallbackStub());
        float fOnExtraCallback2 = linearBand.onExtraCallback() + (linearBand.onExtraCallbackWithResult() * linearBand.IAuthTabCallbackStub());
        float f = (-linearBand.onExtraCallbackWithResult()) * fHypot;
        float fIAuthTabCallback = linearBand.IAuthTabCallback() * fHypot;
        this.ICustomTabsCallback.reset();
        this.ICustomTabsCallback.moveTo(fOnWarmupCompleted + f, fOnExtraCallback + fIAuthTabCallback);
        this.ICustomTabsCallback.lineTo(fOnWarmupCompleted - f, fOnExtraCallback - fIAuthTabCallback);
        this.ICustomTabsCallback.lineTo(fOnWarmupCompleted2 - f, fOnExtraCallback2 - fIAuthTabCallback);
        this.ICustomTabsCallback.lineTo(fOnWarmupCompleted2 + f, fOnExtraCallback2 + fIAuthTabCallback);
        this.ICustomTabsCallback.close();
        canvas.clipPath(this.ICustomTabsCallback);
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        while (this.access000.size() < i) {
            ArrayList<RenderNode> arrayList = this.access000;
            ycx$.ExternalSyntheticApiModelOutline0.m();
            arrayList.add(setSubtitleTextColor.et_("TDS_RENDER_EFFECT_BLUR_LAYER_" + this.access000.size()));
            int i3 = ICustomTabsCallbackDefault + 15;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = ICustomTabsCallbackDefault + 85;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(Canvas canvas) {
        int i = 2 % 2;
        MaskShape maskShape = this.readTypedObject;
        if (Intrinsics.areEqual(maskShape, MaskShape.None.onWarmupCompleted)) {
            return;
        }
        if (maskShape instanceof MaskShape.RoundRect) {
            this.IAuthTabCallbackDefault.reset();
            this.IAuthTabCallbackStub.set(0.0f, 0.0f, getWidth(), getHeight());
            MaskShape.RoundRect roundRect = (MaskShape.RoundRect) maskShape;
            this.IAuthTabCallbackDefault.addRoundRect(this.IAuthTabCallbackStub, roundRect.onWarmupCompleted(), roundRect.onWarmupCompleted(), Path.Direction.CW);
            canvas.clipPath(this.IAuthTabCallbackDefault);
            int i2 = onUnminimized + 115;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (maskShape instanceof MaskShape.Circle) {
            int i3 = onUnminimized + 1;
            ICustomTabsCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                this.IAuthTabCallbackDefault.reset();
                MaskShape.Circle circle = (MaskShape.Circle) maskShape;
                this.IAuthTabCallbackDefault.addCircle(circle.onExtraCallbackWithResult(), circle.onExtraCallback(), circle.onWarmupCompleted(), Path.Direction.CW);
                canvas.clipPath(this.IAuthTabCallbackDefault);
                return;
            }
            this.IAuthTabCallbackDefault.reset();
            MaskShape.Circle circle2 = (MaskShape.Circle) maskShape;
            this.IAuthTabCallbackDefault.addCircle(circle2.onExtraCallbackWithResult(), circle2.onExtraCallback(), circle2.onWarmupCompleted(), Path.Direction.CW);
            canvas.clipPath(this.IAuthTabCallbackDefault);
            throw null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Drawable background;
        View view;
        int i = 0;
        RenderEffectBlurView renderEffectBlurView = (RenderEffectBlurView) objArr[0];
        Canvas canvas = (Canvas) objArr[1];
        View view2 = (View) objArr[2];
        View view3 = (View) objArr[3];
        int i2 = 2 % 2;
        renderEffectBlurView.onMessageChannelReady.clear();
        while (true) {
            Object obj = null;
            if (view2 == null) {
                int iSave = canvas.save();
                Iterator<Pair<View, View>> it = renderEffectBlurView.onMessageChannelReady.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Pair<View, View> next = it.next();
                    View first = next.getFirst();
                    View second = next.getSecond();
                    first.getLocationInWindow(renderEffectBlurView.onExtraCallback);
                    int[] iArr = renderEffectBlurView.onExtraCallback;
                    int i4 = iArr[i];
                    int[] iArr2 = renderEffectBlurView.IAuthTabCallback;
                    float f = i4 - iArr2[i];
                    float f2 = iArr[1] - iArr2[1];
                    int iSave2 = canvas.save();
                    canvas.translate(f, f2);
                    if ((i3 > 0 || first.getBackground() != null) && (background = first.getBackground()) != null) {
                        int i5 = ICustomTabsCallbackDefault + 115;
                        onUnminimized = i5 % 128;
                        int i6 = i5 % 2;
                        background.setBounds(i, i, first.getWidth(), first.getHeight());
                        background.draw(canvas);
                    }
                    if (first instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) first;
                        int iIndexOfChild = viewGroup.indexOfChild(second);
                        for (int i7 = i; i7 < iIndexOfChild; i7++) {
                            int i8 = onUnminimized + 107;
                            ICustomTabsCallbackDefault = i8 % 128;
                            int i9 = i8 % 2;
                            View childAt = viewGroup.getChildAt(i7);
                            Intrinsics.checkNotNull(childAt);
                            if (childAt.getVisibility() == 0 && childAt.getWidth() > 0) {
                                int i10 = ICustomTabsCallbackDefault + 79;
                                onUnminimized = i10 % 128;
                                int i11 = i10 % 2;
                                if (childAt.getHeight() > 0) {
                                    int i12 = onUnminimized + 59;
                                    ICustomTabsCallbackDefault = i12 % 128;
                                    int i13 = i12 % 2;
                                    int iSave3 = canvas.save();
                                    canvas.translate(childAt.getLeft(), childAt.getTop());
                                    childAt.draw(canvas);
                                    canvas.restoreToCount(iSave3);
                                }
                            }
                        }
                    }
                    canvas.restoreToCount(iSave2);
                    i3++;
                    i = 0;
                }
                canvas.restoreToCount(iSave);
                int i14 = onUnminimized + 81;
                ICustomTabsCallbackDefault = i14 % 128;
                if (i14 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            renderEffectBlurView.onMessageChannelReady.addFirst(new Pair<>(view2, view3));
            Object parent = view2.getParent();
            if (parent instanceof View) {
                int i15 = ICustomTabsCallbackDefault + 115;
                onUnminimized = i15 % 128;
                if (i15 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                view = (View) parent;
            } else {
                view = null;
            }
            int i16 = ICustomTabsCallbackDefault + 125;
            onUnminimized = i16 % 128;
            int i17 = i16 % 2;
            View view4 = view;
            view3 = view2;
            view2 = view4;
        }
    }

    private final int onNavigationEvent() {
        int memoryClass;
        float refreshRate;
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float fCoerceIn = RangesKt___RangesKt.coerceIn((RangesKt___RangesKt.coerceAtLeast(displayMetrics.widthPixels, 1.0f) * RangesKt___RangesKt.coerceAtLeast(displayMetrics.heightPixels, 1.0f)) / 2592000.0f, 0.6f, 2.0f);
        Object systemService = getContext().getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn((RangesKt___RangesKt.coerceAtLeast(Runtime.getRuntime().availableProcessors(), 1) - 2) / 8.0f, 0.0f, 1.0f);
        if (activityManager != null) {
            int i2 = onUnminimized + 15;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                activityManager.getMemoryClass();
                throw null;
            }
            memoryClass = activityManager.getMemoryClass();
        } else {
            int i3 = ICustomTabsCallbackDefault + 49;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            memoryClass = 256;
        }
        float fCoerceIn3 = RangesKt___RangesKt.coerceIn((memoryClass - 128.0f) / 384.0f, 0.0f, 1.0f);
        float f = (activityManager == null || !activityManager.isLowRamDevice()) ? 0.0f : 0.35f;
        Display display = getDisplay();
        if (display != null) {
            int i5 = ICustomTabsCallbackDefault + 91;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = 60.0f;
        }
        return RangesKt___RangesKt.coerceIn(getCurrentBacktraceOrBuilderList.onNavigationEvent((RangesKt___RangesKt.coerceIn((RangesKt___RangesKt.coerceIn((((fCoerceIn2 * 0.45f) + (fCoerceIn3 * 0.4f)) + (RangesKt___RangesKt.coerceIn((refreshRate - 60.0f) / 60.0f, 0.0f, 1.0f) * 0.15f)) - f, 0.0f, 1.0f) * 0.65f) + (RangesKt___RangesKt.coerceIn((fCoerceIn - 0.6f) / 1.4f, 0.0f, 1.0f) * 0.35f), 0.0f, 1.0f) * 16.0f) + 12.0f), 12, 28);
    }

    private final float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onUnminimized + 93;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0 ? f <= 0.0f : f <= 0.0f) {
            return 0.0f;
        }
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(getWidth(), getHeight()), 1.0f);
        if (f > 1.0f) {
            return f;
        }
        int i3 = onUnminimized + 105;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return f * fCoerceAtLeast;
    }

    private final RenderEffect rI_() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 65;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        RenderEffect renderEffectCreateBlurEffect = this.IAuthTabCallbackStubProxy;
        if (renderEffectCreateBlurEffect == null) {
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(0.9f)), 0.5f);
            renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fCoerceAtLeast, fCoerceAtLeast, Shader.TileMode.CLAMP);
            this.IAuthTabCallbackStubProxy = renderEffectCreateBlurEffect;
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "");
            int i4 = onUnminimized + 75;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ICustomTabsCallbackDefault + 29;
        onUnminimized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 42 / 0;
        }
        return renderEffectCreateBlurEffect;
    }

    private final float[] IAuthTabCallback(Interpolator interpolator) {
        float[] fArr;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 9;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            fArr = new float[68];
            i = 1;
        } else {
            fArr = new float[65];
            i = 0;
        }
        while (i < 65) {
            int i4 = onUnminimized + 59;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                fArr[i] = RangesKt___RangesKt.coerceIn(interpolator.getInterpolation(i % 64.0f), 0.0f, 1.0f);
                i += 114;
            } else {
                fArr[i] = RangesKt___RangesKt.coerceIn(interpolator.getInterpolation(i / 64.0f), 0.0f, 1.0f);
                i++;
            }
        }
        return fArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v8 float, still in use, count: 2, list:
          (r5v8 float) from 0x004b: INVOKE (r5v8 float) STATIC call: java.lang.Math.abs(float):float A[MD:(float):float (c), WRAPPED] (LINE:599)
          (r5v8 float) from 0x0067: PHI (r5v7 float) = (r5v6 float), (r5v8 float) binds: [B:20:0x005b, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float IAuthTabCallback(float[] r10, float r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r10.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L70
            int r4 = im.toss.uikit.widget.gl.RenderEffectBlurView.ICustomTabsCallbackDefault
            int r4 = r4 + 25
            int r5 = r4 % 128
            im.toss.uikit.widget.gl.RenderEffectBlurView.onUnminimized = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L23
            r4 = r10[r3]
            r5 = r10[r3]
            float r6 = java.lang.Math.min(r4, r5)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L8
            r6 = r3
            goto L34
        L23:
            r4 = r10[r3]
            int r5 = r3 + 1
            r6 = r10[r5]
            float r7 = java.lang.Math.min(r4, r6)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L6e
            r8 = r6
            r6 = r5
            r5 = r8
        L34:
            float r7 = java.lang.Math.max(r4, r5)
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 > 0) goto L6c
            int r10 = im.toss.uikit.widget.gl.RenderEffectBlurView.onUnminimized
            int r10 = r10 + 15
            int r2 = r10 % 128
            im.toss.uikit.widget.gl.RenderEffectBlurView.ICustomTabsCallbackDefault = r2
            int r10 = r10 % r0
            r2 = 897988541(0x358637bd, float:1.0E-6)
            if (r10 != 0) goto L54
            float r5 = r5 + r4
            float r10 = java.lang.Math.abs(r5)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L67
            goto L5d
        L54:
            float r5 = r5 - r4
            float r10 = java.lang.Math.abs(r5)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L67
        L5d:
            int r10 = im.toss.uikit.widget.gl.RenderEffectBlurView.onUnminimized
            int r10 = r10 + 69
            int r11 = r10 % 128
            im.toss.uikit.widget.gl.RenderEffectBlurView.ICustomTabsCallbackDefault = r11
            int r10 = r10 % r0
            goto L88
        L67:
            float r11 = r11 - r4
            float r11 = r11 / r5
            float r10 = (float) r3
            float r10 = r10 + r11
            goto L89
        L6c:
            r3 = r6
            goto L8
        L6e:
            r3 = r5
            goto L8
        L70:
            int r0 = r10.length
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = r3
            r3 = r2
        L76:
            if (r2 >= r0) goto L88
            r5 = r10[r2]
            float r5 = r5 - r11
            float r5 = java.lang.Math.abs(r5)
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 >= 0) goto L85
            r3 = r2
            r4 = r5
        L85:
            int r2 = r2 + 1
            goto L76
        L88:
            float r10 = (float) r3
        L89:
            float r11 = (float) r1
            float r10 = r10 / r11
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.uikit.widget.gl.RenderEffectBlurView.IAuthTabCallback(float[], float):float");
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RenderEffectBlurView renderEffectBlurView = (RenderEffectBlurView) objArr[0];
        int i = 2 % 2;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(getCurrentBacktraceOrBuilderList.onNavigationEvent(((Number) objArr[1]).floatValue() * 100.0f), 0);
        Object obj = null;
        if (iCoerceAtLeast != 0) {
            HashMap<Integer, RenderEffect> map = renderEffectBlurView.onActivityLayout;
            Integer numValueOf = Integer.valueOf(iCoerceAtLeast);
            RenderEffect renderEffectCreateBlurEffect = map.get(numValueOf);
            if (renderEffectCreateBlurEffect == null) {
                float f = iCoerceAtLeast / 100.0f;
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
                map.put(numValueOf, renderEffectCreateBlurEffect);
            }
            RenderEffect renderEffectQH_ = isObject.qH_(renderEffectCreateBlurEffect);
            int i2 = ICustomTabsCallbackDefault + 53;
            onUnminimized = i2 % 128;
            if (i2 % 2 == 0) {
                return renderEffectQH_;
            }
            throw null;
        }
        int i3 = ICustomTabsCallbackDefault + 113;
        onUnminimized = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(leaveBreadcrumb.onExtraCallback onextracallback, float f, int i) {
        Object[] objArr = {this, onextracallback, Float.valueOf(f), Integer.valueOf(i)};
        onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1943704721, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 1943704723);
    }

    private final void onExtraCallbackWithResult(Canvas canvas, View view, View view2) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1148705193, iOnExtraCallback2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, canvas, view, view2}, 1148705193);
    }

    private final RenderEffect rJ_(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        return (RenderEffect) onWarmupCompleted(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1233862267, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr, -1233862266);
    }
}
