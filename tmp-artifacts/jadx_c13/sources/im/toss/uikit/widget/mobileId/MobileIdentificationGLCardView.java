package im.toss.uikit.widget.mobileId;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$$ExternalSyntheticLambda10;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrPluginExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.M_;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.access15400;
import o.captureProcessErrorStatebugsnag_plugin_android_anr_release;
import o.findResAndMsg;
import o.hasVaryAll;
import o.onLoadStarted;
import o.readIntokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdentificationGLCardView extends GLSurfaceView {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final List<captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted> IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private captureProcessErrorStatebugsnag_plugin_android_anr_release onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileIdentificationGLCardView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(context);
            obj.hashCode();
            throw null;
        }
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i3 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return fOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(MobileIdentificationGLCardView mobileIdentificationGLCardView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(mobileIdentificationGLCardView, onextracallbackwithresult, f);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i3)) | i8;
        int i10 = ~i6;
        int i11 = ~i3;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i3 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i6 + i + ((-327997910) * i2) + ((-604038433) * i4);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i6) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i) + (36700160 * i2) + ((-297271296) * i4) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i6 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i * (-238134313)) + (i2 * (-1022231738)) + (i4 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        if (i21 == 1) {
            MobileIdentificationGLCardView mobileIdentificationGLCardView = (MobileIdentificationGLCardView) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            Bitmap bitmap2 = (Bitmap) objArr[2];
            Function0<Unit> function0 = (Function0) objArr[3];
            int i22 = 2 % 2;
            int i23 = asInterface + 19;
            onTransact = i23 % 128;
            int i24 = i23 % 2;
            mobileIdentificationGLCardView.IAuthTabCallback(bitmap, bitmap2, function0);
            int i25 = onTransact + 47;
            asInterface = i25 % 128;
            int i26 = i25 % 2;
            return null;
        }
        if (i21 == 2) {
            final MobileIdentificationGLCardView mobileIdentificationGLCardView2 = (MobileIdentificationGLCardView) objArr[0];
            final captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult = (captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult) objArr[1];
            final float fFloatValue = ((Number) objArr[2]).floatValue();
            int i27 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            mobileIdentificationGLCardView2.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // java.lang.Runnable
                public final void run() {
                    int i28 = 2 % 2;
                    int i29 = onExtraCallback + 47;
                    onNavigationEvent = i29 % 128;
                    if (i29 % 2 != 0) {
                        MobileIdentificationGLCardView.onExtraCallback(this.f$0, onextracallbackwithresult, fFloatValue);
                        int i30 = 7 / 0;
                    } else {
                        MobileIdentificationGLCardView.onExtraCallback(this.f$0, onextracallbackwithresult, fFloatValue);
                    }
                    int i31 = onNavigationEvent + 107;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                }
            });
            int i28 = onTransact + 103;
            asInterface = i28 % 128;
            int i29 = i28 % 2;
            return null;
        }
        if (i21 != 3) {
            return onExtraCallback(objArr);
        }
        MobileIdentificationGLCardView mobileIdentificationGLCardView3 = (MobileIdentificationGLCardView) objArr[0];
        Context context = (Context) objArr[1];
        int i30 = 2 % 2;
        int i31 = onTransact + 9;
        asInterface = i31 % 128;
        int i32 = i31 % 2;
        float fOnNavigationEvent = onNavigationEvent(mobileIdentificationGLCardView3, context);
        int i33 = onTransact + 55;
        asInterface = i33 % 128;
        int i34 = i33 % 2;
        return Float.valueOf(fOnNavigationEvent);
    }

    public static /* synthetic */ void onExtraCallback(MobileIdentificationGLCardView mobileIdentificationGLCardView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(mobileIdentificationGLCardView, onextracallbackwithresult, f);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(function0);
        }
        onWarmupCompleted(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(MobileIdentificationGLCardView mobileIdentificationGLCardView) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(mobileIdentificationGLCardView);
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ float onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnExtraCallback = onExtraCallback(context);
        int i3 = onTransact + 63;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return fOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdentificationGLCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new ArrayList();
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new MobileIdentificationGLCardView$.ExternalSyntheticLambda3(context));
        this.onNavigationEvent = M_.onExtraCallback.asInterface();
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new MobileIdentificationGLCardView$.ExternalSyntheticLambda4(this, context));
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new MobileIdentificationGLCardView$.ExternalSyntheticLambda5(context));
        IAuthTabCallback();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdentificationGLCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = asInterface + 51;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 33;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MobileIdentificationGLCardView mobileIdentificationGLCardView = (MobileIdentificationGLCardView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object value = mobileIdentificationGLCardView.onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            ((Number) value).floatValue();
            throw null;
        }
        float fFloatValue = ((Number) value).floatValue();
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static final float onExtraCallback(Context context) {
        int iIntValue;
        int i = 2 % 2;
        Activity activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
        WindowManager windowManager = null;
        if (activityOnExtraCallback != null) {
            int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                activityOnExtraCallback.getWindowManager();
                throw null;
            }
            windowManager = activityOnExtraCallback.getWindowManager();
        }
        if (windowManager == null) {
            int iIAuthTabCallbackDefault = M_.onExtraCallback.IAuthTabCallbackDefault();
            AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
            iIntValue = iIAuthTabCallbackDefault + ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue() + anrPluginExternalSyntheticLambda0.IAuthTabCallback();
        } else if (Build.VERSION.SDK_INT >= 30) {
            int i3 = onTransact + 71;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            iIntValue = displayMetrics.heightPixels;
            int i5 = asInterface + 63;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return iIntValue;
    }

    private final float onWarmupCompleted() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            fFloatValue = ((Number) this.onExtraCallback.getValue()).floatValue();
            int i3 = 11 / 0;
        } else {
            fFloatValue = ((Number) this.onExtraCallback.getValue()).floatValue();
        }
        int i4 = onTransact + 35;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(MobileIdentificationGLCardView mobileIdentificationGLCardView, Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mobileIdentificationGLCardView}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1969645151, 1969645151)).floatValue();
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        String string = context.getString(R.string.uikit_mobile_id_loading);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iAsInterface = M_.onExtraCallback.asInterface();
        DisplayMetrics displayMetrics = mobileIdentificationGLCardView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fIntValue = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1367378881, -1367378879, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0, context, string, Float.valueOf(28.0f), Integer.valueOf(iAsInterface - varyMatches.onNavigationEvent(48, displayMetrics))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        float fIntValue2 = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        Intrinsics.checkNotNullExpressionValue(mobileIdentificationGLCardView.getResources().getDisplayMetrics(), "");
        float fOnNavigationEvent = ((((fFloatValue - fIntValue) - fIntValue2) - varyMatches.onNavigationEvent(36, r14)) + anrPluginExternalSyntheticLambda0.IAuthTabCallback()) / 2.0f;
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return fOnNavigationEvent;
    }

    private final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.IAuthTabCallbackDefault.getValue()).floatValue();
            throw null;
        }
        float fFloatValue = ((Number) this.IAuthTabCallbackDefault.getValue()).floatValue();
        int i3 = asInterface + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return fFloatValue;
    }

    private static final float onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = AnrPluginExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(context);
        int i4 = onTransact + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        setZOrderOnTop(true);
        getHolder().setFormat(-3);
        setRenderer();
        setPreserveEGLContextOnPause(true);
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRenderer() {
        int i = 2 % 2;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = new captureProcessErrorStatebugsnag_plugin_android_anr_release(this, readIntokhttp.onExtraCallback(configuration));
        this.onWarmupCompleted = captureprocesserrorstatebugsnag_plugin_android_anr_release;
        setRenderer(captureprocesserrorstatebugsnag_plugin_android_anr_release);
        setRenderMode(0);
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Bitmap $resultBitmap;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Function0<Unit> function0, Bitmap bitmap, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$onComplete = function0;
            this.$resultBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = MobileIdentificationGLCardView.this.new onNavigationEvent(this.$onComplete, this.$resultBitmap, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 90 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationevent.invokeSuspend(unit);
            }
            onnavigationevent.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$onNavigationEvent$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Bitmap $resultBitmap;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Bitmap bitmap, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$resultBitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resultBitmap, access13800Var);
                int i2 = onExtraCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 97 / 0;
                }
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 62 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 87;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = onWarmupCompleted + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                Bitmap bitmap = this.$resultBitmap;
                int i4 = onWarmupCompleted + 23;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return bitmap;
                }
                throw null;
            }
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$onNavigationEvent$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            int label;
            final /* synthetic */ MobileIdentificationGLCardView this$0;
            private static final byte[] $$a = {68, -127, 122, -15};
            private static final int $$b = 73;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private static int onExtraCallbackWithResult = 478308957;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Type inference failed for: r8v2, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(int i, byte b, byte b2) {
                int i2;
                int i3;
                byte[] bArr = $$a;
                int i4 = i * 2;
                ?? r8 = (b2 * 4) + 105;
                int i5 = b + 4;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                if (bArr == null) {
                    byte b3 = r8;
                    int i7 = 0;
                    int i8 = i5;
                    int i9 = i5 + (-b3);
                    i2 = i7;
                    int i10 = i8;
                    i3 = i9;
                    i5 = i10;
                    bArr2[i2] = (byte) i3;
                    int i11 = i5 + 1;
                    i7 = i2 + 1;
                    if (i2 == i6) {
                        return new String(bArr2, 0);
                    }
                    b3 = bArr[i11];
                    int i12 = i3;
                    i8 = i11;
                    i5 = i12;
                    int i92 = i5 + (-b3);
                    i2 = i7;
                    int i102 = i8;
                    i3 = i92;
                    i5 = i102;
                    bArr2[i2] = (byte) i3;
                    int i112 = i5 + 1;
                    i7 = i2 + 1;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    i3 = r8;
                    bArr2[i2] = (byte) i3;
                    int i1122 = i5 + 1;
                    i7 = i2 + 1;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(MobileIdentificationGLCardView mobileIdentificationGLCardView, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationGLCardView;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 79;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Bitmap> access13800Var2 = access13800Var;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback(findresandmsg2, access13800Var2);
                }
                IAuthTabCallback(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
            
                if ((r1 % 2) == 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if (r4 != 1) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
            
                if (r4 != 1) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r13);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r13);
                r4 = r12.this$0;
                r12.label = 1;
                r3 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58, 10 - android.widget.ExpandableListView.getPackedPositionChild(0), new char[]{19, 5, 65486, 14, 2, 20, '\f', 65487, 17, 15, '\b', '\t', 21, 21, 17, 20, 65499, 65488, 65488, 20, 21, 2, 21, '\n', 4, 65487, 21, 16, 20, 20, 65487, '\n', 14, 65488, '\n', 25, 65488, 14, 16, 3, '\n', '\r', 6, 65517, '\n', 4, 6, 15, 20, 6, 65488, 19, 6, 2, '\r', 65486, 4, 2}, false, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 210, r3);
                r13 = o.generateInviteUrl.onExtraCallbackWithResult(r4, ((java.lang.String) r3[0]).intern(), null, null, r12, 6, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
            
                if (r13 != r1) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
            
                r13 = im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView.onNavigationEvent.AnonymousClass4.onWarmupCompleted + 49;
                im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView.onNavigationEvent.AnonymousClass4.onNavigationEvent = r13 % 128;
                r13 = r13 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            
                if (r4 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                r1 = im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView.onNavigationEvent.AnonymousClass4.onWarmupCompleted + 29;
                im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView.onNavigationEvent.AnonymousClass4.onNavigationEvent = r1 % 128;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnExtraCallback;
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 33;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    objOnExtraCallback = access14100.onExtraCallback();
                    i = this.label;
                    int i4 = 77 / 0;
                } else {
                    objOnExtraCallback = access14100.onExtraCallback();
                    i = this.label;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
                long j;
                Throwable cause;
                int i4 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    j = 0;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                        break;
                    }
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35125), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 55, 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    int i6 = $10 + 81;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (!(!z)) {
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 12842), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54, (-16775049) - Color.rgb(0, 0, 0), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        j = 0;
                    }
                    cArr2 = cArr4;
                }
                String str = new String(cArr2);
                int i8 = $11 + 99;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    int i9 = 0 / 0;
                    objArr[0] = str;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MobileIdentificationGLCardView mobileIdentificationGLCardView;
            MobileIdentificationGLCardView mobileIdentificationGLCardView2;
            Bitmap bitmap;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationGLCardView mobileIdentificationGLCardView3 = MobileIdentificationGLCardView.this;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass1(this.$resultBitmap, null), 3, null);
                this.L$0 = findresandmsg;
                this.L$1 = mobileIdentificationGLCardView3;
                this.label = 1;
                Object objIAuthTabCallback = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    mobileIdentificationGLCardView = mobileIdentificationGLCardView3;
                    obj = objIAuthTabCallback;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                int i3 = onExtraCallback + 119;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 3;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                bitmap = (Bitmap) this.L$2;
                mobileIdentificationGLCardView2 = (MobileIdentificationGLCardView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationGLCardView.onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mobileIdentificationGLCardView2, bitmap, (Bitmap) obj, this.$onComplete}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -884804872, 884804873);
                Unit unit = Unit.INSTANCE;
                int i8 = IAuthTabCallback + 107;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
            MobileIdentificationGLCardView mobileIdentificationGLCardView4 = (MobileIdentificationGLCardView) this.L$1;
            ResultKt.onNavigationEvent(obj);
            mobileIdentificationGLCardView = mobileIdentificationGLCardView4;
            Bitmap bitmap2 = (Bitmap) obj;
            GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass4(MobileIdentificationGLCardView.this, null), 3, null);
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = mobileIdentificationGLCardView;
            this.L$2 = bitmap2;
            this.label = 2;
            Object objIAuthTabCallback2 = geckoHubImp1OnWarmupCompleted2.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnExtraCallback) {
                mobileIdentificationGLCardView2 = mobileIdentificationGLCardView;
                bitmap = bitmap2;
                obj = objIAuthTabCallback2;
                MobileIdentificationGLCardView.onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mobileIdentificationGLCardView2, bitmap, (Bitmap) obj, this.$onComplete}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -884804872, 884804873);
                Unit unit2 = Unit.INSTANCE;
                int i82 = IAuthTabCallback + 107;
                onExtraCallback = i82 % 128;
                int i92 = i82 % 2;
                return unit2;
            }
            return objOnExtraCallback;
        }
    }

    public final void IAuthTabCallback(@NotNull Bitmap bitmap, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Object obj = null;
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new onNavigationEvent(function0, bitmap, null), 3, null);
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(Bitmap bitmap, Bitmap bitmap2, final Function0<Unit> function0) {
        int i = 2 % 2;
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewGroup.LayoutParams layoutParamsOnNavigationEvent = anrPluginExternalSyntheticLambda0.onNavigationEvent(context);
        float fOnNavigationEvent = this.onNavigationEvent * 3.0f * onNavigationEvent();
        float f = fOnNavigationEvent * 1.496f;
        this.IAuthTabCallback.add(new captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(bitmap, layoutParamsOnNavigationEvent.width * onNavigationEvent(), layoutParamsOnNavigationEvent.height * onNavigationEvent(), 0.0f, this.onNavigationEvent / 2.0f, onWarmupCompleted(), 0.0f, 0.0f, 0.0f, 0.0f, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.ID_CARD, 968, null));
        this.IAuthTabCallback.add(new captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(bitmap2, fOnNavigationEvent, f, 0.0f, this.onNavigationEvent / 2.0f, ((Float) onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1969645151, 1969645151)).floatValue() + (f / 2.0f), 0.0f, 0.0f, 0.0f, 0.0f, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.MASK_CARD, 968, null));
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = this.onWarmupCompleted;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult(this.IAuthTabCallback, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 9;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = MobileIdentificationGLCardView.onExtraCallbackWithResult(function0);
                    int i5 = IAuthTabCallback + 27;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
            int i2 = onTransact + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(MobileIdentificationGLCardView mobileIdentificationGLCardView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationGLCardView.onWarmupCompleted;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            int i5 = i2 + 19;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult(onextracallbackwithresult, f);
            if (i6 == 0) {
                int i7 = 26 / 0;
            }
        }
        int i8 = onTransact + 103;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void onExtraCallback(@NotNull final captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, final float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        queueEvent(new Runnable() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationGLCardView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    MobileIdentificationGLCardView.IAuthTabCallback(this.f$0, onextracallbackwithresult, f);
                    throw null;
                }
                MobileIdentificationGLCardView.IAuthTabCallback(this.f$0, onextracallbackwithresult, f);
                int i4 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onNavigationEvent(MobileIdentificationGLCardView mobileIdentificationGLCardView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationGLCardView.onWarmupCompleted;
        Object obj = null;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            int i2 = onTransact + 67;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onNavigationEvent(onextracallbackwithresult, f);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = asInterface + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(MobileIdentificationGLCardView mobileIdentificationGLCardView) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationGLCardView.onWarmupCompleted;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback();
            int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ float onWarmupCompleted(MobileIdentificationGLCardView mobileIdentificationGLCardView, Context context) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return ((Float) onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mobileIdentificationGLCardView, context}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -240286951, 240286954)).floatValue();
    }

    public static final /* synthetic */ void onExtraCallback(MobileIdentificationGLCardView mobileIdentificationGLCardView, Bitmap bitmap, Bitmap bitmap2, Function0 function0) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{mobileIdentificationGLCardView, bitmap, bitmap2, function0}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -884804872, 884804873);
    }

    private final float onExtraCallback() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback();
        return ((Float) onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), -1969645151, 1969645151)).floatValue();
    }

    public final void onExtraCallbackWithResult(@NotNull captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        onExtraCallback(WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this, onextracallbackwithresult, Float.valueOf(f)}, WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$$ExternalSyntheticLambda10.onExtraCallback(), 1425269998, -1425269996);
    }
}
