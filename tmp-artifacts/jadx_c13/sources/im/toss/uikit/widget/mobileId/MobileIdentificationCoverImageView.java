package im.toss.uikit.widget.mobileId;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrPluginExternalSyntheticLambda0;
import o.AnrPluginExternalSyntheticLambda1;
import o.GeckoHubImp1;
import o.M_;
import o.access13800;
import o.access14100;
import o.access15300;
import o.access15400;
import o.collectAnrDetailsbugsnag_plugin_android_anr_release;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.generateLink;
import o.hasVaryAll;
import o.onLoadStarted;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdentificationCoverImageView extends GLSurfaceView {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy asInterface;
    private final Lazy onExtraCallback;
    private final List<collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult> onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private collectAnrDetailsbugsnag_plugin_android_anr_release onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileIdentificationCoverImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return ((Float) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3, 635909200, iOnWarmupCompleted2, -635909199, iOnWarmupCompleted)).floatValue();
        }
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
        ((Float) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[0], iOnWarmupCompleted6, 635909200, iOnWarmupCompleted5, -635909199, iOnWarmupCompleted4)).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(Context context) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i3 | i7;
        int i9 = (~(i5 | i6)) | i3;
        int i10 = ~i5;
        int i11 = (~(i6 | i5 | i3)) | (~(i7 | i10)) | (~((~i3) | i10));
        int i12 = i5 + i3 + i4 + (1609234610 * i2) + (1307081305 * i);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i5) - 1772093440) + (1576585830 * i3) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i4) + ((-2101346304) * i2) + (23068672 * i) + ((-2103967744) * i13);
        int i15 = (i5 * 273352028) + 245730370 + (i3 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i4 * 273352337) + (i2 * (-770635566)) + (i * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        if (i16 == 3) {
            Function0 function0 = (Function0) objArr[0];
            int i17 = 2 % 2;
            int i18 = IAuthTabCallbackStub + 25;
            onTransact = i18 % 128;
            int i19 = i18 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
            int i20 = onTransact + 15;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            return unitOnExtraCallbackWithResult;
        }
        MobileIdentificationCoverImageView mobileIdentificationCoverImageView = (MobileIdentificationCoverImageView) objArr[0];
        Context context = (Context) objArr[1];
        int i22 = 2 % 2;
        int i23 = IAuthTabCallbackStub + 75;
        onTransact = i23 % 128;
        int i24 = i23 % 2;
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(mobileIdentificationCoverImageView, context);
        int i25 = onTransact + 87;
        IAuthTabCallbackStub = i25 % 128;
        int i26 = i25 % 2;
        return Float.valueOf(fOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(MobileIdentificationCoverImageView mobileIdentificationCoverImageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(mobileIdentificationCoverImageView);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnExtraCallback = onExtraCallback(context);
        int i3 = onTransact + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return fOnExtraCallback;
    }

    public static /* synthetic */ boolean onNavigationEvent(MobileIdentificationCoverImageView mobileIdentificationCoverImageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(mobileIdentificationCoverImageView);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = IAuthTabCallbackStub + 95;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdentificationCoverImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCoverImageView$.ExternalSyntheticLambda2(this));
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCoverImageView$.ExternalSyntheticLambda3(this, context));
        this.asInterface = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCoverImageView$.ExternalSyntheticLambda4());
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCoverImageView$.ExternalSyntheticLambda5(context));
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCoverImageView$.ExternalSyntheticLambda6(context));
        this.onExtraCallbackWithResult = new ArrayList();
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setZOrderOnTop(true);
        getHolder().setFormat(-3);
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = new collectAnrDetailsbugsnag_plugin_android_anr_release(this, IAuthTabCallbackStub(), null, 4, null);
        this.onWarmupCompleted = collectanrdetailsbugsnag_plugin_android_anr_release;
        setRenderer(collectanrdetailsbugsnag_plugin_android_anr_release);
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdentificationCoverImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 9;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ void onNavigationEvent(MobileIdentificationCoverImageView mobileIdentificationCoverImageView, Bitmap bitmap, Bitmap bitmap2, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        mobileIdentificationCoverImageView.IAuthTabCallback(bitmap, bitmap2, function0);
        int i4 = IAuthTabCallbackStub + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    private final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(MobileIdentificationCoverImageView mobileIdentificationCoverImageView) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = mobileIdentificationCoverImageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 != 0) {
            return generateLink.IAuthTabCallback(resources);
        }
        int i4 = 32 / 0;
        return generateLink.IAuthTabCallback(resources);
    }

    private final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onExtraCallback.getValue()).floatValue();
        int i4 = IAuthTabCallbackStub + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float onExtraCallbackWithResult(MobileIdentificationCoverImageView mobileIdentificationCoverImageView, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = mobileIdentificationCoverImageView.onExtraCallbackWithResult();
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        String string = context.getString(R.string.uikit_mobile_id_loading);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iAsInterface = M_.onExtraCallback.asInterface();
        DisplayMetrics displayMetrics = mobileIdentificationCoverImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fIntValue = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1367378881, -1367378879, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0, context, string, Float.valueOf(28.0f), Integer.valueOf(iAsInterface - varyMatches.onNavigationEvent(48, displayMetrics))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        float fIntValue2 = ((Integer) AnrPluginExternalSyntheticLambda0.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1431678441, -1431678440, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{anrPluginExternalSyntheticLambda0}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
        Intrinsics.checkNotNullExpressionValue(mobileIdentificationCoverImageView.getResources().getDisplayMetrics(), "");
        float fOnNavigationEvent = ((((fOnExtraCallbackWithResult - fIntValue) - fIntValue2) - varyMatches.onNavigationEvent(36, r14)) + anrPluginExternalSyntheticLambda0.IAuthTabCallback()) / 2.0f;
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.asInterface.getValue()).floatValue();
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            M_.onExtraCallback.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fAsInterface = M_.onExtraCallback.asInterface();
        int i3 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return Float.valueOf(fAsInterface);
    }

    private final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(Context context) {
        float fOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            fOnExtraCallbackWithResult = AnrPluginExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(context);
            int i3 = 79 / 0;
        } else {
            fOnExtraCallbackWithResult = AnrPluginExternalSyntheticLambda0.onNavigationEvent.onExtraCallbackWithResult(context);
        }
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    private final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onNavigationEvent.getValue()).floatValue();
        int i4 = IAuthTabCallbackStub + 115;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return fFloatValue;
    }

    private static final float onWarmupCompleted(Context context) throws Resources.NotFoundException {
        int iAccess000;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        WindowManager windowManager = null;
        if (i2 % 2 != 0) {
            hasVaryAll.onExtraCallback(context);
            throw null;
        }
        Activity activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
        if (activityOnExtraCallback != null) {
            int i3 = onTransact + 21;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            windowManager = activityOnExtraCallback.getWindowManager();
        }
        if (windowManager == null) {
            M_ m_ = M_.onExtraCallback;
            iAccess000 = m_.access000() + m_.IAuthTabCallbackDefault() + m_.onExtraCallbackWithResult();
        } else if (Build.VERSION.SDK_INT >= 30) {
            iAccess000 = windowManager.getCurrentWindowMetrics().getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            iAccess000 = displayMetrics.heightPixels;
            int i5 = onTransact + 123;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        return iAccess000;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ AnrPluginExternalSyntheticLambda1 $type;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function0<Unit> function0, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$onComplete = function0;
            this.$type = anrPluginExternalSyntheticLambda1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = MobileIdentificationCoverImageView.this.new onExtraCallback(this.$onComplete, this.$type, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView$onExtraCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ AnrPluginExternalSyntheticLambda1 $type;
            int label;
            final /* synthetic */ MobileIdentificationCoverImageView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MobileIdentificationCoverImageView mobileIdentificationCoverImageView, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationCoverImageView;
                this.$type = anrPluginExternalSyntheticLambda1;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass1.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$type, access13800Var);
                int i2 = onExtraCallback + 45;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 0;
                }
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                if (i3 == 0) {
                    int i4 = 33 / 0;
                }
                int i5 = IAuthTabCallback + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return objIAuthTabCallback;
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
                    int i3 = onExtraCallback + 15;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i4 == 0) {
                        return obj;
                    }
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationCoverImageView mobileIdentificationCoverImageView = this.this$0;
                String strICustomTabsCallbackDefault = this.$type.ICustomTabsCallbackDefault();
                this.label = 1;
                Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdentificationCoverImageView, strICustomTabsCallbackDefault, null, null, this, 6, null);
                if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                int i5 = onExtraCallback + 11;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallbackWithResult;
            }
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView$onExtraCallback$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ AnrPluginExternalSyntheticLambda1 $type;
            int label;
            final /* synthetic */ MobileIdentificationCoverImageView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(MobileIdentificationCoverImageView mobileIdentificationCoverImageView, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdentificationCoverImageView;
                this.$type = anrPluginExternalSyntheticLambda1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$type, access13800Var);
                int i2 = IAuthTabCallback + 9;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                Object objOnNavigationEvent;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Bitmap> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
                    int i3 = 57 / 0;
                } else {
                    objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
                }
                int i4 = IAuthTabCallback + 113;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass3.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(unit);
                int i4 = IAuthTabCallback + 7;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    access14100.onExtraCallback();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationCoverImageView mobileIdentificationCoverImageView = this.this$0;
                String strICustomTabsCallbackStub = this.$type.ICustomTabsCallbackStub();
                this.label = 1;
                Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdentificationCoverImageView, strICustomTabsCallbackStub, null, null, this, 6, null);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    return objOnExtraCallbackWithResult;
                }
                int i4 = IAuthTabCallback + 15;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 73;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 0;
                }
                return objOnExtraCallback;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MobileIdentificationCoverImageView mobileIdentificationCoverImageView;
            MobileIdentificationCoverImageView mobileIdentificationCoverImageView2;
            Bitmap bitmap;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationCoverImageView mobileIdentificationCoverImageView3 = MobileIdentificationCoverImageView.this;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass1(mobileIdentificationCoverImageView3, this.$type, null), 3, null);
                this.L$0 = findresandmsg;
                this.L$1 = mobileIdentificationCoverImageView3;
                this.label = 1;
                Object objIAuthTabCallback = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnExtraCallback) {
                    mobileIdentificationCoverImageView = mobileIdentificationCoverImageView3;
                    obj = objIAuthTabCallback;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 81;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                bitmap = (Bitmap) this.L$2;
                mobileIdentificationCoverImageView2 = (MobileIdentificationCoverImageView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                MobileIdentificationCoverImageView.onNavigationEvent(mobileIdentificationCoverImageView2, bitmap, (Bitmap) obj, this.$onComplete);
                return Unit.INSTANCE;
            }
            MobileIdentificationCoverImageView mobileIdentificationCoverImageView4 = (MobileIdentificationCoverImageView) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int i5 = onExtraCallback + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            mobileIdentificationCoverImageView = mobileIdentificationCoverImageView4;
            Bitmap bitmap2 = (Bitmap) obj;
            GeckoHubImp1 geckoHubImp1OnWarmupCompleted2 = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass3(MobileIdentificationCoverImageView.this, this.$type, null), 3, null);
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = mobileIdentificationCoverImageView;
            this.L$2 = bitmap2;
            this.label = 2;
            Object objIAuthTabCallback2 = geckoHubImp1OnWarmupCompleted2.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnExtraCallback) {
                mobileIdentificationCoverImageView2 = mobileIdentificationCoverImageView;
                bitmap = bitmap2;
                obj = objIAuthTabCallback2;
                MobileIdentificationCoverImageView.onNavigationEvent(mobileIdentificationCoverImageView2, bitmap, (Bitmap) obj, this.$onComplete);
                return Unit.INSTANCE;
            }
            return objOnExtraCallback;
        }
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int asBinder = 1;
        private static int onTransact;
        final /* synthetic */ AnrPluginExternalSyntheticLambda1 IAuthTabCallback;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ findResAndMsg onNavigationEvent;
        final /* synthetic */ MobileIdentificationCoverImageView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 109;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
        }

        public onWarmupCompleted(View view, findResAndMsg findresandmsg, MobileIdentificationCoverImageView mobileIdentificationCoverImageView, Function0 function0, AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
            this.onExtraCallbackWithResult = view;
            this.onNavigationEvent = findresandmsg;
            this.onWarmupCompleted = mobileIdentificationCoverImageView;
            this.onExtraCallback = function0;
            this.IAuthTabCallback = anrPluginExternalSyntheticLambda1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
            onLoadStarted.onExtraCallback(this.onNavigationEvent, null, null, this.onWarmupCompleted.new onExtraCallback(this.onExtraCallback, this.IAuthTabCallback, null), 3, null);
            int i2 = asBinder + 27;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private final void IAuthTabCallback(Bitmap bitmap, Bitmap bitmap2, final Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        AnrPluginExternalSyntheticLambda0 anrPluginExternalSyntheticLambda0 = AnrPluginExternalSyntheticLambda0.onNavigationEvent;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewGroup.LayoutParams layoutParamsOnNavigationEvent = anrPluginExternalSyntheticLambda0.onNavigationEvent(context);
        float fIAuthTabCallback = IAuthTabCallback() * 2.64f * onWarmupCompleted();
        float f = fIAuthTabCallback * 0.35f;
        float f2 = layoutParamsOnNavigationEvent.width;
        float fOnWarmupCompleted = onWarmupCompleted();
        float f3 = layoutParamsOnNavigationEvent.height;
        float fOnWarmupCompleted2 = onWarmupCompleted();
        this.onExtraCallbackWithResult.clear();
        if (bitmap != null) {
            this.onExtraCallbackWithResult.add(new collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(bitmap, f2 * fOnWarmupCompleted, f3 * fOnWarmupCompleted2, 0.0f, IAuthTabCallback() / 2.0f, onNavigationEvent(), 0.0f, 0.0f, 0.0f, "MOTION_BORDER", 328, null));
        }
        if (bitmap2 != null) {
            this.onExtraCallbackWithResult.add(new collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(bitmap2, fIAuthTabCallback, f, 0.0f, IAuthTabCallback() / 2.0f, onExtraCallbackWithResult() + (f / 2.0f), 0.0f, 0.0f, 0.0f, "RADAR", 456, null));
        }
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = this.onWarmupCompleted;
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback(this.onExtraCallbackWithResult, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 15;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {function0};
                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                    int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                    Unit unit = (Unit) MobileIdentificationCoverImageView.onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), 465681282, iOnWarmupCompleted2, -465681279, iOnWarmupCompleted);
                    int i7 = onWarmupCompleted + 57;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            int i4 = IAuthTabCallbackStub + 101;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            int i3 = 64 / 0;
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull onNavigationEvent onnavigationevent, float f) {
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            collectanrdetailsbugsnag_plugin_android_anr_release = this.onWarmupCompleted;
            int i3 = 77 / 0;
            if (collectanrdetailsbugsnag_plugin_android_anr_release == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            collectanrdetailsbugsnag_plugin_android_anr_release = this.onWarmupCompleted;
            if (collectanrdetailsbugsnag_plugin_android_anr_release == null) {
                return;
            }
        }
        collectanrdetailsbugsnag_plugin_android_anr_release.onWarmupCompleted(onnavigationevent.name(), f);
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MobileIdentificationCoverImageView mobileIdentificationCoverImageView = (MobileIdentificationCoverImageView) objArr[0];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = mobileIdentificationCoverImageView.onWarmupCompleted;
        Object obj = null;
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            int i4 = onTransact + 21;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = {collectanrdetailsbugsnag_plugin_android_anr_release, onnavigationevent.name(), Float.valueOf(fFloatValue)};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (i5 == 0) {
                collectAnrDetailsbugsnag_plugin_android_anr_release.IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, -711309503, 711309505, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                obj.hashCode();
                throw null;
            }
            collectAnrDetailsbugsnag_plugin_android_anr_release.IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, -711309503, 711309505, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        return null;
    }

    private static final void IAuthTabCallback(MobileIdentificationCoverImageView mobileIdentificationCoverImageView) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = mobileIdentificationCoverImageView.onWarmupCompleted;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback();
        }
        int i4 = onTransact + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent MOTION_BORDER = new onNavigationEvent("MOTION_BORDER", 0);
        public static final onNavigationEvent RADAR = new onNavigationEvent("RADAR", 1);
        public static final onNavigationEvent RADAR2 = new onNavigationEvent("RADAR2", 2);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {MOTION_BORDER, RADAR, RADAR2};
            int i5 = i3 + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 97;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        addOnAttachStateChangeListener(new im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView.onWarmupCompleted(r8, r10, r8, r11, r9));
        r0 = im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView.onTransact + 87;
        im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView.IAuthTabCallbackStub = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (isAttachedToWindow() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (isAttachedToWindow() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r0 = o.onLoadStarted.onExtraCallback(r10, null, null, new im.toss.uikit.widget.mobileId.MobileIdentificationCoverImageView.onExtraCallback(r8, r11, r9, null), 3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(function0, "");
            int i3 = 38 / 0;
        } else {
            Intrinsics.checkNotNullParameter(anrPluginExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(function0, "");
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{function0}, iOnWarmupCompleted3, 465681282, iOnWarmupCompleted2, -465681279, iOnWarmupCompleted);
    }

    public static /* synthetic */ float onWarmupCompleted(MobileIdentificationCoverImageView mobileIdentificationCoverImageView, Context context) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return ((Float) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[]{mobileIdentificationCoverImageView, context}, iOnWarmupCompleted3, 917924530, iOnWarmupCompleted2, -917924530, iOnWarmupCompleted)).floatValue();
    }

    private static final float onTransact() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return ((Float) onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), new Object[0], iOnWarmupCompleted3, 635909200, iOnWarmupCompleted2, -635909199, iOnWarmupCompleted)).floatValue();
    }

    public final void onExtraCallbackWithResult(@NotNull onNavigationEvent onnavigationevent, float f) {
        Object[] objArr = {this, onnavigationevent, Float.valueOf(f)};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        onExtraCallbackWithResult(zzgsa.onWarmupCompleted(), objArr, zzgsa.onWarmupCompleted(), 1421938601, iOnWarmupCompleted2, -1421938599, iOnWarmupCompleted);
    }
}
