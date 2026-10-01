package im.toss.uikit.widget.mobileId;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$;
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
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrPluginExternalSyntheticLambda0;
import o.AnrPluginExternalSyntheticLambda1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.M_;
import o.access13800;
import o.access14100;
import o.access15400;
import o.captureProcessErrorStatebugsnag_plugin_android_anr_release;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.hasVaryAll;
import o.onLoadStarted;
import o.readIntokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdentificationHologramView extends GLSurfaceView {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallback;
    private final Lazy asInterface;
    private captureProcessErrorStatebugsnag_plugin_android_anr_release onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final List<captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileIdentificationHologramView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = onTransact + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = IAuthTabCallbackStub + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(MobileIdentificationHologramView mobileIdentificationHologramView) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(mobileIdentificationHologramView);
        int i4 = IAuthTabCallbackStub + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(MobileIdentificationHologramView mobileIdentificationHologramView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(mobileIdentificationHologramView, onextracallbackwithresult, f);
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MobileIdentificationHologramView mobileIdentificationHologramView = (MobileIdentificationHologramView) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(mobileIdentificationHologramView, context);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return Float.valueOf(fOnNavigationEvent);
    }

    public static /* synthetic */ void onExtraCallback(MobileIdentificationHologramView mobileIdentificationHologramView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(mobileIdentificationHologramView, onextracallbackwithresult, f);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onTransact + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(context);
            throw null;
        }
        float fOnExtraCallback = onExtraCallback(context);
        int i3 = IAuthTabCallbackStub + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return fOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~i5) | i8;
        int i10 = i7 | (~i9);
        int i11 = i5 | i8;
        int i12 = ~(i9 | i6);
        int i13 = i + i6 + i3 + (1075552530 * i4) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i3) + ((-189792256) * i4) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i3 * 251837547) + (i4 * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdentificationHologramView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new ArrayList();
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new MobileIdentificationHologramView$.ExternalSyntheticLambda1(context));
        this.onExtraCallbackWithResult = M_.onExtraCallback.asInterface();
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new MobileIdentificationHologramView$.ExternalSyntheticLambda2(this, context));
        this.asInterface = LazyKt__LazyJVMKt.lazy(new MobileIdentificationHologramView$.ExternalSyntheticLambda3(context));
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(new Object[]{this}, 827115306, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -827115303);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdentificationHologramView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact + 111;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MobileIdentificationHologramView mobileIdentificationHologramView = (MobileIdentificationHologramView) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        Bitmap bitmap2 = (Bitmap) objArr[2];
        Bitmap bitmap3 = (Bitmap) objArr[3];
        Function0<Unit> function0 = (Function0) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mobileIdentificationHologramView.onExtraCallbackWithResult(bitmap, bitmap2, bitmap3, function0);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onNavigationEvent.getValue()).floatValue();
        int i4 = IAuthTabCallbackStub + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return fFloatValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r9
      0x0020: PHI (r9v2 android.app.Activity) = (r9v1 android.app.Activity), (r9v19 android.app.Activity) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float onExtraCallback(Context context) {
        Activity activityOnExtraCallback;
        WindowManager windowManager;
        int iIntValue;
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
            int i3 = 32 / 0;
            if (activityOnExtraCallback != null) {
                int i4 = onTransact + 101;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    activityOnExtraCallback.getWindowManager();
                    obj.hashCode();
                    throw null;
                }
                windowManager = activityOnExtraCallback.getWindowManager();
            } else {
                windowManager = null;
            }
        } else {
            activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
            if (activityOnExtraCallback != null) {
            }
        }
        if (windowManager == null) {
            int iIAuthTabCallbackDefault = M_.onExtraCallback.IAuthTabCallbackDefault();
            AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
            iIntValue = iIAuthTabCallbackDefault + ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue() + anrPluginExternalSyntheticLambda0.IAuthTabCallback();
            int i5 = onTransact + 25;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else if (Build.VERSION.SDK_INT >= 30) {
            int i7 = onTransact + 99;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                windowManager.getCurrentWindowMetrics().getBounds().height();
                obj.hashCode();
                throw null;
            }
            iIntValue = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            iIntValue = displayMetrics.heightPixels;
        }
        return iIntValue;
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ((Number) this.IAuthTabCallback.getValue()).floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = ((Number) this.IAuthTabCallback.getValue()).floatValue();
        int i3 = IAuthTabCallbackStub + 41;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return fFloatValue;
    }

    private static final float onNavigationEvent(MobileIdentificationHologramView mobileIdentificationHologramView, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = mobileIdentificationHologramView.onWarmupCompleted();
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        String string = context.getString(R.string.uikit_mobile_id_loading);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iAsInterface = M_.onExtraCallback.asInterface();
        DisplayMetrics displayMetrics = mobileIdentificationHologramView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fIntValue = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1367378881, -1367378879, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0, context, string, Float.valueOf(28.0f), Integer.valueOf(iAsInterface - varyMatches.onNavigationEvent(48, displayMetrics))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        float fIntValue2 = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        Intrinsics.checkNotNullExpressionValue(mobileIdentificationHologramView.getResources().getDisplayMetrics(), "");
        float fOnNavigationEvent = ((((fOnWarmupCompleted - fIntValue) - fIntValue2) - varyMatches.onNavigationEvent(36, r14)) + anrPluginExternalSyntheticLambda0.IAuthTabCallback()) / 2.0f;
        int i4 = onTransact + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return fOnNavigationEvent;
    }

    private final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.asInterface.getValue()).floatValue();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return fFloatValue;
    }

    private static final float onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = AnrPluginExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(context);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MobileIdentificationHologramView mobileIdentificationHologramView = (MobileIdentificationHologramView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        mobileIdentificationHologramView.setEGLContextClientVersion(3);
        mobileIdentificationHologramView.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        mobileIdentificationHologramView.setZOrderOnTop(true);
        mobileIdentificationHologramView.getHolder().setFormat(-3);
        mobileIdentificationHologramView.setRenderer();
        mobileIdentificationHologramView.setPreserveEGLContextOnPause(true);
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void setRenderer() {
        int i = 2 % 2;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = new captureProcessErrorStatebugsnag_plugin_android_anr_release(this, readIntokhttp.onExtraCallback(configuration));
        this.onExtraCallback = captureprocesserrorstatebugsnag_plugin_android_anr_release;
        setRenderer(captureprocesserrorstatebugsnag_plugin_android_anr_release);
        setRenderMode(0);
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AnrPluginExternalSyntheticLambda1 $identificationType;
        final /* synthetic */ Function0<Unit> $onComplete;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function0<Unit> function0, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$onComplete = function0;
            this.$identificationType = anrPluginExternalSyntheticLambda1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = MobileIdentificationHologramView.this.new onExtraCallbackWithResult(this.$onComplete, this.$identificationType, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
            int i3 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresult.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresult.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$onExtraCallbackWithResult$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            int label;
            final /* synthetic */ MobileIdentificationHologramView this$0;
            private static char[] onWarmupCompleted = {32626, 32622, 32618, 32623, 32544, 32555, 32633, 32625, 32639, 32564, 32619, 32629, 32610, 32632, 32630, 32637, 32598, 32628, 32638, 32627, 32565, 32616, 32631};
            private static int onNavigationEvent = -1184334054;
            private static boolean onExtraCallback = true;
            private static boolean onExtraCallbackWithResult = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MobileIdentificationHologramView mobileIdentificationHologramView, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationHologramView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 99;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i4 = IAuthTabCallback + 89;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 11;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    MobileIdentificationHologramView mobileIdentificationHologramView = this.this$0;
                    this.label = 1;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-108, -110, -125, -118, -105, -124, -121, -116, -107, -116, -121, -106, -108, -117, -113, -117, -127, -107, -108, -110, -120, -109, -121, -117, -113, -122, -112, -124, -110, -112, -119, -120, -111, -112, -113, -120, -114, -117, -116, -122, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, ((byte) KeyEvent.getModifierMetaStateMask()) + ByteCompanionObject.MIN_VALUE, objArr);
                    Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdentificationHologramView, ((String) objArr[0]).intern(), null, null, this, 6, null);
                    if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                        return objOnExtraCallbackWithResult;
                    }
                    int i5 = IAuthTabCallback + 75;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
                int i7 = IAuthTabCallbackDefault + 13;
                int i8 = i7 % 128;
                IAuthTabCallback = i8;
                int i9 = i7 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i8 + 43;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i11 != 0) {
                    return obj;
                }
                throw null;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = onWarmupCompleted;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = $10 + Imgproc.COLOR_YUV2RGBA_YVYU;
                        $11 = i5 % 128;
                        int i6 = i5 % i2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 77, 20952 - KeyEvent.normalizeMetaState(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 75, 16037 - ((Process.getThreadPriority(0) + 20) >> 6), -807942443, false, "y", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i7 = 1052772399;
                    try {
                        if (onExtraCallbackWithResult) {
                            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 63 - Color.blue(0), 12213 - ImageFormat.getBitsPerPixel(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            }
                            objArr[0] = new String(cArr4);
                            return;
                        }
                        if (!onExtraCallback) {
                            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                                int i8 = $10 + 107;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            int i10 = $10 + 13;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ImageFormat.getBitsPerPixel(0) + 64, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                            i7 = 1052772399;
                        }
                        objArr[0] = new String(cArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$onExtraCallbackWithResult$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ AnrPluginExternalSyntheticLambda1 $identificationType;
            int label;
            final /* synthetic */ MobileIdentificationHologramView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(MobileIdentificationHologramView mobileIdentificationHologramView, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationHologramView;
                this.$identificationType = anrPluginExternalSyntheticLambda1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$identificationType, access13800Var);
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i4 = onNavigationEvent + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 85 / 0;
                }
                int i5 = onNavigationEvent + 17;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onNavigationEvent + 9;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i4 != 0) {
                        return obj;
                    }
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationHologramView mobileIdentificationHologramView = this.this$0;
                String strOnUnminimized = this.$identificationType.onUnminimized();
                this.label = 1;
                Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdentificationHologramView, strOnUnminimized, null, null, this, 6, null);
                if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 15;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
                int i7 = onWarmupCompleted + 77;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$onExtraCallbackWithResult$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ AnrPluginExternalSyntheticLambda1 $identificationType;
            int label;
            final /* synthetic */ MobileIdentificationHologramView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(MobileIdentificationHologramView mobileIdentificationHologramView, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationHologramView;
                this.$identificationType = anrPluginExternalSyntheticLambda1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$identificationType, access13800Var);
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i4 = onWarmupCompleted + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 81;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onExtraCallback + 75;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationHologramView mobileIdentificationHologramView = this.this$0;
                String strOnRelationshipValidationResult = this.$identificationType.onRelationshipValidationResult();
                this.label = 1;
                Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdentificationHologramView, strOnRelationshipValidationResult, null, null, this, 6, null);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    return objOnExtraCallbackWithResult;
                }
                int i5 = onWarmupCompleted + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallback;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MobileIdentificationHologramView mobileIdentificationHologramView;
            MobileIdentificationHologramView mobileIdentificationHologramView2;
            Bitmap bitmap;
            Bitmap bitmap2;
            MobileIdentificationHologramView mobileIdentificationHologramView3;
            Bitmap bitmap3;
            Object objIAuthTabCallback;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationHologramView mobileIdentificationHologramView4 = MobileIdentificationHologramView.this;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass2(mobileIdentificationHologramView4, null), 3, null);
                this.L$0 = findresandmsg;
                this.L$1 = mobileIdentificationHologramView4;
                this.label = 1;
                Object objIAuthTabCallback2 = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback2 != objOnExtraCallback) {
                    mobileIdentificationHologramView = mobileIdentificationHologramView4;
                    obj = objIAuthTabCallback2;
                }
                int i3 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }
            int i5 = onExtraCallbackWithResult + 103;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            if (i5 % 2 != 0 ? i2 != 1 : i2 != 1) {
                if (i2 != 2) {
                    int i7 = i6 + 33;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = i6 + 83;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    bitmap2 = (Bitmap) this.L$3;
                    bitmap = (Bitmap) this.L$2;
                    mobileIdentificationHologramView2 = (MobileIdentificationHologramView) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {mobileIdentificationHologramView2, bitmap, bitmap2, (Bitmap) obj, this.$onComplete};
                    int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                    MobileIdentificationHologramView.onWarmupCompleted(objArr, -1518998930, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1518998932);
                    return Unit.INSTANCE;
                }
                Bitmap bitmap4 = (Bitmap) this.L$2;
                MobileIdentificationHologramView mobileIdentificationHologramView5 = (MobileIdentificationHologramView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                bitmap3 = bitmap4;
                mobileIdentificationHologramView3 = mobileIdentificationHologramView5;
                Bitmap bitmap5 = (Bitmap) obj;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass3(MobileIdentificationHologramView.this, this.$identificationType, null), 3, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = mobileIdentificationHologramView3;
                this.L$2 = bitmap3;
                this.L$3 = bitmap5;
                this.label = 3;
                objIAuthTabCallback = geckoHubImp1OnWarmupCompleted2.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    int i11 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    bitmap2 = bitmap5;
                    obj = objIAuthTabCallback;
                    bitmap = bitmap3;
                    mobileIdentificationHologramView2 = mobileIdentificationHologramView3;
                    Object[] objArr2 = {mobileIdentificationHologramView2, bitmap, bitmap2, (Bitmap) obj, this.$onComplete};
                    int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                    MobileIdentificationHologramView.onWarmupCompleted(objArr2, -1518998930, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, 1518998932);
                    return Unit.INSTANCE;
                }
                int i32 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i32 % 128;
                int i42 = i32 % 2;
                return objOnExtraCallback;
            }
            MobileIdentificationHologramView mobileIdentificationHologramView6 = (MobileIdentificationHologramView) this.L$1;
            ResultKt.onNavigationEvent(obj);
            mobileIdentificationHologramView = mobileIdentificationHologramView6;
            Bitmap bitmap6 = (Bitmap) obj;
            GeckoHubImp1 geckoHubImp1OnWarmupCompleted3 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass4(MobileIdentificationHologramView.this, this.$identificationType, null), 3, null);
            this.L$0 = findresandmsg;
            this.L$1 = mobileIdentificationHologramView;
            this.L$2 = bitmap6;
            this.label = 2;
            Object objIAuthTabCallback3 = geckoHubImp1OnWarmupCompleted3.IAuthTabCallback(this);
            if (objIAuthTabCallback3 != objOnExtraCallback) {
                mobileIdentificationHologramView3 = mobileIdentificationHologramView;
                bitmap3 = bitmap6;
                obj = objIAuthTabCallback3;
                Bitmap bitmap52 = (Bitmap) obj;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted22 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass3(MobileIdentificationHologramView.this, this.$identificationType, null), 3, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = mobileIdentificationHologramView3;
                this.L$2 = bitmap3;
                this.L$3 = bitmap52;
                this.label = 3;
                objIAuthTabCallback = geckoHubImp1OnWarmupCompleted22.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                }
            }
            int i322 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i322 % 128;
            int i422 = i322 % 2;
            return objOnExtraCallback;
        }
    }

    public static final class IAuthTabCallback implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallbackDefault = 1;
        private static int onTransact;
        final /* synthetic */ AnrPluginExternalSyntheticLambda1 IAuthTabCallback;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ findResAndMsg onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;
        final /* synthetic */ MobileIdentificationHologramView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 41;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
        }

        public IAuthTabCallback(View view, findResAndMsg findresandmsg, MobileIdentificationHologramView mobileIdentificationHologramView, Function0 function0, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult = findresandmsg;
            this.onWarmupCompleted = mobileIdentificationHologramView;
            this.onExtraCallback = function0;
            this.IAuthTabCallback = anrPluginExternalSyntheticLambda1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, null, null, this.onWarmupCompleted.new onExtraCallbackWithResult(this.onExtraCallback, this.IAuthTabCallback, null), 3, null);
            int i2 = onTransact + 29;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    private final void onExtraCallbackWithResult(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, final Function0<Unit> function0) {
        int i = 2 % 2;
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewGroup.LayoutParams layoutParamsOnNavigationEvent = anrPluginExternalSyntheticLambda0.onNavigationEvent(context);
        float fOnExtraCallbackWithResult = this.onExtraCallbackWithResult * 3.0f * onExtraCallbackWithResult();
        float f = fOnExtraCallbackWithResult * 0.476f;
        float fOnExtraCallbackWithResult2 = layoutParamsOnNavigationEvent.width * onExtraCallbackWithResult();
        float fOnExtraCallbackWithResult3 = layoutParamsOnNavigationEvent.height * onExtraCallbackWithResult();
        float fOnExtraCallbackWithResult4 = setTagsokhttp.onExtraCallbackWithResult(this, 16) / layoutParamsOnNavigationEvent.width;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = this.onExtraCallback;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            int i2 = IAuthTabCallbackStub + 9;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult(fOnExtraCallbackWithResult4);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult(fOnExtraCallbackWithResult4);
        }
        this.onWarmupCompleted.clear();
        this.onWarmupCompleted.add(new captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(bitmap3, fOnExtraCallbackWithResult2, fOnExtraCallbackWithResult3, 0.0f, this.onExtraCallbackWithResult / 2.0f, IAuthTabCallback(), 0.0f, 0.0f, 0.0f, 0.0f, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.HOLOGRAM_STROKE, 968, null));
        this.onWarmupCompleted.add(new captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(bitmap2, fOnExtraCallbackWithResult2, fOnExtraCallbackWithResult3, 0.0f, this.onExtraCallbackWithResult / 2.0f, IAuthTabCallback(), 0.0f, 0.0f, fOnExtraCallbackWithResult4, 0.0f, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.HOLOGRAM_FILL, 712, null));
        this.onWarmupCompleted.add(new captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(bitmap, fOnExtraCallbackWithResult, f, 0.0f, this.onExtraCallbackWithResult / 2.0f, onWarmupCompleted() + (f / 2.0f), 0.0f, 0.0f, fOnExtraCallbackWithResult4, 0.0f, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.MASK_RADAR, 712, null));
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release2 = this.onExtraCallback;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release2 != null) {
            captureprocesserrorstatebugsnag_plugin_android_anr_release2.onExtraCallbackWithResult(this.onWarmupCompleted, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 71;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitIAuthTabCallback = MobileIdentificationHologramView.IAuthTabCallback(function0);
                    int i6 = onNavigationEvent + 125;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 85 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            });
            int i3 = onTransact + 93;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final MobileIdentificationHologramView mobileIdentificationHologramView = (MobileIdentificationHologramView) objArr[0];
        final captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult = (captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        mobileIdentificationHologramView.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    MobileIdentificationHologramView.onExtraCallback(this.f$0, onextracallbackwithresult, fFloatValue);
                    int i4 = 59 / 0;
                } else {
                    MobileIdentificationHologramView.onExtraCallback(this.f$0, onextracallbackwithresult, fFloatValue);
                }
                int i5 = onWarmupCompleted + 5;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 47 / 0;
                }
            }
        });
        int i2 = onTransact + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return null;
    }

    private static final void onWarmupCompleted(MobileIdentificationHologramView mobileIdentificationHologramView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationHologramView.onExtraCallback;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult(onextracallbackwithresult, f);
            int i4 = IAuthTabCallbackStub + 115;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onExtraCallbackWithResult(MobileIdentificationHologramView mobileIdentificationHologramView, captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationHologramView.onExtraCallback;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            captureprocesserrorstatebugsnag_plugin_android_anr_release.onNavigationEvent(onextracallbackwithresult, f);
        }
        int i4 = IAuthTabCallbackStub + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull final captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, final float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        queueEvent(new Runnable() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationHologramView$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                MobileIdentificationHologramView mobileIdentificationHologramView = this.f$0;
                if (i4 == 0) {
                    MobileIdentificationHologramView.IAuthTabCallback(mobileIdentificationHologramView, onextracallbackwithresult, f);
                } else {
                    MobileIdentificationHologramView.IAuthTabCallback(mobileIdentificationHologramView, onextracallbackwithresult, f);
                    int i5 = 14 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 47;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(MobileIdentificationHologramView mobileIdentificationHologramView) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = mobileIdentificationHologramView.onExtraCallback;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release != null) {
            int i5 = i3 + 111;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback();
            int i7 = onTransact + 25;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = IAuthTabCallbackStub + 89;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void IAuthTabCallback(@NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(function0, "");
            isAttachedToWindow();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new IAuthTabCallback(this, findresandmsg, this, function0, anrPluginExternalSyntheticLambda1));
            return;
        }
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new onExtraCallbackWithResult(function0, anrPluginExternalSyntheticLambda1, null), 3, null);
        int i3 = onTransact + 29;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ float IAuthTabCallback(MobileIdentificationHologramView mobileIdentificationHologramView, Context context) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Float) onWarmupCompleted(new Object[]{mobileIdentificationHologramView, context}, 743913100, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -743913100)).floatValue();
    }

    public static final /* synthetic */ void onExtraCallback(MobileIdentificationHologramView mobileIdentificationHologramView, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Function0 function0) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(new Object[]{mobileIdentificationHologramView, bitmap, bitmap2, bitmap3, function0}, -1518998930, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1518998932);
    }

    public final void onNavigationEvent() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(new Object[]{this}, 827115306, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -827115303);
    }

    public final void onExtraCallbackWithResult(@NotNull captureProcessErrorStatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult onextracallbackwithresult, float f) {
        Object[] objArr = {this, onextracallbackwithresult, Float.valueOf(f)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(objArr, 1486171745, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1486171744);
    }
}
