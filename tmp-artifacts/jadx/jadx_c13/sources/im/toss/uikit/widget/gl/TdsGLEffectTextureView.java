package im.toss.uikit.widget.gl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.uikit.widget.gl.TdsGLEffectTextureView$requestInitialInvalidateAfterFirstDraw$listener$1$;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AnimateAsStateKtExternalSyntheticLambda0;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.access15300;
import o.basic;
import o.deprecated_secure;
import o.findResAndMsg;
import o.formatMsgs;
import o.onLoadStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TdsGLEffectTextureView extends FrameLayout {
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int onMessageChannelReady = 1;
    private static int onMinimized;
    private static int onPostMessage;
    private Surface IAuthTabCallback;
    private final Function0<Unit> IAuthTabCallbackDefault;
    private deprecated_secure IAuthTabCallbackStub;
    private Function0<Unit> IAuthTabCallbackStubProxy;
    private Size IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private boolean access000;
    private final int[] access100;
    private boolean asBinder;
    private boolean asInterface;
    private final String extraCallback;
    private final TextureView extraCallbackWithResult;
    private Integer getInterfaceDescriptor;
    private final int[] onActivityLayout;
    private int onActivityResized;
    private final int onExtraCallback;
    private float onExtraCallbackWithResult;
    private boolean onTransact;
    private float onWarmupCompleted;
    private basic.onNavigationEvent readTypedObject;
    private float writeTypedObject;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.X.ordinal()] = 1;
                int i = onWarmupCompleted + 79;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.Y.ordinal()] = 2;
                int i3 = IAuthTabCallback + 125;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        int i = onMinimized + 29;
        ICustomTabsCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLEffectTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLEffectTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 5;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(tdsGLEffectTextureView);
        }
        IAuthTabCallbackStub(tdsGLEffectTextureView);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~i3) | i8;
        int i10 = i7 | (~i9);
        int i11 = i3 | i8;
        int i12 = ~(i9 | i4);
        int i13 = i5 + i4 + i6 + (1075552530 * i) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i5) - 1639710720) + ((-2116975300) * i4) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i6) + ((-189792256) * i) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i5 * 251836610) + 257048825 + (i4 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i6 * 251837547) + (i * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        TdsGLEffectTextureView tdsGLEffectTextureView = (TdsGLEffectTextureView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i18 = 2 % 2;
        int i19 = onPostMessage;
        int i20 = i19 + 41;
        onMessageChannelReady = i20 % 128;
        int i21 = i20 % 2;
        tdsGLEffectTextureView.onActivityResized = iIntValue;
        int i22 = i19 + 37;
        onMessageChannelReady = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TdsGLEffectTextureView tdsGLEffectTextureView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onPostMessage + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(tdsGLEffectTextureView, view, motionEvent);
        int i4 = onMessageChannelReady + 77;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    protected void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 103;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsGLEffectTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        TextureView textureView = new TextureView(context);
        textureView.setOpaque(false);
        textureView.setAlpha(0.0f);
        this.extraCallbackWithResult = textureView;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.extraCallback = string;
        this.IAuthTabCallbackStub = deprecated_secure.Companion.onExtraCallbackWithResult();
        this.onExtraCallback = 1;
        this.onActivityResized = 2;
        this.access100 = new int[2];
        this.onActivityLayout = new int[2];
        this.IAuthTabCallbackDefault = new Function0() { // from class: im.toss.uikit.widget.gl.TdsGLEffectTextureView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = TdsGLEffectTextureView.onExtraCallbackWithResult(this.f$0);
                int i5 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        };
        basic basicVar = basic.onExtraCallbackWithResult;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        basic.onExtraCallback(-1447607608, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 1447607609, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{basicVar, context}, iOnNavigationEvent);
        setTag(asBinder());
        setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.gl.TdsGLEffectTextureView$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 97;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                TdsGLEffectTextureView tdsGLEffectTextureView = this.f$0;
                if (i4 == 0) {
                    return TdsGLEffectTextureView.onWarmupCompleted(tdsGLEffectTextureView, view, motionEvent);
                }
                TdsGLEffectTextureView.onWarmupCompleted(tdsGLEffectTextureView, view, motionEvent);
                throw null;
            }
        });
        if (isAttachedToWindow()) {
            addView((TextureView) onNavigationEvent(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1122285846, -1122285845, TTVideoLandingPageActivity.onExtraCallbackWithResult()), new FrameLayout.LayoutParams(-1, -1));
            basicVar.IAuthTabCallback(onExtraCallback(), (Function0) onNavigationEvent(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -113639619, 113639621, TTVideoLandingPageActivity.onExtraCallbackWithResult()));
            ((TextureView) onNavigationEvent(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1122285846, -1122285845, TTVideoLandingPageActivity.onExtraCallbackWithResult())).setSurfaceTextureListener(new onExtraCallback());
            int i2 = onMessageChannelReady + 39;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 5;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            addOnAttachStateChangeListener(new asInterface(this, this));
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: im.toss.uikit.widget.gl.TdsGLEffectTextureView.4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 3;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                int i8 = IAuthTabCallback + 1;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 45;
                onNavigationEvent = i6 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(th));
                }
                if (i6 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(view, "");
                    TdsGLEffectTextureView tdsGLEffectTextureView = TdsGLEffectTextureView.this;
                    Result.Companion companion2 = Result.Companion;
                    basic.onExtraCallbackWithResult.onExtraCallbackWithResult(tdsGLEffectTextureView.onExtraCallback(), (Function0) TdsGLEffectTextureView.onNavigationEvent(new Object[]{tdsGLEffectTextureView}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -113639619, 113639621, TTVideoLandingPageActivity.onExtraCallbackWithResult()));
                    Result.m31constructorimpl(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(view, "");
                TdsGLEffectTextureView tdsGLEffectTextureView2 = TdsGLEffectTextureView.this;
                Result.Companion companion3 = Result.Companion;
                basic.onExtraCallbackWithResult.onExtraCallbackWithResult(tdsGLEffectTextureView2.onExtraCallback(), (Function0) TdsGLEffectTextureView.onNavigationEvent(new Object[]{tdsGLEffectTextureView2}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -113639619, 113639621, TTVideoLandingPageActivity.onExtraCallbackWithResult()));
                Result.m31constructorimpl(Unit.INSTANCE);
                TdsGLEffectTextureView tdsGLEffectTextureView3 = TdsGLEffectTextureView.this;
                try {
                    Result.Companion companion4 = Result.Companion;
                    basic.onExtraCallbackWithResult.onNavigationEvent(tdsGLEffectTextureView3.onExtraCallback());
                    Result.m31constructorimpl(Unit.INSTANCE);
                    int i7 = IAuthTabCallback + 85;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th2) {
                    Result.Companion companion5 = Result.Companion;
                    Result.m31constructorimpl(ResultKt.createFailure(th2));
                }
            }
        });
        int i5 = onPostMessage + 123;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsGLEffectTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onMessageChannelReady + 123;
            int i4 = i3 % 128;
            onPostMessage = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 19;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onMessageChannelReady;
            int i10 = i9 + 97;
            onPostMessage = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 105;
            onPostMessage = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Surface IAuthTabCallback(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 75;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        Surface surface = tdsGLEffectTextureView.IAuthTabCallback;
        int i5 = i2 + 63;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            return surface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int IAuthTabCallbackDefault(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 67;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tdsGLEffectTextureView.onActivityResized;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TdsGLEffectTextureView tdsGLEffectTextureView, Surface surface, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onMessageChannelReady + 113;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(new Object[]{tdsGLEffectTextureView, surface, Integer.valueOf(i), Integer.valueOf(i2)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 13989249, -13989245, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        int i6 = onPostMessage + 77;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(TdsGLEffectTextureView tdsGLEffectTextureView, boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        tdsGLEffectTextureView.IAuthTabCallback(z);
        int i4 = onPostMessage + 33;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onExtraCallback(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 79;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        boolean z = tdsGLEffectTextureView.access000;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        int i6 = i3 + 31;
        onMessageChannelReady = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsGLEffectTextureView tdsGLEffectTextureView, Surface surface) {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        tdsGLEffectTextureView.IAuthTabCallback = surface;
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = i3 + 87;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsGLEffectTextureView tdsGLEffectTextureView, boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        tdsGLEffectTextureView.onTransact = z;
        int i5 = i3 + 51;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Size onNavigationEvent(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Size size = tdsGLEffectTextureView.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return size;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsGLEffectTextureView tdsGLEffectTextureView = (TdsGLEffectTextureView) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 73;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = tdsGLEffectTextureView.IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return function0;
    }

    public static final /* synthetic */ void onNavigationEvent(TdsGLEffectTextureView tdsGLEffectTextureView, boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 61;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        tdsGLEffectTextureView.access000 = z;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        int i6 = i2 + 21;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
    }

    public static final /* synthetic */ void onTransact(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        tdsGLEffectTextureView.IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsGLEffectTextureView tdsGLEffectTextureView, Size size) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 91;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        tdsGLEffectTextureView.IAuthTabCallback_Parcel = size;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsGLEffectTextureView tdsGLEffectTextureView = (TdsGLEffectTextureView) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        TextureView textureView = tdsGLEffectTextureView.extraCallbackWithResult;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = i3 + 105;
        onPostMessage = i6 % 128;
        if (i6 % 2 == 0) {
            return textureView;
        }
        throw null;
    }

    public final void setOnFirstFrame(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStubProxy = function0;
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 67;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        String str = this.extraCallback;
        int i5 = i2 + 23;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final String asBinder() {
        int i = 2 % 2;
        String str = "TDS_EFFECT_VIEW_TAG:" + this.extraCallback;
        int i2 = onPostMessage + 75;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEffectStyle(@NotNull deprecated_secure deprecated_secureVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 113;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.IAuthTabCallbackStub = deprecated_secureVar;
            basic.onExtraCallbackWithResult.onWarmupCompleted(this.extraCallback, deprecated_secureVar);
        } else {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            this.IAuthTabCallbackStub = deprecated_secureVar;
            basic.onExtraCallbackWithResult.onWarmupCompleted(this.extraCallback, deprecated_secureVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setOverlayColor(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInterfaceDescriptor = num;
            basic.onExtraCallbackWithResult.onExtraCallback(this.extraCallback, num);
        } else {
            this.getInterfaceDescriptor = num;
            basic.onExtraCallbackWithResult.onExtraCallback(this.extraCallback, num);
            throw null;
        }
    }

    public final void setShaderEffectParams(@Nullable basic.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onPostMessage + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        this.readTypedObject = onnavigationevent;
        basic.onExtraCallbackWithResult.onExtraCallbackWithResult(this.extraCallback, onnavigationevent);
        int i4 = onPostMessage + 35;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 27;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 13;
        onPostMessage = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDraggable(boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 83;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = z;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        int i6 = i2 + 53;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements Runnable {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ TdsGLEffectTextureView onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        public IAuthTabCallbackDefault(View view, TdsGLEffectTextureView tdsGLEffectTextureView) {
            this.onWarmupCompleted = view;
            this.onNavigationEvent = tdsGLEffectTextureView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onNavigationEvent);
                obj.hashCode();
                throw null;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onNavigationEvent);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i3 = onExtraCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                    obj.hashCode();
                    throw null;
                }
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, this.onNavigationEvent.new onWarmupCompleted(null), 3, null);
                }
            }
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = TdsGLEffectTextureView.this.new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompleted.invokeSuspend(unit);
            }
            onwarmupcompleted.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                objOnExtraCallback = access14100.onExtraCallback();
                i = this.label;
                int i4 = 33 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(120L, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnExtraCallback = access14100.onExtraCallback();
                i = this.label;
                if (i != 0) {
                }
            }
            if (!TdsGLEffectTextureView.onExtraCallback(TdsGLEffectTextureView.this)) {
                TdsGLEffectTextureView.onNavigationEvent(TdsGLEffectTextureView.this, true);
                basic.onExtraCallbackWithResult.onExtraCallback();
                TdsGLEffectTextureView.onExtraCallback(TdsGLEffectTextureView.this, true);
                int i5 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub(TdsGLEffectTextureView tdsGLEffectTextureView) {
        int i = 2 % 2;
        AnimateAsStateKtExternalSyntheticLambda0.IAuthTabCallback(tdsGLEffectTextureView, new IAuthTabCallbackDefault(tdsGLEffectTextureView, tdsGLEffectTextureView));
        Unit unit = Unit.INSTANCE;
        int i2 = onPostMessage + 55;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class asInterface implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TdsGLEffectTextureView IAuthTabCallback;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public asInterface(View view, TdsGLEffectTextureView tdsGLEffectTextureView) {
            this.onNavigationEvent = view;
            this.IAuthTabCallback = tdsGLEffectTextureView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            TdsGLEffectTextureView tdsGLEffectTextureView = this.IAuthTabCallback;
            tdsGLEffectTextureView.addView((TextureView) TdsGLEffectTextureView.onNavigationEvent(new Object[]{tdsGLEffectTextureView}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1122285846, -1122285845, TTVideoLandingPageActivity.onExtraCallbackWithResult()), new FrameLayout.LayoutParams(-1, -1));
            basic.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback.onExtraCallback(), (Function0) TdsGLEffectTextureView.onNavigationEvent(new Object[]{this.IAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -113639619, 113639621, TTVideoLandingPageActivity.onExtraCallbackWithResult()));
            ((TextureView) TdsGLEffectTextureView.onNavigationEvent(new Object[]{this.IAuthTabCallback}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1122285846, -1122285845, TTVideoLandingPageActivity.onExtraCallbackWithResult())).setSurfaceTextureListener(this.IAuthTabCallback.new onExtraCallback());
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 0;
            }
        }
    }

    private static final boolean IAuthTabCallback(TdsGLEffectTextureView tdsGLEffectTextureView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 87;
        int i3 = i2 % 128;
        onPostMessage = i3;
        if (i2 % 2 == 0) {
            if (tdsGLEffectTextureView.asInterface) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    int i4 = onMessageChannelReady + 25;
                    onPostMessage = i4 % 128;
                    int i5 = i4 % 2;
                    if (actionMasked != 2) {
                        return false;
                    }
                    float f = tdsGLEffectTextureView.ICustomTabsCallback;
                    float rawX = motionEvent.getRawX();
                    float f2 = tdsGLEffectTextureView.onWarmupCompleted;
                    float f3 = tdsGLEffectTextureView.writeTypedObject;
                    float rawY = motionEvent.getRawY();
                    float f4 = tdsGLEffectTextureView.onExtraCallbackWithResult;
                    float f5 = (f + rawX) - f2;
                    tdsGLEffectTextureView.setTranslationX(((Float) onNavigationEvent(new Object[]{tdsGLEffectTextureView, Float.valueOf(f5), onNavigationEvent.X}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1923728984, -1923728984, TTVideoLandingPageActivity.onExtraCallbackWithResult())).floatValue());
                    tdsGLEffectTextureView.setTranslationY(((Float) onNavigationEvent(new Object[]{tdsGLEffectTextureView, Float.valueOf((f3 + rawY) - f4), onNavigationEvent.Y}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1923728984, -1923728984, TTVideoLandingPageActivity.onExtraCallbackWithResult())).floatValue());
                    tdsGLEffectTextureView.asInterface();
                    tdsGLEffectTextureView.invalidate();
                    basic.onExtraCallbackWithResult.onExtraCallback(tdsGLEffectTextureView.extraCallback);
                    return true;
                }
                tdsGLEffectTextureView.onWarmupCompleted = motionEvent.getRawX();
                tdsGLEffectTextureView.onExtraCallbackWithResult = motionEvent.getRawY();
                tdsGLEffectTextureView.ICustomTabsCallback = tdsGLEffectTextureView.getTranslationX();
                tdsGLEffectTextureView.writeTypedObject = tdsGLEffectTextureView.getTranslationY();
                return true;
            }
            int i6 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        boolean z = tdsGLEffectTextureView.asInterface;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements TextureView.SurfaceTextureListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallback() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            TdsGLEffectTextureView.onExtraCallback(TdsGLEffectTextureView.this, new Surface(surfaceTexture), i, i2);
            int i4 = onNavigationEvent + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(surfaceTexture, "");
                TdsGLEffectTextureView.onNavigationEvent(TdsGLEffectTextureView.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            Size sizeOnNavigationEvent = TdsGLEffectTextureView.onNavigationEvent(TdsGLEffectTextureView.this);
            if (sizeOnNavigationEvent != null && sizeOnNavigationEvent.getWidth() == i) {
                int i5 = onNavigationEvent + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (sizeOnNavigationEvent.getHeight() == i2) {
                    return;
                }
            }
            basic.onExtraCallbackWithResult.onNavigationEvent(TdsGLEffectTextureView.this.onExtraCallback());
            TdsGLEffectTextureView tdsGLEffectTextureView = TdsGLEffectTextureView.this;
            Surface surfaceIAuthTabCallback = TdsGLEffectTextureView.IAuthTabCallback(tdsGLEffectTextureView);
            if (surfaceIAuthTabCallback == null) {
                surfaceIAuthTabCallback = new Surface(surfaceTexture);
            }
            TdsGLEffectTextureView.onExtraCallback(tdsGLEffectTextureView, surfaceIAuthTabCallback, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            basic.onExtraCallbackWithResult.onNavigationEvent(TdsGLEffectTextureView.this.onExtraCallback());
            Surface surfaceIAuthTabCallback = TdsGLEffectTextureView.IAuthTabCallback(TdsGLEffectTextureView.this);
            if (surfaceIAuthTabCallback != null) {
                int i4 = onWarmupCompleted + 81;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                surfaceIAuthTabCallback.release();
            }
            TdsGLEffectTextureView.onExtraCallbackWithResult(TdsGLEffectTextureView.this, (Surface) null);
            TdsGLEffectTextureView.onWarmupCompleted(TdsGLEffectTextureView.this, (Size) null);
            TdsGLEffectTextureView.onTransact(TdsGLEffectTextureView.this);
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            TdsGLEffectTextureView.onExtraCallbackWithResult(TdsGLEffectTextureView.this, true);
            if (TdsGLEffectTextureView.IAuthTabCallbackDefault(TdsGLEffectTextureView.this) > 0) {
                int i4 = onWarmupCompleted + 15;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    TdsGLEffectTextureView.onNavigationEvent(new Object[]{TdsGLEffectTextureView.this, Integer.valueOf(TdsGLEffectTextureView.IAuthTabCallbackDefault(TdsGLEffectTextureView.this) - 1)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1264339610, 1264339613, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                } else {
                    TdsGLEffectTextureView.onNavigationEvent(new Object[]{TdsGLEffectTextureView.this, Integer.valueOf(TdsGLEffectTextureView.IAuthTabCallbackDefault(TdsGLEffectTextureView.this) - 1)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1264339610, 1264339613, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                }
                int i5 = onNavigationEvent + 97;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            TdsGLEffectTextureView.onNavigationEvent(TdsGLEffectTextureView.this, false, 1, null);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        float height;
        float height2;
        TdsGLEffectTextureView tdsGLEffectTextureView = (TdsGLEffectTextureView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[2];
        int i = 2 % 2;
        ViewParent parent = tdsGLEffectTextureView.getParent();
        if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) == null) {
            int i2 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            onMessageChannelReady = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return Float.valueOf(fFloatValue);
        }
        float f = tdsGLEffectTextureView.getResources().getDisplayMetrics().density * 48.0f;
        float fMin = Math.min(tdsGLEffectTextureView.getWidth() * 0.5f, f);
        float fMin2 = Math.min(tdsGLEffectTextureView.getHeight() * 0.5f, f);
        int i7 = onExtraCallbackWithResult.onExtraCallbackWithResult[onnavigationevent.ordinal()];
        if (i7 == 1) {
            return Float.valueOf(RangesKt___RangesKt.coerceIn(fFloatValue, ((-tdsGLEffectTextureView.getLeft()) - tdsGLEffectTextureView.getWidth()) + fMin, (r4.getWidth() - tdsGLEffectTextureView.getLeft()) - fMin));
        }
        int i8 = onMessageChannelReady;
        int i9 = i8 + 89;
        onPostMessage = i9 % 128;
        if (i9 % 2 == 0 ? i7 != 2 : i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = i8 + 29;
        onPostMessage = i10 % 128;
        if (i10 % 2 != 0) {
            height = ((-tdsGLEffectTextureView.getTop()) * tdsGLEffectTextureView.getHeight()) / fMin2;
            height2 = (r4.getHeight() >>> tdsGLEffectTextureView.getTop()) * fMin2;
        } else {
            height = ((-tdsGLEffectTextureView.getTop()) - tdsGLEffectTextureView.getHeight()) + fMin2;
            height2 = (r4.getHeight() - tdsGLEffectTextureView.getTop()) - fMin2;
        }
        return Float.valueOf(RangesKt___RangesKt.coerceIn(fFloatValue, height, height2));
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsGLEffectTextureView tdsGLEffectTextureView = (TdsGLEffectTextureView) objArr[0];
        Surface surface = (Surface) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        tdsGLEffectTextureView.IAuthTabCallbackStub();
        tdsGLEffectTextureView.IAuthTabCallback = surface;
        tdsGLEffectTextureView.IAuthTabCallback_Parcel = new Size(iIntValue, iIntValue2);
        basic basicVar = basic.onExtraCallbackWithResult;
        basicVar.IAuthTabCallback(tdsGLEffectTextureView.extraCallback, tdsGLEffectTextureView, surface, new Size(iIntValue, iIntValue2), tdsGLEffectTextureView.IAuthTabCallback(), tdsGLEffectTextureView.asBinder());
        basicVar.onWarmupCompleted(tdsGLEffectTextureView.extraCallback, tdsGLEffectTextureView.IAuthTabCallbackStub);
        basicVar.onExtraCallback(tdsGLEffectTextureView.extraCallback, tdsGLEffectTextureView.getInterfaceDescriptor);
        basic.onNavigationEvent onnavigationevent = tdsGLEffectTextureView.readTypedObject;
        Object obj = null;
        if (onnavigationevent != null) {
            int i2 = onMessageChannelReady + 33;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                basicVar.onExtraCallbackWithResult(tdsGLEffectTextureView.extraCallback, onnavigationevent);
                obj.hashCode();
                throw null;
            }
            basicVar.onExtraCallbackWithResult(tdsGLEffectTextureView.extraCallback, onnavigationevent);
            int i3 = onPostMessage + 51;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
        }
        tdsGLEffectTextureView.onExtraCallbackWithResult();
        tdsGLEffectTextureView.IAuthTabCallbackDefault();
        return null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onPostMessage + 51;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            this.extraCallbackWithResult.setAlpha(2.0f);
            this.asBinder = false;
            this.access000 = false;
            this.onActivityResized = 3;
            this.onTransact = true;
            return;
        }
        this.extraCallbackWithResult.setAlpha(0.0f);
        this.asBinder = false;
        this.access000 = false;
        this.onActivityResized = 2;
        this.onTransact = false;
    }

    static /* synthetic */ void onNavigationEvent(TdsGLEffectTextureView tdsGLEffectTextureView, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 55;
        int i4 = i3 % 128;
        onPostMessage = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeVisibleIfNeeded");
        }
        if ((i & 1) != 0) {
            int i5 = i4 + 17;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        tdsGLEffectTextureView.IAuthTabCallback(z);
        int i7 = onPostMessage + 15;
        onMessageChannelReady = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        if (!this.asBinder && !(!this.onTransact)) {
            if (!z) {
                int i2 = onMessageChannelReady + 79;
                onPostMessage = i2 % 128;
                int i3 = i2 % 2;
                if (this.onActivityResized <= 0) {
                    this.extraCallbackWithResult.setAlpha(1.0f);
                    this.asBinder = true;
                    Function0<Unit> function0 = this.IAuthTabCallbackStubProxy;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }
        int i4 = onMessageChannelReady + 45;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    public static final class asBinder implements ViewTreeObserver.OnPreDrawListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ViewTreeObserver IAuthTabCallback;

        public static /* synthetic */ void onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(j);
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
        }

        asBinder(ViewTreeObserver viewTreeObserver) {
            this.IAuthTabCallback = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.IAuthTabCallback.isAlive()) {
                int i4 = onExtraCallback + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.IAuthTabCallback.removeOnPreDrawListener(this);
            }
            Choreographer.getInstance().postFrameCallback(new TdsGLEffectTextureView$requestInitialInvalidateAfterFirstDraw$listener$1$.ExternalSyntheticLambda0());
            return true;
        }

        private static final void onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            basic.onExtraCallbackWithResult.onExtraCallback();
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void IAuthTabCallbackDefault() {
        ViewTreeObserver viewTreeObserver;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 25;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        View rootView = getRootView();
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new asBinder(viewTreeObserver));
        int i4 = onPostMessage + 17;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Iterator itIAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int i3 = onMessageChannelReady + 53;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            asInterface();
            super.dispatchDraw(canvas);
            itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
            i = 1;
        } else {
            asInterface();
            super.dispatchDraw(canvas);
            itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
            i = 0;
        }
        while (itIAuthTabCallback.hasNext()) {
            int i4 = onMessageChannelReady + 67;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                itIAuthTabCallback.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = itIAuthTabCallback.next();
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View view = (View) next;
            if (i != 0) {
                int i5 = onPostMessage + 63;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                view.draw(canvas);
                int i7 = onPostMessage + 13;
                onMessageChannelReady = i7 % 128;
                int i8 = i7 % 2;
            }
            i++;
            int i9 = onMessageChannelReady + 61;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v5 android.view.ViewParent) = (r1v4 android.view.ViewParent), (r1v13 android.view.ViewParent) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void asInterface() {
        ViewParent parent;
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 31;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            parent = getParent();
            int i3 = 78 / 0;
            if (parent instanceof ViewGroup) {
                int i4 = onMessageChannelReady + 29;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
        } else {
            parent = getParent();
            if (parent instanceof ViewGroup) {
            }
        }
        if (viewGroup == null) {
            int i6 = onPostMessage + 49;
            onMessageChannelReady = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        viewGroup.getLocationInWindow(this.access100);
        getLocationInWindow(this.onActivityLayout);
        basic basicVar = basic.onExtraCallbackWithResult;
        String str = this.extraCallback;
        int i7 = this.onActivityLayout[0];
        int[] iArr = this.access100;
        basicVar.onWarmupCompleted(str, i7 - iArr[0], r2[1] - iArr[1]);
    }

    public static /* synthetic */ void setShaderEffect$default(TdsGLEffectTextureView tdsGLEffectTextureView, String str, String str2, String str3, Float f, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShaderEffect");
        }
        int i3 = onPostMessage;
        int i4 = i3 + 83;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 57;
            onMessageChannelReady = i6 % 128;
            f = null;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
        tdsGLEffectTextureView.setShaderEffect(str, str2, str3, f);
    }

    public final void setShaderEffect(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        setShaderEffectParams(new basic.onNavigationEvent(str, str2, str3, (String) null, (String) null, f, 24, (DefaultConstructorMarker) null));
        int i2 = onMessageChannelReady + 67;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void setShaderEffectFromFile$default(TdsGLEffectTextureView tdsGLEffectTextureView, String str, String str2, String str3, Float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
        int i4 = i3 % 128;
        onMessageChannelReady = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShaderEffectFromFile");
        }
        int i5 = i4 + 21;
        int i6 = i5 % 128;
        onPostMessage = i6;
        if (i5 % 2 == 0 ? (i & 8) != 0 : (i & 44) != 0) {
            int i7 = i6 + 75;
            onMessageChannelReady = i7 % 128;
            int i8 = i7 % 2;
            f = null;
        }
        tdsGLEffectTextureView.setShaderEffectFromFile(str, str2, str3, f);
    }

    public final void setShaderEffectFromFile(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        setShaderEffectParams(new basic.onNavigationEvent(str, (String) null, (String) null, str2, str3, f, 6, (DefaultConstructorMarker) null));
        int i2 = onMessageChannelReady + 113;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOverlayColor(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 87;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        setOverlayColor(Integer.valueOf(i));
        int i5 = onPostMessage + 95;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setMaskRoundRect(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        basic basicVar = basic.onExtraCallbackWithResult;
        Object[] objArr = {basicVar, this.extraCallback, Float.valueOf(f)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        basic.onExtraCallback(-556633724, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 556633724, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, iOnNavigationEvent);
        basicVar.onExtraCallback(this.extraCallback);
        int i4 = onMessageChannelReady + Imgproc.COLOR_YUV2RGB_YVYU;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setMaskCircle(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        basic basicVar = basic.onExtraCallbackWithResult;
        basicVar.onNavigationEvent(this.extraCallback, f, f2, f3);
        basicVar.onExtraCallback(this.extraCallback);
        int i4 = onMessageChannelReady + 19;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            basic basicVar = basic.onExtraCallbackWithResult;
            basicVar.onExtraCallbackWithResult(this.extraCallback);
            basicVar.onExtraCallback(this.extraCallback);
        } else {
            basic basicVar2 = basic.onExtraCallbackWithResult;
            basicVar2.onExtraCallbackWithResult(this.extraCallback);
            basicVar2.onExtraCallback(this.extraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent X = new onNavigationEvent("X", 0);
        public static final onNavigationEvent Y = new onNavigationEvent("Y", 1);
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {X, Y};
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 107;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 31;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ Function0 onWarmupCompleted(TdsGLEffectTextureView tdsGLEffectTextureView) {
        return (Function0) onNavigationEvent(new Object[]{tdsGLEffectTextureView}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -113639619, 113639621, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private final void IAuthTabCallback(Surface surface, int i, int i2) {
        onNavigationEvent(new Object[]{this, surface, Integer.valueOf(i), Integer.valueOf(i2)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 13989249, -13989245, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    private final float onExtraCallbackWithResult(float f, onNavigationEvent onnavigationevent) {
        return ((Float) onNavigationEvent(new Object[]{this, Float.valueOf(f), onnavigationevent}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1923728984, -1923728984, TTVideoLandingPageActivity.onExtraCallbackWithResult())).floatValue();
    }

    public final TextureView onNavigationEvent() {
        return (TextureView) onNavigationEvent(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1122285846, -1122285845, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }
}
